package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.IRp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41344IRp {
    public static C38826H7x parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            User user = null;
            Float f = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("ts".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0s)) {
                    user = AbstractC31171DnF.A0S(c16l, false);
                } else if ("vote".equals(A0s)) {
                    f = AbstractC167007dF.A0a(c16l);
                }
                c16l.A0z();
            }
            return new C38826H7x(user, f, num);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C38826H7x c38826H7x) {
        anonymousClass182.A0d();
        Integer num = c38826H7x.A02;
        if (num != null) {
            anonymousClass182.A0Q("ts", num.intValue());
        }
        User user = c38826H7x.A00;
        if (user != null) {
            AbstractC37300Gc1.A0x(anonymousClass182, user, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
        }
        Float f = c38826H7x.A01;
        if (f != null) {
            anonymousClass182.A0P("vote", f.floatValue());
        }
        anonymousClass182.A0a();
    }
}
