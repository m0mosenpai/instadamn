package X;

/* renamed from: X.Pxe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58562Pxe {
    public static String A00(final byte[] bytes) {
        StringBuilder A0q = AbstractC58318PtA.A0q(bytes.length * 2);
        for (byte b : bytes) {
            int i = b & 255;
            A0q.append("0123456789abcdef".charAt(i / 16));
            A0q.append("0123456789abcdef".charAt(i % 16));
        }
        return A0q.toString();
    }

    public static byte[] A01(String hex) {
        int length = hex.length();
        if (length % 2 == 0) {
            int i = length / 2;
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * 2;
                int digit = Character.digit(hex.charAt(i3), 16);
                int digit2 = Character.digit(hex.charAt(i3 + 1), 16);
                if (digit != -1 && digit2 != -1) {
                    bArr[i2] = (byte) ((digit * 16) + digit2);
                } else {
                    throw AbstractC166987dD.A12("input is not hexadecimal");
                }
            }
            return bArr;
        }
        throw AbstractC166987dD.A12("Expected a string of even length");
    }
}
