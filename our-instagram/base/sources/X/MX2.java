package X;

import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes9.dex */
public abstract class MX2 {
    public static Rect A02(Rect rect, float f, int i, int i2, int i3) {
        if (i3 % 180 == 0) {
            return A03(rect, f, i, i2, i3);
        }
        return A03(rect, 1.0f / f, i, i2, i3);
    }

    public static Rect A04(RectF rectF) {
        return new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public static RectF A06(Rect rect) {
        return new RectF(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static C3AY A08(float f, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        int i5;
        int i6;
        if (i3 % 180 != 0) {
            i2 = i;
            i = i2;
        }
        if (!z2 && i <= i2) {
            i6 = (int) (i4 * f);
        } else {
            if (z) {
                f = Math.min(i / i2, 1.91f);
            }
            float f2 = i4;
            if (f >= 1.0f) {
                i5 = (int) (f2 / f);
            } else {
                int i7 = (int) (f2 * f);
                i5 = i4;
                i4 = i7;
            }
            i6 = i4;
            i4 = i5;
        }
        return new C3AY(Integer.valueOf(i6), Integer.valueOf(i4));
    }

    public static Rect A00(float f, int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        Rect A0U = AbstractC166987dD.A0U();
        int i6 = i3 % 180;
        if (i6 != 0) {
            i2 = i;
            i = i2;
        }
        float f2 = i;
        float f3 = i2;
        float f4 = f2 / f3;
        if (i > i2) {
            if (z) {
                f = Math.min(f4, 1.91f);
            }
            int i7 = (int) (f3 * f);
            int i8 = (i - i7) / 2;
            i4 = Math.max(i8, 0);
            A0U.left = i4;
            A0U.top = 0;
            i5 = Math.min(i8 + i7, i);
        } else if (f4 > f) {
            int i9 = (int) (f3 * f);
            i4 = (i - i9) / 2;
            A0U.left = i4;
            A0U.top = 0;
            i5 = i9 + i4;
        } else {
            if (f4 < f) {
                int i10 = (int) (f2 / f);
                A0U.left = 0;
                int i11 = (i2 - i10) / 2;
                A0U.top = i11;
                A0U.right = i;
                int i12 = i10 + i11;
                A0U.bottom = i12;
                if (i6 != 0) {
                    A0U.left = i11;
                    A0U.top = 0;
                    A0U.right = i12;
                    A0U.bottom = i;
                    return A0U;
                }
                return A0U;
            }
            A0U = new Rect(0, 0, i, i2);
            if (i6 != 0) {
                A0U.right = i2;
                A0U.bottom = i;
                return A0U;
            }
            return A0U;
        }
        A0U.right = i5;
        A0U.bottom = i2;
        if (i6 != 0) {
            A0U.top = i4;
            A0U.left = 0;
            A0U.bottom = i5;
            A0U.right = i2;
        }
        return A0U;
    }

    public static Rect A01(Rect rect) {
        if (rect.width() == rect.height()) {
            return new Rect(rect);
        }
        if (rect.width() > rect.height()) {
            int width = rect.left + ((rect.width() - rect.height()) / 2);
            return AbstractC166987dD.A0V(width, rect.top, rect.height() + width, rect.bottom);
        }
        int height = rect.top + ((rect.height() - rect.width()) / 2);
        return AbstractC166987dD.A0V(rect.left, height, rect.right, rect.width() + height);
    }

    public static Rect A03(Rect rect, float f, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        Rect A0U = AbstractC166987dD.A0U();
        if (i > i2) {
            int i8 = (rect.left + rect.right) / 2;
            i5 = (int) (i2 * f);
            if (i5 > i) {
                i4 = (int) (i / f);
                i5 = i;
            } else {
                i4 = i2;
            }
            int i9 = i5 / 2;
            i7 = i8 - i9;
            int i10 = i8 + i9;
            if (i7 < 0) {
                i10 = i5;
                i7 = 0;
            } else if (i10 > i) {
                i7 = i - i5;
                i10 = i;
            }
            A0U.left = i7;
            A0U.right = i10;
            A0U.top = 0;
            i6 = 0;
            A0U.bottom = i4;
        } else {
            int i11 = (rect.top + rect.bottom) / 2;
            i4 = (int) (i / f);
            if (i4 > i2) {
                i5 = (int) (i2 * f);
                i4 = i2;
            } else {
                i5 = i;
            }
            int i12 = i4 / 2;
            i6 = i11 - i12;
            int i13 = i11 + i12;
            if (i6 < 0) {
                i13 = i4;
                i6 = 0;
            } else if (i13 > i2) {
                i6 = i2 - i4;
                i13 = i2;
            }
            A0U.left = 0;
            i7 = 0;
            A0U.right = i5;
            A0U.top = i6;
            A0U.bottom = i13;
        }
        if (i3 == 90 || i3 == 270) {
            int i14 = i - i7;
            A0U.right = i14;
            int i15 = i2 - i6;
            A0U.bottom = i15;
            A0U.left = i14 - i5;
            A0U.top = i15 - i4;
        }
        return A0U;
    }

    public static Rect A05(RectF rectF, int i, int i2, int i3, int i4) {
        Rect A0U = AbstractC166987dD.A0U();
        double d = i / i3;
        int round = (int) Math.round(rectF.left * d);
        A0U.left = round;
        int round2 = (int) Math.round(rectF.right * d);
        A0U.right = round2;
        double d2 = i2 / i4;
        int round3 = (int) Math.round(rectF.top * d2);
        A0U.top = round3;
        int round4 = (int) Math.round(rectF.bottom * d2);
        A0U.bottom = round4;
        A0U.left = Math.max(0, round);
        A0U.right = Math.min(i, round2);
        A0U.top = Math.max(0, round3);
        A0U.bottom = Math.min(i2, round4);
        return A0U;
    }

    public static RectF A07(Rect rect, int i, int i2) {
        RectF A0X = AbstractC166987dD.A0X();
        float f = 1.0f / i;
        float f2 = rect.left * f;
        A0X.left = f2;
        float f3 = rect.right * f;
        A0X.right = f3;
        float f4 = 1.0f / i2;
        float f5 = rect.top * f4;
        A0X.top = f5;
        float f6 = rect.bottom * f4;
        A0X.bottom = f6;
        A0X.left = Math.max(0.0f, f2);
        A0X.right = Math.min(1.0f, f3);
        A0X.top = Math.max(0.0f, f5);
        A0X.bottom = Math.min(1.0f, f6);
        return A0X;
    }
}
