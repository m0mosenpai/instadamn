package X;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class SOT {
    public final float[] A00;
    public final int[] A01;

    public final SOT A00(float[] fArr) {
        int A02;
        int length = fArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            float f = fArr[i];
            float[] fArr2 = this.A00;
            int binarySearch = Arrays.binarySearch(fArr2, f);
            if (binarySearch >= 0) {
                A02 = this.A01[binarySearch];
            } else {
                int i2 = -(binarySearch + 1);
                if (i2 == 0) {
                    A02 = this.A01[0];
                } else {
                    int[] iArr2 = this.A01;
                    int length2 = iArr2.length - 1;
                    if (i2 == length2) {
                        A02 = iArr2[length2];
                    } else {
                        int i3 = i2 - 1;
                        float f2 = fArr2[i3];
                        A02 = AbstractC63043SbM.A02((f - f2) / (fArr2[i2] - f2), iArr2[i3], iArr2[i2]);
                    }
                }
            }
            iArr[i] = A02;
        }
        return new SOT(fArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SOT sot = (SOT) obj;
            if (!Arrays.equals(this.A00, sot.A00) || !Arrays.equals(this.A01, sot.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.A00) * 31) + Arrays.hashCode(this.A01);
    }

    public SOT(float[] fArr, int[] iArr) {
        this.A00 = fArr;
        this.A01 = iArr;
    }
}
