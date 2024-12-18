package X;

/* loaded from: classes5.dex */
public final class BW6 implements InterfaceC137836Mi {
    public final BVY A00;
    public final int A01;

    @Override // X.InterfaceC137836Mi
    public final int B6e() {
        return Math.max(0, this.A00.A02 - this.A01);
    }

    @Override // X.InterfaceC137836Mi
    public final boolean BD1() {
        return AbstractC166987dD.A1b(AbstractC25230BEn.A0S(this.A00.A0C).A0F);
    }

    @Override // X.InterfaceC137836Mi
    public final int BLq() {
        return Math.min(r1.A04() - 1, ((BWF) ((InterfaceC30776DgD) AbstractC001800i.A0K(AbstractC25230BEn.A0S(this.A00.A0C).A0F))).A03 + this.A01);
    }

    @Override // X.InterfaceC137836Mi
    public final void EEb() {
        C59A c59a = (C59A) this.A00.A0W.getValue();
        if (c59a != null) {
            c59a.AWW();
        }
    }

    @Override // X.InterfaceC137836Mi
    public final int getItemCount() {
        return this.A00.A04();
    }

    public BW6(BVY bvy, int i) {
        this.A00 = bvy;
        this.A01 = i;
    }
}
