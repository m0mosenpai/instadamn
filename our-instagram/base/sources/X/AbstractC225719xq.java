package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.9xq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225719xq {
    public static final boolean A00(C6FQ c6fq, C6FW c6fw) {
        boolean A01 = C6DZ.A01(c6fw.A03(0));
        Object A03 = c6fw.A03(1);
        C14360o3.A0C(A03, "null cannot be cast to non-null type kotlin.String");
        if (C14360o3.A0K(A03, "story")) {
            Object A00 = c6fw.A00();
            C14360o3.A0C(A00, "null cannot be cast to non-null type kotlin.String");
            if (C14360o3.A0K(A00, "close_friends")) {
                UserSession userSession = (UserSession) C6BQ.A0B(c6fq);
                InterfaceC19610xo ARD = AbstractC46542Bs.A00(userSession).A04.ARD();
                ARD.E77("PREFERENCE_AUTO_CROSS_POST_TO_FACEBOOK_STORY_CLOSE_FRIENDS", A01);
                ARD.apply();
                C14360o3.A0B(userSession, 0);
                InterfaceC19610xo ARD2 = AbstractC46542Bs.A00(new C8DP(userSession).A00).A04.ARD();
                ARD2.E77("PREFERENCE_AUTO_CROSS_POST_TO_FACEBOOK_STORY_CLOSE_FRIENDS_EDUCATION_HAS_SHOWN", true);
                ARD2.apply();
                return true;
            }
        }
        return false;
    }
}
