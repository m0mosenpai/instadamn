package X;

import androidx.compose.ui.Modifier;
import kotlin.Deprecated;

/* loaded from: classes5.dex */
public abstract class CGA {
    @Deprecated(message = "Use this Composable as a temporary solution when porting over Views to Compose. Consider migrating to Jetpack Compose whenever possible instead.")
    public static final void A00(C5Tl c5Tl, Modifier modifier, InterfaceC30989Djo interfaceC30989Djo, Object obj, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        AbstractC167017dG.A1N(interfaceC30989Djo, obj);
        c5Tl.Enr(29032054);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, interfaceC30989Djo) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25230BEn.A05(AbstractC25233BEq.A1U(c5Tl, obj, i) ? 1 : 0);
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
                C0fH.A01(-937197111, "com.instagram.compose.core.viewinterop.IgAndroidView (IgAndroidView.kt:21)");
            }
            c5Tl.Eno(1720961360);
            int i5 = i3 & 14;
            boolean z = false;
            boolean A1P = AbstractC167007dF.A1P(i5, 4);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = C30185DRq.A01(c5Tl, interfaceC30989Djo, 28);
            }
            InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) EEc;
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            boolean A1U = AbstractC25232BEp.A1U(c5Tl, 1720964368, i5, 4);
            Object EEc2 = c5Tl.EEc();
            if (A1U || EEc2 == C5UI.A00) {
                EEc2 = C30185DRq.A01(c5Tl, interfaceC30989Djo, 29);
            }
            InterfaceC16660sJ A1B = AbstractC25225BEi.A1B(A0K, EEc2, false);
            boolean A1U2 = AbstractC25232BEp.A1U(c5Tl, 1720962741, i5, 4);
            if ((i3 & 112) == 32 || ((i3 & 64) != 0 && c5Tl.AH6(obj))) {
                z = true;
            }
            boolean z2 = A1U2 | z;
            Object EEc3 = c5Tl.EEc();
            if (z2 || EEc3 == C5UI.A00) {
                EEc3 = new BAO(5, interfaceC30989Djo, obj);
                c5Tl.FBy(EEc3);
            }
            C117505Tk.A0I(A0K);
            AbstractC28450Cgz.A03(c5Tl, modifier2, interfaceC16660sJ, null, A1B, (InterfaceC16660sJ) EEc3, (i3 >> 3) & 112, 4);
            if (C0fH.A02()) {
                C0fH.A00(1770743219);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30490DbZ(i, i2, 18, interfaceC30989Djo, obj, modifier2);
        }
    }
}
