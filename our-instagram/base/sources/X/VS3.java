package X;

/* loaded from: classes11.dex */
public abstract class VS3 {
    public static final float A00(float[] fArr, int i) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5 = i / 120.0f;
        float[] fArr2 = AbstractC68647VZf.A09;
        int i2 = 0;
        do {
            if (fArr2[i2] <= f5) {
                float f6 = fArr2[i2 + 1];
                if (f6 >= f5) {
                    Integer num = AbstractC68647VZf.A0Q[i2];
                    int[] iArr = AbstractC68647VZf.A0R[i2];
                    float f7 = fArr2[i2];
                    float f8 = f5 - f7;
                    float f9 = fArr[iArr[0]];
                    float f10 = fArr[iArr[1]] - f9;
                    float f11 = f6 - f7;
                    if (num != null) {
                        int intValue = num.intValue();
                        if (intValue != 0) {
                            if (intValue != 2) {
                                if (intValue != 3) {
                                    if (intValue == 1) {
                                        f3 = 2.0f;
                                        f = f8 / (f11 / 2.0f);
                                        if (f < 1.0f) {
                                            f10 /= 2.0f;
                                        } else {
                                            f4 = f - 2.0f;
                                            f10 /= 2.0f;
                                        }
                                    } else {
                                        return 0.0f;
                                    }
                                } else {
                                    f3 = 1.0f;
                                    f4 = (f8 / f11) - 1.0f;
                                }
                                f2 = f10 * ((f4 * f4 * f4) + f3);
                                return f9 + f2;
                            }
                            f = f8 / f11;
                            f2 = f10 * f * f * f;
                            return f9 + f2;
                        }
                        return f9 + ((f8 * f10) / f11);
                    }
                    return 0.0f;
                }
            }
            i2++;
        } while (i2 < 9);
        return fArr[5];
    }
}
