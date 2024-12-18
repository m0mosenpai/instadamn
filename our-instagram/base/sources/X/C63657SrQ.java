package X;

/* renamed from: X.SrQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63657SrQ implements InterfaceC65306Thi {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C63657SrQ(Q2O q2o, int i, int i2) {
        this.A00 = i2;
        this.A02 = q2o;
        this.A01 = i;
    }

    @Override // X.InterfaceC65306Thi
    public final void ELA(SQ2 sq2) {
        int i = this.A00;
        Object obj = this.A02;
        switch (i) {
            case 0:
                ((Q2O) obj).A0D(this.A01);
                return;
            case 1:
                ((Q2O) obj).A0F(this.A01);
                return;
            default:
                ((Q2O) obj).A0E(this.A01);
                return;
        }
    }
}
