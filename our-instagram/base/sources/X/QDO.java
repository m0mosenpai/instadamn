package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.locationsharing.core.models.LiveLocationSession;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class QDO extends WUC {
    public final /* synthetic */ C7CP A00;
    public final /* synthetic */ boolean A01;

    @Override // X.InterfaceC65338TiJ
    public final void onError(Throwable th) {
        throw C00O.createAndThrow();
    }

    public QDO(C7CP c7cp, boolean z) {
        this.A01 = z;
        this.A00 = c7cp;
    }

    @Override // X.WUC
    public final /* bridge */ /* synthetic */ void A00(Object obj) {
        String str;
        LiveLocationSession liveLocationSession = (LiveLocationSession) obj;
        if (liveLocationSession == null && !this.A01) {
            C7CP c7cp = this.A00;
            C7CP.A00(c7cp, c7cp.A08, false);
            return;
        }
        C7CP c7cp2 = this.A00;
        if (liveLocationSession != null) {
            str = liveLocationSession.A04;
        } else {
            str = null;
        }
        C62565SGq c62565SGq = new C62565SGq(c7cp2, str, this.A01);
        String str2 = c7cp2.A08;
        UserSession userSession = c7cp2.A04;
        Executor executor = S82.A00;
        C2JM A0b = AbstractC25225BEi.A0b();
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25233BEq.A0H(AbstractC25227BEk.A0T(GraphQlCallInput.A02, str2, "thread_igid"), A0b, "data"), "IGDirectLiveLocationSessionsForThreadQuery", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), QlI.class, false, null, 0, null, "xfb_live_location_sessions_for_thread_query", AbstractC166987dD.A1E());
        AbstractC40691uc.A01(userSession).ATV(C64005Sxc.A00, new C58510Pwe(c62565SGq, 15), pandoGraphQLRequest);
    }
}
