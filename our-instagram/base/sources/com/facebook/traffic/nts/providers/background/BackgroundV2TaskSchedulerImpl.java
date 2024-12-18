package com.facebook.traffic.nts.providers.background;

import X.AbstractC166987dD;
import X.C09170dP;
import X.C14360o3;
import X.InterfaceC16820sZ;
import com.facebook.jni.HybridData;
import com.facebook.react.modules.appstate.AppStateModule;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class BackgroundV2TaskSchedulerImpl implements BackgroundV2TaskSchedulerAppLayer, BackgroundV2TaskSchedulerXplat {
    public static final Companion Companion = new Object();
    public final HybridData mHybridData;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BackgroundV2TaskSchedulerImpl(BackgroundV2TaskSchedulerConfig backgroundV2TaskSchedulerConfig) {
        this(initHybrid0(backgroundV2TaskSchedulerConfig));
        C14360o3.A0B(backgroundV2TaskSchedulerConfig, 1);
    }

    public static final native HybridData initHybrid0(BackgroundV2TaskSchedulerConfig backgroundV2TaskSchedulerConfig);

    @Override // com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerAppLayer
    public native void executeReadyTasksAndReschedule();

    /* loaded from: classes10.dex */
    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        private final HybridData initHybrid0(BackgroundV2TaskSchedulerConfig backgroundV2TaskSchedulerConfig) {
            return BackgroundV2TaskSchedulerImpl.initHybrid0(backgroundV2TaskSchedulerConfig);
        }

        public Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerImpl$Companion, java.lang.Object] */
    static {
        C09170dP.A0C(AppStateModule.APP_STATE_BACKGROUND);
    }

    @Override // com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerXplat
    public void addBackgroundFunction(InterfaceC16820sZ interfaceC16820sZ, long j) {
        throw AbstractC166987dD.A18("Native method not registered. Did you intend to addBackgroundFunction at the xplat layer?");
    }

    @Override // com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerAppLayer
    public void setUpcallImpl(BackgroundV2TaskSchedulerAppLayerUpcalls backgroundV2TaskSchedulerAppLayerUpcalls) {
        throw AbstractC166987dD.A18("Native method not registered. Did you intend to set upcall impl through provider's holder?");
    }

    public BackgroundV2TaskSchedulerImpl(HybridData hybridData) {
        C14360o3.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }
}
