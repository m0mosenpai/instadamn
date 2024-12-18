package X;

import java.util.Arrays;

/* loaded from: classes12.dex */
public final class YG1 implements Cloneable {
    public int A00 = 0;
    public int[] A01 = new int[1];

    public static void A00(YG1 yg1, int i) {
        int[] iArr = yg1.A01;
        int length = iArr.length;
        if (i > length * 32) {
            int[] iArr2 = new int[(i + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            yg1.A01 = iArr2;
        }
    }

    public final void A01(int i, int i2) {
        if (i2 >= 0 && i2 <= 32) {
            A00(this, this.A00 + i2);
            while (i2 > 0) {
                boolean z = true;
                if (((i >> (i2 - 1)) & 1) != 1) {
                    z = false;
                }
                A02(z);
                i2--;
            }
            return;
        }
        throw AbstractC166987dD.A12("Num bits must be between 0 and 32");
    }

    public final void A02(boolean z) {
        A00(this, this.A00 + 1);
        if (z) {
            int[] iArr = this.A01;
            int i = this.A00;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.A00++;
    }

    public final boolean A03(int i) {
        if (((1 << (i & 31)) & this.A01[i / 32]) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.YG1, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object clone() {
        int[] iArr = (int[]) this.A01.clone();
        int i = this.A00;
        ?? obj = new Object();
        obj.A01 = iArr;
        obj.A00 = i;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof YG1)) {
            return false;
        }
        YG1 yg1 = (YG1) obj;
        if (this.A00 != yg1.A00 || !Arrays.equals(this.A01, yg1.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + Arrays.hashCode(this.A01);
    }

    public final String toString() {
        int i = this.A00;
        StringBuilder sb = new StringBuilder((i / 8) + i + 1);
        for (int i2 = 0; i2 < i; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            char c = '.';
            if (A03(i2)) {
                c = 'X';
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
