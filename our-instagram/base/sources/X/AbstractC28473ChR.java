package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.List;

/* renamed from: X.ChR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28473ChR {
    public static final void A05(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z) {
        int i2;
        C5UU ASZ;
        int i3 = 1;
        C14360o3.A0B(interfaceC16820sZ, 1);
        c5Tl.Enr(1723265713);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0b(c5Tl, z) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(304792522, "com.instagram.aistudio.home.view.CreateAiRow (AiSearchFragment.kt:398)");
            }
            c5Tl.Eno(2076646915);
            if (!z) {
                C1130158n c1130158n = Modifier.A00;
                InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
                int A00 = C5X2.A00(c5Tl);
                C117505Tk c117505Tk = (C117505Tk) c5Tl;
                C59P A04 = C117505Tk.A04(c117505Tk);
                Modifier A01 = C5X3.A01(c5Tl, c1130158n);
                AbstractC25233BEq.A11(c5Tl, c117505Tk);
                AbstractC25231BEo.A12(c5Tl, A0b, A04);
                InterfaceC16620sF interfaceC16620sF = C5X8.A02;
                if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
                }
                AbstractC25225BEi.A1K(c5Tl, A01);
                c5Tl.ASW();
                if (AbstractC25227BEk.A1b(c117505Tk, false)) {
                    C0fH.A00(1957348719);
                }
                ASZ = c5Tl.ASZ();
                if (ASZ == null) {
                    return;
                }
                C30502Dbl.A01(ASZ, interfaceC16820sZ, i, i3, z);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
            C1130158n c1130158n2 = Modifier.A00;
            Modifier A09 = AbstractC118175Wb.A09(AbstractC25226BEj.A0T(c1130158n2), 4.0f);
            boolean A1Y = AbstractC25234BEr.A1Y(c5Tl, 2076653767, i2);
            Object EEc = c5Tl.EEc();
            if (A1Y || EEc == C5UI.A00) {
                EEc = DGX.A00(interfaceC16820sZ, 49);
                c5Tl.FBy(EEc);
            }
            Modifier A05 = C5XR.A05(A09, null, null, AbstractC25225BEi.A1A(A0K, EEc, false), true);
            InterfaceC1127857k A02 = AbstractC118375Wz.A02(AbstractC118255Wn.A01, c5Tl, interfaceC118225Wj, 48);
            int A002 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, A05);
            InterfaceC16820sZ interfaceC16820sZ2 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ2);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A02, A042, interfaceC16620sF2);
            InterfaceC16620sF interfaceC16620sF3 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A002);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A012);
            C6L0 c6l0 = C6L0.A00;
            Modifier A08 = AbstractC118175Wb.A08(c1130158n2, 4.0f);
            Alignment alignment = C118195Wf.A0E;
            InterfaceC1127857k A003 = C5XX.A00(alignment, false);
            int A004 = C5X2.A00(c5Tl);
            C59P A043 = C117505Tk.A04(A0K);
            Modifier A013 = C5X3.A01(c5Tl, A08);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ2);
            C5XJ.A00(c5Tl, A003, interfaceC16620sF2);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A043, A0q) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A004);
            }
            C5XJ.A00(c5Tl, A013, A1K);
            Modifier A0X = AbstractC25226BEj.A0X(AbstractC25231BEo.A0R(c1130158n2, 56.0f), AbstractC25225BEi.A0D(c5Tl));
            InterfaceC1127857k A005 = C5XX.A00(alignment, false);
            int A006 = C5X2.A00(c5Tl);
            C59P A044 = C117505Tk.A04(A0K);
            Modifier A014 = C5X3.A01(c5Tl, A0X);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ2);
            C5XJ.A00(c5Tl, A005, interfaceC16620sF2);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A044, A0q) || !AbstractC25231BEo.A1O(c5Tl, A006)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A006);
            }
            C5XJ.A00(c5Tl, A014, A1K);
            C119645bN c119645bN = C119645bN.A00;
            C5YS.A06(c5Tl, AbstractC25225BEi.A0P(c119645bN, c1130158n2), C5Y7.A00(c5Tl, R.drawable.instagram_add_pano_outline_24, 0), AbstractC25226BEj.A0F(c5Tl));
            c5Tl.ASW();
            c5Tl.ASW();
            Modifier A052 = AbstractC118175Wb.A05(c6l0.A00(c1130158n2));
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A007 = C5X2.A00(c5Tl);
            C59P A045 = C117505Tk.A04(A0K);
            Modifier A015 = C5X3.A01(c5Tl, A052);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ2);
            C5XJ.A00(c5Tl, A0Y, interfaceC16620sF2);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A045, A0q) || !AbstractC25231BEo.A1O(c5Tl, A007)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A007);
            }
            C5XJ.A00(c5Tl, A015, A1K);
            C5WR.A0j(c5Tl, AbstractC25226BEj.A0h(c5Tl), C5YD.A00(c5Tl, 2131952650));
            C5WR.A0u(c5Tl, AbstractC25226BEj.A0c(c5Tl), C5YD.A00(c5Tl, 2131952649), AbstractC25226BEj.A0M(c5Tl));
            c5Tl.ASW();
            C5YS.A01(c5Tl, null, C5Y7.A00(c5Tl, R.drawable.instagram_chevron_right_pano_outline_12, 0), 48, 28, 0L);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1224394674);
            }
        }
        ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            i3 = 2;
            C30502Dbl.A01(ASZ, interfaceC16820sZ, i, i3, z);
        }
    }

    public static final void A00(C5Tl c5Tl, int i) {
        c5Tl.Enr(-1443878421);
        if (i == 0 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1444305512, "com.instagram.aistudio.home.view.SearchResultShimmer (AiSearchFragment.kt:338)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A0A = AbstractC118175Wb.A0A(AbstractC25226BEj.A0T(c1130158n), 16.0f, 0.0f);
            InterfaceC118305Ws interfaceC118305Ws = AbstractC118255Wn.A07;
            InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A02;
            InterfaceC1127857k A02 = AbstractC119595bH.A02(interfaceC118305Ws, c5Tl, interfaceC118245Wl, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0A);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A02, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            c5Tl.Eno(1528587604);
            int i2 = 0;
            do {
                Modifier A0E = AbstractC118175Wb.A0E(c1130158n, 0.0f, 0.0f, 0.0f, 16.0f);
                InterfaceC1127857k A0d = AbstractC25228BEl.A0d(c5Tl);
                int A002 = C5X2.A00(c5Tl);
                C59P A042 = C117505Tk.A04(c117505Tk);
                Modifier A012 = C5X3.A01(c5Tl, A0E);
                AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
                C5XJ.A00(c5Tl, A0d, interfaceC16620sF);
                if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
                }
                C5XJ.A00(c5Tl, A012, A1K);
                C6L0 c6l0 = C6L0.A00;
                AbstractC28487Chf.A07(c5Tl, AbstractC118185Wd.A0C(c1130158n, 56.0f), C5WF.A00);
                Modifier A0B = AbstractC118175Wb.A0B(c6l0.A00(c1130158n), 0.0f, 0.0f, 0.0f);
                InterfaceC1127857k A022 = AbstractC119595bH.A02(interfaceC118305Ws, c5Tl, interfaceC118245Wl, 0);
                int A003 = C5X2.A00(c5Tl);
                C59P A043 = C117505Tk.A04(c117505Tk);
                Modifier A013 = C5X3.A01(c5Tl, A0B);
                AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
                C5XJ.A00(c5Tl, A022, interfaceC16620sF);
                if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A043, A0q) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
                }
                C5XJ.A00(c5Tl, A013, A1K);
                AbstractC28487Chf.A05(c5Tl, AbstractC118185Wd.A07(AbstractC25228BEl.A0X(AbstractC118175Wb.A0E(AbstractC118185Wd.A08(c1130158n, 18.0f), 0.0f, 0.0f, 0.0f, 8.0f), 8.0f), 0.3f));
                AbstractC28487Chf.A07(c5Tl, AbstractC118185Wd.A07(AbstractC118185Wd.A08(c1130158n, 14.0f), 0.5f), C5WF.A01(8.0f));
                c5Tl.ASW();
                c5Tl.ASW();
                i2++;
            } while (i2 < 3);
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(1521153811);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30494Dbd.A01(ASZ, i, 10);
        }
    }

    public static final void A01(C5Tl c5Tl, Modifier modifier, C28370CfW c28370CfW, String str, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, int i) {
        int i2;
        c5Tl.Enr(642250153);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, str);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16660sJ);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16660sJ2);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, c28370CfW);
        }
        if ((i2 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(45080485, "com.instagram.aistudio.home.view.AiHomeSearchBarSection (AiSearchFragment.kt:312)");
            }
            CXP.A01(c5Tl, c28370CfW, "search", ((i2 >> 12) & 14) | 48);
            c5Tl.Eno(-997521226);
            boolean z = true;
            boolean A1P = AbstractC167007dF.A1P(i2 & 112, 32) | AbstractC167007dF.A1P(i2 & 896, 256);
            if ((i2 & 7168) != 2048) {
                z = false;
            }
            boolean z2 = A1P | z;
            Object EEc = c5Tl.EEc();
            if (z2 || EEc == C5UI.A00) {
                EEc = AbstractC25229BEm.A11(c5Tl, interfaceC16660sJ2, interfaceC16660sJ, str, 6);
            }
            AbstractC28450Cgz.A02(c5Tl, modifier, (InterfaceC16660sJ) EEc, DKO.A00, ((i2 << 3) & 112) | 384, AbstractC25228BEl.A1W(c5Tl) ? 1 : 0);
            if (C0fH.A02()) {
                C0fH.A00(1864668815);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUT(modifier, interfaceC16660sJ, interfaceC16660sJ2, c28370CfW, str, i, 0);
        }
    }

    public static final void A02(C5Tl c5Tl, C51734MtH c51734MtH, C28370CfW c28370CfW, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16620sF interfaceC16620sF, int i) {
        int i2;
        c5Tl.Enr(-1654941014);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c51734MtH) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, str);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, c28370CfW);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16660sJ);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16660sJ2);
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25232BEp.A0M(c5Tl, interfaceC16820sZ);
        }
        if ((1572864 & i) == 0) {
            i2 |= AbstractC25232BEp.A0N(c5Tl, interfaceC16620sF);
        }
        if ((i & 12582912) == 0) {
            i2 |= AbstractC25232BEp.A0O(c5Tl, interfaceC16820sZ2);
        }
        if ((i2 & 4793491) == 4793490 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1345944317, "com.instagram.aistudio.home.view.SearchLayout (AiSearchFragment.kt:191)");
            }
            c5Tl.Eno(1472860245);
            boolean z = true;
            boolean A1U = AbstractC25228BEl.A1U(c5Tl, c51734MtH, AbstractC25228BEl.A1U(c5Tl, c28370CfW, AbstractC167007dF.A1P(i2 & 112, 32) | AbstractC167007dF.A1P(i2 & 7168, C3OO.FLAG_MOVED), AbstractC25234BEr.A1W(i2)), AbstractC25234BEr.A1T(i2)) | AbstractC25234BEr.A1V(i2);
            if ((i2 & 3670016) != 1048576) {
                z = false;
            }
            boolean z2 = A1U | z;
            Object EEc = c5Tl.EEc();
            if (z2 || EEc == C5UI.A00) {
                EEc = new DIJ(c51734MtH, c28370CfW, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16660sJ, interfaceC16660sJ2, interfaceC16620sF, str, 0);
                c5Tl.FBy(EEc);
            }
            AbstractC25228BEl.A1O(c5Tl);
            C6IS.A08(c5Tl, (InterfaceC16660sJ) EEc);
            if (C0fH.A02()) {
                C0fH.A00(534391795);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DWT(c51734MtH, c28370CfW, interfaceC16660sJ, interfaceC16660sJ2, interfaceC16820sZ, interfaceC16620sF, interfaceC16820sZ2, str, i, 0);
        }
    }

    public static final void A03(C5Tl c5Tl, C51734MtH c51734MtH, InterfaceC16820sZ interfaceC16820sZ, int i) {
        int i2;
        c5Tl.Enr(-1246989234);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c51734MtH) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-796772792, "com.instagram.aistudio.home.view.MaybeShowSearchNoResults (AiSearchFragment.kt:270)");
            }
            if (((List) c51734MtH.A01).isEmpty()) {
                C1130158n c1130158n = Modifier.A00;
                Modifier A08 = AbstractC118175Wb.A08(AbstractC25226BEj.A0T(c1130158n), 24.0f);
                InterfaceC1127857k A0P = AbstractC25235BEs.A0P(c5Tl);
                int A00 = C5X2.A00(c5Tl);
                C117505Tk c117505Tk = (C117505Tk) c5Tl;
                C59P A04 = C117505Tk.A04(c117505Tk);
                Modifier A01 = C5X3.A01(c5Tl, A08);
                AbstractC25233BEq.A11(c5Tl, c117505Tk);
                AbstractC25231BEo.A12(c5Tl, A0P, A04);
                InterfaceC16620sF interfaceC16620sF = C5X8.A02;
                if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
                }
                AbstractC25225BEi.A1K(c5Tl, A01);
                C6LQ.A0A(c5Tl, AbstractC118185Wd.A0C(AbstractC118175Wb.A08(c1130158n, 16.0f), 100.0f), C5Y7.A00(c5Tl, R.drawable.ig_illustrations_illo_search_no_results_refresh, 0), C5YJ.A03, 25008, 104);
                String A002 = C5YD.A00(c5Tl, 2131952653);
                long A0G = AbstractC25226BEj.A0G(c5Tl);
                C5WR.A0Y(c5Tl, AbstractC118175Wb.A08(c1130158n, 16.0f), AbstractC25226BEj.A0e(c5Tl), A002, A0G);
                boolean z = c51734MtH.A06;
                int i3 = 2131952652;
                if (z) {
                    i3 = 2131952651;
                }
                String A003 = C5YD.A00(c5Tl, i3);
                long A0M = AbstractC25226BEj.A0M(c5Tl);
                C5WR.A0Y(c5Tl, AbstractC118175Wb.A08(c1130158n, 16.0f), AbstractC25226BEj.A0c(c5Tl), A003, A0M);
                c5Tl.Eno(-445331021);
                if (z) {
                    C6GE.A05(c5Tl, AbstractC118175Wb.A0E(c1130158n, 0.0f, 16.0f, 0.0f, 0.0f), AbstractC25235BEs.A0c(c5Tl, false), C5YD.A00(c5Tl, 2131952650), interfaceC16820sZ, ((i2 >> 3) & 14) | 1573248);
                }
                C117505Tk.A0L(c117505Tk, false);
                c5Tl.ASW();
            }
            if (C0fH.A02()) {
                C0fH.A00(-1493397660);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30507Dbq.A01(ASZ, c51734MtH, interfaceC16820sZ, i, 16);
        }
    }

    public static final void A04(C5Tl c5Tl, C26017Bf6 c26017Bf6, C28370CfW c28370CfW, InterfaceC16620sF interfaceC16620sF, int i, int i2) {
        int i3;
        C117505Tk c117505Tk;
        boolean z;
        String A17;
        c5Tl.Enr(-1912878279);
        if ((i2 & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, c26017Bf6) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= AbstractC25232BEp.A09(c5Tl, i);
        }
        if ((i2 & 384) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, c28370CfW);
        }
        if ((i2 & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16620sF);
        }
        if ((i3 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-251482599, "com.instagram.aistudio.home.view.SearchResult (AiSearchFragment.kt:372)");
            }
            int i4 = i3 & 112;
            CXP.A00(c5Tl, c26017Bf6, c28370CfW, i, ((i3 >> 6) & 14) | i4 | ((i3 << 6) & 896));
            if (C18U.A06(C06090Tz.A05, AbstractC25229BEm.A0d(c5Tl), 36325081044497095L)) {
                c5Tl.Eno(-2024432006);
                C2DB A00 = AbstractC43541zP.A00(c5Tl, new SimpleImageUrl(AbstractC25225BEi.A0t(c26017Bf6.A05)));
                boolean z2 = true;
                Modifier A0L = AbstractC25227BEk.A0L(Modifier.A00, 6.0f);
                String str = c26017Bf6.A06;
                String str2 = c26017Bf6.A09;
                boolean z3 = c26017Bf6.A0A;
                String str3 = c26017Bf6.A02;
                c5Tl.Eno(-1866409282);
                if (str3 == null) {
                    A17 = null;
                } else {
                    A17 = AbstractC25228BEl.A17(c5Tl, str3, 2131952623);
                }
                c117505Tk = (C117505Tk) c5Tl;
                z = false;
                C117505Tk.A0L(c117505Tk, false);
                boolean A1a = AbstractC25234BEr.A1a(c5Tl, -1866406871, i3);
                if (i4 != 32) {
                    z2 = false;
                }
                boolean A1U = AbstractC25228BEl.A1U(c5Tl, c26017Bf6, A1a, z2);
                Object EEc = c5Tl.EEc();
                if (A1U || EEc == C5UI.A00) {
                    EEc = BFI.A00(c5Tl, c26017Bf6, interfaceC16620sF, i, 8);
                }
                CD6.A00(c5Tl, A0L, A00, null, str, str2, A17, AbstractC25225BEi.A1A(c117505Tk, EEc, false), null, 48, 272, z3);
            } else {
                c5Tl.Eno(-2023980584);
                String str4 = null;
                C2DB A002 = AbstractC43541zP.A00(c5Tl, AbstractC25225BEi.A0t(c26017Bf6.A05));
                C5YL c5yl = C5YJ.A03;
                String str5 = c26017Bf6.A06;
                String str6 = c26017Bf6.A08;
                boolean z4 = c26017Bf6.A0A;
                String str7 = c26017Bf6.A02;
                c5Tl.Eno(-1866395842);
                if (str7 != null) {
                    str4 = AbstractC25228BEl.A17(c5Tl, str7, 2131952623);
                }
                c117505Tk = (C117505Tk) c5Tl;
                z = false;
                C117505Tk.A0L(c117505Tk, false);
                boolean A1U2 = AbstractC25228BEl.A1U(c5Tl, c26017Bf6, AbstractC25234BEr.A1a(c5Tl, -1866393431, i3), AbstractC167007dF.A1P(i4, 32));
                Object EEc2 = c5Tl.EEc();
                if (A1U2 || EEc2 == C5UI.A00) {
                    EEc2 = BFI.A00(c5Tl, c26017Bf6, interfaceC16620sF, i, 9);
                }
                BI4.A04(c5Tl, A002, c5yl, str5, str6, str4, AbstractC25225BEi.A1A(c117505Tk, EEc2, false), null, 0, 6, 56012, z4);
            }
            if (AbstractC25227BEk.A1b(c117505Tk, z)) {
                C0fH.A00(-2033201246);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30490DbZ(i2, i, 6, c28370CfW, c26017Bf6, interfaceC16620sF);
        }
    }

    public static final void A06(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z) {
        int i2;
        c5Tl.Enr(-1014199899);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0b(c5Tl, z) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1857249852, "com.instagram.aistudio.home.view.SearchNullState (AiSearchFragment.kt:229)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A08 = AbstractC118175Wb.A08(AbstractC25226BEj.A0T(c1130158n), 24.0f);
            InterfaceC1127857k A0P = AbstractC25235BEs.A0P(c5Tl);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A08);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0P, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C6LQ.A0A(c5Tl, AbstractC118185Wd.A0C(AbstractC118175Wb.A08(c1130158n, 16.0f), 100.0f), C5Y7.A00(c5Tl, R.drawable.ig_illustrations_qp_search_refresh, 0), C5YJ.A03, 25008, 104);
            int i3 = 2131952657;
            if (z) {
                i3 = 2131952656;
            }
            String A002 = C5YD.A00(c5Tl, i3);
            long A0G = AbstractC25226BEj.A0G(c5Tl);
            C5WR.A0T(c5Tl, AbstractC118175Wb.A08(c1130158n, 16.0f), AbstractC25226BEj.A0e(c5Tl), A002, A0G);
            int i4 = 2131952655;
            if (z) {
                i4 = 2131952654;
            }
            String A003 = C5YD.A00(c5Tl, i4);
            long A0M = AbstractC25226BEj.A0M(c5Tl);
            C5WR.A0T(c5Tl, AbstractC118175Wb.A08(c1130158n, 16.0f), AbstractC25226BEj.A0c(c5Tl), A003, A0M);
            c5Tl.Eno(552010419);
            if (z) {
                C6GE.A05(c5Tl, AbstractC118175Wb.A0E(c1130158n, 0.0f, 16.0f, 0.0f, 0.0f), AbstractC25235BEs.A0c(c5Tl, false), C5YD.A00(c5Tl, 2131952650), interfaceC16820sZ, ((i2 >> 3) & 14) | 1573248);
            }
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(-1695353962);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30502Dbl.A01(ASZ, interfaceC16820sZ, i, 3, z);
        }
    }
}
