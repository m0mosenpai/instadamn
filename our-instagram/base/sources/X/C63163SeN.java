package X;

import com.instagram.react.modules.base.IgReactQEModule;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.util.Map;

/* renamed from: X.SeN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63163SeN {
    public static final Th6 A01;
    public static final C63163SeN A02;
    public final Map A00 = AbstractC166987dD.A1G();

    public static synchronized AbstractC61589RqD A00(AbstractC61590RqE parameters, C63163SeN idRequirement) {
        AbstractC61589RqD A00;
        ECParameterSpec eCParameterSpec;
        EnumC61105RfK enumC61105RfK;
        C58526Pwu A002;
        C58552PxP c58552PxP;
        synchronized (idRequirement) {
            Th6 th6 = (Th6) idRequirement.A00.get(parameters.getClass());
            if (th6 != null) {
                switch (((C58362Pu2) th6).A00) {
                    case 0:
                        RTQ rtq = (RTQ) parameters;
                        C62549SGa c62549SGa = AbstractC62388S9n.A04;
                        int i = rtq.A00;
                        if (i != 16 && i != 32) {
                            throw AbstractC58318PtA.A0x("AES key size must be 16 or 32 bytes");
                        }
                        C58552PxP A003 = C58552PxP.A00(i);
                        int i2 = rtq.A01;
                        C58552PxP A004 = C58552PxP.A00(i2);
                        if (i != A003.A00.A00.length) {
                            throw AbstractC58318PtA.A0x("AES key size mismatch");
                        }
                        if (i2 != A004.A00.A00.length) {
                            throw AbstractC58318PtA.A0x("HMAC key size mismatch");
                        }
                        if (rtq.A00()) {
                            throw AbstractC58318PtA.A0v();
                        }
                        A00 = new RTE(rtq, S3C.A00(rtq, null), A003, A004, null);
                        break;
                        break;
                    case 1:
                        RTO rto = (RTO) parameters;
                        C62549SGa c62549SGa2 = S9S.A02;
                        int i3 = rto.A01;
                        if (i3 == 24) {
                            throw AbstractC58318PtA.A0x("192 bit AES GCM Parameters are not valid");
                        }
                        C58552PxP A005 = C58552PxP.A00(i3);
                        if (i3 != A005.A00.A00.length) {
                            throw AbstractC58318PtA.A0w();
                        }
                        if (rto.A00()) {
                            throw AbstractC58318PtA.A0v();
                        }
                        A00 = new RTB(rto, S3D.A00(rto, null), A005, null);
                        break;
                    case 2:
                        C58529Pwx c58529Pwx = (C58529Pwx) parameters;
                        C62549SGa c62549SGa3 = AbstractC62389S9o.A04;
                        int i4 = c58529Pwx.A01;
                        if (i4 == 24) {
                            throw AbstractC58318PtA.A0x("192 bit AES GCM Parameters are not valid");
                        }
                        C58552PxP A006 = C58552PxP.A00(i4);
                        if (i4 != A006.A00.A00.length) {
                            throw AbstractC58318PtA.A0w();
                        }
                        if (c58529Pwx.A00()) {
                            throw AbstractC58318PtA.A0v();
                        }
                        A00 = new RTC(c58529Pwx, S3F.A00(c58529Pwx, null), A006, null);
                        break;
                    case 3:
                        RTM rtm = (RTM) parameters;
                        C62549SGa c62549SGa4 = AbstractC62378S9d.A03;
                        int i5 = rtm.A00;
                        C58552PxP A007 = C58552PxP.A00(i5);
                        if (i5 != A007.A00.A00.length) {
                            throw AbstractC58318PtA.A0w();
                        }
                        if (rtm.A00()) {
                            throw AbstractC58318PtA.A0v();
                        }
                        A00 = new RTD(rtm, S3G.A00(rtm, null), A007, null);
                        break;
                    case 4:
                        C62549SGa c62549SGa5 = S9T.A02;
                        A00 = RTH.A00(((RTK) parameters).A00, C58552PxP.A00(32), null);
                        break;
                    case 5:
                        Th6 th62 = S9U.A01;
                        A00 = RTF.A00((RTN) parameters, null);
                        break;
                    case 6:
                        Th6 th63 = S9V.A01;
                        A00 = RTG.A00((RTP) parameters, null);
                        break;
                    case 7:
                        Th6 th64 = AbstractC62379S9e.A01;
                        A00 = RTI.A00(((RTL) parameters).A00, C58552PxP.A00(32), null);
                        break;
                    case 8:
                        C58556PxX c58556PxX = (C58556PxX) parameters;
                        C62549SGa c62549SGa6 = AbstractC62380S9f.A03;
                        int i6 = c58556PxX.A00;
                        if (i6 != 64) {
                            throw new InvalidAlgorithmParameterException(AnonymousClass001.A0n("invalid key size: ", ". Valid keys must have ", " bytes.", i6, 64));
                        }
                        C58552PxP A008 = C58552PxP.A00(i6);
                        if (i6 != A008.A00.A00.length) {
                            throw AbstractC58318PtA.A0w();
                        }
                        if (c58556PxX.A00()) {
                            throw AbstractC58318PtA.A0v();
                        }
                        A00 = new RT6(c58556PxX, S3H.A00(c58556PxX, null), A008, null);
                        break;
                    case 9:
                        C60790RTb c60790RTb = (C60790RTb) parameters;
                        C62549SGa c62549SGa7 = AbstractC62391S9q.A03;
                        SY7 sy7 = c60790RTb.A01;
                        if (sy7 == SY7.A01) {
                            eCParameterSpec = AbstractC63391SjD.A00;
                        } else if (sy7 == SY7.A02) {
                            eCParameterSpec = AbstractC63391SjD.A01;
                        } else {
                            if (sy7 != SY7.A03) {
                                throw AbstractC58320PtC.A19(sy7, "Unsupported curve type: ", AbstractC166987dD.A1C());
                            }
                            eCParameterSpec = AbstractC63391SjD.A02;
                        }
                        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) InterfaceC65621ToC.A00(C62890SVv.A04, "EC");
                        keyPairGenerator.initialize(eCParameterSpec);
                        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
                        A00 = C60793RTe.A00(C60795RTg.A01(c60790RTb, null, ((ECPublicKey) generateKeyPair.getPublic()).getW()), new SC3(((ECPrivateKey) generateKeyPair.getPrivate()).getS()));
                        break;
                    case 10:
                        C60789RTa c60789RTa = (C60789RTa) parameters;
                        C62549SGa c62549SGa8 = AbstractC62392S9r.A03;
                        RTZ rtz = c60789RTa.A02;
                        if (rtz.equals(RTZ.A03)) {
                            byte[] A009 = AbstractC58567Pxj.A00(32);
                            A009[0] = (byte) (A009[0] | 7);
                            byte b = (byte) (A009[31] & 63);
                            A009[31] = b;
                            A009[31] = (byte) (b | 128);
                            c58552PxP = new C58552PxP(C58526Pwu.A00(A009));
                            A002 = C58526Pwu.A00(SSU.A00(A009));
                        } else {
                            RTZ rtz2 = RTZ.A00;
                            if (!rtz.equals(rtz2) && !rtz.equals(RTZ.A01) && !rtz.equals(RTZ.A02)) {
                                throw AbstractC58318PtA.A0x("Unknown KEM ID");
                            }
                            byte[] bArr = AbstractC63126SdU.A00;
                            if (rtz == rtz2) {
                                enumC61105RfK = EnumC61105RfK.NIST_P256;
                            } else if (rtz == RTZ.A01) {
                                enumC61105RfK = EnumC61105RfK.NIST_P384;
                            } else {
                                if (rtz != RTZ.A02) {
                                    throw AbstractC58318PtA.A0x("Unrecognized NIST HPKE KEM identifier");
                                }
                                enumC61105RfK = EnumC61105RfK.NIST_P521;
                            }
                            ECParameterSpec A0010 = AbstractC63316ShO.A00(enumC61105RfK);
                            KeyPairGenerator keyPairGenerator2 = (KeyPairGenerator) InterfaceC65621ToC.A00(C62890SVv.A04, "EC");
                            keyPairGenerator2.initialize(A0010);
                            KeyPair generateKeyPair2 = keyPairGenerator2.generateKeyPair();
                            A002 = C58526Pwu.A00(AbstractC63316ShO.A03(EnumC61106RfL.UNCOMPRESSED, ((ECPublicKey) generateKeyPair2.getPublic()).getW(), AbstractC63316ShO.A00(enumC61105RfK).getCurve()));
                            c58552PxP = new C58552PxP(C58526Pwu.A00(SSS.A01(((ECPrivateKey) generateKeyPair2.getPrivate()).getS(), AbstractC63126SdU.A00(rtz))));
                        }
                        A00 = C60792RTd.A00(C60794RTf.A00(c60789RTa, A002, null), c58552PxP);
                        break;
                    case 11:
                        RVD rvd = ((RTA) parameters).A00.A00;
                        C63190Ses c63190Ses = C63190Ses.A02;
                        InterfaceC65428Tjz A0011 = C63190Ses.A00(c63190Ses, rvd.typeUrl_);
                        if (!AbstractC166987dD.A1a(c63190Ses.A01.get(rvd.typeUrl_))) {
                            throw AbstractC58318PtA.A0x("Creating new keys is not allowed.");
                        }
                        PxG CsS = A0011.CsS(rvd.value_);
                        String str = CsS.typeUrl_;
                        A00 = new RT5(C58551PxO.A00(CsS.A0G(), rvd.A0G(), CsS.value_, null, str));
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        C60799RTk c60799RTk = (C60799RTk) parameters;
                        C62549SGa c62549SGa9 = AbstractC62381S9g.A02;
                        int i7 = c60799RTk.A00;
                        if (i7 != 32) {
                            throw AbstractC58318PtA.A0x("AesCmacKey size wrong, must be 32 bytes");
                        }
                        C58552PxP A0012 = C58552PxP.A00(i7);
                        if (i7 != A0012.A00.A00.length) {
                            throw AbstractC58318PtA.A0w();
                        }
                        if (c60799RTk.A00()) {
                            throw AbstractC58318PtA.A0v();
                        }
                        A00 = new C60797RTi(c60799RTk, S3N.A00(c60799RTk, null), A0012, null);
                        break;
                    default:
                        C60800RTl c60800RTl = (C60800RTl) parameters;
                        C62549SGa c62549SGa10 = AbstractC62397S9w.A04;
                        int i8 = c60800RTl.A00;
                        C58552PxP A0013 = C58552PxP.A00(i8);
                        if (i8 == A0013.A00.A00.length) {
                            if (c60800RTl.A00()) {
                                throw AbstractC58318PtA.A0v();
                            }
                            A00 = new C60798RTj(c60800RTl, S3P.A00(c60800RTl, null), A0013, null);
                            break;
                        } else {
                            throw AbstractC58318PtA.A0w();
                        }
                }
            } else {
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("Cannot create a new key for parameters ");
                A1C.append(parameters);
                throw AbstractC58318PtA.A0x(AbstractC166997dE.A0x(": no key creator for this class was registered.", A1C));
            }
        }
        return A00;
    }

    public final synchronized void A01(Th6 creator, Class parametersClass) {
        Map map = this.A00;
        Th6 th6 = (Th6) map.get(parametersClass);
        if (th6 != null && !th6.equals(creator)) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Different key creator for parameters class ");
            A1C.append(parametersClass);
            throw AbstractC58318PtA.A0x(AbstractC166997dE.A0x(" already inserted", A1C));
        }
        map.put(parametersClass, creator);
    }

    static {
        C58362Pu2 c58362Pu2 = new C58362Pu2(11);
        A01 = c58362Pu2;
        C63163SeN c63163SeN = new C63163SeN();
        try {
            c63163SeN.A01(c58362Pu2, RTA.class);
            A02 = c63163SeN;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("unexpected error.", e);
        }
    }
}
