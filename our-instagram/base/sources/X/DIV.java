package X;

/* loaded from: classes5.dex */
public final class DIV extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ InterfaceC74963Ym A04;
    public final /* synthetic */ C59W A05;
    public final /* synthetic */ C59W A06;
    public final /* synthetic */ C59W A07;
    public final /* synthetic */ Integer A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DIV(InterfaceC74963Ym interfaceC74963Ym, C59W c59w, C59W c59w2, C59W c59w3, Integer num, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        super(1);
        this.A07 = c59w;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = interfaceC74963Ym;
        this.A06 = c59w2;
        this.A03 = i3;
        this.A09 = z;
        this.A08 = num;
        this.A0A = z2;
        this.A05 = c59w3;
        this.A02 = i4;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C59W c59w;
        C5AW c5aw = (C5AW) obj;
        C14360o3.A0B(c5aw, 0);
        C59W c59w2 = this.A07;
        int i = this.A01;
        c5aw.A07(c59w2, 0, (i - this.A00) - c59w2.A00);
        float A05 = AbstractC25231BEo.A05(this.A04);
        InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
        C59W c59w3 = this.A06;
        int AB4 = interfaceC118225Wj.AB4(c59w3.A00, i);
        if (A05 == 0.0f) {
            c5aw.A07(c59w3, 0, AB4);
        } else {
            int i2 = this.A03;
            c5aw.A0B(c59w3, new DHG(A05, 9), 0, AB4 + C1H4.A01((i2 - AB4) * A05));
            if (this.A09 && this.A08 != null && this.A0A && (c59w = this.A05) != null) {
                c5aw.A07(c59w, this.A02 - c59w.A01, i2);
            }
        }
        return C0eB.A00;
    }
}
