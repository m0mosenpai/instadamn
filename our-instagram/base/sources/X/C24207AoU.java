package X;

/* renamed from: X.AoU, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24207AoU implements InterfaceC58133Ppw {
    public final /* synthetic */ AKB A00;

    public C24207AoU(AKB akb) {
        this.A00 = akb;
    }

    @Override // X.InterfaceC58133Ppw
    public final void D7c(boolean z, String str) {
        AKB.A00(this.A00);
    }

    @Override // X.InterfaceC58133Ppw
    public final void D7d(String str) {
        AKB.A00(this.A00);
    }

    @Override // X.InterfaceC58133Ppw
    public final void onFinish() {
        AKB akb = this.A00;
        akb.A00 = null;
        akb.A05.removeCallbacks(akb.A0B);
        if (akb.A04) {
            AKB.A01(akb);
        }
    }
}
