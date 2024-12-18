package X;

/* renamed from: X.J2m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43072J2m implements InterfaceC31049Dkn {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C120985dq A01;
    public final /* synthetic */ C37644Ghd A02;
    public final /* synthetic */ C38321qM A03;
    public final /* synthetic */ C37595Ggq A04;

    public C43072J2m(C120985dq c120985dq, C37644Ghd c37644Ghd, C38321qM c38321qM, C37595Ggq c37595Ggq, int i) {
        this.A03 = c38321qM;
        this.A04 = c37595Ggq;
        this.A01 = c120985dq;
        this.A02 = c37644Ghd;
        this.A00 = i;
    }

    @Override // X.InterfaceC31049Dkn
    public final void Cx2(boolean z) {
        C2Fb c2Fb;
        C37595Ggq c37595Ggq = this.A04;
        C120985dq c120985dq = this.A01;
        C37644Ghd c37644Ghd = this.A02;
        int i = this.A00;
        if (z) {
            c2Fb = C2Fb.A14;
        } else {
            c2Fb = C2Fb.A0z;
        }
        c37595Ggq.Cx4(c120985dq, c37644Ghd, c2Fb, null, -1.0f, -1.0f, i, false, false);
    }

    @Override // X.InterfaceC31049Dkn
    public final void D0h() {
        C37595Ggq.A00(this.A01, this.A04, this.A00);
    }

    @Override // X.InterfaceC31049Dkn
    public final boolean Ej1() {
        C38321qM c38321qM = this.A03;
        C37595Ggq c37595Ggq = this.A04;
        return AbstractC40917IAp.A00(c37595Ggq.A03, c38321qM, c37595Ggq.A08);
    }
}
