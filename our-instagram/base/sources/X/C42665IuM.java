package X;

/* renamed from: X.IuM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42665IuM implements InterfaceC75123Zc, InterfaceC75143Ze {
    public int A01 = -1;
    public Integer A00 = C05F.A01;

    @Override // X.InterfaceC75123Zc
    public final /* synthetic */ int BLI() {
        return -1;
    }

    @Override // X.InterfaceC75123Zc
    public final /* synthetic */ int BLj() {
        return -1;
    }

    @Override // X.InterfaceC75143Ze
    public final boolean Ceb() {
        return AbstractC25229BEm.A1a(this.A00, C05F.A01);
    }

    @Override // X.InterfaceC75123Zc
    public final int getPosition() {
        int i = this.A01;
        if (i >= 0) {
            return i;
        }
        throw AbstractC166987dD.A14("Position is not set.");
    }

    public final void A00(int i) {
        AbstractC37300Gc1.A0Z();
        this.A01 = i;
    }
}
