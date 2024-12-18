package X;

/* loaded from: classes7.dex */
public final class J4D implements Runnable {
    public final /* synthetic */ C41117IIi A00;

    public J4D(C41117IIi c41117IIi) {
        this.A00 = c41117IIi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C146016hy c146016hy = ((AbstractC149546o6) this.A00.A03).A00;
        if (c146016hy != null) {
            C2Fb c2Fb = C2Fb.A3a;
            InterfaceC144586fe interfaceC144586fe = c146016hy.A05;
            C41181vS AuU = c146016hy.A04.AuU();
            if (AuU != null) {
                interfaceC144586fe.CJE(null, AuU, null, c2Fb);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }
}
