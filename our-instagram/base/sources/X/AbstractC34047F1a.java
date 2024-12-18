package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;

/* renamed from: X.F1a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34047F1a {
    public static final void A00(UserSession userSession) {
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        A0b.A04("nux_type", AbstractC111324zv.A00(1649));
        AbstractC40691uc.A01(userSession).ATV(null, new C31463Ds7(userSession, 2), new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "ConsentStatusWriteMutation", A0b.getParamsCopy(), A0b2.getParamsCopy(), C59369QdR.class, true, null, 0, null, "xfb_messenger_gen_ai_nux_write_consent", AbstractC166987dD.A1E()));
    }
}
