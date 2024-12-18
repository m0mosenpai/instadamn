package X;

import android.os.Handler;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;

/* loaded from: classes10.dex */
public final class TR9 implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ C5MJ A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public TR9(Handler handler, C5MJ c5mj, C38321qM c38321qM, String str, String str2) {
        this.A01 = c5mj;
        this.A00 = handler;
        this.A03 = str;
        this.A02 = c38321qM;
        this.A04 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5MJ c5mj = this.A01;
        if (!c5mj.A01 && c5mj.A00 < 6) {
            String str = this.A03;
            C38321qM c38321qM = this.A02;
            String str2 = this.A04;
            C40701ud A01 = AbstractC40691uc.A01(c5mj.A02);
            C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, str, MSV.A00(80));
            C0CA.A00(A0T, str2, "ad_id");
            C2JM A0b = AbstractC25225BEi.A0b();
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T, A0b, "input"), "IGEngagedViewQuery", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), QlV.class, false, null, 0, null, "xfb_ig4a_app_install_ad_engaged_view", AbstractC166987dD.A1E());
            if (A01 != null) {
                A01.ATV(C64003Sxa.A00, new C64020Sxr(c5mj, c38321qM, str2, 0), pandoGraphQLRequest);
            }
            c5mj.A00++;
            this.A00.postDelayed(this, 10000L);
            return;
        }
        this.A00.removeCallbacks(this);
    }
}
