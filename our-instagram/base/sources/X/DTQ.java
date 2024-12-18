package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DTQ extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ InterfaceC74953Yl A00;
    public final /* synthetic */ C47786L8r A01;
    public final /* synthetic */ KLC A02;
    public final /* synthetic */ InterfaceC16660sJ A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DTQ(InterfaceC74953Yl interfaceC74953Yl, C47786L8r c47786L8r, KLC klc, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2) {
        super(2);
        this.A02 = klc;
        this.A05 = z;
        this.A04 = z2;
        this.A03 = interfaceC16660sJ;
        this.A00 = interfaceC74953Yl;
        this.A01 = c47786L8r;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl c5Tl = (C5Tl) obj;
        if (AbstractC25228BEl.A0B(obj2) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-91877109, "com.instagram.wonderwall.ui.compose.components.MediumVideoPlayer.<anonymous> (WallVideoAttachment.kt:189)");
            }
            KLC klc = this.A02;
            boolean z = this.A05;
            boolean z2 = this.A04;
            InterfaceC16660sJ interfaceC16660sJ = this.A03;
            InterfaceC74953Yl interfaceC74953Yl = this.A00;
            C47786L8r c47786L8r = this.A01;
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A00 = C5XX.A00(C118195Wf.A0E, false);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A00, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C119645bN c119645bN = C119645bN.A00;
            Modifier A0U = AbstractC25226BEj.A0U(c1130158n);
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, klc, -1493136431);
            Object EEc = c5Tl.EEc();
            if (A1Z || EEc == C5UI.A00) {
                EEc = C30179DRk.A00(c5Tl, klc, 12);
            }
            AbstractC28450Cgz.A02(c5Tl, A0U, AbstractC25225BEi.A1B(c117505Tk, EEc, false), null, 48, 4);
            c5Tl.Eno(-1493135159);
            if (z && AbstractC25230BEn.A1X(interfaceC74953Yl)) {
                Modifier A0E = AbstractC118175Wb.A0E(c119645bN.AB5(C118195Wf.A07, c1130158n), 0.0f, 0.0f, 12.0f, 12.0f);
                boolean A1Y = AbstractC25226BEj.A1Y(c5Tl, z2, AbstractC25227BEk.A1Y(c5Tl, interfaceC16660sJ, -1493131679));
                Object EEc2 = c5Tl.EEc();
                if (A1Y || EEc2 == C5UI.A00) {
                    EEc2 = new D8O(25, interfaceC16660sJ, c47786L8r, z2);
                    c5Tl.FBy(EEc2);
                }
                AbstractC28333CeL.A02(c5Tl, A0E, AbstractC25225BEi.A1A(c117505Tk, EEc2, false), 0, z2);
            }
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(1097620877);
            }
        }
        return C0eB.A00;
    }
}
