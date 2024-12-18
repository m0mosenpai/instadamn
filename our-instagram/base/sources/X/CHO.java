package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;

/* loaded from: classes5.dex */
public abstract class CHO {
    public static final void A00(C5Tl c5Tl, Modifier modifier, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, InterfaceC16620sF interfaceC16620sF3, float f, int i, int i2) {
        int i3;
        float f2 = f;
        Modifier modifier2 = modifier;
        c5Tl.Enr(71081774);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, modifier) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= AbstractC25232BEp.A04(c5Tl, f2);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16620sF);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16620sF2);
        }
        if ((i2 & 16) != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((57344 & i) == 0) {
            i3 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16620sF3);
        }
        if ((46811 & i3) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i5 != 0) {
                f2 = 0.38f;
            }
            if (C0fH.A02()) {
                C0fH.A01(721374698, "com.instagram.creation.genai.magicmod.common.ui.SpacedThreeItemRow (SpacedThreeItemRow.kt:29)");
            }
            boolean A1P = AbstractC25233BEq.A1P(c5Tl, 680560991, i3);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = new C28823Cnt(f2);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0J = AbstractC25225BEi.A0J(c5Tl);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0J);
            Modifier A01 = C5X3.A01(c5Tl, modifier2);
            AbstractC25233BEq.A11(c5Tl, A0J);
            AbstractC25231BEo.A12(c5Tl, EEc, A04);
            InterfaceC16620sF interfaceC16620sF4 = C5X8.A02;
            if (A0J.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF4, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            AbstractC25227BEk.A1P(c5Tl, interfaceC16620sF, (i3 >> 6) & 14);
            AbstractC25227BEk.A1P(c5Tl, interfaceC16620sF2, (i3 >> 9) & 14);
            AbstractC25231BEo.A14(c5Tl, interfaceC16620sF3, i3 >> 12);
            if (C0fH.A02()) {
                C0fH.A00(-1732575673);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30241DTu(modifier2, interfaceC16620sF, interfaceC16620sF2, interfaceC16620sF3, f2, i, i2);
        }
    }
}
