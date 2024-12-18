package X;

import android.os.Handler;
import com.instagram.common.session.UserSession;
import com.instagram.copresence.repository.persistence.RankedUserDatabase;

/* renamed from: X.Jeo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44124Jeo implements InterfaceC13000lm {
    public final C44125Jep A00;
    public final InterfaceC09390do A01;

    public C44124Jeo(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = new C44125Jep(userSession);
        this.A01 = AbstractC09440dt.A01(C44130Jev.A00);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C44125Jep c44125Jep = this.A00;
        AbstractRunnableC14200nk abstractRunnableC14200nk = c44125Jep.A00;
        if (abstractRunnableC14200nk != null) {
            ((Handler) c44125Jep.A09.getValue()).removeCallbacks(abstractRunnableC14200nk);
        }
        c44125Jep.A00 = null;
        UserSession userSession = c44125Jep.A03;
        C1YZ.A01(userSession, RankedUserDatabase.A00);
        InterfaceC19610xo A0w = AbstractC166987dD.A0w(AbstractC23021Ah.A00(userSession));
        A0w.E7G("copresence_model_expiration", 0L);
        A0w.apply();
    }
}
