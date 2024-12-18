package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class FVL {
    public static final void A00(InterfaceC48212Jk interfaceC48212Jk, InterfaceC48192Ji interfaceC48192Ji, UserSession userSession, List list, boolean z) {
        C14360o3.A0B(userSession, 0);
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        C2JO c2jo = new C2JO();
        c2jo.A05("auto_confirm_accounts_to_disable_ids", list);
        c2jo.A08("should_disable_auto_confirm_for_all_reciprocal_requests", Boolean.valueOf(z));
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        A0b.A00(c2jo, "data");
        A01.ATV(interfaceC48212Jk, interfaceC48192Ji, new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "DisableAutoConfirmReciprocalFollowRequests", A0b.getParamsCopy(), A0b2.getParamsCopy(), C59568Qhg.class, true, null, 0, null, "xdt_disable_auto_confirm_reciprocal_follow_requests", AbstractC166987dD.A1E()));
    }

    public static final void A01(InterfaceC48212Jk interfaceC48212Jk, InterfaceC48192Ji interfaceC48192Ji, UserSession userSession, List list, boolean z) {
        C14360o3.A0B(userSession, 0);
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        C2JO c2jo = new C2JO();
        c2jo.A05("auto_confirm_accounts_ids", list);
        c2jo.A08("should_auto_confirm_all_reciprocal_requests", Boolean.valueOf(z));
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        A0b.A00(c2jo, "data");
        A01.ATV(interfaceC48212Jk, interfaceC48192Ji, new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "EnableAutoConfirmReciprocalFollowRequests", A0b.getParamsCopy(), A0b2.getParamsCopy(), C59570Qhi.class, true, null, 0, null, "xdt_enable_auto_confirm_reciprocal_follow_requests", AbstractC166987dD.A1E()));
    }
}
