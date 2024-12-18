package com.instagram.jni.igblur;

import X.AnonymousClass411;
import X.C09170dP;
import com.facebook.jni.HybridData;

/* loaded from: classes2.dex */
public final class IgBlur {
    public static final AnonymousClass411 Companion = new Object();
    public final HybridData mHybridData = initHybrid();

    public static final native HybridData initHybrid();

    public final native void functionToBlur(Object obj, int i, int i2);

    public final native void iterativeBoxBlur(Object obj, int i, int i2);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.411, java.lang.Object] */
    static {
        C09170dP.A0C("igblur");
    }
}
