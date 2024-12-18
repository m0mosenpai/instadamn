package X;

/* loaded from: classes5.dex */
public final class D8V extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C23031Ai A00;
    public final /* synthetic */ InterfaceC16660sJ A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D8V(C23031Ai c23031Ai, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2, boolean z3) {
        super(0);
        this.A04 = z;
        this.A03 = z2;
        this.A02 = z3;
        this.A00 = c23031Ai;
        this.A01 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        InterfaceC19630xq interfaceC19630xq;
        String str;
        if (this.A04) {
            if (this.A03 && this.A02) {
                interfaceC19630xq = this.A00.A01;
                str = AbstractC43591JPw.A00(140);
            } else {
                interfaceC19630xq = this.A00.A01;
                str = "comment_cover_nux_count";
            }
            AbstractC167017dG.A0g(interfaceC19630xq, str).apply();
        }
        AbstractC25227BEk.A1Q(this.A01, false);
        return C0eB.A00;
    }
}
