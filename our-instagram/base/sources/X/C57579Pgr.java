package X;

/* renamed from: X.Pgr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57579Pgr extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C50866Mdx A01;
    public final /* synthetic */ AbstractC115485Ki A02;
    public final /* synthetic */ InterfaceC16660sJ A03;
    public final /* synthetic */ InterfaceC16660sJ A04;
    public final /* synthetic */ InterfaceC16620sF A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57579Pgr(C50866Mdx c50866Mdx, AbstractC115485Ki abstractC115485Ki, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16620sF interfaceC16620sF, int i) {
        super(1);
        this.A04 = interfaceC16660sJ;
        this.A00 = i;
        this.A01 = c50866Mdx;
        this.A02 = abstractC115485Ki;
        this.A05 = interfaceC16620sF;
        this.A03 = interfaceC16660sJ2;
    }

    public final void A00(boolean z) {
        Zbg zbg;
        Zbg zbg2;
        if (!z) {
            AbstractC43592JPx.A19(this.A00, this.A04);
            return;
        }
        C50866Mdx c50866Mdx = this.A01;
        zbg = c50866Mdx.A01;
        if (zbg == null) {
            c50866Mdx.A01 = new Zbg();
            zbg2 = c50866Mdx.A01;
            if (zbg2 != null) {
                c50866Mdx.A02.A01.put(zbg2.A00(), zbg2);
            }
        }
        int i = this.A00;
        C50866Mdx.A02(c50866Mdx, (C115475Kh) this.A02, this.A04, this.A03, this.A05, i);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00(AbstractC166987dD.A1a(obj));
        return C0eB.A00;
    }
}
