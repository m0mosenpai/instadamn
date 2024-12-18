package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;

/* loaded from: classes5.dex */
public abstract class CKV {
    public static final void A00(C5Tl c5Tl, Modifier modifier, InterfaceC16620sF interfaceC16620sF, float f, int i, int i2, boolean z, boolean z2) {
        int i3;
        Modifier modifier2;
        float f2 = f;
        boolean z3 = z2;
        boolean z4 = z;
        Modifier modifier3 = modifier;
        C14360o3.A0B(interfaceC16620sF, 4);
        c5Tl.Enr(-1465673884);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, modifier3) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0c(c5Tl, z4);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0d(c5Tl, z3);
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A06(c5Tl, f2);
        }
        if ((i2 & 16) != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16620sF);
        }
        if ((i3 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier3 = AbstractC25228BEl.A0W();
            }
            if (i5 != 0) {
                z4 = true;
            }
            if (i6 != 0) {
                z3 = true;
            }
            if (i7 != 0) {
                f2 = 0.0f;
            }
            if (C0fH.A02()) {
                C0fH.A01(-132325610, "com.instagram.wonderwall.ui.compose.components.WallCard (WallCard.kt:26)");
            }
            c5Tl.Eno(301687288);
            if (z4) {
                C1130158n c1130158n = Modifier.A00;
                C5WI A01 = C5WF.A01(12.0f);
                long j = AbstractC1132259k.A00;
                modifier2 = modifier3.Eq3(AbstractC28015CWn.A01(c1130158n, A01, 4.0f, j, j, true));
            } else {
                modifier2 = modifier3;
            }
            if (z3) {
                modifier2 = modifier2.Eq3(AbstractC25228BEl.A0Y(Modifier.A00, 12.0f, f2, AbstractC25226BEj.A0K(c5Tl)));
            }
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            Modifier A0Z = AbstractC25228BEl.A0Z(modifier2, 12.0f, AbstractC25226BEj.A06(c5Tl));
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A0Z);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0b, A04);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A012);
            AbstractC25231BEo.A14(c5Tl, interfaceC16620sF, i3 >> 12);
            if (C0fH.A02()) {
                C0fH.A00(807488674);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DV0(modifier3, interfaceC16620sF, f2, i, i2, 1, z4, z3);
        }
    }
}
