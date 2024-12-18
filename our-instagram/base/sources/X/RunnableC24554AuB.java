package X;

/* renamed from: X.AuB, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24554AuB implements Runnable {
    public final /* synthetic */ InterfaceC185788Ly A00;
    public final /* synthetic */ C178707wi A01;

    public RunnableC24554AuB(InterfaceC185788Ly interfaceC185788Ly, C178707wi c178707wi) {
        this.A01 = c178707wi;
        this.A00 = interfaceC185788Ly;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC178817wt interfaceC178817wt = this.A01.A03;
        if (interfaceC178817wt != null) {
            interfaceC178817wt.BQq().A8h(new C197898p0(this.A00, interfaceC178817wt.Ac3()), 0);
        }
    }
}
