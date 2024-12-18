package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.CGz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27628CGz {
    public static final void A00(C5Tl c5Tl, InterfaceC118225Wj interfaceC118225Wj, Modifier modifier, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, InterfaceC16620sF interfaceC16620sF3, int i, int i2) {
        int i3;
        InterfaceC118225Wj interfaceC118225Wj2 = interfaceC118225Wj;
        Modifier modifier2 = modifier;
        C14360o3.A0B(interfaceC16620sF, 0);
        AbstractC167017dG.A1P(interfaceC16620sF2, interfaceC16620sF3);
        c5Tl.Enr(709745039);
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
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16620sF2);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16620sF3);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0U(c5Tl, modifier2);
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0V(c5Tl, interfaceC118225Wj2);
        }
        if ((i3 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i5 != 0) {
                interfaceC118225Wj2 = C118195Wf.A04;
            }
            if (C0fH.A02()) {
                C0fH.A01(1958380226, "com.instagram.creation.genai.common.ui.CenteredThreeItemRow (CenteredThreeItemRow.kt:22)");
            }
            int i6 = i3 >> 6;
            InterfaceC1127857k A0z = AbstractC25232BEp.A0z(AbstractC118255Wn.A04, c5Tl, interfaceC118225Wj2, ((i3 >> 9) & 14) | 48 | (i6 & 896));
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, modifier2);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF4 = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0z, A04, interfaceC16620sF4);
            InterfaceC16620sF interfaceC16620sF5 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF5, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            C6L0 c6l0 = C6L0.A00;
            AbstractC25227BEk.A1P(c5Tl, interfaceC16620sF, i3 & 14);
            Modifier A002 = c6l0.A00(Modifier.A00);
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A003 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A002);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A0b, interfaceC16620sF4);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF5, A003);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            AbstractC25231BEo.A14(c5Tl, interfaceC16620sF2, i3 >> 3);
            AbstractC25231BEo.A14(c5Tl, interfaceC16620sF3, i6);
            if (C0fH.A02()) {
                C0fH.A00(309641908);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DV5(interfaceC118225Wj2, interfaceC16620sF3, interfaceC16620sF2, modifier2, interfaceC16620sF, i, i2, 8);
        }
    }
}
