package X;

import android.os.Handler;
import com.instagram.common.session.UserSession;

/* renamed from: X.BLy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25407BLy implements InterfaceC43446JHk {
    public final C120985dq A00;
    public final InterfaceC31077DlK A01;
    public final UserSession A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final C37644Ghd A05;
    public final C115725Li A06;
    public final C75113Zb A07;
    public final Runnable A08;
    public final Runnable A09;

    public C25407BLy(C120985dq c120985dq, C37644Ghd c37644Ghd, InterfaceC31077DlK interfaceC31077DlK, UserSession userSession, C75113Zb c75113Zb, C37648Ghh c37648Ghh) {
        C38321qM c38321qM;
        AbstractC167007dF.A1G(userSession, 2, interfaceC31077DlK);
        this.A02 = userSession;
        this.A00 = c120985dq;
        this.A05 = c37644Ghd;
        this.A01 = interfaceC31077DlK;
        this.A07 = c75113Zb;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A03 = AbstractC09440dt.A00(enumC09460dv, C29902DGq.A01(this, 23));
        this.A06 = AbstractC115715Lh.A00();
        this.A04 = AbstractC09440dt.A00(enumC09460dv, C25473BOm.A00);
        this.A09 = new RunnableC25408BLz(this);
        this.A08 = new BM0(this);
        if (c37644Ghd.A0A == null || (c38321qM = c120985dq.A02) == null || c38321qM.A1Y() == null) {
            ((C37673GiA) c37648Ghh.A05.getValue()).A00(EnumC37742GjH.A05);
        }
    }

    @Override // X.InterfaceC43446JHk
    public final void ELB(C37649Ghi c37649Ghi, C38222GrR c38222GrR) {
        boolean A1R = AbstractC167007dF.A1R(0, c37649Ghi, c38222GrR);
        UserSession userSession = this.A02;
        C06090Tz c06090Tz = C06090Tz.A05;
        long A01 = C18U.A01(c06090Tz, userSession, 36606268256884116L);
        long A012 = C18U.A01(c06090Tz, userSession, 36606268256818579L);
        if (!c37649Ghi.A02) {
            int intValue = c37649Ghi.A01.intValue();
            if (intValue != 0) {
                if (intValue != A1R) {
                    if (intValue != 2) {
                        throw B4Z.A00();
                    }
                } else {
                    A00(A012, 0L);
                    c38222GrR.A00(C37729Gj4.A02, c37649Ghi.A04, A012);
                    return;
                }
            } else {
                A00(A012, A01);
                c38222GrR.A00(C37729Gj4.A02, c37649Ghi.A04, A01 + A012);
                return;
            }
        }
        c38222GrR.A01(c37649Ghi.A04);
    }

    private final void A00(long j, long j2) {
        C75113Zb c75113Zb = this.A07;
        if (!c75113Zb.A2A || !c75113Zb.A28) {
            ((C124515k9) this.A03.getValue()).A01(c75113Zb, 0L);
            this.A06.A01(c75113Zb, 0L);
        }
        InterfaceC09390do interfaceC09390do = this.A04;
        Handler handler = (Handler) interfaceC09390do.getValue();
        Runnable runnable = this.A09;
        handler.removeCallbacks(runnable);
        Handler handler2 = (Handler) interfaceC09390do.getValue();
        Runnable runnable2 = this.A08;
        handler2.removeCallbacks(runnable2);
        ((Handler) interfaceC09390do.getValue()).postDelayed(runnable, j2);
        ((Handler) interfaceC09390do.getValue()).postDelayed(runnable2, j2 + j);
    }

    @Override // X.InterfaceC43446JHk
    public final void Cmv() {
        this.A01.ERo(this.A00, false);
    }

    @Override // X.InterfaceC43446JHk
    public final void reset() {
        this.A01.ERo(this.A00, false);
        InterfaceC09390do interfaceC09390do = this.A04;
        ((Handler) interfaceC09390do.getValue()).removeCallbacks(this.A09);
        ((Handler) interfaceC09390do.getValue()).removeCallbacks(this.A08);
        C124515k9 c124515k9 = (C124515k9) this.A03.getValue();
        C75113Zb c75113Zb = this.A07;
        c124515k9.A00(c75113Zb);
        this.A06.A00(c75113Zb);
    }
}
