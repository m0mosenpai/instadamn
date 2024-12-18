package com.facebook.flexlayout;

import X.C09170dP;
import com.facebook.flexlayout.layoutoutput.LayoutOutput;

/* loaded from: classes3.dex */
public class FlexLayoutNative {
    public static native void jni_calculateLayout(float[] fArr, float[][] fArr2, float f, float f2, float f3, float f4, float f5, float f6, LayoutOutput layoutOutput, FlexLayoutNativeMeasureCallback flexLayoutNativeMeasureCallback);

    static {
        C09170dP.A0C("flexlayout");
    }
}
