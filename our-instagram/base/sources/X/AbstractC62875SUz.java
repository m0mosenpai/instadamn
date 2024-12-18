package X;

import com.google.crypto.tink.daead.DeterministicAeadConfig;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* renamed from: X.SUz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62875SUz {

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
        c62987SaB.A01(C64309T8s.A00);
        c62987SaB.A02(C64309T8s.A01);
        c62987SaB.A01(C64310T8t.A00);
        c62987SaB.A02(C64310T8t.A01);
        AbstractC62874SUy.A00();
        DeterministicAeadConfig.A00();
        if (!C62864SUl.A00.get()) {
            C62549SGa c62549SGa = AbstractC62391S9q.A03;
            EnumC61068Rei enumC61068Rei = EnumC61068Rei.A00;
            if (enumC61068Rei.A00()) {
                C58550PxN c58550PxN = C58550PxN.A01;
                c58550PxN.A0C(AbstractC63332Shg.A06);
                c58550PxN.A0B(AbstractC63332Shg.A05);
                c58550PxN.A0A(AbstractC63332Shg.A04);
                c58550PxN.A09(AbstractC63332Shg.A02);
                c58550PxN.A0A(AbstractC63332Shg.A03);
                c58550PxN.A09(AbstractC63332Shg.A01);
                SXp sXp = SXp.A01;
                HashMap A1G = AbstractC166987dD.A1G();
                java.util.Set set = C60790RTb.A06;
                SY5 sy5 = SY5.A02;
                SY7 sy7 = SY7.A01;
                SYB syb = SYB.A03;
                SY4 sy4 = SY4.A03;
                SY5 sy52 = SY5.A03;
                SXz sXz = SXz.A02;
                C58529Pwx c58529Pwx = new C58529Pwx(sXz, 16);
                java.util.Set set2 = C60790RTb.A06;
                if (set.contains(c58529Pwx)) {
                    A1G.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", S3I.A00(c58529Pwx, sy7, syb, sy4, sy52, null));
                    C58529Pwx c58529Pwx2 = new C58529Pwx(sXz, 16);
                    if (set2.contains(c58529Pwx2)) {
                        A1G.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", S3I.A00(c58529Pwx2, sy7, syb, sy4, sy5, null));
                        SY4 sy42 = SY4.A01;
                        C58529Pwx c58529Pwx3 = new C58529Pwx(sXz, 16);
                        if (set2.contains(c58529Pwx3)) {
                            A1G.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", S3I.A00(c58529Pwx3, sy7, syb, sy42, sy52, null));
                            C58529Pwx c58529Pwx4 = new C58529Pwx(sXz, 16);
                            if (set2.contains(c58529Pwx4)) {
                                A1G.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", S3I.A00(c58529Pwx4, sy7, syb, sy42, sy5, null));
                                C58529Pwx c58529Pwx5 = new C58529Pwx(sXz, 16);
                                if (set2.contains(c58529Pwx5)) {
                                    A1G.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", S3I.A00(c58529Pwx5, sy7, syb, sy42, sy5, null));
                                    C62930SXx c62930SXx = C62930SXx.A02;
                                    SYA sya = SYA.A03;
                                    RTQ A002 = SSR.A00(sya, c62930SXx);
                                    if (set2.contains(A002)) {
                                        A1G.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", S3I.A00(A002, sy7, syb, sy4, sy52, null));
                                        RTQ A003 = SSR.A00(sya, c62930SXx);
                                        if (set2.contains(A003)) {
                                            A1G.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", S3I.A00(A003, sy7, syb, sy4, sy5, null));
                                            RTQ A004 = SSR.A00(sya, c62930SXx);
                                            if (set2.contains(A004)) {
                                                A1G.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", S3I.A00(A004, sy7, syb, sy42, sy52, null));
                                                RTQ A005 = SSR.A00(sya, c62930SXx);
                                                if (set2.contains(A005)) {
                                                    AbstractC58320PtC.A1J(sXp, "ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", S3I.A00(A005, sy7, syb, sy42, sy5, null), A1G);
                                                    c62987SaB.A02(AbstractC62391S9q.A03);
                                                    c62987SaB.A02(AbstractC62391S9q.A04);
                                                    C63163SeN c63163SeN = C63163SeN.A02;
                                                    c63163SeN.A01(AbstractC62391S9q.A02, C60790RTb.class);
                                                    C63190Ses c63190Ses = C63190Ses.A02;
                                                    c63190Ses.A02(AbstractC62391S9q.A01, true);
                                                    c63190Ses.A02(AbstractC62391S9q.A00, false);
                                                    C62549SGa c62549SGa2 = AbstractC62392S9r.A03;
                                                    if (enumC61068Rei.A00()) {
                                                        c58550PxN.A0C(AbstractC63331Shf.A06);
                                                        c58550PxN.A0B(AbstractC63331Shf.A05);
                                                        c58550PxN.A0A(AbstractC63331Shf.A04);
                                                        c58550PxN.A09(AbstractC63331Shf.A02);
                                                        c58550PxN.A0A(AbstractC63331Shf.A03);
                                                        c58550PxN.A09(AbstractC63331Shf.A01);
                                                        HashMap A1G2 = AbstractC166987dD.A1G();
                                                        SY6 sy6 = SY6.A02;
                                                        SY6 sy62 = SY6.A03;
                                                        RTZ rtz = RTZ.A03;
                                                        RTY rty = RTY.A00;
                                                        RTX rtx = RTX.A00;
                                                        A1G2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", S3J.A00(rtx, rty, rtz, sy62));
                                                        A1G2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", S3J.A00(rtx, rty, rtz, sy6));
                                                        RTX rtx2 = RTX.A01;
                                                        A1G2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", S3J.A00(rtx2, rty, rtz, sy62));
                                                        A1G2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", S3J.A00(rtx2, rty, rtz, sy6));
                                                        RTX rtx3 = RTX.A02;
                                                        A1G2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", S3J.A00(rtx3, rty, rtz, sy62));
                                                        A1G2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", S3J.A00(rtx3, rty, rtz, sy6));
                                                        RTZ rtz2 = RTZ.A00;
                                                        A1G2.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", S3J.A00(rtx, rty, rtz2, sy62));
                                                        A1G2.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", S3J.A00(rtx, rty, rtz2, sy6));
                                                        A1G2.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", S3J.A00(rtx2, rty, rtz2, sy62));
                                                        A1G2.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", S3J.A00(rtx2, rty, rtz2, sy6));
                                                        RTZ rtz3 = RTZ.A01;
                                                        RTY rty2 = RTY.A01;
                                                        A1G2.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", S3J.A00(rtx, rty2, rtz3, sy62));
                                                        A1G2.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", S3J.A00(rtx, rty2, rtz3, sy6));
                                                        A1G2.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", S3J.A00(rtx2, rty2, rtz3, sy62));
                                                        A1G2.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", S3J.A00(rtx2, rty2, rtz3, sy6));
                                                        RTZ rtz4 = RTZ.A02;
                                                        RTY rty3 = RTY.A02;
                                                        A1G2.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", S3J.A00(rtx, rty3, rtz4, sy62));
                                                        A1G2.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", S3J.A00(rtx, rty3, rtz4, sy6));
                                                        A1G2.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", S3J.A00(rtx2, rty3, rtz4, sy62));
                                                        AbstractC58320PtC.A1J(sXp, "DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", S3J.A00(rtx2, rty3, rtz4, sy6), A1G2);
                                                        c62987SaB.A02(AbstractC62392S9r.A03);
                                                        c62987SaB.A02(AbstractC62392S9r.A04);
                                                        c63163SeN.A01(AbstractC62392S9r.A02, C60789RTa.class);
                                                        c63190Ses.A02(AbstractC62392S9r.A01, true);
                                                        c63190Ses.A02(AbstractC62392S9r.A00, false);
                                                        return;
                                                    }
                                                    throw AbstractC58318PtA.A0x("Registering HPKE Hybrid Encryption is not supported in FIPS mode");
                                                }
                                                throw AbstractC58323PtF.A0w(A005);
                                            }
                                            throw AbstractC58323PtF.A0w(A004);
                                        }
                                        throw AbstractC58323PtF.A0w(A003);
                                    }
                                    throw AbstractC58323PtF.A0w(A002);
                                }
                                throw AbstractC58323PtF.A0w(c58529Pwx5);
                            }
                            throw AbstractC58323PtF.A0w(c58529Pwx4);
                        }
                        throw AbstractC58323PtF.A0w(c58529Pwx3);
                    }
                    throw AbstractC58323PtF.A0w(c58529Pwx2);
                }
                throw AbstractC58323PtF.A0w(c58529Pwx);
            }
            throw AbstractC58318PtA.A0x("Registering ECIES Hybrid Encryption is not supported in FIPS mode");
        }
    }
}
