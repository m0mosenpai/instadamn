package X;

/* renamed from: X.6As, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C135436As {
    public static final C135446At A00 = new C135446At();

    public static C102884kP A02(C2W2 c2w2) {
        if (c2w2 instanceof C102884kP) {
            C102884kP c102884kP = (C102884kP) c2w2;
            if (c102884kP.A08(132) != null && c102884kP.A08(132).A05 == 13368) {
                return c102884kP.A08(132);
            }
            return null;
        }
        return null;
    }

    public static void A03(C135476Aw c135476Aw, Integer num, String str) {
        float A01;
        float[] fArr;
        int i;
        try {
            if (str.endsWith("%")) {
                A01 = C6BE.A00(str);
                if (Float.compare(A01, Float.NaN) != 0) {
                    C135476Aw.A00(c135476Aw, 3);
                    fArr = c135476Aw.A01;
                    int i2 = c135476Aw.A00;
                    int i3 = i2 + 1;
                    c135476Aw.A00 = i3;
                    fArr[i2] = 8.0f;
                    i = i3 + 1;
                    c135476Aw.A00 = i;
                    fArr[i3] = C6BG.A00(num);
                } else {
                    return;
                }
            } else {
                A01 = C6BE.A01(str);
                if (Float.compare(A01, Float.NaN) != 0) {
                    C135476Aw.A00(c135476Aw, 3);
                    fArr = c135476Aw.A01;
                    int i4 = c135476Aw.A00;
                    int i5 = i4 + 1;
                    c135476Aw.A00 = i5;
                    fArr[i4] = 7.0f;
                    i = i5 + 1;
                    c135476Aw.A00 = i;
                    fArr[i5] = C6BG.A00(num);
                } else {
                    return;
                }
            }
            c135476Aw.A00 = i + 1;
            fArr[i] = A01;
        } catch (C41M e) {
            AbstractC25241Le.A00(null, "BloksFlexLayoutProvider", "Error parsing padding value", e);
        }
    }

    public static void A04(C135446At c135446At, Integer num, String str) {
        float A01;
        float[] fArr;
        int i;
        try {
            if (str.endsWith("%")) {
                A01 = C6BE.A00(str);
                if (!C135446At.A01(A01)) {
                    C135446At.A00(c135446At, 3);
                    fArr = c135446At.A01;
                    int i2 = c135446At.A00;
                    int i3 = i2 + 1;
                    c135446At.A00 = i3;
                    fArr[i2] = 25.0f;
                    i = i3 + 1;
                    c135446At.A00 = i;
                    fArr[i3] = C6BG.A00(num);
                } else {
                    return;
                }
            } else {
                if (str.equals("auto")) {
                    C135446At.A00(c135446At, 2);
                    float[] fArr2 = c135446At.A01;
                    int i4 = c135446At.A00;
                    int i5 = i4 + 1;
                    c135446At.A00 = i5;
                    fArr2[i4] = 26.0f;
                    c135446At.A00 = i5 + 1;
                    fArr2[i5] = C6BG.A00(num);
                    return;
                }
                A01 = C6BE.A01(str);
                if (!C135446At.A01(A01)) {
                    C135446At.A00(c135446At, 3);
                    fArr = c135446At.A01;
                    int i6 = c135446At.A00;
                    int i7 = i6 + 1;
                    c135446At.A00 = i7;
                    fArr[i6] = 24.0f;
                    i = i7 + 1;
                    c135446At.A00 = i;
                    fArr[i7] = C6BG.A00(num);
                } else {
                    return;
                }
            }
            c135446At.A00 = i + 1;
            fArr[i] = A01;
        } catch (C41M e) {
            AbstractC25241Le.A00(null, "BloksFlexLayoutProvider", "Error parsing margin value", e);
        }
    }

    public static void A05(C135446At c135446At, Integer num, String str) {
        float A01;
        float[] fArr;
        int i;
        try {
            if (str.endsWith("%")) {
                A01 = C6BE.A00(str);
                if (!C135446At.A01(A01)) {
                    C135446At.A00(c135446At, 3);
                    fArr = c135446At.A01;
                    int i2 = c135446At.A00;
                    int i3 = i2 + 1;
                    c135446At.A00 = i3;
                    fArr[i2] = 28.0f;
                    i = i3 + 1;
                    c135446At.A00 = i;
                    fArr[i3] = C6BG.A00(num);
                } else {
                    return;
                }
            } else {
                A01 = C6BE.A01(str);
                if (!C135446At.A01(A01)) {
                    C135446At.A00(c135446At, 3);
                    fArr = c135446At.A01;
                    int i4 = c135446At.A00;
                    int i5 = i4 + 1;
                    c135446At.A00 = i5;
                    fArr[i4] = 27.0f;
                    i = i5 + 1;
                    c135446At.A00 = i;
                    fArr[i5] = C6BG.A00(num);
                } else {
                    return;
                }
            }
            c135446At.A00 = i + 1;
            fArr[i] = A01;
        } catch (C41M e) {
            AbstractC25241Le.A00(null, "BloksFlexLayoutProvider", "Error parsing position value", e);
        }
    }

    public static float A00(C102884kP c102884kP, float f, int i, boolean z) {
        String A0L = c102884kP.A0L(i);
        if (A0L == null || (z && A0L.equals("auto"))) {
            return Float.NaN;
        }
        try {
            if (A0L.endsWith("%")) {
                return C6BE.A00(A0L) * 0.01f * f;
            }
            return C6BE.A01(A0L);
        } catch (C41M e) {
            AbstractC25241Le.A00(null, "BloksFlexLayoutProvider", "Error parsing size dimension value", e);
            return Float.NaN;
        }
    }

    public static float A01(C102884kP c102884kP, int i) {
        String A0L = c102884kP.A0L(i);
        float f = Float.NaN;
        if (A0L == null) {
            return Float.NaN;
        }
        try {
            f = C6BE.A01(A0L);
            return f;
        } catch (C41M e) {
            AbstractC25241Le.A00(null, "BloksFlexLayoutProvider", "Error parsing padding value", e);
            return f;
        }
    }
}
