package X;

/* loaded from: classes11.dex */
public abstract class VS2 {
    public static final float A00(float[] fArr, float[] fArr2, int i) {
        AbstractC167017dG.A1R(fArr, fArr2);
        int length = fArr2.length;
        int length2 = fArr.length;
        if (length == length2) {
            float f = i / 120.0f;
            int i2 = length - 1;
            for (int i3 = 0; i3 < i2; i3++) {
                if (fArr2[i3] <= f) {
                    int i4 = i3 + 1;
                    float f2 = fArr2[i4];
                    if (f2 >= f) {
                        float f3 = fArr2[i3];
                        float f4 = fArr[i3];
                        return f4 + (((f - f3) * (fArr[i4] - f4)) / (f2 - f3));
                    }
                }
            }
            return fArr[length2 - 1];
        }
        throw new IllegalArgumentException("keyFrames and knots must have equal length and nonempty");
    }
}
