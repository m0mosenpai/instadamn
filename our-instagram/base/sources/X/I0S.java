package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public abstract class I0S {
    public static final void A00(InterfaceC48212Jk interfaceC48212Jk, InterfaceC48192Ji interfaceC48192Ji, UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 0);
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        A0b.A01("is_undo");
        A0b.A02("is_undo", Boolean.valueOf(z));
        AbstractC40691uc.A01(userSession).ATV(interfaceC48212Jk, interfaceC48192Ji, new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "NifuDismissalEventMutation", A0b.getParamsCopy(), A0b2.getParamsCopy(), C59548QhM.class, true, null, 0, null, "xdt_log_nifu_dismissal_event", AbstractC166987dD.A1E()));
    }
}
