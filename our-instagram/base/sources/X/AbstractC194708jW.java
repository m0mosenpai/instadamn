package X;

import java.util.Arrays;
import java.util.Comparator;

/* renamed from: X.8jW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC194708jW {
    public static double[] A00;

    public static final Integer A00() {
        double[] dArr;
        double[] dArr2 = A00;
        if (dArr2 == null) {
            dArr2 = C194718jX.A00.A00();
            A00 = dArr2;
        }
        String str = "deviceInfo";
        if (dArr2 != null) {
            if (AbstractC194728jY.A00 == null || (dArr = AbstractC194728jY.A01) == null || !Arrays.equals(dArr, dArr2)) {
                AbstractC194728jY.A01 = dArr2;
                int length = dArr2.length;
                double[] dArr3 = new double[length];
                double[] dArr4 = AbstractC194738jZ.A01;
                double[] dArr5 = AbstractC194738jZ.A02;
                for (int i = 0; i < length; i++) {
                    dArr3[i] = (dArr2[i] - dArr4[i]) / dArr5[i];
                }
                double[][] dArr6 = AbstractC194738jZ.A04;
                int i2 = 0;
                if (length == 8) {
                    int length2 = dArr6[0].length;
                    double[] dArr7 = new double[length2];
                    for (int i3 = 0; i3 < length2; i3++) {
                        double d = 0.0d;
                        int i4 = 0;
                        do {
                            d += dArr3[i4] * dArr6[i4][i3];
                            i4++;
                        } while (i4 < length);
                        dArr7[i3] = d;
                    }
                    Integer[] numArr = AbstractC194728jY.A02;
                    final double[][] dArr8 = AbstractC194738jZ.A03;
                    final double[] dArr9 = AbstractC194738jZ.A00;
                    Object[] copyOf = Arrays.copyOf(dArr8, 11);
                    C14360o3.A07(copyOf);
                    double[][] dArr10 = (double[][]) copyOf;
                    int length3 = dArr10.length;
                    if (length3 > 1) {
                        Arrays.sort(dArr10, new Comparator() { // from class: X.8ja
                            @Override // java.util.Comparator
                            public final int compare(Object obj, Object obj2) {
                                double[] dArr11 = dArr9;
                                double[][] dArr12 = dArr8;
                                return C2BS.A00(Double.valueOf(dArr11[AbstractC009903n.A02(dArr12, obj2)]), Double.valueOf(dArr11[AbstractC009903n.A02(dArr12, obj)]));
                            }
                        });
                    }
                    double d2 = Double.MAX_VALUE;
                    for (int i5 = 0; i5 < length3; i5++) {
                        double[] dArr11 = dArr10[i5];
                        int length4 = dArr7.length;
                        double d3 = 0.0d;
                        for (int i6 = 0; i6 < length4; i6++) {
                            double d4 = dArr7[i6] - dArr11[i6];
                            d3 += d4 * d4;
                        }
                        if (d3 < d2) {
                            i2 = i5;
                            d2 = d3;
                        }
                    }
                    AbstractC194728jY.A00 = numArr[i2];
                } else {
                    throw new IllegalArgumentException("Array size must match matrix row count.");
                }
            }
            Integer num = AbstractC194728jY.A00;
            if (num == null) {
                str = "deviceClass";
            } else {
                return num;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
