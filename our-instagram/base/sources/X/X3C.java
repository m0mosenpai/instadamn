package X;

/* loaded from: classes11.dex */
public final class X3C extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ C71160Wov A05;
    public final /* synthetic */ MPO A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X3C(C71160Wov c71160Wov, MPO mpo, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3) {
        super(0);
        this.A05 = c71160Wov;
        this.A03 = i;
        this.A06 = mpo;
        this.A02 = i2;
        this.A04 = i3;
        this.A00 = i4;
        this.A01 = i5;
        this.A07 = z;
        this.A09 = z2;
        this.A08 = z3;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C71160Wov c71160Wov = this.A05;
        C7GO c7go = c71160Wov.A03;
        int i = this.A03;
        MPO mpo = this.A06;
        int i2 = this.A02;
        int i3 = this.A04;
        int i4 = this.A00;
        int i5 = this.A01;
        boolean z = this.A07;
        W1W w1w = c71160Wov.A02;
        boolean z2 = this.A09;
        C66055Tys c66055Tys = new C66055Tys(w1w, c7go, mpo, i, c71160Wov.A00, i2, i3, i4, i5, z, this.A08, z2, c71160Wov.A09);
        c66055Tys.A0A = false;
        return c66055Tys;
    }
}
