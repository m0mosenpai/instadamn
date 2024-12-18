package X;

/* loaded from: classes4.dex */
public final class AYK implements BDE {
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    @Override // X.BDE
    public final void A7e(InterfaceC170717jO interfaceC170717jO, int i, int i2) {
        int i3 = this.A00;
        if (this.A02 == 1) {
            i = i2;
        }
        this.A00 = i3 + i;
    }

    @Override // X.BDE
    public final int B6K() {
        return this.A00;
    }

    @Override // X.BDE
    public final boolean FDv() {
        int i;
        if (this.A02 == 1) {
            i = this.A01;
        } else {
            i = this.A03;
        }
        if (this.A00 < i) {
            return true;
        }
        return false;
    }

    public AYK(int i, int i2, int i3) {
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
    }
}
