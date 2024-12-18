package X;

/* renamed from: X.AuC, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24555AuC implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C23128AMg A01;

    public RunnableC24555AuC(C23128AMg c23128AMg, long j) {
        this.A01 = c23128AMg;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC178817wt interfaceC178817wt;
        C23128AMg c23128AMg = this.A01;
        long j = this.A00;
        if (c23128AMg.A0V.compareAndSet(1, 2)) {
            if (!c23128AMg.A0Y) {
                C23128AMg.A03(c23128AMg, true);
                c23128AMg.A04 = j;
                C23128AMg.A02(c23128AMg, c23128AMg.A01, c23128AMg.A00);
            } else {
                C23128AMg.A03(c23128AMg, false);
                C23128AMg.A05(c23128AMg, false);
            }
            C178707wi c178707wi = c23128AMg.A0L.A00;
            C197908p1 c197908p1 = c178707wi.A00;
            if (c197908p1 != null && (interfaceC178817wt = c178707wi.A03) != null) {
                interfaceC178817wt.getHandler().post(new RunnableC24553AuA(c197908p1, c178707wi));
            }
        }
    }
}
