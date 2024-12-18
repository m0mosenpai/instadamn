package X;

/* renamed from: X.Ook, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55718Ook implements InterfaceC1809280u {
    public final /* synthetic */ C197368o7 A00;
    public final /* synthetic */ OEN A01;
    public final /* synthetic */ OJJ A02;
    public final /* synthetic */ OZr A03;
    public final /* synthetic */ InterfaceC197718oi A04;

    public C55718Ook(C197368o7 c197368o7, OEN oen, OJJ ojj, OZr oZr, InterfaceC197718oi interfaceC197718oi) {
        this.A00 = c197368o7;
        this.A02 = ojj;
        this.A04 = interfaceC197718oi;
        this.A03 = oZr;
        this.A01 = oen;
    }

    @Override // X.InterfaceC1809280u
    public final void DIE() {
        try {
            C197368o7 c197368o7 = this.A00;
            InterfaceC197718oi interfaceC197718oi = this.A04;
            c197368o7.A0C(new RunnableC57064PTd(c197368o7, this.A01, this.A02, this.A03, interfaceC197718oi));
        } catch (RuntimeException e) {
            this.A02.A00(e);
        }
    }
}
