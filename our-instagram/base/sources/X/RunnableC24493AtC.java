package X;

/* renamed from: X.AtC, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24493AtC implements Runnable {
    public final /* synthetic */ C186688Pl A00;

    public RunnableC24493AtC(C186688Pl c186688Pl) {
        this.A00 = c186688Pl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1810281e c1810281e;
        Object obj;
        C186688Pl c186688Pl = this.A00;
        InterfaceC186578Pa interfaceC186578Pa = c186688Pl.A07;
        C186668Pj c186668Pj = c186688Pl.A08;
        YQ3 Cmd = interfaceC186578Pa.Cmd(c186688Pl.A00, c186688Pl.A04, c186668Pj, c186688Pl.A03);
        c186688Pl.A02 = Cmd;
        if (Cmd != null && Cmd.isValid()) {
            c1810281e = c186688Pl.A05;
            obj = new Object();
        } else {
            c1810281e = c186688Pl.A05;
            obj = new Object();
        }
        c1810281e.A04(obj);
    }
}
