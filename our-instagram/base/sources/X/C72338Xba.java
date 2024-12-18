package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.Xba, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72338Xba extends C6D6 {
    public final long A00;
    public final InterfaceC42061ww A01;
    public final AbstractC150996r0 A02;
    public final TimeUnit A03;

    public C72338Xba(AbstractC42051wv abstractC42051wv, InterfaceC42061ww interfaceC42061ww, AbstractC150996r0 abstractC150996r0, TimeUnit timeUnit) {
        super(abstractC42051wv);
        this.A00 = 2L;
        this.A03 = timeUnit;
        this.A02 = abstractC150996r0;
        this.A01 = interfaceC42061ww;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC42051wv
    public final void A02(InterfaceC42071wx interfaceC42071wx) {
        C73553YKg c73553YKg;
        AbstractC151006r1 abstractC151006r1;
        RunnableC73523YHn runnableC73523YHn;
        long j;
        TimeUnit timeUnit;
        YKe yKe;
        InterfaceC42061ww interfaceC42061ww = this.A01;
        if (interfaceC42061ww == null) {
            long j2 = this.A00;
            YKb yKb = new YKb(interfaceC42071wx, this.A02.A00(), this.A03, j2);
            interfaceC42071wx.Dpc(yKb);
            c73553YKg = yKb.A03;
            abstractC151006r1 = yKb.A02;
            runnableC73523YHn = new RunnableC73523YHn(yKb, 0L);
            j = yKb.A00;
            timeUnit = yKb.A04;
            yKe = yKb;
        } else {
            long j3 = this.A00;
            YKe yKe2 = new YKe(interfaceC42061ww, interfaceC42071wx, this.A02.A00(), this.A03, j3);
            interfaceC42071wx.Dpc(yKe2);
            c73553YKg = yKe2.A04;
            abstractC151006r1 = yKe2.A03;
            runnableC73523YHn = new RunnableC73523YHn(yKe2, 0L);
            j = yKe2.A01;
            timeUnit = yKe2.A05;
            yKe = yKe2;
        }
        C6KP.A00(abstractC151006r1.A01(runnableC73523YHn, timeUnit, j), c73553YKg);
        super.A00.EpF(yKe);
    }
}
