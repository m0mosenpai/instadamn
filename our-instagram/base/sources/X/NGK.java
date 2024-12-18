package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NGK extends AbstractRunnableC14200nk {
    public final /* synthetic */ C25431Lx A00;

    @Override // java.lang.Runnable
    public final void run() {
        Long l;
        OCJ ocj;
        C25431Lx c25431Lx = this.A00;
        UserSession userSession = c25431Lx.A04;
        OCJ ocj2 = new OCJ(userSession);
        c25431Lx.A01 = ocj2;
        long currentTimeMillis = System.currentTimeMillis();
        int A01 = AbstractC31172DnG.A01(ocj2.A01, "qs_realtime_signal_in_disk_total_count");
        if (A01 != 0 && (ocj = c25431Lx.A01) != null) {
            C57158PZc.A02(new C54623OAy(c25431Lx, A01, currentTimeMillis), ocj, ocj.A03, 7);
        }
        C06090Tz c06090Tz = C06090Tz.A06;
        if (C18U.A06(c06090Tz, userSession, 36330084680024752L)) {
            l = AbstractC166997dE.A0i(c06090Tz, userSession, 36611559656659243L);
        } else {
            l = null;
        }
        c25431Lx.A02 = l;
        C218914p.A05(c25431Lx);
        C218914p.A05(c25431Lx);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NGK(C25431Lx c25431Lx) {
        super(213216919, 3, false, false);
        this.A00 = c25431Lx;
    }
}
