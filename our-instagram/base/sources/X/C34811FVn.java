package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.FVn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34811FVn {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.EDY, X.1um, X.1ul] */
    public static EDY parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("phone_number_valid".equals(A0s)) {
                    c40791um.A09 = c16l.A0d();
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    c40791um.A07 = AbstractC167017dG.A0m(c16l);
                } else if ("body".equals(A0s)) {
                    c40791um.A03 = AbstractC167017dG.A0m(c16l);
                } else if (DialogModule.KEY_MESSAGE.equals(A0s)) {
                    c40791um.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("can_recover_with_code".equals(A0s)) {
                    c40791um.A08 = c16l.A0d();
                } else if (AbstractC31182DnR.A03().equals(A0s)) {
                    c40791um.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("flow_type".equals(A0s)) {
                    c40791um.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("autoconf_server_message".equals(A0s)) {
                    c40791um.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("autoconf_auth_data".equals(A0s)) {
                    c40791um.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("autoconf_metadata_blob".equals(A0s)) {
                    c40791um.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("should_enable_auto_conf_resend".equals(A0s)) {
                    c40791um.A0A = c16l.A0d();
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
