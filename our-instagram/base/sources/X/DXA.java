package X;

/* loaded from: classes5.dex */
public final class DXA extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C2DC A02;
    public final /* synthetic */ MUD A03;
    public final /* synthetic */ MUD A04;
    public final /* synthetic */ InterfaceC31034DkY A05;
    public final /* synthetic */ CharSequence A06;
    public final /* synthetic */ CharSequence A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ InterfaceC16820sZ A09;
    public final /* synthetic */ InterfaceC16660sJ A0A;
    public final /* synthetic */ InterfaceC16660sJ A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DXA(C2DC c2dc, MUD mud, MUD mud2, InterfaceC31034DkY interfaceC31034DkY, CharSequence charSequence, CharSequence charSequence2, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, int i, int i2) {
        super(2);
        this.A08 = str;
        this.A06 = charSequence;
        this.A05 = interfaceC31034DkY;
        this.A09 = interfaceC16820sZ;
        this.A02 = c2dc;
        this.A0A = interfaceC16660sJ;
        this.A07 = charSequence2;
        this.A0B = interfaceC16660sJ2;
        this.A03 = mud;
        this.A04 = mud2;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        String str = this.A08;
        CharSequence charSequence = this.A06;
        InterfaceC31034DkY interfaceC31034DkY = this.A05;
        InterfaceC16820sZ interfaceC16820sZ = this.A09;
        C2DC c2dc = this.A02;
        InterfaceC16660sJ interfaceC16660sJ = this.A0A;
        AbstractC28463ChF.A02(A0S, c2dc, this.A03, this.A04, interfaceC31034DkY, charSequence, this.A07, str, interfaceC16820sZ, interfaceC16660sJ, this.A0B, AbstractC25225BEi.A04(this.A00), this.A01);
        return C0eB.A00;
    }
}
