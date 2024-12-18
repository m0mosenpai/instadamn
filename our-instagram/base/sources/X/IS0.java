package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class IS0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.TwV, java.lang.Object, X.HYX] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.HYU, X.N3P] */
    public static HYU parseFromJson(C16L c16l) {
        ?? r4;
        C14360o3.A0B(c16l, 0);
        try {
            ?? n3p = new N3P();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37301Gc2.A1W(c16l, A0q)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C69794Vvd parseFromJson = AbstractC69968Vyj.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    n3p.A00 = arrayList;
                } else {
                    AbstractC54184NxL.A00(c16l, n3p, A0q);
                }
                c16l.A0z();
            }
            List<C69794Vvd> list = n3p.A00;
            if (list != null) {
                r4 = AbstractC167017dG.A0q(list);
                for (C69794Vvd c69794Vvd : list) {
                    C14360o3.A0B(c69794Vvd, 1);
                    ?? abstractC65924TwV = new AbstractC65924TwV(2);
                    abstractC65924TwV.A00 = c69794Vvd;
                    r4.add(abstractC65924TwV);
                }
            } else {
                r4 = C16930sl.A00;
            }
            C14360o3.A0B(r4, 0);
            n3p.A09 = r4;
            return n3p;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
