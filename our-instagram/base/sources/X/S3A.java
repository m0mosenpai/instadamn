package X;

/* loaded from: classes10.dex */
public abstract class S3A {
    public static Long A00(String str) {
        byte b;
        str.getClass();
        if (str.isEmpty()) {
            return null;
        }
        int i = 0;
        if (str.charAt(0) == '-') {
            i = 1;
        }
        int length = str.length();
        if (i == length) {
            return null;
        }
        int i2 = i + 1;
        char charAt = str.charAt(i);
        byte[] bArr = S7Z.A00;
        if (charAt >= 128) {
            return null;
        }
        byte[] bArr2 = S7Z.A00;
        byte b2 = bArr[charAt];
        if (b2 < 0 || b2 >= 10) {
            return null;
        }
        long j = -b2;
        while (i2 < length) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 128 || (b = bArr2[charAt2]) < 0 || b >= 10 || j < -922337203685477580L) {
                return null;
            }
            long j2 = j * 10;
            long j3 = b;
            if (j2 < j3 - Long.MIN_VALUE) {
                return null;
            }
            j = j2 - j3;
            i2 = i3;
        }
        if (i != 0) {
            return Long.valueOf(j);
        }
        if (j == Long.MIN_VALUE) {
            return null;
        }
        return Long.valueOf(-j);
    }
}
