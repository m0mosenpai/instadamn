package com.google.crypto.tink.daead;

import X.AbstractC166987dD;
import X.AbstractC58318PtA;
import X.AbstractC58320PtC;
import X.AbstractC62331S7b;
import X.AbstractC62380S9f;
import X.C58550PxN;
import X.C58556PxX;
import X.C60831RUq;
import X.C62549SGa;
import X.C62864SUl;
import X.C62987SaB;
import X.C63163SeN;
import X.C63190Ses;
import X.C64308T8r;
import X.EnumC61068Rei;
import X.SA0;
import X.SXo;
import X.SXp;
import X.SY3;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes10.dex */
public abstract class DeterministicAeadConfig {

    @Deprecated
    public static final C60831RUq A00;

    @Deprecated
    public static final C60831RUq A01;

    static {
        C60831RUq c60831RUq = C60831RUq.DEFAULT_INSTANCE;
        A01 = c60831RUq;
        A00 = c60831RUq;
        try {
            A00();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void A00() {
        C62987SaB c62987SaB = C62987SaB.A01;
        c62987SaB.A01(C64308T8r.A00);
        c62987SaB.A02(C64308T8r.A01);
        if (!C62864SUl.A00.get()) {
            C62549SGa c62549SGa = AbstractC62380S9f.A03;
            if (EnumC61068Rei.A00.A00()) {
                C58550PxN c58550PxN = C58550PxN.A01;
                c58550PxN.A0C(SA0.A03);
                c58550PxN.A0B(SA0.A02);
                c58550PxN.A0A(SA0.A01);
                c58550PxN.A09(SA0.A00);
                c62987SaB.A02(AbstractC62380S9f.A03);
                SXp sXp = SXp.A01;
                HashMap A1G = AbstractC166987dD.A1G();
                A1G.put("AES256_SIV", AbstractC62331S7b.A00);
                AbstractC58320PtC.A1J(sXp, "AES256_SIV_RAW", new C58556PxX(SY3.A02, 64), A1G);
                SXo.A01.A00(AbstractC62380S9f.A02, C58556PxX.class);
                C63163SeN.A02.A01(AbstractC62380S9f.A01, C58556PxX.class);
                C63190Ses.A02.A02(AbstractC62380S9f.A00, true);
                return;
            }
            throw AbstractC58318PtA.A0x("Registering AES SIV is not supported in FIPS mode");
        }
    }
}
