package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.DalvikInternals;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class CY9 {
    public static final void A01(C5Tl c5Tl, C7U c7u, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        AbstractC167007dF.A1K(c7u, interfaceC16660sJ);
        c5Tl.Enr(-2011027742);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c7u) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1991568963, "com.instagram.creation.drafts.ui.DraftActionBar (DraftActionBar.kt:34)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 722368898);
            Object obj = C5UI.A00;
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) AbstractC25234BEr.A0c(c5Tl, A0q, obj, false);
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C1130158n c1130158n = Modifier.A00;
            Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, A0T);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A0Y, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C6GM c6gm = C6GM.A00;
            C25707BXs c25707BXs = new C25707BXs(null, 7, 0);
            String A002 = C5YD.A00(c5Tl, 2131961169);
            Modifier A0y = AbstractC25232BEp.A0y(c5Tl, c1130158n);
            C2DC A003 = C5Y7.A00(c5Tl, R.drawable.instagram_settings_pano_filled_24, 0);
            Object A0q2 = AbstractC25227BEk.A0q(c5Tl, 1246809145);
            if (A0q2 == obj) {
                A0q2 = AbstractC25235BEs.A16(c5Tl, interfaceC74953Yl, 14);
            }
            AbstractC25708BXt.A02(c5Tl, A0y, c25707BXs, A002, C26184Bi9.A00(A003, null, AbstractC25225BEi.A1A(A0K, A0q2, false)), 6, 24);
            boolean A1X = AbstractC25230BEn.A1X(interfaceC74953Yl);
            Object A0q3 = AbstractC25227BEk.A0q(c5Tl, 1246815418);
            if (A0q3 == obj) {
                A0q3 = new C50166MDt(interfaceC74953Yl, 15);
                c5Tl.FBy(A0q3);
            }
            A00(c6gm, c5Tl, c7u, AbstractC25225BEi.A1A(A0K, A0q3, false), interfaceC16660sJ, 3078 | ((i2 << 3) & 112) | ((i2 << 9) & 57344), A1X);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-709190658);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30507Dbq.A01(ASZ, interfaceC16660sJ, c7u, i, 37);
        }
    }

    public static final void A00(C6GN c6gn, C5Tl c5Tl, C7U c7u, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, int i, boolean z) {
        int i2;
        c5Tl.Enr(109376145);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c6gn) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, c7u);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0d(c5Tl, z);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-421383554, "com.instagram.creation.drafts.ui.DraftFilterContextMenu (DraftActionBar.kt:64)");
            }
            boolean z2 = false;
            List A1Q = AbstractC16960so.A1Q(C7U.A03, C7U.A05, C7U.A06, C7U.A04);
            Modifier A0D = AbstractC118175Wb.A0D(c6gn.AB6(C118195Wf.A01, Modifier.A00), 0.0f, 0.0f, 0.0f);
            boolean A1R = AbstractC25233BEq.A1R(c5Tl, -1652744591, i2);
            if ((57344 & i2) == 16384) {
                z2 = true;
            }
            boolean z3 = z2 | A1R;
            Object EEc = c5Tl.EEc();
            if (z3 || EEc == C5UI.A00) {
                EEc = C30172DRc.A00(c5Tl, A1Q, interfaceC16820sZ, interfaceC16660sJ, 28);
            }
            CY0.A00(null, c5Tl, A0D, null, interfaceC16820sZ, (InterfaceC16660sJ) EEc, new C30485DbU(35, c7u, A1Q), ((i2 >> 3) & 896) | ((i2 << 3) & 7168), 240, 0L, z, AbstractC25228BEl.A1W(c5Tl));
            if (C0fH.A02()) {
                C0fH.A00(1950015201);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUK(i, 1, c6gn, c7u, interfaceC16820sZ, interfaceC16660sJ, z);
        }
    }
}
