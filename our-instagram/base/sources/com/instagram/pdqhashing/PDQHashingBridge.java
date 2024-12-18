package com.instagram.pdqhashing;

import X.C09170dP;
import X.C54073NvX;
import com.facebook.jni.HybridData;

/* loaded from: classes9.dex */
public final class PDQHashingBridge {
    public static final C54073NvX Companion = new Object();
    public final HybridData mHybridData;

    public static final native HybridData initHybrid(String str);

    public final native String getHashWithQuality(String str, int i, Integer num);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.NvX, java.lang.Object] */
    static {
        C09170dP.A0C("pdqhashing");
    }

    public PDQHashingBridge(String str) {
        this.mHybridData = initHybrid(str);
    }
}
