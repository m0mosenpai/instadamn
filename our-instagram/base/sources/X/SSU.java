package X;

import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes10.dex */
public abstract class SSU {
    public static byte[] A00(byte[] privateKey) {
        if (privateKey.length == 32) {
            byte[] bArr = new byte[32];
            bArr[0] = 9;
            return A01(privateKey, bArr);
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }

    public static byte[] A01(byte[] privateKey, byte[] peersPublicValue) {
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        if (privateKey.length == 32) {
            long[] jArr4 = new long[11];
            byte[] copyOf = Arrays.copyOf(privateKey, 32);
            copyOf[0] = (byte) (copyOf[0] & 248);
            byte b = (byte) (copyOf[31] & Byte.MAX_VALUE);
            copyOf[31] = b;
            copyOf[31] = (byte) (b | 64);
            int length = peersPublicValue.length;
            if (length == 32) {
                byte[] copyOf2 = Arrays.copyOf(peersPublicValue, length);
                copyOf2[31] = (byte) (copyOf2[31] & Byte.MAX_VALUE);
                int i = 0;
                while (true) {
                    byte[][] bArr = SU2.A00;
                    if (i < 7) {
                        if (!MessageDigest.isEqual(bArr[i], copyOf2)) {
                            i++;
                        } else {
                            throw new InvalidKeyException(AnonymousClass001.A0R("Banned public key: ", AbstractC58562Pxe.A00(bArr[i])));
                        }
                    } else {
                        long[] jArr5 = new long[10];
                        int i2 = 0;
                        do {
                            int i3 = AbstractC63386Sj2.A01[i2];
                            jArr5[i2] = (((((copyOf2[i3] & 255) | ((copyOf2[i3 + 1] & 255) << 8)) | ((copyOf2[i3 + 2] & 255) << 16)) | ((copyOf2[i3 + 3] & 255) << 24)) >> AbstractC63386Sj2.A00[i2]) & AbstractC63386Sj2.A02[i2 & 1];
                            i2++;
                        } while (i2 < 10);
                        long[] jArr6 = new long[19];
                        long[] jArr7 = new long[19];
                        jArr7[0] = 1;
                        long[] jArr8 = new long[19];
                        jArr8[0] = 1;
                        long[] jArr9 = new long[19];
                        long[] jArr10 = new long[19];
                        long[] jArr11 = new long[19];
                        long[] jArr12 = jArr11;
                        jArr11[0] = 1;
                        long[] jArr13 = new long[19];
                        long[] jArr14 = new long[19];
                        long[] jArr15 = jArr14;
                        jArr14[0] = 1;
                        System.arraycopy(jArr5, 0, jArr6, 0, 10);
                        int i4 = 0;
                        do {
                            int i5 = copyOf[(32 - i4) - 1] & 255;
                            int i6 = 0;
                            do {
                                int i7 = (i5 >> (7 - i6)) & 1;
                                SU2.A00(jArr8, jArr6, i7);
                                SU2.A00(jArr9, jArr7, i7);
                                jArr = jArr12;
                                long[] jArr16 = jArr8;
                                long[] jArr17 = jArr9;
                                long[] jArr18 = jArr7;
                                long[] jArr19 = jArr6;
                                jArr2 = jArr13;
                                jArr3 = jArr15;
                                long[] copyOf3 = Arrays.copyOf(jArr8, 10);
                                long[] jArr20 = new long[19];
                                long[] jArr21 = new long[19];
                                long[] jArr22 = new long[19];
                                long[] jArr23 = new long[19];
                                long[] jArr24 = new long[19];
                                long[] jArr25 = new long[19];
                                long[] jArr26 = new long[19];
                                AbstractC63386Sj2.A06(jArr8, jArr8, jArr9);
                                AbstractC63386Sj2.A05(jArr9, copyOf3, jArr9);
                                long[] copyOf4 = Arrays.copyOf(jArr6, 10);
                                AbstractC63386Sj2.A06(jArr6, jArr6, jArr7);
                                AbstractC63386Sj2.A05(jArr7, copyOf4, jArr7);
                                AbstractC63386Sj2.A04(jArr23, jArr6, jArr9);
                                AbstractC63386Sj2.A04(jArr24, jArr8, jArr7);
                                AbstractC63386Sj2.A01(jArr23);
                                AbstractC63386Sj2.A00(jArr23);
                                AbstractC63386Sj2.A01(jArr24);
                                AbstractC63386Sj2.A00(jArr24);
                                System.arraycopy(jArr23, 0, copyOf4, 0, 10);
                                AbstractC63386Sj2.A06(jArr23, jArr23, jArr24);
                                AbstractC63386Sj2.A05(jArr24, copyOf4, jArr24);
                                AbstractC63386Sj2.A02(jArr26, jArr23);
                                AbstractC63386Sj2.A02(jArr25, jArr24);
                                AbstractC63386Sj2.A04(jArr24, jArr25, jArr5);
                                AbstractC63386Sj2.A01(jArr24);
                                AbstractC63386Sj2.A00(jArr24);
                                System.arraycopy(jArr26, 0, jArr10, 0, 10);
                                System.arraycopy(jArr24, 0, jArr12, 0, 10);
                                AbstractC63386Sj2.A02(jArr21, jArr8);
                                AbstractC63386Sj2.A02(jArr22, jArr9);
                                AbstractC63386Sj2.A04(jArr13, jArr21, jArr22);
                                AbstractC63386Sj2.A01(jArr13);
                                AbstractC63386Sj2.A00(jArr13);
                                AbstractC63386Sj2.A05(jArr22, jArr21, jArr22);
                                Arrays.fill(jArr20, 10, 18, 0L);
                                int i8 = 0;
                                do {
                                    jArr20[i8] = jArr22[i8] * 121665;
                                    i8++;
                                } while (i8 < 10);
                                AbstractC63386Sj2.A00(jArr20);
                                AbstractC63386Sj2.A06(jArr20, jArr20, jArr21);
                                AbstractC63386Sj2.A04(jArr15, jArr22, jArr20);
                                AbstractC63386Sj2.A01(jArr15);
                                AbstractC63386Sj2.A00(jArr15);
                                SU2.A00(jArr13, jArr10, i7);
                                long[] jArr27 = jArr15;
                                long[] jArr28 = jArr12;
                                SU2.A00(jArr27, jArr28, i7);
                                i6++;
                                jArr7 = jArr28;
                                jArr9 = jArr27;
                                jArr8 = jArr13;
                                jArr6 = jArr10;
                                jArr15 = jArr17;
                                jArr13 = jArr16;
                                jArr12 = jArr18;
                                jArr10 = jArr19;
                            } while (i6 < 8);
                            i4++;
                        } while (i4 < 32);
                        long[] jArr29 = new long[10];
                        long[] jArr30 = new long[10];
                        long[] jArr31 = new long[10];
                        long[] jArr32 = new long[10];
                        long[] jArr33 = new long[10];
                        long[] jArr34 = new long[10];
                        long[] jArr35 = new long[10];
                        long[] jArr36 = new long[10];
                        long[] jArr37 = new long[10];
                        long[] jArr38 = new long[10];
                        long[] jArr39 = new long[10];
                        AbstractC63386Sj2.A02(jArr30, jArr3);
                        AbstractC63386Sj2.A02(jArr39, jArr30);
                        AbstractC63386Sj2.A02(jArr38, jArr39);
                        AbstractC63386Sj2.A03(jArr31, jArr38, jArr3);
                        AbstractC63386Sj2.A03(jArr32, jArr31, jArr30);
                        AbstractC63386Sj2.A02(jArr38, jArr32);
                        AbstractC63386Sj2.A03(jArr33, jArr38, jArr31);
                        AbstractC63386Sj2.A02(jArr38, jArr33);
                        AbstractC63386Sj2.A02(jArr39, jArr38);
                        AbstractC63386Sj2.A02(jArr38, jArr39);
                        AbstractC63386Sj2.A02(jArr39, jArr38);
                        AbstractC63386Sj2.A02(jArr38, jArr39);
                        AbstractC63386Sj2.A03(jArr34, jArr38, jArr33);
                        AbstractC63386Sj2.A02(jArr38, jArr34);
                        AbstractC63386Sj2.A02(jArr39, jArr38);
                        int i9 = 2;
                        int i10 = 2;
                        do {
                            AbstractC63386Sj2.A02(jArr38, jArr39);
                            AbstractC63386Sj2.A02(jArr39, jArr38);
                            i10 += 2;
                        } while (i10 < 10);
                        AbstractC63386Sj2.A03(jArr35, jArr39, jArr34);
                        AbstractC63386Sj2.A02(jArr38, jArr35);
                        AbstractC63386Sj2.A02(jArr39, jArr38);
                        int i11 = 2;
                        do {
                            AbstractC63386Sj2.A02(jArr38, jArr39);
                            AbstractC63386Sj2.A02(jArr39, jArr38);
                            i11 += 2;
                        } while (i11 < 20);
                        AbstractC63386Sj2.A03(jArr38, jArr39, jArr35);
                        AbstractC63386Sj2.A02(jArr39, jArr38);
                        AbstractC63386Sj2.A02(jArr38, jArr39);
                        int i12 = 2;
                        do {
                            AbstractC63386Sj2.A02(jArr39, jArr38);
                            AbstractC63386Sj2.A02(jArr38, jArr39);
                            i12 += 2;
                        } while (i12 < 10);
                        AbstractC63386Sj2.A03(jArr36, jArr38, jArr34);
                        AbstractC63386Sj2.A02(jArr38, jArr36);
                        AbstractC63386Sj2.A02(jArr39, jArr38);
                        int i13 = 2;
                        do {
                            AbstractC63386Sj2.A02(jArr38, jArr39);
                            AbstractC63386Sj2.A02(jArr39, jArr38);
                            i13 += 2;
                        } while (i13 < 50);
                        AbstractC63386Sj2.A03(jArr37, jArr39, jArr36);
                        AbstractC63386Sj2.A02(jArr39, jArr37);
                        AbstractC63386Sj2.A02(jArr38, jArr39);
                        int i14 = 2;
                        do {
                            AbstractC63386Sj2.A02(jArr39, jArr38);
                            AbstractC63386Sj2.A02(jArr38, jArr39);
                            i14 += 2;
                        } while (i14 < 100);
                        AbstractC63386Sj2.A03(jArr39, jArr38, jArr37);
                        AbstractC63386Sj2.A02(jArr38, jArr39);
                        AbstractC63386Sj2.A02(jArr39, jArr38);
                        do {
                            AbstractC63386Sj2.A02(jArr38, jArr39);
                            AbstractC63386Sj2.A02(jArr39, jArr38);
                            i9 += 2;
                        } while (i9 < 50);
                        AbstractC63386Sj2.A03(jArr38, jArr39, jArr36);
                        AbstractC63386Sj2.A02(jArr39, jArr38);
                        AbstractC63386Sj2.A02(jArr38, jArr39);
                        AbstractC63386Sj2.A02(jArr39, jArr38);
                        AbstractC63386Sj2.A02(jArr38, jArr39);
                        AbstractC63386Sj2.A02(jArr39, jArr38);
                        AbstractC63386Sj2.A03(jArr29, jArr39, jArr32);
                        AbstractC63386Sj2.A03(jArr4, jArr2, jArr29);
                        long[] jArr40 = new long[10];
                        long[] jArr41 = new long[10];
                        long[] jArr42 = new long[11];
                        long[] jArr43 = new long[11];
                        long[] jArr44 = new long[11];
                        AbstractC63386Sj2.A03(jArr40, jArr5, jArr4);
                        AbstractC63386Sj2.A06(jArr41, jArr5, jArr4);
                        long[] jArr45 = new long[10];
                        jArr45[0] = 486662;
                        AbstractC63386Sj2.A06(jArr43, jArr41, jArr45);
                        AbstractC63386Sj2.A03(jArr43, jArr43, jArr);
                        AbstractC63386Sj2.A06(jArr43, jArr43, jArr6);
                        AbstractC63386Sj2.A03(jArr43, jArr43, jArr40);
                        AbstractC63386Sj2.A03(jArr43, jArr43, jArr6);
                        int i15 = 0;
                        do {
                            jArr42[i15] = jArr43[i15] * 4;
                            i15++;
                        } while (i15 < 10);
                        AbstractC63386Sj2.A00(jArr42);
                        AbstractC63386Sj2.A03(jArr43, jArr40, jArr);
                        AbstractC63386Sj2.A05(jArr43, jArr43, jArr);
                        AbstractC63386Sj2.A03(jArr44, jArr41, jArr6);
                        AbstractC63386Sj2.A06(jArr43, jArr43, jArr44);
                        AbstractC63386Sj2.A02(jArr43, jArr43);
                        if (MessageDigest.isEqual(AbstractC63386Sj2.A07(jArr42), AbstractC63386Sj2.A07(jArr43))) {
                            return AbstractC63386Sj2.A07(jArr4);
                        }
                        throw AbstractC31175DnJ.A0V("Arithmetic error in curve multiplication with the public key: ", AbstractC58562Pxe.A00(peersPublicValue));
                    }
                }
            } else {
                throw new InvalidKeyException("Public key length is not 32-byte");
            }
        } else {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
    }
}
