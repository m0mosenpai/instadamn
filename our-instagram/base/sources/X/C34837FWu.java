package X;

import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.FWu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34837FWu {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.EDQ, X.1um, X.1ul] */
    public static EDQ parseFromJson(C16L c16l) {
        C34939FaP c34939FaP;
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
                    if ("created_user".equals(A0s)) {
                        c40791um.A01 = AbstractC31171DnF.A0S(c16l, false);
                    } else if ("existing_user".equals(A0s)) {
                        c40791um.A05 = c16l.A0d();
                    } else if ("account_created".equals(A0s)) {
                        c40791um.A04 = c16l.A0d();
                    } else {
                        HashMap hashMap = null;
                        if ("eligible_login_account_data".equals(A0s)) {
                            if (c16l.A11() == c16r) {
                                hashMap = AbstractC166987dD.A1G();
                                while (c16l.A1J() != c16r2) {
                                    AbstractC31179DnN.A1F(c16l, hashMap);
                                }
                            }
                            c40791um.A03 = hashMap;
                        } else if ("errors".equals(A0s)) {
                            C16R A112 = c16l.A11();
                            if (A112 == c16r) {
                                StringBuilder A1C = AbstractC166987dD.A1C();
                                StringBuilder A1C2 = AbstractC166987dD.A1C();
                                while (c16l.A1J() != c16r2) {
                                    A1C.append(c16l.A0q());
                                    A1C.append(',');
                                    c16l.A1J();
                                    while (c16l.A1J() != C16R.A08) {
                                        A1C2.append(c16l.A1P());
                                        A1C2.append('\n');
                                    }
                                }
                                if (A1C.length() > 0) {
                                    A1C.deleteCharAt(A1C.length() - 1);
                                }
                                if (A1C2.length() > 0) {
                                    A1C2.deleteCharAt(A1C2.length() - 1);
                                }
                                c34939FaP = new C34939FaP(A1C.toString(), A1C2.toString());
                            } else {
                                if (A112 == C16R.A0C) {
                                    c16l.A0z();
                                }
                                c34939FaP = null;
                            }
                            c40791um.A00 = c34939FaP;
                        } else if ("force_qe_sync".equals(A0s)) {
                            c40791um.A06 = c16l.A0d();
                        } else if ("session_flush_nonce".equals(A0s)) {
                            c40791um.A02 = AbstractC167017dG.A0m(c16l);
                        } else {
                            C55702hA.A01(c16l, c40791um, A0s);
                        }
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
