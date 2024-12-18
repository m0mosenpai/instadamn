package com.facebook.imagepipeline.nativecode;

import X.AbstractC167007dF;
import X.C09270dc;
import X.C0Hf;
import android.graphics.Bitmap;

/* loaded from: classes11.dex */
public class Bitmaps {
    public static native void nativeCopyBitmap(Bitmap bitmap, int i, Bitmap bitmap2, int i2, int i3);

    static {
        C09270dc.A01("imagepipeline");
    }

    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        boolean z = true;
        C0Hf.A00(Boolean.valueOf(AbstractC167007dF.A1X(bitmap2.getConfig(), bitmap.getConfig())));
        C0Hf.A00(Boolean.valueOf(bitmap.isMutable()));
        C0Hf.A00(Boolean.valueOf(AbstractC167007dF.A1P(bitmap.getWidth(), bitmap2.getWidth())));
        if (bitmap.getHeight() != bitmap2.getHeight()) {
            z = false;
        }
        C0Hf.A00(Boolean.valueOf(z));
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }
}
