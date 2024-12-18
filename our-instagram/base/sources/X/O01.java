package X;

import android.graphics.drawable.GradientDrawable;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class O01 {
    public static final /* synthetic */ int[] A00;

    static {
        int[] iArr = new int[GradientDrawable.Orientation.values().length];
        try {
            MSY.A1I(GradientDrawable.Orientation.TOP_BOTTOM, iArr);
        } catch (NoSuchFieldError unused) {
        }
        try {
            MSY.A1J(GradientDrawable.Orientation.TR_BL, iArr);
        } catch (NoSuchFieldError unused2) {
        }
        try {
            MSY.A1K(GradientDrawable.Orientation.RIGHT_LEFT, iArr);
        } catch (NoSuchFieldError unused3) {
        }
        try {
            MSY.A1L(GradientDrawable.Orientation.BR_TL, iArr);
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[GradientDrawable.Orientation.BOTTOM_TOP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[GradientDrawable.Orientation.BL_TR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[GradientDrawable.Orientation.LEFT_RIGHT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[GradientDrawable.Orientation.TL_BR.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        A00 = iArr;
    }
}
