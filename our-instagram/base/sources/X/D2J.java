package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class D2J implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C26025BfE A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;

    public D2J(Activity activity, C26025BfE c26025BfE, UserSession userSession, String str) {
        this.A01 = c26025BfE;
        this.A03 = str;
        this.A00 = activity;
        this.A02 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C26025BfE c26025BfE = this.A01;
        ENS A00 = FCU.A00(c26025BfE.A0G, c26025BfE.A0F, this.A03, false);
        C3DO c3do = C3DN.A00;
        Activity activity = this.A00;
        C189478aR A0x = AbstractC25228BEl.A0x(activity, c3do);
        if (A0x != null) {
            C189448aO A0y = AbstractC25225BEi.A0y(this.A02);
            A0y.A11 = true;
            AbstractC25226BEj.A1M(activity, A0y, 2131969737);
            AbstractC25225BEi.A1Q(A0y, true);
            A0y.A03 = 0.7f;
            A0x.A0F(A00, A0y);
        }
    }
}
