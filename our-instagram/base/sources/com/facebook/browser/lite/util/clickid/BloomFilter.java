package com.facebook.browser.lite.util.clickid;

import X.C09170dP;
import X.C14360o3;
import X.C72529Xfi;
import com.facebook.jni.HybridData;

/* loaded from: classes2.dex */
public final class BloomFilter {
    public static final C72529Xfi Companion = new Object();
    public final HybridData mHybridData;

    public BloomFilter(HybridData hybridData) {
        C14360o3.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public static final native HybridData initHybrid0(int i, int i2, byte[] bArr);

    public final native boolean add(long j);

    public final native boolean contains(long j);

    public final native byte[] getBits();

    public final native int getNumBits();

    public final native int getNumHashes();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.Xfi] */
    static {
        C09170dP.A0C("clickid");
    }
}
