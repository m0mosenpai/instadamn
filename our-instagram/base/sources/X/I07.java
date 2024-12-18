package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public abstract class I07 {
    public static C26214Bie parseFromJson(C16L c16l) {
        String A00;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            Boolean bool = null;
            String str = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC58317Pt9.A00(314);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("clips_spins".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC37302Gc3.A1J(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (A00.equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC58317Pt9.A00(334).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (arrayList == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("clips_spins", c16l, "GetClipsSpinsResponse");
            } else if (bool == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(A00, c16l, "GetClipsSpinsResponse");
            } else {
                return new C26214Bie(str, arrayList, bool.booleanValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
