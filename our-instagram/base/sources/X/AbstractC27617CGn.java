package X;

import androidx.compose.animation.SizeAnimationModifierElement;
import androidx.compose.ui.Modifier;

/* renamed from: X.CGn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27617CGn {
    public static final void A00(C5Tl c5Tl, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        int i3;
        Modifier Eq3;
        C118125Vw A00;
        C14360o3.A0B(interfaceC16660sJ, 1);
        c5Tl.Enr(-1962662903);
        if ((i2 & 6) == 0) {
            i3 = AbstractC25232BEp.A08(c5Tl, i) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-908885539, "com.instagram.creation.capture.quickcapture.potato.capture.view.compose.PotatoCaptionFormField (PotatoCaptionFormField.kt:39)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -1120012015);
            Object obj = C5UI.A00;
            C25338BJh c25338BJh = (C25338BJh) AbstractC25231BEo.A0l(c5Tl, A0q, obj);
            C117505Tk A0J = AbstractC25225BEi.A0J(c5Tl);
            Object A0q2 = AbstractC25227BEk.A0q(c5Tl, -1120010605);
            if (A0q2 == obj) {
                A0q2 = AbstractC25232BEp.A0w(c5Tl, "");
            }
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) A0q2;
            C117505Tk.A0L(A0J, false);
            C0eB c0eB = C0eB.A00;
            Object A0q3 = AbstractC25227BEk.A0q(c5Tl, -1120008811);
            if (A0q3 == obj) {
                A0q3 = new PYX(c25338BJh, null, 11);
                c5Tl.FBy(A0q3);
            }
            AbstractC25228BEl.A1K(c5Tl, A0J, A0q3, c0eB, false);
            Eq3 = C6L2.A00(AbstractC25228BEl.A0W()).Eq3(new SizeAnimationModifierElement(new C5Y4(new C119055aN(1 | (1 << 32)), 1.0f, 400.0f), C118195Wf.A0E));
            Modifier A0X = AbstractC25230BEn.A0X(Eq3, c25338BJh);
            String A1D = AbstractC25226BEj.A1D(interfaceC74953Yl);
            A00 = C118125Vw.A00(null, null, AbstractC25226BEj.A0g(c5Tl), null, null, null, 0, 0, 0, 6291454, AbstractC25226BEj.A0G(c5Tl), 0L, 0L, 0L);
            C6L4 c6l4 = new C6L4(C5XL.A00(c5Tl).A06);
            c5Tl.Eno(-1120002656);
            boolean A1P = AbstractC167007dF.A1P(i3 & 14, 4) | AbstractC25228BEl.A1T(i3);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == obj) {
                EEc = new C30171DRb(interfaceC74953Yl, interfaceC16660sJ, i, 2);
                c5Tl.FBy(EEc);
            }
            AbstractC28411CgH.A02(c5Tl, A0X, c6l4, A00, A1D, AbstractC25225BEi.A1B(A0J, EEc, false), C5UA.A01(c5Tl, C30712DfA.A00(interfaceC74953Yl, 44), -1099598100), 0, 1, 100663296, 196614, 15064, true);
            if (C0fH.A02()) {
                C0fH.A00(389676977);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30501Dbk.A01(ASZ, interfaceC16660sJ, i, i2, 13);
        }
    }
}
