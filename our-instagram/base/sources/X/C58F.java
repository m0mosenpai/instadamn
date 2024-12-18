package X;

import java.util.Arrays;

/* renamed from: X.58F, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C58F {
    public static final float A00(float[] fArr, float[] fArr2, float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float max;
        float abs = Math.abs(f);
        float signum = Math.signum(f);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            max = fArr2[binarySearch];
        } else {
            int i = (-(binarySearch + 1)) - 1;
            int length = fArr.length - 1;
            if (i >= length) {
                float f7 = fArr[length];
                float f8 = fArr2[length];
                if (f7 == 0.0f) {
                    return 0.0f;
                }
                return f * (f8 / f7);
            }
            if (i == -1) {
                f3 = fArr[0];
                f5 = fArr2[0];
                f4 = 0.0f;
                f2 = 0.0f;
            } else {
                f2 = fArr[i];
                int i2 = i + 1;
                f3 = fArr[i2];
                f4 = fArr2[i];
                f5 = fArr2[i2];
            }
            if (f2 == f3) {
                f6 = 0.0f;
            } else {
                f6 = (abs - f2) / (f3 - f2);
            }
            max = f4 + ((f5 - f4) * Math.max(0.0f, Math.min(1.0f, f6)));
        }
        return signum * max;
    }
}
