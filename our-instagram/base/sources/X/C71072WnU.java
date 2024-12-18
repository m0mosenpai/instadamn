package X;

/* renamed from: X.WnU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71072WnU implements InterfaceC62602sz, InterfaceC62612t0 {
    public final /* synthetic */ C67973V4n A00;

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        return true;
    }

    public C71072WnU(C67973V4n c67973V4n) {
        this.A00 = c67973V4n;
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        C67973V4n.A03(this.A00, false);
    }

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        C68034V7f c68034V7f = this.A00.A05;
        return !(!(!C68034V7f.A00(c68034V7f.A00, c68034V7f).A02.isEmpty()));
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        C67973V4n c67973V4n = this.A00;
        return c67973V4n.A09.A02(c67973V4n.A05.A00);
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        C67973V4n c67973V4n = this.A00;
        return AbstractC37303Gc4.A1b(W5E.A00(c67973V4n.A09, c67973V4n.A05.A00).A04);
    }

    @Override // X.InterfaceC62602sz
    public final void Chd() {
        C67973V4n.A03(this.A00, true);
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        C67973V4n c67973V4n = this.A00;
        return AbstractC37303Gc4.A1a(W5E.A00(c67973V4n.A09, c67973V4n.A05.A00).A04);
    }
}
