package X;

/* renamed from: X.DHh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29919DHh extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ InterfaceC74953Yl A03;
    public final /* synthetic */ InterfaceC16660sJ A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29919DHh(InterfaceC74953Yl interfaceC74953Yl, InterfaceC16660sJ interfaceC16660sJ, float f, float f2, float f3) {
        super(1);
        this.A02 = f;
        this.A01 = f2;
        this.A00 = f3;
        this.A04 = interfaceC16660sJ;
        this.A03 = interfaceC74953Yl;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float A09 = AbstractC166987dD.A09(obj);
        float f = this.A02;
        float f2 = this.A01;
        float f3 = this.A00;
        float A01 = C17s.A01(((f - f2) / (f3 - f2)) + (A09 / AbstractC25231BEo.A0E(this.A03)));
        AbstractC25226BEj.A1T(this.A04, ((1.0f - A01) * f2) + (A01 * f3));
        return C0eB.A00;
    }
}
