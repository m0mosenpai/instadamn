package com.facebook.tigon.tigonhuc;

import X.C09170dP;
import X.S1S;
import com.facebook.jni.HybridData;

/* loaded from: classes10.dex */
public final class TigonHucBodyProvider {
    public static final S1S Companion = new Object();
    public final HybridData mHybridData;

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public final native void beginStream(HucBodyStream hucBodyStream);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.S1S, java.lang.Object] */
    static {
        C09170dP.A0C("tigonhuc");
    }

    public TigonHucBodyProvider(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
