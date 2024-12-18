package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes8.dex */
public final class KZG extends C4A7 {
    public final C40701ud A00;
    public final UserSession A01;

    public final void A00(ImageUrl imageUrl, String str, String str2) {
        boolean A1R = AbstractC167007dF.A1R(0, str, str2);
        C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, str, "media_id");
        C0CA.A00(A0T, str2, "caption");
        C2JM A0b = AbstractC25225BEi.A0b();
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T, A0b, "input"), "SpotlightCreatePostMutation", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), C60296Qx8.class, A1R, null, 0, null, "xdt_create_spotlight_post", AbstractC166987dD.A1E());
        AbstractC166987dD.A1Z(new JZ1(imageUrl, pandoGraphQLRequest, this, str, str2, null, 12), super.A01);
    }

    public KZG(UserSession userSession) {
        super("SpotlightAddContentRepository", C4A8.A00(715519324));
        this.A01 = userSession;
        this.A00 = AbstractC40691uc.A01(userSession);
    }
}
