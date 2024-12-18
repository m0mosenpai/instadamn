package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.Euh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33693Euh {
    public static E7l parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            User user = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("reel_pk".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else {
                    user = AbstractC31180DnO.A0W(c16l, user, A0s, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                }
                c16l.A0z();
            }
            if (user == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_USER, c16l, "GroupMentionStickerMentionedUser");
                throw C00O.createAndThrow();
            }
            return new E7l(user, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
