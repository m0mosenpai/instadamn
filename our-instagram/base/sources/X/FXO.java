package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class FXO {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.Ejg, X.N3P] */
    public static C33137Ejg parseFromJson(C16L c16l) {
        List list;
        C14360o3.A0B(c16l, 0);
        try {
            ?? n3p = new N3P();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("users".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    }
                    n3p.A01 = arrayList;
                } else if ("upsell_cards".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C9H8 parseFromJson = AbstractC33740EvS.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    n3p.A00 = arrayList;
                } else {
                    AbstractC54184NxL.A00(c16l, n3p, A0s);
                }
                c16l.A0z();
            }
            List list2 = n3p.A01;
            if (list2 != null) {
                list = U12.A01(list2);
            } else {
                list = C16930sl.A00;
            }
            n3p.A09 = list;
            n3p.A0A = n3p.A00;
            return n3p;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
