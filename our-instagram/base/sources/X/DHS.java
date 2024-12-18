package X;

/* loaded from: classes5.dex */
public final class DHS extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C59W A02;
    public final /* synthetic */ InterfaceC16660sJ A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DHS(C59W c59w, InterfaceC16660sJ interfaceC16660sJ, long j, long j2) {
        super(1);
        this.A02 = c59w;
        this.A00 = j;
        this.A01 = j2;
        this.A03 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C59W c59w = this.A02;
        long j = this.A00;
        long j2 = this.A01;
        InterfaceC16660sJ interfaceC16660sJ = this.A03;
        ((C5AW) obj).A09(c59w, interfaceC16660sJ, 0.0f, ((int) (j2 >> 32)) + ((int) (j >> 32)), ((int) (j2 & 4294967295L)) + ((int) (j & 4294967295L)));
        return C0eB.A00;
    }
}
