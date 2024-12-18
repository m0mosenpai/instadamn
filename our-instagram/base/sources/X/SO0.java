package X;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class SO0 {
    public final int A00;
    public final int[] A01;
    public final long[] A02;

    @Deprecated
    public final android.net.Uri[] A03;
    public final C62972SZr[] A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SO0 so0 = (SO0) obj;
            if (this.A00 != so0.A00 || !Arrays.equals(this.A04, so0.A04) || !Arrays.equals(this.A01, so0.A01) || !Arrays.equals(this.A02, so0.A02)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = (int) (0 >>> 32);
        return ((((((((((((this.A00 * 31) - 1) * 31) + i) * 31) + Arrays.hashCode(this.A04)) * 31) + Arrays.hashCode(this.A01)) * 31) + Arrays.hashCode(this.A02)) * 31) + i) * 31;
    }

    public SO0(int[] iArr, long[] jArr, C62972SZr[] c62972SZrArr, int i) {
        android.net.Uri uri;
        int length = iArr.length;
        int length2 = c62972SZrArr.length;
        int i2 = 0;
        WDn.A01(AbstractC167007dF.A1P(length, length2));
        this.A00 = i;
        this.A01 = iArr;
        this.A04 = c62972SZrArr;
        this.A02 = jArr;
        this.A03 = new android.net.Uri[length2];
        while (true) {
            android.net.Uri[] uriArr = this.A03;
            if (i2 < uriArr.length) {
                C62972SZr c62972SZr = c62972SZrArr[i2];
                if (c62972SZr == null) {
                    uri = null;
                } else {
                    SO1 so1 = c62972SZr.A03;
                    so1.getClass();
                    uri = so1.A01;
                }
                uriArr[i2] = uri;
                i2++;
            } else {
                return;
            }
        }
    }
}
