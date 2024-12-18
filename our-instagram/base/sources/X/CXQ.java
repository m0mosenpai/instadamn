package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikInternals;

/* loaded from: classes5.dex */
public abstract class CXQ {
    public static final void A00(C5Tl c5Tl, C50726MaR c50726MaR, C28370CfW c28370CfW, InterfaceC16620sF interfaceC16620sF, InterfaceC16610sE interfaceC16610sE, int i) {
        int i2;
        boolean A1R = AbstractC167007dF.A1R(0, c50726MaR, c28370CfW);
        int A07 = AbstractC25230BEn.A07(2, interfaceC16610sE, interfaceC16620sF);
        c5Tl.Enr(-122789806);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c50726MaR) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, c28370CfW);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16610sE);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16620sF);
        }
        if ((i2 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-797253229, "com.instagram.aistudio.home.view.section.AiHomeContinueChattingSection (AiHomeContinueChattingSection.kt:52)");
            }
            LazyListState A00 = C6IE.A00(c5Tl, 0, 0, 0, A07);
            C6GU A002 = C6GO.A00(A00, c5Tl);
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A003 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0Y, A04, interfaceC16620sF2);
            InterfaceC16620sF interfaceC16620sF3 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A003);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            InterfaceC1127857k A0d = AbstractC25228BEl.A0d(c5Tl);
            int A004 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A0d, interfaceC16620sF2);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A004);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            C6L0 c6l0 = C6L0.A00;
            C26003Ber c26003Ber = (C26003Ber) c50726MaR.A02;
            String str = c26003Ber.A03;
            long A0G = AbstractC25226BEj.A0G(c5Tl);
            C5WR.A0R(c5Tl, c6l0.A00(AbstractC118175Wb.A0A(c1130158n, 16.0f, 14.0f)), AbstractC25226BEj.A0e(c5Tl), str, A0G);
            c5Tl.Eno(1660648501);
            if (c26003Ber.A06) {
                CD2.A00(c5Tl, c28370CfW, str, (i2 >> 3) & 14);
                String A005 = C5YD.A00(c5Tl, 2131952638);
                long A0N = AbstractC25226BEj.A0N(c5Tl);
                C118125Vw A0X = AbstractC25225BEi.A0X(c5Tl);
                Modifier A0I = AbstractC25227BEk.A0I(c1130158n, 16.0f);
                boolean A1b = AbstractC25232BEp.A1b(c5Tl, c50726MaR, c28370CfW, AbstractC25234BEr.A1a(c5Tl, 1660659900, i2));
                Object EEc = c5Tl.EEc();
                if (A1b || EEc == C5UI.A00) {
                    EEc = AbstractC25229BEm.A10(c5Tl, c28370CfW, interfaceC16620sF, c50726MaR, 31);
                }
                C5WR.A0R(c5Tl, C5XR.A05(A0I, null, null, AbstractC25225BEi.A1A(c117505Tk, EEc, false), A1R), A0X, A005, A0N);
            }
            C117505Tk.A0L(c117505Tk, false);
            c5Tl.ASW();
            Modifier A0E = AbstractC118175Wb.A0E(c1130158n, 0.0f, 0.0f, 0.0f, 12.0f);
            C6ID A013 = AbstractC118255Wn.A01(12.0f);
            C1333560c c1333560c = new C1333560c(12.0f, 0.0f, 12.0f, 0.0f);
            boolean A1J = AbstractC25233BEq.A1J(i2) | AbstractC25233BEq.A1W(c5Tl, c50726MaR, c28370CfW, -1148011290);
            Object EEc2 = c5Tl.EEc();
            if (A1J || EEc2 == C5UI.A00) {
                EEc2 = new DHZ(49, c28370CfW, c50726MaR, interfaceC16610sE);
                c5Tl.FBy(EEc2);
            }
            C6IS.A00(A002, A013, c1333560c, A00, c5Tl, null, A0E, AbstractC25225BEi.A1B(c117505Tk, EEc2, false), 12607878, 40, false, A1R);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-553117835);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30491Dba(c50726MaR, interfaceC16610sE, c28370CfW, interfaceC16620sF, i, 2);
        }
    }

    public static final void A01(C5Tl c5Tl, C26021BfA c26021BfA, C26003Ber c26003Ber, C28370CfW c28370CfW, InterfaceC16610sE interfaceC16610sE, int i, int i2) {
        int i3;
        c5Tl.Enr(-801643751);
        if ((i2 & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, c26021BfA) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, c26003Ber);
        }
        if ((i2 & 384) == 0) {
            i3 |= AbstractC25236BEt.A03(c5Tl, i);
        }
        if ((i2 & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, c28370CfW);
        }
        if ((i2 & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16610sE);
        }
        if ((i3 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1057689848, "com.instagram.aistudio.home.view.section.ContinueChattingCard (AiHomeContinueChattingSection.kt:99)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A08 = AbstractC118185Wd.A08(AbstractC118185Wd.A0D(c1130158n, 153.0f), 164.0f);
            C5WI A00 = C5WF.A00();
            boolean A1O = AbstractC25230BEn.A1O(12.0f);
            long j = AbstractC1132259k.A00;
            Modifier A0x = AbstractC25232BEp.A0x(c5Tl, AbstractC25235BEs.A0J(AbstractC28015CWn.A01(A08, A00, 12.0f, j, j, A1O)));
            c5Tl.Eno(-1050874052);
            boolean z = true;
            boolean A1X = AbstractC25226BEj.A1X(c5Tl, c26021BfA, AbstractC167007dF.A1P(57344 & i3, Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET));
            if ((i3 & 896) != 256) {
                z = false;
            }
            boolean A1U = AbstractC25228BEl.A1U(c5Tl, c26003Ber, A1X, z);
            Object EEc = c5Tl.EEc();
            if (A1U || EEc == C5UI.A00) {
                EEc = new MHX(i, 10, c26021BfA, interfaceC16610sE, c26003Ber);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Modifier A05 = C5XR.A05(A0x, null, null, (InterfaceC16820sZ) EEc, true);
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A002 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, A05);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0b, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            String str = c26021BfA.A07;
            AbstractC27461CAe abstractC27461CAe = c26021BfA.A00;
            String A012 = abstractC27461CAe.A01();
            String str2 = c26021BfA.A06;
            String str3 = c26003Ber.A03;
            Integer valueOf = Integer.valueOf(c26003Ber.A00);
            CD1.A00(c5Tl, c28370CfW, abstractC27461CAe.A00(), c26003Ber.A01, valueOf, str, A012, str2, "home", str3, abstractC27461CAe.A02(), i, ((i3 >> 9) & 14) | 196608 | ((i3 >> 3) & 112), 0, 0);
            Modifier A0E = AbstractC118175Wb.A0E(c1130158n, 28.5f, 12.0f, 28.5f, 0.0f);
            InterfaceC1127857k A0P = AbstractC25235BEs.A0P(c5Tl);
            int A003 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A013 = C5X3.A01(c5Tl, A0E);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A0P, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
            }
            C5XJ.A00(c5Tl, A013, A1K);
            C6LQ.A03(c5Tl, AbstractC118185Wd.A0C(AbstractC25226BEj.A0W(c1130158n), 96.0f), AbstractC25235BEs.A0d(c5Tl, c26021BfA.A04));
            C5WR.A0V(c5Tl, AbstractC118175Wb.A07(c1130158n), AbstractC25226BEj.A0h(c5Tl), str2, AbstractC25226BEj.A0G(c5Tl));
            String str4 = c26021BfA.A05;
            c5Tl.Eno(-668989759);
            if (str4 != null) {
                C5WR.A0V(c5Tl, AbstractC118175Wb.A0E(c1130158n, 0.0f, 2.0f, 0.0f, 0.0f), AbstractC25225BEi.A0Y(c5Tl), str4, AbstractC25226BEj.A0M(c5Tl));
            }
            if (AbstractC25233BEq.A1S(c5Tl, A0K)) {
                C0fH.A00(-1071100568);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30492Dbb(interfaceC16610sE, c26003Ber, c26021BfA, c28370CfW, i2, i, 5);
        }
    }
}
