package X;

/* loaded from: classes5.dex */
public final class DS3 extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ float A00;
    public final /* synthetic */ InterfaceC74953Yl A01;
    public final /* synthetic */ InterfaceC74953Yl A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DS3(InterfaceC74953Yl interfaceC74953Yl, InterfaceC74953Yl interfaceC74953Yl2, float f) {
        super(2);
        this.A00 = f;
        this.A02 = interfaceC74953Yl;
        this.A01 = interfaceC74953Yl2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        float A01 = AbstractC25235BEs.A01(obj, obj2);
        this.A02.Egh(new C119145aW((1.0f - A01) * this.A00));
        AbstractC25227BEk.A18(this.A01, A01);
        return C0eB.A00;
    }
}
