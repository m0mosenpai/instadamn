package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;

/* loaded from: classes5.dex */
public abstract class CE1 {
    public static final void A00(C5Tl c5Tl, Modifier modifier, C28357CfH c28357CfH, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, InterfaceC16620sF interfaceC16620sF, int i) {
        int i2;
        C14360o3.A0B(c28357CfH, 0);
        AbstractC25233BEq.A0v(1, interfaceC16820sZ, interfaceC16660sJ, interfaceC16820sZ2);
        AbstractC25234BEr.A0k(4, interfaceC16660sJ2, interfaceC16660sJ3, modifier, interfaceC16620sF);
        c5Tl.Enr(-498761527);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c28357CfH) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16660sJ);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ2);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16660sJ2);
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25232BEp.A0M(c5Tl, interfaceC16660sJ3);
        }
        if ((1572864 & i) == 0) {
            i2 |= AbstractC25232BEp.A0X(c5Tl, modifier);
        }
        if ((12582912 & i) == 0) {
            i2 |= AbstractC25232BEp.A0O(c5Tl, interfaceC16620sF);
        }
        if ((4793491 & i2) == 4793490 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1099225782, "com.instagram.barcelona.feed.mediaviewer.ui.DismissableMediaBox (DismissableMediaBox.kt:26)");
            }
            CQ6 cq6 = c28357CfH.A07;
            boolean z = !AbstractC25231BEo.A1U(c28357CfH.A06);
            boolean A1I = AbstractC25233BEq.A1I(i2) | AbstractC25233BEq.A1Q(c5Tl, -1185804499, i2);
            Object EEc = c5Tl.EEc();
            if (A1I || EEc == C5UI.A00) {
                EEc = AbstractC25230BEn.A12(c5Tl, interfaceC16820sZ, interfaceC16660sJ, 41);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            AbstractC167007dF.A1E(cq6, 1, EEc);
            Modifier A00 = C6KX.A00(modifier, Boolean.valueOf(z), new C50533MSm(cq6, z, EEc, (InterfaceC23621Ds) null, 2));
            L4Q l4q = c28357CfH.A08;
            c5Tl.Eno(-1185797213);
            int i3 = i2 & 14;
            boolean A1P = AbstractC167007dF.A1P(i3, 4);
            Object EEc2 = c5Tl.EEc();
            if (A1P || EEc2 == C5UI.A00) {
                EEc2 = AbstractC25235BEs.A12(c5Tl, c28357CfH, 20);
            }
            InterfaceC16820sZ A1A = AbstractC25225BEi.A1A(A0K, EEc2, false);
            C14360o3.A0B(A00, 0);
            C14360o3.A0B(l4q, 1);
            C14360o3.A0B(A1A, 2);
            Modifier A02 = C5X3.A02(A00, C5XU.A00, new C30513Dbw(l4q, A1A));
            boolean A1U = AbstractC25232BEp.A1U(c5Tl, -1185792493, i3, 4);
            Object EEc3 = c5Tl.EEc();
            if (A1U || EEc3 == C5UI.A00) {
                EEc3 = AbstractC25229BEm.A0w(c5Tl, c28357CfH, 31);
            }
            C117505Tk.A0L(A0K, false);
            C14360o3.A0B(A02, 0);
            C14360o3.A0B(EEc3, 1);
            Modifier A002 = C6KX.A00(A02, C0eB.A00, new JTH(EEc3, interfaceC16660sJ3, interfaceC16660sJ2, interfaceC16820sZ2, (InterfaceC23621Ds) null, 16));
            boolean A1U2 = AbstractC25232BEp.A1U(c5Tl, -1185783728, i3, 4);
            Object EEc4 = c5Tl.EEc();
            if (A1U2 || EEc4 == C5UI.A00) {
                EEc4 = new C28825Cnv(c28357CfH, 0);
                c5Tl.FBy(EEc4);
            }
            C117505Tk.A0L(A0K, false);
            int i4 = (i2 >> 21) & 14;
            int A003 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, A002);
            int i5 = ((i4 << 6) & 896) | 6;
            AbstractC25233BEq.A12(c5Tl, A0K, C5X8.A00);
            AbstractC25231BEo.A12(c5Tl, EEc4, A04);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            AbstractC25231BEo.A14(c5Tl, interfaceC16620sF, i5 >> 6);
            if (C0fH.A02()) {
                C0fH.A00(744173197);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DWQ(interfaceC16620sF, modifier, c28357CfH, interfaceC16820sZ2, interfaceC16660sJ2, interfaceC16660sJ3, interfaceC16660sJ, interfaceC16820sZ, i, 1);
        }
    }
}
