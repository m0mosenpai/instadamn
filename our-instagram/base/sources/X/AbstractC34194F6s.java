package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;

/* renamed from: X.F6s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34194F6s {
    public static final void A00(UserSession userSession, GZ4 gz4) {
        C14360o3.A0B(userSession, 0);
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "InstagramContactSyncForWearablesQuery", A0b.getParamsCopy(), A0b2.getParamsCopy(), Qg2.class, false, null, 0, null, AbstractC58317Pt9.A00(1074), AbstractC166987dD.A1E());
        pandoGraphQLRequest.setAdditionalCacheQueryKey(userSession.userId);
        C35826Fs2.A00(new C58510Pwe(gz4, 18), pandoGraphQLRequest, AbstractC40691uc.A01(userSession), gz4, 7);
    }
}
