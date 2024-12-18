package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public final class ISI {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.HAd, X.1um, X.1ul] */
    public static C38881HAd parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("can_tag_products_from_merchant".equals(A0s)) {
                    c40791um.A02 = c16l.A0d();
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    c40791um.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("body".equals(A0s)) {
                    c40791um.A00 = AbstractC167017dG.A0m(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
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
