package X;

/* loaded from: classes5.dex */
public final class BH9 extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ InterfaceC74963Ym A02;
    public final /* synthetic */ InterfaceC74963Ym A03;
    public final /* synthetic */ InterfaceC74963Ym A04;
    public final /* synthetic */ InterfaceC74963Ym A05;
    public final /* synthetic */ C62V A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BH9(InterfaceC74963Ym interfaceC74963Ym, InterfaceC74963Ym interfaceC74963Ym2, InterfaceC74963Ym interfaceC74963Ym3, InterfaceC74963Ym interfaceC74963Ym4, C62V c62v, float f, long j) {
        super(1);
        this.A00 = f;
        this.A01 = j;
        this.A06 = c62v;
        this.A03 = interfaceC74963Ym;
        this.A04 = interfaceC74963Ym2;
        this.A05 = interfaceC74963Ym3;
        this.A02 = interfaceC74963Ym4;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        InterfaceC1128857w A0c = AbstractC25228BEl.A0c(obj);
        InterfaceC74963Ym interfaceC74963Ym = this.A03;
        C25243BFc c25243BFc = BGM.A04;
        float A0H = (AbstractC166987dD.A0H(interfaceC74963Ym.getValue()) * 216.0f) % 360.0f;
        float A05 = AbstractC25231BEo.A05(this.A04);
        InterfaceC74963Ym interfaceC74963Ym2 = this.A05;
        float A01 = AbstractC166987dD.A01(A05, AbstractC25231BEo.A05(interfaceC74963Ym2));
        BGM.A02(A0c, this.A06, AbstractC25231BEo.A05(interfaceC74963Ym2) + (A0H - 90.0f) + AbstractC25231BEo.A05(this.A02) + (((this.A00 / (40.0f / 2.0f)) * 57.29578f) / 2.0f), Math.max(A01, 0.1f), this.A01);
        return C0eB.A00;
    }
}
