package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public abstract class A2H {
    public static void A00(UserSession userSession, String str) {
        C14360o3.A0B(str, 0);
        if (C14360o3.A0K(userSession.userId, str)) {
        } else {
            throw AbstractC166987dD.A14(AnonymousClass001.A0v("Not a current user session(expected=", str, ", actual=", userSession.userId, ')'));
        }
    }
}
