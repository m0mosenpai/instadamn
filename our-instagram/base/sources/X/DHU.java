package X;

/* loaded from: classes5.dex */
public final class DHU extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C38321qM A01;
    public final /* synthetic */ C26581Boe A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DHU(C38321qM c38321qM, C26581Boe c26581Boe, int i, boolean z) {
        super(1);
        this.A02 = c26581Boe;
        this.A01 = c38321qM;
        this.A03 = z;
        this.A00 = i;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C26581Boe c26581Boe = this.A02;
        C38321qM c38321qM = this.A01;
        boolean z = this.A03;
        int i = this.A00;
        InterfaceC102674k2 C5N = c38321qM.A0C.C5N();
        C120985dq c120985dq = c26581Boe.A02;
        C38321qM c38321qM2 = c120985dq.A02;
        if (c38321qM2 != null && C5N != null) {
            c26581Boe.A04.D5r(C5N, c38321qM2, c38321qM.A0C.getPk(), i, z);
        } else {
            c26581Boe.A04.D4v(c26581Boe.A01, c120985dq, c26581Boe.A03, null, false, null, null, -1.0f, -1.0f, false, false);
        }
        return C0eB.A00;
    }
}
