package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class FDO {
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.Et8] */
    public static C33596Et8 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            User user = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if (AbstractC31177DnL.A1V(c16l, PublicKeyCredentialControllerUtility.JSON_KEY_USER)) {
                    user = AbstractC31171DnF.A0S(c16l, false);
                }
                c16l.A0z();
            }
            if (user == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_USER, c16l, "HighProfileUsersModel");
                throw C00O.createAndThrow();
            }
            ?? obj = new Object();
            obj.A00 = user;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
