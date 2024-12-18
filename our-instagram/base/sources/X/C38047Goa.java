package X;

/* renamed from: X.Goa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38047Goa implements InterfaceC75123Zc {
    public int A02 = -1;
    public int A00 = -1;
    public int A01 = -1;

    @Override // X.InterfaceC75123Zc
    public final int BLI() {
        return this.A00;
    }

    @Override // X.InterfaceC75123Zc
    public final int BLj() {
        return this.A01;
    }

    @Override // X.InterfaceC75123Zc
    public final int getPosition() {
        int i = this.A02;
        if (i >= 0) {
            return i;
        }
        throw AbstractC166987dD.A14("Position is not set.");
    }

    public final void A00(int i) {
        AbstractC37300Gc1.A0Z();
        this.A00 = i;
    }

    public final void A01(int i) {
        AbstractC37300Gc1.A0Z();
        this.A01 = i;
    }

    public final void A02(int i) {
        AbstractC37300Gc1.A0Z();
        this.A02 = i;
    }
}
