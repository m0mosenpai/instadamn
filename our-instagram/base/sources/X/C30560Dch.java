package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;

/* renamed from: X.Dch, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30560Dch extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ C118125Vw A04;
    public final /* synthetic */ InterfaceC1128957x A05;
    public final /* synthetic */ String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30560Dch(C118125Vw c118125Vw, InterfaceC1128957x interfaceC1128957x, String str, float f, int i, long j, long j2) {
        super(3);
        this.A02 = j;
        this.A00 = f;
        this.A06 = str;
        this.A04 = c118125Vw;
        this.A01 = i;
        this.A05 = interfaceC1128957x;
        this.A03 = j2;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC31141Dmg interfaceC31141Dmg = (InterfaceC31141Dmg) obj;
        C5Tl c5Tl = (C5Tl) obj2;
        int A0H = AbstractC166987dD.A0H(obj3);
        C14360o3.A0B(interfaceC31141Dmg, 0);
        if ((A0H & 6) == 0) {
            A0H |= AbstractC25232BEp.A0R(c5Tl, interfaceC31141Dmg);
        }
        if ((A0H & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(827600765, "com.instagram.aistudio.editor.TriangleBubbleWithTextComponent.<anonymous> (TriangleBubbleWithTextComponent.kt:85)");
            }
            C1130158n c1130158n = Modifier.A00;
            C5WI A00 = C5WF.A00();
            long j = AbstractC1132259k.A00;
            Modifier A01 = AbstractC28015CWn.A01(c1130158n, A00, 4.0f, j, j, false);
            long j2 = this.A02;
            Modifier A0H2 = AbstractC118185Wd.A0H(AbstractC118175Wb.A08(C6L3.A01(A01, C5WF.A00(), j2), 10.0f), 84.0f, Float.NaN);
            Alignment alignment = C118195Wf.A09;
            String str = this.A06;
            long j3 = this.A03;
            int i = this.A01;
            C118125Vw c118125Vw = this.A04;
            InterfaceC1127857k A002 = C5XX.A00(alignment, false);
            int A003 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A0H2);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A002, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A003);
            }
            AbstractC25225BEi.A1K(c5Tl, A012);
            C5WR.A0D(c5Tl, C119645bN.A00.AB5(alignment, c1130158n), c118125Vw, str, 3, i, 384, 11128, j3);
            c5Tl.ASW();
            int A013 = Constraints.A01(((C28739CmX) interfaceC31141Dmg).A00);
            float f = this.A00;
            long A042 = C5AU.A04(0, A013 - ((int) f), 0, Integer.MAX_VALUE);
            InterfaceC1128957x A0b = AbstractC25230BEn.A0b(c5Tl);
            C5DD c5dd = (C5DD) c5Tl.AJX(C5V2.A03);
            C16930sl c16930sl = C16930sl.A00;
            float EqS = (new C122815hH(new C122585gt(c118125Vw, c5dd, A0b, str, c16930sl, c16930sl), i, A042, false).A01.A06 * this.A05.EqS(c118125Vw.A00.A04)) + f;
            Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
            c5Tl.Eno(-1648945108);
            boolean A1W = AbstractC25226BEj.A1W(c5Tl, j2, c5Tl.AH1(EqS) | AbstractC25235BEs.A1S(A0H));
            Object EEc = c5Tl.EEc();
            if (A1W || EEc == C5UI.A00) {
                EEc = new DHV(interfaceC31141Dmg, EqS, 0, j2);
                c5Tl.FBy(EEc);
            }
            AbstractC119665bP.A00(c5Tl, A0T, AbstractC25225BEi.A1B(c117505Tk, EEc, false), 6);
            if (C0fH.A02()) {
                C0fH.A00(1638451515);
            }
        }
        return C0eB.A00;
    }
}
