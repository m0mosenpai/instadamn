package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class F8O {
    public static final C1ON A00(UserSession userSession, Integer num, String str) {
        C14360o3.A0B(userSession, 2);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("discover/dismiss_suggestion/");
        A0c.A9s("target_id", str);
        return AbstractC31178DnM.A0K(A0c, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, F8P.A00(num));
    }
}
