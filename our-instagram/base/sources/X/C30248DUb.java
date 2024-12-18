package X;

/* renamed from: X.DUb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30248DUb extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C31230DoD A03;
    public final /* synthetic */ InterfaceC16660sJ A04;
    public final /* synthetic */ InterfaceC16660sJ A05;
    public final /* synthetic */ InterfaceC16620sF A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30248DUb(C31230DoD c31230DoD, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16620sF interfaceC16620sF, float f, float f2, int i, boolean z) {
        super(2);
        this.A03 = c31230DoD;
        this.A01 = f;
        this.A00 = f2;
        this.A07 = z;
        this.A05 = interfaceC16660sJ;
        this.A06 = interfaceC16620sF;
        this.A04 = interfaceC16660sJ2;
        this.A02 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        C31230DoD c31230DoD = this.A03;
        float f = this.A01;
        float f2 = this.A00;
        boolean z = this.A07;
        AbstractC28499Chs.A08(A0S, c31230DoD, this.A05, this.A04, this.A06, f, f2, AbstractC25225BEi.A04(this.A02), z);
        return C0eB.A00;
    }
}
