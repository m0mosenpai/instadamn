package X;

/* loaded from: classes5.dex */
public final class COJ {
    public final CUU[][] A00;

    public COJ(float[] fArr, int[] iArr, float[][] fArr2) {
        int length = fArr.length - 1;
        CUU[][] cuuArr = new CUU[length];
        int i = 1;
        int i2 = 1;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 != 4) {
                                if (i4 == 5) {
                                    i2 = 5;
                                }
                            } else {
                                i2 = 4;
                            }
                        } else {
                            i = i == 1 ? 2 : 1;
                            i2 = i;
                        }
                    } else {
                        i = 2;
                        i2 = 2;
                    }
                } else {
                    i = 1;
                    i2 = 1;
                }
            } else {
                i2 = 3;
            }
            int length2 = fArr2[i3].length;
            int i5 = (length2 / 2) + (length2 % 2);
            CUU[] cuuArr2 = new CUU[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                int i7 = i6 * 2;
                float f = fArr[i3];
                int i8 = i3 + 1;
                float f2 = fArr[i8];
                float[] fArr3 = fArr2[i3];
                float f3 = fArr3[i7];
                int i9 = i7 + 1;
                float f4 = fArr3[i9];
                float[] fArr4 = fArr2[i8];
                cuuArr2[i6] = new CUU(f, f2, f3, f4, fArr4[i7], fArr4[i9], i2);
            }
            cuuArr[i3] = cuuArr2;
        }
        this.A00 = cuuArr;
    }
}
