package X;

/* loaded from: classes8.dex */
public final class MEA extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ EnumC72433Xdd A00;
    public final /* synthetic */ C48261LXk A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ EnumC40111tc A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MEA(EnumC72433Xdd enumC72433Xdd, C48261LXk c48261LXk, C38321qM c38321qM, EnumC40111tc enumC40111tc, String str, boolean z) {
        super(0);
        this.A01 = c48261LXk;
        this.A02 = c38321qM;
        this.A05 = z;
        this.A03 = enumC40111tc;
        this.A04 = str;
        this.A00 = enumC72433Xdd;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C48261LXk c48261LXk = this.A01;
        C121275eQ A00 = C48261LXk.A00(c48261LXk, this.A02, this.A05);
        A00.A00 = new C129505tF(this.A00, c48261LXk, this.A03, null, this.A04, false);
        C1GJ.A03(A00);
        return C0eB.A00;
    }
}
