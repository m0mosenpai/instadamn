package X;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.wonderwall.model.WallPostInfo;
import com.instagram.wonderwall.model.WallPostItem;
import com.instagram.wonderwall.model.WallText;

/* renamed from: X.CgB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28405CgB {
    public static final void A03(C5Tl c5Tl, C25884Bck c25884Bck, int i) {
        int i2;
        C14360o3.A0B(c25884Bck, 0);
        c5Tl.Enr(-1533472757);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c25884Bck) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1700426513, "com.instagram.wonderwall.ui.compose.screens.WallPostPreviewScreen (WallPostPreviewScreen.kt:72)");
            }
            C26066Bfu c26066Bfu = (C26066Bfu) AbstractC25235BEs.A0l(c5Tl, c25884Bck.A0B, 0);
            WallPostItem wallPostItem = (WallPostItem) c26066Bfu.A02;
            WallPostInfo Bez = wallPostItem.Bez();
            AbstractC28136Caj.A00(c5Tl, C5UA.A01(c5Tl, new BWE(6, wallPostItem, c25884Bck, Bez, c26066Bfu, new C5XN()), 369167257), 6);
            c5Tl.Eno(1810293211);
            if (c26066Bfu.A08) {
                Modifier A00 = C30711Df9.A00(AbstractC25228BEl.A0W(), C5XU.A00, 0);
                InterfaceC1127857k A002 = C5XX.A00(C118195Wf.A06, false);
                int A003 = C5X2.A00(c5Tl);
                C117505Tk c117505Tk = (C117505Tk) c5Tl;
                C59P A04 = C117505Tk.A04(c117505Tk);
                Modifier A01 = C5X3.A01(c5Tl, A00);
                AbstractC25233BEq.A11(c5Tl, c117505Tk);
                AbstractC25231BEo.A12(c5Tl, A002, A04);
                InterfaceC16620sF interfaceC16620sF = C5X8.A02;
                if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A003);
                }
                AbstractC25225BEi.A1K(c5Tl, A01);
                C5C3 c5c3 = (C5C3) c26066Bfu.A05;
                boolean z = c26066Bfu.A0B;
                boolean z2 = c26066Bfu.A06;
                boolean A1O = AbstractC167007dF.A1O(c5c3.A01.A00.length());
                boolean z3 = c26066Bfu.A09;
                boolean z4 = c26066Bfu.A0A;
                WallText wallText = (WallText) c26066Bfu.A04;
                c5Tl.Eno(2130459775);
                int i3 = i2 & 14;
                boolean A1P = AbstractC167007dF.A1P(i3, 4);
                Object EEc = c5Tl.EEc();
                if (A1P || EEc == C5UI.A00) {
                    EEc = C30179DRk.A01(c25884Bck, 21);
                    c5Tl.FBy(EEc);
                }
                InterfaceC16660sJ A1B = AbstractC25225BEi.A1B(c117505Tk, EEc, false);
                boolean A1U = AbstractC25232BEp.A1U(c5Tl, 2130462555, i3, 4);
                Object EEc2 = c5Tl.EEc();
                if (A1U || EEc2 == C5UI.A00) {
                    EEc2 = C30179DRk.A01(c25884Bck, 22);
                    c5Tl.FBy(EEc2);
                }
                InterfaceC16660sJ A1B2 = AbstractC25225BEi.A1B(c117505Tk, EEc2, false);
                boolean A1U2 = AbstractC25232BEp.A1U(c5Tl, 2130465316, i3, 4);
                Object EEc3 = c5Tl.EEc();
                if (A1U2 || EEc3 == C5UI.A00) {
                    EEc3 = DGU.A00(c5Tl, c25884Bck, 13);
                }
                InterfaceC16820sZ A1A = AbstractC25225BEi.A1A(c117505Tk, EEc3, false);
                boolean A1U3 = AbstractC25232BEp.A1U(c5Tl, 2130468219, i3, 4);
                Object EEc4 = c5Tl.EEc();
                if (A1U3 || EEc4 == C5UI.A00) {
                    EEc4 = DGU.A00(c5Tl, c25884Bck, 14);
                }
                A00(c5Tl, c5c3, wallText, A1A, AbstractC25225BEi.A1A(c117505Tk, EEc4, false), A1B, A1B2, 0, 0, z, z2, A1O, z3, z4);
                c5Tl.ASW();
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C27915CSa c27915CSa = (C27915CSa) c26066Bfu.A01;
            c5Tl.Eno(1810322467);
            if (c27915CSa != null) {
                AbstractC28470ChM.A04(c5Tl, c27915CSa, 8);
            }
            C117505Tk.A0L(A0K, false);
            if (Bez.A05 == C7B.A02) {
                CGQ.A00(c5Tl, AbstractC136736Hc.A00(c5Tl, 2131976997), 0, 0);
            }
            if (C0fH.A02()) {
                C0fH.A00(1062596727);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30498Dbh.A01(ASZ, c25884Bck, i, 17);
        }
    }

    public static final void A00(C5Tl c5Tl, C5C3 c5c3, WallText wallText, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        int i3;
        int i4;
        c5Tl.Enr(1145874849);
        if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, c5c3) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0c(c5Tl, z);
        }
        if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0d(c5Tl, z2);
        }
        if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0e(c5Tl, z3);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0f(c5Tl, z4);
        }
        if ((196608 & i) == 0) {
            i3 |= AbstractC25232BEp.A0g(c5Tl, z5);
        }
        if ((1572864 & i) == 0) {
            i3 |= AbstractC25232BEp.A0X(c5Tl, wallText);
        }
        if ((i & 12582912) == 0) {
            i3 |= AbstractC25232BEp.A0O(c5Tl, interfaceC16660sJ);
        }
        if ((i & 100663296) == 0) {
            i3 |= AbstractC25232BEp.A0P(c5Tl, interfaceC16660sJ2);
        }
        if ((i & 805306368) == 0) {
            i3 |= AbstractC25232BEp.A0Q(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ2);
        } else {
            i4 = i2;
        }
        if ((i3 & 306783379) == 306783378 && (i4 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-677927194, "com.instagram.wonderwall.ui.compose.screens.WallPostReplyEditor (WallPostPreviewScreen.kt:168)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 866342637);
            Object obj = C5UI.A00;
            C25338BJh c25338BJh = (C25338BJh) AbstractC25231BEo.A0l(c5Tl, A0q, obj);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            Object AJX = c5Tl.AJX(C5V2.A0A);
            InterfaceC74953Yl A00 = C5WZ.A00(c5Tl, Boolean.valueOf(AbstractC28287CdZ.A02(c5Tl)));
            C118125Vw A0D = AbstractC25226BEj.A0g(c5Tl).A0D(new C118125Vw(null, null, null, 0, 0, 6291454, ((C1132359l) c5Tl.AJX(C6L9.A00)).A00, 0L, 0L, 0L));
            C6L4 c6l4 = new C6L4(AbstractC25226BEj.A0G(c5Tl));
            Modifier A0X = AbstractC25230BEn.A0X(Modifier.A00, c25338BJh);
            c5Tl.Eno(866350481);
            boolean A1V = AbstractC25234BEr.A1V(i3);
            Object EEc = c5Tl.EEc();
            if (A1V || EEc == obj) {
                EEc = C30179DRk.A00(c5Tl, interfaceC16660sJ, 23);
            }
            AbstractC28411CgH.A00(null, null, null, c5Tl, A0X, c6l4, A0D, c5c3, null, AbstractC25225BEi.A1B(c117505Tk, EEc, false), null, C5UA.A01(c5Tl, new C30571Dcs(wallText, interfaceC16820sZ, interfaceC16820sZ2, z, z2, z3, z4, z5), 625478340), 3, 1, (i3 & 14) | 805306368, 196614, 14808, false, false, false);
            Boolean valueOf = Boolean.valueOf(z);
            boolean A1a = AbstractC25232BEp.A1a(c5Tl, A00, AJX, AbstractC25234BEr.A1Y(c5Tl, 866377796, i3));
            Object EEc2 = c5Tl.EEc();
            if (A1a || EEc2 == obj) {
                EEc2 = new PZ2(A00, c25338BJh, AJX, null, 5, z);
                c5Tl.FBy(EEc2);
            }
            AbstractC25228BEl.A1K(c5Tl, c117505Tk, EEc2, valueOf, false);
            Object value = A00.getValue();
            c5Tl.Eno(866386492);
            boolean AH4 = c5Tl.AH4(A00) | AbstractC25233BEq.A1M(i3);
            Object EEc3 = c5Tl.EEc();
            if (AH4 || EEc3 == obj) {
                EEc3 = new C57154PYy(interfaceC16660sJ2, A00, null, 11);
                c5Tl.FBy(EEc3);
            }
            C117505Tk.A0I(c117505Tk);
            C5UX.A04(c5Tl, value, (InterfaceC16620sF) EEc3);
            if (C0fH.A02()) {
                C0fH.A00(1716182648);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DXS(c5c3, wallText, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16660sJ, interfaceC16660sJ2, i, i2, z, z2, z3, z4, z5);
        }
    }

    public static final void A01(C5Tl c5Tl, WallText wallText, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z) {
        int i2;
        c5Tl.Enr(1748811470);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0b(c5Tl, z) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, wallText);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1021752458, "com.instagram.wonderwall.ui.compose.screens.ReplyAudience (WallPostPreviewScreen.kt:294)");
            }
            C1130158n A0N = AbstractC25225BEi.A0N(c5Tl, 159501566);
            Modifier A02 = AbstractC118175Wb.A02(A0N);
            if (z) {
                boolean A1Q = AbstractC25233BEq.A1Q(c5Tl, 1097061809, i2);
                Object EEc = c5Tl.EEc();
                if (A1Q || EEc == C5UI.A00) {
                    EEc = DGU.A00(c5Tl, interfaceC16820sZ, 10);
                }
                AbstractC25225BEi.A1V(c5Tl, false);
                A02 = A02.Eq3(C5XR.A06(A0N, (InterfaceC16820sZ) EEc));
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            InterfaceC1127857k A0f = AbstractC25228BEl.A0f(c5Tl, 0);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, A02);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A0f, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            AbstractC25230BEn.A18(c5Tl, AbstractC118175Wb.A0E(AbstractC118185Wd.A0C(A0N, 14.0f), 0.0f, 0.0f, 4.0f, 0.0f), C5Y7.A00(c5Tl, R.drawable.instagram_direct_pano_outline_16, 0));
            C5WR.A0u(c5Tl, AbstractC25226BEj.A0f(c5Tl), AbstractC28470ChM.A02(c5Tl, wallText), AbstractC25226BEj.A0M(c5Tl));
            c5Tl.Eno(1097078000);
            if (z) {
                AbstractC25230BEn.A18(c5Tl, AbstractC118175Wb.A0E(AbstractC118185Wd.A0C(A0N, 14.0f), 4.0f, 0.0f, 0.0f, 0.0f), C5Y7.A00(c5Tl, R.drawable.instagram_chevron_down_pano_outline_24, 0));
            }
            if (AbstractC25230BEn.A1U(c5Tl, A0K, false)) {
                C0fH.A00(-121570497);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30488DbX(i, 20, wallText, interfaceC16820sZ, z);
        }
    }

    public static final void A02(C5Tl c5Tl, WallText wallText, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16620sF interfaceC16620sF, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        int i2;
        long j;
        c5Tl.Enr(-950402948);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0b(c5Tl, z) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0c(c5Tl, z2);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0d(c5Tl, z3);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0e(c5Tl, z4);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0f(c5Tl, z5);
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25232BEp.A0W(c5Tl, wallText);
        }
        if ((1572864 & i) == 0) {
            i2 |= AbstractC25232BEp.A0N(c5Tl, interfaceC16620sF);
        }
        if ((12582912 & i) == 0) {
            i2 |= AbstractC25232BEp.A0O(c5Tl, interfaceC16820sZ);
        }
        if ((100663296 & i) == 0) {
            i2 |= AbstractC25232BEp.A0P(c5Tl, interfaceC16820sZ2);
        }
        if ((38347923 & i2) == 38347922 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-743931102, "com.instagram.wonderwall.ui.compose.screens.WallPostReplyDecorationBox (WallPostPreviewScreen.kt:223)");
            }
            C1130158n A0N = AbstractC25225BEi.A0N(c5Tl, 596748148);
            FillElement fillElement = AbstractC118185Wd.A02;
            Modifier Eq3 = A0N.Eq3(fillElement);
            if (z) {
                Eq3 = Eq3.Eq3(AbstractC25232BEp.A0y(c5Tl, A0N));
            }
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            InterfaceC1127857k A02 = AbstractC119595bH.A02(AbstractC118255Wn.A07, c5Tl, C118195Wf.A00, 48);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, Eq3);
            InterfaceC16820sZ interfaceC16820sZ3 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ3);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A02, A04, interfaceC16620sF2);
            InterfaceC16620sF interfaceC16620sF3 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            c5Tl.Eno(1704720895);
            if (z4) {
                A01(c5Tl, wallText, interfaceC16820sZ, AbstractC25225BEi.A02(i2 >> 12) | ((i2 >> 15) & 896), z5);
            }
            C117505Tk.A0L(c117505Tk, false);
            Modifier Eq32 = AbstractC118185Wd.A08(A0N, 64.0f).Eq3(fillElement);
            long j2 = AbstractC1132259k.A00;
            C5AH c5ah = C5AF.A00;
            Modifier A08 = AbstractC118175Wb.A08(C6L3.A01(AbstractC28015CWn.A01(Eq32, c5ah, 16.0f, j2, j2, true), c5ah, AbstractC25226BEj.A06(c5Tl)), 12.0f);
            InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
            InterfaceC1127857k A002 = AbstractC118375Wz.A00(AbstractC118255Wn.A04, c5Tl, interfaceC118225Wj);
            int A003 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A08);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ3);
            C5XJ.A00(c5Tl, A002, interfaceC16620sF2);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A003);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            C6L0 c6l0 = C6L0.A00;
            Modifier A004 = c6l0.A00(A0N);
            FillElement fillElement2 = AbstractC118185Wd.A00;
            Modifier A013 = C6L3.A01(AbstractC25235BEs.A0J(A004.Eq3(fillElement2)), c5ah, C5XL.A00(c5Tl).A0C);
            InterfaceC1127857k A022 = AbstractC118375Wz.A02(AbstractC118255Wn.A01, c5Tl, interfaceC118225Wj, 48);
            int A005 = C5X2.A00(c5Tl);
            C59P A043 = C117505Tk.A04(c117505Tk);
            Modifier A014 = C5X3.A01(c5Tl, A013);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ3);
            C5XJ.A00(c5Tl, A022, interfaceC16620sF2);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A043, A0q) || !AbstractC25231BEo.A1O(c5Tl, A005)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A005);
            }
            C5XJ.A00(c5Tl, A014, A1K);
            Modifier A0A = AbstractC118175Wb.A0A(c6l0.A00(A0N).Eq3(fillElement2), 12.0f, 0.0f);
            InterfaceC1127857k A006 = C5XX.A00(C118195Wf.A0B, false);
            int A007 = C5X2.A00(c5Tl);
            C59P A044 = C117505Tk.A04(c117505Tk);
            Modifier A015 = C5X3.A01(c5Tl, A0A);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ3);
            C5XJ.A00(c5Tl, A006, interfaceC16620sF2);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A044, A0q) || !AbstractC25231BEo.A1O(c5Tl, A007)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A007);
            }
            C5XJ.A00(c5Tl, A015, A1K);
            c5Tl.Eno(1053965038);
            if (z2) {
                C5WR.A0B(c5Tl, null, AbstractC25226BEj.A0g(c5Tl), AbstractC136736Hc.A00(c5Tl, 2131976990), 0, 0, 1, 0, 384, 12282, AbstractC25226BEj.A0M(c5Tl));
            }
            C117505Tk.A0L(c117505Tk, false);
            AbstractC25231BEo.A14(c5Tl, interfaceC16620sF, i2 >> 18);
            C2DC A008 = C5Y7.A00(c5Tl, R.drawable.instagram_direct_pano_outline_24, 0);
            long j3 = C5XL.A00(c5Tl).A0U;
            Modifier A0J = AbstractC25235BEs.A0J(AbstractC118185Wd.A0D(AbstractC118175Wb.A08(A0N, 4.0f), 52.0f));
            if (z3) {
                j = AbstractC25227BEk.A0g(c5Tl, 674711613).A03;
                C117505Tk.A0L(c117505Tk, false);
            } else {
                j = AbstractC25227BEk.A0g(c5Tl, 674713573).A04;
                C117505Tk.A0L(c117505Tk, false);
            }
            Modifier A03 = AbstractC118175Wb.A03(C6L3.A01(A0J, c5ah, j));
            c5Tl.Eno(674717996);
            boolean A1M = AbstractC25233BEq.A1M(i2);
            Object EEc = c5Tl.EEc();
            if (A1M || EEc == C5UI.A00) {
                EEc = new DGU(interfaceC16820sZ2, 15);
                c5Tl.FBy(EEc);
            }
            C5YS.A06(c5Tl, CY3.A00(c5Tl, A03, null, null, null, AbstractC25225BEi.A1A(c117505Tk, EEc, false), 0.0f, 0.0f, 0.0f, 0.0f, 254, z3), A008, j3);
            c5Tl.ASW();
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(-1011366370);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DWK(wallText, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16620sF, i, z, z2, z3, z4, z5);
        }
    }
}
