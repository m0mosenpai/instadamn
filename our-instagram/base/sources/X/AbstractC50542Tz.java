package X;

/* renamed from: X.2Tz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC50542Tz {
    public static final char[] A00 = "0123456789abcdef".toCharArray();

    public final int hashCode() {
        byte[] bArr = ((C50532Ty) this).A00;
        int length = bArr.length;
        if (length * 8 >= 32) {
            boolean z = false;
            if (length >= 4) {
                z = true;
            }
            C18C.A0D("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", length, z);
            return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
        }
        int i = bArr[0] & 255;
        for (int i2 = 1; i2 < length; i2++) {
            i |= (bArr[i2] & 255) << (i2 * 8);
        }
        return i;
    }

    public final String toString() {
        byte[] bArr = ((C50532Ty) this).A00;
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            char[] cArr = A00;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }

    public static int A00(char ch) {
        if (ch >= '0') {
            if (ch <= '9') {
                return ch - '0';
            }
            if (ch >= 'a' && ch <= 'f') {
                return (ch - 'a') + 10;
            }
        }
        throw new IllegalArgumentException(AnonymousClass001.A0C("Illegal hexadecimal character: ", ch));
    }

    public final boolean equals(Object object) {
        if (!(object instanceof AbstractC50542Tz)) {
            return false;
        }
        byte[] bArr = ((C50532Ty) this).A00;
        int length = bArr.length;
        int i = length * 8;
        byte[] bArr2 = ((C50532Ty) ((AbstractC50542Tz) object)).A00;
        int length2 = bArr2.length;
        if (i != length2 * 8 || length != length2) {
            return false;
        }
        boolean z = true;
        for (int i2 = 0; i2 < length; i2++) {
            boolean z2 = false;
            if (bArr[i2] == bArr2[i2]) {
                z2 = true;
            }
            z &= z2;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    public static C50532Ty A01(String string) {
        int length = string.length();
        boolean z = true;
        boolean z2 = false;
        if (length >= 2) {
            z2 = true;
        }
        C18C.A0A(string, "input string (%s) must have at least 2 characters", z2);
        if (length % 2 != 0) {
            z = false;
        }
        C18C.A0A(string, "input string (%s) must have an even number of characters", z);
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((A00(string.charAt(i)) << 4) + A00(string.charAt(i + 1)));
        }
        return new C50532Ty(bArr);
    }
}
