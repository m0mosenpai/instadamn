package X;

/* renamed from: X.AuF, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24558AuF implements Runnable {
    public final /* synthetic */ ABD A00;
    public final /* synthetic */ C178687wg A01;

    public RunnableC24558AuF(ABD abd, C178687wg c178687wg) {
        this.A01 = c178687wg;
        this.A00 = abd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C178687wg c178687wg = this.A01;
        InterfaceC178817wt interfaceC178817wt = c178687wg.A05;
        if (interfaceC178817wt == null) {
            this.A00.A00(new AbstractC223559ty(10015, "MediaGraphController is null."));
            return;
        }
        InterfaceC179497xz interfaceC179497xz = c178687wg.A04;
        if (interfaceC179497xz != null) {
            interfaceC179497xz.DfO(new C23494AbA(false));
        }
        InterfaceC178737wl interfaceC178737wl = c178687wg.A06;
        if (interfaceC178737wl != null) {
            interfaceC178737wl.EbN(false);
        }
        int i = c178687wg.A03;
        int i2 = c178687wg.A01;
        Integer valueOf = Integer.valueOf(i);
        AZA aza = new AZA(interfaceC178817wt.Ac3(), Integer.valueOf(i2), Integer.valueOf(-c178687wg.A02), valueOf, 2);
        interfaceC178817wt.BQq().A8h(aza, 0);
        aza.A00(new AZG(interfaceC178817wt, this.A00, aza));
        interfaceC178817wt.EGn(null);
        if (interfaceC179497xz != null) {
            interfaceC179497xz.DfO(new C23495AbB(false));
        }
        if (interfaceC178737wl == null) {
            return;
        }
        interfaceC178737wl.EbN(true);
    }
}
