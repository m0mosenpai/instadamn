package X;

import com.facebook.msys.mca.MailboxNullable;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.6JR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6JR extends AbstractRunnableC14200nk {
    public final /* synthetic */ C2DG A00;

    @Override // java.lang.Runnable
    public final void run() {
        C2DG c2dg = this.A00;
        UserSession userSession = c2dg.A09;
        if (AbstractC47132Ef.A00(userSession).A03()) {
            c2dg.A03 = true;
            C14360o3.A0B(userSession, 0);
            C132025xd c132025xd = (C132025xd) AbstractC41851wZ.A00(userSession).A01(C132025xd.class, new MHJ(userSession, 14));
            final C132035xe c132035xe = new C132035xe(this);
            UserSession userSession2 = c132025xd.A01;
            if (AbstractC132045xf.A00(userSession2)) {
                L6Q A00 = AbstractC46875KoI.A00(userSession2);
                C49213LpU c49213LpU = new C49213LpU(c132035xe, c132025xd);
                C2JM c2jm = new C2JM();
                C2JM c2jm2 = new C2JM();
                C2JQ c2jq = PandoGraphQLRequest.Companion;
                PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "IGDirectSecureConsentFrameworkSettingsLiveQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), QlR.class, false, PandoRealtimeInfoJNI.forLiveQuery("ig_messaging_secure_consent_framework_live_query"), 0, null, "read_scf_settings", new ArrayList());
                AbstractC40691uc.A01(A00.A00).A01(new C48135LSk(c49213LpU), new LT2(c49213LpU, A00), pandoGraphQLRequest);
            } else {
                c132025xd.A00.A02(AbstractC132055xg.A00(userSession2).A00(), new InterfaceC42241xE() { // from class: X.64f
                    @Override // X.InterfaceC42241xE
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        Object obj2 = ((MailboxNullable) obj).value;
                        C132035xe c132035xe2 = C132035xe.this;
                        if (obj2 == null) {
                            c132035xe2.A00();
                        } else {
                            c132035xe2.A01();
                        }
                    }
                });
            }
            if (!AbstractC132045xf.A00(userSession2)) {
                c132025xd.A00.A02(C137766Ly.A00(C137746Lw.A00(userSession2, "SecureUserConsentObserver").A01).A0M(new C1342164h(C1342064g.A00)).A0L(new C135626Bn(new C9EL(c132025xd, 34))), C135636Bo.A00);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6JR(C2DG c2dg) {
        super(509922277);
        this.A00 = c2dg;
    }
}
