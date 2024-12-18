package X;

/* renamed from: X.DHg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29918DHg extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ C6L5 A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29918DHg(C6L5 c6l5, float f, float f2, float f3, long j) {
        super(1);
        this.A02 = f;
        this.A00 = f2;
        this.A01 = f3;
        this.A04 = c6l5;
        this.A03 = j;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        InterfaceC1128857w interfaceC1128857w = (InterfaceC1128857w) obj;
        C14360o3.A0B(interfaceC1128857w, 0);
        float f = this.A02;
        float f2 = f / 2.0f;
        long A00 = AbstractC119395aw.A00(f2, f2);
        long Bxc = interfaceC1128857w.Bxc();
        long A002 = C5YB.A00(C5YC.A02(Bxc) - f, C5YC.A00(Bxc) - f);
        float f3 = this.A00;
        float f4 = f3 / 2.0f;
        float f5 = this.A01;
        C62V c62v = new C62V(null, f, 4.0f, 0, 0);
        interfaceC1128857w.AQZ(this.A04, null, c62v, f4 - 90.0f, f5 - f3, 1.0f, 3, A00, A002, false);
        interfaceC1128857w.AQa(null, new C62V(null, f, 4.0f, 0, 0), (f5 + f4) - 90.0f, (360.0f - f5) - f3, 1.0f, 3, this.A03, A00, A002, false);
        return C0eB.A00;
    }
}
