import PongRules.ballSpeedMultiplier
import PongRules.initialBallSpeedX
import PongRules.initialBallSpeedY
import PongRules.maxBallSpeedX
import PongRules.maxBallSpeedY
import PongRules.paddleHalfHeight
import PongRules.paddleWidth
import csharp.UnityEngine.*
import csharp.UnityEngine.UI.Text
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min
import kotlin.random.Random.Default.nextFloat

external class PongScene {
    val Paddle1:GameObject
    val Paddle2:GameObject
    val Ball:GameObject

    var LeftScore: GameObject
    var RightScore: GameObject

    var updatePong:dynamic
}

object PongRules {
    const val top = -5f
    const val bottom = 5f
    const val left = -7f
    const val right = 7f

    const val paddleHalfHeight = 1f
    const val paddleWidth = 0.5f

    const val maxBallSpeedX = 20.0f
    const val maxBallSpeedY = 5.0f
    const val ballSpeedMultiplier = 1.1f

    const val initialBallSpeedX = 3.0f
    const val initialBallSpeedY = 3.0f
}

private inline fun randomSign() = if (nextFloat() > 0.5) 1 else - 1

interface Updatable {
    fun update(deltaTime: Float)
}

class PaddleController(private val moveUp:KeyCode = KeyCode.W,
                       private val moveDown:KeyCode = KeyCode.S
):Updatable {
    var onMove:(Int)->Unit = {}

    override fun update(deltaTime: Float) {
        onMove (if (Input.GetKey(moveUp)) -1 else if (Input.GetKey(moveDown)) 1 else 0)
    }
}

interface IPongGameObject:Updatable {
    var x:Float
    var y:Float
    var speedX:Float
    var speedY:Float
}

class PongGameObject(val gameObject: GameObject):IPongGameObject {
    override var x = gameObject.transform.position.x
    override var y = gameObject.transform.position.y
    override var speedX = 0.0f
    override var speedY = 0.0f

    private val trailRenderer = gameObject.GetComponent<TrailRenderer>("TrailRenderer")

    override fun update(deltaTime:Float) {
        x += speedX * deltaTime
        y -= speedY * deltaTime
        updateGameObject()
    }

    private fun updateGameObject() {
        gameObject.transform.SetPosition(Vector3(x, y, 0))
    }

    fun setPosition(x:Float, y:Float) {
        this.x = x
        this.y = y

        clearTrail()
    }

    private fun clearTrail() {
        trailRenderer.enabled = false
        trailRenderer.Clear()
        trailRenderer.enabled = true
    }
}

class Paddle(private val pongGameObject: PongGameObject,
             private val paddleController:PaddleController,
             private val ball:Ball
             ):Updatable, IPongGameObject by pongGameObject {
    init {
        paddleController.onMove = ::updateMovement
    }

    override fun update(deltaTime:Float) {
        paddleController.update(deltaTime)
        pongGameObject.update(deltaTime)
        checkWalls()
        checkBallCollision()
    }

    private val paddleSpeed = 10f
    private fun updateMovement(direction:Int) {
        pongGameObject.speedY = paddleSpeed * direction
    }

    private fun checkWalls() = with(pongGameObject) {

        if (y + paddleHalfHeight > PongRules.bottom || y - paddleHalfHeight < PongRules.top) {
            speedY = 0f
            y = min(PongRules.bottom - paddleHalfHeight, max(PongRules.top + paddleHalfHeight, y))
            pongGameObject.update(0f)
        }
    }

    private fun checkBallCollision() = with(pongGameObject) {
        if (ball.speedX > 0 && x < ball.x) return
        if (ball.speedX < 0 && x > ball.x) return

        if (ball.y < y - paddleHalfHeight || ball.y > y + paddleHalfHeight) return

        if (abs(x - ball.x) < paddleWidth) {
            ball.speedX = min(ball.speedX * ballSpeedMultiplier, maxBallSpeedX) * -1
            ball.speedY = (y - ball.y) * maxBallSpeedY
        }
    }
}

class Ball(private val pongGameObject: PongGameObject, val onBallReachedGoal:(Ball)->Unit):Updatable, IPongGameObject by pongGameObject {

    fun start() = with(pongGameObject) {
        setPosition(0f, 0f)

        speedX = randomSign() * initialBallSpeedX
        speedY = randomSign() * initialBallSpeedY
    }

    override fun update(deltaTime:Float) {
        checkWalls()
        checkGoal()
        pongGameObject.update(deltaTime)
    }

    private fun checkGoal() = with(pongGameObject) {
        if (x > PongRules.right || x < PongRules.left) {
            onBallReachedGoal(this@Ball)
        }
    }

    private fun checkWalls() = with(pongGameObject) {
        if (y > PongRules.bottom || y < PongRules.top) {
            speedY *= -1
            y = min(PongRules.bottom, max(PongRules.top, y))
        }
    }
}

class UI(scene: PongScene, private val matchState:MatchState) {
    private val leftScore = scene.LeftScore.GetComponent<Text>("Text")
    private val rightScore = scene.RightScore.GetComponent<Text>("Text")

    init {
        updateScores()
    }
    fun updateScores() {
        leftScore.text = matchState.leftScore.formatScore()
        rightScore.text = matchState.rightScore.formatScore()
    }

    private fun Int.formatScore() = toString().padStart(2, '0')
}

class MatchState {
    var leftScore = 0
    var rightScore = 0

    fun reset() {
        leftScore = 0
        rightScore = 0
    }
}

class Match(private val matchState:MatchState, private val ui:UI) {
    fun start(ball:Ball) {
        matchState.reset()
        ball.start()
    }
    fun onBallReachedGoal(ball:Ball) {
        if (ball.x > 0) {
            matchState.leftScore++
        } else {
            matchState.rightScore++
        }
        ui.updateScores()
        ball.start()
    }
}

class Pong(val scene: PongScene) {
    private val matchState = MatchState()
    private val ui = UI(scene, matchState)
    private val match = Match(matchState, ui)

    private val ball = Ball(PongGameObject(scene.Ball), match::onBallReachedGoal)
    private val paddle1 = Paddle(PongGameObject(scene.Paddle1), PaddleController(), ball)
    private val paddle2 = Paddle(PongGameObject(scene.Paddle2), PaddleController(KeyCode.UpArrow, KeyCode.DownArrow), ball)

    private val updatables = listOf(ball, paddle1, paddle2)

    init {
        scene.updatePong = ::update
        match.start(ball)
    }

    fun update() {
        val deltaTime = Time.deltaTime
        updatables.forEach { it.update(deltaTime) }
    }
}

@JsExport
fun initPong(scene:PongScene) {
    Pong(scene)
}