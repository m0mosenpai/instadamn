package X;

/* renamed from: X.BqB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26676BqB extends AbstractC25683BWt {
    public final /* synthetic */ C147356kL A00;

    @Override // X.InterfaceC130075uC
    public final void Dns(C6PT c6pt) {
    }

    public C26676BqB(C147356kL c147356kL) {
        this.A00 = c147356kL;
    }

    @Override // X.InterfaceC130075uC
    public final void D1i(C6PT c6pt) {
        this.A00.A00();
    }

    @Override // X.InterfaceC130075uC
    public final void DEB(C6PT c6pt, Throwable th) {
        this.A00.A00();
    }

    @Override // X.InterfaceC130075uC
    public final void DPW(C6PT c6pt) {
        C147356kL c147356kL = this.A00;
        Runnable runnable = c147356kL.A06;
        if (runnable != null) {
            runnable.run();
        }
        c147356kL.A06 = null;
    }
}
