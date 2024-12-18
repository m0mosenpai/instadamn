package X;

import java.io.UnsupportedEncodingException;

/* renamed from: X.SdQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63122SdQ {
    public static boolean A00;
    public static final byte[] A02 = A01("RIFF");
    public static final byte[] A01 = A01("WEBP");
    public static final byte[] A05 = A01("VP8 ");
    public static final byte[] A03 = A01("VP8L");
    public static final byte[] A04 = A01("VP8X");

    public static boolean A00(byte[] bArr, byte[] bArr2, int i) {
        if (bArr2 == null) {
            return false;
        }
        int length = bArr2.length;
        if (length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (bArr[i2 + i] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static byte[] A01(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e) {
            throw AbstractC58318PtA.A0e("ASCII not found!", e);
        }
    }
}
