package com.facebook.cvat.ctsmartcreation.ctautoenhance;

import X.C09170dP;
import X.C72546XgF;
import com.facebook.jni.HybridData;

/* loaded from: classes12.dex */
public final class CTAutoEnhance {
    public static final C72546XgF Companion = new Object();
    public final HybridData mHybridData = initHybridNative(4, 30, 0.8f);

    private final native HybridData initHybridNative(int i, int i2, float f);

    private final native CTAutoEnhanceControlValues nativeAnalyze(int i, int i2, int i3, int i4);

    private final native String nativeGetProcessingMetricsJSON();

    private final native void nativeRender(int i, int i2, int i3, int i4, int i5, int i6);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.XgF] */
    static {
        C09170dP.A0C("ctautoenhance-native");
    }
}
