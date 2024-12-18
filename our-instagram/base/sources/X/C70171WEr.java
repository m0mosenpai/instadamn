package X;

import java.util.Arrays;

/* renamed from: X.WEr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70171WEr {
    public static final C70171WEr A07 = new C70171WEr(null, 1, 2, 3, -1, -1);
    public static final C70171WEr A08 = new C70171WEr(null, 1, 1, 2, -1, -1);
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final byte[] A06;

    public static int A00(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int A01(int i) {
        if (i != 1) {
            if (i == 4) {
                return 10;
            }
            if (i == 13) {
                return 2;
            }
            if (i == 16) {
                return 6;
            }
            if (i == 18) {
                return 7;
            }
            if (i != 6 && i != 7) {
                return -1;
            }
        }
        return 3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C70171WEr c70171WEr = (C70171WEr) obj;
            if (this.A03 != c70171WEr.A03 || this.A02 != c70171WEr.A02 || this.A04 != c70171WEr.A04 || !Arrays.equals(this.A06, c70171WEr.A06) || this.A05 != c70171WEr.A05 || this.A01 != c70171WEr.A01) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00;
        if (i == 0) {
            int hashCode = ((((((((((527 + this.A03) * 31) + this.A02) * 31) + this.A04) * 31) + Arrays.hashCode(this.A06)) * 31) + this.A05) * 31) + this.A01;
            this.A00 = hashCode;
            return hashCode;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70171WEr.toString():java.lang.String");
    }

    public C70171WEr(byte[] bArr, int i, int i2, int i3, int i4, int i5) {
        this.A03 = i;
        this.A02 = i2;
        this.A04 = i3;
        this.A06 = bArr;
        this.A05 = i4;
        this.A01 = i5;
    }
}
