package X;

/* renamed from: X.6GZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6GZ extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C5E0 A03;
    public final /* synthetic */ C59Z A04;
    public final /* synthetic */ C59W A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6GZ(C5E0 c5e0, C59Z c59z, C59W c59w, int i, int i2, long j) {
        super(1);
        this.A03 = c5e0;
        this.A02 = j;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = c59z;
        this.A05 = c59w;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ((C5AW) obj).A08(this.A05, this.A03.A03.AB9(this.A04.getLayoutDirection(), this.A02, AbstractC119215ad.A00(this.A01, this.A00)));
        return C0eB.A00;
    }
}
