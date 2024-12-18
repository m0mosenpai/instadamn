package X;

/* renamed from: X.Lcf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48488Lcf implements InterfaceC42561xk {
    public final /* synthetic */ C41761wQ A00;
    public final /* synthetic */ AbstractRunnableC14200nk A01;
    public final /* synthetic */ C14270nr A02;
    public final /* synthetic */ InterfaceC16660sJ A03;
    public final /* synthetic */ C15370ps A04;

    @Override // X.InterfaceC42561xk
    public final void onComplete() {
    }

    public C48488Lcf(C41761wQ c41761wQ, AbstractRunnableC14200nk abstractRunnableC14200nk, C14270nr c14270nr, InterfaceC16660sJ interfaceC16660sJ, C15370ps c15370ps) {
        this.A02 = c14270nr;
        this.A01 = abstractRunnableC14200nk;
        this.A03 = interfaceC16660sJ;
        this.A04 = c15370ps;
        this.A00 = c41761wQ;
    }

    @Override // X.InterfaceC42561xk
    public final void DVo(Object obj) {
        this.A02.A02(this.A01);
        this.A03.invoke(obj);
    }

    @Override // X.InterfaceC42561xk
    public final void Dpb(C42631xr c42631xr) {
        this.A04.A00 = c42631xr;
        this.A00.A00.A7o(c42631xr.A00);
    }
}
