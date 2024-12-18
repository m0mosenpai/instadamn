package X;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* renamed from: X.SUy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62874SUy {

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
        c62987SaB.A01(C64307T8q.A00);
        c62987SaB.A02(C64307T8q.A01);
        SV0.A00();
        EnumC61068Rei enumC61068Rei = AbstractC62388S9n.A01;
        if (enumC61068Rei.A00()) {
            C58550PxN c58550PxN = C58550PxN.A01;
            c58550PxN.A0C(AbstractC63267SgR.A03);
            c58550PxN.A0B(AbstractC63267SgR.A02);
            c58550PxN.A0A(AbstractC63267SgR.A01);
            c58550PxN.A09(AbstractC63267SgR.A00);
            c62987SaB.A02(AbstractC62388S9n.A04);
            SXp sXp = SXp.A01;
            HashMap A1G = AbstractC166987dD.A1G();
            A1G.put("AES128_CTR_HMAC_SHA256", SA1.A00);
            C62930SXx c62930SXx = C62930SXx.A02;
            SYA sya = SYA.A03;
            A1G.put("AES128_CTR_HMAC_SHA256_RAW", SSR.A00(sya, c62930SXx));
            A1G.put("AES256_CTR_HMAC_SHA256", SA1.A01);
            AbstractC58320PtC.A1J(sXp, "AES256_CTR_HMAC_SHA256_RAW", SSR.A01(sya, c62930SXx, 32, 32, 16, 32), A1G);
            SXo sXo = SXo.A01;
            sXo.A00(AbstractC62388S9n.A03, RTQ.class);
            C63163SeN c63163SeN = C63163SeN.A02;
            c63163SeN.A01(AbstractC62388S9n.A02, RTQ.class);
            C63190Ses c63190Ses = C63190Ses.A02;
            c63190Ses.A01(AbstractC62388S9n.A00, enumC61068Rei, true);
            EnumC61068Rei enumC61068Rei2 = AbstractC62389S9o.A01;
            if (enumC61068Rei2.A00()) {
                c58550PxN.A0C(AbstractC63120SdO.A03);
                c58550PxN.A0B(AbstractC63120SdO.A02);
                c58550PxN.A0A(AbstractC63120SdO.A01);
                c58550PxN.A09(AbstractC63120SdO.A00);
                c62987SaB.A02(AbstractC62389S9o.A04);
                HashMap A1G2 = AbstractC166987dD.A1G();
                A1G2.put("AES128_GCM", SA1.A04);
                SXz sXz = SXz.A02;
                A1G2.put("AES128_GCM_RAW", new C58529Pwx(sXz, 16));
                A1G2.put("AES256_GCM", SA1.A05);
                AbstractC58320PtC.A1J(sXp, "AES256_GCM_RAW", new C58529Pwx(sXz, 32), A1G2);
                sXo.A00(AbstractC62389S9o.A03, C58529Pwx.class);
                c63163SeN.A01(AbstractC62389S9o.A02, C58529Pwx.class);
                c63190Ses.A01(AbstractC62389S9o.A00, enumC61068Rei2, true);
                if (!C62864SUl.A00.get()) {
                    C62549SGa c62549SGa = S9S.A02;
                    EnumC61068Rei enumC61068Rei3 = EnumC61068Rei.A00;
                    if (enumC61068Rei3.A00()) {
                        c58550PxN.A0C(AbstractC63119SdN.A03);
                        c58550PxN.A0B(AbstractC63119SdN.A02);
                        c58550PxN.A0A(AbstractC63119SdN.A01);
                        c58550PxN.A09(AbstractC63119SdN.A00);
                        c62987SaB.A02(S9S.A02);
                        HashMap A1G3 = AbstractC166987dD.A1G();
                        A1G3.put("AES128_EAX", SA1.A02);
                        C62931SXy c62931SXy = C62931SXy.A02;
                        A1G3.put("AES128_EAX_RAW", S3E.A00(c62931SXy, 16, 16));
                        A1G3.put("AES256_EAX", SA1.A03);
                        AbstractC58320PtC.A1J(sXp, "AES256_EAX_RAW", S3E.A00(c62931SXy, 16, 32), A1G3);
                        c63163SeN.A01(S9S.A01, RTO.class);
                        c63190Ses.A02(S9S.A00, true);
                        C62549SGa c62549SGa2 = AbstractC62378S9d.A03;
                        if (enumC61068Rei3.A00()) {
                            c58550PxN.A0C(SV6.A03);
                            c58550PxN.A0B(SV6.A02);
                            c58550PxN.A0A(SV6.A01);
                            c58550PxN.A09(SV6.A00);
                            try {
                                Cipher.getInstance("AES/GCM-SIV/NoPadding");
                                c62987SaB.A02(AbstractC62378S9d.A03);
                                HashMap A1G4 = AbstractC166987dD.A1G();
                                SY0 sy0 = SY0.A02;
                                SY0 sy02 = SY0.A03;
                                A1G4.put("AES128_GCM_SIV", new RTM(sy02, 16));
                                A1G4.put("AES128_GCM_SIV_RAW", new RTM(sy0, 16));
                                A1G4.put("AES256_GCM_SIV", new RTM(sy02, 32));
                                AbstractC58320PtC.A1J(sXp, "AES256_GCM_SIV_RAW", new RTM(sy0, 32), A1G4);
                                sXo.A00(AbstractC62378S9d.A02, RTM.class);
                                c63163SeN.A01(AbstractC62378S9d.A01, RTM.class);
                                c63190Ses.A02(AbstractC62378S9d.A00, true);
                            } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
                            }
                            C62549SGa c62549SGa3 = S9T.A02;
                            if (enumC61068Rei3.A00()) {
                                c58550PxN.A0C(SV7.A03);
                                c58550PxN.A0B(SV7.A02);
                                c58550PxN.A0A(SV7.A01);
                                c58550PxN.A09(SV7.A00);
                                c62987SaB.A02(S9T.A02);
                                c63163SeN.A01(S9T.A01, RTK.class);
                                HashMap A1G5 = AbstractC166987dD.A1G();
                                A1G5.put("CHACHA20_POLY1305", new RTK(SY1.A03));
                                AbstractC58320PtC.A1J(sXp, "CHACHA20_POLY1305_RAW", new RTK(SY1.A02), A1G5);
                                c63190Ses.A02(S9T.A00, true);
                                Th6 th6 = S9U.A01;
                                if (enumC61068Rei3.A00()) {
                                    c58550PxN.A0C(AbstractC62390S9p.A03);
                                    c58550PxN.A0B(AbstractC62390S9p.A02);
                                    c58550PxN.A0A(AbstractC62390S9p.A01);
                                    c58550PxN.A09(AbstractC62390S9p.A00);
                                    c62987SaB.A02(S9U.A02);
                                    c63163SeN.A01(S9U.A01, RTN.class);
                                    c63190Ses.A02(S9U.A00, true);
                                    Th6 th62 = S9V.A01;
                                    if (enumC61068Rei3.A00()) {
                                        c58550PxN.A0C(AbstractC63118SdM.A03);
                                        c58550PxN.A0B(AbstractC63118SdM.A02);
                                        c58550PxN.A0A(AbstractC63118SdM.A01);
                                        c58550PxN.A09(AbstractC63118SdM.A00);
                                        c63163SeN.A01(S9V.A01, RTP.class);
                                        c62987SaB.A02(S9V.A02);
                                        c63190Ses.A02(S9V.A00, true);
                                        Th6 th63 = AbstractC62379S9e.A01;
                                        if (enumC61068Rei3.A00()) {
                                            c58550PxN.A0C(SV8.A03);
                                            c58550PxN.A0B(SV8.A02);
                                            c58550PxN.A0A(SV8.A01);
                                            c58550PxN.A09(SV8.A00);
                                            c62987SaB.A02(AbstractC62379S9e.A03);
                                            HashMap A1G6 = AbstractC166987dD.A1G();
                                            A1G6.put("XCHACHA20_POLY1305", new RTL(SY2.A03));
                                            AbstractC58320PtC.A1J(sXp, "XCHACHA20_POLY1305_RAW", new RTL(SY2.A02), A1G6);
                                            c63163SeN.A01(AbstractC62379S9e.A01, RTL.class);
                                            sXo.A00(AbstractC62379S9e.A02, RTL.class);
                                            c63190Ses.A02(AbstractC62379S9e.A00, true);
                                            return;
                                        }
                                        throw AbstractC58318PtA.A0x("Registering XChaCha20Poly1305 is not supported in FIPS mode");
                                    }
                                    throw AbstractC58318PtA.A0x("Registering KMS Envelope AEAD is not supported in FIPS mode");
                                }
                                throw AbstractC58318PtA.A0x("Registering KMS AEAD is not supported in FIPS mode");
                            }
                            throw AbstractC58318PtA.A0x("Registering ChaCha20Poly1305 is not supported in FIPS mode");
                        }
                        throw AbstractC58318PtA.A0x("Registering AES GCM SIV is not supported in FIPS mode");
                    }
                    throw AbstractC58318PtA.A0x("Registering AES EAX is not supported in FIPS mode");
                }
                return;
            }
            throw AbstractC58318PtA.A0x("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        throw AbstractC58318PtA.A0x("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
