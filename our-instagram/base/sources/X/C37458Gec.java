package X;

import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.Gec, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37458Gec {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.H9z, X.1um, X.1ul] */
    public static C38877H9z parseFromJson(C16L c16l) {
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
                    String A0q = c16l.A0q();
                    c16l.A1J();
                    if ("comment_infos".equals(A0q)) {
                        HashMap hashMap = null;
                        if (c16l.A11() == c16r) {
                            HashMap hashMap2 = new HashMap();
                            while (c16l.A1J() != c16r2) {
                                String A1P = c16l.A1P();
                                c16l.A1J();
                                if (c16l.A11() == C16R.A0G) {
                                    hashMap2.put(A1P, null);
                                } else {
                                    C41005IEa parseFromJson = AbstractC37457Geb.parseFromJson(c16l);
                                    if (parseFromJson != null) {
                                        hashMap2.put(A1P, parseFromJson);
                                    }
                                }
                            }
                            hashMap = hashMap2;
                        }
                        c40791um.A00 = hashMap;
                    } else {
                        C55702hA.A01(c16l, c40791um, A0q);
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
