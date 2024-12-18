package X;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.CeS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28340CeS {
    public static final void A00(C5Tl c5Tl, C51740MtP c51740MtP, InterfaceC58202Pr8 interfaceC58202Pr8, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, int i, boolean z) {
        int i2;
        C14360o3.A0B(c51740MtP, 0);
        AbstractC167027dH.A13(interfaceC16820sZ, interfaceC16660sJ, interfaceC16820sZ2);
        C14360o3.A0B(interfaceC58202Pr8, 5);
        c5Tl.Enr(-894383771);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c51740MtP) | i;
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
            i2 |= AbstractC25232BEp.A0f(c5Tl, z);
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25232BEp.A0M(c5Tl, interfaceC58202Pr8);
        }
        if ((74899 & i2) == 74898 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(207615995, "instagram.features.clips.spins.participation.ui.ClipsSpinsAddSpinBottomSheetContent (ClipsSpinsAddSpinBottomSheetContent.kt:41)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A0M = AbstractC25227BEk.A0M(AbstractC25226BEj.A0X(c1130158n, AbstractC25226BEj.A06(c5Tl)), 8.0f);
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0M);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0Y, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C6GM c6gm = C6GM.A00;
            A01(c5Tl, interfaceC58202Pr8, (i2 >> 15) & 14);
            int i3 = i2 >> 6;
            boolean z2 = false;
            A02(c5Tl, interfaceC58202Pr8, interfaceC16820sZ2, interfaceC16660sJ, AbstractC25230BEn.A03(i3) | (i3 & 7168), z);
            String A002 = AbstractC136736Hc.A00(c5Tl, 2131961124);
            Modifier A0G = AbstractC25235BEs.A0G(c6gm, AbstractC25225BEi.A0Q(AbstractC118175Wb.A09(c1130158n, 16.0f)));
            String str = c51740MtP.A00;
            if (str == null || str.length() == 0) {
                z2 = true;
            }
            C6GE.A00(null, c5Tl, A0G, null, C6GD.A02, AbstractC25225BEi.A0u(c5Tl), A002, interfaceC16820sZ, ((i2 >> 3) & 14) | 1572864, 392, !z2, false);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-1177213514);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DV6(c51740MtP, interfaceC16820sZ, interfaceC16660sJ, interfaceC16820sZ2, interfaceC58202Pr8, i, 5, z);
        }
    }

    public static final void A01(C5Tl c5Tl, InterfaceC58202Pr8 interfaceC58202Pr8, int i) {
        int i2;
        c5Tl.Enr(-1504320471);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC58202Pr8) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-56366559, "instagram.features.clips.spins.participation.ui.Title (ClipsSpinsAddSpinBottomSheetContent.kt:61)");
            }
            Modifier A0Q = AbstractC25225BEi.A0Q(AbstractC25227BEk.A0M(Modifier.A00, 8.0f));
            InterfaceC1127857k A00 = C5XX.A00(C118195Wf.A09, false);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0Q);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A00, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C5WR.A0u(c5Tl, AbstractC25225BEi.A0X(c5Tl), AbstractC136736Hc.A00(c5Tl, interfaceC58202Pr8.AZd()), AbstractC25226BEj.A0G(c5Tl));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(249087845);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30498Dbh.A01(ASZ, interfaceC58202Pr8, i, 22);
        }
    }

    public static final void A02(C5Tl c5Tl, InterfaceC58202Pr8 interfaceC58202Pr8, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, int i, boolean z) {
        int i2;
        c5Tl.Enr(-361604527);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16660sJ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0d(c5Tl, z);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC58202Pr8);
        }
        if ((i2 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(503086855, "instagram.features.clips.spins.participation.ui.SpinTextInput (ClipsSpinsAddSpinBottomSheetContent.kt:76)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -1461162134);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                A0q = AbstractC25232BEp.A0w(c5Tl, "");
            }
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) A0q;
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            C25338BJh c25338BJh = (C25338BJh) AbstractC25236BEt.A0V(c5Tl, obj, -1461160120);
            C1130158n A0O = AbstractC25225BEi.A0O(c117505Tk);
            FillElement fillElement = AbstractC118185Wd.A02;
            Modifier Eq3 = A0O.Eq3(fillElement);
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, Eq3);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0Y, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            String A1D = AbstractC25226BEj.A1D(interfaceC74953Yl);
            String A002 = AbstractC136736Hc.A00(c5Tl, interfaceC58202Pr8.AZc());
            Modifier A0X = AbstractC25230BEn.A0X(A0O, c25338BJh);
            boolean z2 = true;
            Modifier Eq32 = A0X.Eq3(fillElement);
            boolean A1X = AbstractC25234BEr.A1X(c5Tl, -87929804, i2);
            Object EEc = c5Tl.EEc();
            if (A1X || EEc == obj) {
                EEc = C30170DRa.A00(interfaceC74953Yl, interfaceC16660sJ, 22);
                c5Tl.FBy(EEc);
            }
            AbstractC28505Chy.A05(c5Tl, Eq32, null, false, A1D, A002, AbstractC25225BEi.A1B(c117505Tk, EEc, false), 3, 1572864, 48, 63408);
            C5C8 A003 = CG5.A00(c5Tl, interfaceC58202Pr8.AZb(z));
            c5Tl.Eno(-87914553);
            if ((i2 & 112) != 32) {
                z2 = false;
            }
            Object EEc2 = c5Tl.EEc();
            if (z2 || EEc2 == obj) {
                EEc2 = DRR.A00(interfaceC16820sZ, 7);
                c5Tl.FBy(EEc2);
            }
            AbstractC28303Cdp.A01(c5Tl, null, A003, AbstractC25225BEi.A1B(c117505Tk, EEc2, false), 0, 2);
            c5Tl.ASW();
            C0eB c0eB = C0eB.A00;
            Object A0q2 = AbstractC25227BEk.A0q(c5Tl, -1461135980);
            if (A0q2 == obj) {
                A0q2 = new D4r(c25338BJh, null, 18);
                c5Tl.FBy(A0q2);
            }
            if (AbstractC25232BEp.A1V(c5Tl, c117505Tk, A0q2, c0eB, false)) {
                C0fH.A00(2109433766);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DTY(interfaceC16820sZ, interfaceC16660sJ, interfaceC58202Pr8, i, 11, z);
        }
    }
}
