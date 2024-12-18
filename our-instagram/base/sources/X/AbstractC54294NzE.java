package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;

/* renamed from: X.NzE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54294NzE {
    public static final void A00(InterfaceC02550Ad interfaceC02550Ad, UserSession userSession, User user) {
        AbstractC167017dG.A1P(userSession, user);
        String str = userSession.userId;
        String id = user.getId();
        boolean A0Q = C57582kX.A00(userSession).A0Q(user);
        HashMap A0e = AbstractC31179DnN.A0e();
        InterfaceC02590Ai A0H = MSY.A0H(interfaceC02550Ad, "ig_wellbeing_tag_controls_action");
        A0H.A9K("actor_ig_userid", AbstractC25228BEl.A13(str));
        AbstractC31171DnF.A1C(A0H, "click");
        AbstractC31171DnF.A1A(A0H, "non_taggable_user_in_search");
        A0H.A9K("ig_userid", AbstractC166997dE.A0j(id));
        A0H.A7v("is_following", Boolean.valueOf(A0Q));
        A0H.A9M("extra_values", A0e);
        A0H.Cht();
    }
}
