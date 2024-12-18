package X;

/* loaded from: classes12.dex */
public final class YBC implements C42N {
    public final /* synthetic */ XVe A00;

    @Override // X.C42N
    public final void DiR(AbstractC107474ss abstractC107474ss) {
    }

    @Override // X.C42N
    public final void E24(AbstractC107474ss abstractC107474ss) {
    }

    @Override // X.C42N
    public final boolean Ejs(AbstractC107474ss abstractC107474ss) {
        return true;
    }

    public YBC(XVe xVe) {
        this.A00 = xVe;
    }

    @Override // X.C42N
    public final void DH4(AbstractC107474ss abstractC107474ss) {
        abstractC107474ss.A01.remove(this);
        XVe xVe = this.A00;
        xVe.A01 = false;
        xVe.A03();
    }

    @Override // X.C42N
    public final void D1y(AbstractC107474ss abstractC107474ss) {
        DH4(abstractC107474ss);
    }
}
