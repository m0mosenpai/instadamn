package X;

import java.util.Calendar;
import java.util.Date;

/* renamed from: X.Wij, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70878Wij implements InterfaceC58115Ppe {
    public final /* synthetic */ C6FQ A00;
    public final /* synthetic */ C102884kP A01;
    public final /* synthetic */ InterfaceC103384lE A02;
    public final /* synthetic */ C15100pQ A03;
    public final /* synthetic */ C15370ps A04;

    @Override // X.InterfaceC58115Ppe
    public final void D9K(Date date) {
    }

    public C70878Wij(C6FQ c6fq, C102884kP c102884kP, InterfaceC103384lE interfaceC103384lE, C15100pQ c15100pQ, C15370ps c15370ps) {
        this.A03 = c15100pQ;
        this.A00 = c6fq;
        this.A02 = interfaceC103384lE;
        this.A04 = c15370ps;
        this.A01 = c102884kP;
    }

    @Override // X.InterfaceC58115Ppe
    public final void DB6() {
        if (this.A03.A00 == 0) {
            C6FQ c6fq = this.A00;
            InterfaceC103384lE interfaceC103384lE = this.A02;
            C6FX c6fx = new C6FX();
            c6fx.A03(Integer.valueOf(this.A01.A03(36, 0)), 0);
            AbstractC25227BEk.A1M(c6fq, c6fx, interfaceC103384lE);
        }
    }

    @Override // X.InterfaceC58115Ppe
    public final void DBG(Date date) {
        if (date != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.set(14, 0);
            calendar.set(13, 0);
            Date time = calendar.getTime();
            C14360o3.A07(time);
            C15100pQ c15100pQ = this.A03;
            C6FQ c6fq = this.A00;
            InterfaceC103384lE interfaceC103384lE = this.A02;
            C15370ps c15370ps = this.A04;
            int time2 = (int) (time.getTime() / 1000);
            c15100pQ.A00 = time2;
            C6FX c6fx = new C6FX();
            c6fx.A03(Integer.valueOf(time2), 0);
            AbstractC25227BEk.A1M(c6fq, c6fx, interfaceC103384lE);
            OWa oWa = (OWa) c15370ps.A00;
            if (oWa != null) {
                oWa.A01();
            }
        }
    }
}
