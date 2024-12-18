package com.facebook.imagepipeline.nativecode;

import X.C09270dc;
import android.graphics.Bitmap;

/* loaded from: classes11.dex */
public class NativeBlurFilter {
    public static final NativeBlurFilter $redex_init_class = null;

    public static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);

    static {
        C09270dc.A01("native-filters");
    }
}
