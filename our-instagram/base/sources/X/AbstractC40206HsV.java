package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.HsV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40206HsV {
    public static C38757H4x parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C54M c54m = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            User user = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("recs_from_friend_card".equals(A0s)) {
                    c54m = C54L.parseFromJson(c16l);
                } else if ("target_following_status".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else {
                    user = AbstractC31180DnO.A0W(c16l, user, A0s, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                }
                c16l.A0z();
            }
            return new C38757H4x(c54m, user, bool);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
