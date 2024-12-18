package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public final class FWA {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.EAz, X.EgL, X.1um] */
    public static EgL parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J != c16r2) {
                    String A0s = AbstractC166997dE.A0s(c16l);
                    if ("verified".equals(A0s)) {
                        c40791um.A01 = c16l.A0d();
                    } else if (!"nonce_valid".equals(A0s) && !"phone_number_valid".equals(A0s)) {
                        if (AbstractC31189DnY.A00().equals(A0s)) {
                            AbstractC31178DnM.A1I(c16l);
                        } else if ("errors".equals(A0s)) {
                            C16R A112 = c16l.A11();
                            String str = null;
                            if (A112 != c16r) {
                                if (A112 == C16R.A0C) {
                                    c16l.A0z();
                                }
                                c40791um.A00 = str;
                            }
                            while (c16l.A1J() != c16r2) {
                                c16l.A1J();
                                while (c16l.A1J() != C16R.A08) {
                                    if (str == null) {
                                        str = c16l.A1P();
                                    }
                                }
                            }
                            c40791um.A00 = str;
                        } else {
                            F9X.A00(c16l, c40791um, A0s);
                        }
                    } else {
                        c16l.A0d();
                    }
                    c16l.A0z();
                } else {
                    return c40791um;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
