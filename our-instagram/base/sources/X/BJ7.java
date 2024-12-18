package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BJ7 {
    public boolean A00;
    public boolean A01;
    public final UserSession A02;

    public BJ7(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
    }

    public final void A00(InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        this.A00 = z;
        C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, Boolean.valueOf(z), AbstractC43591JPw.A00(439));
        C2JM A0b = AbstractC25225BEi.A0b();
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T, A0b, "request_data"), "IGCommentInsightsOptinStatusMutation", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), C59358QdG.class, true, null, 0, null, "xdt_update_comment_summary_opt_in_by_user_id", AbstractC166987dD.A1E());
        AbstractC40691uc.A01(this.A02).ATV(new C28909CpI(4, interfaceC16660sJ), new C28911CpL(interfaceC16660sJ, 2), pandoGraphQLRequest);
    }
}
