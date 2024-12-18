package X;

import android.graphics.Bitmap;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class S6B {
    public static final /* synthetic */ int[] A00;

    static {
        int[] iArr = new int[Bitmap.Config.values().length];
        A00 = iArr;
        try {
            MSY.A1I(Bitmap.Config.ALPHA_8, iArr);
        } catch (NoSuchFieldError unused) {
        }
        try {
            MSY.A1J(Bitmap.Config.RGB_565, iArr);
        } catch (NoSuchFieldError unused2) {
        }
        try {
            MSY.A1K(Bitmap.Config.ARGB_4444, iArr);
        } catch (NoSuchFieldError unused3) {
        }
        try {
            MSY.A1L(Bitmap.Config.RGBA_F16, iArr);
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Bitmap.Config.ARGB_8888.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
