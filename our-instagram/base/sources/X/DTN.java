package X;

import android.content.Context;
import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DTN extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ InterfaceC16660sJ A02;
    public final /* synthetic */ C5Hc A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DTN(Context context, String str, InterfaceC16660sJ interfaceC16660sJ, C5Hc c5Hc, boolean z, boolean z2) {
        super(2);
        this.A04 = z;
        this.A05 = z2;
        this.A00 = context;
        this.A03 = c5Hc;
        this.A01 = str;
        this.A02 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl c5Tl = (C5Tl) obj;
        if (AbstractC25228BEl.A0B(obj2) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-485358527, "com.instagram.schools.management.badge.EditBadgeComposeView.<anonymous> (EditBadgeComposeView.kt:33)");
            }
            if (this.A04) {
                c5Tl.Eno(1181819437);
                CGQ.A00(c5Tl, null, 0, 1);
            } else if (this.A05) {
                c5Tl.Eno(-2018253360);
                C0eB c0eB = C0eB.A00;
                c5Tl.Eno(1181821995);
                Context context = this.A00;
                boolean AH6 = c5Tl.AH6(context);
                Object EEc = c5Tl.EEc();
                if (AH6 || EEc == C5UI.A00) {
                    EEc = new PYs(context, null, 14);
                    c5Tl.FBy(EEc);
                }
                AbstractC25231BEo.A10(c5Tl, EEc, c0eB);
            } else {
                c5Tl.Eno(-2018055642);
                C5Hc c5Hc = this.A03;
                String str = this.A01;
                InterfaceC16660sJ interfaceC16660sJ = this.A02;
                C1130158n c1130158n = Modifier.A00;
                InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
                int A00 = C5X2.A00(c5Tl);
                C117505Tk c117505Tk = (C117505Tk) c5Tl;
                C59P A04 = C117505Tk.A04(c117505Tk);
                Modifier A01 = C5X3.A01(c5Tl, c1130158n);
                AbstractC25233BEq.A11(c5Tl, c117505Tk);
                AbstractC25231BEo.A12(c5Tl, A0Y, A04);
                InterfaceC16620sF interfaceC16620sF = C5X8.A02;
                if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
                }
                AbstractC25225BEi.A1K(c5Tl, A01);
                CKB.A00(AbstractC136736Hc.A00(c5Tl, 2131972914), c5Tl, 0);
                c5Tl.Eno(-1199587580);
                if (c5Hc != null) {
                    CYx.A00(c5Tl, str, interfaceC16660sJ, c5Hc, 0);
                }
                C117505Tk.A0L(c117505Tk, false);
                c5Tl.ASW();
            }
            if (AbstractC25230BEn.A1Z(c5Tl, false)) {
                C0fH.A00(896458435);
            }
        }
        return C0eB.A00;
    }
}
