package X;

/* loaded from: classes5.dex */
public final class DHL extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ C26477Bmy A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DHL(C26477Bmy c26477Bmy, float f, float f2) {
        super(1);
        this.A00 = f;
        this.A01 = f2;
        this.A02 = c26477Bmy;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C2XB A0k = AbstractC25228BEl.A0k(obj);
        A0k.A00.offsetLocation(this.A00, this.A01);
        return Boolean.valueOf(AbstractC25231BEo.A1V(A0k, this.A02.A00));
    }
}
