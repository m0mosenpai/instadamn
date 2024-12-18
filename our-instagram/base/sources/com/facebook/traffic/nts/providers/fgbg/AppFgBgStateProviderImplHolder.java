package com.facebook.traffic.nts.providers.fgbg;

import X.C09170dP;
import X.C14360o3;
import com.facebook.jni.HybridData;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes12.dex */
public final class AppFgBgStateProviderImplHolder {
    public static final Companion Companion = new Object();
    public final HybridData mHybridData;

    public AppFgBgStateProviderImplHolder(HybridData hybridData) {
        C14360o3.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public static final native HybridData initHybrid0();

    public final native AppFgBgStateProviderImpl getImpl();

    public final native void setUpcallImpl(AppFgBgStateProviderAppLayerUpcalls appFgBgStateProviderAppLayerUpcalls);

    /* loaded from: classes12.dex */
    public final class Companion {
        private final HybridData initHybrid0() {
            return AppFgBgStateProviderImplHolder.initHybrid0();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.traffic.nts.providers.fgbg.AppFgBgStateProviderImplHolder$Companion, java.lang.Object] */
    static {
        C09170dP.A0C("fgbg_provider");
    }

    public AppFgBgStateProviderImplHolder() {
        this(initHybrid0());
    }
}
