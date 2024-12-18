package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;

/* loaded from: classes5.dex */
public abstract class CEA {
    public static final void A00(C5Tl c5Tl, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C14360o3.A0B(interfaceC16820sZ, 1);
        c5Tl.Enr(916329349);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, modifier2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(851171152, "com.instagram.barcelona.feed.post.ui.MediaPivotPageLabel (MediaPivotPageLabel.kt:29)");
            }
            C118125Vw A0c = AbstractC25226BEj.A0c(c5Tl);
            C118125Vw c118125Vw = C118125Vw.A03;
            C118125Vw A0D = A0c.A0D(new C118125Vw(null, null, null, 0, 0, 16777213, 0L, AbstractC118155Vz.A01(13), 0L, 0L));
            InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
            Modifier A09 = AbstractC118185Wd.A09(AbstractC118175Wb.A0E(modifier2, 0.0f, 12.0f, 12.0f, 0.0f), 28.0f);
            boolean A1P = AbstractC25233BEq.A1P(c5Tl, 19480676, i3);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = AbstractC25235BEs.A12(c5Tl, interfaceC16820sZ, 38);
            }
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            Modifier A0I = AbstractC25235BEs.A0I(c5Tl, c117505Tk, A09, (InterfaceC16820sZ) EEc);
            InterfaceC1127857k A02 = AbstractC118375Wz.A02(AbstractC118255Wn.A01, c5Tl, interfaceC118225Wj, 48);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0I);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A02, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C6L0 c6l0 = C6L0.A00;
            C2DC A002 = C5Y7.A00(c5Tl, R.drawable.barcelona_search_filled_26, 0);
            long A0C = AbstractC25226BEj.A0C(c5Tl);
            C1130158n c1130158n = Modifier.A00;
            C5YS.A06(c5Tl, AbstractC118185Wd.A0C(AbstractC25236BEt.A0K(c1130158n), 12.0f), A002, A0C);
            C5WR.A0R(c5Tl, c6l0.A00(c1130158n), A0D, C5YD.A00(c5Tl, 2131953678), AbstractC25226BEj.A0C(c5Tl));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(199837297);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30504Dbn.A01(modifier2, interfaceC16820sZ, i2, i, 15);
        }
    }
}
