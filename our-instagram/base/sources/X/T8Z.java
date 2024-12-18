package X;

import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes10.dex */
public final class T8Z implements InterfaceC65518Tln {
    public final int A00;
    public final SecretKeySpec A01;
    public final byte[] A02;
    public final byte[] A03;
    public final byte[] A04;
    public static final EnumC61068Rei A05 = EnumC61068Rei.A00;
    public static final ThreadLocal A07 = new TYT();
    public static final ThreadLocal A06 = new TYU();

    private byte[] A00(Cipher ecb, byte[] tag, final int data, int offset, int length) {
        byte[] copyOf;
        byte[] bArr;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) data;
        if (length == 0) {
            byte[] bArr3 = this.A02;
            bArr = new byte[16];
            int i = 0;
            do {
                bArr[i] = (byte) (bArr2[i] ^ bArr3[i]);
                i++;
            } while (i < 16);
        } else {
            byte[] doFinal = ecb.doFinal(bArr2);
            int i2 = 0;
            while (length - i2 > 16) {
                int i3 = 0;
                do {
                    doFinal[i3] = (byte) (doFinal[i3] ^ tag[(offset + i2) + i3]);
                    i3++;
                } while (i3 < 16);
                doFinal = ecb.doFinal(doFinal);
                i2 += 16;
            }
            byte[] copyOfRange = Arrays.copyOfRange(tag, i2 + offset, offset + length);
            int length2 = copyOfRange.length;
            if (length2 == 16) {
                byte[] bArr4 = this.A02;
                copyOf = new byte[length2];
                int i4 = 0;
                do {
                    copyOf[i4] = (byte) (copyOfRange[i4] ^ bArr4[i4]);
                    i4++;
                } while (i4 < length2);
            } else {
                copyOf = Arrays.copyOf(this.A03, 16);
                for (int i5 = 0; i5 < length2; i5++) {
                    copyOf[i5] = (byte) (copyOf[i5] ^ copyOfRange[i5]);
                }
                copyOf[length2] = (byte) (copyOf[length2] ^ 128);
            }
            int length3 = doFinal.length;
            bArr = new byte[length3];
            for (int i6 = 0; i6 < length3; i6++) {
                bArr[i6] = (byte) (doFinal[i6] ^ copyOf[i6]);
            }
        }
        return ecb.doFinal(bArr);
    }

    @Override // X.InterfaceC65518Tln
    public final byte[] AOR(final byte[] ciphertext, final byte[] associatedData) {
        byte[] bArr = ciphertext;
        byte[] bArr2 = associatedData;
        byte[] bArr3 = this.A04;
        int length = bArr3.length;
        if (length != 0) {
            if (AbstractC58538Px6.A02(bArr3, bArr)) {
                bArr = Arrays.copyOfRange(bArr, length, bArr.length);
            } else {
                throw AbstractC58318PtA.A0x("Decryption failed (OutputPrefix mismatch).");
            }
        }
        int length2 = bArr.length;
        int i = this.A00;
        int i2 = (length2 - i) - 16;
        if (i2 >= 0) {
            Cipher cipher = (Cipher) A07.get();
            SecretKeySpec secretKeySpec = this.A01;
            cipher.init(1, secretKeySpec);
            byte[] A00 = A00(cipher, bArr, 0, 0, i);
            int i3 = 0;
            if (associatedData == null) {
                bArr2 = new byte[0];
            }
            byte[] A002 = A00(cipher, bArr2, 1, 0, bArr2.length);
            byte[] A003 = A00(cipher, bArr, 2, i, i2);
            int i4 = length2 - 16;
            byte b = 0;
            do {
                b = (byte) (b | (((bArr[i4 + i3] ^ A002[i3]) ^ A00[i3]) ^ A003[i3]));
                i3++;
            } while (i3 < 16);
            if (b == 0) {
                Cipher cipher2 = (Cipher) A06.get();
                cipher2.init(1, secretKeySpec, new IvParameterSpec(A00));
                return cipher2.doFinal(bArr, i, i2);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw AbstractC58318PtA.A0x("ciphertext too short");
    }

    @Override // X.InterfaceC65518Tln
    public final byte[] ASM(final byte[] plaintext, final byte[] associatedData) {
        byte[] bArr = associatedData;
        int length = plaintext.length;
        int i = this.A00;
        if (length <= (Integer.MAX_VALUE - i) - 16) {
            int i2 = length + i;
            byte[] bArr2 = new byte[i2 + 16];
            byte[] A00 = AbstractC58567Pxj.A00(i);
            int i3 = 0;
            System.arraycopy(A00, 0, bArr2, 0, i);
            Cipher cipher = (Cipher) A07.get();
            SecretKeySpec secretKeySpec = this.A01;
            cipher.init(1, secretKeySpec);
            byte[] A002 = A00(cipher, A00, 0, 0, A00.length);
            if (associatedData == null) {
                bArr = new byte[0];
            }
            byte[] A003 = A00(cipher, bArr, 1, 0, bArr.length);
            Cipher cipher2 = (Cipher) A06.get();
            cipher2.init(1, secretKeySpec, new IvParameterSpec(A002));
            cipher2.doFinal(plaintext, 0, length, bArr2, i);
            byte[] A004 = A00(cipher, bArr2, 2, i, length);
            do {
                bArr2[i2 + i3] = (byte) ((A003[i3] ^ A002[i3]) ^ A004[i3]);
                i3++;
            } while (i3 < 16);
            byte[] bArr3 = this.A04;
            if (bArr3.length != 0) {
                return AbstractC63315ShN.A01(bArr3, bArr2);
            }
            return bArr2;
        }
        throw AbstractC58318PtA.A0x("plaintext too long");
    }

    public T8Z(final byte[] key, byte[] ivSizeInBytes, int outputPrefix) {
        int i;
        int i2;
        if (A05.A00()) {
            if (outputPrefix != 12 && outputPrefix != 16) {
                throw AbstractC166987dD.A12("IV size should be either 12 or 16 bytes");
            }
            this.A00 = outputPrefix;
            AbstractC58563Pxf.A01(key.length);
            SecretKeySpec A16 = AbstractC58318PtA.A16("AES", key);
            this.A01 = A16;
            Cipher cipher = (Cipher) A07.get();
            cipher.init(1, A16);
            byte[] doFinal = cipher.doFinal(new byte[16]);
            byte[] bArr = new byte[16];
            int i3 = 0;
            do {
                i = i3 + 1;
                AbstractC58318PtA.A19((doFinal[i3] << 1) ^ ((doFinal[i] & 255) >>> 7), bArr, i3);
                i3 = i;
            } while (i < 15);
            bArr[15] = (byte) (((doFinal[0] >> 7) & 135) ^ (doFinal[15] << 1));
            this.A02 = bArr;
            byte[] bArr2 = new byte[16];
            int i4 = 0;
            do {
                i2 = i4 + 1;
                AbstractC58318PtA.A19((bArr[i4] << 1) ^ ((bArr[i2] & 255) >>> 7), bArr2, i4);
                i4 = i2;
            } while (i2 < 15);
            bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (bArr[15] << 1));
            this.A03 = bArr2;
            this.A04 = ivSizeInBytes;
            return;
        }
        throw AbstractC58318PtA.A0x("Can not use AES-EAX in FIPS-mode.");
    }
}
