package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;

/* loaded from: classes5.dex */
public abstract class CGL {
    public static final void A00(C5XO c5xo, C5Tl c5Tl, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, boolean z, boolean z2) {
        int i3;
        float f;
        long j;
        C5XO c5xo2 = c5xo;
        boolean z3 = z2;
        Modifier modifier2 = modifier;
        C14360o3.A0B(interfaceC16820sZ, 1);
        c5Tl.Enr(2107340373);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0b(c5Tl, z) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, modifier2);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0e(c5Tl, z3);
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0V(c5Tl, c5xo2);
        }
        if ((i3 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            z3 = AbstractC25226BEj.A1V(i5, z3);
            if (i6 != 0) {
                c5xo2 = (C5XO) AbstractC25234BEr.A0Y(c5Tl, 207731274);
                AbstractC25225BEi.A1T(c5Tl);
            }
            if (C0fH.A02()) {
                C0fH.A01(-1714770499, "com.instagram.compose.igds.components.radiobutton.IgdsRadioButton (IgdsRadioButton.kt:47)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 207733703);
            if (A0q == C5UI.A00) {
                boolean A0D = C14640oc.A0D();
                if (A0D) {
                    AbstractC53182c0.A01(true);
                }
                A0q = AbstractC25227BEk.A0j(c5Tl, A0D);
            }
            boolean A1a = AbstractC166987dD.A1a(A0q);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            if (z) {
                f = 10.0f / 2.0f;
            } else {
                f = 0.0f;
            }
            InterfaceC30898DiB interfaceC30898DiB = COI.A00;
            InterfaceC74963Ym A01 = AbstractC28454Ch4.A01(C25245BFe.A01(interfaceC30898DiB, 50, 0), c5Tl, f, 8);
            if (AbstractC25227BEk.A1U(c5Tl, -1487744764)) {
                C0fH.A01(200909146, "com.instagram.compose.igds.components.radiobutton.rememberStateColors (IgdsRadioButton.kt:157)");
            }
            if (z) {
                if (z3) {
                    j = AbstractC25227BEk.A0g(c5Tl, -390487225).A06;
                } else {
                    j = AbstractC25227BEk.A0g(c5Tl, -390483057).A05;
                }
            } else if (z3) {
                j = AbstractC25227BEk.A0g(c5Tl, -390485175).A07;
            } else {
                j = AbstractC25227BEk.A0g(c5Tl, -390481273).A04;
            }
            C117505Tk.A0L(c117505Tk, false);
            InterfaceC74953Yl A00 = C5WZ.A00(c5Tl, AbstractC25225BEi.A0S(j));
            if (C0fH.A02()) {
                C0fH.A00(737157646);
            }
            C117505Tk.A0L(c117505Tk, false);
            long A09 = AbstractC25226BEj.A09(c5Tl);
            float f2 = 1.5f;
            if (z) {
                f2 = 2.0f;
            }
            AbstractC25230BEn.A17(c5Tl, AbstractC25229BEm.A0S(C6L9.A00, ((C1132359l) A00.getValue()).A00), new DWE(c5xo2, A00, AbstractC28454Ch4.A01(C25245BFe.A01(interfaceC30898DiB, 50, 0), c5Tl, f2, 8), A01, modifier2, interfaceC16820sZ, A09, z3, z, A1a), -118171243);
            if (C0fH.A02()) {
                C0fH.A00(-1374188619);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DV2(interfaceC16820sZ, modifier2, c5xo2, i, i2, 1, z, z3);
        }
    }
}
