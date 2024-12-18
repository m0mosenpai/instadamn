package X;

/* loaded from: classes5.dex */
public final class BPI implements InterfaceC51122Wi {
    public final /* synthetic */ C2XI A00;
    public final /* synthetic */ BPC A01;

    public BPI(C2XI c2xi, BPC bpc) {
        this.A01 = bpc;
        this.A00 = c2xi;
    }

    @Override // X.InterfaceC51122Wi
    public final void DyX(C2XI c2xi) {
        C38321qM c38321qM;
        BPC bpc = this.A01;
        if (bpc.A06) {
            C120985dq c120985dq = bpc.A01;
            if (c120985dq.CdW() && (c38321qM = c120985dq.A02) != null && c38321qM.A5x()) {
                this.A00.A00(Long.valueOf(C36J.A06(C36G.A09, C36H.A04(C36G.A06, AbstractC166987dD.A0N(c2xi.A00))) + 1));
            }
        }
    }
}
