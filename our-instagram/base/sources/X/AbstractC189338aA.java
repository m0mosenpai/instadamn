package X;

import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.8aA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC189338aA {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.8aB] */
    public static C189348aB parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
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
                    if ("completed_versions".equals(A0q)) {
                        HashMap hashMap = null;
                        if (c16l.A11() == c16r) {
                            HashMap hashMap2 = new HashMap();
                            while (c16l.A1J() != c16r2) {
                                String A1P = c16l.A1P();
                                c16l.A1J();
                                if (c16l.A11() == C16R.A0G) {
                                    hashMap2.put(A1P, null);
                                } else {
                                    Integer valueOf = Integer.valueOf(c16l.A1D());
                                    if (valueOf != null) {
                                        hashMap2.put(A1P, valueOf);
                                    }
                                }
                            }
                            hashMap = hashMap2;
                        }
                        obj.A00 = hashMap;
                    }
                    c16l.A0z();
                } else {
                    return obj;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
