package X;

import java.nio.charset.Charset;

/* renamed from: X.SdU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63126SdU {
    public static final byte[] A09;
    public static final byte[] A0A;
    public static final byte[] A0B;
    public static final byte[] A03 = A01(1, 0);
    public static final byte[] A02 = A01(1, 2);
    public static final byte[] A0F = A01(2, 32);
    public static final byte[] A0C = A01(2, 16);
    public static final byte[] A0D = A01(2, 17);
    public static final byte[] A0E = A01(2, 18);
    public static final byte[] A06 = A01(2, 1);
    public static final byte[] A07 = A01(2, 2);
    public static final byte[] A08 = A01(2, 3);
    public static final byte[] A00 = A01(2, 1);
    public static final byte[] A01 = A01(2, 2);
    public static final byte[] A04 = A01(2, 3);
    public static final byte[] A05 = new byte[0];

    static {
        Charset charset = AbstractC58538Px6.A00;
        A0B = "KEM".getBytes(charset);
        A09 = "HPKE".getBytes(charset);
        A0A = "HPKE-v1".getBytes(charset);
    }

    public static int A00(RTZ kemId) {
        if (kemId == RTZ.A03 || kemId == RTZ.A00) {
            return 32;
        }
        if (kemId == RTZ.A01) {
            return 48;
        }
        if (kemId == RTZ.A02) {
            return 66;
        }
        throw AbstractC58318PtA.A0x("Unrecognized HPKE KEM identifier");
    }

    public static byte[] A01(int capacity, int value) {
        if (value >= 0 && value < (1 << (capacity * 8))) {
            byte[] bArr = new byte[capacity];
            for (int i = 0; i < capacity; i++) {
                AbstractC58318PtA.A19(value >> (((capacity - i) - 1) * 8), bArr, i);
            }
            return bArr;
        }
        throw AbstractC166987dD.A12("value too large");
    }
}
