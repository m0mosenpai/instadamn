package X;

import java.io.IOException;

/* renamed from: X.Hrd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40165Hrd {
    public static C38741H4f parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            C38321qM c38321qM = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("highlighted_media_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("media".equals(A0s)) {
                    c38321qM = C38321qM.A00(c16l);
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("highlighted_media_id", c16l, "ProductDetailsMediaContentImpl");
            } else if (c38321qM == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("media", c16l, "ProductDetailsMediaContentImpl");
            } else {
                return new C38741H4f(c38321qM, str);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
