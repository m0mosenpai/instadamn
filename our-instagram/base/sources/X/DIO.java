package X;

/* loaded from: classes5.dex */
public final class DIO extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ InterfaceC50412MNo A00;
    public final /* synthetic */ CWQ A01;
    public final /* synthetic */ BXF A02;
    public final /* synthetic */ C114085Cu A03;
    public final /* synthetic */ InterfaceC31114Dlw A04;
    public final /* synthetic */ C5C3 A05;
    public final /* synthetic */ C5D0 A06;
    public final /* synthetic */ C19L A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DIO(InterfaceC50412MNo interfaceC50412MNo, CWQ cwq, BXF bxf, C114085Cu c114085Cu, InterfaceC31114Dlw interfaceC31114Dlw, C5C3 c5c3, C5D0 c5d0, C19L c19l, boolean z, boolean z2) {
        super(1);
        this.A01 = cwq;
        this.A08 = z;
        this.A09 = z2;
        this.A06 = c5d0;
        this.A05 = c5c3;
        this.A03 = c114085Cu;
        this.A04 = interfaceC31114Dlw;
        this.A02 = bxf;
        this.A07 = c19l;
        this.A00 = interfaceC50412MNo;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C28262Cd7 A00;
        InterfaceC118945aB interfaceC118945aB = (InterfaceC118945aB) obj;
        CWQ cwq = this.A01;
        InterfaceC74953Yl interfaceC74953Yl = cwq.A0A;
        if (AbstractC25230BEn.A1X(interfaceC74953Yl) != interfaceC118945aB.CV1()) {
            AbstractC25227BEk.A1A(interfaceC74953Yl, interfaceC118945aB.CV1());
            if (AbstractC25230BEn.A1X(interfaceC74953Yl) && this.A08 && !this.A09) {
                BXG.A02(cwq, this.A03, this.A04, this.A05, this.A06);
            } else {
                BXG.A01(cwq);
            }
            if (interfaceC118945aB.CV1() && (A00 = cwq.A00()) != null) {
                AbstractC166987dD.A1Z(new JTH(this.A00, this.A05, cwq, A00, this.A04, (InterfaceC23621Ds) null, 3), this.A07);
            }
            if (!interfaceC118945aB.CV1()) {
                this.A02.A0C(null);
            }
        }
        return C0eB.A00;
    }
}
