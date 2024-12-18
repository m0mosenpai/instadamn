package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public abstract class CB6 {
    public static final void A00(C5Tl c5Tl, Modifier modifier, InterfaceC16620sF interfaceC16620sF, int i, int i2) {
        int i3;
        c5Tl.Enr(-2105228848);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, modifier) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16620sF);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-1056767214, "androidx.compose.foundation.text.selection.SimpleLayout (SimpleLayout.kt:31)");
            }
            C28829Cnz c28829Cnz = C28829Cnz.A00;
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, modifier);
            int i5 = ((((((i3 >> 3) & 14) | 384) | ((i3 << 3) & 112)) << 6) & 896) | 6;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, C5X8.A00);
            AbstractC25231BEo.A12(c5Tl, c28829Cnz, A04);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            AbstractC25231BEo.A14(c5Tl, interfaceC16620sF, i5 >> 6);
            if (C0fH.A02()) {
                C0fH.A00(-477945995);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30504Dbn.A01(interfaceC16620sF, modifier, i2, i, 4);
        }
    }
}
