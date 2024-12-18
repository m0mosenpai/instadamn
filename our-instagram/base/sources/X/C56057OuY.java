package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.OuY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56057OuY implements InterfaceC12870lZ {
    public final UserSession A00;
    public final C55903Orr A01;

    public C56057OuY(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = new C55903Orr(userSession);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(-1657644420);
        this.A01.A08 = false;
        C0f9.A0A(-2090598837, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        long j;
        int A03 = C0f9.A03(-198544638);
        C55903Orr c55903Orr = this.A01;
        UserSession userSession = c55903Orr.A03.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36324144740183989L)) {
            AbstractC50712Us abstractC50712Us = c55903Orr.A06;
            if (C1C0.A00(userSession)) {
                j = 36605619717018939L;
            } else {
                j = 36605619717084476L;
            }
            if (abstractC50712Us.A05(AbstractC25225BEi.A07(c06090Tz, userSession, j)) == 0) {
                c55903Orr.A08 = true;
                if (C18U.A01(c06090Tz, userSession, 36605619716822329L) > 0 && C18U.A01(c06090Tz, userSession, 36605619716953402L) > 0) {
                    C1GJ.A05(new PU6(c55903Orr), 1635172738, 3, (int) TimeUnit.SECONDS.toMillis(C18U.A01(c06090Tz, userSession, 36605619716822329L)), false, true);
                }
            }
        }
        C0f9.A0A(-1302619164, A03);
    }
}
