package X;

/* loaded from: classes4.dex */
public final class AV5 implements InterfaceC203698zY {
    public final /* synthetic */ C203758zj A00;
    public final /* synthetic */ BCR A01;
    public final /* synthetic */ C211499Wy A02;
    public final /* synthetic */ String A03;

    @Override // X.InterfaceC203698zY
    public final void DFx(RkH rkH) {
        C14360o3.A0B(rkH, 0);
        this.A01.CuB(this.A03, rkH);
    }

    public AV5(C203758zj c203758zj, BCR bcr, C211499Wy c211499Wy, String str) {
        this.A00 = c203758zj;
        this.A01 = bcr;
        this.A03 = str;
        this.A02 = c211499Wy;
    }

    @Override // X.InterfaceC203698zY
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C203678zW c203678zW = (C203678zW) obj;
        if (c203678zW != null) {
            C203758zj c203758zj = this.A00;
            C203758zj c203758zj2 = c203678zW.A04;
            c203758zj2.A00 = c203758zj.A00;
            c203758zj2.A03 = c203758zj.A03;
            c203758zj2.A02 = c203758zj.A02;
            c203758zj2.A01 = c203758zj.A01;
        }
        this.A01.CuC(this.A03);
        this.A02.A0A(c203678zW);
    }
}
