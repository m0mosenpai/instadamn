package X;

import java.io.IOException;
import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public abstract class F76 {
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.FGY] */
    public static FGY parseFromJson(C16L c16l) {
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
                    if (AbstractC111324zv.A00(4886).equals(AbstractC166997dE.A0s(c16l))) {
                        LinkedHashMap linkedHashMap = null;
                        if (c16l.A11() == c16r) {
                            LinkedHashMap A1I = AbstractC166987dD.A1I();
                            while (c16l.A1J() != c16r2) {
                                String A1P = c16l.A1P();
                                c16l.A1J();
                                if (c16l.A11() == C16R.A0G) {
                                    A1I.put(A1P, null);
                                } else {
                                    Integer A0h = AbstractC166997dE.A0h(c16l);
                                    if (A0h != null) {
                                        A1I.put(A1P, A0h);
                                    }
                                }
                            }
                            linkedHashMap = A1I;
                        }
                        C14360o3.A0B(linkedHashMap, 0);
                        obj.A00 = linkedHashMap;
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
