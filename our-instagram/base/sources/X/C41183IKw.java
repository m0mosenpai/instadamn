package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.reels.api.ReelsTrayQueryResponseImpl;

/* renamed from: X.IKw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41183IKw {
    public final C98944cE A00(UserSession userSession, Integer num, Integer num2) {
        AbstractC167017dG.A1P(num, num2);
        String A0j = AbstractC167017dG.A0j();
        String A0j2 = AbstractC167017dG.A0j();
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        A0b.A04("reason", AbstractC25631Mt.A00(num2));
        A0b.A03("page_size", 25);
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "ReelsTrayQuery", A0b.getParamsCopy(), A0b2.getParamsCopy(), ReelsTrayQueryResponseImpl.class, false, null, 0, null, "xdt_api__v1__feed__reels_tray", AbstractC166987dD.A1E());
        C14360o3.A0C(pandoGraphQLRequest, AbstractC111324zv.A00(4973));
        return new C98944cE(new MWI(pandoGraphQLRequest, null, A01, new ExecutorC14110nb(146195775)), num, num2, C05F.A00, A0j, A0j2);
    }
}
