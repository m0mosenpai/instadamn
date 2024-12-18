package com.facebook.traffic.nts.providers.background;

import X.C09170dP;
import X.C14360o3;
import com.facebook.jni.HybridData;
import com.facebook.react.modules.appstate.AppStateModule;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class BackgroundV2TaskSchedulerImplHolder {
    public static final Companion Companion = new Object();
    public final HybridData mHybridData;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BackgroundV2TaskSchedulerImplHolder(BackgroundV2TaskSchedulerConfig backgroundV2TaskSchedulerConfig) {
        this(initHybrid0(backgroundV2TaskSchedulerConfig));
        C14360o3.A0B(backgroundV2TaskSchedulerConfig, 1);
    }

    public static final native HybridData initHybrid0(BackgroundV2TaskSchedulerConfig backgroundV2TaskSchedulerConfig);

    public final native BackgroundV2TaskSchedulerImpl getImpl();

    public final native void setUpcallImpl(BackgroundV2TaskSchedulerAppLayerUpcalls backgroundV2TaskSchedulerAppLayerUpcalls);

    /* loaded from: classes10.dex */
    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        private final HybridData initHybrid0(BackgroundV2TaskSchedulerConfig backgroundV2TaskSchedulerConfig) {
            return BackgroundV2TaskSchedulerImplHolder.initHybrid0(backgroundV2TaskSchedulerConfig);
        }

        public Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerImplHolder$Companion, java.lang.Object] */
    static {
        C09170dP.A0C(AppStateModule.APP_STATE_BACKGROUND);
    }

    public BackgroundV2TaskSchedulerImplHolder(HybridData hybridData) {
        C14360o3.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }
}
