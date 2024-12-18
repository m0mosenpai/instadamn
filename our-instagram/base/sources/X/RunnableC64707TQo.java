package X;

import android.os.Handler;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;

/* renamed from: X.TQo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64707TQo implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Handler A02;
    public final /* synthetic */ C15130pT A03;

    public RunnableC64707TQo(Handler handler, C15130pT c15130pT, long j, long j2) {
        this.A03 = c15130pT;
        this.A01 = j;
        this.A00 = j2;
        this.A02 = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C15130pT c15130pT = this.A03;
        if (c15130pT.A00 < this.A01) {
            UserSession userSession = C5RL.A00;
            if (userSession != null) {
                C40701ud A01 = AbstractC40691uc.A01(userSession);
                C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, "", MSV.A00(80));
                C0CA.A00(A0T, "", "ad_id");
                C2JM A0b = AbstractC25225BEi.A0b();
                PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T, A0b, "input"), "IGEngagedViewQuery", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), QlV.class, false, null, 0, null, "xfb_ig4a_app_install_ad_engaged_view", AbstractC166987dD.A1E());
                Object obj = new Object();
                Object obj2 = new Object();
                if (A01 != null) {
                    A01.ATV(C64004Sxb.A00, new C64018Sxp(1, obj2, obj), pandoGraphQLRequest);
                }
                if (C5RL.A01) {
                    return;
                }
            }
            long j = c15130pT.A00;
            long j2 = this.A00;
            c15130pT.A00 = j + j2;
            this.A02.postDelayed(this, j2);
        }
    }
}
