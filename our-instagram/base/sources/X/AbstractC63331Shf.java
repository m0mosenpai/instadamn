package X;

import java.math.BigInteger;

/* renamed from: X.Shf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63331Shf {
    public static final C62717SNg A00;
    public static final C62500SEc A01;
    public static final C62500SEc A02;
    public static final C62501SEd A03;
    public static final C62501SEd A04;
    public static final C62502SEe A05;
    public static final C62503SEf A06;
    public static final C62717SNg A07;
    public static final C62717SNg A08;
    public static final C62717SNg A09;
    public static final C58526Pwu A0A;
    public static final C58526Pwu A0B;

    public static C58526Pwu A03(RTZ kemId, byte[] publicKeyBytes) {
        int i;
        BigInteger bigInteger = new BigInteger(1, publicKeyBytes);
        byte[] bArr = AbstractC63126SdU.A00;
        if (kemId == RTZ.A03) {
            i = 32;
        } else if (kemId == RTZ.A00) {
            i = 65;
        } else if (kemId == RTZ.A01) {
            i = 97;
        } else if (kemId == RTZ.A02) {
            i = 133;
        } else {
            throw AbstractC58318PtA.A0x("Unrecognized HPKE KEM identifier");
        }
        return C58526Pwu.A00(SSS.A01(bigInteger, i));
    }

    public static C60789RTa A00(C60840RUz outputPrefixType, PxH protoParams) {
        Rj1 rj1;
        EnumC61236Riy enumC61236Riy;
        EnumC61235Rix enumC61235Rix;
        SY6 sy6 = (SY6) A00.A01(protoParams);
        C62717SNg c62717SNg = A09;
        int i = outputPrefixType.kem_;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            rj1 = Rj1.UNRECOGNIZED;
                        } else {
                            rj1 = Rj1.DHKEM_P521_HKDF_SHA512;
                        }
                    } else {
                        rj1 = Rj1.DHKEM_P384_HKDF_SHA384;
                    }
                } else {
                    rj1 = Rj1.DHKEM_P256_HKDF_SHA256;
                }
            } else {
                rj1 = Rj1.DHKEM_X25519_HKDF_SHA256;
            }
        } else {
            rj1 = Rj1.KEM_UNKNOWN;
        }
        RTZ rtz = (RTZ) c62717SNg.A01(rj1);
        C62717SNg c62717SNg2 = A08;
        int i2 = outputPrefixType.kdf_;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        enumC61236Riy = EnumC61236Riy.UNRECOGNIZED;
                    } else {
                        enumC61236Riy = EnumC61236Riy.HKDF_SHA512;
                    }
                } else {
                    enumC61236Riy = EnumC61236Riy.HKDF_SHA384;
                }
            } else {
                enumC61236Riy = EnumC61236Riy.HKDF_SHA256;
            }
        } else {
            enumC61236Riy = EnumC61236Riy.KDF_UNKNOWN;
        }
        RTY rty = (RTY) c62717SNg2.A01(enumC61236Riy);
        C62717SNg c62717SNg3 = A07;
        int i3 = outputPrefixType.aead_;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        enumC61235Rix = EnumC61235Rix.UNRECOGNIZED;
                    } else {
                        enumC61235Rix = EnumC61235Rix.CHACHA20_POLY1305;
                    }
                } else {
                    enumC61235Rix = EnumC61235Rix.AES_256_GCM;
                }
            } else {
                enumC61235Rix = EnumC61235Rix.AES_128_GCM;
            }
        } else {
            enumC61235Rix = EnumC61235Rix.AEAD_UNKNOWN;
        }
        return S3J.A00((RTX) c62717SNg3.A01(enumC61235Rix), rty, rtz, sy6);
    }

    public static C60840RUz A01(C60789RTa params) {
        PxQ pxQ = (PxQ) C60840RUz.DEFAULT_INSTANCE.A0F(C05F.A0Y);
        Rj1 rj1 = (Rj1) A09.A00(params.A02);
        C60840RUz c60840RUz = (C60840RUz) PxQ.A00(pxQ);
        if (rj1 != Rj1.UNRECOGNIZED) {
            c60840RUz.kem_ = rj1.A00;
            EnumC61236Riy enumC61236Riy = (EnumC61236Riy) A08.A00(params.A01);
            C60840RUz c60840RUz2 = (C60840RUz) PxQ.A00(pxQ);
            if (enumC61236Riy != EnumC61236Riy.UNRECOGNIZED) {
                c60840RUz2.kdf_ = enumC61236Riy.A00;
                EnumC61235Rix enumC61235Rix = (EnumC61235Rix) A07.A00(params.A00);
                C60840RUz c60840RUz3 = (C60840RUz) PxQ.A00(pxQ);
                if (enumC61235Rix != EnumC61235Rix.UNRECOGNIZED) {
                    c60840RUz3.aead_ = enumC61235Rix.A00;
                    return (C60840RUz) pxQ.A02();
                }
                throw AbstractC166987dD.A12("Can't get the number of an unknown enum value.");
            }
            throw AbstractC166987dD.A12("Can't get the number of an unknown enum value.");
        }
        throw AbstractC166987dD.A12("Can't get the number of an unknown enum value.");
    }

    public static RV9 A02(C60794RTf key) {
        PxQ pxQ = (PxQ) RV9.DEFAULT_INSTANCE.A0F(C05F.A0Y);
        ((RV9) PxQ.A00(pxQ)).version_ = 0;
        C60840RUz A012 = A01(key.A00);
        RV9 rv9 = (RV9) PxQ.A00(pxQ);
        A012.getClass();
        rv9.params_ = A012;
        rv9.bitField0_ |= 1;
        byte[] A013 = key.A02.A01();
        ((RV9) PxQ.A00(pxQ)).publicKey_ = AbstractC58536Px4.A01(A013, 0, A013.length);
        return (RV9) pxQ.A02();
    }

    static {
        C58526Pwu A012 = AbstractC58538Px6.A01("type.googleapis.com/google.crypto.tink.HpkePrivateKey");
        A0A = A012;
        C58526Pwu A013 = AbstractC58538Px6.A01("type.googleapis.com/google.crypto.tink.HpkePublicKey");
        A0B = A013;
        A06 = new C62503SEf(new C58365Pu5(9), C60789RTa.class);
        A05 = C58366Pu6.A00(A012, 9);
        A04 = new C62501SEd(new C58363Pu3(9), C60794RTf.class);
        A02 = C58367Pu7.A00(A013, 9);
        A03 = new C62501SEd(new C58363Pu3(10), C60792RTd.class);
        A01 = C58367Pu7.A00(A012, 10);
        SYK syk = new SYK();
        syk.A01(PxH.RAW, SY6.A02);
        syk.A01(PxH.TINK, SY6.A03);
        PxH pxH = PxH.LEGACY;
        SY6 sy6 = SY6.A01;
        syk.A01(pxH, sy6);
        A00 = SYK.A00(syk, PxH.CRUNCHY, sy6);
        SYK syk2 = new SYK();
        syk2.A01(Rj1.DHKEM_P256_HKDF_SHA256, RTZ.A00);
        syk2.A01(Rj1.DHKEM_P384_HKDF_SHA384, RTZ.A01);
        syk2.A01(Rj1.DHKEM_P521_HKDF_SHA512, RTZ.A02);
        A09 = SYK.A00(syk2, Rj1.DHKEM_X25519_HKDF_SHA256, RTZ.A03);
        SYK syk3 = new SYK();
        syk3.A01(EnumC61236Riy.HKDF_SHA256, RTY.A00);
        syk3.A01(EnumC61236Riy.HKDF_SHA384, RTY.A01);
        A08 = SYK.A00(syk3, EnumC61236Riy.HKDF_SHA512, RTY.A02);
        SYK syk4 = new SYK();
        syk4.A01(EnumC61235Rix.AES_128_GCM, RTX.A00);
        syk4.A01(EnumC61235Rix.AES_256_GCM, RTX.A01);
        A07 = SYK.A00(syk4, EnumC61235Rix.CHACHA20_POLY1305, RTX.A02);
    }
}
