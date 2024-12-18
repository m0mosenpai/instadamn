package X;

import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* loaded from: classes10.dex */
public final class T8Y implements InterfaceC65518Tln {
    public static final EnumC61068Rei A02 = EnumC61068Rei.A01;
    public final SecretKey A00;
    public final byte[] A01;

    @Override // X.InterfaceC65518Tln
    public final byte[] ASM(final byte[] plaintext, final byte[] associatedData) {
        if (plaintext != null) {
            byte[] A00 = AbstractC58567Pxj.A00(12);
            AlgorithmParameterSpec A002 = AbstractC62863SUk.A00(A00);
            Cipher cipher = (Cipher) AbstractC62863SUk.A01.get();
            AbstractC58320PtC.A1S(this.A00, A002, cipher, associatedData, 1);
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

    public static T8Y A00(RTC key) {
        C58529Pwx c58529Pwx = key.A00;
        int i = c58529Pwx.A00;
        if (i == 12) {
            int i2 = c58529Pwx.A02;
            if (i2 == 16) {
                return new T8Y(key.A01, key.A02.A00.A01());
            }
            throw AbstractC58320PtC.A1A("Expected tag Size 16, got ", i2);
        }
        throw AbstractC58320PtC.A1A("Expected IV Size 12, got ", i);
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
                    AlgorithmParameterSpec A00 = AbstractC62863SUk.A00(AbstractC58319PtB.A1X(ciphertext, 12, length2));
                    Cipher cipher = (Cipher) AbstractC62863SUk.A01.get();
                    AbstractC58320PtC.A1S(this.A00, A00, cipher, associatedData, 2);
                    return cipher.doFinal(ciphertext, i, (length - length2) - 12);
                }
                throw AbstractC58318PtA.A0x("Decryption failed (OutputPrefix mismatch).");
            }
            throw AbstractC58318PtA.A0x("ciphertext too short");
        }
        throw AbstractC166987dD.A15("ciphertext is null");
    }

    public T8Y(final C58526Pwu key, byte[] outputPrefix) {
        if (A02.A00()) {
            AbstractC58563Pxf.A01(outputPrefix.length);
            this.A00 = AbstractC58318PtA.A16("AES", outputPrefix);
            this.A01 = key.A01();
            return;
        }
        throw AbstractC58318PtA.A0x("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }
}
