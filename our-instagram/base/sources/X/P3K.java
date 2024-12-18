package X;

import android.app.Activity;
import android.view.View;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P3K implements InterfaceC58152PqH {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C38321qM A02;

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    @Override // X.InterfaceC58152PqH
    public final void onTextClick(View view) {
        C14360o3.A0B(view, 0);
        onButtonClick(view);
    }

    public P3K(Activity activity, UserSession userSession, C38321qM c38321qM) {
        this.A02 = c38321qM;
        this.A01 = userSession;
        this.A00 = activity;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        C41717Idn.A00(this.A00, this.A01, this.A02);
    }

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
        C04060Jx c04060Jx = GraphQlCallInput.A02;
        String A2u = this.A02.A2u();
        C0CA A02 = c04060Jx.A02();
        C0CA.A00(A02, A2u, "media_id");
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        A0b.A00.A02().A0E(A02, "data");
        UserSession userSession = this.A01;
        C55670Onv c55670Onv = C55670Onv.A00;
        AbstractC40691uc.A01(userSession).ATV(null, c55670Onv, new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "OpenCarouselDismissPendingMediaProfileBannerMutation", A0b.getParamsCopy(), A0b2.getParamsCopy(), R0G.class, AbstractC167007dF.A1V(c55670Onv), null, 0, null, "xdt_dismiss_open_carousel_pending_media_profile_banner", AbstractC166987dD.A1E()));
    }
}
