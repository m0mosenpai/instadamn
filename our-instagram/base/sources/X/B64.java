package X;

/* loaded from: classes4.dex */
public final class B64 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C183328Bf A01;
    public final /* synthetic */ C8Ba A02;
    public final /* synthetic */ C115475Kh A03;
    public final /* synthetic */ String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B64(C183328Bf c183328Bf, C8Ba c8Ba, C115475Kh c115475Kh, String str, int i) {
        super(0);
        this.A01 = c183328Bf;
        this.A03 = c115475Kh;
        this.A00 = i;
        this.A04 = str;
        this.A02 = c8Ba;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C183328Bf c183328Bf = this.A01;
        C115475Kh c115475Kh = this.A03;
        int i = this.A00;
        C183328Bf.A01(c183328Bf, this.A02, c115475Kh, this.A04, new C9GQ(c183328Bf, 7), null, null, i, false, false);
        return C0eB.A00;
    }
}
