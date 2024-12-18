package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.UUID;

/* renamed from: X.7o7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C173557o7 {
    public boolean A00;
    public final C92694De A01 = AbstractC166177bl.A00(C92674Dc.A00);
    public final UserSession A02;

    public final void A00() {
        C19K A02 = AnonymousClass194.A02(C12L.A00.AOT(1411648610, 3));
        C206649Cv c206649Cv = new C206649Cv(this, null, 6);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206649Cv, A02);
    }

    public final void A01(boolean z) {
        String str;
        UserSession userSession = this.A02;
        InterfaceC19610xo ARD = AbstractC173927ok.A00(userSession).A00.ARD();
        ARD.E77(MSV.A00(817), z);
        ARD.apply();
        AbstractC25651Mw.A00(userSession).A05(new C55987OtK(z));
        if (z) {
            str = "ON";
        } else {
            str = "OFF";
        }
        C04060Jx c04060Jx = GraphQlCallInput.A02;
        String obj = UUID.randomUUID().toString();
        C0CA A02 = c04060Jx.A02();
        C0CA.A00(A02, obj, "client_mutation_id");
        C0CA.A00(A02, str, MSV.A00(260));
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        c2jm.A00.A02().A0E(A02, "data");
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "SetThreadsUserPreferredCrosspostSetting", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C212959cI.class, true, null, 64, null, "xcxp_set_threads_feed_crosspost_user_preference", new ArrayList());
        C19K A022 = AnonymousClass194.A02(C12L.A00.AOT(1411648610, 3));
        AbstractC23641Du.A05(AnonymousClass191.A00, new D53(pandoGraphQLRequest, this, null, 35), A022);
        C46552Bt A00 = AbstractC46542Bs.A00(userSession);
        if (!z && !A00.A0D(A00.A01)) {
            InterfaceC19610xo ARD2 = A00.A04.ARD();
            ARD2.E7G("PREFERENCE_THREADS_FEED_CROSSPOST_SETTING_LAST_DISABLED_SECONDS", System.currentTimeMillis() / 1000);
            ARD2.apply();
        }
        A00.A01 = System.currentTimeMillis();
    }

    public final boolean A02() {
        InterfaceC173987oq CI6;
        InterfaceC173487o0 interfaceC173487o0 = (InterfaceC173487o0) AbstractC173457nx.A00(this.A02).A02.getValue();
        if (interfaceC173487o0 != null && (CI6 = interfaceC173487o0.CI6()) != null && CI6.getId() != null) {
            return true;
        }
        return false;
    }

    public C173557o7(UserSession userSession) {
        this.A02 = userSession;
    }
}
