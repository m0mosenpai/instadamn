package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;

/* loaded from: classes5.dex */
public abstract class CE2 {
    public static final void A00(C5Tl c5Tl, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, boolean z) {
        int i3;
        Modifier modifier2 = modifier;
        C14360o3.A0B(interfaceC16820sZ, 1);
        c5Tl.Enr(-579012651);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0b(c5Tl, z) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, modifier2);
        }
        if ((i3 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(1083905708, "com.instagram.barcelona.feed.mediaviewer.ui.InstagramCta (InstagramCTA.kt:27)");
            }
            boolean A1P = AbstractC25233BEq.A1P(c5Tl, 2099754025, i3);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = AbstractC25235BEs.A12(c5Tl, interfaceC16820sZ, 23);
            }
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            Modifier A0E = AbstractC118175Wb.A0E(AnonymousClass598.A00(AbstractC25235BEs.A0I(c5Tl, c117505Tk, modifier2, (InterfaceC16820sZ) EEc), DLU.A00, true), 0.0f, 4.0f, 0.0f, 3.5f);
            InterfaceC1127857k A0f = AbstractC25228BEl.A0f(c5Tl, 0);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0E);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0f, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            c5Tl.Eno(1531060145);
            if (!z) {
                C5WR.A0L(c5Tl, null, null, C5YD.A00(c5Tl, 2131953686), 0, 32754, AbstractC25226BEj.A0H(c5Tl), AbstractC28461ChD.A00(c5Tl, AbstractC118155Vz.A01(15)));
            }
            C117505Tk.A0L(c117505Tk, false);
            int i5 = R.drawable.barcelona_external_outline_16;
            if (z) {
                i5 = R.drawable.instagram_app_instagram_pano_outline_16;
            }
            C2DC A002 = C5Y7.A00(c5Tl, i5, 0);
            String A003 = C5YD.A00(c5Tl, 2131953687);
            C1130158n c1130158n = Modifier.A00;
            float f = 8.0f;
            if (z) {
                f = 0.0f;
            }
            C5YS.A09(c5Tl, AbstractC118175Wb.A0E(c1130158n, f, 0.0f, 8.0f, 0.0f), A002, A003, C5XL.A00(c5Tl).A0U);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(52617212);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DTV(i, i2, 2, modifier2, interfaceC16820sZ, z);
        }
    }
}
