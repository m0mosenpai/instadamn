package X;

/* loaded from: classes5.dex */
public final class DWD extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C2DC A02;
    public final /* synthetic */ MUD A03;
    public final /* synthetic */ MUD A04;
    public final /* synthetic */ InterfaceC31034DkY A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ InterfaceC16820sZ A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DWD(C2DC c2dc, MUD mud, MUD mud2, InterfaceC31034DkY interfaceC31034DkY, String str, String str2, String str3, InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        super(2);
        this.A08 = str;
        this.A06 = str2;
        this.A05 = interfaceC31034DkY;
        this.A09 = interfaceC16820sZ;
        this.A02 = c2dc;
        this.A07 = str3;
        this.A03 = mud;
        this.A04 = mud2;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        String str = this.A08;
        String str2 = this.A06;
        InterfaceC31034DkY interfaceC31034DkY = this.A05;
        InterfaceC16820sZ interfaceC16820sZ = this.A09;
        AbstractC28463ChF.A03(A0S, this.A02, this.A03, this.A04, interfaceC31034DkY, str, str2, this.A07, interfaceC16820sZ, AbstractC25225BEi.A04(this.A00), this.A01);
        return C0eB.A00;
    }
}
