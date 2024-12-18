package X;

import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* loaded from: classes10.dex */
public final class T8V implements InterfaceC65518Tln {
    public final SecretKey A00;
    public final byte[] A01;
    public static final byte[] A06 = AbstractC58562Pxe.A01("7a806c");
    public static final byte[] A03 = AbstractC58562Pxe.A01("46bb91c3c5");
    public static final byte[] A04 = AbstractC58562Pxe.A01("36864200e0eaf5284d884a0e77d31646");
    public static final byte[] A05 = AbstractC58562Pxe.A01("bae8e37fc83441b16034566b");
    public static final byte[] A07 = AbstractC58562Pxe.A01("af60eb711bd85bc1e4d3e0a462e074eea428a8");
    public static final ThreadLocal A02 = new TYQ();

    @Override // X.InterfaceC65518Tln
    public final byte[] AOR(final byte[] ciphertext, final byte[] associatedData) {
        byte[] bArr = this.A01;
        int length = bArr.length;
        if (length != 0) {
            if (AbstractC58538Px6.A02(bArr, ciphertext)) {
                ciphertext = Arrays.copyOfRange(ciphertext, length, ciphertext.length);
            } else {
                throw AbstractC58318PtA.A0x("Decryption failed (OutputPrefix mismatch).");
            }
        }
        Cipher cipher = (Cipher) A02.get();
        if (cipher != null) {
            int length2 = ciphertext.length;
            if (length2 >= 28) {
                AbstractC58320PtC.A1S(this.A00, new GCMParameterSpec(128, ciphertext, 0, 12), cipher, associatedData, 2);
                return cipher.doFinal(ciphertext, 12, length2 - 12);
            }
            throw AbstractC58318PtA.A0x("ciphertext too short");
        }
        throw AbstractC58318PtA.A0x("AES GCM SIV cipher is not available or is invalid.");
    }

    @Override // X.InterfaceC65518Tln
    public final byte[] ASM(final byte[] plaintext, final byte[] associatedData) {
        Cipher cipher = (Cipher) A02.get();
        if (cipher != null) {
            int length = plaintext.length;
            if (length <= 2147483619) {
                byte[] bArr = new byte[length + 12 + 16];
                byte[] A00 = AbstractC58567Pxj.A00(12);
                System.arraycopy(A00, 0, bArr, 0, 12);
                AbstractC58320PtC.A1S(this.A00, new GCMParameterSpec(128, A00, 0, A00.length), cipher, associatedData, 1);
                int doFinal = cipher.doFinal(plaintext, 0, length, bArr, 12);
                if (doFinal == length + 16) {
                    byte[] bArr2 = this.A01;
                    if (bArr2.length != 0) {
                        return AbstractC63315ShN.A01(bArr2, bArr);
                    }
                    return bArr;
                }
                throw AbstractC58319PtB.A0z("encryption failed; GCM tag must be %s bytes, but got only %s bytes", AbstractC25228BEl.A1Z(16, doFinal - length));
            }
            throw AbstractC58318PtA.A0x("plaintext too long");
        }
        throw AbstractC58318PtA.A0x("AES GCM SIV cipher is not available or is invalid.");
    }

    public T8V(byte[] key, byte[] outputPrefix) {
        this.A01 = outputPrefix;
        AbstractC58563Pxf.A01(key.length);
        this.A00 = AbstractC58318PtA.A16("AES", key);
    }
}
