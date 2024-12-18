package X;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class AKZ {
    public static float[] A02(C138856Qq[] c138856QqArr) {
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = 0;
        while (true) {
            int length = c138856QqArr.length;
            if (i < length) {
                C138856Qq c138856Qq = c138856QqArr[i % length];
                i++;
                C138856Qq c138856Qq2 = c138856QqArr[i % length];
                double d = c138856Qq.A00;
                double d2 = c138856Qq2.A01;
                double d3 = c138856Qq2.A00;
                double d4 = c138856Qq.A01;
                double d5 = (d * d2) - (d3 * d4);
                f = (float) (f + d5);
                f2 = (float) (f2 + ((d + d3) * d5));
                f3 = (float) (f3 + ((d4 + d2) * d5));
            } else {
                float f4 = (f / 2.0f) * 6.0f;
                return new float[]{f2 / f4, f3 / f4};
            }
        }
    }

    public static double A00(C138856Qq c138856Qq, C138856Qq c138856Qq2, C138856Qq c138856Qq3) {
        C138856Qq A00 = C138856Qq.A00(c138856Qq, c138856Qq2);
        return (c138856Qq3.A00 * A00.A01) - (c138856Qq3.A01 * A00.A00);
    }

    public static boolean A01(C138856Qq c138856Qq, C138856Qq c138856Qq2, C138856Qq c138856Qq3) {
        return AbstractC167007dF.A1O((A00(c138856Qq3, c138856Qq, C138856Qq.A00(c138856Qq2, c138856Qq)) > (-4.9E-324d) ? 1 : (A00(c138856Qq3, c138856Qq, C138856Qq.A00(c138856Qq2, c138856Qq)) == (-4.9E-324d) ? 0 : -1)));
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, X.6Qq] */
    /* JADX WARN: Type inference failed for: r30v0, types: [java.lang.Object, X.6Qq] */
    public static C138856Qq[] A03(C138856Qq[] c138856QqArr, double d) {
        C138856Qq[] c138856QqArr2 = (C138856Qq[]) c138856QqArr.clone();
        int i = 0;
        while (i < 4) {
            ?? obj = new Object();
            ?? obj2 = new Object();
            C138856Qq c138856Qq = c138856QqArr[i];
            i++;
            C138856Qq c138856Qq2 = c138856QqArr[i % 4];
            double[] dArr = {-1.0d, -1.0d, 1.0d, 1.0d};
            double[] dArr2 = {-1.0d, 1.0d, -1.0d, 1.0d};
            int i2 = 0;
            while (true) {
                double d2 = dArr[i2];
                double d3 = dArr2[i2];
                double d4 = d2 * d;
                if (A01(c138856Qq, c138856Qq2, new C138856Qq(c138856Qq.A00 + d4, c138856Qq.A01))) {
                    double d5 = d3 * d;
                    if (A01(c138856Qq, c138856Qq2, new C138856Qq(c138856Qq.A00, c138856Qq.A01 + d5)) && A01(c138856Qq, c138856Qq2, new C138856Qq(c138856Qq.A00 + d4, c138856Qq.A01 + d5))) {
                        obj.A00 = c138856Qq.A00;
                        obj.A01 = c138856Qq.A01;
                        obj2.A00 = c138856Qq2.A00;
                        obj2.A01 = c138856Qq2.A01;
                        double d6 = d4 / 2.0d;
                        obj.A00 = c138856Qq.A00 + d6;
                        double d7 = d5 / 2.0d;
                        obj.A01 = c138856Qq.A01 + d7;
                        obj2.A00 = c138856Qq2.A00 + d6;
                        obj2.A01 = c138856Qq2.A01 + d7;
                        break;
                    }
                }
                i2++;
                if (i2 >= 4) {
                    break;
                }
            }
            ArrayList A1E = AbstractC166987dD.A1E();
            int i3 = 0;
            while (true) {
                int length = c138856QqArr2.length;
                if (i3 < length) {
                    C138856Qq c138856Qq3 = c138856QqArr2[i3];
                    i3++;
                    C138856Qq c138856Qq4 = c138856QqArr2[i3 % length];
                    if (A00(obj2, obj, C138856Qq.A00(c138856Qq3, obj)) * A00(obj2, obj, C138856Qq.A00(c138856Qq4, obj)) < 0.0d) {
                        double A00 = A00(c138856Qq4, c138856Qq3, C138856Qq.A00(obj, obj2));
                        double d8 = c138856Qq3.A00;
                        double d9 = c138856Qq4.A01;
                        double d10 = c138856Qq3.A01;
                        double d11 = c138856Qq4.A00;
                        double d12 = (d8 * d9) - (d10 * d11);
                        double d13 = obj.A00;
                        double d14 = obj2.A00;
                        double d15 = d12 * (d13 - d14);
                        double d16 = obj2.A01;
                        double d17 = obj.A01;
                        double d18 = (d13 * d16) - (d17 * d14);
                        A1E.add(new C138856Qq((d15 - (d18 * (d8 - d11))) / A00, ((d18 * (d9 - d10)) - (d12 * (d16 - d17))) / A00));
                    }
                    if (A01(obj, obj2, c138856Qq4)) {
                        A1E.add(new C138856Qq(c138856Qq4.A00, c138856Qq4.A01));
                    }
                }
            }
            c138856QqArr2 = (C138856Qq[]) A1E.toArray(new C138856Qq[0]);
        }
        return c138856QqArr2;
    }
}
