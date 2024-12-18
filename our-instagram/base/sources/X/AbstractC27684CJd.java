package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;

/* renamed from: X.CJd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27684CJd {
    public static final void A00(C5Tl c5Tl, InterfaceC16660sJ interfaceC16660sJ, int i, boolean z) {
        int i2;
        c5Tl.Enr(-457346335);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16660sJ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0c(c5Tl, z);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-473738084, "com.instagram.opal.impl.ui.OpalProfilePicSelectorContent (OpalProfilePicSelectorFragment.kt:136)");
            }
            C118055Vp c118055Vp = new C118055Vp(C5XL.A00(c5Tl).A0C);
            Modifier A0W = AbstractC25228BEl.A0W();
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0W);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0Y, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            String A002 = AbstractC136736Hc.A00(c5Tl, 2131969063);
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -207244978);
            Object obj = C5UI.A00;
            C5XO c5xo = (C5XO) AbstractC25232BEp.A1C(c5Tl, A0q, obj);
            C117505Tk.A0L(c117505Tk, false);
            c5Tl.Eno(-207241541);
            int i3 = i2 & 14;
            boolean A1P = AbstractC167007dF.A1P(i3, 4);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == obj) {
                EEc = DH3.A02(c5Tl, interfaceC16660sJ, 45);
            }
            AbstractC25705BXp.A0A(c5Tl, C5XR.A02(c118055Vp, c5xo, A0W, AbstractC25225BEi.A1A(c117505Tk, EEc, false)), C5Y7.A00(c5Tl, R.drawable.instagram_user_circle_pano_outline_24, 0), A002);
            String A003 = AbstractC136736Hc.A00(c5Tl, 2131969047);
            C5XO c5xo2 = (C5XO) AbstractC25234BEr.A0Z(c5Tl, obj, -207228786);
            C117505Tk.A0L(c117505Tk, false);
            boolean A1U = AbstractC25232BEp.A1U(c5Tl, -207225350, i3, 4);
            Object EEc2 = c5Tl.EEc();
            if (A1U || EEc2 == obj) {
                EEc2 = DH3.A02(c5Tl, interfaceC16660sJ, 46);
            }
            AbstractC25705BXp.A0A(c5Tl, C5XR.A02(c118055Vp, c5xo2, A0W, AbstractC25225BEi.A1A(c117505Tk, EEc2, false)), C5Y7.A00(c5Tl, R.drawable.instagram_photo_pano_outline_24, 0), A003);
            c5Tl.Eno(-207218123);
            if (z) {
                String A004 = AbstractC136736Hc.A00(c5Tl, 2131969068);
                C5XO c5xo3 = (C5XO) AbstractC25234BEr.A0Z(c5Tl, obj, -207211282);
                C117505Tk.A0L(c117505Tk, false);
                boolean A1S = AbstractC25229BEm.A1S(c5Tl, -207207717, i3, 4);
                Object EEc3 = c5Tl.EEc();
                if (A1S || EEc3 == obj) {
                    EEc3 = DH3.A01(c5Tl, interfaceC16660sJ, 47);
                }
                AbstractC25705BXp.A0A(c5Tl, C5XR.A02(c118055Vp, c5xo3, A0W, AbstractC25225BEi.A1A(c117505Tk, EEc3, false)), C5Y7.A00(c5Tl, R.drawable.instagram_delete_pano_outline_24, 0), A004);
            }
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(-1418244255);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30502Dbl.A01(ASZ, interfaceC16660sJ, i, 14, z);
        }
    }
}
