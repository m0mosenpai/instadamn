package X;

import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.FBr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34323FBr {
    public static C25331Ln parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C25331Ln c25331Ln = new C25331Ln();
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
                    if ("reel_tray_impressions".equals(AbstractC166997dE.A0s(c16l))) {
                        HashMap hashMap = null;
                        if (c16l.A11() == c16r) {
                            HashMap A1G = AbstractC166987dD.A1G();
                            while (c16l.A1J() != c16r2) {
                                String A1P = c16l.A1P();
                                c16l.A1J();
                                if (c16l.A11() == C16R.A0G) {
                                    A1G.put(A1P, null);
                                } else {
                                    Long A0h = AbstractC31173DnH.A0h(c16l);
                                    if (A0h != null) {
                                        A1G.put(A1P, A0h);
                                    }
                                }
                            }
                            hashMap = A1G;
                        }
                        c25331Ln.A00 = hashMap;
                    }
                    c16l.A0z();
                } else {
                    return c25331Ln;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
