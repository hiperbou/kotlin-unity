@file:JsModule("csharp")
@file:JsNonModule
@file:JsQualifier("UnityEngine.Rendering")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package csharp.UnityEngine.Rendering

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*
import csharp.System.Object
import csharp.System.IDisposable
import csharp.System.ValueType
import csharp.System.`IEquatable$1`
import csharp.UnityEngine.ScriptableObject

external enum class OpaqueSortMode {
    Default /* = 0 */,
    FrontToBack /* = 1 */,
    NoDistanceSort /* = 2 */
}

external enum class CameraEvent {
    BeforeDepthTexture /* = 0 */,
    AfterDepthTexture /* = 1 */,
    BeforeDepthNormalsTexture /* = 2 */,
    AfterDepthNormalsTexture /* = 3 */,
    BeforeGBuffer /* = 4 */,
    AfterGBuffer /* = 5 */,
    BeforeLighting /* = 6 */,
    AfterLighting /* = 7 */,
    BeforeFinalPass /* = 8 */,
    AfterFinalPass /* = 9 */,
    BeforeForwardOpaque /* = 10 */,
    AfterForwardOpaque /* = 11 */,
    BeforeImageEffectsOpaque /* = 12 */,
    AfterImageEffectsOpaque /* = 13 */,
    BeforeSkybox /* = 14 */,
    AfterSkybox /* = 15 */,
    BeforeForwardAlpha /* = 16 */,
    AfterForwardAlpha /* = 17 */,
    BeforeImageEffects /* = 18 */,
    AfterImageEffects /* = 19 */,
    AfterEverything /* = 20 */,
    BeforeReflections /* = 21 */,
    AfterReflections /* = 22 */,
    BeforeHaloAndLensFlares /* = 23 */,
    AfterHaloAndLensFlares /* = 24 */
}

external open class CommandBuffer : Object, IDisposable

external enum class ComputeQueueType {
    Default /* = 0 */,
    Background /* = 1 */,
    Urgent /* = 2 */
}

external open class ScriptableCullingParameters : ValueType, `IEquatable$1`<ScriptableCullingParameters>

external enum class ReflectionProbeType {
    Cube /* = 0 */,
    Card /* = 1 */
}

external enum class ReflectionProbeClearFlags {
    Skybox /* = 1 */,
    SolidColor /* = 2 */
}

external enum class ReflectionProbeMode {
    Baked /* = 0 */,
    Realtime /* = 1 */,
    Custom /* = 2 */
}

external enum class ReflectionProbeRefreshMode {
    OnAwake /* = 0 */,
    EveryFrame /* = 1 */,
    ViaScripting /* = 2 */
}

external enum class ReflectionProbeTimeSlicingMode {
    AllFacesAtOnce /* = 0 */,
    IndividualFaces /* = 1 */,
    NoTimeSlicing /* = 2 */
}

external enum class GraphicsTier {
    Tier1 /* = 0 */,
    Tier2 /* = 1 */,
    Tier3 /* = 2 */
}

external enum class OpenGLESVersion {
    None /* = 0 */,
    OpenGLES20 /* = 1 */,
    OpenGLES30 /* = 2 */,
    OpenGLES31 /* = 3 */,
    OpenGLES31AEP /* = 4 */,
    OpenGLES32 /* = 5 */
}

external open class GraphicsFence : ValueType

external enum class SynchronisationStage {
    VertexProcessing /* = 0 */,
    PixelProcessing /* = 1 */
}

external enum class GraphicsFenceType {
    AsyncQueueSynchronisation /* = 0 */,
    CPUSynchronisation /* = 1 */
}

external enum class SynchronisationStageFlags {
    VertexProcessing /* = 1 */,
    PixelProcessing /* = 2 */,
    ComputeProcessing /* = 4 */,
    AllGPUOperations /* = 7 */
}

external enum class ShadowCastingMode {
    Off /* = 0 */,
    On /* = 1 */,
    TwoSided /* = 2 */,
    ShadowsOnly /* = 3 */
}

external enum class LightProbeUsage {
    Off /* = 0 */,
    BlendProbes /* = 1 */,
    UseProxyVolume /* = 2 */,
    CustomProvided /* = 4 */
}

external open class GPUFence : ValueType

external open class SphericalHarmonicsL2 : ValueType, `IEquatable$1`<SphericalHarmonicsL2>

external enum class RenderBufferLoadAction {
    Load /* = 0 */,
    Clear /* = 1 */,
    DontCare /* = 2 */
}

external enum class RenderBufferStoreAction {
    Store /* = 0 */,
    Resolve /* = 1 */,
    StoreAndResolve /* = 2 */,
    DontCare /* = 3 */
}

external enum class ReflectionProbeUsage {
    Off /* = 0 */,
    BlendProbes /* = 1 */,
    BlendProbesAndSkybox /* = 2 */,
    Simple /* = 3 */
}

external open class RenderPipelineAsset : ScriptableObject

external enum class IndexFormat {
    UInt16 /* = 0 */,
    UInt32 /* = 1 */
}

external open class VertexAttributeDescriptor : ValueType, `IEquatable$1`<VertexAttributeDescriptor>

external enum class VertexAttribute {
    Position /* = 0 */,
    Normal /* = 1 */,
    Tangent /* = 2 */,
    Color /* = 3 */,
    TexCoord0 /* = 4 */,
    TexCoord1 /* = 5 */,
    TexCoord2 /* = 6 */,
    TexCoord3 /* = 7 */,
    TexCoord4 /* = 8 */,
    TexCoord5 /* = 9 */,
    TexCoord6 /* = 10 */,
    TexCoord7 /* = 11 */,
    BlendWeight /* = 12 */,
    BlendIndices /* = 13 */
}

external enum class VertexAttributeFormat {
    Float32 /* = 0 */,
    Float16 /* = 1 */,
    UNorm8 /* = 2 */,
    SNorm8 /* = 3 */,
    UNorm16 /* = 4 */,
    SNorm16 /* = 5 */,
    UInt8 /* = 6 */,
    SInt8 /* = 7 */,
    UInt16 /* = 8 */,
    SInt16 /* = 9 */,
    UInt32 /* = 10 */,
    SInt32 /* = 11 */
}

external open class SubMeshDescriptor : ValueType

external enum class MeshUpdateFlags {
    Default /* = 0 */,
    DontValidateIndices /* = 1 */,
    DontResetBoneBounds /* = 2 */,
    DontNotifyMeshUsers /* = 4 */,
    DontRecalculateBounds /* = 8 */
}

external open class ReflectionProbeBlendInfo : ValueType

external enum class ShaderHardwareTier {
    Tier1 /* = 0 */,
    Tier2 /* = 1 */,
    Tier3 /* = 2 */
}

external open class GlobalKeyword : ValueType

external open class LocalKeywordSpace : ValueType, `IEquatable$1`<LocalKeywordSpace>

external open class ShaderTagId : ValueType, `IEquatable$1`<ShaderTagId>

external enum class RenderTextureSubElement {
    Color /* = 0 */,
    Depth /* = 1 */,
    Stencil /* = 2 */,
    Default /* = 3 */
}

external enum class ShaderPropertyType {
    Color /* = 0 */,
    Vector /* = 1 */,
    Float /* = 2 */,
    Range /* = 3 */,
    Texture /* = 4 */,
    Int /* = 5 */
}

external enum class ShaderPropertyFlags {
    None /* = 0 */,
    HideInInspector /* = 1 */,
    PerRendererData /* = 2 */,
    NoScaleOffset /* = 4 */,
    Normal /* = 8 */,
    HDR /* = 16 */,
    Gamma /* = 32 */,
    NonModifiableTextureData /* = 64 */,
    MainTexture /* = 128 */,
    MainColor /* = 256 */
}

external enum class TextureDimension {
    Unknown /* = -1 */,
    None /* = 0 */,
    Any /* = 1 */,
    Tex2D /* = 2 */,
    Tex3D /* = 3 */,
    Cube /* = 4 */,
    Tex2DArray /* = 5 */,
    CubeArray /* = 6 */
}

external enum class AmbientMode {
    Skybox /* = 0 */,
    Trilight /* = 1 */,
    Flat /* = 3 */,
    Custom /* = 4 */
}

external enum class DefaultReflectionMode {
    Skybox /* = 0 */,
    Custom /* = 1 */
}

external open class LocalKeyword : ValueType, `IEquatable$1`<LocalKeyword>

external enum class LightShadowResolution {
    FromQualitySettings /* = -1 */,
    Low /* = 0 */,
    Medium /* = 1 */,
    High /* = 2 */,
    VeryHigh /* = 3 */
}

external enum class LightEvent {
    BeforeShadowMap /* = 0 */,
    AfterShadowMap /* = 1 */,
    BeforeScreenspaceMask /* = 2 */,
    AfterScreenspaceMask /* = 3 */,
    BeforeShadowMapPass /* = 4 */,
    AfterShadowMapPass /* = 5 */
}

external enum class ShadowMapPass {
    PointlightPositiveX /* = 1 */,
    PointlightNegativeX /* = 2 */,
    PointlightPositiveY /* = 4 */,
    PointlightNegativeY /* = 8 */,
    PointlightPositiveZ /* = 16 */,
    PointlightNegativeZ /* = 32 */,
    DirectionalCascade0 /* = 64 */,
    DirectionalCascade1 /* = 128 */,
    DirectionalCascade2 /* = 256 */,
    DirectionalCascade3 /* = 512 */,
    Spotlight /* = 1024 */,
    Pointlight /* = 63 */,
    Directional /* = 960 */,
    All /* = 2047 */
}

external enum class ShadowSamplingMode {
    CompareDepths /* = 0 */,
    RawDepth /* = 1 */,
    None /* = 2 */
}

external enum class PassType {
    Normal /* = 0 */,
    Vertex /* = 1 */,
    VertexLM /* = 2 */,
    VertexLMRGBM /* = 3 */,
    ForwardBase /* = 4 */,
    ForwardAdd /* = 5 */,
    LightPrePassBase /* = 6 */,
    LightPrePassFinal /* = 7 */,
    ShadowCaster /* = 8 */,
    Deferred /* = 10 */,
    Meta /* = 11 */,
    MotionVectors /* = 12 */,
    ScriptableRenderPipeline /* = 13 */,
    ScriptableRenderPipelineDefaultUnlit /* = 14 */
}

external enum class GraphicsDeviceType {
    OpenGL2 /* = 0 */,
    Direct3D9 /* = 1 */,
    Direct3D11 /* = 2 */,
    PlayStation3 /* = 3 */,
    Null /* = 4 */,
    Xbox360 /* = 6 */,
    OpenGLES2 /* = 8 */,
    OpenGLES3 /* = 11 */,
    PlayStationVita /* = 12 */,
    PlayStation4 /* = 13 */,
    XboxOne /* = 14 */,
    PlayStationMobile /* = 15 */,
    Metal /* = 16 */,
    OpenGLCore /* = 17 */,
    Direct3D12 /* = 18 */,
    N3DS /* = 19 */,
    Vulkan /* = 21 */,
    Switch /* = 22 */,
    XboxOneD3D12 /* = 23 */,
    GameCoreXboxOne /* = 24 */,
    GameCoreScarlett /* = 25 */,
    GameCoreXboxSeries /* = 25 */,
    PlayStation5 /* = 26 */,
    PlayStation5NGGC /* = 27 */
}

external enum class RenderingThreadingMode {
    Direct /* = 0 */,
    SingleThreaded /* = 1 */,
    MultiThreaded /* = 2 */,
    LegacyJobified /* = 3 */,
    NativeGraphicsJobs /* = 4 */,
    NativeGraphicsJobsWithoutRenderThread /* = 5 */
}

external enum class CopyTextureSupport {
    None /* = 0 */,
    Basic /* = 1 */,
    Copy3D /* = 2 */,
    DifferentTypes /* = 4 */,
    TextureToRT /* = 8 */,
    RTToTexture /* = 16 */
}

external enum class UVChannelFlags {
    UV0 /* = 1 */,
    UV1 /* = 2 */,
    UV2 /* = 4 */,
    UV3 /* = 8 */
}

external enum class StencilOp {
    Keep /* = 0 */,
    Zero /* = 1 */,
    Replace /* = 2 */,
    IncrementSaturate /* = 3 */,
    DecrementSaturate /* = 4 */,
    Invert /* = 5 */,
    IncrementWrap /* = 6 */,
    DecrementWrap /* = 7 */
}

external enum class CompareFunction {
    Disabled /* = 0 */,
    Never /* = 1 */,
    Less /* = 2 */,
    Equal /* = 3 */,
    LessEqual /* = 4 */,
    Greater /* = 5 */,
    NotEqual /* = 6 */,
    GreaterEqual /* = 7 */,
    Always /* = 8 */
}

external enum class ColorWriteMask {
    Alpha /* = 1 */,
    Blue /* = 2 */,
    Green /* = 4 */,
    Red /* = 8 */,
    All /* = 15 */
}