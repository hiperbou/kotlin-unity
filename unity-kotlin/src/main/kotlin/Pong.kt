import PongRules.paddleHalfHeight
import PongRules.paddleWidth
import csharp.UnityEngine.*
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

external class PongScene {
    val Paddle1:GameObject
    val Paddle2:GameObject
    val Ball:GameObject

    var updatePong:dynamic
}

object PongRules {
    val top = -5f
    val bottom = 5f
    val left = -7f
    val right = 7f

    val paddleHalfHeight = 1f
    val paddleWidth = 0.5f
}

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
            ball.speedX *= -1.1f
        }
    }
}

class Ball(private val pongGameObject: PongGameObject):Updatable, IPongGameObject by pongGameObject {
    init {
        start()
    }

    fun start() = with(pongGameObject) {
        setPosition(0f, 0f)
        speedX = -3.0f
        speedY = -3.0f
    }

    override fun update(deltaTime:Float) {
        checkWalls()
        checkGoal()
        pongGameObject.update(deltaTime)
    }

    private fun checkGoal() = with(pongGameObject) {
        if (x > PongRules.right || x < PongRules.left) {
            start()
        }
    }

    private fun checkWalls() = with(pongGameObject) {
        if (y > PongRules.bottom || y < PongRules.top) {
            speedY *= -1
            y = min(PongRules.bottom, max(PongRules.top, y))
        }
    }
}

class Pong(val scene: PongScene) {
    private val ball = Ball(PongGameObject(scene.Ball))
    private val paddle1 = Paddle(PongGameObject(scene.Paddle1), PaddleController(), ball)
    private val paddle2 = Paddle(PongGameObject(scene.Paddle2), PaddleController(KeyCode.UpArrow, KeyCode.DownArrow), ball)

    private val updatable = listOf(ball, paddle1, paddle2)

    init {
        scene.updatePong = ::update
    }

    fun update() {
        val deltaTime = Time.deltaTime
        updatable.forEach { it.update(deltaTime) }
    }
}

@JsExport
fun initPong(scene:PongScene) {
    Pong(scene)
}