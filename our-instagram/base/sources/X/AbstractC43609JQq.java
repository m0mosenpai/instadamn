package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.direct.lockedchat.LockedChatKillSwitch;

/* renamed from: X.JQq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43609JQq {
    public static final InterfaceC08100bW A00 = AbstractC31175DnJ.A0B();

    public static final boolean A03(C116155Nu c116155Nu, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (!LockedChatKillSwitch.isLockedChatEnabled(userSession, false) || c116155Nu.A02 != 1) {
            return false;
        }
        return true;
    }

    public static final String A00(android.net.Uri uri) {
        String queryParameter = uri.getQueryParameter("x");
        if (queryParameter == null) {
            return uri.getQueryParameter("dx");
        }
        return queryParameter;
    }

    public static final String A01(android.net.Uri uri) {
        String queryParameter = uri.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        if (queryParameter == null) {
            return uri.getQueryParameter("did");
        }
        return queryParameter;
    }

    public static final String A02(C116155Nu c116155Nu) {
        android.net.Uri A01 = AbstractC08820cl.A01(A00, AnonymousClass001.A0R("ig://", c116155Nu.A0g));
        if (A01 == null) {
            return null;
        }
        return A00(A01);
    }
}
