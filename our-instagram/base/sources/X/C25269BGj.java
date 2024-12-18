package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.BGj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25269BGj extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ double A00;
    public final /* synthetic */ InterfaceC74963Ym A01;
    public final /* synthetic */ Modifier A02;
    public final /* synthetic */ C5C8 A03;
    public final /* synthetic */ AbstractC27441C9j A04;
    public final /* synthetic */ InterfaceC31097Dlf A05;
    public final /* synthetic */ BGT A06;
    public final /* synthetic */ InterfaceC16660sJ A07;
    public final /* synthetic */ InterfaceC16660sJ A08;
    public final /* synthetic */ InterfaceC16660sJ A09;
    public final /* synthetic */ InterfaceC16660sJ A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25269BGj(InterfaceC74963Ym interfaceC74963Ym, Modifier modifier, C5C8 c5c8, AbstractC27441C9j abstractC27441C9j, InterfaceC31097Dlf interfaceC31097Dlf, BGT bgt, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, InterfaceC16660sJ interfaceC16660sJ4, double d) {
        super(2);
        this.A03 = c5c8;
        this.A06 = bgt;
        this.A05 = interfaceC31097Dlf;
        this.A04 = abstractC27441C9j;
        this.A02 = modifier;
        this.A09 = interfaceC16660sJ;
        this.A01 = interfaceC74963Ym;
        this.A07 = interfaceC16660sJ2;
        this.A08 = interfaceC16660sJ3;
        this.A0A = interfaceC16660sJ4;
        this.A00 = d;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String obj3;
        C5Tl c5Tl = (C5Tl) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(295656608, "com.instagram.newsfeed.fragment.NewsfeedRow.<anonymous> (NewsfeedYouComposeFragment.kt:1221)");
            }
            C5C8 c5c8 = this.A03;
            MUG mug = new MUG(c5c8, (C5C8) null, 6);
            BGT bgt = this.A06;
            C5QE c5qe = bgt.A00;
            c5Tl.Eno(-257283998);
            if (c5qe == null) {
                obj3 = null;
            } else {
                obj3 = BHY.A00(c5Tl, c5qe).toString();
            }
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            String str = bgt.A06;
            BHZ bhz = bgt.A04;
            boolean z = bgt.A07;
            InterfaceC31097Dlf interfaceC31097Dlf = this.A05;
            AbstractC27441C9j abstractC27441C9j = this.A04;
            Modifier modifier = this.A02;
            c5Tl.Eno(-257277440);
            boolean AH4 = c5Tl.AH4(c5c8);
            InterfaceC16660sJ interfaceC16660sJ = this.A09;
            boolean AH42 = AH4 | c5Tl.AH4(interfaceC16660sJ);
            InterfaceC74963Ym interfaceC74963Ym = this.A01;
            boolean AH43 = AH42 | c5Tl.AH4(interfaceC74963Ym);
            Object EEc = c5Tl.EEc();
            if (AH43 || EEc == C5UI.A00) {
                EEc = new C30184DRp(12, c5c8, interfaceC74963Ym, interfaceC16660sJ);
                c5Tl.FBy(EEc);
            }
            C117505Tk.A0L(c117505Tk, false);
            BG8.A04(c5Tl, modifier, mug, abstractC27441C9j, bhz, interfaceC31097Dlf, obj3, str, (InterfaceC16660sJ) EEc, this.A07, this.A08, this.A0A, this.A00, 0, 0, 0, z);
            if (C0fH.A02()) {
                C0fH.A00(-182591046);
            }
        }
        return C0eB.A00;
    }
}
