package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

/* renamed from: X.Nuh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54031Nuh {
    public static final C1ON A00(UserSession userSession, O39 o39, String str, String str2, String str3, String str4) {
        AbstractC167017dG.A1P(o39, str);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("igtv/channel/");
        A0c.A9s(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        A0c.A9s("max_id", str2);
        A0c.A0D("count", 10);
        if (str2 != null && str2.length() != 0) {
            str4 = null;
        }
        A0c.A9s("start_at_media_id", str4);
        A0c.A0H("encoded_paging_token", str3);
        A0c.A0P(null, C38900HAw.class, C41314IQk.class, false);
        AbstractC37301Gc2.A0t(o39.A00, A0c, userSession);
        return A0c.A0N();
    }
}
