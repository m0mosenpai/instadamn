package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.IPu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41305IPu {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.H9u, X.1um, X.1ul] */
    public static C38872H9u parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                ArrayList arrayList = null;
                if (AbstractC37301Gc2.A1W(c16l, A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC37302Gc3.A1K(c16l, arrayList);
                        }
                    }
                    c40791um.A00 = arrayList;
                } else if (AbstractC58317Pt9.A00(99).equals(A0q)) {
                    AbstractC31178DnM.A1I(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0q);
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
