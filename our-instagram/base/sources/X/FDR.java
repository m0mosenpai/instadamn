package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;

/* loaded from: classes6.dex */
public abstract class FDR {
    public static final void A00(InterfaceC02550Ad interfaceC02550Ad, UserSession userSession, User user, String str, String str2, String str3) {
        C14360o3.A0B(userSession, 1);
        HashMap A0e = AbstractC31179DnN.A0e();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f((C18920wW) interfaceC02550Ad, "ig_wellbeing_mention_controls_action");
        A0f.A9K("actor_ig_userid", Long.valueOf(userSession.userId));
        A0f.AAP("entrypoint", str);
        AbstractC31171DnF.A1C(A0f, str2);
        AbstractC31171DnF.A1A(A0f, str3);
        A0f.A7v("is_user_mentionable_value_consistent", true);
        A0f.A9M("extra_values", A0e);
        if (user != null) {
            A0f.A9K("ig_userid", Long.valueOf(user.getId()));
            A0f.A7v("is_user_mentionable", Boolean.valueOf(user.A2D()));
            A0f.A7v(MSV.A00(217), Boolean.valueOf(C57582kX.A00(userSession).A0Q(user)));
        }
        A0f.Cht();
    }
}
