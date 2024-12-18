package X;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikConstants;
import com.facebook.common.dextricks.DalvikInternals;

/* loaded from: classes5.dex */
public abstract class CXJ {
    public static final void A00(C5Tl c5Tl, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4) {
        int i4;
        int i5;
        boolean A1R = AbstractC167007dF.A1R(0, str, interfaceC16660sJ);
        AbstractC25234BEr.A0k(4, interfaceC16660sJ2, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3);
        C14360o3.A0B(interfaceC16820sZ4, 8);
        c5Tl.Enr(-1172898330);
        if ((i2 & 6) == 0) {
            i4 = AbstractC25232BEp.A0R(c5Tl, str) | i2;
        } else {
            i4 = i2;
        }
        int i6 = 32;
        if ((i2 & 48) == 0) {
            i4 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & 384) == 0) {
            i4 |= AbstractC25232BEp.A0d(c5Tl, z);
        }
        if ((i2 & 3072) == 0) {
            i4 |= AbstractC25232BEp.A0e(c5Tl, z2);
        }
        if ((i2 & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i4 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16660sJ2);
        }
        if ((196608 & i2) == 0) {
            i4 |= AbstractC25232BEp.A0M(c5Tl, interfaceC16820sZ);
        }
        if ((1572864 & i2) == 0) {
            i4 |= AbstractC25232BEp.A0N(c5Tl, interfaceC16820sZ2);
        }
        if ((12582912 & i2) == 0) {
            i4 |= AbstractC25232BEp.A0O(c5Tl, interfaceC16820sZ3);
        }
        if ((100663296 & i2) == 0) {
            i4 |= AbstractC25232BEp.A0P(c5Tl, interfaceC16820sZ4);
        }
        if ((805306368 & i2) == 0) {
            i4 |= AbstractC25229BEm.A01(c5Tl.AH2(i) ? 1 : 0);
        }
        if ((i3 & 48) == 0) {
            if (!c5Tl.AH5(z4)) {
                i6 = 16;
            }
            i5 = i3 | i6;
        } else {
            i5 = i3;
        }
        if ((i4 & 306783379) == 306783378 && (i5 & 17) == 16 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-565253229, "com.instagram.aistudio.editor.AiEditInstructionScreen (AiEditInstructionScreen.kt:46)");
            }
            c5Tl.Eno(-34575751);
            if (z4) {
                Boolean valueOf = Boolean.valueOf(z2);
                c5Tl.Eno(-34573802);
                boolean A1W = AbstractC25234BEr.A1W(i4) | AbstractC25233BEq.A1K(i4);
                Object EEc = c5Tl.EEc();
                if (A1W || EEc == C5UI.A00) {
                    EEc = new PYw(interfaceC16660sJ2, null, 3, z2);
                    c5Tl.FBy(EEc);
                }
                AbstractC25231BEo.A10(c5Tl, EEc, valueOf);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C28729CmL A00 = AbstractC28285CdX.A00(c5Tl);
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -34569872);
            Object obj = C5UI.A00;
            InterfaceC74953Yl A0M = AbstractC25225BEi.A0M(A0K, AbstractC25234BEr.A0c(c5Tl, A0q, obj, false), false);
            Object AJX = c5Tl.AJX(C5V2.A0A);
            C1130158n c1130158n = Modifier.A00;
            Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
            FillElement fillElement = AbstractC118185Wd.A00;
            Modifier A01 = AbstractC28285CdX.A01(A00, C30711Df9.A00(A0T.Eq3(fillElement), C5XU.A00, 0));
            boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, AJX, -34559316);
            Object EEc2 = c5Tl.EEc();
            if (A1Y || EEc2 == obj) {
                EEc2 = C29909DGx.A01(AJX, 45);
                c5Tl.FBy(EEc2);
            }
            Modifier A05 = C5XR.A05(A01, null, null, AbstractC25225BEi.A1A(A0K, EEc2, false), z4);
            InterfaceC118305Ws interfaceC118305Ws = AbstractC118255Wn.A07;
            InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A02;
            InterfaceC1127857k A02 = AbstractC119595bH.A02(interfaceC118305Ws, c5Tl, interfaceC118245Wl, 0);
            int A002 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, A05);
            InterfaceC16820sZ interfaceC16820sZ5 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ5);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q2 = AbstractC25229BEm.A0q(c5Tl, A02, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A012);
            CXK.A00(c5Tl, (i5 & 112) | 384, A1R ? 1 : 0, false, z4, false);
            Modifier A0A = AbstractC118175Wb.A0A(A0T.Eq3(fillElement), 0.0f, 16.0f);
            InterfaceC1127857k A022 = AbstractC119595bH.A02(interfaceC118305Ws, c5Tl, interfaceC118245Wl, 0);
            int A003 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A013 = C5X3.A01(c5Tl, A0A);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ5);
            C5XJ.A00(c5Tl, A022, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A042, A0q2) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
            }
            C5XJ.A00(c5Tl, A013, A1K);
            String A004 = C5YD.A00(c5Tl, 2131952774);
            C5WR.A0Y(c5Tl, AbstractC118175Wb.A0E(A0T, 16.0f, 0.0f, 16.0f, 14.0f), AbstractC25226BEj.A0c(c5Tl), A004, AbstractC25226BEj.A0M(c5Tl));
            AbstractC28505Chy.A04(c5Tl, AbstractC118175Wb.A0E(c1130158n, 0.0f, 0.0f, 0.0f, 16.0f), null, Boolean.valueOf(A1R), Integer.valueOf(i), str, C5YD.A00(c5Tl, 2131952791), interfaceC16660sJ, 4, 4, (i4 & 14) | 1772544 | (i4 & 112), ((i4 >> 21) & 896) | 48, 59280);
            c5Tl.Eno(1085183583);
            if (z) {
                String A005 = C5YD.A00(c5Tl, 2131952765);
                C6N c6n = C6N.A03;
                c5Tl.Eno(1085190204);
                boolean A1U = AbstractC25234BEr.A1U(i4);
                Object EEc3 = c5Tl.EEc();
                if (A1U || EEc3 == obj) {
                    EEc3 = new C29898DGm(35, interfaceC16820sZ, A0M);
                    c5Tl.FBy(EEc3);
                }
                CGM.A00(c5Tl, null, c6n, A005, AbstractC25225BEi.A1A(A0K, EEc3, false), 3072, 20, false);
            }
            AbstractC25230BEn.A16(c5Tl, A0K);
            if (AbstractC25230BEn.A1X(A0M)) {
                interfaceC16820sZ2.invoke();
                Object A0q3 = AbstractC25227BEk.A0q(c5Tl, -34513293);
                if (A0q3 == obj) {
                    A0q3 = C29909DGx.A01(A0M, 46);
                    c5Tl.FBy(A0q3);
                }
                InterfaceC16820sZ A1A = AbstractC25225BEi.A1A(A0K, A0q3, false);
                c5Tl.Eno(-34510998);
                boolean A1P = AbstractC167007dF.A1P(i4 & 29360128, DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE);
                Object EEc4 = c5Tl.EEc();
                if (A1P || EEc4 == obj) {
                    EEc4 = C29909DGx.A01(interfaceC16820sZ3, 47);
                    c5Tl.FBy(EEc4);
                }
                A01(c5Tl, A1A, AbstractC25225BEi.A1A(A0K, EEc4, false), interfaceC16820sZ4, ((i4 >> 18) & 896) | 6);
            }
            if (C0fH.A02()) {
                C0fH.A00(1606844051);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DXZ(str, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4, interfaceC16660sJ, interfaceC16660sJ2, i, i2, i3, z, z2, z3, z4);
        }
    }

    public static final void A01(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, int i) {
        int i2;
        c5Tl.Enr(-1323499950);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ2);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ3);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-400335595, "com.instagram.aistudio.editor.ConfirmDeletionDialog (AiEditInstructionScreen.kt:106)");
            }
            c5Tl.Eno(606891376);
            int i3 = i2 & 14;
            boolean z = true;
            boolean A1P = AbstractC167007dF.A1P(i3, 4);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = C29909DGx.A01(interfaceC16820sZ, 48);
                c5Tl.FBy(EEc);
            }
            InterfaceC16820sZ interfaceC16820sZ4 = (InterfaceC16820sZ) EEc;
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            String A00 = C5YD.A00(c5Tl, 2131952766);
            C26079Bg8 A002 = CGH.A00(c5Tl, C05F.A0C, interfaceC16820sZ2, 2131957640, 12);
            boolean A1Q = AbstractC25233BEq.A1Q(c5Tl, 606904632, i2);
            if (i3 != 4) {
                z = false;
            }
            boolean z2 = A1Q | z;
            Object EEc2 = c5Tl.EEc();
            if (z2 || EEc2 == C5UI.A00) {
                EEc2 = C29898DGm.A00(c5Tl, interfaceC16820sZ3, interfaceC16820sZ, 36);
            }
            AbstractC28433Cgh.A03(c5Tl, A002, CGH.A00(c5Tl, null, AbstractC25225BEi.A1A(A0K, EEc2, false), 2131954754, 14), A00, null, interfaceC16820sZ4, 0, 4068);
            if (C0fH.A02()) {
                C0fH.A00(1511397913);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30509Dbs(interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, i, 7);
        }
    }
}
