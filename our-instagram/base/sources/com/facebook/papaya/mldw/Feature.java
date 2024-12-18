package com.facebook.papaya.mldw;

import X.C09170dP;
import com.facebook.jni.HybridData;
import com.google.common.collect.ImmutableList;

/* loaded from: classes9.dex */
public class Feature {
    public final HybridData mHybridData;

    private native ImmutableList nativeGetColumnNames();

    private native int nativeGetColumns();

    private native long nativeGetFeatureId();

    private native ImmutableList nativeGetRow(int i);

    private native ImmutableList nativeGetRows(ImmutableList immutableList);

    private native int nativeGetRowsNumber();

    private native void nativeToKeyValuePair(int i);

    static {
        C09170dP.A0C("papaya-mldw");
    }

    public Feature(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
