package X;

import com.instagram.api.schemas.GrowthFrictionInterventionDetail;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.IdB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41682IdB {
    public static final C41682IdB A00 = new Object();

    public static final void A00(GrowthFrictionInterventionDetail growthFrictionInterventionDetail, UserSession userSession, User user, Integer num, String str) {
        String str2;
        C18920wW A01 = AbstractC12220kQ.A01(null, userSession);
        C4SX A002 = C4SX.A00(userSession.userId);
        C4SX A003 = C4SX.A00(user.getId());
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A01, "ig_ro_growth_friction");
        String AYR = growthFrictionInterventionDetail.AYR();
        String str3 = "friction_intervention_type";
        if (!C14360o3.A0K(AYR, "Friction") && C14360o3.A0K(AYR, "Disable")) {
            str3 = "disable_intervention_type";
        }
        if (A0f.isSampled()) {
            int intValue = num.intValue();
            if (intValue != 2) {
                if (intValue != 1) {
                    str2 = "follow";
                } else {
                    str2 = "tag";
                }
            } else {
                str2 = "mention";
            }
            A0f.AAP("category", str2);
            A0f.AAP("event", str);
            String BJA = growthFrictionInterventionDetail.BJA();
            if (BJA == null) {
                BJA = "";
            }
            A0f.AAP("intervention_name", BJA);
            A0f.AAK(A003, "target_user_ig_id");
            A0f.AAP("subevent", str3);
            A0f.AAK(A002, "viewer_user_ig_id");
            A0f.Cht();
        }
    }
}
