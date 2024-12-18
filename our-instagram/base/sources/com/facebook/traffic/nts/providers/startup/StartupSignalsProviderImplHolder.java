package com.facebook.traffic.nts.providers.startup;

import X.C09170dP;
import X.C14360o3;
import com.facebook.jni.HybridData;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes12.dex */
public final class StartupSignalsProviderImplHolder {
    public static final Companion Companion = new Object();
    public final HybridData mHybridData;

    public StartupSignalsProviderImplHolder(HybridData hybridData) {
        C14360o3.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public static final native HybridData initHybrid0();

    public final native StartupSignalsProviderImpl getImpl();

    public final native void setUpcallImpl(StartupSignalsProviderAppLayerUpcalls startupSignalsProviderAppLayerUpcalls);

    /* loaded from: classes12.dex */
    public final class Companion {
        private final HybridData initHybrid0() {
            return StartupSignalsProviderImplHolder.initHybrid0();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.traffic.nts.providers.startup.StartupSignalsProviderImplHolder$Companion, java.lang.Object] */
    static {
        C09170dP.A0C("startup_signals_provider");
    }

    public StartupSignalsProviderImplHolder() {
        this(initHybrid0());
    }
}
