package X;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes10.dex */
public abstract class SV0 {

    @Deprecated
    public static final C60831RUq A00;

    @Deprecated
    public static final C60831RUq A01;

    @Deprecated
    public static final C60831RUq A02;

    static {
        C60831RUq c60831RUq = C60831RUq.DEFAULT_INSTANCE;
        A01 = c60831RUq;
        A02 = c60831RUq;
        A00 = c60831RUq;
        try {
            A00();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void A00() {
        C62987SaB c62987SaB = C62987SaB.A01;
        c62987SaB.A01(C64311T8u.A01);
        c62987SaB.A02(C64311T8u.A00);
        c62987SaB.A01(C64306T8p.A00);
        EnumC61068Rei enumC61068Rei = AbstractC62397S9w.A01;
        if (enumC61068Rei.A00()) {
            C58550PxN c58550PxN = C58550PxN.A01;
            c58550PxN.A0C(SVE.A05);
            c58550PxN.A0B(SVE.A04);
            c58550PxN.A0A(SVE.A03);
            c58550PxN.A09(SVE.A02);
            c62987SaB.A02(AbstractC62397S9w.A04);
            c62987SaB.A02(AbstractC62397S9w.A05);
            SXp sXp = SXp.A01;
            HashMap A1G = AbstractC166987dD.A1G();
            A1G.put("HMAC_SHA256_128BITTAG", AbstractC62393S9s.A01);
            SY9 sy9 = SY9.A03;
            SYC syc = SYC.A03;
            A1G.put("HMAC_SHA256_128BITTAG_RAW", S3Q.A00(syc, sy9, 32, 16));
            SY9 sy92 = SY9.A04;
            A1G.put("HMAC_SHA256_256BITTAG", S3Q.A00(syc, sy92, 32, 32));
            A1G.put("HMAC_SHA256_256BITTAG_RAW", S3Q.A00(syc, sy9, 32, 32));
            SYC syc2 = SYC.A05;
            A1G.put("HMAC_SHA512_128BITTAG", S3Q.A00(syc2, sy92, 64, 16));
            A1G.put("HMAC_SHA512_128BITTAG_RAW", S3Q.A00(syc2, sy9, 64, 16));
            A1G.put("HMAC_SHA512_256BITTAG", S3Q.A00(syc2, sy92, 64, 32));
            A1G.put("HMAC_SHA512_256BITTAG_RAW", S3Q.A00(syc2, sy9, 64, 32));
            A1G.put("HMAC_SHA512_512BITTAG", AbstractC62393S9s.A04);
            AbstractC58320PtC.A1J(sXp, "HMAC_SHA512_512BITTAG_RAW", S3Q.A00(syc2, sy9, 64, 64), A1G);
            C63163SeN c63163SeN = C63163SeN.A02;
            c63163SeN.A01(AbstractC62397S9w.A02, C60800RTl.class);
            SXo.A01.A00(AbstractC62397S9w.A03, C60800RTl.class);
            C63190Ses c63190Ses = C63190Ses.A02;
            c63190Ses.A01(AbstractC62397S9w.A00, enumC61068Rei, true);
            if (!C62864SUl.A00.get()) {
                C62549SGa c62549SGa = AbstractC62381S9g.A02;
                if (EnumC61068Rei.A00.A00()) {
                    c58550PxN.A0C(AbstractC63121SdP.A03);
                    c58550PxN.A0B(AbstractC63121SdP.A02);
                    c58550PxN.A0A(AbstractC63121SdP.A01);
                    c58550PxN.A09(AbstractC63121SdP.A00);
                    c63163SeN.A01(AbstractC62381S9g.A01, C60799RTk.class);
                    c62987SaB.A02(AbstractC62381S9g.A02);
                    c62987SaB.A02(AbstractC62381S9g.A03);
                    HashMap A1G2 = AbstractC166987dD.A1G();
                    C60799RTk c60799RTk = AbstractC62393S9s.A00;
                    A1G2.put("AES_CMAC", c60799RTk);
                    A1G2.put("AES256_CMAC", c60799RTk);
                    AbstractC58320PtC.A1J(sXp, "AES256_CMAC_RAW", S3O.A00(SY8.A03, 32, 16), A1G2);
                    c63190Ses.A02(AbstractC62381S9g.A00, true);
                    return;
                }
                throw AbstractC58318PtA.A0x("Registering AES CMAC is not supported in FIPS mode");
            }
            return;
        }
        throw AbstractC58318PtA.A0x("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
