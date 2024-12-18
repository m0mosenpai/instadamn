package X;

import java.io.IOException;

/* renamed from: X.FVg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34804FVg {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.EfU, X.EfS, X.1um] */
    public static EfS parseFromJson(C16L c16l) {
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
                    c40791um.A00 = AbstractC31171DnF.A0S(c16l, false);
                } else if ("can_email_reset".equals(A0s)) {
                    c40791um.A06 = c16l.A0d();
                } else if ("can_sms_reset".equals(A0s)) {
                    c40791um.A07 = c16l.A0d();
                } else if ("can_wa_reset".equals(A0s)) {
                    c40791um.A08 = c16l.A0d();
                } else if ("fb_login_option".equals(A0s)) {
                    c40791um.A0A = c16l.A0d();
                } else if ("lookup_source".equals(A0s)) {
                    c40791um.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("corrected_input".equals(A0s)) {
                    c40791um.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("multiple_users_found".equals(A0s)) {
                    c40791um.A0B = c16l.A0d();
                } else if ("sms_sent".equals(A0s)) {
                    c40791um.A0C = c16l.A0d();
                } else if ("email_sent".equals(A0s)) {
                    c40791um.A09 = c16l.A0d();
                } else if ("obfuscated_email".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                    }
                    c16l.A1P();
                } else if ("obfuscated_phone".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                    }
                    c16l.A1P();
                } else if ("recovery_type".equals(A0s)) {
                    c40791um.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("email".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                    }
                    c16l.A1P();
                } else if ("uhl_eligible".equals(A0s)) {
                    c40791um.A0D = c16l.A0d();
                } else if (MSV.A00(44).equals(A0s)) {
                    c40791um.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("is_autoconf_test_user".equals(A0s)) {
                    c40791um.A01 = AbstractC166997dE.A0d(c16l);
                } else {
                    C35072Fcj.A00(c16l, c40791um, A0s);
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
