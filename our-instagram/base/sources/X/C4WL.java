package X;

import java.util.Arrays;

/* renamed from: X.4WL, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4WL {
    public final int[] A00;
    public final long[] A01;
    public final android.net.Uri[] A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C4WL c4wl = (C4WL) obj;
            if (!Arrays.equals(this.A02, c4wl.A02) || !Arrays.equals(this.A00, c4wl.A00) || !Arrays.equals(this.A01, c4wl.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = (int) (0 >>> 32);
        return (((((((((i - 31) * 31) + Arrays.hashCode(this.A02)) * 31) + Arrays.hashCode(this.A00)) * 31) + Arrays.hashCode(this.A01)) * 31) + i) * 31;
    }

    public C4WL(int[] iArr, long[] jArr, android.net.Uri[] uriArr) {
        C4B8.A03(iArr.length == uriArr.length);
        this.A00 = iArr;
        this.A02 = uriArr;
        this.A01 = jArr;
    }
}
