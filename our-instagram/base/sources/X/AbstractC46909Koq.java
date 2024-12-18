package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;

/* renamed from: X.Koq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46909Koq {
    public static final Object A00(UserSession userSession, String str, InterfaceC23621Ds interfaceC23621Ds) {
        C24891Jo A0s = JQ0.A0s(interfaceC23621Ds);
        C2JM A0b = AbstractC25225BEi.A0b();
        AbstractC40691uc.A01(userSession).A06(new PandoGraphQLRequest(AbstractC25227BEk.A0U(AbstractC43594JPz.A1X(A0b, "query_string", str)), "IGDSearchMetaAIKeyboardReturnKey", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), C59719Qkl.class, false, null, 0, null, "xfb_igd_search_meta_ai_redirect", AbstractC166987dD.A1E()), new C44093JeI(A0s, 17));
        return A0s.A0E();
    }
}
