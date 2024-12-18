package X;

import java.io.IOException;

/* renamed from: X.F7b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34203F7b {
    public static C34554FKo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C34554FKo c34554FKo = new C34554FKo();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC31171DnF.A1Z(A0s)) {
                    c34554FKo.A00 = F99.parseFromJson(c16l);
                } else if ("user_fbid".equals(A0s)) {
                    c34554FKo.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("sso_token_user_fbid".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if ("is_sso_enabled".equals(A0s)) {
                    c34554FKo.A01 = AbstractC166997dE.A0d(c16l);
                } else if ("order_rank".equals(A0s)) {
                    c16l.A0y();
                }
                c16l.A0z();
            }
            return c34554FKo;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
