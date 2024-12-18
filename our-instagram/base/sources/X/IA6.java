package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public abstract class IA6 {
    public static final void A00(UserSession userSession, User user, String str) {
        C18920wW A01 = AbstractC12220kQ.A01(null, userSession);
        C4SX A00 = C4SX.A00(userSession.userId);
        C4SX A002 = C4SX.A00(user.getId());
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A01, "ig_ro_growth_friction");
        if (A0f.isSampled()) {
            A0f.AAP("category", "follow");
            A0f.AAP("event", str);
            A0f.AAP("intervention_name", "Follow Friction");
            A0f.AAK(A002, "target_user_ig_id");
            A0f.AAP("subevent", "friction_intervention_type");
            A0f.AAK(A00, "viewer_user_ig_id");
            A0f.Cht();
        }
    }
}
