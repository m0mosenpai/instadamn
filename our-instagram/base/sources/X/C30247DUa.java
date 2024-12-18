package X;

/* renamed from: X.DUa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30247DUa extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C26021BfA A03;
    public final /* synthetic */ C26003Ber A04;
    public final /* synthetic */ C28370CfW A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ InterfaceC16660sJ A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30247DUa(C26021BfA c26021BfA, C26003Ber c26003Ber, C28370CfW c28370CfW, String str, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, int i3) {
        super(2);
        this.A07 = interfaceC16660sJ;
        this.A03 = c26021BfA;
        this.A04 = c26003Ber;
        this.A05 = c28370CfW;
        this.A01 = i;
        this.A06 = str;
        this.A02 = i2;
        this.A00 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        InterfaceC16660sJ interfaceC16660sJ = this.A07;
        CXR.A01(A0S, this.A03, this.A04, this.A05, this.A06, interfaceC16660sJ, this.A01, this.A02, AbstractC25225BEi.A04(this.A00));
        return C0eB.A00;
    }
}
