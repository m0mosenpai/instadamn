package X;

/* renamed from: X.DHr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29929DHr extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ InterfaceC74963Ym A01;
    public final /* synthetic */ InterfaceC74963Ym A02;
    public final /* synthetic */ InterfaceC74963Ym A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29929DHr(InterfaceC74963Ym interfaceC74963Ym, InterfaceC74963Ym interfaceC74963Ym2, InterfaceC74963Ym interfaceC74963Ym3, long j, boolean z, boolean z2) {
        super(1);
        this.A04 = z;
        this.A05 = z2;
        this.A03 = interfaceC74963Ym;
        this.A00 = j;
        this.A02 = interfaceC74963Ym2;
        this.A01 = interfaceC74963Ym3;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AbstractC119825bg c62v;
        InterfaceC1128857w interfaceC1128857w = (InterfaceC1128857w) obj;
        C14360o3.A0B(interfaceC1128857w, 0);
        boolean z = this.A04;
        boolean z2 = this.A05;
        long j = ((C1132359l) this.A01.getValue()).A00;
        if (z) {
            float EqT = interfaceC1128857w.EqT(AbstractC25228BEl.A00(this.A03));
            float EqT2 = interfaceC1128857w.EqT(24.0f / 2.0f) - (EqT / 2.0f);
            interfaceC1128857w.AQe(null, new C62V(null, EqT, 4.0f, 0, 0), EqT2, 1.0f, 3, j, interfaceC1128857w.Amh());
            if (z2) {
                interfaceC1128857w.AQe(null, C119815bf.A00, EqT2 - interfaceC1128857w.EqT(4.0f), 1.0f, 3, j, interfaceC1128857w.Amh());
            }
        } else {
            long j2 = this.A00;
            InterfaceC74963Ym interfaceC74963Ym = this.A02;
            C14360o3.A0B(interfaceC74963Ym, 4);
            float EqT3 = interfaceC1128857w.EqT(2.0f);
            float f = EqT3 / 2.0f;
            float EqT4 = interfaceC1128857w.EqT(24.0f / 2.0f) - f;
            if (z2) {
                c62v = C119815bf.A00;
            } else {
                c62v = new C62V(null, EqT3, 4.0f, 0, 0);
            }
            interfaceC1128857w.AQe(null, c62v, EqT4, 1.0f, 3, j, interfaceC1128857w.Amh());
            if (Float.compare(AbstractC25228BEl.A00(interfaceC74963Ym), 0.0f) > 0) {
                interfaceC1128857w.AQe(null, C119815bf.A00, interfaceC1128857w.EqT(AbstractC25228BEl.A00(interfaceC74963Ym)) - f, 1.0f, 3, j2, interfaceC1128857w.Amh());
            }
        }
        return C0eB.A00;
    }
}
