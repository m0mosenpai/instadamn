package X;

import android.graphics.drawable.GradientDrawable;

/* renamed from: X.O0d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract /* synthetic */ class AbstractC54345O0d {
    public static final /* synthetic */ int[] A00;

    static {
        int[] iArr = new int[GradientDrawable.Orientation.values().length];
        try {
            MSY.A1I(GradientDrawable.Orientation.BOTTOM_TOP, iArr);
        } catch (NoSuchFieldError unused) {
        }
        try {
            MSY.A1J(GradientDrawable.Orientation.RIGHT_LEFT, iArr);
        } catch (NoSuchFieldError unused2) {
        }
        try {
            MSY.A1K(GradientDrawable.Orientation.BL_TR, iArr);
        } catch (NoSuchFieldError unused3) {
        }
        try {
            MSY.A1L(GradientDrawable.Orientation.BR_TL, iArr);
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[GradientDrawable.Orientation.TOP_BOTTOM.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[GradientDrawable.Orientation.LEFT_RIGHT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[GradientDrawable.Orientation.TR_BL.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[GradientDrawable.Orientation.TL_BR.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        A00 = iArr;
    }
}
