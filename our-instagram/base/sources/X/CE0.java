package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public abstract class CE0 {
    public static final void A00(C5Tl c5Tl, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16610sE interfaceC16610sE, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        AbstractC167007dF.A1D(interfaceC16820sZ, 0, interfaceC16610sE);
        c5Tl.Enr(-494296183);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, modifier2);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16610sE);
        }
        if ((i3 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-355508382, "com.instagram.barcelona.creation.voiceclips.AnimatedProgressContainer (AnimatedProgressContainer.kt:16)");
            }
            InterfaceC74963Ym A03 = AbstractC28454Ch4.A03(c5Tl, ((C66625UPn) interfaceC16820sZ.invoke()).A02);
            int i5 = i3 >> 3;
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, modifier2);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0b, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            boolean AH4 = c5Tl.AH4(A03) | AbstractC25233BEq.A1O(c5Tl, 46838559, i3);
            Object EEc = c5Tl.EEc();
            if (AH4 || EEc == C5UI.A00) {
                EEc = new MHV(45, A03, interfaceC16820sZ);
                c5Tl.FBy(EEc);
            }
            C117505Tk.A0L(c117505Tk, false);
            AbstractC25231BEo.A13(c5Tl, EEc, interfaceC16610sE, i5 & 112);
            if (C0fH.A02()) {
                C0fH.A00(1869863922);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30490DbZ(i, i2, 11, interfaceC16610sE, interfaceC16820sZ, modifier2);
        }
    }
}
