package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.DalvikInternals;

/* loaded from: classes5.dex */
public abstract class CK5 {
    public static final void A00(InterfaceC16820sZ interfaceC16820sZ, C5Tl c5Tl, int i) {
        int i2;
        C14360o3.A0B(interfaceC16820sZ, 0);
        c5Tl.Enr(-755601254);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-989214620, "com.instagram.schools.channels.ui.SchoolChannelCreationNuxComponent (SchoolChannelCreationNuxComponent.kt:24)");
            }
            Modifier A0T = AbstractC25226BEj.A0T(Modifier.A00);
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0T);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0Y, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            AbstractC28504Chx.A02(c5Tl, A0T, new C26181Bi6(R.drawable.instagram_illustrations_product_illustration_pi_plus_conversation, 144.0f), null, C5YD.A00(c5Tl, 2131972912), 24624, 4068);
            AbstractC28474ChS.A03(c5Tl, C5Y7.A00(c5Tl, R.drawable.instagram_users_pano_outline_24, 0), C26178Bi3.A00(c5Tl, C5YD.A00(c5Tl, 2131972907), 2131972906), 64, 4, false);
            AbstractC28474ChS.A03(c5Tl, C5Y7.A00(c5Tl, R.drawable.instagram_report_pano_outline_24, 0), C26178Bi3.A00(c5Tl, C5YD.A00(c5Tl, 2131972909), 2131972908), 64, 4, false);
            AbstractC28474ChS.A03(c5Tl, C5Y7.A00(c5Tl, R.drawable.instagram_reactions_pano_outline_24, 0), C26178Bi3.A00(c5Tl, C5YD.A00(c5Tl, 2131972911), 2131972910), 64, 4, false);
            C6GE.A00(null, c5Tl, AbstractC118185Wd.A05(AbstractC118175Wb.A09(A0T, 4.0f), 44.0f), null, null, AbstractC25225BEi.A0u(c5Tl), C5YD.A00(c5Tl, 2131956982), interfaceC16820sZ, (i2 & 14) | DalvikInternals.IOPRIO_BACKGROUND, 456, true, false);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1311142275);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30497Dbg.A01(ASZ, interfaceC16820sZ, i, 38);
        }
    }
}
