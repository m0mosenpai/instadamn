package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;

/* loaded from: classes5.dex */
public abstract class CCX {
    public static final void A00(C5Tl c5Tl, C26061Bfo c26061Bfo, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16620sF interfaceC16620sF, int i) {
        int i2;
        C14360o3.A0B(c26061Bfo, 0);
        AbstractC167027dH.A0a(1, interfaceC16660sJ, interfaceC16620sF, interfaceC16820sZ, interfaceC16660sJ2);
        c5Tl.Enr(-1671042256);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c26061Bfo) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16620sF);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16660sJ2);
        }
        if ((i2 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1856346631, "com.instagram.aistudio.editor.AdvancedEditScreen (AdvancedEditScreen.kt:48)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -1254359436);
            Object obj = C5UI.A00;
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) AbstractC25234BEr.A0c(c5Tl, A0q, obj, false);
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C25338BJh c25338BJh = (C25338BJh) AbstractC25236BEt.A0V(c5Tl, obj, -1254357585);
            C117505Tk.A0L(A0K, false);
            Object AJX = c5Tl.AJX(C5V2.A02);
            Object AJX2 = c5Tl.AJX(C5V2.A0A);
            C1130158n c1130158n = Modifier.A00;
            Modifier A0U = AbstractC25226BEj.A0U(c1130158n);
            InterfaceC118305Ws interfaceC118305Ws = AbstractC118255Wn.A07;
            InterfaceC1127857k A02 = AbstractC119595bH.A02(interfaceC118305Ws, c5Tl, C118195Wf.A02, 0);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, A0U);
            InterfaceC16820sZ interfaceC16820sZ2 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ2);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A03;
            InterfaceC16620sF A0q2 = AbstractC25229BEm.A0q(c5Tl, A02, A04, interfaceC16620sF2);
            InterfaceC16620sF interfaceC16620sF3 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            Modifier A002 = C6GM.A00.A00(c1130158n, true);
            long A09 = AbstractC25226BEj.A09(c5Tl);
            C5AH c5ah = C5AF.A00;
            Modifier A0X = AbstractC25230BEn.A0X(AbstractC28285CdX.A02(c5Tl, C30711Df9.A00(C6L3.A01(A002, c5ah, A09), C5XU.A00, 0)), c25338BJh);
            C0eB c0eB = C0eB.A00;
            boolean A1X = AbstractC25232BEp.A1X(c5Tl, AJX, AJX2, 1045531143);
            Object EEc = c5Tl.EEc();
            if (A1X || EEc == obj) {
                EEc = new C57172PZq(AJX, AJX2, (InterfaceC23621Ds) null, 49);
                c5Tl.FBy(EEc);
            }
            Modifier A0U2 = AbstractC25229BEm.A0U(A0K, A0X, EEc, c0eB, false);
            InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A00;
            InterfaceC1127857k A003 = AbstractC119595bH.A00(interfaceC118305Ws, c5Tl, interfaceC118245Wl);
            int A004 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, A0U2);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ2);
            C5XJ.A00(c5Tl, A003, interfaceC16620sF2);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A042, A0q2) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A004);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            Modifier A0E = AbstractC118175Wb.A0E(AbstractC25226BEj.A0T(c1130158n), 46.0f, 24.0f, 46.0f, 0.0f);
            InterfaceC1127857k A022 = AbstractC119595bH.A02(AbstractC118255Wn.A03(C118195Wf.A05, 20.0f), c5Tl, interfaceC118245Wl, 54);
            int A005 = C5X2.A00(c5Tl);
            C59P A043 = C117505Tk.A04(A0K);
            Modifier A013 = C5X3.A01(c5Tl, A0E);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ2);
            C5XJ.A00(c5Tl, A022, interfaceC16620sF2);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A043, A0q2) || !AbstractC25231BEo.A1O(c5Tl, A005)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A005);
            }
            C5XJ.A00(c5Tl, A013, A1K);
            InterfaceC30794DgV interfaceC30794DgV = (InterfaceC30794DgV) c26061Bfo.A03;
            InterfaceC30795DgW interfaceC30795DgW = (InterfaceC30795DgW) c26061Bfo.A04;
            String str = c26061Bfo.A06;
            InterfaceC30796DgX interfaceC30796DgX = (InterfaceC30796DgX) c26061Bfo.A05;
            InterfaceC30793DgU interfaceC30793DgU = (InterfaceC30793DgU) c26061Bfo.A02;
            C5Hc A006 = AbstractC133095zb.A00((Iterable) c26061Bfo.A01);
            boolean z = c26061Bfo.A0A;
            boolean A1X2 = AbstractC25226BEj.A1X(c5Tl, c26061Bfo, AbstractC25234BEr.A1Y(c5Tl, -210646763, i2));
            Object EEc2 = c5Tl.EEc();
            if (A1X2 || EEc2 == obj) {
                EEc2 = C29898DGm.A00(c5Tl, interfaceC16660sJ, c26061Bfo, 8);
            }
            CCW.A00(c5Tl, interfaceC30793DgU, interfaceC30794DgV, interfaceC30795DgW, interfaceC30796DgX, str, AbstractC25225BEi.A1A(A0K, EEc2, false), interfaceC16660sJ2, A006, 0.6f, ((i2 << 12) & 234881024) | 805306368, 0, 0, z, AbstractC25230BEn.A1X(interfaceC74953Yl));
            Object A0q3 = AbstractC25227BEk.A0q(c5Tl, -210638323);
            if (A0q3 == obj) {
                A0q3 = AbstractC25232BEp.A0w(c5Tl, 0);
            }
            C117505Tk.A0L(A0K, false);
            AnonymousClass693 A007 = CXO.A00(c5Tl);
            C19L c19l = ((C137536Kz) AbstractC25234BEr.A0b(c5Tl, c5Tl.EEc(), obj)).A00;
            String str2 = c26061Bfo.A09;
            c5Tl.Eno(-210631645);
            if (str2 != null) {
                Modifier A03 = AbstractC118175Wb.A03(C6L3.A01(AbstractC25231BEo.A0R(c1130158n, 44.0f), c5ah, C5XL.A00(c5Tl).A0f));
                boolean A1V = AbstractC25228BEl.A1V(c5Tl, str2, AbstractC167007dF.A1P(i2 & 896, 256), AbstractC25233BEq.A1W(c5Tl, A007, c19l, -838328316));
                Object EEc3 = c5Tl.EEc();
                if (A1V || EEc3 == obj) {
                    EEc3 = new MHZ(A0q3, A007, c19l, interfaceC16620sF, interfaceC74953Yl, str2, 0);
                    c5Tl.FBy(EEc3);
                }
                Modifier A05 = C5XR.A05(A03, null, null, AbstractC25225BEi.A1A(A0K, EEc3, false), z);
                InterfaceC1127857k A023 = AbstractC118375Wz.A02(AbstractC118255Wn.A02, c5Tl, C118195Wf.A04, 54);
                int A008 = C5X2.A00(c5Tl);
                C59P A044 = C117505Tk.A04(A0K);
                Modifier A014 = C5X3.A01(c5Tl, A05);
                AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ2);
                C5XJ.A00(c5Tl, A023, interfaceC16620sF2);
                if (AbstractC25225BEi.A1W(c5Tl, A0K, A044, A0q2) || !AbstractC25231BEo.A1O(c5Tl, A008)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A008);
                }
                C5XJ.A00(c5Tl, A014, A1K);
                C6LQ.A00(c5Tl, null, null, null, C5Y9.A00(A007, c5Tl), null, C5YD.A00(c5Tl, 2131952714), 0.0f, 0, 124);
                c5Tl.ASW();
            }
            AbstractC25230BEn.A16(c5Tl, A0K);
            String A009 = C5YD.A00(c5Tl, 2131952693);
            boolean A1a = AbstractC25234BEr.A1a(c5Tl, 1045627280, i2);
            Object EEc4 = c5Tl.EEc();
            if (A1a || EEc4 == obj) {
                EEc4 = DGW.A00(interfaceC16820sZ, 10);
                c5Tl.FBy(EEc4);
            }
            AbstractC28506Chz.A06(c5Tl, null, A009, AbstractC25225BEi.A1A(A0K, EEc4, false), 0, 3072, 24564, z);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(699839020);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUL(i, 1, c26061Bfo, interfaceC16660sJ2, interfaceC16820sZ, interfaceC16620sF, interfaceC16660sJ);
        }
    }
}
