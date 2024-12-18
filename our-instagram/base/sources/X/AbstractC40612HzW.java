package X;

import java.io.IOException;

/* renamed from: X.HzW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40612HzW {
    public static C132845z8 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C132845z8 c132845z8 = new C132845z8();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC37300Gc1.A1F(A0s)) {
                    c132845z8.A01 = C38321qM.A00(c16l);
                } else if ("contextual_item".equals(A0s)) {
                    c132845z8.A00 = AbstractC40608HzS.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c132845z8;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
