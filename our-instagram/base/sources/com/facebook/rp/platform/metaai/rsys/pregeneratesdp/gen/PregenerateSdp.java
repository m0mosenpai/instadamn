package com.facebook.rp.platform.metaai.rsys.pregeneratesdp.gen;

import X.C09170dP;
import X.C14360o3;
import X.C53729NpI;
import com.facebook.jni.HybridData;

/* loaded from: classes9.dex */
public final class PregenerateSdp {
    public static final C53729NpI Companion = new Object();
    public final HybridData mHybridData;

    public PregenerateSdp(HybridData hybridData) {
        C14360o3.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public static final native HybridData initHybrid0(int i, long j);

    public final native boolean equals(PregenerateSdp pregenerateSdp);

    public final native PregenerateSdpData getData();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.NpI] */
    static {
        C09170dP.A0C("pregensdp");
    }
}
