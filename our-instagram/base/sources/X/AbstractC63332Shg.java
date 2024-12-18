package X;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* renamed from: X.Shg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63332Shg {
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

    public static int A00(SY7 curveType) {
        if (SY7.A01.equals(curveType)) {
            return 33;
        }
        if (SY7.A02.equals(curveType)) {
            return 49;
        }
        if (SY7.A03.equals(curveType)) {
            return 67;
        }
        throw AbstractC58320PtC.A19(curveType, "Unable to serialize CurveType ", AbstractC166987dD.A1C());
    }

    public static C60790RTb A01(RV4 outputPrefixType, PxH protoParams) {
        EnumC61234Riw enumC61234Riw;
        EnumC61234Riw enumC61234Riw2;
        RVD rvd = RVD.DEFAULT_INSTANCE;
        RUZ ruz = (RUZ) ((PxQ) rvd.A0F(C05F.A0Y));
        C60821RUg c60821RUg = outputPrefixType.demParams_;
        if (c60821RUg == null) {
            c60821RUg = C60821RUg.DEFAULT_INSTANCE;
        }
        RVD rvd2 = c60821RUg.aeadDem_;
        if (rvd2 == null) {
            rvd2 = rvd;
        }
        ruz.A07(rvd2.typeUrl_);
        ruz.A05(PxH.RAW);
        C60821RUg c60821RUg2 = outputPrefixType.demParams_;
        if (c60821RUg2 == null) {
            c60821RUg2 = C60821RUg.DEFAULT_INSTANCE;
        }
        RVD rvd3 = c60821RUg2.aeadDem_;
        if (rvd3 == null) {
            rvd3 = rvd;
        }
        ruz.A06(rvd3.value_);
        AbstractC58533Px1 A022 = ruz.A02();
        java.util.Set set = C60790RTb.A06;
        SY4 sy4 = null;
        SY5 sy5 = (SY5) A00.A01(protoParams);
        C62717SNg c62717SNg = A07;
        RVC rvc = outputPrefixType.kemParams_;
        if (rvc == null) {
            rvc = RVC.DEFAULT_INSTANCE;
        }
        SY7 sy7 = (SY7) c62717SNg.A01(rvc.A0G());
        C62717SNg c62717SNg2 = A08;
        RVC rvc2 = outputPrefixType.kemParams_;
        if (rvc2 == null) {
            rvc2 = RVC.DEFAULT_INSTANCE;
        }
        Rj3 A002 = Rj3.A00(rvc2.hkdfHashType_);
        if (A002 == null) {
            A002 = Rj3.UNRECOGNIZED;
        }
        SYB syb = (SYB) c62717SNg2.A01(A002);
        AbstractC61590RqE A003 = SSQ.A00(A022.A0E());
        if (C60790RTb.A06.contains(A003)) {
            RVC rvc3 = outputPrefixType.kemParams_;
            if (rvc3 == null) {
                rvc3 = RVC.DEFAULT_INSTANCE;
            }
            C58526Pwu A004 = C58526Pwu.A00(rvc3.hkdfSalt_.A04());
            if (A004.A00.length == 0) {
                A004 = null;
            }
            RVC rvc4 = outputPrefixType.kemParams_;
            if (rvc4 == null) {
                rvc4 = RVC.DEFAULT_INSTANCE;
            }
            if (!rvc4.A0G().equals(Rj0.CURVE25519)) {
                C62717SNg c62717SNg3 = A09;
                int i = outputPrefixType.ecPointFormat_;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                enumC61234Riw2 = EnumC61234Riw.UNRECOGNIZED;
                            } else {
                                enumC61234Riw2 = EnumC61234Riw.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
                            }
                        } else {
                            enumC61234Riw2 = EnumC61234Riw.COMPRESSED;
                        }
                    } else {
                        enumC61234Riw2 = EnumC61234Riw.UNCOMPRESSED;
                    }
                } else {
                    enumC61234Riw2 = EnumC61234Riw.UNKNOWN_FORMAT;
                }
                sy4 = (SY4) c62717SNg3.A01(enumC61234Riw2);
            } else {
                int i2 = outputPrefixType.ecPointFormat_;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                enumC61234Riw = EnumC61234Riw.UNRECOGNIZED;
                            } else {
                                enumC61234Riw = EnumC61234Riw.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
                            }
                        } else {
                            enumC61234Riw = EnumC61234Riw.COMPRESSED;
                        }
                    } else {
                        enumC61234Riw = EnumC61234Riw.UNCOMPRESSED;
                    }
                } else {
                    enumC61234Riw = EnumC61234Riw.UNKNOWN_FORMAT;
                }
                if (!enumC61234Riw.equals(EnumC61234Riw.COMPRESSED)) {
                    throw AbstractC58318PtA.A0x("For CURVE25519 EcPointFormat must be compressed");
                }
            }
            return S3I.A00(A003, sy7, syb, sy4, sy5, A004);
        }
        throw AbstractC58323PtF.A0w(A003);
    }

    public static RV4 A02(C60790RTb parameters) {
        RVC rvc = RVC.DEFAULT_INSTANCE;
        Integer num = C05F.A0Y;
        PxQ pxQ = (PxQ) rvc.A0F(num);
        Rj0 rj0 = (Rj0) A07.A00(parameters.A01);
        RVC rvc2 = (RVC) PxQ.A00(pxQ);
        if (rj0 != Rj0.UNRECOGNIZED) {
            rvc2.curveType_ = rj0.A00;
            Rj3 rj3 = (Rj3) A08.A00(parameters.A02);
            RVC rvc3 = (RVC) PxQ.A00(pxQ);
            if (rj3 != Rj3.UNRECOGNIZED) {
                rvc3.hkdfHashType_ = rj3.A00;
                C58526Pwu c58526Pwu = parameters.A05;
                if (c58526Pwu != null && c58526Pwu.A00.length > 0) {
                    byte[] A012 = c58526Pwu.A01();
                    ((RVC) PxQ.A00(pxQ)).hkdfSalt_ = AbstractC58536Px4.A01(A012, 0, A012.length);
                }
                RVC rvc4 = (RVC) pxQ.A02();
                try {
                    byte[] A013 = SSQ.A01(parameters.A00);
                    C58534Px2 A002 = C58534Px2.A00();
                    RVD rvd = RVD.DEFAULT_INSTANCE;
                    RVD rvd2 = (RVD) AbstractC58533Px1.A06(A002, rvd, A013);
                    PxQ pxQ2 = (PxQ) C60821RUg.DEFAULT_INSTANCE.A0F(num);
                    RUZ ruz = (RUZ) ((PxQ) rvd.A0F(num));
                    ruz.A07(rvd2.typeUrl_);
                    ruz.A05(PxH.TINK);
                    ruz.A06(rvd2.value_);
                    RVD rvd3 = (RVD) ruz.A02();
                    C60821RUg c60821RUg = (C60821RUg) PxQ.A00(pxQ2);
                    rvd3.getClass();
                    c60821RUg.aeadDem_ = rvd3;
                    c60821RUg.bitField0_ |= 1;
                    C60821RUg c60821RUg2 = (C60821RUg) pxQ2.A02();
                    SY4 sy4 = parameters.A03;
                    if (sy4 == null) {
                        sy4 = SY4.A01;
                    }
                    PxQ pxQ3 = (PxQ) RV4.DEFAULT_INSTANCE.A0F(num);
                    RV4 rv4 = (RV4) PxQ.A00(pxQ3);
                    rvc4.getClass();
                    rv4.kemParams_ = rvc4;
                    rv4.bitField0_ |= 1;
                    RV4 rv42 = (RV4) PxQ.A00(pxQ3);
                    c60821RUg2.getClass();
                    rv42.demParams_ = c60821RUg2;
                    rv42.bitField0_ |= 2;
                    EnumC61234Riw enumC61234Riw = (EnumC61234Riw) A09.A00(sy4);
                    RV4 rv43 = (RV4) PxQ.A00(pxQ3);
                    if (enumC61234Riw != EnumC61234Riw.UNRECOGNIZED) {
                        rv43.ecPointFormat_ = enumC61234Riw.A00;
                        return (RV4) pxQ3.A02();
                    }
                    throw AbstractC166987dD.A12("Can't get the number of an unknown enum value.");
                } catch (C61032Re1 e) {
                    throw new GeneralSecurityException("Parsing EciesParameters failed: ", e);
                }
            }
            throw AbstractC166987dD.A12("Can't get the number of an unknown enum value.");
        }
        throw AbstractC166987dD.A12("Can't get the number of an unknown enum value.");
    }

    public static RVA A03(C60795RTg key) {
        PxQ pxQ;
        AbstractC58536Px4 A012;
        C60790RTb c60790RTb = key.A00;
        SY7 sy7 = c60790RTb.A01;
        if (sy7.equals(SY7.A04)) {
            pxQ = (PxQ) RVA.DEFAULT_INSTANCE.A0F(C05F.A0Y);
            ((RVA) PxQ.A00(pxQ)).version_ = 0;
            RV4 A022 = A02(c60790RTb);
            RVA rva = (RVA) PxQ.A00(pxQ);
            A022.getClass();
            rva.params_ = A022;
            rva.bitField0_ |= 1;
            byte[] A013 = key.A02.A01();
            ((RVA) PxQ.A00(pxQ)).x_ = AbstractC58536Px4.A01(A013, 0, A013.length);
            A012 = AbstractC58536Px4.A01;
        } else {
            int A002 = A00(sy7);
            ECPoint eCPoint = key.A04;
            if (eCPoint != null) {
                pxQ = (PxQ) RVA.DEFAULT_INSTANCE.A0F(C05F.A0Y);
                ((RVA) PxQ.A00(pxQ)).version_ = 0;
                RV4 A023 = A02(c60790RTb);
                RVA rva2 = (RVA) PxQ.A00(pxQ);
                A023.getClass();
                rva2.params_ = A023;
                rva2.bitField0_ |= 1;
                byte[] A014 = SSS.A01(eCPoint.getAffineX(), A002);
                ((RVA) PxQ.A00(pxQ)).x_ = AbstractC58536Px4.A01(A014, 0, A014.length);
                byte[] A015 = SSS.A01(eCPoint.getAffineY(), A002);
                A012 = AbstractC58536Px4.A01(A015, 0, A015.length);
            } else {
                throw AbstractC58318PtA.A0x("NistCurvePoint was null for NIST curve");
            }
        }
        RVA rva3 = (RVA) PxQ.A00(pxQ);
        A012.getClass();
        rva3.y_ = A012;
        return (RVA) pxQ.A02();
    }

    static {
        C58526Pwu A012 = AbstractC58538Px6.A01("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        A0A = A012;
        C58526Pwu A013 = AbstractC58538Px6.A01("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
        A0B = A013;
        A06 = new C62503SEf(new C58365Pu5(10), C60790RTb.class);
        A05 = C58366Pu6.A00(A012, 10);
        A04 = new C62501SEd(new C58363Pu3(11), C60795RTg.class);
        A02 = C58367Pu7.A00(A013, 11);
        A03 = new C62501SEd(new C58363Pu3(12), C60793RTe.class);
        A01 = C58367Pu7.A00(A012, 12);
        SYK syk = new SYK();
        syk.A01(PxH.RAW, SY5.A02);
        syk.A01(PxH.TINK, SY5.A03);
        PxH pxH = PxH.LEGACY;
        SY5 sy5 = SY5.A01;
        syk.A01(pxH, sy5);
        A00 = SYK.A00(syk, PxH.CRUNCHY, sy5);
        SYK syk2 = new SYK();
        syk2.A01(Rj3.SHA1, SYB.A01);
        syk2.A01(Rj3.SHA224, SYB.A02);
        syk2.A01(Rj3.SHA256, SYB.A03);
        syk2.A01(Rj3.SHA384, SYB.A04);
        A08 = SYK.A00(syk2, Rj3.SHA512, SYB.A05);
        SYK syk3 = new SYK();
        syk3.A01(Rj0.NIST_P256, SY7.A01);
        syk3.A01(Rj0.NIST_P384, SY7.A02);
        syk3.A01(Rj0.NIST_P521, SY7.A03);
        A07 = SYK.A00(syk3, Rj0.CURVE25519, SY7.A04);
        SYK syk4 = new SYK();
        syk4.A01(EnumC61234Riw.UNCOMPRESSED, SY4.A03);
        syk4.A01(EnumC61234Riw.COMPRESSED, SY4.A01);
        A09 = SYK.A00(syk4, EnumC61234Riw.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, SY4.A02);
    }
}
