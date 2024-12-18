package com.facebook.traffic.nts.providers.startup;

import X.AbstractC166987dD;
import X.C09170dP;
import X.C14360o3;
import X.InterfaceC16660sJ;
import com.facebook.jni.HybridData;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes12.dex */
public final class StartupSignalsProviderImpl implements StartupSignalsProviderAppLayer, StartupSignalsProviderXplat {
    public static final Companion Companion = new Object();
    public final HybridData mHybridData;

    public StartupSignalsProviderImpl(HybridData hybridData) {
        C14360o3.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public static final native HybridData initHybrid0();

    @Override // com.facebook.traffic.nts.providers.startup.StartupSignalsProviderAppLayer
    public native void notifyStartupCompleted(int i);

    /* loaded from: classes12.dex */
    public final class Companion {
        private final HybridData initHybrid0() {
            return StartupSignalsProviderImpl.initHybrid0();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.traffic.nts.providers.startup.StartupSignalsProviderImpl$Companion, java.lang.Object] */
    static {
        C09170dP.A0C("startup_signals_provider");
    }

    @Override // com.facebook.traffic.nts.providers.startup.StartupSignalsProviderXplat
    public void addOnStartupCompletedCallback(InterfaceC16660sJ interfaceC16660sJ) {
        throw AbstractC166987dD.A18("Native method not registered. Did you intend to add callback at the xplat layer?");
    }

    @Override // com.facebook.traffic.nts.providers.startup.StartupSignalsProviderAppLayer
    public void setUpcallImpl(StartupSignalsProviderAppLayerUpcalls startupSignalsProviderAppLayerUpcalls) {
        throw AbstractC166987dD.A18("Native method not registered. Did you intend to setUpcallImpl at the xplat layer?");
    }

    public StartupSignalsProviderImpl() {
        this(initHybrid0());
    }
}
