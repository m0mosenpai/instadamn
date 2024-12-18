package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.Nqf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53789Nqf {
    public static C51802Mv6 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            User user = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("reel_pk".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0s)) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = AbstractC38851rI.A00(c16l, false);
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("reel_pk", c16l, "StoryPromptParticipation");
            } else if (user == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_USER, c16l, "StoryPromptParticipation");
            } else {
                return new C51802Mv6(user, str);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
