package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.BLx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25406BLx implements InterfaceC43446JHk {
    public final C115725Li A00;
    public final C75113Zb A01;
    public final InterfaceC09390do A02;
    public final long A03;
    public final C37644Ghd A04;

    public C25406BLx(C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, C37648Ghh c37648Ghh) {
        C14360o3.A0B(userSession, 2);
        this.A04 = c37644Ghd;
        this.A01 = c75113Zb;
        C59942oc c59942oc = AbstractC25470BOj.A00;
        long A0F = c59942oc.A0F(c120985dq, c37644Ghd, userSession) - c59942oc.A0E(c120985dq, c37644Ghd, userSession);
        this.A03 = A0F;
        if (!C59942oc.A02(AbstractC116865Qp.A01(interfaceC60442pS), c37644Ghd, userSession) && A0F <= 0) {
            AbstractC37674GiB.A00(((C37673GiA) c37648Ghh.A05.getValue()).A00(EnumC37742GjH.A03), c37648Ghh);
        }
        this.A02 = AbstractC09440dt.A01(C29902DGq.A01(userSession, 21));
        this.A00 = AbstractC115715Lh.A00();
    }

    @Override // X.InterfaceC43446JHk
    public final void ELB(C37649Ghi c37649Ghi, C38222GrR c38222GrR) {
        long j;
        boolean A1R = AbstractC167007dF.A1R(0, c37649Ghi, c38222GrR);
        if (!c37649Ghi.A02) {
            int intValue = c37649Ghi.A01.intValue();
            if (intValue != 0) {
                if (intValue != A1R) {
                    if (intValue != 2) {
                        throw B4Z.A00();
                    }
                } else {
                    j = 0;
                }
            } else {
                j = this.A03;
            }
            C75113Zb c75113Zb = this.A01;
            if (!c75113Zb.A2A) {
                ((C124515k9) this.A02.getValue()).A01(c75113Zb, j);
            }
            this.A00.A01(c75113Zb, j);
            c38222GrR.A00(C37729Gj4.A02, c37649Ghi.A04, j);
            return;
        }
        c38222GrR.A01(c37649Ghi.A04);
    }

    @Override // X.InterfaceC43446JHk
    public final void Cmv() {
        C75113Zb c75113Zb = this.A04.A0E;
        if (c75113Zb != null && c75113Zb.A28) {
            c75113Zb.A2H = true;
        }
    }

    @Override // X.InterfaceC43446JHk
    public final void reset() {
        C75113Zb c75113Zb = this.A04.A0E;
        if (c75113Zb != null) {
            ((C124515k9) this.A02.getValue()).A00(c75113Zb);
            this.A00.A00(c75113Zb);
        }
    }
}
