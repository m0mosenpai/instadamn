package X;

/* renamed from: X.SrR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63658SrR implements InterfaceC65306Thi {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C63658SrR(Q2O q2o, String str, int i) {
        this.A00 = i;
        this.A01 = q2o;
        this.A02 = str;
    }

    @Override // X.InterfaceC65306Thi
    public final void ELA(SQ2 sq2) {
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                ((Q2O) obj).A0K(this.A02);
                return;
            case 1:
                ((Q2O) obj).A0J(this.A02);
                return;
            default:
                ((Q2O) obj).A0I(this.A02);
                return;
        }
    }
}
