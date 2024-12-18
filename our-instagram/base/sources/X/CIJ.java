package X;

import androidx.compose.foundation.gestures.DraggableElement;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public abstract class CIJ {
    public static final void A00(C5Tl c5Tl, Alignment alignment, Modifier modifier, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, int i, int i2) {
        int i3;
        Alignment alignment2 = alignment;
        Modifier modifier2 = modifier;
        AbstractC167017dG.A1R(interfaceC16620sF, interfaceC16620sF2);
        c5Tl.Enr(-18731858);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, modifier2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, alignment2);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16620sF);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16620sF2);
        }
        if ((i3 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i5 != 0) {
                alignment2 = C118195Wf.A0A;
            }
            if (C0fH.A02()) {
                C0fH.A01(-1223653364, "com.instagram.creator.agent.settings.swipablerow.SwipeableRow (SwipeableRow.kt:30)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -733290411);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                A0q = AbstractC25232BEp.A0w(c5Tl, Float.valueOf(0.0f));
            }
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) A0q;
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            Object A0q2 = AbstractC25227BEk.A0q(c5Tl, -733288879);
            if (A0q2 == obj) {
                A0q2 = AbstractC118385Xa.A00(0.0f);
                c5Tl.FBy(A0q2);
            }
            C5Y1 c5y1 = (C5Y1) A0q2;
            C117505Tk.A0L(c117505Tk, false);
            C19L c19l = ((C137536Kz) AbstractC25234BEr.A0b(c5Tl, c5Tl.EEc(), obj)).A00;
            Alignment alignment3 = C118195Wf.A0E;
            InterfaceC1127857k A00 = C5XX.A00(alignment3, false);
            int A002 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, modifier2);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF3 = C5X8.A03;
            InterfaceC16620sF A0q3 = AbstractC25229BEm.A0q(c5Tl, A00, A04, interfaceC16620sF3);
            InterfaceC16620sF interfaceC16620sF4 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF4, A002);
            }
            InterfaceC16620sF interfaceC16620sF5 = C5X8.A04;
            C5XJ.A00(c5Tl, A01, interfaceC16620sF5);
            C119645bN c119645bN = C119645bN.A00;
            C1130158n c1130158n = Modifier.A00;
            Object A0q4 = AbstractC25227BEk.A0q(c5Tl, 1350740608);
            if (A0q4 == obj) {
                A0q4 = AbstractC25235BEs.A17(c5Tl, interfaceC74953Yl, 39);
            }
            Modifier AB5 = c119645bN.AB5(alignment2, AbstractC25233BEq.A0B(c117505Tk, c1130158n, A0q4));
            InterfaceC1127857k A003 = C5XX.A00(alignment3, false);
            int A004 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, AB5);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A003, interfaceC16620sF3);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q3) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF4, A004);
            }
            C5XJ.A00(c5Tl, A012, interfaceC16620sF5);
            AbstractC25231BEo.A14(c5Tl, interfaceC16620sF, i3 >> 6);
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, c5y1, 1350746531);
            Object EEc = c5Tl.EEc();
            if (A1Z || EEc == obj) {
                EEc = AbstractC25235BEs.A17(c5Tl, c5y1, 40);
            }
            Modifier A013 = AbstractC28010CWi.A01(c1130158n, AbstractC25225BEi.A1B(c117505Tk, EEc, false));
            C6M3 c6m3 = C6M3.Horizontal;
            boolean A1W = AbstractC25233BEq.A1W(c5Tl, c5y1, c19l, 1350753441);
            Object EEc2 = c5Tl.EEc();
            if (A1W || EEc2 == obj) {
                EEc2 = C30172DRc.A00(c5Tl, c19l, c5y1, interfaceC74953Yl, 39);
            }
            InterfaceC30902DiF A005 = BG5.A00(c5Tl, AbstractC25225BEi.A1B(c117505Tk, EEc2, false));
            boolean A1W2 = AbstractC25233BEq.A1W(c5Tl, c19l, c5y1, 1350764325);
            Object EEc3 = c5Tl.EEc();
            if (A1W2 || EEc3 == obj) {
                EEc3 = new C57181PaA(c5y1, interfaceC74953Yl, null, c19l);
                c5Tl.FBy(EEc3);
            }
            C117505Tk.A0L(c117505Tk, false);
            Modifier Eq3 = A013.Eq3(new DraggableElement(A005, c6m3, null, BG5.A00, (InterfaceC16610sE) EEc3, true, false));
            InterfaceC1127857k A006 = C5XX.A00(alignment3, false);
            int A007 = C5X2.A00(c5Tl);
            C59P A043 = C117505Tk.A04(c117505Tk);
            Modifier A014 = C5X3.A01(c5Tl, Eq3);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A006, interfaceC16620sF3);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A043, A0q3) || !AbstractC25231BEo.A1O(c5Tl, A007)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF4, A007);
            }
            C5XJ.A00(c5Tl, A014, interfaceC16620sF5);
            AbstractC25231BEo.A14(c5Tl, interfaceC16620sF2, i3 >> 9);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1050513898);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30492Dbb(alignment2, interfaceC16620sF, modifier2, interfaceC16620sF2, i, i2, 17);
        }
    }
}
