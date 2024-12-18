package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public abstract class F7Y {
    public static final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, User user, String str, String str2) {
        C14360o3.A0B(userSession, 0);
        String id = user.getId();
        boolean A1X = AbstractC167007dF.A1X(user.A0M(), C05F.A0C);
        String A06 = AbstractC38851rI.A06(user.B7L());
        boolean A1r = user.A1r();
        boolean A1p = user.A1p();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_overflow_menu_selected");
        if (A0f.isSampled()) {
            AbstractC31175DnJ.A14(A0f, interfaceC11380iw);
            A0f.A9K("target_user_id", Long.valueOf(AbstractC25232BEp.A0t(AbstractC003100w.A0k(10, id))));
            A0f.A7v("target_is_private", Boolean.valueOf(A1X));
            A0f.A9K("media_id", AbstractC31177DnL.A0Z(str));
            A0f.AAP("selected_from", str2);
            A0f.AAP("follow_status", A06);
            A0f.A7v("target_posts_muted", AbstractC31173DnH.A0d(A0f, AbstractC31173DnH.A0e(A0f, "reel_type", "story", A1r), "target_stories_muted", A1p));
            A0f.Cht();
        }
    }
}
