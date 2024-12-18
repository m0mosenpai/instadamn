package X;

/* renamed from: X.DSi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30203DSi extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C148336m3 A02;
    public final /* synthetic */ InterfaceC16660sJ A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30203DSi(C148336m3 c148336m3, InterfaceC16660sJ interfaceC16660sJ, float f, int i, boolean z) {
        super(2);
        this.A02 = c148336m3;
        this.A00 = f;
        this.A03 = interfaceC16660sJ;
        this.A04 = z;
        this.A01 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        C148336m3 c148336m3 = this.A02;
        float f = this.A00;
        AbstractC28301Cdn.A02(A0S, c148336m3, this.A03, f, AbstractC25225BEi.A04(this.A01), this.A04);
        return C0eB.A00;
    }
}
