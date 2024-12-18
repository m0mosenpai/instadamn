package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.253, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass253 {
    public long A00;
    public boolean A01;
    public final UserSession A02;
    public final AnonymousClass254 A03;
    public final C41061vE A04;

    public AnonymousClass253(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A04 = AbstractC41041vC.A00(userSession);
        this.A03 = (AnonymousClass254) userSession.A01(AnonymousClass254.class, new C50152MDf(userSession, 16));
        InterfaceC14020nS A00 = C14120nc.A00();
        C14360o3.A07(A00);
        A00.ATO(new AnonymousClass255(this));
        if (System.currentTimeMillis() - this.A00 > C18U.A01(C06090Tz.A05, this.A03.A00, 36611276188817674L) * 1000) {
            InterfaceC14020nS A002 = C14120nc.A00();
            C14360o3.A07(A002);
            A002.ATO(new AbstractRunnableC14200nk() { // from class: X.256
                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass253 anonymousClass253 = AnonymousClass253.this;
                    UserSession userSession2 = anonymousClass253.A02;
                    C23031Ai A003 = AbstractC23021Ah.A00(userSession2);
                    InterfaceC16530ry interfaceC16530ry = A003.A1G;
                    C0YR[] c0yrArr = C23031Ai.A8c;
                    interfaceC16530ry.Egi(A003, -1, c0yrArr[22]);
                    C23031Ai A004 = AbstractC23021Ah.A00(userSession2);
                    A004.A1H.Egi(A004, 0L, c0yrArr[23]);
                    InterfaceC14020nS A005 = C14120nc.A00();
                    C14360o3.A07(A005);
                    A005.ATO(new AnonymousClass255(anonymousClass253));
                }

                {
                    super(1793449280, 3, false, false);
                }
            });
        }
    }

    public final void A00(InterfaceC196048lu interfaceC196048lu) {
        SF0 sf0 = new SF0(this, interfaceC196048lu);
        UserSession userSession = this.A02;
        C14360o3.A0B(userSession, 0);
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "FxIgFetaInfoQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C59863Qpz.class, false, null, 0, null, "fx_pf_feta_info", new ArrayList());
        pandoGraphQLRequest.setMaxToleratedCacheAgeMs(0L);
        pandoGraphQLRequest.setEnsureCacheWrite(false);
        AbstractC40691uc.A01(userSession).ATW(new C63999SxW(sf0), new C64011Sxi(sf0), pandoGraphQLRequest, new ExecutorC14110nb(1793449280));
    }

    public AnonymousClass253() {
    }
}
