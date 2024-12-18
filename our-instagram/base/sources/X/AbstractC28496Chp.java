package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexElement;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.Chp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28496Chp {
    public static final void A02(C5Tl c5Tl, C50726MaR c50726MaR, C28370CfW c28370CfW, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16610sE interfaceC16610sE, int i, boolean z) {
        int i2;
        int A06 = AbstractC167007dF.A06(0, c50726MaR, c28370CfW);
        AbstractC167007dF.A1F(interfaceC16610sE, 3, interfaceC16820sZ);
        c5Tl.Enr(-1001952172);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c50726MaR) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0c(c5Tl, z);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, c28370CfW);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16610sE);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-175715017, "com.instagram.aistudio.home.view.section.AiHomeCarouselSection (AiHomeCarouselSection.kt:76)");
            }
            LazyListState A00 = C6IE.A00(c5Tl, 0, 0, 0, 3);
            C6GU A002 = C6GO.A00(A00, c5Tl);
            Modifier A0E = AbstractC118175Wb.A0E(Modifier.A00, 0.0f, 0.0f, 0.0f, 12.0f);
            C6ID A01 = AbstractC118255Wn.A01(12.0f);
            C1333560c c1333560c = new C1333560c(12.0f, 0.0f, 12.0f, 0.0f);
            boolean z2 = true;
            boolean A1W = AbstractC25233BEq.A1W(c5Tl, c50726MaR, c28370CfW, 63520395) | AbstractC167007dF.A1P(i2 & 7168, C3OO.FLAG_MOVED) | AbstractC25231BEo.A1K(i2);
            if ((i2 & 57344) != 16384) {
                z2 = false;
            }
            boolean z3 = A1W | z2;
            Object EEc = c5Tl.EEc();
            if (z3 || EEc == C5UI.A00) {
                EEc = new DI0(A06, c50726MaR, c28370CfW, interfaceC16610sE, interfaceC16820sZ, z);
                c5Tl.FBy(EEc);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            C6IS.A00(A002, A01, c1333560c, A00, c5Tl, null, A0E, (InterfaceC16660sJ) EEc, 12607878, 40, false, true);
            if (C0fH.A02()) {
                C0fH.A00(-1398446458);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUK(i, 0, c50726MaR, c28370CfW, interfaceC16820sZ, interfaceC16610sE, z);
        }
    }

    public static final void A00(C5Tl c5Tl, Modifier modifier, String str, int i, int i2) {
        int i3;
        C5UU ASZ;
        int i4;
        Modifier modifier2 = modifier;
        c5Tl.Enr(204514124);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, modifier2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, str);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(1414042179, "com.instagram.aistudio.home.view.section.TaglineBubble (AiHomeCarouselSection.kt:750)");
            }
            c5Tl.Eno(-475379172);
            if (str == null) {
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
                    C0fH.A00(-146518616);
                }
                ASZ = c5Tl.ASZ();
                if (ASZ == null) {
                    return;
                }
                i4 = 1;
                ASZ.A06 = new DT2(modifier2, str, i2, i, i4);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            InterfaceC1127857k A02 = AbstractC119595bH.A02(AbstractC118255Wn.A07, c5Tl, C118195Wf.A02, AbstractC25225BEi.A01((i3 & 14) >> 3));
            int A002 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, modifier2);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A02, A042, interfaceC16620sF2);
            InterfaceC16620sF interfaceC16620sF3 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A002);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A012);
            C1130158n c1130158n2 = Modifier.A00;
            Modifier Eq3 = c1130158n2.Eq3(new ZIndexElement(2.0f));
            C5WI A013 = C5WF.A01(56.0f);
            boolean z = false;
            int compare = Float.compare(4.0f, 0.0f);
            if (compare > 0) {
                z = true;
            }
            long j = AbstractC1132259k.A00;
            Modifier A014 = AbstractC28015CWn.A01(Eq3, A013, 4.0f, j, j, z);
            long A06 = AbstractC25226BEj.A06(c5Tl);
            C5AH c5ah = C5AF.A00;
            Modifier A08 = AbstractC118175Wb.A08(C6L3.A01(A014, c5ah, A06), 10.0f);
            Alignment alignment = C118195Wf.A0E;
            InterfaceC1127857k A003 = C5XX.A00(alignment, false);
            int A004 = C5X2.A00(c5Tl);
            C59P A043 = C117505Tk.A04(A0K);
            Modifier A015 = C5X3.A01(c5Tl, A08);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A003, interfaceC16620sF2);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A043, A0q) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A004);
            }
            C5XJ.A00(c5Tl, A015, A1K);
            C5WR.A0q(c5Tl, AbstractC25225BEi.A0Y(c5Tl), str, (i3 >> 3) & 14, AbstractC25226BEj.A0G(c5Tl));
            c5Tl.ASW();
            Modifier A03 = AbstractC118185Wd.A03(AbstractC28010CWi.A00(c1130158n2, 36.0f, -8.0f));
            C5WI c5wi = C5WF.A00;
            Modifier A016 = C6L3.A01(AbstractC28015CWn.A01(A03, c5wi, 4.0f, j, j, AbstractC167007dF.A1O(compare)), c5ah, AbstractC25226BEj.A06(c5Tl));
            InterfaceC1127857k A005 = C5XX.A00(alignment, false);
            int A006 = C5X2.A00(c5Tl);
            C59P A044 = C117505Tk.A04(A0K);
            Modifier A017 = C5X3.A01(c5Tl, A016);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A005, interfaceC16620sF2);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A044, A0q) || !AbstractC25231BEo.A1O(c5Tl, A006)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A006);
            }
            C5XJ.A00(c5Tl, A017, A1K);
            c5Tl.ASW();
            Modifier A018 = C6L3.A01(AbstractC28015CWn.A01(AbstractC118185Wd.A0C(AbstractC28010CWi.A00(c1130158n2, 48.0f, -8.0f), 4.0f), c5wi, 4.0f, j, j, AbstractC167007dF.A1O(compare)), c5ah, AbstractC25226BEj.A06(c5Tl));
            InterfaceC1127857k A007 = C5XX.A00(alignment, false);
            int A008 = C5X2.A00(c5Tl);
            C59P A045 = C117505Tk.A04(A0K);
            Modifier A019 = C5X3.A01(c5Tl, A018);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A007, interfaceC16620sF2);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A045, A0q) || !AbstractC25231BEo.A1O(c5Tl, A008)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A008);
            }
            C5XJ.A00(c5Tl, A019, A1K);
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(1274965925);
            }
        }
        ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            i4 = 2;
            ASZ.A06 = new DT2(modifier2, str, i2, i, i4);
        }
    }

    public static final void A01(C5Tl c5Tl, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        int i3;
        long j;
        Modifier modifier2 = modifier;
        c5Tl.Enr(-1014465253);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if ((i2 & 2) != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(984239851, "com.instagram.aistudio.home.view.section.CarouselCreateCard (AiHomeCarouselSection.kt:505)");
            }
            C1130158n c1130158n = Modifier.A00;
            C5WI A00 = C5WF.A00();
            boolean A1O = AbstractC25230BEn.A1O(12.0f);
            long j2 = AbstractC1132259k.A00;
            Modifier A08 = AbstractC118185Wd.A08(AbstractC118185Wd.A0D(AbstractC25232BEp.A0x(c5Tl, AbstractC25235BEs.A0J(AbstractC28015CWn.A01(c1130158n, A00, 12.0f, j2, j2, A1O))), 318.0f), 184.0f);
            c5Tl.Eno(1656632526);
            int i4 = i3 & 14;
            boolean A1P = AbstractC167007dF.A1P(i4, 4);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = new C50157MDk(interfaceC16820sZ, 2);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Modifier A05 = C5XR.A05(A08, null, null, (InterfaceC16820sZ) EEc, true);
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A002 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, A05);
            InterfaceC16820sZ interfaceC16820sZ2 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ2);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0b, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            Modifier A02 = AbstractC118175Wb.A02(c1130158n);
            InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A00;
            InterfaceC118305Ws interfaceC118305Ws = AbstractC118255Wn.A07;
            InterfaceC1127857k A022 = AbstractC119595bH.A02(interfaceC118305Ws, c5Tl, interfaceC118245Wl, 48);
            int A003 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, A02);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ2);
            C5XJ.A00(c5Tl, A022, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            C6GM c6gm = C6GM.A00;
            Modifier A0E = AbstractC118175Wb.A0E(c1130158n, 0.0f, 22.0f, 0.0f, 0.0f);
            InterfaceC1127857k A023 = AbstractC118375Wz.A02(AbstractC118255Wn.A01, c5Tl, C118195Wf.A04, 48);
            int A004 = C5X2.A00(c5Tl);
            C59P A043 = C117505Tk.A04(A0K);
            Modifier A013 = C5X3.A01(c5Tl, A0E);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ2);
            C5XJ.A00(c5Tl, A023, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A043, A0q) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A004);
            }
            C5XJ.A00(c5Tl, A013, A1K);
            C6LQ.A05(c5Tl, AbstractC118185Wd.A0C(c1130158n, 74.0f), C5Y7.A00(c5Tl, R.drawable.ig_illustrations_illo_ai_studio_refresh, 0));
            Modifier A0E2 = AbstractC118175Wb.A0E(c1130158n, 12.0f, 0.0f, 0.0f, 0.0f);
            InterfaceC118245Wl interfaceC118245Wl2 = C118195Wf.A02;
            InterfaceC1127857k A024 = AbstractC119595bH.A02(interfaceC118305Ws, c5Tl, interfaceC118245Wl2, 0);
            int A005 = C5X2.A00(c5Tl);
            C59P A044 = C117505Tk.A04(A0K);
            Modifier A014 = C5X3.A01(c5Tl, A0E2);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ2);
            C5XJ.A00(c5Tl, A024, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A044, A0q) || !AbstractC25231BEo.A1O(c5Tl, A005)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A005);
            }
            C5XJ.A00(c5Tl, A014, A1K);
            String A006 = C5YD.A00(c5Tl, 2131952650);
            boolean z = false;
            C5WR.A0Q(c5Tl, AbstractC118175Wb.A0E(c1130158n, 0.0f, 0.0f, 0.0f, 2.0f), AbstractC25226BEj.A0h(c5Tl), A006, 1, AbstractC25226BEj.A0G(c5Tl));
            C5WR.A0o(c5Tl, AbstractC25225BEi.A0Y(c5Tl), C5YD.A00(c5Tl, 2131952649), 1, 16250, AbstractC25226BEj.A0G(c5Tl));
            c5Tl.ASW();
            c5Tl.ASW();
            AbstractC119685bS.A00(c5Tl, c6gm.A00(c1130158n, true));
            boolean z2 = ((C5WQ) c5Tl.AJX(C5WO.A00)).A00;
            Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
            Modifier A082 = AbstractC118185Wd.A08(AbstractC118175Wb.A0E(A0T, 0.0f, 4.0f, 0.0f, 0.0f), 32.0f);
            if (z2) {
                j = AbstractC25227BEk.A0g(c5Tl, 1800874183).A0q;
            } else {
                j = AbstractC25227BEk.A0g(c5Tl, 1800876551).A0S;
            }
            C117505Tk.A0L(A0K, false);
            Modifier A0V = AbstractC25230BEn.A0V(c5Tl, A082, j);
            InterfaceC1127857k A025 = AbstractC119595bH.A02(interfaceC118305Ws, c5Tl, interfaceC118245Wl2, 0);
            int A007 = C5X2.A00(c5Tl);
            C59P A045 = C117505Tk.A04(A0K);
            Modifier A015 = C5X3.A01(c5Tl, A0V);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ2);
            C5XJ.A00(c5Tl, A025, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A045, A0q) || !AbstractC25231BEo.A1O(c5Tl, A007)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A007);
            }
            C5XJ.A00(c5Tl, A015, A1K);
            String A008 = C5YD.A00(c5Tl, 2131952630);
            Modifier A0A = AbstractC118175Wb.A0A(A0T, 0.0f, 6.0f);
            C6GB A016 = C6GA.A01(c5Tl);
            c5Tl.Eno(1258968555);
            if (i4 == 4) {
                z = true;
            }
            Object EEc2 = c5Tl.EEc();
            if (z || EEc2 == C5UI.A00) {
                EEc2 = new C50157MDk(interfaceC16820sZ, 3);
                c5Tl.FBy(EEc2);
            }
            C6GE.A04(c5Tl, A0A, A016, A008, AbstractC25225BEi.A1A(A0K, EEc2, false));
            c5Tl.ASW();
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(-929042617);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30504Dbn.A01(modifier2, interfaceC16820sZ, i2, i, 8);
        }
    }

    public static final void A03(C5Tl c5Tl, C26021BfA c26021BfA, C26003Ber c26003Ber, C28370CfW c28370CfW, String str, InterfaceC16610sE interfaceC16610sE, int i, int i2) {
        int i3;
        String A01;
        long j;
        c5Tl.Enr(-867351819);
        if ((i2 & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, str) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, c26021BfA);
        }
        if ((i2 & 384) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, c26003Ber);
        }
        if ((i2 & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0A(c5Tl, i);
        }
        if ((i2 & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0L(c5Tl, c28370CfW);
        }
        if ((196608 & i2) == 0) {
            i3 |= AbstractC25232BEp.A0M(c5Tl, interfaceC16610sE);
        }
        if ((i3 & 74899) == 74898 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1741367244, "com.instagram.aistudio.home.view.section.CarouselItem (AiHomeCarouselSection.kt:159)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A08 = AbstractC118185Wd.A08(AbstractC118185Wd.A0D(c1130158n, 318.0f), 184.0f);
            C5WI A00 = C5WF.A00();
            boolean A1O = AbstractC25230BEn.A1O(12.0f);
            long j2 = AbstractC1132259k.A00;
            Modifier A0x = AbstractC25232BEp.A0x(c5Tl, AbstractC25235BEs.A0J(AbstractC28015CWn.A01(A08, A00, 12.0f, j2, j2, A1O)));
            c5Tl.Eno(-2066533966);
            int i4 = i3 & 458752;
            int i5 = i3 & 7168;
            boolean A1U = AbstractC25228BEl.A1U(c5Tl, c26003Ber, AbstractC25226BEj.A1X(c5Tl, c26021BfA, AbstractC167007dF.A1P(i4, Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP)), AbstractC167007dF.A1P(i5, C3OO.FLAG_MOVED));
            Object EEc = c5Tl.EEc();
            if (A1U || EEc == C5UI.A00) {
                EEc = new MHX(i, 3, c26021BfA, interfaceC16610sE, c26003Ber);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Modifier A05 = C5XR.A05(A0x, null, null, (InterfaceC16820sZ) EEc, true);
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A002 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, A05);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0b, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A012);
            Modifier A02 = AbstractC118175Wb.A02(c1130158n);
            InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A00;
            InterfaceC118305Ws interfaceC118305Ws = AbstractC118255Wn.A07;
            InterfaceC1127857k A022 = AbstractC119595bH.A02(interfaceC118305Ws, c5Tl, interfaceC118245Wl, 48);
            int A003 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A013 = C5X3.A01(c5Tl, A02);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A022, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
            }
            C5XJ.A00(c5Tl, A013, A1K);
            C6GM c6gm = C6GM.A00;
            InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
            InterfaceC118275Wp interfaceC118275Wp = AbstractC118255Wn.A01;
            InterfaceC1127857k A023 = AbstractC118375Wz.A02(interfaceC118275Wp, c5Tl, interfaceC118225Wj, 48);
            int A004 = C5X2.A00(c5Tl);
            C59P A043 = C117505Tk.A04(A0K);
            Modifier A014 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A023, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A043, A0q) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A004);
            }
            C5XJ.A00(c5Tl, A014, A1K);
            String str2 = c26021BfA.A07;
            AbstractC27461CAe abstractC27461CAe = c26021BfA.A00;
            String A015 = abstractC27461CAe.A01();
            String str3 = c26021BfA.A06;
            String str4 = c26003Ber.A03;
            Integer valueOf = Integer.valueOf(c26003Ber.A00);
            CD1.A00(c5Tl, c28370CfW, abstractC27461CAe.A00(), c26003Ber.A01, valueOf, str2, A015, str3, "home", str4, abstractC27461CAe.A02(), i, ((i3 >> 12) & 14) | 196608 | ((i3 >> 6) & 112), 0, 0);
            C5QE c5qe = c26021BfA.A01;
            c5Tl.Eno(-1601130946);
            if (c5qe == null) {
                A01 = null;
            } else {
                A01 = BHY.A01(c5Tl, c5qe);
            }
            C117505Tk.A0L(A0K, false);
            C6LQ.A08(c5Tl, AbstractC118185Wd.A0C(AbstractC25226BEj.A0W(c1130158n), 74.0f), AbstractC25235BEs.A0d(c5Tl, c26021BfA.A04), C5YJ.A03);
            Modifier A0E = AbstractC118175Wb.A0E(c1130158n, 12.0f, 0.0f, 0.0f, 0.0f);
            InterfaceC118245Wl interfaceC118245Wl2 = C118195Wf.A02;
            InterfaceC1127857k A024 = AbstractC119595bH.A02(interfaceC118305Ws, c5Tl, interfaceC118245Wl2, 0);
            int A005 = C5X2.A00(c5Tl);
            C59P A044 = C117505Tk.A04(A0K);
            Modifier A016 = C5X3.A01(c5Tl, A0E);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A024, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A044, A0q) || !AbstractC25231BEo.A1O(c5Tl, A005)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A005);
            }
            C5XJ.A00(c5Tl, A016, A1K);
            c5Tl.Eno(-1381999174);
            if (str != null) {
                C5WR.A0G(c5Tl, null, AbstractC25225BEi.A0Y(c5Tl), str, 1, i3 & 14, 16250, AbstractC25226BEj.A0M(c5Tl));
            }
            C117505Tk.A0L(A0K, false);
            Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
            Modifier A0A = AbstractC118175Wb.A0A(A0T, 0.0f, 2.0f);
            InterfaceC1127857k A025 = AbstractC118375Wz.A02(interfaceC118275Wp, c5Tl, interfaceC118225Wj, 48);
            int A006 = C5X2.A00(c5Tl);
            C59P A045 = C117505Tk.A04(A0K);
            Modifier A017 = C5X3.A01(c5Tl, A0A);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A025, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A045, A0q) || !AbstractC25231BEo.A1O(c5Tl, A006)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A006);
            }
            C5XJ.A00(c5Tl, A017, A1K);
            C5WR.A0B(c5Tl, AbstractC118185Wd.A0H(c1130158n, Float.NaN, 184.0f), AbstractC25226BEj.A0h(c5Tl), str3, 1, 1, 2, 48, 390, 11128, AbstractC25226BEj.A0G(c5Tl));
            c5Tl.Eno(-1580415895);
            if (c26021BfA.A0D) {
                AbstractC137516Kw.A00(c5Tl, AbstractC118175Wb.A0E(c1130158n, 2.0f, 0.0f, 0.0f, 0.0f));
            }
            C117505Tk.A0L(A0K, false);
            c5Tl.ASW();
            String str5 = c26021BfA.A0A;
            c5Tl.Eno(-1381962120);
            if (str5 != null) {
                long A0G = AbstractC25226BEj.A0G(c5Tl);
                C5WR.A0B(c5Tl, AbstractC118175Wb.A0E(c1130158n, 0.0f, 0.0f, 0.0f, 8.0f), AbstractC25225BEi.A0Y(c5Tl), str5, 1, 3, 2, 48, 390, 11128, A0G);
            }
            C117505Tk.A0L(A0K, false);
            c5Tl.Eno(-1381948266);
            if (A01 != null) {
                C5WR.A0D(c5Tl, null, AbstractC25225BEi.A0Y(c5Tl), A01, 1, 1, 390, 11130, AbstractC25226BEj.A0M(c5Tl));
            }
            AbstractC25230BEn.A16(c5Tl, A0K);
            AbstractC119685bS.A00(c5Tl, c6gm.A00(c1130158n, true));
            boolean z = ((C5WQ) c5Tl.AJX(C5WO.A00)).A00;
            boolean z2 = true;
            Modifier A082 = AbstractC118185Wd.A08(AbstractC118175Wb.A0E(A0T, 0.0f, 4.0f, 0.0f, 0.0f), 32.0f);
            if (z) {
                j = AbstractC25227BEk.A0g(c5Tl, -1301720754).A0q;
            } else {
                j = AbstractC25227BEk.A0g(c5Tl, -1301718386).A0S;
            }
            C117505Tk.A0L(A0K, false);
            Modifier A0V = AbstractC25230BEn.A0V(c5Tl, A082, j);
            InterfaceC1127857k A026 = AbstractC119595bH.A02(interfaceC118305Ws, c5Tl, interfaceC118245Wl2, 0);
            int A007 = C5X2.A00(c5Tl);
            C59P A046 = C117505Tk.A04(A0K);
            Modifier A018 = C5X3.A01(c5Tl, A0V);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A026, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A046, A0q) || !AbstractC25231BEo.A1O(c5Tl, A007)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A007);
            }
            C5XJ.A00(c5Tl, A018, A1K);
            String A008 = C5YD.A00(c5Tl, 2131952629);
            Modifier A0A2 = AbstractC118175Wb.A0A(A0T, 0.0f, 6.0f);
            C6GB A019 = C6GA.A01(c5Tl);
            boolean A1X = AbstractC25226BEj.A1X(c5Tl, c26021BfA, AbstractC25232BEp.A1U(c5Tl, -1601029393, i4, Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP));
            if (i5 != 2048) {
                z2 = false;
            }
            boolean A1U2 = AbstractC25228BEl.A1U(c5Tl, c26003Ber, A1X, z2);
            Object EEc2 = c5Tl.EEc();
            if (A1U2 || EEc2 == C5UI.A00) {
                EEc2 = new MHX(i, 4, c26021BfA, interfaceC16610sE, c26003Ber);
                c5Tl.FBy(EEc2);
            }
            C6GE.A04(c5Tl, A0A2, A019, A008, AbstractC25225BEi.A1A(A0K, EEc2, false));
            c5Tl.ASW();
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(92991625);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DVE(c28370CfW, interfaceC16610sE, c26003Ber, c26021BfA, str, i2, i, 1);
        }
    }

    public static final void A04(C5Tl c5Tl, C26021BfA c26021BfA, C26003Ber c26003Ber, C28370CfW c28370CfW, String str, InterfaceC16610sE interfaceC16610sE, int i, int i2) {
        int i3;
        String A01;
        long j;
        long j2;
        c5Tl.Enr(822367769);
        if ((i2 & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, str) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, c26021BfA);
        }
        if ((i2 & 384) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, c26003Ber);
        }
        if ((i2 & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0A(c5Tl, i);
        }
        if ((i2 & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0L(c5Tl, c28370CfW);
        }
        if ((i2 & 196608) == 0) {
            i3 |= AbstractC25232BEp.A0M(c5Tl, interfaceC16610sE);
        }
        if ((74899 & i3) == 74898 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-175425735, "com.instagram.aistudio.home.view.section.CarouselItemV2 (AiHomeCarouselSection.kt:388)");
            }
            C5QE c5qe = c26021BfA.A01;
            c5Tl.Eno(-1882994563);
            if (c5qe == null) {
                A01 = null;
            } else {
                A01 = BHY.A01(c5Tl, c5qe);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            boolean z = ((C5WQ) c5Tl.AJX(C5WO.A00)).A00;
            C1130158n c1130158n = Modifier.A00;
            Modifier A0X = AbstractC25226BEj.A0X(AbstractC25235BEs.A0J(C6L7.A03(AbstractC118185Wd.A08(AbstractC118185Wd.A0D(c1130158n, 222.0f), 278.0f), C5WF.A00(), 1.0f, AbstractC25226BEj.A0B(c5Tl))), AbstractC25226BEj.A06(c5Tl));
            c5Tl.Eno(-1882979186);
            int i4 = i3 & 458752;
            boolean AH6 = c5Tl.AH6(c26021BfA) | AbstractC167007dF.A1P(i4, Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
            int i5 = i3 & 7168;
            boolean A1U = AbstractC25228BEl.A1U(c5Tl, c26003Ber, AH6, AbstractC167007dF.A1P(i5, C3OO.FLAG_MOVED));
            Object EEc = c5Tl.EEc();
            if (A1U || EEc == C5UI.A00) {
                EEc = new MHX(i, 5, c26021BfA, interfaceC16610sE, c26003Ber);
                c5Tl.FBy(EEc);
            }
            Modifier A05 = C5XR.A05(A0X, null, null, AbstractC25225BEi.A1A(A0K, EEc, false), true);
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, A05);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0b, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A012);
            String str2 = c26021BfA.A07;
            AbstractC27461CAe abstractC27461CAe = c26021BfA.A00;
            String A013 = abstractC27461CAe.A01();
            String str3 = c26021BfA.A06;
            String str4 = c26003Ber.A03;
            Integer valueOf = Integer.valueOf(c26003Ber.A00);
            CD1.A00(c5Tl, c28370CfW, abstractC27461CAe.A00(), c26003Ber.A01, valueOf, str2, A013, str3, "home", str4, abstractC27461CAe.A02(), i, ((i3 >> 12) & 14) | 196608 | ((i3 >> 6) & 112), 0, 0);
            Modifier A0D = AbstractC118175Wb.A0D(c1130158n, 16.0f, 60.0f, 16.0f);
            InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A00;
            InterfaceC118305Ws interfaceC118305Ws = AbstractC118255Wn.A07;
            InterfaceC1127857k A0Q = AbstractC25227BEk.A0Q(interfaceC118305Ws, c5Tl, interfaceC118245Wl);
            int A002 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A014 = C5X3.A01(c5Tl, A0D);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A0Q, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            C5XJ.A00(c5Tl, A014, A1K);
            C6GM c6gm = C6GM.A00;
            C6LQ.A03(c5Tl, AbstractC118185Wd.A0C(AbstractC25226BEj.A0W(c1130158n), 96.0f), AbstractC43541zP.A00(c5Tl, AbstractC25225BEi.A0t(c26021BfA.A04)));
            c5Tl.Eno(-1364427953);
            if (str != null) {
                Modifier A0C = AbstractC118175Wb.A0C(c1130158n, 0.0f, 6.0f, 0.0f);
                InterfaceC118245Wl interfaceC118245Wl2 = C118195Wf.A02;
                InterfaceC1127857k A02 = AbstractC119595bH.A02(interfaceC118305Ws, c5Tl, interfaceC118245Wl2, 0);
                int A003 = C5X2.A00(c5Tl);
                C59P A043 = C117505Tk.A04(A0K);
                Modifier A015 = C5X3.A01(c5Tl, A0C);
                AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
                C5XJ.A00(c5Tl, A02, interfaceC16620sF);
                if (AbstractC25225BEi.A1W(c5Tl, A0K, A043, A0q) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
                }
                C5XJ.A00(c5Tl, A015, A1K);
                if (z) {
                    j2 = AbstractC25227BEk.A0g(c5Tl, 99911080).A0q;
                    C117505Tk.A0L(A0K, false);
                } else {
                    j2 = AbstractC25227BEk.A0g(c5Tl, 99913576).A0S;
                    C117505Tk.A0L(A0K, false);
                }
                Modifier A0A = AbstractC118175Wb.A0A(AbstractC25228BEl.A0Z(c1130158n, 12.0f, j2), 6.0f, 5.5f);
                InterfaceC1127857k A022 = AbstractC119595bH.A02(interfaceC118305Ws, c5Tl, interfaceC118245Wl2, 0);
                int A004 = C5X2.A00(c5Tl);
                C59P A044 = C117505Tk.A04(A0K);
                Modifier A016 = C5X3.A01(c5Tl, A0A);
                AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
                C5XJ.A00(c5Tl, A022, interfaceC16620sF);
                if (AbstractC25225BEi.A1W(c5Tl, A0K, A044, A0q) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A004);
                }
                C5XJ.A00(c5Tl, A016, A1K);
                C5WR.A0B(c5Tl, null, AbstractC25226BEj.A0f(c5Tl), str, 3, 1, 2, i3 & 14, 390, 11130, AbstractC25226BEj.A0M(c5Tl));
                c5Tl.ASW();
                c5Tl.ASW();
            }
            C117505Tk.A0L(A0K, false);
            Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
            Modifier A0A2 = AbstractC118175Wb.A0A(A0T, 0.0f, 2.0f);
            InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
            InterfaceC118335Wv interfaceC118335Wv = AbstractC118255Wn.A02;
            InterfaceC1127857k A005 = AbstractC118375Wz.A00(interfaceC118335Wv, c5Tl, interfaceC118225Wj);
            int A006 = C5X2.A00(c5Tl);
            C59P A045 = C117505Tk.A04(A0K);
            Modifier A017 = C5X3.A01(c5Tl, A0A2);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A005, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A045, A0q) || !AbstractC25231BEo.A1O(c5Tl, A006)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A006);
            }
            C5XJ.A00(c5Tl, A017, A1K);
            C5WR.A0V(c5Tl, AbstractC118185Wd.A0H(c1130158n, Float.NaN, 174.0f), AbstractC25226BEj.A0h(c5Tl), str3, AbstractC25226BEj.A0G(c5Tl));
            c5Tl.Eno(2093374759);
            if (c26021BfA.A0D) {
                AbstractC137516Kw.A00(c5Tl, AbstractC118175Wb.A0E(c1130158n, 2.0f, 0.0f, 0.0f, 0.0f));
            }
            C117505Tk.A0L(A0K, false);
            c5Tl.ASW();
            c5Tl.Eno(-1364368768);
            if (A01 != null) {
                C5WR.A0y(c5Tl, AbstractC25225BEi.A0Y(c5Tl), A01, AbstractC25226BEj.A0M(c5Tl));
            }
            C117505Tk.A0L(A0K, false);
            AbstractC119685bS.A00(c5Tl, c6gm.A00(c1130158n, true));
            boolean z2 = true;
            Modifier A08 = AbstractC118185Wd.A08(A0T, 34.0f);
            if (z) {
                j = AbstractC25227BEk.A0g(c5Tl, -1364347862).A0q;
            } else {
                j = AbstractC25227BEk.A0g(c5Tl, -1364345494).A0S;
            }
            C117505Tk.A0L(A0K, false);
            Modifier A0V = AbstractC25230BEn.A0V(c5Tl, A08, j);
            InterfaceC1127857k A023 = AbstractC119595bH.A02(interfaceC118335Wv, c5Tl, C118195Wf.A02, 6);
            int A007 = C5X2.A00(c5Tl);
            C59P A046 = C117505Tk.A04(A0K);
            Modifier A018 = C5X3.A01(c5Tl, A0V);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A023, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A046, A0q) || !AbstractC25231BEo.A1O(c5Tl, A007)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A007);
            }
            C5XJ.A00(c5Tl, A018, A1K);
            String A008 = C5YD.A00(c5Tl, 2131952629);
            C6GB A019 = C6GA.A01(c5Tl);
            boolean A1X = AbstractC25226BEj.A1X(c5Tl, c26021BfA, AbstractC25232BEp.A1U(c5Tl, 2093415243, i4, Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP));
            if (i5 != 2048) {
                z2 = false;
            }
            boolean A1U2 = AbstractC25228BEl.A1U(c5Tl, c26003Ber, A1X, z2);
            Object EEc2 = c5Tl.EEc();
            if (A1U2 || EEc2 == C5UI.A00) {
                EEc2 = new MHX(i, 6, c26021BfA, interfaceC16610sE, c26003Ber);
                c5Tl.FBy(EEc2);
            }
            C6GE.A04(c5Tl, A0T, A019, A008, AbstractC25225BEi.A1A(A0K, EEc2, false));
            c5Tl.ASW();
            c5Tl.ASW();
            Modifier A0D2 = AbstractC118175Wb.A0D(c1130158n, 16.0f, 16.0f, 0.0f);
            InterfaceC1127857k A024 = AbstractC118375Wz.A02(interfaceC118335Wv, c5Tl, C118195Wf.A05, 6);
            int A009 = C5X2.A00(c5Tl);
            C59P A047 = C117505Tk.A04(A0K);
            Modifier A0110 = C5X3.A01(c5Tl, A0D2);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A024, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A047, A0q) || !AbstractC25231BEo.A1O(c5Tl, A009)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A009);
            }
            C5XJ.A00(c5Tl, A0110, A1K);
            String str5 = c26021BfA.A0A;
            if (str5 == null) {
                str5 = "";
            }
            AbstractC27527CCx.A00(c5Tl, AbstractC25225BEi.A0Y(c5Tl), str5, 3, 3072, 34, AbstractC25226BEj.A09(c5Tl), 0L, false);
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(-1746470419);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DVE(c28370CfW, interfaceC16610sE, c26003Ber, c26021BfA, str, i2, i, 2);
        }
    }

    public static final void A05(C5Tl c5Tl, C26021BfA c26021BfA, C26003Ber c26003Ber, C28370CfW c28370CfW, String str, InterfaceC16610sE interfaceC16610sE, int i, int i2) {
        int i3;
        String A01;
        c5Tl.Enr(-1786699592);
        if ((i2 & 48) == 0) {
            i3 = AbstractC25232BEp.A0I(c5Tl, c26021BfA) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 384) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, c26003Ber);
        }
        if ((i2 & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0A(c5Tl, i);
        }
        if ((i2 & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0L(c5Tl, c28370CfW);
        }
        if ((i2 & 196608) == 0) {
            i3 |= AbstractC25232BEp.A0M(c5Tl, interfaceC16610sE);
        }
        if ((74897 & i3) == 74896 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1753840853, "com.instagram.aistudio.home.view.section.CarouselItemV3 (AiHomeCarouselSection.kt:269)");
            }
            InterfaceC1128957x A0b = AbstractC25230BEn.A0b(c5Tl);
            C1130158n c1130158n = Modifier.A00;
            Modifier A0X = AbstractC25228BEl.A0X(AbstractC25228BEl.A0Y(AbstractC118185Wd.A08(AbstractC118185Wd.A0D(c1130158n, 222.0f), 308.0f), 20.0f, 1.0f, AbstractC25226BEj.A0B(c5Tl)), 20.0f);
            long j = C5XL.A00(c5Tl).A08;
            C5AH c5ah = C5AF.A00;
            Modifier A012 = C6L3.A01(A0X, c5ah, j);
            c5Tl.Eno(-1883143281);
            int i4 = i3 & 458752;
            int i5 = i3 & 7168;
            boolean A1U = AbstractC25228BEl.A1U(c5Tl, c26003Ber, AbstractC25226BEj.A1X(c5Tl, c26021BfA, AbstractC167007dF.A1P(i4, Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP)), AbstractC167007dF.A1P(i5, C3OO.FLAG_MOVED));
            Object EEc = c5Tl.EEc();
            if (A1U || EEc == C5UI.A00) {
                EEc = new MHX(i, 7, c26021BfA, interfaceC16610sE, c26003Ber);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Modifier A05 = C5XR.A05(A012, null, null, (InterfaceC16820sZ) EEc, true);
            Alignment alignment = C118195Wf.A0E;
            InterfaceC1127857k A00 = C5XX.A00(alignment, false);
            int A002 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A013 = C5X3.A01(c5Tl, A05);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A00, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A013);
            String str2 = c26021BfA.A07;
            AbstractC27461CAe abstractC27461CAe = c26021BfA.A00;
            String A014 = abstractC27461CAe.A01();
            String str3 = c26021BfA.A06;
            String str4 = c26003Ber.A03;
            CD1.A00(c5Tl, c28370CfW, abstractC27461CAe.A00(), c26003Ber.A01, Integer.valueOf(c26003Ber.A00), str2, A014, str3, "home", str4, abstractC27461CAe.A02(), i, ((i3 >> 12) & 14) | 196608 | ((i3 >> 6) & 112), 0, 0);
            float EqT = A0b.EqT(308.0f) / 3.0f;
            float EqT2 = (A0b.EqT(308.0f) / 3.0f) * 2.0f;
            C25766Ba5 A003 = C6L6.A00(AbstractC25232BEp.A1G(AbstractC25225BEi.A0S(AbstractC25226BEj.A0I(c5Tl)), AbstractC25226BEj.A0J(c5Tl)), AbstractC119395aw.A00(0.0f, 0.0f), AbstractC119395aw.A00(0.0f, EqT));
            C25766Ba5 A004 = C6L6.A00(AbstractC25232BEp.A1G(AbstractC25225BEi.A0S(AbstractC25226BEj.A0J(c5Tl)), AbstractC25226BEj.A0I(c5Tl)), AbstractC119395aw.A00(0.0f, EqT2), AbstractC119395aw.A00(0.0f, Float.POSITIVE_INFINITY));
            InterfaceC1127857k A005 = C5XX.A00(alignment, false);
            int A006 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A015 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A005, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A006)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A006);
            }
            C5XJ.A00(c5Tl, A015, A1K);
            C119645bN c119645bN = C119645bN.A00;
            String str5 = c26021BfA.A02;
            if (str5 == null) {
                str5 = c26021BfA.A04;
            }
            C2DB A0d = AbstractC25235BEs.A0d(c5Tl, str5);
            C5YL c5yl = C5YJ.A00;
            Modifier A0U = AbstractC25226BEj.A0U(c1130158n);
            if (str5 == null) {
                A0U = A0U.Eq3(CB9.A00(c1130158n, AbstractC27748CLp.A00, 20.0f, 20.0f));
            }
            C6LQ.A08(c5Tl, A0U, A0d, c5yl);
            C5XX.A02(c5Tl, C6L3.A00(C6L3.A00(c119645bN.Cng(c1130158n), A003, c5ah), A004, c5ah), 0);
            c5Tl.ASW();
            Modifier A0D = AbstractC118175Wb.A0D(c1130158n, 16.0f, 58.0f, 16.0f);
            InterfaceC1127857k A0P = AbstractC25235BEs.A0P(c5Tl);
            int A007 = C5X2.A00(c5Tl);
            C59P A043 = C117505Tk.A04(A0K);
            Modifier A016 = C5X3.A01(c5Tl, A0D);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A0P, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A043, A0q) || !AbstractC25231BEo.A1O(c5Tl, A007)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A007);
            }
            C5XJ.A00(c5Tl, A016, A1K);
            C6GM c6gm = C6GM.A00;
            C6LQ.A03(c5Tl, AbstractC118185Wd.A0C(AbstractC25226BEj.A0W(c1130158n), 140.0f), AbstractC25235BEs.A0d(c5Tl, c26021BfA.A04));
            Modifier A0E = AbstractC118175Wb.A0E(AbstractC25226BEj.A0T(c1130158n), 0.0f, 16.0f, 0.0f, 2.0f);
            InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
            InterfaceC118335Wv interfaceC118335Wv = AbstractC118255Wn.A02;
            InterfaceC1127857k A02 = AbstractC118375Wz.A02(interfaceC118335Wv, c5Tl, interfaceC118225Wj, 54);
            int A008 = C5X2.A00(c5Tl);
            C59P A044 = C117505Tk.A04(A0K);
            Modifier A017 = C5X3.A01(c5Tl, A0E);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A02, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A044, A0q) || !AbstractC25231BEo.A1O(c5Tl, A008)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A008);
            }
            C5XJ.A00(c5Tl, A017, A1K);
            boolean z = c26021BfA.A0D;
            int i6 = 190;
            if (z) {
                i6 = 175;
            }
            C5WR.A0W(c5Tl, AbstractC118185Wd.A0H(c1130158n, Float.NaN, i6), AbstractC25226BEj.A0h(c5Tl), str3, AbstractC25226BEj.A0H(c5Tl));
            c5Tl.Eno(1170533718);
            if (z) {
                AbstractC137516Kw.A01(c5Tl, AbstractC118175Wb.A0E(c1130158n, 3.0f, 0.0f, 0.0f, 0.0f), 12.0f, 54, 0, AbstractC25226BEj.A0H(c5Tl));
            }
            C117505Tk.A0L(A0K, false);
            c5Tl.ASW();
            C5QE c5qe = c26021BfA.A01;
            c5Tl.Eno(-402909220);
            if (c5qe == null) {
                A01 = null;
            } else {
                A01 = BHY.A01(c5Tl, c5qe);
            }
            C117505Tk.A0L(A0K, false);
            c5Tl.Eno(-402906849);
            if (A01 != null) {
                C5WR.A0y(c5Tl, AbstractC25225BEi.A0Y(c5Tl), A01, AbstractC25226BEj.A0H(c5Tl));
            }
            C117505Tk.A0L(A0K, false);
            boolean z2 = false;
            AbstractC119685bS.A00(c5Tl, c6gm.A00(c1130158n, true));
            String A009 = C5YD.A00(c5Tl, 2131952629);
            Modifier A0D2 = AbstractC118185Wd.A0D(c1130158n, 96.0f);
            EnumC27399C7c enumC27399C7c = EnumC27399C7c.A05;
            c5Tl.Eno(-402890611);
            if (i4 == 131072) {
                z2 = true;
            }
            boolean A1U2 = AbstractC25228BEl.A1U(c5Tl, c26003Ber, c5Tl.AH6(c26021BfA) | z2, AbstractC167007dF.A1P(i5, C3OO.FLAG_MOVED));
            Object EEc2 = c5Tl.EEc();
            if (A1U2 || EEc2 == C5UI.A00) {
                EEc2 = new MHX(i, 8, c26021BfA, interfaceC16610sE, c26003Ber);
                c5Tl.FBy(EEc2);
            }
            CGJ.A00(null, c5Tl, A0D2, enumC27399C7c, A009, AbstractC25225BEi.A1A(A0K, EEc2, false), 196614, 88, false, false);
            c5Tl.ASW();
            Modifier A0D3 = AbstractC118175Wb.A0D(c1130158n, 16.0f, 20.0f, 0.0f);
            InterfaceC1127857k A022 = AbstractC118375Wz.A02(interfaceC118335Wv, c5Tl, C118195Wf.A05, 6);
            int A0010 = C5X2.A00(c5Tl);
            C59P A045 = C117505Tk.A04(A0K);
            Modifier A018 = C5X3.A01(c5Tl, A0D3);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A022, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A045, A0q) || !AbstractC25231BEo.A1O(c5Tl, A0010)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A0010);
            }
            C5XJ.A00(c5Tl, A018, A1K);
            String str6 = c26021BfA.A0A;
            if (str6 == null) {
                str6 = "";
            }
            AbstractC27527CCx.A00(c5Tl, AbstractC25225BEi.A0Y(c5Tl), str6, 3, 3072, 2, C5XL.A00(c5Tl).A0r, AbstractC25226BEj.A0H(c5Tl), false);
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(-843778094);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DVE(c28370CfW, interfaceC16610sE, c26003Ber, c26021BfA, str, i2, i, 3);
        }
    }

    public static final void A06(C5Tl c5Tl, C26021BfA c26021BfA, C26003Ber c26003Ber, C28370CfW c28370CfW, String str, InterfaceC16610sE interfaceC16610sE, int i, int i2) {
        int i3;
        String A01;
        c5Tl.Enr(-1937402394);
        if ((i2 & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, str) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, c26021BfA);
        }
        if ((i2 & 384) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, c26003Ber);
        }
        if ((i2 & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0A(c5Tl, i);
        }
        if ((i2 & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0L(c5Tl, c28370CfW);
        }
        if ((196608 & i2) == 0) {
            i3 |= AbstractC25232BEp.A0M(c5Tl, interfaceC16610sE);
        }
        if ((74899 & i3) == 74898 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1788885504, "com.instagram.aistudio.home.view.section.LargeCardItem (AiHomeCarouselSection.kt:684)");
            }
            C1130158n c1130158n = Modifier.A00;
            C5WI A00 = C5WF.A00();
            boolean A1O = AbstractC25230BEn.A1O(12.0f);
            long j = AbstractC1132259k.A00;
            Modifier A08 = AbstractC118175Wb.A08(AbstractC25232BEp.A0x(c5Tl, AbstractC25235BEs.A0J(AbstractC27468CAo.A00(AbstractC28015CWn.A01(c1130158n, A00, 12.0f, j, j, A1O), 1.0f, false))), 24.0f);
            c5Tl.Eno(1312572137);
            boolean A1U = AbstractC25228BEl.A1U(c5Tl, c26003Ber, AbstractC25226BEj.A1X(c5Tl, c26021BfA, AbstractC25231BEo.A1N(458752, i3, Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP)), AbstractC167007dF.A1P(i3 & 7168, C3OO.FLAG_MOVED));
            Object EEc = c5Tl.EEc();
            if (A1U || EEc == C5UI.A00) {
                EEc = new MHX(i, 9, c26021BfA, interfaceC16610sE, c26003Ber);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Modifier A06 = C5XR.A06(A08, (InterfaceC16820sZ) EEc);
            InterfaceC1127857k A0P = AbstractC25235BEs.A0P(c5Tl);
            int A002 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, A06);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0P, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A012);
            String str2 = c26021BfA.A07;
            AbstractC27461CAe abstractC27461CAe = c26021BfA.A00;
            String A013 = abstractC27461CAe.A01();
            String str3 = c26021BfA.A06;
            String str4 = c26003Ber.A03;
            Integer valueOf = Integer.valueOf(c26003Ber.A00);
            CD1.A00(c5Tl, c28370CfW, abstractC27461CAe.A00(), c26003Ber.A01, valueOf, str2, A013, str3, "home", str4, abstractC27461CAe.A02(), i, ((i3 >> 12) & 14) | 196608 | ((i3 >> 6) & 112), 0, 0);
            C5QE c5qe = c26021BfA.A01;
            c5Tl.Eno(1866775799);
            if (c5qe == null) {
                A01 = null;
            } else {
                A01 = BHY.A01(c5Tl, c5qe);
            }
            C117505Tk.A0L(A0K, false);
            Modifier A0E = AbstractC118175Wb.A0E(c1130158n, 0.0f, 24.0f, 0.0f, 0.0f);
            InterfaceC1127857k A003 = C5XX.A00(C118195Wf.A0C, false);
            int A004 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A014 = C5X3.A01(c5Tl, A0E);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A003, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A004);
            }
            C5XJ.A00(c5Tl, A014, A1K);
            A00(c5Tl, AbstractC28010CWi.A00(c1130158n, 0.0f, -8.0f).Eq3(new ZIndexElement(1.0f)), c26021BfA.A08, 6, 0);
            C6LQ.A08(c5Tl, AbstractC118185Wd.A0C(AbstractC25226BEj.A0W(c1130158n), 140.0f), AbstractC25235BEs.A0d(c5Tl, c26021BfA.A04), C5YJ.A03);
            c5Tl.ASW();
            c5Tl.Eno(1866792402);
            if (str != null) {
                long A0M = AbstractC25226BEj.A0M(c5Tl);
                C5WR.A0P(c5Tl, AbstractC118175Wb.A0E(c1130158n, 0.0f, 12.0f, 0.0f, 0.0f), AbstractC25226BEj.A0c(c5Tl), str, (i3 & 14) | 48, A0M);
            }
            C117505Tk.A0L(A0K, false);
            Modifier A0N = AbstractC25227BEk.A0N(AbstractC25226BEj.A0T(c1130158n), 0.0f);
            InterfaceC1127857k A005 = AbstractC118375Wz.A00(AbstractC118255Wn.A02, c5Tl, C118195Wf.A04);
            int A006 = C5X2.A00(c5Tl);
            C59P A043 = C117505Tk.A04(A0K);
            Modifier A015 = C5X3.A01(c5Tl, A0N);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A005, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A043, A0q) || !AbstractC25231BEo.A1O(c5Tl, A006)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A006);
            }
            C5XJ.A00(c5Tl, A015, A1K);
            C5WR.A0x(c5Tl, AbstractC25226BEj.A0d(c5Tl), str3, AbstractC25226BEj.A0G(c5Tl));
            c5Tl.Eno(-216234677);
            if (c26021BfA.A0D) {
                AbstractC137516Kw.A00(c5Tl, AbstractC118175Wb.A0E(c1130158n, 2.0f, 0.0f, 0.0f, 0.0f));
            }
            C117505Tk.A0L(A0K, false);
            c5Tl.ASW();
            c5Tl.Eno(1866821177);
            if (A01 != null) {
                C5WR.A0T(c5Tl, c1130158n, AbstractC25226BEj.A0c(c5Tl), A01, AbstractC25226BEj.A0M(c5Tl));
            }
            if (AbstractC25230BEn.A1U(c5Tl, A0K, false)) {
                C0fH.A00(1654724859);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DVE(c28370CfW, interfaceC16610sE, c26003Ber, c26021BfA, str, i2, i, 4);
        }
    }

    public static final void A07(InterfaceC16820sZ interfaceC16820sZ, C5Tl c5Tl, int i) {
        int i2;
        long j;
        c5Tl.Enr(-1376041304);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1782280494, "com.instagram.aistudio.home.view.section.CarouselCreateCardV2 (AiHomeCarouselSection.kt:565)");
            }
            boolean z = ((C5WQ) c5Tl.AJX(C5WO.A00)).A00;
            C1130158n c1130158n = Modifier.A00;
            Modifier A0X = AbstractC25226BEj.A0X(AbstractC25235BEs.A0J(C6L7.A03(AbstractC118185Wd.A08(AbstractC118185Wd.A0D(c1130158n, 222.0f), 278.0f), C5WF.A00(), 1.0f, AbstractC25226BEj.A0B(c5Tl))), AbstractC25226BEj.A06(c5Tl));
            c5Tl.Eno(-2093382710);
            int i3 = i2 & 14;
            boolean A1P = AbstractC167007dF.A1P(i3, 4);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = new C50157MDk(interfaceC16820sZ, 4);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Modifier A05 = C5XR.A05(A0X, null, null, (InterfaceC16820sZ) EEc, true);
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, A05);
            InterfaceC16820sZ interfaceC16820sZ2 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ2);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0b, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            Modifier A0D = AbstractC118175Wb.A0D(c1130158n, 16.0f, 32.0f, 16.0f);
            InterfaceC1127857k A0P = AbstractC25235BEs.A0P(c5Tl);
            int A002 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, A0D);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ2);
            C5XJ.A00(c5Tl, A0P, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            C6GM c6gm = C6GM.A00;
            C6LQ.A05(c5Tl, AbstractC118185Wd.A0C(c1130158n, 96.0f), C5Y7.A00(c5Tl, R.drawable.instagram_illustrations_product_illustration_pi_plus_ai_home_96x96, 0));
            String A003 = C5YD.A00(c5Tl, 2131952650);
            long A0G = AbstractC25226BEj.A0G(c5Tl);
            boolean z2 = false;
            C5WR.A0V(c5Tl, AbstractC25227BEk.A0N(c1130158n, 0.0f), AbstractC25226BEj.A0h(c5Tl), A003, A0G);
            C5WR.A0D(c5Tl, null, AbstractC25225BEi.A0Y(c5Tl), C5YD.A00(c5Tl, 2131952649), 3, 3, 390, 11130, AbstractC25226BEj.A0M(c5Tl));
            AbstractC119685bS.A00(c5Tl, c6gm.A00(c1130158n, true));
            Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
            Modifier A08 = AbstractC118185Wd.A08(A0T, 34.0f);
            if (z) {
                j = AbstractC25227BEk.A0g(c5Tl, -884420701).A0q;
            } else {
                j = AbstractC25227BEk.A0g(c5Tl, -884418333).A0S;
            }
            C117505Tk.A0L(A0K, false);
            Modifier A0V = AbstractC25230BEn.A0V(c5Tl, A08, j);
            InterfaceC1127857k A0a = AbstractC25230BEn.A0a(AbstractC118255Wn.A02, c5Tl);
            int A004 = C5X2.A00(c5Tl);
            C59P A043 = C117505Tk.A04(A0K);
            Modifier A013 = C5X3.A01(c5Tl, A0V);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ2);
            C5XJ.A00(c5Tl, A0a, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A043, A0q) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A004);
            }
            C5XJ.A00(c5Tl, A013, A1K);
            String A005 = C5YD.A00(c5Tl, 2131952630);
            C6GB A014 = C6GA.A01(c5Tl);
            c5Tl.Eno(1365621319);
            if (i3 == 4) {
                z2 = true;
            }
            Object EEc2 = c5Tl.EEc();
            if (z2 || EEc2 == C5UI.A00) {
                EEc2 = new C50157MDk(interfaceC16820sZ, 5);
                c5Tl.FBy(EEc2);
            }
            C6GE.A04(c5Tl, A0T, A014, A005, AbstractC25225BEi.A1A(A0K, EEc2, false));
            c5Tl.ASW();
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(969320069);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30499Dbi.A01(ASZ, interfaceC16820sZ, i, 14);
        }
    }

    public static final void A08(InterfaceC16820sZ interfaceC16820sZ, C5Tl c5Tl, int i) {
        int i2;
        c5Tl.Enr(1948634985);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1962014767, "com.instagram.aistudio.home.view.section.CarouselCreateCardV3 (AiHomeCarouselSection.kt:628)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A0X = AbstractC25226BEj.A0X(AbstractC25235BEs.A0J(C6L7.A03(AbstractC118185Wd.A08(AbstractC118185Wd.A0D(c1130158n, 222.0f), 308.0f), C5WF.A00(), 1.0f, AbstractC25226BEj.A0B(c5Tl))), C5XL.A00(c5Tl).A08);
            c5Tl.Eno(-2093293781);
            int i3 = i2 & 14;
            boolean A1P = AbstractC167007dF.A1P(i3, 4);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = new C50157MDk(interfaceC16820sZ, 6);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Modifier A05 = C5XR.A05(A0X, null, null, (InterfaceC16820sZ) EEc, true);
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, A05);
            InterfaceC16820sZ interfaceC16820sZ2 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ2);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0b, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            Modifier A0D = AbstractC118175Wb.A0D(c1130158n, 16.0f, 47.0f, 16.0f);
            InterfaceC1127857k A0P = AbstractC25235BEs.A0P(c5Tl);
            int A002 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, A0D);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ2);
            C5XJ.A00(c5Tl, A0P, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            C6GM c6gm = C6GM.A00;
            C6LQ.A05(c5Tl, AbstractC118185Wd.A0C(c1130158n, 96.0f), C5Y7.A00(c5Tl, R.drawable.instagram_illustrations_product_illustration_pi_plus_ai_home_96x96, 0));
            String A003 = C5YD.A00(c5Tl, 2131952650);
            long A0H = AbstractC25226BEj.A0H(c5Tl);
            C5WR.A0V(c5Tl, AbstractC118175Wb.A0C(c1130158n, 0.0f, 0.0f, 4.0f), AbstractC25226BEj.A0h(c5Tl), A003, A0H);
            C5WR.A0D(c5Tl, null, AbstractC25225BEi.A0Y(c5Tl), C5YD.A00(c5Tl, 2131952649), 3, 3, 390, 11130, AbstractC25226BEj.A0H(c5Tl));
            AbstractC119685bS.A00(c5Tl, c6gm.A00(c1130158n, true));
            String A004 = C5YD.A00(c5Tl, 2131952630);
            Modifier A0D2 = AbstractC118185Wd.A0D(c1130158n, 91.0f);
            EnumC27399C7c enumC27399C7c = EnumC27399C7c.A05;
            c5Tl.Eno(77277161);
            boolean A1R = AbstractC25230BEn.A1R(i3);
            Object EEc2 = c5Tl.EEc();
            if (A1R || EEc2 == C5UI.A00) {
                EEc2 = new C50157MDk(interfaceC16820sZ, 7);
                c5Tl.FBy(EEc2);
            }
            CGJ.A00(null, c5Tl, A0D2, enumC27399C7c, A004, AbstractC25225BEi.A1A(A0K, EEc2, false), 196614, 88, false, false);
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(103233273);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30499Dbi.A01(ASZ, interfaceC16820sZ, i, 15);
        }
    }
}
