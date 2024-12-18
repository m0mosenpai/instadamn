package X;

import java.math.BigInteger;

/* renamed from: X.VMo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68328VMo {
    public static byte[] A00(Integer num, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        int intValue = num.intValue();
        if (intValue != 0 && intValue != 1) {
            if (intValue == 2) {
                if (bigInteger != null) {
                    if (bigInteger2 != null) {
                        if (bigInteger.signum() == 1) {
                            byte[] byteArray = bigInteger.toByteArray();
                            if (byteArray[0] == 0) {
                                byteArray = AbstractC06960Yn.A0X(byteArray, 1, byteArray.length);
                            }
                            int length = byteArray.length;
                            if (1 <= length && length < 33) {
                                if (bigInteger2.signum() == 1) {
                                    byte[] byteArray2 = bigInteger2.toByteArray();
                                    if (byteArray2[0] == 0) {
                                        byteArray2 = AbstractC06960Yn.A0X(byteArray2, 1, byteArray2.length);
                                    }
                                    int length2 = byteArray2.length;
                                    if (1 <= length2 && length2 < 33) {
                                        byte[] bArr = {64};
                                        if (AbstractC43593JPy.A1Z(32, length)) {
                                            byte[] bArr2 = new byte[32];
                                            System.arraycopy(byteArray, 0, bArr2, 32 - length, length);
                                            byte[] A0Y = AbstractC06960Yn.A0Y(bArr, bArr2);
                                            byte[] bArr3 = new byte[32];
                                            System.arraycopy(byteArray2, 0, bArr3, 32 - length2, length2);
                                            return AbstractC06960Yn.A0Y(A0Y, bArr3);
                                        }
                                        throw new IllegalArgumentException("Length must be greater than or equal to the size of the array");
                                    }
                                    throw new UtJ("y must be an unsigned 32-byte integer");
                                }
                                throw new IllegalArgumentException("The BigInteger value must be positive");
                            }
                            throw new UtJ("x must be an unsigned 32-byte integer");
                        }
                        throw new IllegalArgumentException("The BigInteger value must be positive");
                    }
                    throw new UtJ("ECDSAP256 Y must be set");
                }
                throw new UtJ("ECDSAP256 X must be set");
            }
            throw new UtJ(AnonymousClass001.A0R("Unsupporetd key parameters: ", AbstractC69831VwH.A01(num)));
        }
        if (bigInteger3 != null) {
            if (bigInteger4 != null) {
                BigInteger bigInteger5 = BigInteger.ZERO;
                if (!bigInteger3.equals(bigInteger5) && !bigInteger4.equals(bigInteger5)) {
                    if (bigInteger3.signum() == 1) {
                        byte[] byteArray3 = bigInteger3.toByteArray();
                        if (byteArray3[0] == 0) {
                            byteArray3 = AbstractC06960Yn.A0X(byteArray3, 1, byteArray3.length);
                        }
                        int length3 = byteArray3.length;
                        if (1 <= length3 && length3 < 65536) {
                            if (bigInteger4.signum() == 1) {
                                byte[] byteArray4 = bigInteger4.toByteArray();
                                if (byteArray4[0] == 0) {
                                    byteArray4 = AbstractC06960Yn.A0X(byteArray4, 1, byteArray4.length);
                                }
                                int length4 = byteArray4.length;
                                if (1 <= length4 && length4 < 256) {
                                    short s = (short) length3;
                                    byte[] bArr4 = new byte[2];
                                    AbstractC65702TsY.A0s(s & 65535, bArr4, 0, 1);
                                    return AbstractC06960Yn.A0Y(AbstractC06960Yn.A0Y(AbstractC06960Yn.A0Y(bArr4, byteArray3), new byte[]{(byte) length4}), byteArray4);
                                }
                                throw new UtJ("Public exponent must be between 1 and 255 bytes");
                            }
                            throw new IllegalArgumentException("The BigInteger value must be positive");
                        }
                        throw new UtJ("Modulus must be between 1 and 65535 bytes");
                    }
                    throw new IllegalArgumentException("The BigInteger value must be positive");
                }
                throw new UtJ("RSA modulus and public exponent must be nonzero.");
            }
            throw new UtJ("RSA public exponent must be set.");
        }
        throw new UtJ("RSA modulus must be set.");
    }
}
