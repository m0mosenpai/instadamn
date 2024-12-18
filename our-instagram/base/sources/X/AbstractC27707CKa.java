package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.instagram.wonderwall.model.WallPostInfo;
import com.instagram.wonderwall.model.WallPostItem;

/* renamed from: X.CKa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27707CKa {
    public static final void A00(C5Tl c5Tl, WallPostItem wallPostItem, InterfaceC31065Dl7 interfaceC31065Dl7, int i, int i2) {
        int i3;
        boolean z;
        long j;
        InterfaceC31065Dl7 interfaceC31065Dl72 = interfaceC31065Dl7;
        C14360o3.A0B(wallPostItem, 0);
        c5Tl.Enr(1750034128);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, wallPostItem) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, interfaceC31065Dl72);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                interfaceC31065Dl72 = null;
            }
            if (C0fH.A02()) {
                C0fH.A01(-1473146104, "com.instagram.wonderwall.ui.compose.components.WallUFI (WallUFI.kt:26)");
            }
            WallPostInfo Bez = wallPostItem.Bez();
            AbstractC12990ll A0d = AbstractC25229BEm.A0d(c5Tl);
            boolean A1Z = AbstractC25232BEp.A1Z(c5Tl, A0d, Bez, 302642834);
            Object EEc = c5Tl.EEc();
            if (A1Z || EEc == C5UI.A00) {
                if (!C18U.A06(AbstractC25225BEi.A0j(A0d, 0), A0d, 36322297904834680L) || (Bez.A0B && Bez.A04.A03)) {
                    z = false;
                } else {
                    z = true;
                }
                EEc = AbstractC25227BEk.A0j(c5Tl, z);
            }
            boolean A1a = AbstractC166987dD.A1a(EEc);
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A0V = AbstractC25225BEi.A0V(c5Tl, interfaceC118225Wj);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A0V, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            c5Tl.Eno(-756903921);
            if (A1a) {
                Modifier A03 = AbstractC118185Wd.A03(AbstractC25227BEk.A0I(c1130158n, 8.0f));
                boolean A1Y = AbstractC25234BEr.A1Y(c5Tl, -756899388, i3) | AbstractC25233BEq.A1H(i3);
                Object EEc2 = c5Tl.EEc();
                if (A1Y || EEc2 == C5UI.A00) {
                    EEc2 = C29895DGj.A00(c5Tl, interfaceC31065Dl72, wallPostItem, 21);
                }
                C5YS.A07(c5Tl, C5XR.A05(A03, null, null, AbstractC25225BEi.A1A(A0K, EEc2, false), true), C5Y7.A00(c5Tl, R.drawable.instagram_reply_pano_outline_24, 0), null, AbstractC136736Hc.A00(c5Tl, 2131971274), 0, 24, 0L);
            }
            C117505Tk.A0L(A0K, false);
            Modifier A032 = AbstractC118185Wd.A03(c1130158n);
            boolean A1V = AbstractC25228BEl.A1V(c5Tl, Bez, AbstractC25234BEr.A1Y(c5Tl, -756888003, i3), AbstractC25235BEs.A1S(i3));
            Object EEc3 = c5Tl.EEc();
            if (A1V || EEc3 == C5UI.A00) {
                EEc3 = new C43210J8h(43, wallPostItem, Bez, interfaceC31065Dl72);
                c5Tl.FBy(EEc3);
            }
            Modifier A0T = AbstractC25229BEm.A0T(A0K, A032, EEc3);
            boolean z2 = Bez.A0A;
            int i5 = R.drawable.instagram_heart_pano_outline_24;
            if (z2) {
                i5 = R.drawable.instagram_heart_pano_filled_24;
            }
            C2DC A002 = C5Y7.A00(c5Tl, i5, 0);
            int i6 = 2131965099;
            if (z2) {
                i6 = 2131965112;
            }
            String A003 = AbstractC136736Hc.A00(c5Tl, i6);
            if (z2) {
                j = AbstractC25227BEk.A0g(c5Tl, -756870890).A0Q;
            } else {
                j = AbstractC25227BEk.A0g(c5Tl, -756869866).A0n;
            }
            C117505Tk.A0L(A0K, false);
            C5YS.A09(c5Tl, A0T, A002, A003, j);
            CKY.A00(c5Tl, null, Bez, null, 0, 62, false, false, false);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1217726228);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30504Dbn.A01(interfaceC31065Dl72, wallPostItem, i2, i, 43);
        }
    }
}
