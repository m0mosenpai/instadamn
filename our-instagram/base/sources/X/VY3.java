package X;

import android.widget.ImageView;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class VY3 {
    public static final /* synthetic */ int[] A00;

    static {
        int[] iArr = new int[ImageView.ScaleType.values().length];
        A00 = iArr;
        try {
            MSY.A1I(ImageView.ScaleType.CENTER, iArr);
        } catch (NoSuchFieldError unused) {
        }
        try {
            MSY.A1J(ImageView.ScaleType.CENTER_CROP, iArr);
        } catch (NoSuchFieldError unused2) {
        }
        try {
            MSY.A1K(ImageView.ScaleType.CENTER_INSIDE, iArr);
        } catch (NoSuchFieldError unused3) {
        }
        try {
            MSY.A1L(ImageView.ScaleType.FIT_CENTER, iArr);
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ImageView.ScaleType.FIT_START.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ImageView.ScaleType.FIT_END.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[ImageView.ScaleType.MATRIX.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
