package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.J5t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43156J5t implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C75113Zb A01;
    public final /* synthetic */ InterfaceC86433tG A02;
    public final /* synthetic */ C80243iD A03;
    public final /* synthetic */ C3YH A04;

    public RunnableC43156J5t(UserSession userSession, C75113Zb c75113Zb, InterfaceC86433tG interfaceC86433tG, C80243iD c80243iD, C3YH c3yh) {
        this.A01 = c75113Zb;
        this.A04 = c3yh;
        this.A03 = c80243iD;
        this.A00 = userSession;
        this.A02 = interfaceC86433tG;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        C75113Zb c75113Zb = this.A01;
        if (!c75113Zb.A1z) {
            c75113Zb.A0k(true);
            C3YH c3yh = this.A04;
            C80243iD c80243iD = this.A03;
            c3yh.A02(this.A00, c80243iD, true);
            C80223iB c80223iB = c80243iD.A05;
            Runnable runnable = c3yh.A02;
            if (runnable != null) {
                c3yh.A07.removeCallbacks(runnable);
                c3yh.A02 = null;
            }
            if (c80223iB.A08) {
                j = 6000;
            } else {
                j = 4000;
            }
            RunnableC43134J4x runnableC43134J4x = new RunnableC43134J4x(c75113Zb, c3yh);
            c3yh.A07.postDelayed(runnableC43134J4x, j);
            c3yh.A02 = runnableC43134J4x;
            ((InterfaceC16660sJ) c80243iD.A02.A03).invoke(this.A02);
        }
        C3YH c3yh2 = this.A04;
        Runnable runnable2 = c3yh2.A03;
        if (runnable2 != null) {
            c3yh2.A07.removeCallbacks(runnable2);
            c3yh2.A03 = null;
        }
    }
}
