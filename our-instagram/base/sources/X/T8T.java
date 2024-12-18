package X;

import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes10.dex */
public final class T8T implements InterfaceC65518Tln {
    public static final EnumC61068Rei A02 = EnumC61068Rei.A00;
    public final byte[] A00;
    public final byte[] A01;

    @Override // X.InterfaceC65518Tln
    public final byte[] ASM(final byte[] plaintext, final byte[] associatedData) {
        if (plaintext != null) {
            byte[] A00 = AbstractC58567Pxj.A00(24);
            int[] A04 = AbstractC63354SiB.A04(AbstractC63354SiB.A03(this.A00), AbstractC63354SiB.A03(A00));
            ByteBuffer A17 = AbstractC58320PtC.A17(A04.length * 4);
            A17.asIntBuffer().put(A04);
            SecretKeySpec A16 = AbstractC58318PtA.A16("ChaCha20", A17.array());
            byte[] bArr = new byte[12];
            System.arraycopy(A00, 16, bArr, 4, 8);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            Cipher cipher = (Cipher) T8U.A02.get();
            AbstractC58320PtC.A1S(A16, ivParameterSpec, cipher, associatedData, 1);
            int length = plaintext.length;
            int outputSize = cipher.getOutputSize(length);
            byte[] bArr2 = this.A01;
            int length2 = bArr2.length;
            if (outputSize <= (Integer.MAX_VALUE - length2) - 24) {
                int i = length2 + 24;
                byte[] copyOf = Arrays.copyOf(bArr2, i + outputSize);
                System.arraycopy(A00, 0, copyOf, length2, 24);
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
            int i = length2 + 24;
            if (length >= i + 16) {
                if (AbstractC58538Px6.A02(bArr, ciphertext)) {
                    byte[] A1X = AbstractC58319PtB.A1X(ciphertext, 24, length2);
                    int[] A04 = AbstractC63354SiB.A04(AbstractC63354SiB.A03(this.A00), AbstractC63354SiB.A03(A1X));
                    ByteBuffer A17 = AbstractC58320PtC.A17(A04.length * 4);
                    A17.asIntBuffer().put(A04);
                    SecretKeySpec A16 = AbstractC58318PtA.A16("ChaCha20", A17.array());
                    byte[] bArr2 = new byte[12];
                    System.arraycopy(A1X, 16, bArr2, 4, 8);
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
                    Cipher cipher = (Cipher) T8U.A02.get();
                    AbstractC58320PtC.A1S(A16, ivParameterSpec, cipher, associatedData, 2);
                    return cipher.doFinal(ciphertext, i, (length - length2) - 24);
                }
                throw AbstractC58318PtA.A0x("Decryption failed (OutputPrefix mismatch).");
            }
            throw AbstractC58318PtA.A0x("ciphertext too short");
        }
        throw AbstractC166987dD.A15("ciphertext is null");
    }

    public T8T(final byte[] key, final byte[] outputPrefix) {
        if (A02.A00()) {
            if (T8U.A02.get() != null) {
                if (key.length == 32) {
                    this.A00 = key;
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
