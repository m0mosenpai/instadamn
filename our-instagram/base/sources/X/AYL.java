package X;

/* loaded from: classes4.dex */
public final class AYL implements BDE {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;

    @Override // X.BDE
    public final void A7e(InterfaceC170717jO interfaceC170717jO, int i, int i2) {
        if (this.A01 == 0) {
            int i3 = this.A00;
            if (this.A03 == 1) {
                i = i2;
            }
            this.A00 = i3 + i;
        }
        if (!interfaceC170717jO.CVF()) {
            int Bz2 = this.A01 + interfaceC170717jO.Bz2();
            this.A01 = Bz2;
            if (Bz2 != this.A04) {
                return;
            }
        }
        this.A01 = 0;
    }

    @Override // X.BDE
    public final int B6K() {
        return this.A00;
    }

    @Override // X.BDE
    public final boolean FDv() {
        int i;
        if (this.A03 == 1) {
            i = this.A02;
        } else {
            i = this.A05;
        }
        if (this.A00 < i) {
            return true;
        }
        return false;
    }

    public AYL(int i, int i2, int i3, int i4) {
        this.A05 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A04 = i4;
    }
}
