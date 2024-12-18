package X;

/* renamed from: X.G3j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36383G3j implements InterfaceC37159GYw {
    public final /* synthetic */ C32679Ea6 A00;

    public C36383G3j(C32679Ea6 c32679Ea6) {
        this.A00 = c32679Ea6;
    }

    @Override // X.InterfaceC37159GYw
    public final void Dpu(AbstractC46524KiP abstractC46524KiP) {
        C32679Ea6 c32679Ea6 = this.A00;
        AbstractC166987dD.A1Z(new MCE(c32679Ea6, abstractC46524KiP, null, 39), c32679Ea6.A09);
        abstractC46524KiP.A04(true);
        abstractC46524KiP.A00 = new C36384G3k(c32679Ea6);
    }

    @Override // X.InterfaceC37159GYw
    public final void onFailure() {
        C32679Ea6 c32679Ea6 = this.A00;
        c32679Ea6.A01().setVisibility(8);
        c32679Ea6.A03().setVisibility(0);
        c32679Ea6.A02().setVisibility(8);
    }
}
