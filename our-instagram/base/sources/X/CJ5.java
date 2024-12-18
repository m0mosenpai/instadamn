package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;

/* loaded from: classes5.dex */
public abstract class CJ5 {
    public static final void A00(InterfaceC16820sZ interfaceC16820sZ, C5Tl c5Tl, int i) {
        int i2;
        C14360o3.A0B(interfaceC16820sZ, 0);
        c5Tl.Enr(959133184);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1397745190, "com.instagram.friendmap.view.compose.FriendMapNotesWithLocationNux (FriendMapNotesWithLocationNux.kt:23)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
            InterfaceC1127857k A0e = AbstractC25228BEl.A0e(c5Tl);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0T);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0e, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C6LQ.A05(c5Tl, A0T, C5Y7.A00(c5Tl, R.drawable.friend_map_notes_illo_friend_map_notes, 0));
            String A002 = AbstractC136736Hc.A00(c5Tl, 2131962902);
            C5WR.A0Z(c5Tl, AbstractC118175Wb.A0E(c1130158n, C5XT.A02(c5Tl, R.dimen.action_button_min_width), C5XT.A01(c5Tl), C5XT.A02(c5Tl, R.dimen.action_button_min_width), 0.0f), AbstractC28417CgO.A00(c5Tl), A002, AbstractC25226BEj.A0G(c5Tl));
            AbstractC28474ChS.A02(c5Tl, C5Y7.A00(c5Tl, R.drawable.instagram_content_note_add_pano_outline_24, 0), new C26178Bi3(AbstractC136736Hc.A00(c5Tl, 2131962895), AbstractC136736Hc.A00(c5Tl, 2131962899)));
            AbstractC28474ChS.A05(c5Tl, new C26178Bi3(AbstractC136736Hc.A00(c5Tl, 2131962896), AbstractC136736Hc.A00(c5Tl, 2131962900)), R.drawable.instagram_users_pano_outline_24);
            AbstractC28474ChS.A05(c5Tl, new C26178Bi3(AbstractC136736Hc.A00(c5Tl, 2131962897), AbstractC136736Hc.A00(c5Tl, 2131962901)), R.drawable.instagram_location_arrow_pano_outline_24);
            c5Tl.ASW();
            C0eB c0eB = C0eB.A00;
            boolean A1O = AbstractC25233BEq.A1O(c5Tl, 532035291, i2);
            Object EEc = c5Tl.EEc();
            if (A1O || EEc == C5UI.A00) {
                EEc = new MC2(interfaceC16820sZ, null, 40);
                c5Tl.FBy(EEc);
            }
            if (AbstractC25232BEp.A1V(c5Tl, c117505Tk, EEc, c0eB, false)) {
                C0fH.A00(1832650568);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30497Dbg.A01(ASZ, interfaceC16820sZ, i, 21);
        }
    }
}
