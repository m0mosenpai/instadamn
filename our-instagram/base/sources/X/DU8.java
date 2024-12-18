package X;

import androidx.compose.ui.Modifier;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* loaded from: classes5.dex */
public final class DU8 extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ float A00;
    public final /* synthetic */ MediaFrameLayout A01;
    public final /* synthetic */ C75363a3 A02;
    public final /* synthetic */ C27955CTv A03;
    public final /* synthetic */ L86 A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DU8(MediaFrameLayout mediaFrameLayout, C75363a3 c75363a3, C27955CTv c27955CTv, L86 l86, float f, boolean z, boolean z2) {
        super(2);
        this.A03 = c27955CTv;
        this.A01 = mediaFrameLayout;
        this.A00 = f;
        this.A06 = z;
        this.A02 = c75363a3;
        this.A04 = l86;
        this.A05 = z2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Modifier modifier;
        C5Tl c5Tl = (C5Tl) obj;
        if (AbstractC25228BEl.A0B(obj2) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-519433421, "com.instagram.wonderwall.ui.compose.components.MediaVideoPlayer.<anonymous> (WallVideoAttachment.kt:95)");
            }
            C27955CTv c27955CTv = this.A03;
            MediaFrameLayout mediaFrameLayout = this.A01;
            float f = this.A00;
            boolean z = this.A06;
            C75363a3 c75363a3 = this.A02;
            L86 l86 = this.A04;
            boolean z2 = this.A05;
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
            c5Tl.Eno(734001997);
            if (!AbstractC25231BEo.A1U(c27955CTv.A00)) {
                Object A0q = AbstractC25227BEk.A0q(c5Tl, 734006079);
                Object obj3 = C5UI.A00;
                C5XO c5xo = (C5XO) AbstractC25232BEp.A1C(c5Tl, A0q, obj3);
                C117505Tk.A0L(c117505Tk, false);
                boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, c27955CTv, 734010240);
                Object EEc = c5Tl.EEc();
                if (A1Y || EEc == obj3) {
                    EEc = DGU.A00(c5Tl, c27955CTv, 0);
                }
                modifier = C5XR.A04(c5xo, c1130158n, AbstractC25225BEi.A1A(c117505Tk, EEc, false));
            } else {
                modifier = c1130158n;
            }
            Modifier A0G = AbstractC25227BEk.A0G(c117505Tk, A0U, modifier);
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, mediaFrameLayout, 734014310);
            Object EEc2 = c5Tl.EEc();
            if (A1Z || EEc2 == C5UI.A00) {
                EEc2 = C30179DRk.A00(c5Tl, mediaFrameLayout, 11);
            }
            InterfaceC16660sJ A1B = AbstractC25225BEi.A1B(c117505Tk, EEc2, false);
            boolean A1T = AbstractC25227BEk.A1T(c5Tl, f, 734015112);
            Object EEc3 = c5Tl.EEc();
            if (A1T || EEc3 == C5UI.A00) {
                EEc3 = new DHG(f, 13);
                c5Tl.FBy(EEc3);
            }
            AbstractC28450Cgz.A02(c5Tl, A0G, A1B, AbstractC25225BEi.A1B(c117505Tk, EEc3, false), 0, 0);
            c5Tl.Eno(734017117);
            if (z && AbstractC166997dE.A1Z(c75363a3.A0B, true)) {
                boolean A1X = AbstractC25230BEn.A1X(l86.A00);
                Modifier A0E = AbstractC118175Wb.A0E(c119645bN.AB5(C118195Wf.A07, c1130158n), 0.0f, 0.0f, 12.0f, 12.0f);
                Object A0q2 = AbstractC25227BEk.A0q(c5Tl, 734020052);
                if (A0q2 == C5UI.A00) {
                    A0q2 = new DGU(l86, 1);
                    c5Tl.FBy(A0q2);
                }
                AbstractC28333CeL.A02(c5Tl, A0E, AbstractC25225BEi.A1A(c117505Tk, A0q2, false), 384, A1X);
            }
            Boolean A0k = AbstractC25227BEk.A0k(c117505Tk, z2);
            boolean A1W = AbstractC25232BEp.A1W(c5Tl, c27955CTv, 734027545, z2);
            Object EEc4 = c5Tl.EEc();
            if (A1W || EEc4 == C5UI.A00) {
                EEc4 = new PYw(c27955CTv, null, 40, z2);
                c5Tl.FBy(EEc4);
            }
            AbstractC25228BEl.A1K(c5Tl, c117505Tk, EEc4, A0k, false);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1339893897);
            }
        }
        return C0eB.A00;
    }
}
