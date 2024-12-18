package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;

/* renamed from: X.Kll, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46728Kll {
    public static void A00(UserSession userSession, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "IGEBPrimaryDeviceQuery", AbstractC25225BEi.A0b().getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), C59413QeA.class, false, null, 0, null, "viewer", AbstractC166987dD.A1E());
        pandoGraphQLRequest.setMaxToleratedCacheAgeMs(0L);
        pandoGraphQLRequest.setEnsureCacheWrite(false);
        pandoGraphQLRequest.setRetryPolicy(1);
        pandoGraphQLRequest.setNetworkTimeoutSeconds(15);
        C48146LSv.A00(new C64018Sxp(3, interfaceC16660sJ, interfaceC16660sJ2), pandoGraphQLRequest, A01, interfaceC16660sJ2, 19);
    }
}
