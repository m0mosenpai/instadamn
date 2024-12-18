package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.crossposting.feed.graphql.FBToIGFeedDefaultPrivacyOptInMutationResponseImpl;

/* renamed from: X.NtP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53952NtP {
    public static final void A00(UserSession userSession, InterfaceC58044PoU interfaceC58044PoU) {
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        C55661Onm.A00(new MV7(interfaceC58044PoU, 4), new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "FBToIGFeedDefaultPrivacyOptInMutation", AbstractC25225BEi.A0b().getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), FBToIGFeedDefaultPrivacyOptInMutationResponseImpl.class, true, null, 0, null, "xcxp_set_ig_user_opt_in_default_audience_true", AbstractC166987dD.A1E()), A01, interfaceC58044PoU, 4);
    }
}
