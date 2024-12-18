package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;

/* loaded from: classes5.dex */
public abstract class CEK {
    public static final void A00(C5Tl c5Tl, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, C5Hc c5Hc, int i, int i2, int i3, boolean z) {
        int i4;
        Modifier modifier2 = modifier;
        C14360o3.A0B(c5Hc, 2);
        c5Tl.Enr(-1800456318);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= AbstractC25232BEp.A0T(c5Tl, c5Hc);
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= AbstractC25232BEp.A0e(c5Tl, z);
        }
        int i5 = i3 & 16;
        if (i5 != 0) {
            i4 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i2 & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i4 |= AbstractC25232BEp.A0V(c5Tl, modifier2);
        }
        if ((i4 & 9347) == 9346 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-544043671, "com.instagram.barcelona.feed.post.ui.PostInlineReplyExpansion (PostInlineReplyExpansion.kt:33)");
            }
            Modifier A09 = AbstractC118185Wd.A09(AbstractC118175Wb.A0C(C6HA.A00(C6HP.A00(modifier2, 0.0f, false), C05F.A0Y, true, true), 0.0f, 16.0f, 8.0f), 34.0f);
            Modifier A0N = AbstractC25225BEi.A0N(c5Tl, 370240382);
            if (interfaceC16820sZ != null) {
                C5XQ A0W = AbstractC25225BEi.A0W(0);
                boolean A1O = AbstractC25233BEq.A1O(c5Tl, 370243543, i4);
                Object EEc = c5Tl.EEc();
                if (A1O || EEc == C5UI.A00) {
                    EEc = AbstractC25230BEn.A0y(c5Tl, interfaceC16820sZ, 7);
                }
                AbstractC25225BEi.A1V(c5Tl, false);
                A0N = AbstractC118635Yc.A02(c5Tl, A0N, A0W, (InterfaceC16820sZ) EEc);
            }
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            Modifier A0G = AbstractC25227BEk.A0G(c117505Tk, A09, A0N);
            InterfaceC1127857k A0d = AbstractC25228BEl.A0d(c5Tl);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0G);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0d, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C6L0 c6l0 = C6L0.A00;
            AbstractC136726Hb.A01(c5Tl, AbstractC118185Wd.A02(C118195Wf.A09, AbstractC118185Wd.A0D(A0N, 60.0f)), c5Hc, ((i4 >> 9) & 14) | ((i4 >> 3) & 112), 0, z);
            C5WR.A0h(c5Tl, c6l0.A00(A0N), C5YD.A00(c5Tl, 2131953748), AbstractC25226BEj.A0M(c5Tl));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-831844878);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30233DTm(modifier2, interfaceC16820sZ, c5Hc, i, i2, i3, z);
        }
    }
}
