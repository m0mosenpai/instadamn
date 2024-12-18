package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public abstract class CE7 {
    public static final void A00(C5Tl c5Tl, Modifier modifier, InterfaceC16620sF interfaceC16620sF, InterfaceC16610sE interfaceC16610sE, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        c5Tl.Enr(-1990252798);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, interfaceC16620sF) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16610sE);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, modifier2);
        }
        if ((i3 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(433073275, "com.instagram.barcelona.feed.post.ui.CompactPostTextWithMediaScaffold (CompactPostTextWithMediaScaffold.kt:20)");
            }
            Modifier A06 = AbstractC118175Wb.A06(modifier2);
            InterfaceC1127857k A02 = AbstractC118375Wz.A02(AbstractC118255Wn.A01, c5Tl, C118195Wf.A05, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A06);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A02, A04, interfaceC16620sF2);
            InterfaceC16620sF interfaceC16620sF3 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            C6L0 c6l0 = C6L0.A00;
            C1130158n c1130158n = Modifier.A00;
            Modifier A002 = c6l0.A00(c1130158n);
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A003 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A002);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A0Y, interfaceC16620sF2);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A003);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            c5Tl.Eno(173830906);
            if (interfaceC16620sF != null) {
                AbstractC25227BEk.A1P(c5Tl, interfaceC16620sF, i3 & 14);
            }
            C117505Tk.A0L(c117505Tk, false);
            c5Tl.ASW();
            c5Tl.Eno(-468412368);
            if (interfaceC16610sE != null) {
                Modifier A0C = AbstractC118185Wd.A0C(c1130158n, 50.0f);
                int i5 = ((i3 << 6) & 7168) | 6;
                InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
                int A004 = C5X2.A00(c5Tl);
                C59P A043 = C117505Tk.A04(c117505Tk);
                Modifier A013 = C5X3.A01(c5Tl, A0C);
                AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
                C5XJ.A00(c5Tl, A0b, interfaceC16620sF2);
                if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A043, A0q) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A004);
                }
                C5XJ.A00(c5Tl, A013, A1K);
                AbstractC25231BEo.A13(c5Tl, C119645bN.A00, interfaceC16610sE, ((i5 >> 6) & 112) | 6);
            }
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(1701555700);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30490DbZ(i, i2, 13, interfaceC16610sE, interfaceC16620sF, modifier2);
        }
    }
}
