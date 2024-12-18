package X;

import android.graphics.Bitmap;

/* renamed from: X.S7w, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract /* synthetic */ class AbstractC62351S7w {
    public static final /* synthetic */ int[] A00;

    static {
        int[] iArr = new int[Bitmap.Config.values().length];
        try {
            MSY.A1I(Bitmap.Config.ARGB_8888, iArr);
        } catch (NoSuchFieldError unused) {
        }
        try {
            MSY.A1J(Bitmap.Config.RGB_565, iArr);
        } catch (NoSuchFieldError unused2) {
        }
        try {
            MSY.A1K(Bitmap.Config.ALPHA_8, iArr);
        } catch (NoSuchFieldError unused3) {
        }
        A00 = iArr;
    }
}
