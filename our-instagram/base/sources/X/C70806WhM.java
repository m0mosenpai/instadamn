package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.WhM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70806WhM implements InterfaceC13000lm {
    public boolean A00;
    public final UserSession A01;

    public C70806WhM(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public final void A00(C69249VkI c69249VkI) {
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "FXSSOInfoQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C67137Uh7.class, false, null, 0, null, "xfb_fx_sso_info", new ArrayList());
        AbstractC40691uc.A01(this.A01).ATV(new C70434WVm(c69249VkI, 10), new WW5(2, this, new Object(), c69249VkI), pandoGraphQLRequest);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01.A03(C70806WhM.class);
    }
}
