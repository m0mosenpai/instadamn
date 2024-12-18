package X;

import com.instagram.common.session.UserSession;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.user.model.User;

/* renamed from: X.Dr6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31402Dr6 {
    public static final C31368DqX A01(UserSession userSession, String str, String str2, String str3) {
        AbstractC25233BEq.A0v(0, userSession, str2, str3);
        C31368DqX c31368DqX = new C31368DqX(userSession.token, str2, str3);
        c31368DqX.A0R = str;
        if (C2TN.A07(userSession.userId, str)) {
            c31368DqX.A0b = true;
        }
        return c31368DqX;
    }

    public static final C31368DqX A02(UserSession userSession, String str, String str2, String str3) {
        C14360o3.A0B(userSession, 0);
        AbstractC167027dH.A13(str, str2, str3);
        C31368DqX c31368DqX = new C31368DqX(userSession.token, str2, str3);
        if (!AbstractC31173DnH.A1a(str, " ")) {
            c31368DqX.A0S = str;
            User user = (User) AnonymousClass189.A00(userSession).A02.get(str);
            if (user != null && C2TN.A07(userSession.userId, user.getId())) {
                c31368DqX.A0b = true;
            }
            return c31368DqX;
        }
        throw AbstractC31175DnJ.A0V("Username cannot contain whitespace: ", str);
    }

    public static final C31368DqX A00(UserSession userSession, String str, String str2) {
        AbstractC167017dG.A1O(userSession, str2);
        C31368DqX c31368DqX = new C31368DqX(userSession.token, str, str2);
        c31368DqX.A0R = userSession.userId;
        c31368DqX.A0b = true;
        return c31368DqX;
    }

    public static UserDetailLaunchConfig A03(UserSession userSession, String str, String str2, String str3) {
        return A01(userSession, str, str2, str3).A03();
    }
}
