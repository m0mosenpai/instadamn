package X;

import java.io.IOException;

/* renamed from: X.I7z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40849I7z {
    public static C38682GzN parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38682GzN c38682GzN = new C38682GzN();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("collection_id".equals(A0s)) {
                    c38682GzN.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("collection_type".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c38682GzN.A03 = A0m;
                } else if (AbstractC37300Gc1.A1Q(A0s)) {
                    c38682GzN.A04 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    c38682GzN.A07 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC37300Gc1.A1L(A0s)) {
                    c38682GzN.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("merchant_dict".equals(A0s)) {
                    c38682GzN.A01 = AbstractC31171DnF.A0S(c16l, false);
                } else if ("cover".equals(A0s)) {
                    c38682GzN.A00 = AbstractC40826I7c.parseFromJson(c16l);
                } else if ("discount_id".equals(A0s)) {
                    c38682GzN.A05 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return c38682GzN;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
