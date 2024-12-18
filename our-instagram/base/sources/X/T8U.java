package X;

import java.security.InvalidKeyException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* loaded from: classes10.dex */
public final class T8U implements InterfaceC65518Tln {
    public final SecretKey A00;
    public final byte[] A01;
    public static final EnumC61068Rei A06 = EnumC61068Rei.A00;
    public static final byte[] A04 = AbstractC58562Pxe.A01("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");
    public static final byte[] A05 = AbstractC58562Pxe.A01("070000004041424344454647");
    public static final byte[] A03 = AbstractC58562Pxe.A01("a0784d7a4716f3feb4f64e7f4b39bf04");
    public static final ThreadLocal A02 = new TYO();

    @Override // X.InterfaceC65518Tln
    public final byte[] ASM(final byte[] plaintext, final byte[] associatedData) {
        if (plaintext != null) {
            byte[] A00 = AbstractC58567Pxj.A00(12);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(A00);
            Cipher cipher = (Cipher) A02.get();
            AbstractC58320PtC.A1S(this.A00, ivParameterSpec, cipher, associatedData, 1);
            int length = plaintext.length;
            int outputSize = cipher.getOutputSize(length);
            byte[] bArr = this.A01;
            int length2 = bArr.length;
            if (outputSize <= (Integer.MAX_VALUE - length2) - 12) {
                int i = length2 + 12;
                byte[] copyOf = Arrays.copyOf(bArr, i + outputSize);
                System.arraycopy(A00, 0, copyOf, length2, 12);
                if (cipher.doFinal(plaintext, 0, length, copyOf, i) == outputSize) {
                    return copyOf;
                }
                throw AbstractC58318PtA.A0x("not enough data written");
            }
            throw AbstractC58318PtA.A0x("plaintext too long");
        }
        throw AbstractC166987dD.A15("plaintext is null");
    }

    @Override // X.InterfaceC65518Tln
    public final byte[] AOR(final byte[] ciphertext, final byte[] associatedData) {
        if (ciphertext != null) {
            int length = ciphertext.length;
            byte[] bArr = this.A01;
            int length2 = bArr.length;
            int i = length2 + 12;
            if (length >= i + 16) {
                if (AbstractC58538Px6.A02(bArr, ciphertext)) {
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(AbstractC58319PtB.A1X(ciphertext, 12, length2));
                    Cipher cipher = (Cipher) A02.get();
                    AbstractC58320PtC.A1S(this.A00, ivParameterSpec, cipher, associatedData, 2);
                    return cipher.doFinal(ciphertext, i, (length - length2) - 12);
                }
                throw AbstractC58318PtA.A0x("Decryption failed (OutputPrefix mismatch).");
            }
            throw AbstractC58318PtA.A0x("ciphertext too short");
        }
        throw AbstractC166987dD.A15("ciphertext is null");
    }

    public T8U(final byte[] key, final byte[] outputPrefix) {
        if (A06.A00()) {
            if (A02.get() != null) {
                if (key.length == 32) {
                    this.A00 = AbstractC58318PtA.A16("ChaCha20", key);
                    this.A01 = outputPrefix;
                    return;
                }
                throw new InvalidKeyException("The key length in bytes must be 32.");
            }
            throw AbstractC58318PtA.A0x("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        throw AbstractC58318PtA.A0x("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }
}
