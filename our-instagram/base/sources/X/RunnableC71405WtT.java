package X;

/* renamed from: X.WtT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71405WtT implements Runnable {
    public final /* synthetic */ C6FQ A00;
    public final /* synthetic */ InterfaceC103384lE A01;

    public RunnableC71405WtT(C6FQ c6fq, InterfaceC103384lE interfaceC103384lE) {
        this.A00 = c6fq;
        this.A01 = interfaceC103384lE;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6FG c6fg;
        C6FQ c6fq = this.A00;
        if (AbstractC79383gk.A03() && (c6fg = (C6FG) c6fq.A0C.get()) != null) {
            InterfaceC103384lE interfaceC103384lE = this.A01;
            C131845xK.A00(C6FQ.A01(c6fg, interfaceC103384lE, c6fq.A0D), C6FW.A01, interfaceC103384lE);
        }
    }
}
