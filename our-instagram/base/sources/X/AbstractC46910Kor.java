package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;

/* renamed from: X.Kor, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46910Kor {
    public static final Object A00(UserSession userSession, String str, InterfaceC23621Ds interfaceC23621Ds) {
        C24891Jo A0s = JQ0.A0s(interfaceC23621Ds);
        C2JM A0b = AbstractC25225BEi.A0b();
        AbstractC40691uc.A01(userSession).A06(new PandoGraphQLRequest(AbstractC25227BEk.A0U(AbstractC43594JPz.A1X(A0b, "query_string", str)), "IGDirectSearchMetaAIQueryStatePromptsQuery", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), QlP.class, false, null, 0, null, "xfb_igd_search_meta_ai_typeahead_suggestions", AbstractC166987dD.A1E()), new C44093JeI(A0s, 18));
        return A0s.A0E();
    }
}
