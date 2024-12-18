package X;

/* renamed from: X.Dd5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30584Dd5 extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ InterfaceC74953Yl A00;
    public final /* synthetic */ C5C3 A01;
    public final /* synthetic */ C5QE A02;
    public final /* synthetic */ EnumC27393C6w A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ InterfaceC16660sJ A05;
    public final /* synthetic */ C19L A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30584Dd5(InterfaceC74953Yl interfaceC74953Yl, C5C3 c5c3, C5QE c5qe, EnumC27393C6w enumC27393C6w, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, C19L c19l, boolean z, boolean z2, boolean z3, boolean z4) {
        super(3);
        this.A09 = z;
        this.A01 = c5c3;
        this.A02 = c5qe;
        this.A0A = z2;
        this.A05 = interfaceC16660sJ;
        this.A04 = interfaceC16820sZ;
        this.A07 = z3;
        this.A08 = z4;
        this.A03 = enumC27393C6w;
        this.A06 = c19l;
        this.A00 = interfaceC74953Yl;
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
                C0fH.A01(1295061152, "com.instagram.creation.genai.common.ui.CreationGenAIPromptBar.<anonymous>.<anonymous>.<anonymous> (CreationGenAIPromptBar.kt:195)");
            }
            boolean A1X = AbstractC25230BEn.A1X(this.A00);
            boolean z = this.A09;
            C5C3 c5c3 = this.A01;
            C5QE c5qe = this.A02;
            boolean z2 = this.A0A;
            c5Tl.Eno(673076017);
            InterfaceC16660sJ interfaceC16660sJ = this.A05;
            boolean AH4 = c5Tl.AH4(interfaceC16660sJ);
            Object EEc = c5Tl.EEc();
            if (AH4 || EEc == C5UI.A00) {
                EEc = DH4.A01(c5Tl, interfaceC16660sJ, 4);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            InterfaceC16820sZ interfaceC16820sZ = this.A04;
            boolean z3 = this.A07;
            boolean z4 = this.A08;
            AbstractC28436Cgk.A01(c5Tl, c5c3, c5qe, this.A03, (InterfaceC16820sZ) EEc, interfaceC16820sZ, interfaceC16620sF, this.A06, 458752 & (A0H << 15), 0, 0, z, z2, A1X, z3, z4);
            if (C0fH.A02()) {
                C0fH.A00(-1554409870);
            }
        }
        return C0eB.A00;
    }
}
