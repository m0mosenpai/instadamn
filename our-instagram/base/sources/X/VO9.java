package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VO9 {
    public static C45039JwU parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            Long l = null;
            C45055Jwk c45055Jwk = null;
            String str = null;
            User user = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("gift".equals(A0s)) {
                    c45055Jwk = AbstractC46587KjQ.parseFromJson(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("is_liked".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("sender_info".equals(A0s)) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = AbstractC38851rI.A00(c16l, false);
                } else if ("timestamp".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                }
                c16l.A0z();
            }
            if (c45055Jwk == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("gift", c16l, "ContentAppreciationGiftFeedTransaction");
            } else if (str != null || !(c16l instanceof C07950bF)) {
                if (bool == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("is_liked", c16l, "ContentAppreciationGiftFeedTransaction");
                } else if (user == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("sender_info", c16l, "ContentAppreciationGiftFeedTransaction");
                } else if (l == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("timestamp", c16l, "ContentAppreciationGiftFeedTransaction");
                } else {
                    return new C45039JwU(c45055Jwk, user, str, l.longValue(), bool.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c16l, "ContentAppreciationGiftFeedTransaction");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
