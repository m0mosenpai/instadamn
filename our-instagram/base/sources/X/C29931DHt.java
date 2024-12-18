package X;

/* renamed from: X.DHt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29931DHt extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C2DC A02;
    public final /* synthetic */ C2DC A03;
    public final /* synthetic */ C26082BgB A04;
    public final /* synthetic */ InterfaceC16820sZ A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29931DHt(C2DC c2dc, C2DC c2dc2, C26082BgB c26082BgB, InterfaceC16820sZ interfaceC16820sZ, long j, long j2) {
        super(1);
        this.A04 = c26082BgB;
        this.A05 = interfaceC16820sZ;
        this.A02 = c2dc;
        this.A03 = c2dc2;
        this.A00 = j;
        this.A01 = j2;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        InterfaceC16610sE interfaceC16610sE;
        String str;
        C28223CcT c28223CcT = (C28223CcT) obj;
        C14360o3.A0B(c28223CcT, 0);
        C26082BgB c26082BgB = this.A04;
        int A0H = AbstractC166987dD.A0H(c26082BgB.A03);
        if (A0H != 0) {
            if (A0H != 1) {
                if (A0H == 2) {
                    interfaceC16610sE = C5UA.A04(C30715DfD.A00(c26082BgB, 12), -1179725402, true);
                    str = "improve_ai_circle_progress";
                } else {
                    throw B4Z.A00();
                }
            } else {
                interfaceC16610sE = AbstractC27796CNl.A00;
                str = "improve_ai_circle_progress_loading";
            }
            c28223CcT.A01(str, str, str, interfaceC16610sE);
        }
        int A0H2 = AbstractC166987dD.A0H(c26082BgB.A04);
        if (A0H2 != 0) {
            if (A0H2 != 1) {
                if (A0H2 == 2) {
                    c28223CcT.A02("improvement_steps", C30071DNf.A00, C30072DNg.A00, C5UA.A04(new C30754Dfr(0, this.A02, this.A03), -1935310033, true), (C5Hc) c26082BgB.A00);
                } else {
                    throw B4Z.A00();
                }
            } else {
                Number number = (Number) c26082BgB.A02;
                if (number != null) {
                    i = number.intValue();
                } else {
                    i = 5;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    String A0O = AnonymousClass001.A0O("loading_shimmer_", i2);
                    c28223CcT.A01(A0O, A0O, A0O, AbstractC27796CNl.A01);
                }
            }
        } else {
            c28223CcT.A01("retry_image", "retry_image", "retry_image", C5UA.A04(C30715DfD.A00(this.A05, 13), -1547629291, true));
        }
        return C0eB.A00;
    }
}
