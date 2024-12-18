package X;

/* renamed from: X.G3z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36398G3z implements InterfaceC65529Tlz {
    public final /* synthetic */ C31659DvP A00;
    public final /* synthetic */ C2EC A01;
    public final /* synthetic */ boolean A02;

    public C36398G3z(C31659DvP c31659DvP, C2EC c2ec, boolean z) {
        this.A00 = c31659DvP;
        this.A01 = c2ec;
        this.A02 = z;
    }

    @Override // X.InterfaceC65529Tlz
    public final void onFailure() {
        C35030Fc3 c35030Fc3 = C35030Fc3.A00;
        C31659DvP c31659DvP = this.A00;
        C34655FOo c34655FOo = C31659DvP.A08;
        c35030Fc3.A01(c31659DvP.A02, "inbox", this.A01.C7I());
    }

    @Override // X.InterfaceC65529Tlz
    public final void onSuccess() {
        C31659DvP c31659DvP = this.A00;
        C34655FOo c34655FOo = C31659DvP.A08;
        InterfaceC37234Gaj interfaceC37234Gaj = c31659DvP.A03;
        C2EC c2ec = this.A01;
        interfaceC37234Gaj.F7x(c2ec, this.A02);
        C35030Fc3.A00.A02(c31659DvP.A02, "inbox", c2ec.C7I());
    }
}
