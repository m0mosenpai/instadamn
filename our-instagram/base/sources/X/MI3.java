package X;

/* loaded from: classes8.dex */
public final class MI3 extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C132065xh A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MI3(C132065xh c132065xh, int i, int i2, boolean z) {
        super(1);
        this.A01 = i;
        this.A00 = i2;
        this.A03 = z;
        this.A02 = c132065xh;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C1351169k c1351169k = (C1351169k) obj;
        C14360o3.A0B(c1351169k, 0);
        return C42221xC.A06(new C48461LcE(c1351169k, this.A02, this.A01, this.A00, this.A03));
    }
}
