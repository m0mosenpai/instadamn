package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes8.dex */
public final class M69 implements Runnable {
    public final /* synthetic */ C6FQ A00;
    public final /* synthetic */ InterfaceC103384lE A01;
    public final /* synthetic */ InterfaceC103384lE A02;
    public final /* synthetic */ boolean A03;

    public M69(C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, InterfaceC103384lE interfaceC103384lE2, boolean z) {
        this.A00 = c6fq;
        this.A02 = interfaceC103384lE;
        this.A01 = interfaceC103384lE2;
        this.A03 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScheduledExecutorService scheduledExecutorService = LHq.A01;
        C6FQ c6fq = this.A00;
        UserSession userSession = (UserSession) C6BQ.A0B(c6fq);
        InterfaceC103384lE interfaceC103384lE = this.A02;
        InterfaceC103384lE interfaceC103384lE2 = this.A01;
        boolean z = this.A03;
        if (C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36313390142523312L)) {
            if (AbstractC46874KoH.A00(userSession).A00 == null) {
                AbstractC46874KoH.A00(userSession).A00();
            }
            C47909LEd c47909LEd = AbstractC46874KoH.A00(userSession).A00;
            if (c47909LEd != null) {
                C47909LEd.A00(c47909LEd, new BQ5(4, c47909LEd, new C50168MDv(16, userSession, true), true));
            }
        } else {
            LHq.A01(c6fq, interfaceC103384lE, interfaceC103384lE2, userSession, "disabled");
        }
        if (z) {
            LHq.A01(c6fq, interfaceC103384lE, interfaceC103384lE2, userSession, "copresence_disabled");
        }
    }
}
