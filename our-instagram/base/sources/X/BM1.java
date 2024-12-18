package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BM1 implements InterfaceC43446JHk {
    public final C120985dq A00;
    public final UserSession A01;
    public final C115725Li A02;
    public final BP3 A03;
    public final C75113Zb A04;
    public final InterfaceC09390do A05;
    public final long A06;
    public final C37644Ghd A07;

    public BM1(C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, C75113Zb c75113Zb, C37648Ghh c37648Ghh) {
        long j;
        C4o9 c4o9;
        Integer AwU;
        C14360o3.A0B(userSession, 2);
        this.A01 = userSession;
        this.A00 = c120985dq;
        this.A04 = c75113Zb;
        this.A07 = c37644Ghd;
        if (AbstractC37647Ghg.A01(c120985dq.A01) && ((!c37644Ghd.A0W || C18U.A06(C06090Tz.A06, userSession, 36324436797960361L)) && (c4o9 = c120985dq.A06().A0N) != null && (AwU = c4o9.AwU()) != null)) {
            j = AwU.intValue();
        } else {
            j = 0;
        }
        this.A06 = j;
        this.A05 = AbstractC09440dt.A01(C29902DGq.A01(this, 20));
        this.A02 = AbstractC115715Lh.A00();
        this.A03 = (BP3) BP3.A03.getValue();
        if (j <= 0) {
            if (!c120985dq.A0A || !C18U.A06(C06090Tz.A06, userSession, 36319209825901641L)) {
                ((C37673GiA) c37648Ghh.A05.getValue()).A00(EnumC37742GjH.A04);
            }
        }
    }

    @Override // X.InterfaceC43446JHk
    public final void ELB(C37649Ghi c37649Ghi, C38222GrR c38222GrR) {
        boolean A1R = AbstractC167007dF.A1R(0, c37649Ghi, c38222GrR);
        if (!c37649Ghi.A02) {
            int intValue = c37649Ghi.A01.intValue();
            long j = 0;
            if (intValue != 0) {
                if (intValue != A1R) {
                    if (intValue != 2) {
                        throw B4Z.A00();
                    }
                }
            } else {
                j = this.A06;
            }
            C75113Zb c75113Zb = this.A04;
            if (!c75113Zb.A2A || !c75113Zb.A28) {
                c75113Zb.A0j(true);
                InterfaceC09390do interfaceC09390do = this.A05;
                ((C124515k9) interfaceC09390do.getValue()).A00(c75113Zb);
                C115725Li c115725Li = this.A02;
                c115725Li.A00(c75113Zb);
                this.A03.A01(c75113Zb);
                ((C124515k9) interfaceC09390do.getValue()).A01(c75113Zb, 0L);
                c115725Li.A01(c75113Zb, 0L);
            }
            this.A03.A00(this.A00, this.A01, c75113Zb, j);
            c38222GrR.A00(C37729Gj4.A02, c37649Ghi.A04, j);
            return;
        }
        c38222GrR.A01(c37649Ghi.A04);
    }

    @Override // X.InterfaceC43446JHk
    public final void Cmv() {
        C75113Zb c75113Zb = this.A04;
        if (c75113Zb.A0n()) {
            c75113Zb.A2I = true;
        }
    }

    @Override // X.InterfaceC43446JHk
    public final void reset() {
        C75113Zb c75113Zb = this.A04;
        c75113Zb.A0j(c75113Zb.A0n());
        ((C124515k9) this.A05.getValue()).A00(c75113Zb);
        this.A02.A00(c75113Zb);
        this.A03.A01(c75113Zb);
    }
}
