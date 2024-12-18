package X;

/* renamed from: X.IuF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42658IuF implements InterfaceC75123Zc {
    public int A00 = -1;

    @Override // X.InterfaceC75123Zc
    public final /* synthetic */ int BLI() {
        return -1;
    }

    @Override // X.InterfaceC75123Zc
    public final /* synthetic */ int BLj() {
        return -1;
    }

    @Override // X.InterfaceC75123Zc
    public final int getPosition() {
        int i = this.A00;
        if (i >= 0) {
            return i;
        }
        throw AbstractC166987dD.A12("Position is not set.");
    }

    public final void A00(int i) {
        this.A00 = i;
    }
}
