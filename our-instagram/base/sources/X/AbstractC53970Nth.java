package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;

/* renamed from: X.Nth, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53970Nth {
    public static final C0eB A00(UserSession userSession, String str, InterfaceC16660sJ interfaceC16660sJ) {
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        C2JM A0b = AbstractC25225BEi.A0b();
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25227BEk.A0U(AbstractC43594JPz.A1X(A0b, "media_id", str)), "MetaAiContentDeepDiveQuery", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), C60484R0k.class, false, null, 0, null, "xdt_media__meta_ai_content_dive_response", AbstractC166987dD.A1E());
        A01.ATV(C55657Oni.A00, new LT1(interfaceC16660sJ, 13), pandoGraphQLRequest);
        return C0eB.A00;
    }
}
