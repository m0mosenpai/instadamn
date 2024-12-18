package X;

/* renamed from: X.J8l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43214J8l extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ float A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ C15100pQ A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43214J8l(InterfaceC16820sZ interfaceC16820sZ, C15100pQ c15100pQ, float f, float f2, float f3, float f4) {
        super(1);
        this.A05 = c15100pQ;
        this.A01 = f;
        this.A00 = f2;
        this.A03 = f3;
        this.A02 = f4;
        this.A04 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C15100pQ c15100pQ = this.A05;
        int i = c15100pQ.A00 - 1;
        c15100pQ.A00 = i;
        if (i <= 1 && (i == 0 || this.A01 == this.A00 || this.A03 == this.A02)) {
            this.A04.invoke();
        }
        return C0eB.A00;
    }
}
