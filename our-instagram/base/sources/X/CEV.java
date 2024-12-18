package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;

/* loaded from: classes5.dex */
public abstract class CEV {
    public static final void A00(C5Tl c5Tl, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        Modifier modifier2 = modifier;
        C14360o3.A0B(interfaceC16820sZ, 0);
        c5Tl.Enr(825791415);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0c(c5Tl, z);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0d(c5Tl, z2);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0U(c5Tl, modifier2);
        }
        if ((i3 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-742515955, "com.instagram.barcelona.feed.post.ui.PostViewActivityRow (PostViewActivityRow.kt:31)");
            }
            InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
            InterfaceC118275Wp interfaceC118275Wp = AbstractC118255Wn.A00;
            Modifier A0Q = AbstractC25225BEi.A0Q(AbstractC118175Wb.A0D(C6HP.A00(modifier2, 0.0f, false), 12.0f, 13.0f, 13.0f));
            InterfaceC1127857k A00 = AbstractC118375Wz.A00(interfaceC118275Wp, c5Tl, interfaceC118225Wj);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0Q);
            InterfaceC16820sZ interfaceC16820sZ2 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ2);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A00, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            C6L0 c6l0 = C6L0.A00;
            c5Tl.Eno(1101413182);
            if (z) {
                String A003 = C5YD.A00(c5Tl, 2131953724);
                C5WR.A0U(c5Tl, c6l0.A00(Modifier.A00), AbstractC25226BEj.A0h(c5Tl), A003, AbstractC25226BEj.A0G(c5Tl));
            }
            C117505Tk.A0L(c117505Tk, false);
            c5Tl.Eno(1101424560);
            if (z2) {
                C1130158n c1130158n = Modifier.A00;
                c5Tl.Eno(1101427662);
                boolean A1S = AbstractC25235BEs.A1S(i3);
                Object EEc = c5Tl.EEc();
                if (A1S || EEc == C5UI.A00) {
                    EEc = new C50155MDi(interfaceC16820sZ, 21);
                    c5Tl.FBy(EEc);
                }
                Modifier A05 = C5XR.A05(c1130158n, null, null, AbstractC25225BEi.A1A(c117505Tk, EEc, false), true);
                InterfaceC1127857k A0V = AbstractC25225BEi.A0V(c5Tl, interfaceC118225Wj);
                int A004 = C5X2.A00(c5Tl);
                C59P A042 = C117505Tk.A04(c117505Tk);
                Modifier A012 = C5X3.A01(c5Tl, A05);
                AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ2);
                C5XJ.A00(c5Tl, A0V, interfaceC16620sF);
                if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A004);
                }
                C5XJ.A00(c5Tl, A012, A1K);
                C5WR.A0w(c5Tl, AbstractC25226BEj.A0c(c5Tl), C5YD.A00(c5Tl, 2131953733), AbstractC25226BEj.A0M(c5Tl));
                if (AbstractC25226BEj.A18(c5Tl) == AnonymousClass583.Rtl) {
                    c5Tl.Eno(94985500);
                    i4 = R.drawable.instagram_chevron_left_pano_outline_24;
                } else {
                    c5Tl.Eno(95104571);
                    i4 = R.drawable.instagram_chevron_right_pano_outline_24;
                }
                C2DC A005 = C5Y7.A00(c5Tl, i4, 0);
                C117505Tk.A0L(c117505Tk, false);
                AbstractC25230BEn.A18(c5Tl, AbstractC118185Wd.A0C(AbstractC118175Wb.A0E(c1130158n, 2.0f, 0.0f, 0.0f, 0.0f), 12.0f), A005);
                c5Tl.ASW();
            }
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(-439596925);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUE(interfaceC16820sZ, modifier2, i, i2, 1, z2, z);
        }
    }
}
