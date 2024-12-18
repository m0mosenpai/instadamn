package X;

/* renamed from: X.DVc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30275DVc extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ CSX A04;
    public final /* synthetic */ InterfaceC16820sZ A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ InterfaceC16820sZ A07;
    public final /* synthetic */ InterfaceC16620sF A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30275DVc(CSX csx, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16620sF interfaceC16620sF, float f, int i, int i2, int i3) {
        super(2);
        this.A04 = csx;
        this.A03 = i;
        this.A00 = f;
        this.A06 = interfaceC16820sZ;
        this.A07 = interfaceC16820sZ2;
        this.A05 = interfaceC16820sZ3;
        this.A08 = interfaceC16620sF;
        this.A01 = i2;
        this.A02 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        CSX csx = this.A04;
        int i = this.A03;
        AbstractC28480ChY.A04(A0S, csx, this.A06, this.A07, this.A05, this.A08, this.A00, i, AbstractC25225BEi.A04(this.A01), this.A02);
        return C0eB.A00;
    }
}
