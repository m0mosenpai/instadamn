package X;

import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.4Hw, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4Hw {
    public static C47u parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            HashMap hashMap = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J == c16r2) {
                    break;
                }
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("counters".equals(A0q)) {
                    if (c16l.A11() == c16r) {
                        hashMap = new HashMap();
                        while (c16l.A1J() != c16r2) {
                            String A1P = c16l.A1P();
                            c16l.A1J();
                            if (c16l.A11() == C16R.A0G) {
                                hashMap.put(A1P, null);
                            } else {
                                Integer valueOf = Integer.valueOf(c16l.A1D());
                                if (valueOf != null) {
                                    hashMap.put(A1P, valueOf);
                                }
                            }
                        }
                    } else {
                        hashMap = null;
                    }
                }
                c16l.A0z();
            }
            C47u c47u = new C47u();
            if (hashMap != null) {
                c47u.A00 = hashMap;
            }
            return c47u;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
