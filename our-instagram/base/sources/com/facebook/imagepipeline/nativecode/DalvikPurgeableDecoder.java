package com.facebook.imagepipeline.nativecode;

import X.C09270dc;
import X.C14360o3;
import X.SUZ;
import X.Vh1;
import android.graphics.Bitmap;

/* loaded from: classes10.dex */
public abstract class DalvikPurgeableDecoder {
    public static final byte[] EOI;
    public final Vh1 mUnpooledBitmapsCounter;

    public static native void nativePinBitmap(Bitmap bitmap);

    static {
        C09270dc.A01("imagepipeline");
        EOI = new byte[]{-1, -39};
    }

    public DalvikPurgeableDecoder() {
        if (SUZ.A01 == null) {
            synchronized (SUZ.class) {
                if (SUZ.A01 == null) {
                    SUZ.A01 = new Vh1(SUZ.A00);
                }
            }
        }
        Vh1 vh1 = SUZ.A01;
        C14360o3.A0A(vh1);
        this.mUnpooledBitmapsCounter = vh1;
    }
}
