package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.compose.core.ui.IgClickableTextKt;

/* renamed from: X.CFn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27594CFn {
    public static final void A00(C5Tl c5Tl, ImageUrl imageUrl, String str, InterfaceC16820sZ interfaceC16820sZ, int i) {
        int i2;
        boolean A1R = AbstractC167007dF.A1R(0, imageUrl, str);
        C14360o3.A0B(interfaceC16820sZ, 2);
        c5Tl.Enr(618753787);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, imageUrl) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, str);
        }
        if ((i & 896) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 731) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(289192907, "com.instagram.comments.mvvm.view.compose.InlineComposerButton (InlineComposerButton.kt:32)");
            }
            boolean z = true;
            String A17 = AbstractC25228BEl.A17(c5Tl, str, 2131972364);
            int A08 = AbstractC001900j.A08(C5YD.A00(c5Tl, 2131972364), "%1$s", 0, false);
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 1262849266);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                C6C7 A0U = AbstractC25231BEo.A0U(A17);
                A0U.A06(new C5W3(null, null, null, C5W5.A01, null, 65531, 0L, 0L, 0L), A08, AbstractC25226BEj.A04(str, A08));
                A0q = A0U.A02();
                c5Tl.FBy(A0q);
            }
            C5C8 c5c8 = (C5C8) A0q;
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C1130158n c1130158n = Modifier.A00;
            Modifier A0E = AbstractC118175Wb.A0E(c1130158n, 0.0f, C5XT.A02(c5Tl, R.dimen.account_discovery_bottom_gap), C5XT.A02(c5Tl, R.dimen.account_discovery_bottom_gap), C5XT.A02(c5Tl, R.dimen.account_discovery_bottom_gap));
            c5Tl.Eno(1262867309);
            if ((i2 & 896) != 256) {
                z = false;
            }
            Object EEc = c5Tl.EEc();
            if (z || EEc == obj) {
                EEc = C29906DGu.A01(c5Tl, interfaceC16820sZ, 21);
            }
            Modifier A05 = C5XR.A05(A0E, null, null, AbstractC25225BEi.A1A(A0K, EEc, false), A1R);
            InterfaceC1127857k A0f = AbstractC25228BEl.A0f(c5Tl, 0);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, A05);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A0f, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C6L0 c6l0 = C6L0.A00;
            C2DB A012 = AbstractC43541zP.A01(c5Tl, imageUrl, i2 & 14);
            Modifier A0E2 = AbstractC118175Wb.A0E(c1130158n, 0.0f, 0.0f, C5XT.A02(c5Tl, R.dimen.abc_edit_text_inset_top_material), 0.0f);
            float A02 = C5XT.A02(c5Tl, R.dimen.add_account_icon_circle_radius);
            BGD.A02(c5Tl, A0E2, A012, new BI2(A02, A02, 2.0f, 1.0f), 8);
            IgClickableTextKt.A01(c5Tl, c6l0.AB7(C118195Wf.A04, AbstractC118185Wd.A00(C118195Wf.A00, c1130158n)), c5c8, AbstractC25226BEj.A0c(c5Tl), null, null, null, DMT.A00, null, null, 5, 0, A1R ? 1 : 0, 2, 805306374, 24582, 111032, AbstractC25226BEj.A0M(c5Tl), 0L, false, false);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(446260160);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DT4(interfaceC16820sZ, imageUrl, str, i, 2);
        }
    }
}
