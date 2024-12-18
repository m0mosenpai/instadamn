package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.96r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2052696r extends C2AG {
    public final /* synthetic */ UserSession A00;

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        C1Dk maxToleratedCacheAgeMs = new PandoGraphQLRequest(AbstractC40511uK.A00(), "IGFxLinkedAccountsQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C2052896t.class, false, null, 0, null, "fx_linked_accounts", new ArrayList()).setMaxToleratedCacheAgeMs(0L);
        final UserSession userSession = this.A00;
        AbstractC40691uc.A01(userSession).A06(maxToleratedCacheAgeMs, new C1P1() { // from class: X.96u
            @Override // X.C1P1
            public final void onFail(AbstractC115105If abstractC115105If) {
                int A03 = C0f9.A03(-2146512514);
                C14360o3.A0B(abstractC115105If, 0);
                super.onFail(abstractC115105If);
                C0K8.A0O("FxExperimentationHelper", "Error: %s", "Unable to fetch Linked Account FX Status");
                Throwable A01 = abstractC115105If.A01();
                if (A01 != null) {
                    C0w9.A06("FxExperimentationHelper", "Unable to fetch Linked Account FX Status", A01);
                } else {
                    C0w9.A03("FxExperimentationHelper", "Unable to fetch Linked Account FX Status");
                }
                UserSession userSession2 = UserSession.this;
                if (!userSession2.hasEnded()) {
                    C1GJ.A05(new C2052696r(userSession2), 713, 3, (int) C2052496p.A00, true, true);
                }
                C0f9.A0A(-670532758, A03);
            }

            @Override // X.C1P1
            public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                int A03 = C0f9.A03(-394627135);
                AnonymousClass435 anonymousClass435 = (AnonymousClass435) obj;
                int A032 = C0f9.A03(1823630116);
                C14360o3.A0B(anonymousClass435, 0);
                UserSession userSession2 = UserSession.this;
                if (!C18U.A06(C06090Tz.A05, userSession2, 36311959917822797L)) {
                    C2052496p.A02(userSession2, anonymousClass435);
                }
                C0f9.A0A(1103775869, A032);
                C0f9.A0A(1105829666, A03);
            }

            @Override // X.C1P1
            public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
                int A03 = C0f9.A03(-1971063310);
                AnonymousClass435 anonymousClass435 = (AnonymousClass435) obj;
                int A032 = C0f9.A03(1921176164);
                C14360o3.A0B(anonymousClass435, 0);
                UserSession userSession2 = UserSession.this;
                if (C18U.A06(C06090Tz.A05, userSession2, 36311959917822797L)) {
                    C2052496p.A02(userSession2, anonymousClass435);
                }
                C0f9.A0A(1911765239, A032);
                C0f9.A0A(1271628254, A03);
            }
        });
        return null;
    }

    @Override // X.C11R
    public final int getRunnableId() {
        return 713;
    }

    public C2052696r(UserSession userSession) {
        this.A00 = userSession;
    }
}
