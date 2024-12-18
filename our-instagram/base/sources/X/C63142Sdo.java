package X;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.Sdo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63142Sdo {
    public static final EnumC61068Rei A03 = EnumC61068Rei.A01;
    public static final ThreadLocal A04 = new TYS();
    public final int A00;
    public final int A01;
    public final SecretKeySpec A02;

    public static void A00(C63142Sdo c63142Sdo, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, boolean z) {
        Cipher cipher = (Cipher) A04.get();
        byte[] bArr4 = new byte[c63142Sdo.A01];
        System.arraycopy(bArr3, 0, bArr4, 0, c63142Sdo.A00);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        int i4 = 2;
        if (z) {
            i4 = 1;
        }
        cipher.init(i4, c63142Sdo.A02, ivParameterSpec);
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) == i2) {
        } else {
            throw AbstractC58318PtA.A0x("stored output's length does not match input's length");
        }
    }

    public C63142Sdo(final byte[] key, int ivSize) {
        if (A03.A00()) {
            AbstractC58563Pxf.A01(key.length);
            this.A02 = AbstractC58318PtA.A16("AES", key);
            int blockSize = ((Cipher) A04.get()).getBlockSize();
            this.A01 = blockSize;
            if (ivSize >= 12 && ivSize <= blockSize) {
                this.A00 = ivSize;
                return;
            }
            throw AbstractC58318PtA.A0x("invalid IV size");
        }
        throw AbstractC58318PtA.A0x("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }
}
