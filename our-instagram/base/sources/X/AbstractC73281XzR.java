package X;

import java.util.Arrays;

/* renamed from: X.XzR, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC73281XzR {
    public static final int[][] A01 = {new int[]{-1, 0}, new int[]{1, 0}, new int[]{0, -1}, new int[]{0, 1}, new int[]{0, 0}, new int[]{-1, -1}, new int[]{-1, 1}, new int[]{1, -1}, new int[]{1, 1}};
    public static final float[][] A00 = {new float[]{0.08f, 0.12f, 0.08f}, new float[]{0.12f, 0.2f, 0.12f}, new float[]{0.08f, 0.12f, 0.08f}};

    public static final float[] A00(float[] fArr, int i, int i2) {
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        C14360o3.A07(copyOf);
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = (i3 * i) + i4;
                float f = 0.0f;
                int[] iArr = {1, 1};
                int[][] iArr2 = A01;
                int i6 = 0;
                do {
                    int[] iArr3 = iArr2[i6];
                    int i7 = iArr3[0];
                    int i8 = i3 + i7;
                    int i9 = iArr3[1];
                    int i10 = i4 + i9;
                    if (i8 >= 0 && i8 < i2 && i10 >= 0 && i10 < i) {
                        f += fArr[(i8 * i) + i10] * A00[iArr[0] + i7][iArr[1] + i9];
                    }
                    i6++;
                } while (i6 < 9);
                copyOf[i5] = f;
            }
        }
        return copyOf;
    }
}
