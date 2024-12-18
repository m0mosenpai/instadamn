package com.facebook.flexlayout.layoutoutput;

import X.C05F;

/* loaded from: classes3.dex */
public class LayoutOutput {
    public float[] arr;
    public final Object[] measureResults;

    public LayoutOutput(int i) {
        this.measureResults = new Object[i];
        this.arr = new float[C05F.A00(3).length + (i * C05F.A00(4).length)];
    }
}
