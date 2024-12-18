package com.facebook.papaya.store;

import X.C09170dP;
import com.facebook.jni.HybridData;

/* loaded from: classes12.dex */
public class RecordSet {
    public final HybridData mHybridData;

    private native Record nativeGet(int i);

    private native int nativeSize();

    static {
        C09170dP.A0C("papaya-store-interface");
    }

    public RecordSet(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
