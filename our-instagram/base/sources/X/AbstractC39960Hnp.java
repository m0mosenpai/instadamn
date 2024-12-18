package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Hnp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39960Hnp {
    /* JADX WARN: Type inference failed for: r4v0, types: [X.1um, X.H9G, X.1ul] */
    public static H9G parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("max_id".equals(A0s)) {
                    c40791um.A02 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC37300Gc1.A1W(A0s)) {
                    c40791um.A01 = AbstractC166997dE.A0d(c16l);
                } else if ("users".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    }
                    c40791um.A03 = arrayList;
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            String str = c40791um.A02;
            boolean A1b = AbstractC31172DnG.A1b(c40791um.A01);
            List list = c40791um.A03;
            C14360o3.A0A(list);
            c40791um.A00 = new XVT(str, list, A1b);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
