package X;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* loaded from: classes10.dex */
public final class T95 implements InterfaceC65431Tk2 {
    public static final EnumC61068Rei A03 = EnumC61068Rei.A00;
    public byte[] A00;
    public byte[] A01;
    public final SecretKey A02;

    @Override // X.InterfaceC65431Tk2
    public final byte[] AIq(final byte[] data, int outputLength) {
        byte[] A02;
        if (outputLength <= 16) {
            if (A03.A00()) {
                Cipher cipher = (Cipher) InterfaceC65621ToC.A00(C62890SVv.A01, "AES/ECB/NoPadding");
                cipher.init(1, this.A02);
                int length = data.length;
                int max = Math.max(1, (int) Math.ceil(length / 16.0d));
                int i = max * 16;
                int i2 = max - 1;
                int i3 = i2 * 16;
                if (i == length) {
                    A02 = AbstractC63315ShN.A03(data, this.A00, i3, 0, 16);
                } else {
                    byte[] copyOfRange = Arrays.copyOfRange(data, i3, length);
                    int length2 = copyOfRange.length;
                    if (length2 < 16) {
                        byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
                        copyOf[length2] = Byte.MIN_VALUE;
                        A02 = AbstractC63315ShN.A02(copyOf, this.A01);
                    } else {
                        throw AbstractC166987dD.A12("x must be smaller than a block.");
                    }
                }
                byte[] bArr = new byte[16];
                for (int i4 = 0; i4 < i2; i4++) {
                    bArr = cipher.doFinal(AbstractC63315ShN.A03(bArr, data, 0, i4 * 16, 16));
                }
                return Arrays.copyOf(cipher.doFinal(AbstractC63315ShN.A02(A02, bArr)), outputLength);
            }
            throw AbstractC58318PtA.A0x("Can not use AES-CMAC in FIPS-mode.");
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }

    public T95(final byte[] key) {
        AbstractC58563Pxf.A01(key.length);
        this.A02 = AbstractC58318PtA.A16("AES", key);
        if (A03.A00()) {
            Cipher cipher = (Cipher) InterfaceC65621ToC.A00(C62890SVv.A01, "AES/ECB/NoPadding");
            cipher.init(1, this.A02);
            byte[] A00 = S3R.A00(cipher.doFinal(new byte[16]));
            this.A00 = A00;
            this.A01 = S3R.A00(A00);
            return;
        }
        throw AbstractC58318PtA.A0x("Can not use AES-CMAC in FIPS-mode.");
    }
}
