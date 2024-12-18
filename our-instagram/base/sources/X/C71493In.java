package X;

import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.3In, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71493In {
    public static C71483Im parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C71483Im c71483Im = new C71483Im();
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
                    if ("badge_payload".equals(A0q)) {
                        HashMap hashMap = null;
                        if (c16l.A11() == c16r) {
                            HashMap hashMap2 = new HashMap();
                            while (c16l.A1J() != c16r2) {
                                String A1P = c16l.A1P();
                                c16l.A1J();
                                if (c16l.A11() == C16R.A0G) {
                                    hashMap2.put(A1P, null);
                                } else {
                                    C89463ym parseFromJson = AbstractC89453yl.parseFromJson(c16l);
                                    if (parseFromJson != null) {
                                        hashMap2.put(A1P, parseFromJson);
                                    }
                                }
                            }
                            hashMap = hashMap2;
                        }
                        C14360o3.A0B(hashMap, 0);
                        c71483Im.A00 = hashMap;
                    } else {
                        C55702hA.A01(c16l, c71483Im, A0q);
                    }
                    c16l.A0z();
                } else {
                    return c71483Im;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
