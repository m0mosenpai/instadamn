package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.sandbox.profilebutton.graphql.IGCreatorAgentSandboxThreadMutationResponseImpl;

/* loaded from: classes6.dex */
public final class FP6 {
    public final C40701ud A00;

    public final void A00(GXJ gxj, String str) {
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        A0b.A04("user_igid", str);
        C35826Fs2.A00(new C31463Ds7(gxj, 0), new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "IGCreatorAgentSandboxThreadMutation", A0b.getParamsCopy(), A0b2.getParamsCopy(), IGCreatorAgentSandboxThreadMutationResponseImpl.class, true, null, 0, null, "xig_create_creator_agent_thread", AbstractC166987dD.A1E()), this.A00, gxj, 0);
    }

    public FP6(UserSession userSession) {
        this.A00 = AbstractC40691uc.A01(userSession);
    }
}
