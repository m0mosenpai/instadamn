package com.facebook.cvat.ctsmartcreation.ctautoenhance;

import X.C09170dP;
import X.C39711Hjh;
import com.facebook.jni.HybridData;

/* loaded from: classes7.dex */
public final class CTColorEnhance {
    public static final C39711Hjh Companion = new Object();
    public final HybridData mHybridData = initHybridNative();

    private final native HybridData initHybridNative();

    private final native void nativeRender(int i, int i2, int i3, int i4, int i5, int i6, float f);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.Hjh] */
    static {
        C09170dP.A0C("ctcolorenhance-native");
    }
}
