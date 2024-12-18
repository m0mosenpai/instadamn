package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.R;

/* renamed from: X.CYs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28064CYs {
    public static final void A00(C5Tl c5Tl, Modifier modifier, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        C118125Vw A00;
        boolean A1R = AbstractC167007dF.A1R(0, modifier, interfaceC16660sJ);
        c5Tl.Enr(477367566);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & 91) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(64363060, "com.instagram.potato.reply.PotatoReplySheetFormField (PotatoReplySheetFormField.kt:37)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -1480412971);
            Object obj = C5UI.A00;
            C25338BJh c25338BJh = (C25338BJh) AbstractC25231BEo.A0l(c5Tl, A0q, obj);
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Object A0q2 = AbstractC25227BEk.A0q(c5Tl, -1480411561);
            if (A0q2 == obj) {
                A0q2 = AbstractC25232BEp.A0w(c5Tl, "");
            }
            InterfaceC74953Yl A0M = AbstractC25225BEi.A0M(A0K, A0q2, false);
            Modifier A0X = AbstractC25230BEn.A0X(modifier, c25338BJh);
            String A1D = AbstractC25226BEj.A1D(A0M);
            A00 = C118125Vw.A00(null, null, AbstractC25226BEj.A0g(c5Tl), null, null, null, 0, 0, 0, 6291454, AbstractC25226BEj.A0G(c5Tl), 0L, 0L, 0L);
            C6L4 c6l4 = new C6L4(C5XL.A00(c5Tl).A06);
            Object A0q3 = AbstractC25227BEk.A0q(c5Tl, -1480406759);
            if (A0q3 == obj) {
                A0q3 = new C57748Pjb(A0M, 14);
                c5Tl.FBy(A0q3);
            }
            AbstractC28411CgH.A02(c5Tl, A0X, c6l4, A00, A1D, AbstractC25225BEi.A1B(A0K, A0q3, false), C30713DfB.A00(c5Tl, A0M, interfaceC16660sJ, 17, 992086193), 0, A1R ? 1 : 0, 100663344, 196614, 15064, A1R);
            if (C0fH.A02()) {
                C0fH.A00(375291040);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30510Dbt.A01(ASZ, interfaceC16660sJ, modifier, i, 48);
        }
    }

    public static final void A01(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, boolean z) {
        int i3;
        boolean z2 = z;
        c5Tl.Enr(-2009886417);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = AbstractC25232BEp.A0b(c5Tl, z2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i3 & 91) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            z2 = AbstractC25226BEj.A1V(i4, z2);
            if (C0fH.A02()) {
                C0fH.A01(-1074375327, "com.instagram.potato.reply.GenerateButton (PotatoReplySheetFormField.kt:85)");
            }
            Alignment alignment = C118195Wf.A09;
            C1130158n c1130158n = Modifier.A00;
            Modifier A0X = AbstractC25226BEj.A0X(AbstractC25228BEl.A0X(CB8.A00(AbstractC118185Wd.A08(AbstractC118185Wd.A0D(c1130158n, 52.0f), 36.0f), AbstractC25230BEn.A00(z2 ? 1 : 0)), 44.0f), AbstractC25226BEj.A0F(c5Tl));
            boolean A1X = AbstractC25235BEs.A1X(c5Tl, 1646929462, i3);
            Object EEc = c5Tl.EEc();
            if (A1X || EEc == C5UI.A00) {
                EEc = new GSw(interfaceC16820sZ, 9);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Modifier A01 = AbstractC118635Yc.A01(c5Tl, A0X, null, null, (InterfaceC16820sZ) EEc, 6, z2);
            InterfaceC1127857k A00 = C5XX.A00(alignment, false);
            int A002 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, A01);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A00, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A012);
            C5YS.A05(c5Tl, AbstractC118185Wd.A04(c1130158n), C5Y7.A00(c5Tl, R.drawable.instagram_direct_pano_filled_24, 0), AbstractC25226BEj.A09(c5Tl));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-1304202728);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30215DSu(interfaceC16820sZ, i, i2, 6, z2);
        }
    }
}
