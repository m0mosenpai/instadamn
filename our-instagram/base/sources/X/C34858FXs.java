package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.FXs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34858FXs {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.EDR, X.1um, X.1ul] */
    public static EDR parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("friendship_status".equals(A0s)) {
                    C151516rx parseFromJson = C151526ry.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c40791um.A01 = parseFromJson;
                } else if ("privacy_rate_limit_dialog_title".equals(A0s)) {
                    c40791um.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("privacy_rate_limit_dialog_message".equals(A0s)) {
                    c40791um.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("has_private_public_switch_restriction".equals(A0s)) {
                    c40791um.A05 = c16l.A0d();
                } else if ("previous_following".equals(A0s)) {
                    c40791um.A07 = c16l.A0d();
                } else if ("max_followed_error".equals(A0s)) {
                    c40791um.A06 = c16l.A0d();
                } else if (DialogModule.KEY_MESSAGE.equals(A0s)) {
                    c40791um.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("growth_friction_detail".equals(A0s)) {
                    c40791um.A00 = IOK.parseFromJson(c16l);
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
