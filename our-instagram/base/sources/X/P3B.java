package X;

/* loaded from: classes9.dex */
public final class P3B implements InterfaceC58151PqG {
    public boolean A00 = true;
    public final /* synthetic */ ODw A01;
    public final /* synthetic */ NTK A02;

    @Override // X.InterfaceC58151PqG
    public final void Dar() {
        this.A00 = false;
        NTK ntk = this.A02;
        ntk.A00 = this.A01.A02;
        ntk.A06.A05(new C56656PDa(AbstractC166987dD.A0d(ntk.A08.A07), C05F.A1F, C05F.A00, false));
    }

    public P3B(ODw oDw, NTK ntk) {
        this.A01 = oDw;
        this.A02 = ntk;
    }

    @Override // X.InterfaceC58151PqG
    public final void Dja() {
        O8Q o8q = this.A01.A02;
        o8q.A00.Dco(o8q.A01, C05F.A01, null);
    }

    @Override // X.InterfaceC58151PqG
    public final void onDismiss() {
        if (this.A00) {
            O8Q o8q = this.A01.A02;
            o8q.A00.Dcp(o8q.A01);
        }
    }

    @Override // X.InterfaceC58151PqG
    public final void onShow() {
        O8Q o8q = this.A01.A02;
        o8q.A00.Dcq(o8q.A01);
    }
}
