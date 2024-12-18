package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* loaded from: classes5.dex */
public final class BM2 implements InterfaceC43446JHk {
    public long A00;
    public final UserSession A01;
    public final InterfaceC09390do A02 = AbstractC09440dt.A00(EnumC09460dv.A02, C29902DGq.A01(this, 19));
    public final C120985dq A03;
    public final C37644Ghd A04;
    public final C75113Zb A05;

    @Override // X.InterfaceC43446JHk
    public final void Cmv() {
    }

    @Override // X.InterfaceC43446JHk
    public final void ELB(C37649Ghi c37649Ghi, C38222GrR c38222GrR) {
        boolean A1R = AbstractC167007dF.A1R(0, c37649Ghi, c38222GrR);
        if (!c37649Ghi.A02) {
            int intValue = c37649Ghi.A01.intValue();
            if (intValue != 0) {
                if (intValue != A1R) {
                    if (intValue != 2) {
                        throw B4Z.A00();
                    }
                } else {
                    ((C27951CTn) this.A02.getValue()).A00(this.A03, this.A01, this.A05, 0L);
                }
            } else {
                C27951CTn c27951CTn = (C27951CTn) this.A02.getValue();
                UserSession userSession = this.A01;
                C120985dq c120985dq = this.A03;
                C75113Zb c75113Zb = this.A05;
                long j = this.A00;
                c27951CTn.A00(c120985dq, userSession, c75113Zb, j);
                c38222GrR.A00(C37729Gj4.A02, c37649Ghi.A04, j);
                return;
            }
        }
        c38222GrR.A01(c37649Ghi.A04);
    }

    @Override // X.InterfaceC43446JHk
    public final void reset() {
        C75113Zb c75113Zb = this.A04.A0E;
        if (c75113Zb != null) {
            c75113Zb.A3R.A00(c75113Zb, false);
            C27951CTn c27951CTn = (C27951CTn) this.A02.getValue();
            int hashCode = c75113Zb.hashCode();
            Map map = c27951CTn.A01;
            Integer valueOf = Integer.valueOf(hashCode);
            Runnable runnable = (Runnable) map.get(valueOf);
            if (runnable != null) {
                c27951CTn.A00.removeCallbacks(runnable);
                map.remove(valueOf);
            }
        }
    }

    public BM2(C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, C75113Zb c75113Zb) {
        this.A01 = userSession;
        this.A03 = c120985dq;
        this.A04 = c37644Ghd;
        this.A05 = c75113Zb;
        this.A00 = 2000L;
        this.A00 = (c75113Zb.A0n() || c75113Zb.A1p || C18U.A06(C06090Tz.A05, userSession, 36323105358228465L)) ? 0L : 2000L;
    }
}
