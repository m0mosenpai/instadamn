package X;

/* renamed from: X.Dcv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30574Dcv extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C5XO A01;
    public final /* synthetic */ InterfaceC74963Ym A02;
    public final /* synthetic */ InterfaceC30801Dgc A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ InterfaceC16820sZ A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30574Dcv(C5XO c5xo, InterfaceC74963Ym interfaceC74963Ym, InterfaceC30801Dgc interfaceC30801Dgc, Integer num, Integer num2, String str, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z) {
        super(3);
        this.A06 = str;
        this.A03 = interfaceC30801Dgc;
        this.A01 = c5xo;
        this.A08 = z;
        this.A00 = i;
        this.A05 = num;
        this.A04 = num2;
        this.A07 = interfaceC16820sZ;
        this.A02 = interfaceC74963Ym;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) obj;
        C5Tl c5Tl = (C5Tl) obj2;
        int A0H = AbstractC166987dD.A0H(obj3);
        C14360o3.A0B(interfaceC16620sF, 0);
        if ((A0H & 6) == 0) {
            A0H |= AbstractC25232BEp.A0H(c5Tl, interfaceC16620sF);
        }
        if ((A0H & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(112964583, "com.instagram.compose.igds.components.formfield.IgdsFormFieldTextField.<anonymous> (IgdsFormField.kt:177)");
            }
            boolean A1U = AbstractC25231BEo.A1U(this.A02);
            String str = this.A06;
            InterfaceC30801Dgc interfaceC30801Dgc = this.A03;
            C5XO c5xo = this.A01;
            boolean z = this.A08;
            AbstractC28505Chy.A03(c5xo, c5Tl, interfaceC30801Dgc, this.A05, this.A04, str, this.A07, interfaceC16620sF, this.A00, 29360128 & (A0H << 21), 0, A1U, z);
            if (C0fH.A02()) {
                C0fH.A00(1582464877);
            }
        }
        return C0eB.A00;
    }
}
