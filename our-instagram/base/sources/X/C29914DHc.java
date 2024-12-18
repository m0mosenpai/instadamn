package X;

/* renamed from: X.DHc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29914DHc extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C5AH A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29914DHc(C5AH c5ah, float f, float f2, int i, boolean z) {
        super(1);
        this.A00 = f;
        this.A01 = f2;
        this.A02 = i;
        this.A03 = c5ah;
        this.A04 = z;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C25759BZy c25759BZy;
        InterfaceC1132159j interfaceC1132159j = (InterfaceC1132159j) obj;
        float EqT = interfaceC1132159j.EqT(this.A00);
        float EqT2 = interfaceC1132159j.EqT(this.A01);
        if (EqT > 0.0f && EqT2 > 0.0f) {
            c25759BZy = new C25759BZy(this.A02, EqT, EqT2);
        } else {
            c25759BZy = null;
        }
        interfaceC1132159j.EcY(c25759BZy);
        C5AH c5ah = this.A03;
        if (c5ah == null) {
            c5ah = C5AF.A00;
        }
        interfaceC1132159j.Edp(c5ah);
        interfaceC1132159j.ERU(this.A04);
        return C0eB.A00;
    }
}
