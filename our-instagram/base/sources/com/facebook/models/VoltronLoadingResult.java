package com.facebook.models;

import X.C09170dP;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public class VoltronLoadingResult {
    public final HybridData mHybridData = initHybrid(true, true);

    public VoltronLoadingResult(boolean z, boolean z2) {
    }

    private native HybridData initHybrid(boolean z, boolean z2);

    static {
        C09170dP.A0C("models-common");
    }
}
