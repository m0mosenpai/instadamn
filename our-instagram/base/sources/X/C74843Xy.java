package X;

import java.util.Arrays;

/* renamed from: X.3Xy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74843Xy {
    public static final C74843Xy A02 = new C74843Xy();
    public final float[] A01 = new float[C05F.A00(8).length];
    public Integer A00 = C05F.A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C74843Xy) {
            C74843Xy c74843Xy = (C74843Xy) obj;
            return Arrays.equals(this.A01, c74843Xy.A01) && this.A00 == c74843Xy.A00;
        }
        return false;
    }

    public static void A01(C74843Xy c74843Xy) {
        Integer num;
        if (c74843Xy != A02) {
            if (c74843Xy.A02()) {
                num = C05F.A00;
            } else {
                float[] fArr = c74843Xy.A01;
                float f = fArr[0];
                float f2 = fArr[2];
                if (f == f2) {
                    float f3 = fArr[6];
                    if (f3 == fArr[4] && f == f3) {
                        float f4 = fArr[1];
                        if (f4 == fArr[3]) {
                            float f5 = fArr[7];
                            if (f5 == fArr[5] && f4 == f5) {
                                num = C05F.A01;
                            }
                        }
                    }
                }
                if (c74843Xy.A03()) {
                    num = C05F.A0Y;
                } else if (f == f2 && fArr[1] == fArr[3] && fArr[6] == fArr[4] && fArr[7] == fArr[5]) {
                    num = C05F.A0C;
                } else if (f == fArr[6] && fArr[1] == fArr[7] && f2 == fArr[4] && fArr[3] == fArr[5]) {
                    num = C05F.A0N;
                } else {
                    num = C05F.A0j;
                }
            }
            c74843Xy.A00 = num;
        }
    }

    private boolean A02() {
        float[] fArr = this.A01;
        float f = fArr[0];
        if (f == fArr[2]) {
            float f2 = fArr[6];
            if (f2 == fArr[4] && f == f2) {
                float f3 = fArr[1];
                if (f3 == fArr[3]) {
                    float f4 = fArr[7];
                    if (f4 == fArr[5] && f3 == f4 && f == f3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean A03() {
        float[] fArr = this.A01;
        if (fArr[0] == fArr[1] && fArr[2] == fArr[3] && fArr[4] == fArr[5] && fArr[6] == fArr[7]) {
            return true;
        }
        return false;
    }

    public final C74843Xy A04() {
        C74843Xy c74843Xy = new C74843Xy();
        float[] fArr = this.A01;
        System.arraycopy(fArr, 0, c74843Xy.A01, 0, fArr.length);
        c74843Xy.A00 = this.A00;
        return c74843Xy;
    }

    public final void A06(float f) {
        if (this != A02) {
            Arrays.fill(this.A01, f);
            this.A00 = C05F.A00;
        }
    }

    public final void A07(float f, float f2, float f3, float f4) {
        if (this != A02) {
            float[] fArr = this.A01;
            Integer num = C05F.A00;
            fArr[0] = f;
            fArr[1] = f;
            Integer num2 = C05F.A0C;
            fArr[2] = f2;
            Integer num3 = C05F.A0N;
            fArr[3] = f2;
            Integer num4 = C05F.A0Y;
            fArr[4] = f4;
            fArr[5] = f4;
            fArr[6] = f3;
            fArr[7] = f3;
            if (!A02()) {
                if (A03()) {
                    num = num4;
                } else {
                    float f5 = fArr[0];
                    float f6 = fArr[2];
                    if (f5 == f6 && fArr[1] == fArr[3] && fArr[6] == fArr[4] && f3 == fArr[5]) {
                        num = num2;
                    } else if (f5 == fArr[6] && fArr[1] == f3 && f6 == fArr[4] && fArr[3] == fArr[5]) {
                        num = num3;
                    } else {
                        throw new IllegalStateException("Corner radii type checking is failing");
                    }
                }
            }
            this.A00 = num;
        }
    }

    public final void A08(C74843Xy c74843Xy, Integer num) {
        int length;
        float[] fArr = c74843Xy.A01;
        if (this != A02) {
            int A00 = A00(num);
            switch (num.intValue()) {
                case 0:
                    length = fArr.length;
                    break;
                case 1:
                case 4:
                    length = fArr.length / 2;
                    break;
                case 2:
                case 3:
                default:
                    length = fArr.length / 4;
                    break;
            }
            System.arraycopy(fArr, A00, this.A01, A00, length);
            A01(this);
        }
    }

    public final int hashCode() {
        String str;
        int hashCode = Arrays.hashCode(this.A01) * 31;
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 1:
                str = "X_ARE_SAME_AND_Y_ARE_SAME";
                break;
            case 2:
                str = "TOP_SAME_X_Y_AND_BOTTOM_SAME_X_Y";
                break;
            case 3:
                str = "LEFT_SAME_X_Y_AND_RIGHT_SAME_X_Y";
                break;
            case 4:
                str = "EACH_CORNER_SAME_X_Y";
                break;
            case 5:
                str = "EVERY_VALUE_DIFFERENT";
                break;
            default:
                str = "ALL_SAME";
                break;
        }
        return hashCode + str.hashCode() + intValue;
    }

    public static int A00(Integer num) {
        Integer num2;
        switch (num.intValue()) {
            case 3:
                num2 = C05F.A0C;
                break;
            case 4:
            case 5:
                num2 = C05F.A0u;
                break;
            case 6:
                num2 = C05F.A0Y;
                break;
            default:
                num2 = C05F.A00;
                break;
        }
        return C7R3.A00(num2);
    }

    public final C74843Xy A05() {
        C74843Xy A04 = A04();
        float[] fArr = A04.A01;
        float f = fArr[0];
        for (int i = 1; i < fArr.length; i++) {
            float f2 = fArr[i];
            if (f2 > f) {
                f = f2;
            }
        }
        A04.A06(f);
        return A04;
    }
}
