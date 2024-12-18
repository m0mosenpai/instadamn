package X;

import com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsCxxInterop;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider;

/* renamed from: X.YBu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73408YBu implements ReactNativeFeatureFlagsProvider {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Boolean A0D;
    public Boolean A0E;
    public Boolean A0F;
    public Boolean A0G;
    public Boolean A0H;
    public Boolean A0I;
    public Boolean A0J;
    public Boolean A0K;
    public Boolean A0L;
    public Boolean A0M;
    public Boolean A0N;
    public Boolean A0O;
    public Boolean A0P;
    public Boolean A0Q;
    public Boolean A0R;
    public Boolean A0S;
    public Boolean A0T;
    public Boolean A0U;
    public Boolean A0V;
    public Boolean A0W;
    public Boolean A0X;
    public Boolean A0Y;
    public Boolean A0Z;
    public Boolean A0a;
    public Boolean A0b;
    public Boolean A0c;
    public Boolean A0d;
    public Boolean A0e;
    public Boolean A0f;
    public Boolean A0g;
    public Boolean A0h;
    public Boolean A0i;
    public Boolean A0j;
    public Boolean A0k;
    public Boolean A0l;
    public Boolean A0m;

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean allowRecursiveCommitsWithSynchronousMountOnAndroid() {
        Boolean bool = this.A00;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.allowRecursiveCommitsWithSynchronousMountOnAndroid());
            this.A00 = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean batchRenderingUpdatesInEventLoop() {
        Boolean bool = this.A01;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.batchRenderingUpdatesInEventLoop());
            this.A01 = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean commonTestFlag() {
        Boolean bool = this.A02;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.commonTestFlag());
            this.A02 = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean completeReactInstanceCreationOnBgThreadOnAndroid() {
        Boolean bool = this.A03;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.completeReactInstanceCreationOnBgThreadOnAndroid());
            this.A03 = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean enableAlignItemsBaselineOnFabricIOS() {
        Boolean bool = this.A04;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableAlignItemsBaselineOnFabricIOS());
            this.A04 = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean enableAndroidLineHeightCentering() {
        Boolean bool = this.A05;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableAndroidLineHeightCentering());
            this.A05 = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean enableBridgelessArchitecture() {
        Boolean bool = this.A06;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableBridgelessArchitecture());
            this.A06 = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean enableCleanTextInputYogaNode() {
        Boolean bool = this.A07;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableCleanTextInputYogaNode());
            this.A07 = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean enableDeletionOfUnmountedViews() {
        Boolean bool = this.A08;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableDeletionOfUnmountedViews());
            this.A08 = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean enableEagerRootViewAttachment() {
        Boolean bool = this.A09;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableEagerRootViewAttachment());
            this.A09 = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean enableEventEmitterRetentionDuringGesturesOnAndroid() {
        Boolean bool = this.A0A;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableEventEmitterRetentionDuringGesturesOnAndroid());
            this.A0A = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean enableFabricLogs() {
        Boolean bool = this.A0B;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableFabricLogs());
            this.A0B = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean enableFabricRenderer() {
        Boolean bool = this.A0C;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableFabricRenderer());
            this.A0C = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean enableFabricRendererExclusively() {
        Boolean bool = this.A0D;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableFabricRendererExclusively());
            this.A0D = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean enableGranularShadowTreeStateReconciliation() {
        Boolean bool = this.A0E;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableGranularShadowTreeStateReconciliation());
            this.A0E = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean enableIOSViewClipToPaddingBox() {
        Boolean bool = this.A0F;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableIOSViewClipToPaddingBox());
            this.A0F = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean enableLayoutAnimationsOnAndroid() {
        Boolean bool = this.A0G;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableLayoutAnimationsOnAndroid());
            this.A0G = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean enableLayoutAnimationsOnIOS() {
        Boolean bool = this.A0H;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableLayoutAnimationsOnIOS());
            this.A0H = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean enableLongTaskAPI() {
        Boolean bool = this.A0I;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableLongTaskAPI());
            this.A0I = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean enableMicrotasks() {
        Boolean bool = this.A0J;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableMicrotasks());
            this.A0J = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean enablePreciseSchedulingForPremountItemsOnAndroid() {
        Boolean bool = this.A0K;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enablePreciseSchedulingForPremountItemsOnAndroid());
            this.A0K = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean enablePropsUpdateReconciliationAndroid() {
        Boolean bool = this.A0L;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enablePropsUpdateReconciliationAndroid());
            this.A0L = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean enableReportEventPaintTime() {
        Boolean bool = this.A0M;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableReportEventPaintTime());
            this.A0M = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean enableSynchronousStateUpdates() {
        Boolean bool = this.A0N;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableSynchronousStateUpdates());
            this.A0N = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean enableTextPreallocationOptimisation() {
        Boolean bool = this.A0O;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableTextPreallocationOptimisation());
            this.A0O = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean enableUIConsistency() {
        Boolean bool = this.A0P;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableUIConsistency());
            this.A0P = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean enableViewRecycling() {
        Boolean bool = this.A0Q;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableViewRecycling());
            this.A0Q = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean excludeYogaFromRawProps() {
        Boolean bool = this.A0R;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.excludeYogaFromRawProps());
            this.A0R = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean fetchImagesInViewPreallocation() {
        Boolean bool = this.A0S;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fetchImagesInViewPreallocation());
            this.A0S = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean fixMappingOfEventPrioritiesBetweenFabricAndReact() {
        Boolean bool = this.A0T;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fixMappingOfEventPrioritiesBetweenFabricAndReact());
            this.A0T = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean fixMountingCoordinatorReportedPendingTransactionsOnAndroid() {
        Boolean bool = this.A0U;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fixMountingCoordinatorReportedPendingTransactionsOnAndroid());
            this.A0U = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean forceBatchingMountItemsOnAndroid() {
        Boolean bool = this.A0V;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.forceBatchingMountItemsOnAndroid());
            this.A0V = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean fuseboxEnabledDebug() {
        Boolean bool = this.A0W;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fuseboxEnabledDebug());
            this.A0W = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean fuseboxEnabledRelease() {
        Boolean bool = this.A0X;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fuseboxEnabledRelease());
            this.A0X = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean initEagerTurboModulesOnNativeModulesQueueAndroid() {
        Boolean bool = this.A0Y;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.initEagerTurboModulesOnNativeModulesQueueAndroid());
            this.A0Y = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean lazyAnimationCallbacks() {
        Boolean bool = this.A0Z;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.lazyAnimationCallbacks());
            this.A0Z = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean loadVectorDrawablesOnImages() {
        Boolean bool = this.A0a;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.loadVectorDrawablesOnImages());
            this.A0a = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean removeNestedCallsToDispatchMountItemsOnAndroid() {
        Boolean bool = this.A0b;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.removeNestedCallsToDispatchMountItemsOnAndroid());
            this.A0b = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean setAndroidLayoutDirection() {
        Boolean bool = this.A0c;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.setAndroidLayoutDirection());
            this.A0c = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean traceTurboModulePromiseRejectionsOnAndroid() {
        Boolean bool = this.A0d;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.traceTurboModulePromiseRejectionsOnAndroid());
            this.A0d = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean useFabricInterop() {
        Boolean bool = this.A0e;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useFabricInterop());
            this.A0e = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean useImmediateExecutorInAndroidBridgeless() {
        Boolean bool = this.A0f;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useImmediateExecutorInAndroidBridgeless());
            this.A0f = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean useModernRuntimeScheduler() {
        Boolean bool = this.A0g;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useModernRuntimeScheduler());
            this.A0g = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean useNativeViewConfigsInBridgelessMode() {
        Boolean bool = this.A0h;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useNativeViewConfigsInBridgelessMode());
            this.A0h = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean useOptimisedViewPreallocationOnAndroid() {
        Boolean bool = this.A0i;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useOptimisedViewPreallocationOnAndroid());
            this.A0i = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean useOptimizedEventBatchingOnAndroid() {
        Boolean bool = this.A0j;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useOptimizedEventBatchingOnAndroid());
            this.A0j = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean useRuntimeShadowNodeReferenceUpdate() {
        Boolean bool = this.A0k;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useRuntimeShadowNodeReferenceUpdate());
            this.A0k = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean useTurboModuleInterop() {
        Boolean bool = this.A0l;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useTurboModuleInterop());
            this.A0l = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public final boolean useTurboModules() {
        Boolean bool = this.A0m;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useTurboModules());
            this.A0m = bool;
        }
        return bool.booleanValue();
    }
}
