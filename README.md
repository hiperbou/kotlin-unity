# unity-kotlin
Use the amazing Kotlin language with Unity

Uses [Puerts](https://github.com/Tencent/puerts), a Javascript runtime built for Unity

## How to run

Open the hello-kotlin-template Unity project and search for the HelloKotlin scene.

Open the unity-kotlin project with [IntelliJ IDEA Community](https://www.jetbrains.com/idea/download/) and run the build task to update the code in the Unity project.

![](https://github.com/hiperbou/unity-kotlin/blob/master/screenshots/hello-kotlin.jpg)

Pong Example

![](https://github.com/hiperbou/unity-kotlin/blob/master/screenshots/pong.jpg)


## Build and release

For you need to download [this](https://github.com/Tencent/puerts/releases/download/Unity_v1.3.4/PuerTS_V8_1.3.4.tgz), decompress it and copy the dynamic library found in Puerts/Runtime/Plugins/x86_64/puerts.dll to the root of your build folder.
