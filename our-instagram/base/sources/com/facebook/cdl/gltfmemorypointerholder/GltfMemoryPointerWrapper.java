package com.facebook.cdl.gltfmemorypointerholder;

import X.C09170dP;
import X.C53668NoJ;
import com.facebook.jni.HybridData;

/* loaded from: classes9.dex */
public final class GltfMemoryPointerWrapper {
    public static final C53668NoJ Companion = new Object();
    public final HybridData mHybridData = initHybrid();

    private final native HybridData initHybrid();

    public final native boolean hasColorizationData();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.NoJ] */
    static {
        C09170dP.A0C("gltfholdernew");
    }
}
