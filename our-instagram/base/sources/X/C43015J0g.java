package X;

/* renamed from: X.J0g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43015J0g implements InterfaceC1119153d {
    public final /* synthetic */ C38321qM A00;
    public final /* synthetic */ C39C A01;
    public final /* synthetic */ IKE A02;
    public final /* synthetic */ C75113Zb A03;

    public C43015J0g(C38321qM c38321qM, C39C c39c, IKE ike, C75113Zb c75113Zb) {
        this.A01 = c39c;
        this.A02 = ike;
        this.A00 = c38321qM;
        this.A03 = c75113Zb;
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        IKE ike = this.A02;
        ike.A02 = false;
        ike.A01 = false;
    }

    @Override // X.InterfaceC1119153d
    public final void D00() {
        C39C c39c = this.A01;
        c39c.A02 = false;
        c39c.A01 = false;
        IKE ike = this.A02;
        ike.A02 = true;
        ike.A04.A00.A0A.invoke(Integer.valueOf(AbstractC167017dG.A0E(ike.A05.A01)));
        C38321qM c38321qM = this.A00;
        C75113Zb c75113Zb = this.A03;
        C39C.A00(c38321qM, c39c, c75113Zb, false);
        Integer num = C05F.A01;
        if (c75113Zb.A13 != num) {
            c75113Zb.A13 = num;
            C75113Zb.A00(c75113Zb, 50);
        }
    }
}
