package X;

/* renamed from: X.XzQ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC73280XzQ {
    public static final float[] A00 = {0.485f, 0.456f, 0.406f};
    public static final float[] A01 = {0.229f, 0.224f, 0.225f};

    public static final boolean A00(float[] fArr) {
        int length = fArr.length;
        int i = 1;
        if (length == 0) {
            return false;
        }
        float f = fArr[0];
        float f2 = f;
        int i2 = length - 1;
        if (1 <= i2) {
            while (true) {
                f = Math.max(f, fArr[i]);
                if (i == i2) {
                    break;
                }
                i++;
            }
        }
        Float valueOf = Float.valueOf(f);
        if (valueOf == null) {
            return false;
        }
        float floatValue = valueOf.floatValue();
        int i3 = 1;
        if (1 <= i2) {
            while (true) {
                f2 = Math.min(f2, fArr[i3]);
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        Float valueOf2 = Float.valueOf(f2);
        if (valueOf2 == null) {
            return false;
        }
        float floatValue2 = valueOf2.floatValue();
        for (int i4 = 0; i4 < length; i4++) {
            float f3 = (fArr[i4] - floatValue2) / (floatValue - floatValue2);
            fArr[i4] = f3;
            float f4 = 0.0f;
            if (f3 > 0.5f) {
                f4 = 1.0f;
            }
            fArr[i4] = f4;
        }
        return true;
    }
}
