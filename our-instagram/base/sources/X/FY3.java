package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public final class FY3 {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.EDA, X.1um, X.1ul] */
    public static EDA parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC31171DnF.A1Z(A0s)) {
                    c40791um.A00 = AbstractC31171DnF.A0S(c16l, true);
                } else if ("privacy_rate_limit_dialog_title".equals(A0s)) {
                    c40791um.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("privacy_rate_limit_dialog_message".equals(A0s)) {
                    c40791um.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("has_private_public_switch_restriction".equals(A0s)) {
                    c40791um.A03 = c16l.A0d();
                } else if ("privacy_toggle_was_cancelled".equals(A0s)) {
                    c40791um.A04 = c16l.A0d();
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
