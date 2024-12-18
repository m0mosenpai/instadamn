package X;

import android.content.Context;
import android.content.DialogInterface;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class Og9 implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AbstractC10360h2 A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ C145176gc A03;
    public final /* synthetic */ String A04;

    public Og9(Context context, AbstractC10360h2 abstractC10360h2, C38321qM c38321qM, C145176gc c145176gc, String str) {
        this.A03 = c145176gc;
        this.A04 = str;
        this.A01 = abstractC10360h2;
        this.A00 = context;
        this.A02 = c38321qM;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C145176gc c145176gc = this.A03;
        UserSession userSession = c145176gc.A09;
        if (userSession == null) {
            AbstractC31171DnF.A0y();
            throw C00O.createAndThrow();
        }
        String str = this.A04;
        AbstractC10360h2 abstractC10360h2 = this.A01;
        Context context = this.A00;
        D8I d8i = new D8I(38, this.A02, c145176gc);
        C2JM A0b = AbstractC25225BEi.A0b();
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25233BEq.A0H(AbstractC25227BEk.A0T(GraphQlCallInput.A02, str, "media_id"), A0b, "input"), "DeleteFriendsStoryMutation", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), C60285Qwx.class, true, null, 0, null, "xdt_ig_delete_friends_story", AbstractC166987dD.A1E());
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        C54809OKh c54809OKh = new C54809OKh(null, abstractC10360h2, C05F.A00);
        c54809OKh.A01();
        A01.ATV(new C55656Onh(6, c54809OKh, context), new C35831Fs7(4, context, d8i, c54809OKh), pandoGraphQLRequest);
    }
}
