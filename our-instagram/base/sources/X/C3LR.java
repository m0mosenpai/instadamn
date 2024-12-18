package X;

/* renamed from: X.3LR, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3LR {
    public static float A00(C68i c68i, float f, float f2, float f3) {
        if (c68i == null) {
            return f;
        }
        float[] fArr = ((C68f) c68i).A00;
        int length = fArr.length;
        int A02 = C3LU.A02(fArr, f2, length);
        if (A02 >= 0) {
            return c68i.A00[A02];
        }
        int i = -(A02 + 1);
        if (i == 0) {
            return c68i.A00[0];
        }
        float[] fArr2 = c68i.A00;
        if (i == length) {
            return fArr2[length - 1];
        }
        int i2 = i - 1;
        float f4 = fArr2[i2];
        return ((fArr2[i] - f4) * C3LU.A00(c68i.A01[i2], fArr[i2], fArr[i], f2, f3)) + f4;
    }
}
