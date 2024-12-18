package X;

import android.view.View;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;

/* loaded from: classes8.dex */
public final class KYK extends C49489Lu2 {
    public final /* synthetic */ KZG A00;
    public final /* synthetic */ String A01;

    public KYK(KZG kzg, String str) {
        this.A00 = kzg;
        this.A01 = str;
    }

    @Override // X.C49489Lu2, X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        KZG kzg = this.A00;
        C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, this.A01, "spotlight_post_id");
        C2JM A0b = AbstractC25225BEi.A0b();
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T, A0b, "input"), "SpotlightDeletePostMutation", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), C60298QxA.class, true, null, 0, null, "xdt_delete_spotlight_post", AbstractC166987dD.A1E());
        AbstractC166987dD.A1Z(new C57158PZc(pandoGraphQLRequest, kzg, null, 8), ((C4A7) kzg).A01);
    }
}
