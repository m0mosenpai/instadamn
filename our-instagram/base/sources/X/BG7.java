package X;

/* loaded from: classes5.dex */
public abstract class BG7 {
    public static final float[] A00;

    static {
        float f;
        float f2;
        float f3;
        float f4;
        float[] fArr = new float[101];
        A00 = fArr;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < 100; i++) {
            float f7 = i / 100.0f;
            float f8 = 1.0f;
            while (true) {
                f = ((f8 - f5) / 2.0f) + f5;
                f2 = 1.0f - f;
                f3 = f * 3.0f * f2;
                f4 = f * f * f;
                float f9 = (((f2 * 0.175f) + (0.35000002f * f)) * f3) + f4;
                if (Math.abs(f9 - f7) < 1.0E-5d) {
                    break;
                } else if (f9 > f7) {
                    f8 = f;
                } else {
                    f5 = f;
                }
            }
            fArr[i] = (f3 * ((f2 * 0.5f) + f)) + f4;
            float f10 = 1.0f;
            while (true) {
                float f11 = ((f10 - f6) / 2.0f) + f6;
                float f12 = 1.0f - f11;
                float f13 = (((f12 * 0.5f) + f11) * 3.0f * f11 * f12) + (f11 * f11 * f11);
                if (Math.abs(f13 - f7) >= 1.0E-5d) {
                    if (f13 > f7) {
                        f10 = f11;
                    } else {
                        f6 = f11;
                    }
                }
            }
        }
        fArr[100] = 1.0f;
    }
}
