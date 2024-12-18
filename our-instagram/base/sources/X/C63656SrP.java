package X;

/* renamed from: X.SrP, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63656SrP implements InterfaceC65306Thi {
    public final float A00;
    public final int A01;
    public final Object A02;

    public C63656SrP(Q2O q2o, float f, int i) {
        this.A01 = i;
        this.A02 = q2o;
        this.A00 = f;
    }

    @Override // X.InterfaceC65306Thi
    public final void ELA(SQ2 sq2) {
        int i = this.A01;
        Object obj = this.A02;
        switch (i) {
            case 0:
                ((Q2O) obj).A0A(this.A00);
                return;
            case 1:
                ((Q2O) obj).A0C(this.A00);
                return;
            default:
                ((Q2O) obj).A0B(this.A00);
                return;
        }
    }
}
