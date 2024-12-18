package com.facebook.msys.mci;

import X.C53882dS;
import android.graphics.Bitmap;

/* loaded from: classes.dex */
public class PSNRCalculator {
    public static native double[] computePSNRNative(Bitmap bitmap, Bitmap bitmap2);

    static {
        C53882dS.A00();
    }
}
