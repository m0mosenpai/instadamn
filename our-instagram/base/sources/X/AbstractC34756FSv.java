package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.FSv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34756FSv {
    public static final C121275eQ A01(Context context, android.net.Uri uri, UserSession userSession, String str, int i) {
        C14360o3.A0B(userSession, 1);
        return new C121275eQ(new TUV(context, uri, userSession, str, i), 450);
    }

    public static final C1ON A00(UserSession userSession) {
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("accounts/remove_profile_picture/");
        ((AbstractC23721Ec) A0c).A04 = new T88(userSession, 2);
        return AbstractC31178DnM.A0J(A0c, EBC.class, C34757FSw.class);
    }
}
