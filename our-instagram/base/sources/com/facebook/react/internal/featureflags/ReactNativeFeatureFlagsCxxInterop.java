package com.facebook.react.internal.featureflags;

import X.C09170dP;

/* loaded from: classes12.dex */
public final class ReactNativeFeatureFlagsCxxInterop {
    public static final ReactNativeFeatureFlagsCxxInterop INSTANCE = new Object();

    public static final native boolean allowRecursiveCommitsWithSynchronousMountOnAndroid();

    public static final native boolean batchRenderingUpdatesInEventLoop();

    public static final native boolean commonTestFlag();

    public static final native boolean completeReactInstanceCreationOnBgThreadOnAndroid();

    public static final native void dangerouslyReset();

    public static final native boolean enableAlignItemsBaselineOnFabricIOS();

    public static final native boolean enableAndroidLineHeightCentering();

    public static final native boolean enableBridgelessArchitecture();

    public static final native boolean enableCleanTextInputYogaNode();

    public static final native boolean enableDeletionOfUnmountedViews();

    public static final native boolean enableEagerRootViewAttachment();

    public static final native boolean enableEventEmitterRetentionDuringGesturesOnAndroid();

    public static final native boolean enableFabricLogs();

    public static final native boolean enableFabricRenderer();

    public static final native boolean enableFabricRendererExclusively();

    public static final native boolean enableGranularShadowTreeStateReconciliation();

    public static final native boolean enableIOSViewClipToPaddingBox();

    public static final native boolean enableLayoutAnimationsOnAndroid();

    public static final native boolean enableLayoutAnimationsOnIOS();

    public static final native boolean enableLongTaskAPI();

    public static final native boolean enableMicrotasks();

    public static final native boolean enablePreciseSchedulingForPremountItemsOnAndroid();

    public static final native boolean enablePropsUpdateReconciliationAndroid();

    public static final native boolean enableReportEventPaintTime();

    public static final native boolean enableSynchronousStateUpdates();

    public static final native boolean enableTextPreallocationOptimisation();

    public static final native boolean enableUIConsistency();

    public static final native boolean enableViewRecycling();

    public static final native boolean excludeYogaFromRawProps();

    public static final native boolean fetchImagesInViewPreallocation();

    public static final native boolean fixMappingOfEventPrioritiesBetweenFabricAndReact();

    public static final native boolean fixMountingCoordinatorReportedPendingTransactionsOnAndroid();

    public static final native boolean forceBatchingMountItemsOnAndroid();

    public static final native boolean fuseboxEnabledDebug();

    public static final native boolean fuseboxEnabledRelease();

    public static final native boolean initEagerTurboModulesOnNativeModulesQueueAndroid();

    public static final native boolean lazyAnimationCallbacks();

    public static final native boolean loadVectorDrawablesOnImages();

    public static final native void override(Object obj);

    public static final native boolean removeNestedCallsToDispatchMountItemsOnAndroid();

    public static final native boolean setAndroidLayoutDirection();

    public static final native boolean traceTurboModulePromiseRejectionsOnAndroid();

    public static final native boolean useFabricInterop();

    public static final native boolean useImmediateExecutorInAndroidBridgeless();

    public static final native boolean useModernRuntimeScheduler();

    public static final native boolean useNativeViewConfigsInBridgelessMode();

    public static final native boolean useOptimisedViewPreallocationOnAndroid();

    public static final native boolean useOptimizedEventBatchingOnAndroid();

    public static final native boolean useRuntimeShadowNodeReferenceUpdate();

    public static final native boolean useTurboModuleInterop();

    public static final native boolean useTurboModules();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsCxxInterop] */
    static {
        C09170dP.A0C("react_featureflagsjni");
    }
}
