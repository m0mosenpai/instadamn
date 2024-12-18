package X;

/* loaded from: classes9.dex */
public final class PJ1 implements XDT {
    public final int A00;
    public final Object A01;

    public PJ1(C51169MjD c51169MjD, int i) {
        this.A00 = i;
        this.A01 = c51169MjD;
    }

    @Override // X.XDT
    public final void CuW() {
        int i;
        int i2 = this.A00;
        C51169MjD c51169MjD = (C51169MjD) this.A01;
        C19L c19l = c51169MjD.A08;
        switch (i2) {
            case 0:
                i = 31;
                break;
            case 1:
                i = 32;
                break;
            case 2:
                i = 33;
                break;
            default:
                i = 34;
                break;
        }
        PZE.A02(c51169MjD, c19l, i);
    }

    @Override // X.XDT
    public final void D69() {
    }

    @Override // X.XDT
    public final void DDH() {
    }
}
