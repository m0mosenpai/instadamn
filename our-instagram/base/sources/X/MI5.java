package X;

/* loaded from: classes8.dex */
public final class MI5 extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MI5(Object obj, String str, int i, long j) {
        super(1);
        this.A00 = i;
        this.A02 = obj;
        this.A03 = str;
        this.A01 = j;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (3 - this.A00 != 0) {
            String A0Q = AbstractC167027dH.A0Q(obj);
            ((InterfaceC132365yF) this.A02).CrX(C2Fb.A2r, A0Q, this.A03, null, this.A01);
            return C0eB.A00;
        }
        C137766Ly c137766Ly = ((C137756Lx) this.A02).A01;
        String str = this.A03;
        return AbstractC43592JPx.A0R(c137766Ly.A0C.A0L(new JRU(this.A01, str, 0)));
    }
}
