package X;

/* renamed from: X.0va, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18480va implements InterfaceC13640mq {
    public final InterfaceC13640mq A03;
    public int A02 = 0;
    public int A01 = -1;
    public int A00 = -1;

    public final void A00() {
        int i = this.A02;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    this.A03.D2i(this.A01, this.A00);
                } else {
                    this.A03.DfC(this.A01, this.A00);
                }
            } else {
                this.A03.DMJ(this.A01, this.A00);
            }
            this.A02 = 0;
        }
    }

    @Override // X.InterfaceC13640mq
    public final void CzH() {
        this.A03.CzH();
    }

    @Override // X.InterfaceC13640mq
    public final void D2i(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.A02 == 3 && i <= (i4 = (i3 = this.A01) + this.A00) && (i5 = i + i2) >= i3) {
            int min = Math.min(i, i3);
            this.A01 = min;
            this.A00 = Math.max(i4, i5) - min;
        } else {
            A00();
            this.A01 = i;
            this.A00 = i2;
            this.A02 = 3;
        }
    }

    @Override // X.InterfaceC13640mq
    public final void DDa() {
        this.A03.DDa();
    }

    @Override // X.InterfaceC13640mq
    public final void DMJ(int i, int i2) {
        int i3;
        if (this.A02 == 1 && i >= (i3 = this.A01)) {
            int i4 = this.A00;
            if (i <= i3 + i4) {
                this.A00 = i4 + i2;
                this.A01 = Math.min(i, i3);
                return;
            }
        }
        A00();
        this.A01 = i;
        this.A00 = i2;
        this.A02 = 1;
    }

    @Override // X.InterfaceC13640mq
    public final void DfC(int i, int i2) {
        if (this.A02 == 2 && this.A01 == i) {
            this.A00 += i2;
            return;
        }
        A00();
        this.A01 = i;
        this.A00 = i2;
        this.A02 = 2;
    }

    public C18480va(InterfaceC13640mq interfaceC13640mq) {
        this.A03 = interfaceC13640mq;
    }

    @Override // X.InterfaceC13640mq
    public final void DTy(int i, int i2) {
        A00();
        this.A03.DTy(i, i2);
    }
}
