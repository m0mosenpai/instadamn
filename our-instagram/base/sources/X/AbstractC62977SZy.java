package X;

/* renamed from: X.SZy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62977SZy {
    public static final char[] A00 = "0123456789abcdef".toCharArray();

    public final int hashCode() {
        byte[] bArr = ((RME) this).A00;
        int length = bArr.length;
        if (length * 8 >= 32) {
            if (length >= 4) {
                int i = bArr[0] & 255;
                int i2 = bArr[1] & 255;
                int i3 = bArr[2] & 255;
                return ((bArr[3] & 255) << 24) | i | (i2 << 8) | (i3 << 16);
            }
            throw AbstractC166987dD.A14(S2W.A00("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", AbstractC25228BEl.A1Y(length)));
        }
        int i4 = bArr[0] & 255;
        for (int i5 = 1; i5 < length; i5++) {
            i4 |= (bArr[i5] & 255) << (i5 * 8);
        }
        return i4;
    }

    public final String toString() {
        byte[] bArr = ((RME) this).A00;
        int length = bArr.length;
        StringBuilder A0q = AbstractC58318PtA.A0q(length + length);
        for (byte b : bArr) {
            char[] cArr = A00;
            A0q.append(cArr[(b >> 4) & 15]);
            A0q.append(cArr[b & 15]);
        }
        return A0q.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AbstractC62977SZy)) {
            return false;
        }
        byte[] bArr = ((RME) this).A00;
        int length = bArr.length;
        int i = length * 8;
        byte[] bArr2 = ((RME) ((AbstractC62977SZy) obj)).A00;
        int length2 = bArr2.length;
        if (i != length2 * 8 || length != length2) {
            return false;
        }
        boolean z = true;
        for (int i2 = 0; i2 < length; i2++) {
            z &= AbstractC167007dF.A1P(bArr[i2], bArr2[i2]);
        }
        if (!z) {
            return false;
        }
        return true;
    }
}
