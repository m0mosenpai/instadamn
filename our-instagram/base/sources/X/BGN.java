package X;

/* loaded from: classes5.dex */
public final class BGN extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C62V A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BGN(C62V c62v, float f, long j, long j2, boolean z) {
        super(1);
        this.A00 = f;
        this.A04 = z;
        this.A02 = j;
        this.A03 = c62v;
        this.A01 = j2;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        InterfaceC1128857w A0c = AbstractC25228BEl.A0c(obj);
        float f = this.A00 * 360.0f;
        if (this.A04) {
            BGM.A02(A0c, this.A03, 270.0f, 360.0f, this.A02);
        }
        BGM.A02(A0c, this.A03, 270.0f, f, this.A01);
        return C0eB.A00;
    }
}
