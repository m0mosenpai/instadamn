package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;

/* renamed from: X.CFm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27593CFm {
    public static final void A00(C5Tl c5Tl, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, boolean z) {
        int i3;
        C117505Tk c117505Tk;
        C14360o3.A0B(interfaceC16820sZ, 2);
        c5Tl.Enr(1511285013);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, modifier) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= AbstractC25232BEp.A0c(c5Tl, z);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ);
        }
        if ((i3 & 731) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-1311561107, "com.instagram.comments.mvvm.view.compose.EmptyComments (EmptyComments.kt:25)");
            }
            if (z) {
                c5Tl.Eno(-2043366774);
                Modifier A0Q = AbstractC25225BEi.A0Q(modifier);
                InterfaceC1127857k A0a = AbstractC25226BEj.A0a(false);
                int A00 = C5X2.A00(c5Tl);
                c117505Tk = (C117505Tk) c5Tl;
                C59P A04 = C117505Tk.A04(c117505Tk);
                Modifier A01 = C5X3.A01(c5Tl, A0Q);
                AbstractC25233BEq.A11(c5Tl, c117505Tk);
                AbstractC25231BEo.A12(c5Tl, A0a, A04);
                InterfaceC16620sF interfaceC16620sF = C5X8.A02;
                if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
                }
                AbstractC25225BEi.A1K(c5Tl, A01);
                C2DC A002 = C5Y7.A00(c5Tl, R.drawable.loadmore_icon_refresh_compound, 0);
                Modifier A0W = AbstractC25226BEj.A0W(Modifier.A00);
                c5Tl.Eno(293506427);
                boolean A1M = AbstractC25231BEo.A1M(i3);
                Object EEc = c5Tl.EEc();
                if (A1M || EEc == C5UI.A00) {
                    EEc = new C29906DGu(interfaceC16820sZ, 20);
                    c5Tl.FBy(EEc);
                }
                C6LQ.A0C(c5Tl, AbstractC25229BEm.A0T(c117505Tk, A0W, EEc), A002, C5YD.A00(c5Tl, 2131972101), 8);
            } else {
                c5Tl.Eno(-2043012847);
                Modifier A08 = AbstractC118175Wb.A08(AbstractC25225BEi.A0Q(modifier), 36.0f);
                InterfaceC1127857k A0a2 = AbstractC25226BEj.A0a(false);
                int A003 = C5X2.A00(c5Tl);
                c117505Tk = (C117505Tk) c5Tl;
                C59P A042 = C117505Tk.A04(c117505Tk);
                Modifier A012 = C5X3.A01(c5Tl, A08);
                AbstractC25233BEq.A11(c5Tl, c117505Tk);
                AbstractC25231BEo.A12(c5Tl, A0a2, A042);
                InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
                if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
                }
                AbstractC25225BEi.A1K(c5Tl, A012);
                AbstractC28504Chx.A0B(c5Tl, C5YD.A00(c5Tl, 2131956501), C5YD.A00(c5Tl, 2131956500));
            }
            c5Tl.ASW();
            if (AbstractC25227BEk.A1b(c117505Tk, false)) {
                C0fH.A00(151534071);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DTV(i, i2, 4, modifier, interfaceC16820sZ, z);
        }
    }
}
