package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public abstract class CIB {
    public static final void A00(C5Tl c5Tl, MUG mug, BP5 bp5, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i, int i2) {
        int i3;
        InterfaceC16820sZ interfaceC16820sZ3 = interfaceC16820sZ2;
        InterfaceC16820sZ interfaceC16820sZ4 = interfaceC16820sZ;
        AbstractC167007dF.A1K(mug, bp5);
        c5Tl.Enr(-1654534157);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, mug) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, bp5);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ4);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ3);
        }
        if ((i3 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                interfaceC16820sZ4 = C29765DBj.A00;
            }
            if (i5 != 0) {
                interfaceC16820sZ3 = C29766DBk.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-1109403665, "com.instagram.creator.agent.settings.audience.Layout (ReachabilityFragment.kt:105)");
            }
            C0eB c0eB = C0eB.A00;
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, bp5, -1386443442);
            Object EEc = c5Tl.EEc();
            if (A1Z || EEc == C5UI.A00) {
                EEc = AbstractC25235BEs.A0u(c5Tl, bp5, 14);
            }
            C117505Tk A0E = AbstractC25235BEs.A0E(c5Tl, EEc, c0eB);
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0E);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A11(c5Tl, A0E);
            AbstractC25231BEo.A12(c5Tl, A0Y, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0E.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C6GM c6gm = C6GM.A00;
            String A012 = BHY.A01(c5Tl, (C5QE) mug.A00);
            C5WR.A06(c5Tl, AbstractC118175Wb.A0D(c6gm.A00(c1130158n, false), 16.0f, 20.0f, 36.0f), AbstractC25226BEj.A0c(c5Tl), A012);
            String A013 = BHY.A01(c5Tl, (C5QE) mug.A03);
            boolean A1Z2 = AbstractC25227BEk.A1Z(c5Tl, bp5, -1803365112) | AbstractC25232BEp.A1S(i3 & 896);
            Object EEc2 = c5Tl.EEc();
            if (A1Z2 || EEc2 == C5UI.A00) {
                EEc2 = C29894DGi.A00(c5Tl, interfaceC16820sZ4, bp5, 29);
            }
            InterfaceC16820sZ A1A = AbstractC25225BEi.A1A(A0E, EEc2, false);
            boolean z = mug.A01;
            String A002 = C5YD.A00(c5Tl, 2131966369);
            boolean A1Z3 = AbstractC25227BEk.A1Z(c5Tl, bp5, -1803357270) | AbstractC25235BEs.A1T(i3);
            Object EEc3 = c5Tl.EEc();
            if (A1Z3 || EEc3 == C5UI.A00) {
                EEc3 = new C29894DGi(30, interfaceC16820sZ3, bp5);
                c5Tl.FBy(EEc3);
            }
            AbstractC28506Chz.A02(c5Tl, null, null, A013, A002, A1A, AbstractC25225BEi.A1A(A0E, EEc3, false), 0, 0, 32652, false, z);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1464743014);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30492Dbb(mug, interfaceC16820sZ3, interfaceC16820sZ4, bp5, i, i2, 15);
        }
    }
}
