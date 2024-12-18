package X;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

/* renamed from: X.ShO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63316ShO {
    public static ECParameterSpec A00(EnumC61105RfK curve) {
        int ordinal = curve.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return AbstractC63391SjD.A02;
                }
                throw new NoSuchAlgorithmException(AbstractC167017dG.A0n(curve, "curve not implemented:", AbstractC166987dD.A1C()));
            }
            return AbstractC63391SjD.A01;
        }
        return AbstractC63391SjD.A00;
    }

    public static ECPoint A01(EllipticCurve ellipticCurve, byte[] bArr) {
        int bitLength = (AbstractC63391SjD.A04(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
        int length = bArr.length;
        if (length == (bitLength * 2) + 1) {
            if (bArr[0] == 4) {
                int i = bitLength + 1;
                ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i)), new BigInteger(1, Arrays.copyOfRange(bArr, i, length)));
                AbstractC63391SjD.A07(eCPoint, ellipticCurve);
                return eCPoint;
            }
            throw AbstractC58318PtA.A0x("invalid point format");
        }
        throw AbstractC58318PtA.A0x("invalid point size");
    }

    public static void A02(ECPrivateKey publicKey, ECPublicKey privateKey) {
        try {
            if (AbstractC63391SjD.A08(privateKey.getParams(), publicKey.getParams())) {
            } else {
                throw AbstractC58318PtA.A0x("invalid public key spec");
            }
        } catch (IllegalArgumentException | NullPointerException e) {
            throw new GeneralSecurityException(e);
        }
    }

    public static byte[] A03(EnumC61106RfL curve, ECPoint format, EllipticCurve point) {
        byte[] bArr;
        byte b;
        AbstractC63391SjD.A07(format, point);
        int bitLength = (AbstractC63391SjD.A04(point).subtract(BigInteger.ONE).bitLength() + 7) / 8;
        int ordinal = curve.ordinal();
        if (ordinal != 0) {
            int i = 2;
            if (ordinal != 2) {
                if (ordinal == 1) {
                    int i2 = bitLength + 1;
                    bArr = new byte[i2];
                    byte[] A00 = SSS.A00(format.getAffineX());
                    int length = A00.length;
                    System.arraycopy(A00, 0, bArr, i2 - length, length);
                    if (format.getAffineY().testBit(0)) {
                        i = 3;
                    }
                    b = (byte) i;
                } else {
                    throw AbstractC58320PtC.A19(curve, "invalid format:", AbstractC166987dD.A1C());
                }
            } else {
                int i3 = bitLength * 2;
                byte[] bArr2 = new byte[i3];
                byte[] A002 = SSS.A00(format.getAffineX());
                int length2 = A002.length;
                if (length2 > bitLength) {
                    A002 = Arrays.copyOfRange(A002, length2 - bitLength, length2);
                }
                byte[] A003 = SSS.A00(format.getAffineY());
                int length3 = A003.length;
                if (length3 > bitLength) {
                    A003 = Arrays.copyOfRange(A003, length3 - bitLength, length3);
                }
                int length4 = A003.length;
                System.arraycopy(A003, 0, bArr2, i3 - length4, length4);
                int length5 = A002.length;
                System.arraycopy(A002, 0, bArr2, bitLength - length5, length5);
                return bArr2;
            }
        } else {
            int i4 = (bitLength * 2) + 1;
            bArr = new byte[i4];
            byte[] A004 = SSS.A00(format.getAffineX());
            byte[] A005 = SSS.A00(format.getAffineY());
            int length6 = A005.length;
            System.arraycopy(A005, 0, bArr, i4 - length6, length6);
            int length7 = A004.length;
            System.arraycopy(A004, 0, bArr, (bitLength + 1) - length7, length7);
            b = 4;
        }
        bArr[0] = b;
        return bArr;
    }

    public static byte[] A04(ECPrivateKey myPrivateKey, ECPublicKey peerPublicKey) {
        A02(myPrivateKey, peerPublicKey);
        ECPoint w = peerPublicKey.getW();
        AbstractC63391SjD.A07(w, myPrivateKey.getParams().getCurve());
        PublicKey A01 = InterfaceC65621ToC.A01(myPrivateKey.getParams(), w);
        KeyAgreement keyAgreement = (KeyAgreement) InterfaceC65621ToC.A00(C62890SVv.A02, "ECDH");
        keyAgreement.init(myPrivateKey);
        try {
            keyAgreement.doPhase(A01, true);
            byte[] generateSecret = keyAgreement.generateSecret();
            EllipticCurve curve = myPrivateKey.getParams().getCurve();
            BigInteger bigInteger = new BigInteger(1, generateSecret);
            if (bigInteger.signum() != -1 && bigInteger.compareTo(AbstractC63391SjD.A04(curve)) < 0) {
                BigInteger A04 = AbstractC63391SjD.A04(curve);
                BigInteger mod = bigInteger.multiply(bigInteger).add(curve.getA()).multiply(bigInteger).add(curve.getB()).mod(A04);
                if (A04.signum() == 1) {
                    BigInteger mod2 = mod.mod(A04);
                    BigInteger bigInteger2 = null;
                    BigInteger bigInteger3 = BigInteger.ZERO;
                    if (!mod2.equals(bigInteger3)) {
                        int i = 0;
                        if (A04.testBit(0) && A04.testBit(1)) {
                            bigInteger2 = mod2.modPow(A04.add(BigInteger.ONE).shiftRight(2), A04);
                        } else {
                            if (A04.testBit(0) && !A04.testBit(1)) {
                                bigInteger2 = BigInteger.ONE;
                                BigInteger bigInteger4 = bigInteger2;
                                BigInteger shiftRight = A04.subtract(bigInteger2).shiftRight(1);
                                while (true) {
                                    BigInteger mod3 = bigInteger2.multiply(bigInteger2).subtract(mod2).mod(A04);
                                    if (mod3.equals(bigInteger3)) {
                                        break;
                                    }
                                    BigInteger modPow = mod3.modPow(shiftRight, A04);
                                    if (modPow.add(bigInteger4).equals(A04)) {
                                        BigInteger shiftRight2 = A04.add(bigInteger4).shiftRight(1);
                                        BigInteger bigInteger5 = bigInteger2;
                                        for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                                            BigInteger multiply = bigInteger5.multiply(bigInteger4);
                                            bigInteger5 = bigInteger5.multiply(bigInteger5).add(AbstractC58319PtB.A0y(bigInteger4, A04).multiply(mod3)).mod(A04);
                                            bigInteger4 = multiply.add(multiply).mod(A04);
                                            if (shiftRight2.testBit(bitLength)) {
                                                BigInteger mod4 = bigInteger5.multiply(bigInteger2).add(bigInteger4.multiply(mod3)).mod(A04);
                                                bigInteger4 = bigInteger2.multiply(bigInteger4).add(bigInteger5).mod(A04);
                                                bigInteger5 = mod4;
                                            }
                                        }
                                        bigInteger2 = bigInteger5;
                                    } else if (modPow.equals(bigInteger4)) {
                                        bigInteger2 = bigInteger2.add(bigInteger4);
                                        i++;
                                        if (i == 128 && !A04.isProbablePrime(80)) {
                                            throw new InvalidAlgorithmParameterException("p is not prime");
                                        }
                                    } else {
                                        throw new InvalidAlgorithmParameterException("p is not prime");
                                    }
                                }
                            }
                            bigInteger3 = bigInteger2;
                        }
                        if (bigInteger2 != null && AbstractC58319PtB.A0y(bigInteger2, A04).compareTo(mod2) != 0) {
                            throw AbstractC58318PtA.A0x("Could not find a modular square root");
                        }
                        bigInteger3 = bigInteger2;
                    }
                    if (true != bigInteger3.testBit(0)) {
                        A04.subtract(bigInteger3).mod(A04);
                    }
                    return generateSecret;
                }
                throw new InvalidAlgorithmParameterException("p must be positive");
            }
            throw AbstractC58318PtA.A0x("shared secret is out of range");
        } catch (IllegalStateException e) {
            throw new GeneralSecurityException(e);
        }
    }
}
