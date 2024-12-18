package X;

import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes7.dex */
public abstract class I1I {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.IEi, java.lang.Object] */
    public static C41013IEi parseFromJson(C16L c16l) {
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
                    String A0s = AbstractC166997dE.A0s(c16l);
                    if ("version".equals(A0s)) {
                        obj.A00 = c16l.A1D();
                    } else if ("participantStates".equals(A0s)) {
                        HashMap hashMap = null;
                        if (c16l.A11() == c16r) {
                            HashMap A1G = AbstractC166987dD.A1G();
                            while (c16l.A1J() != c16r2) {
                                String A1P = c16l.A1P();
                                if (AbstractC37301Gc2.A05(c16l) == C16R.A0G) {
                                    A1G.put(A1P, null);
                                } else {
                                    ICM parseFromJson = I1M.parseFromJson(c16l);
                                    if (parseFromJson != null) {
                                        A1G.put(A1P, parseFromJson);
                                    }
                                }
                            }
                            hashMap = A1G;
                        }
                        C14360o3.A0B(hashMap, 0);
                        obj.A01 = hashMap;
                    }
                    c16l.A0z();
                } else {
                    return obj;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
