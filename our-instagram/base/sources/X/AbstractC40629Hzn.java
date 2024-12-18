package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Hzn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40629Hzn {
    public static final void A00(String str, UserSession userSession, C38321qM c38321qM) {
        AbstractC167017dG.A1N(userSession, c38321qM);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "ig_to_fb_deep_deletion_client");
        A0f.AAP("ig_user_id", userSession.userId);
        A0f.AAP("event_name", str);
        A0f.AAP("surface", "FEED");
        A0f.AAP("post_id", c38321qM.getId());
        A0f.Cht();
    }
}
