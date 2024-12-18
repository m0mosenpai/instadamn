package X;

import androidx.compose.ui.Modifier;
import java.util.List;

/* renamed from: X.DVr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30290DVr extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30290DVr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i, boolean z) {
        super(2);
        this.A00 = i;
        this.A05 = obj;
        this.A04 = obj2;
        this.A07 = obj3;
        this.A02 = obj4;
        this.A08 = z;
        this.A03 = obj5;
        this.A06 = obj6;
        this.A01 = obj7;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i;
        C5Tl c5Tl = (C5Tl) obj;
        if (this.A00 != 0) {
            if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                if (C0fH.A02()) {
                    C0fH.A01(-709031485, "com.instagram.schools.tab.ui.SchoolRootComponent.<anonymous> (SchoolRootComposeComponents.kt:43)");
                }
                List list = (List) this.A01;
                BVY bvy = (BVY) this.A04;
                C5Hc c5Hc = (C5Hc) this.A02;
                Object obj3 = this.A07;
                Object obj4 = this.A05;
                Object obj5 = this.A06;
                boolean z = this.A08;
                Object obj6 = this.A03;
                C1130158n c1130158n = Modifier.A00;
                InterfaceC1127857k A02 = AbstractC119595bH.A02(AbstractC118255Wn.A07, c5Tl, C118195Wf.A02, 0);
                int A00 = C5X2.A00(c5Tl);
                C117505Tk c117505Tk = (C117505Tk) c5Tl;
                C59P A04 = C117505Tk.A04(c117505Tk);
                Modifier A01 = C5X3.A01(c5Tl, c1130158n);
                AbstractC25233BEq.A11(c5Tl, c117505Tk);
                AbstractC25231BEo.A12(c5Tl, A02, A04);
                InterfaceC16620sF interfaceC16620sF = C5X8.A02;
                if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
                }
                AbstractC25225BEi.A1K(c5Tl, A01);
                if (AbstractC25227BEk.A04(c5Tl, list, 1125722) > 1) {
                    int A03 = bvy.A03();
                    boolean A1X = AbstractC25232BEp.A1X(c5Tl, obj3, bvy, 1130893);
                    Object EEc = c5Tl.EEc();
                    if (A1X || EEc == C5UI.A00) {
                        EEc = C30184DRp.A00(c5Tl, bvy, c5Hc, obj3, 24);
                    }
                    CY1.A00(c5Tl, null, null, AbstractC25225BEi.A1B(c117505Tk, EEc, false), c5Hc, A03, 48, 56, 0L);
                    AbstractC28389Cfs.A00(c5Tl);
                }
                C117505Tk.A0L(c117505Tk, false);
                AbstractC25663BVz.A01(null, bvy, null, c5Tl, C118195Wf.A05, AbstractC25226BEj.A0U(c1130158n), null, C5UA.A01(c5Tl, new C30730DfS(1, obj6, obj5, obj4, list, z), -927925287), 102236208, 7868);
                if (AbstractC25227BEk.A1R(c5Tl)) {
                    i = 1284394820;
                    C0fH.A00(i);
                }
            }
            c5Tl.Em9();
        } else {
            if (AbstractC25228BEl.A0C(obj2) != 2 || !c5Tl.Bxj()) {
                if (C0fH.A02()) {
                    C0fH.A01(227950757, "com.instagram.creation.genai.themes.ui.MainContent.<anonymous>.<anonymous> (AiThemesScreen.kt:145)");
                }
                C26071Bg0 c26071Bg0 = (C26071Bg0) this.A05;
                C51737MtK c51737MtK = (C51737MtK) AbstractC25226BEj.A1B(this.A03);
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A04;
                C25870BcR c25870BcR = (C25870BcR) this.A07;
                AbstractC27631CHc.A00(c5Tl, c51737MtK, c26071Bg0, (CTK) this.A02, interfaceC16820sZ, new C30183DRo(28, c25870BcR, this.A06), 262216, c25870BcR.A07, AbstractC25231BEo.A1U((InterfaceC74963Ym) this.A01), this.A08);
                if (C0fH.A02()) {
                    i = -1528441025;
                    C0fH.A00(i);
                }
            }
            c5Tl.Em9();
        }
        return C0eB.A00;
    }
}
