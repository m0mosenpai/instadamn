package X;

import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* renamed from: X.SjD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63391SjD {
    public static final ECParameterSpec A00 = A05("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5");
    public static final ECParameterSpec A01 = A05("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f");
    public static final ECParameterSpec A02 = A05("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650");
    public static final BigInteger A06 = BigInteger.valueOf(2);
    public static final BigInteger A05 = BigInteger.valueOf(3);
    public static final BigInteger A04 = BigInteger.valueOf(4);
    public static final BigInteger A03 = BigInteger.valueOf(8);

    /* JADX WARN: Type inference failed for: r12v2, types: [X.SH2, java.lang.Object] */
    public static SH2 A00(SH2 p1, SH2 p2, BigInteger a, BigInteger modulus) {
        BigInteger bigInteger = p1.A02;
        BigInteger bigInteger2 = BigInteger.ZERO;
        if (!bigInteger.equals(bigInteger2)) {
            if (!p2.A02.equals(bigInteger2)) {
                BigInteger bigInteger3 = p1.A02;
                BigInteger A0y = AbstractC58319PtB.A0y(bigInteger3, modulus);
                BigInteger bigInteger4 = p2.A02;
                BigInteger A0y2 = AbstractC58319PtB.A0y(bigInteger4, modulus);
                BigInteger A032 = A03(p1.A00, A0y2, modulus);
                BigInteger A033 = A03(p2.A00, A0y, modulus);
                BigInteger A034 = A03(A03(p1.A01, bigInteger4, modulus), A0y2, modulus);
                BigInteger A035 = A03(A03(p2.A01, bigInteger3, modulus), A0y, modulus);
                if (A032.equals(A033)) {
                    if (!A034.equals(A035)) {
                        return SH2.A03;
                    }
                    return A01(p1, a, modulus);
                }
                BigInteger mod = A033.subtract(A032).mod(modulus);
                BigInteger A036 = A03(mod.multiply(A04), mod, modulus);
                BigInteger A037 = A03(mod, A036, modulus);
                BigInteger subtract = A035.subtract(A034);
                BigInteger bigInteger5 = A06;
                BigInteger A038 = A03(subtract, bigInteger5, modulus);
                BigInteger A039 = A03(A032, A036, modulus);
                BigInteger mod2 = AbstractC58319PtB.A0y(A038, modulus).subtract(A037).subtract(A039.multiply(bigInteger5)).mod(modulus);
                BigInteger mod3 = A038.multiply(A039.subtract(mod2)).subtract(A034.multiply(bigInteger5).multiply(A037)).mod(modulus);
                BigInteger A0310 = A03(AbstractC58319PtB.A0y(bigInteger3.add(bigInteger4), modulus).subtract(A0y).subtract(A0y2), mod, modulus);
                ?? obj = new Object();
                obj.A00 = mod2;
                obj.A01 = mod3;
                obj.A02 = A0310;
                return obj;
            }
            return p1;
        }
        return p2;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [X.SH2, java.lang.Object] */
    public static SH2 A01(SH2 p, BigInteger a, BigInteger modulus) {
        BigInteger bigInteger = p.A01;
        if (bigInteger.equals(BigInteger.ZERO)) {
            return SH2.A03;
        }
        BigInteger bigInteger2 = p.A00;
        BigInteger A0y = AbstractC58319PtB.A0y(bigInteger2, modulus);
        BigInteger A0y2 = AbstractC58319PtB.A0y(bigInteger, modulus);
        BigInteger A0y3 = AbstractC58319PtB.A0y(A0y2, modulus);
        BigInteger bigInteger3 = p.A02;
        BigInteger A0y4 = AbstractC58319PtB.A0y(bigInteger3, modulus);
        BigInteger subtract = AbstractC58319PtB.A0y(bigInteger2.add(A0y2), modulus).subtract(A0y).subtract(A0y3);
        BigInteger bigInteger4 = A06;
        BigInteger multiply = subtract.multiply(bigInteger4);
        BigInteger add = A0y.multiply(A05).add(A03(a.multiply(A0y4), A0y4, modulus));
        BigInteger mod = AbstractC58319PtB.A0y(add, modulus).subtract(multiply.multiply(bigInteger4)).mod(modulus);
        BigInteger mod2 = A03(add, multiply.subtract(mod), modulus).subtract(A0y3.multiply(A03)).mod(modulus);
        BigInteger mod3 = AbstractC58319PtB.A0y(bigInteger.add(bigInteger3), modulus).subtract(A0y2).subtract(A0y4).mod(modulus);
        ?? obj = new Object();
        obj.A00 = mod;
        obj.A01 = mod2;
        obj.A02 = mod3;
        return obj;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [X.SH2, java.lang.Object] */
    public static SH2 A02(BigInteger p, ECPoint modulus) {
        if (modulus.equals(ECPoint.POINT_INFINITY)) {
            return SH2.A03;
        }
        BigInteger mod = new BigInteger(1, AbstractC58567Pxj.A00((p.bitLength() + 8) / 8)).mod(p);
        BigInteger A0y = AbstractC58319PtB.A0y(mod, p);
        BigInteger A032 = A03(A0y, mod, p);
        BigInteger A033 = A03(modulus.getAffineX(), A0y, p);
        BigInteger A034 = A03(modulus.getAffineY(), A032, p);
        ?? obj = new Object();
        obj.A00 = A033;
        obj.A01 = A034;
        obj.A02 = mod;
        return obj;
    }

    public static ECParameterSpec A05(String decimalP, String decimalN, String hexB, String hexGX, String hexGY) {
        BigInteger bigInteger = new BigInteger(decimalP);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger(hexB, 16)), new ECPoint(new BigInteger(hexGX, 16), new BigInteger(hexGY, 16)), new BigInteger(decimalN), 1);
    }

    public static ECPoint A06(BigInteger x, ECParameterSpec spec) {
        ECPoint eCPoint;
        if (!A08(spec, A00) && !A08(spec, A01) && !A08(spec, A02)) {
            throw AbstractC58318PtA.A0x("spec must be NIST P256, P384 or P521");
        }
        if (x.signum() == 1) {
            if (x.compareTo(spec.getOrder()) < 0) {
                EllipticCurve curve = spec.getCurve();
                ECPoint generator = spec.getGenerator();
                A07(generator, curve);
                BigInteger a = spec.getCurve().getA();
                BigInteger A042 = A04(curve);
                SH2 A022 = A02(A042, ECPoint.POINT_INFINITY);
                SH2 A023 = A02(A042, generator);
                for (int bitLength = x.bitLength(); bitLength >= 0; bitLength--) {
                    if (x.testBit(bitLength)) {
                        A022 = A00(A022, A023, a, A042);
                        A023 = A01(A023, a, A042);
                    } else {
                        A023 = A00(A022, A023, a, A042);
                        A022 = A01(A022, a, A042);
                    }
                }
                if (A022.A02.equals(BigInteger.ZERO)) {
                    eCPoint = ECPoint.POINT_INFINITY;
                } else {
                    BigInteger modInverse = A022.A02.modInverse(A042);
                    BigInteger A0y = AbstractC58319PtB.A0y(modInverse, A042);
                    eCPoint = new ECPoint(A03(A022.A00, A0y, A042), A03(A03(A022.A01, A0y, A042), modInverse, A042));
                }
                A07(eCPoint, curve);
                return eCPoint;
            }
            throw AbstractC58318PtA.A0x("k must be smaller than the order of the generator");
        }
        throw AbstractC58318PtA.A0x("k must be positive");
    }

    public static BigInteger A03(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        return bigInteger.multiply(bigInteger2).mod(bigInteger3);
    }

    public static BigInteger A04(EllipticCurve curve) {
        ECField field = curve.getField();
        if (field instanceof ECFieldFp) {
            return ((ECFieldFp) field).getP();
        }
        throw AbstractC58318PtA.A0x("Only curves over prime order fields are supported");
    }

    public static void A07(ECPoint point, EllipticCurve ec) {
        BigInteger A042 = A04(ec);
        BigInteger affineX = point.getAffineX();
        BigInteger affineY = point.getAffineY();
        if (affineX != null && affineY != null) {
            if (affineX.signum() != -1 && affineX.compareTo(A042) < 0) {
                if (affineY.signum() != -1 && affineY.compareTo(A042) < 0) {
                    if (AbstractC58319PtB.A0y(affineY, A042).equals(affineX.multiply(affineX).add(ec.getA()).multiply(affineX).add(ec.getB()).mod(A042))) {
                        return;
                    } else {
                        throw AbstractC58318PtA.A0x("Point is not on curve");
                    }
                }
                throw AbstractC58318PtA.A0x("y is out of range");
            }
            throw AbstractC58318PtA.A0x("x is out of range");
        }
        throw AbstractC58318PtA.A0x("point is at infinity");
    }

    public static boolean A08(ECParameterSpec one, ECParameterSpec two) {
        if (one.getCurve().equals(two.getCurve()) && one.getGenerator().equals(two.getGenerator()) && one.getOrder().equals(two.getOrder()) && one.getCofactor() == two.getCofactor()) {
            return true;
        }
        return false;
    }
}
