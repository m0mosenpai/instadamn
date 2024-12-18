package com.facebook.traffic.nts.providers.reachability;

import X.AbstractC166987dD;
import X.AbstractC58317Pt9;
import X.C09170dP;
import X.C14360o3;
import X.InterfaceC16660sJ;
import com.facebook.jni.HybridData;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes12.dex */
public final class ReachabilityV2ProviderImpl implements ReachabilityV2ProviderAppLayer, ReachabilityV2ProviderXplat {
    public static final Companion Companion = new Object();
    public final HybridData mHybridData;

    public ReachabilityV2ProviderImpl(HybridData hybridData) {
        C14360o3.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public static final native HybridData initHybrid0();

    @Override // com.facebook.traffic.nts.providers.reachability.ReachabilityV2ProviderAppLayer
    public native void updateConnectionType(int i);

    /* loaded from: classes12.dex */
    public final class Companion {
        private final HybridData initHybrid0() {
            return ReachabilityV2ProviderImpl.initHybrid0();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.facebook.traffic.nts.providers.reachability.ReachabilityV2ProviderImpl$Companion] */
    static {
        C09170dP.A0C("reachability_provider");
    }

    @Override // com.facebook.traffic.nts.providers.reachability.ReachabilityV2ProviderXplat
    public void addOnConnectionTypeChangedCallback(InterfaceC16660sJ interfaceC16660sJ) {
        throw AbstractC166987dD.A18("Native method not registered. Did you intend to add callback at the xplat layer?");
    }

    @Override // com.facebook.traffic.nts.providers.reachability.ReachabilityV2ProviderXplat
    public int getConnectionType() {
        throw AbstractC166987dD.A18("Native method not registered. Did you intend to check connection type at the xplat layer?");
    }

    @Override // com.facebook.traffic.nts.providers.reachability.ReachabilityV2ProviderAppLayer
    public void setUpcallImpl(ReachabilityV2ProviderAppLayerUpcalls reachabilityV2ProviderAppLayerUpcalls) {
        throw AbstractC166987dD.A18(AbstractC58317Pt9.A00(591));
    }

    public ReachabilityV2ProviderImpl() {
        this(initHybrid0());
    }
}
