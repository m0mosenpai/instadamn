package X;

import java.nio.ByteBuffer;

/* renamed from: X.ShN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63315ShN {
    public static final byte[] A02(final byte[] x, final byte[] y) {
        int length = x.length;
        if (length == y.length) {
            return A03(x, y, 0, 0, length);
        }
        throw AbstractC166987dD.A12("The lengths of x and y should match.");
    }

    public static final byte[] A03(final byte[] x, byte[] offsetX, final int y, int offsetY, int len) {
        if (x.length - len >= y && offsetX.length - len >= offsetY) {
            byte[] bArr = new byte[len];
            for (int i = 0; i < len; i++) {
                bArr[i] = (byte) (x[i + y] ^ offsetX[i + offsetY]);
            }
            return bArr;
        }
        throw AbstractC166987dD.A12("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }

    public static byte[] A04(byte[]... chunks) {
        int i = 0;
        for (byte[] bArr : chunks) {
            if (i <= Integer.MAX_VALUE - bArr.length) {
                i += bArr.length;
            } else {
                throw AbstractC58318PtA.A0x("exceeded size limit");
            }
        }
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        for (byte[] bArr3 : chunks) {
            System.arraycopy(bArr3, 0, bArr2, i2, bArr3.length);
            i2 += bArr3.length;
        }
        return bArr2;
    }

    public static final void A00(ByteBuffer output, ByteBuffer x, ByteBuffer y, int len) {
        if (len >= 0 && x.remaining() >= len && y.remaining() >= len && output.remaining() >= len) {
            for (int i = 0; i < len; i++) {
                output.put((byte) (x.get() ^ y.get()));
            }
            return;
        }
        throw AbstractC166987dD.A12("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }

    public static byte[] A01(Object obj, Object obj2) {
        return A04((byte[]) obj, (byte[]) obj2);
    }
}
