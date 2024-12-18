package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.BLw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25405BLw implements InterfaceC43446JHk {
    public final UserSession A00;
    public final InterfaceC09390do A01;
    public final long A02;
    public final C37644Ghd A03;
    public final C75113Zb A04;

    public C25405BLw(C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, C75113Zb c75113Zb, C37648Ghh c37648Ghh) {
        C14360o3.A0B(userSession, 2);
        this.A00 = userSession;
        this.A03 = c37644Ghd;
        this.A04 = c75113Zb;
        long A0E = AbstractC25470BOj.A00.A0E(c120985dq, c37644Ghd, userSession);
        this.A02 = A0E;
        if (A0E <= 0) {
            AbstractC37674GiB.A00(((C37673GiA) c37648Ghh.A05.getValue()).A00(EnumC37742GjH.A06), c37648Ghh);
        }
        this.A01 = AbstractC09440dt.A01(C29902DGq.A01(this, 22));
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
                    ((C124515k9) this.A01.getValue()).A01(this.A04, 0L);
                }
            } else {
                C124515k9 c124515k9 = (C124515k9) this.A01.getValue();
                C75113Zb c75113Zb = this.A04;
                long j = this.A02;
                c124515k9.A01(c75113Zb, j);
                c38222GrR.A00(C37729Gj4.A02, c37649Ghi.A04, j);
                return;
            }
        }
        c38222GrR.A01(c37649Ghi.A04);
    }

    @Override // X.InterfaceC43446JHk
    public final void Cmv() {
        C75113Zb c75113Zb = this.A03.A0E;
        if (c75113Zb != null && c75113Zb.A2A) {
            c75113Zb.A2J = true;
        }
    }

    @Override // X.InterfaceC43446JHk
    public final void reset() {
        C75113Zb c75113Zb = this.A03.A0E;
        if (c75113Zb != null) {
            ((C124515k9) this.A01.getValue()).A00(c75113Zb);
        }
    }
}
