package com.facebook.memory.common;

/* loaded from: classes5.dex */
public final class MapStats {
    public float A00;
    public long A01;
    public long A02;

    public void setMaxBucketCount(long j) {
        this.A01 = j;
    }

    public void setMaxLoadFactor(float f) {
        this.A00 = f;
    }

    public void setMaxSize(long j) {
        this.A02 = j;
    }
}
