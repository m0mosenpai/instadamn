package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.wonderwall.model.WallInfo;

/* loaded from: classes5.dex */
public abstract class CZ4 {
    public static final void A00(C5Tl c5Tl, WallInfo wallInfo, C25883Bcj c25883Bcj, int i) {
        int i2;
        AbstractC167007dF.A1K(wallInfo, c25883Bcj);
        c5Tl.Enr(2001124565);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, wallInfo) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, c25883Bcj);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-290698803, "com.instagram.wonderwall.ui.compose.components.AddToWallPostCard (AddToWallCard.kt:34)");
            }
            C1130158n c1130158n = Modifier.A00;
            c5Tl.Eno(-681041789);
            boolean A1P = AbstractC167007dF.A1P(i2 & 112, 32) | AbstractC25228BEl.A1S(i2);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = C29895DGj.A00(c5Tl, c25883Bcj, wallInfo, 15);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            CKV.A00(c5Tl, AbstractC25225BEi.A0Q(CY3.A01(c5Tl, c1130158n, (InterfaceC16820sZ) EEc)), C5UA.A01(c5Tl, C30482DbR.A00(wallInfo, 27), 1795834272), 0.0f, DalvikInternals.IOPRIO_BACKGROUND, 14, false, false);
            if (C0fH.A02()) {
                C0fH.A00(-188277724);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30508Dbr.A01(ASZ, wallInfo, c25883Bcj, i, 24);
        }
    }

    public static final void A01(C5Tl c5Tl, WallInfo wallInfo, C25883Bcj c25883Bcj, int i) {
        int i2;
        boolean A1R = AbstractC167007dF.A1R(0, wallInfo, c25883Bcj);
        c5Tl.Enr(-1696395619);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, wallInfo) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, c25883Bcj);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1753882010, "com.instagram.wonderwall.ui.compose.components.AddToWallPostFloatingButton (AddToWallCard.kt:62)");
            }
            C1130158n c1130158n = Modifier.A00;
            c5Tl.Eno(-1991710517);
            boolean A1P = AbstractC167007dF.A1P(i2 & 112, 32) | AbstractC25228BEl.A1R(i2);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = C29895DGj.A00(c5Tl, c25883Bcj, wallInfo, 16);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Modifier A0C = AbstractC118185Wd.A0C(AbstractC118175Wb.A0E(CY3.A01(c5Tl, c1130158n, (InterfaceC16820sZ) EEc), 0.0f, 0.0f, 0.0f, 32.0f), 64.0f);
            C5WI c5wi = C5WF.A00;
            long j = AbstractC1132259k.A00;
            Modifier A01 = C6L3.A01(C6L7.A03(AbstractC28015CWn.A01(A0C, c5wi, 12.0f, j, j, A1R), c5wi, 0.0f, AbstractC25225BEi.A0D(c5Tl)), c5wi, AbstractC25226BEj.A06(c5Tl));
            InterfaceC1127857k A0a = AbstractC25226BEj.A0a(false);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, A01);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A0a, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A012);
            C5YS.A07(c5Tl, AbstractC118185Wd.A04(c1130158n), C5Y7.A00(c5Tl, R.drawable.instagram_add_pano_filled_24, 0), null, AbstractC136736Hc.A00(c5Tl, 2131952265), 384, 24, 0L);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-1352546330);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30508Dbr.A01(ASZ, wallInfo, c25883Bcj, i, 25);
        }
    }
}
