package X;

import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.tigon.tigonhuc.HucClient;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9t6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC223229t6 {
    public static final /* synthetic */ EnumC223229t6[] A01;
    public static final EnumC223229t6 A02;
    public static final EnumC223229t6 A03;
    public static final EnumC223229t6 A04;
    public static final EnumC223229t6 A05;
    public final int A00;

    static {
        EnumC223229t6[] enumC223229t6Arr = new EnumC223229t6[178];
        EnumC223229t6 A00 = A00("Dummy", 0);
        A03 = A00;
        EnumC223229t6 A002 = A00("AREngine_ForceNoMSAA", 1);
        EnumC223229t6 A003 = A00("BackgroundProcessor_UseCaptureTime", 2);
        EnumC223229t6 A004 = A00("RegionTracking_EnableSimilarityTracker", 3);
        EnumC223229t6 A005 = A00("Network_Logging", 4);
        EnumC223229t6 A006 = A00("AREngine_ForcePhase4Audio", 5);
        A02 = A006;
        EnumC223229t6 A007 = A00("WorldTracker_ARCoreSupported", 6);
        A04 = A007;
        EnumC223229t6 A008 = A00("AsyncLoading_UseAsyncAssetLoaderForDynamicExternalAssets", 7);
        EnumC223229t6 A009 = A00("FaceTracker_UseNonStaticReferenceFaceShapeLoader", 8);
        EnumC223229t6 A0010 = A00("WorldTracker_EnableUXR", 9);
        EnumC223229t6 A0011 = A00("Segmentation_Android_Caffe2_Thread_Enabled", 10);
        EnumC223229t6 A0012 = A00("Platform_Person_Segmentation_Enabled", 11);
        EnumC223229t6 A0013 = A00("WorldTracker_UseWolfSlamForWarfSlam", 12);
        EnumC223229t6 A0014 = A00("WorldTracker_UseWorldTrackerV2", 13);
        EnumC223229t6 A0015 = A00("WorldTracker_EnableTrackingDataInVideoData", 14);
        EnumC223229t6 A0016 = A00("WorldTracker_PlatformSLAMSupported", 15);
        EnumC223229t6 A0017 = A00("WorldTracker_EnableHitTestWithDepth", 16);
        A05 = A0017;
        System.arraycopy(new EnumC223229t6[]{A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A00("FaceTracker_UseAsyncModelLoad", 17), A00("ExpressionFitting_UseEFDataProvider", 18), A00("ExpressionFitting_UseTimestampSync", 19), A00("WOLFService_ClearAlgorithmsOnServiceReset", 20), A00("Segmentation_UseAsyncModelLoad", 21), A00("AREngine_AsyncDestructionEnabled", 22), A00("AREngine_CosmoRuntimeEnabled", 23), A00("AREngine_JSI_ForceEagerCompilation", 24), A00("AREngine_JSI_UseEmbeddedBytecode", 25), A00("AREngine_JSI_UseHermesHardenedRuntime", 26)}, 0, enumC223229t6Arr, 0, 27);
        System.arraycopy(new EnumC223229t6[]{A00("AREngine_JSI_registerHermesForProfiling", 27), A00("AREngine_AssetEncoding", 28), A00("AREngine_PrefabStorageCache_PreloadRenderData", 29), A00("AREngine_TextureStorageCache_EnablePreload", 30), A00("AREngine_ShaderCodeStorageCache_UseUnifex", 31), A00("AREngine_UseCountedRenderPipelineStatePool", 32), A00("AREngine_ScriptIsolationEnabled", 33), A00("AREngine_UseCaptureBusForInputCapture", 34), A00("AREngine_AutoStartBlocksPreload", 35), A00("AREngine_Stability_Push_UnprovenPath", 36), A00("AREngine_Stability_Lion_Path", 37), A00("AREngine_Stability_Leopard_Path", 38), A00("AREngine_Stability_Rhino_Path", 39), A00("AREngine_Stability_Elephant_Path", 40), A00("AREngine_XOR_EnableXorRendering", 41), A00("AREngine_XOR_EnableXorRendering_ProductionRollout", 42), A00("AREngine_XOR_EnableXorMesh", 43), A00("AREngine_XOR_EnableXorPhase2Mesh", 44), A00("AREngine_XOR_EnableEngineUniformBlock", 45), A00("AREngine_XOR_EnableSceneTreeToEntity", 46), A00("AREngine_XOR_EnableSceneTreeToEntity_ProductionRollout", 47), A00("AREngine_XOR_EnableSceneTreeToEntity_ProductionRollout_BatchB", 48), A00("AREngine_XOR_EnableAudioXorContextProxy", 49), A00("AREngine_XOR_EnableUniforms", 50), A00("AREngine_ReactiveGraph_ScopedToRootBlocks", 51), A00("AREngine_SkipSimulationByBlockId", 52), A00("AREngine_BVH_PerTriangle_HitTesting", 53)}, 0, enumC223229t6Arr, 27, 27);
        System.arraycopy(new EnumC223229t6[]{A00("AREngine_BVH_PerTriangle_HitTesting_Skinned_Meshes", 54), A00("AREngine_Use_SandboxedHermesVM", 55), A00("AREngine_Disable_Legacy_Audio_Thread", 56), A00("AREngine_ShaderCompression", 57), A00("AREngine_RemoveTrimAnimatorFromPlaneSynchronizer", 58), A00("AREngine_Sandboxed_Process_FoA", 59), A00("AREngine_DownsampleLargeTexturesDuringDecoding", 60), A00("AREngine_UseGltfEcosDataModel", 61), A00("AREngine_UseStyle2AvatarShaders", 62), A00("AREngine_DownsampleTexturesWhenLowMemory_Enabled", 63), A00("AREngine_MergeTextExtrusionShapes", 64), A00("FBA_Expose_At_Creation", 65), A00("FBA_Expose_At_Audio_Input_Start", 66), A00("FBA_Expose_At_Platform_Output_Start", 67), A00("FBA_Buffer_Optimization", 68), A00("FBA_State_Machine", 69), A00("FBA_Async_Media_Codec", 70), A00("FBA_Allow_Ar_Audio_Post_Capture", 71), A00("FBA_XplatControlsStartInput", 72), A00("FBA_Audio_Reactive_Effect", 73), A00("FBA_Use48kHz_Sample_Rate", 74), A00("FBA_FBA_Is_Processing_Graph", 75), A00("FBA_PCMFloat", 76), A00("FBA_Stereo", 77), A00("OpenGLES30", 78), A00("AnomalyDetector", 79), A00("AspectRatioFix", 80)}, 0, enumC223229t6Arr, 54, 27);
        System.arraycopy(new EnumC223229t6[]{A00("TrivialOutputFixForAspectRatioFix", 81), A00("MatchCameraSdkPreviewScalingMode", 82), A00("SyncOnlyCopyToOutput", 83), A00("ConfigureBFrames", 84), A00("ExplicitlySetBaseline", 85), A00("GpuTimer", 86), A00("FrameBuffering", 87), A00("AllowMultipleOutputTypesRendering", 88), A00("PreviewFrameController", 89), A00("AsyncMediaCodec", 90), A00("SyncCpuFrames", 91), A00("CrashFromGlThread", 92), A00("UnifiedStackCamera2", 93), A00("CpuFramesSyncForCamera2", 94), A00("UseThreadPriorityForCamera2", 95), A00("OffScreenOutput", 96), A00("CloseCameraOnSwitch", 97), A00("UseOptic2", 98), A00("UseOptic2Priority", 99), A00("UseOptimalRecordSize", 100), A00("MultiWindowSupport", 101), A00("WarmUpRenderManager", 102), A00("MediaPipeline_RenderMonitor", 103), A00("MediaPipeline_UseSharedCopyRenderer", 104), A00("MediaPipeline_UseRendererProvider", 105), A00("MediaPipeline_UseSurfaceHolder", 106), A00("MediaPipeline_UseSingleInputLayout", 107)}, 0, enumC223229t6Arr, 81, 27);
        System.arraycopy(new EnumC223229t6[]{A00("MediaPipeline_OverrideYuv2RgbCopyShader", 108), A00("MediaPipeline_EnableSyncCpuFramesLifecycle", 109), A00("Optic_NonUIThreadForEventLogging", 110), A00("Recorder_Explicitly_Set_Color_Encoding", 111), A00("VideoCaptureBitrate_Enabled", 112), A00("VideoBitrate_Increase_Saved_Bitrate", 113), A00("SaveCameraSensorRotationToEffectServiceHost", 114), A00("ReducedVideoResolution_Exclude_Unreleased_High_End_Device", 115), A00("VideoRecording_Stage1MuxerStop", 116), A00("VideoRecording_ShortBlockingStart", 117), A00("VideoRecording_EnableMinRecordingDuration", 118), A00("VideoRecording_EnableSafeAudioCodecRelease", 119), A00("Boomerang_EnableSafeCodecRelease", HucClient.BODY_UPLOAD_TIMEOUT_SECONDS), A00("FbMsqrdRenderer_ReleaseRenderSessionWhenUnsetEffect", 121), A00("OC_CaptureHevcVideo", 122), A00("OC_CaptureHevcVideoAllowListed", 123), A00("OC_CaptureAV1Video", 124), A00("OC_CaptureAV1Video_AllowSoftwareEncoder", 125), A00("OC_VideoRecordPerfStats", 126), A00("OC_CaptureAllowMtKHevcHDR", StringTreeSet.MAX_SYMBOL_COUNT), A00("OC_CaptureAllowMtKHevcSDR", 128), A00("OC_CaptureAllowMtkHevcHardware", 129), A00("OC_PreventARE_HardLimitEnabled", 130), A00("OC_PreventARE_PerEffectLimitEnabled", 131), A00("OC_FirstFrameFromGlOutput", 132), A00("OC_UnsynchronizedGetSurfaceKey", 133), A00("SupportVideoRecordingPrepare", 134)}, 0, enumC223229t6Arr, 108, 27);
        System.arraycopy(new EnumC223229t6[]{A00("OneCameraArXLogger", 135), A00("WorldTrackerModule_UseUnmodifiedPlatformTrackingState", 136), A00("QueryWidthHeightAlignment", 137), A00("VideoRecording_AudioEncoder_SkipPassingCodecConfigFlagDownstream", 138), A00("Avatars_RecordLog", 139), A00("Avatars_RecordPluginMetrics", 140), A00("Avatars_DET_UserCalibrationEnabled", 141), A00("Avatars_DET_MouthOcclusionHandlingEnabled", 142), A00("Avatars_HeadOnlyNeckCollapseEnabled", 143), A00("Avatars_CacheBehaviors", 144), A00("Avatars_EnableTrackingWithMemoryAssets", 145), A00("Avatars_RecordPrefetchMetrics", 146), A00("Avatars_DET_HeadPoseEnabled", 147), A00("Avatars_ShaderCacheEnabled", 148), A00("Avatars_EnableCdlEventFramePolling", 149), A00("Avatars_EnableM6Parametrics", 150), A00("Avatars_UseSparseMorphTargets", 151), A00("Avatars_UseSDKShallowCopy", 152), A00("Avatars_EnableHalfBodyCollapse", 153), A00("Avatars_MergeMeshesPerShader", 154), A00("Avatars_UseGpuMorphTargets", 155), A00("Avatars_EnableBodySolver", 156), A00("Avatars_DisableWaitForEntityStatus", 157), A00("Avatars_UseCpuFormattedSparseMorphTargets", 158), A00("FBA_Audio_Command_buffer", 159), A00("Zeratul_DET_Enabled", 160), A00("OptimizedBoundingBoxMeasurement_Enabled", 161)}, 0, enumC223229t6Arr, 135, 27);
        System.arraycopy(new EnumC223229t6[]{A00("RenderPerJointAnimatedBoundingBoxes_Enabled", 162), A00("TerminateRaycastAtJointBoundingBox_Enabled", 163), A00("Felios_ParallelizeLoadLocalAssets", 164), A00("VideoCall_StreamUseCase_Enabled", 165), A00("NonDefault_StreamUseCase_Enabled", 166), A00("AvatarsPerformanceTierEnabled", 167), A00("AvatarsTieredExperienceEnabled", 168), A00("Preview_Video_Stabilization_Enabled", 169), A00("Using_Swiftshader", AbstractC62862SUj.MAX_FACTORIAL), A00("ShouldUseReducedVideoResolutionFromDeviceSegment", 171), A00("ExpressionTracker_OneRunPerRender", 172), A00("PersonSegmentation_UnsafeLoad", 173), A00("MediaPipeline_Debug_Enabled", 174), A00("AREngine_DeSparkifyReactivePlugin", 175), A00("AREngine_DeSparkifyComponentsInfra", 176), A00("AREngine_DeSparkifyTypeErasurePluginSystem", 177)}, 0, enumC223229t6Arr, 162, 16);
        A01 = enumC223229t6Arr;
    }

    public static EnumC223229t6 A00(String str, int i) {
        return new EnumC223229t6(str, i, i);
    }

    public static EnumC223229t6 valueOf(String str) {
        return (EnumC223229t6) Enum.valueOf(EnumC223229t6.class, str);
    }

    public static EnumC223229t6[] values() {
        return (EnumC223229t6[]) A01.clone();
    }

    public EnumC223229t6(String str, int i, int i2) {
        this.A00 = i2;
    }
}
