package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;

/* loaded from: classes5.dex */
public abstract class CLM {
    public static final void A00(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z) {
        int i2;
        C2DC A00;
        String A002;
        long A0F;
        C14360o3.A0B(interfaceC16820sZ, 0);
        c5Tl.Enr(-2073500664);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
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
                C0fH.A01(2117379739, "instagram.features.clips.spins.feedback.ui.ClipsSpinsReplyBottomSheetLikeIcon (ClipsSpinsReplyBottomSheetLikeIcon.kt:20)");
            }
            Modifier A0D = AbstractC118175Wb.A0D(Modifier.A00, 0.0f, 0.0f, 0.0f);
            boolean A1O = AbstractC25233BEq.A1O(c5Tl, -1321741589, i2);
            Object EEc = c5Tl.EEc();
            if (A1O || EEc == C5UI.A00) {
                EEc = C29888DGc.A00(interfaceC16820sZ, 37);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Modifier A06 = C5XR.A06(A0D, (InterfaceC16820sZ) EEc);
            InterfaceC1127857k A0f = AbstractC25228BEl.A0f(c5Tl, 0);
            int A003 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, A06);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A0f, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A003);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            if (z) {
                c5Tl.Eno(1002369787);
                A00 = C5Y7.A00(c5Tl, R.drawable.instagram_heart_pano_filled_24, 0);
                A002 = AbstractC136736Hc.A00(c5Tl, 2131965099);
                A0F = C5XL.A00(c5Tl).A0Q;
            } else {
                c5Tl.Eno(1002584152);
                A00 = C5Y7.A00(c5Tl, R.drawable.instagram_heart_pano_outline_24, 0);
                A002 = AbstractC136736Hc.A00(c5Tl, 2131976160);
                A0F = AbstractC25226BEj.A0F(c5Tl);
            }
            C5YS.A07(c5Tl, null, A00, null, A002, 0, 20, A0F);
            if (AbstractC25230BEn.A1U(c5Tl, A0K, false)) {
                C0fH.A00(-1209458241);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30502Dbl.A01(ASZ, interfaceC16820sZ, i, 18, z);
        }
    }
}
