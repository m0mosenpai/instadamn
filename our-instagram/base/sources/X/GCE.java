package X;

import com.instagram.common.session.UserSession;
import com.instagram.wellbeing.supervisionupsells.constants.IGSupervisionUpsellEligibilityStatus;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes6.dex */
public final class GCE implements C5OV {
    public final UserSession A00;
    public final List A01;

    @Override // X.C5OV
    public final boolean E3b(C5OW c5ow) {
        IGSupervisionUpsellEligibilityStatus iGSupervisionUpsellEligibilityStatus;
        C14360o3.A0B(c5ow, 0);
        UserSession userSession = this.A00;
        LinkedHashMap A03 = AbstractC06930Yk.A03(AbstractC23021Ah.A00(userSession).A0F());
        boolean z = false;
        for (Object obj : this.A01) {
            if (A03.containsKey(obj) && (iGSupervisionUpsellEligibilityStatus = (IGSupervisionUpsellEligibilityStatus) A03.get(obj)) != null && iGSupervisionUpsellEligibilityStatus.A00) {
                C18920wW A02 = AbstractC12220kQ.A02(userSession);
                String str = c5ow.A01;
                C14360o3.A0B(obj, 1);
                LinkedHashMap A0p = AbstractC25233BEq.A0p("promotion_id", str, AbstractC166987dD.A1L("eligibility", obj));
                C25531Mh A0A = AbstractC31179DnN.A0A(A02, "ig_user_passes_supervision_upsell_eligibility_check");
                A0A.A0w(A0p);
                A0A.Cht();
                z = true;
            }
        }
        return z;
    }

    public GCE(UserSession userSession, List list) {
        this.A00 = userSession;
        this.A01 = list;
    }
}
