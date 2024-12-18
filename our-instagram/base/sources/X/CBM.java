package X;

import androidx.compose.ui.Modifier;
import kotlin.Deprecated;

/* loaded from: classes5.dex */
public abstract class CBM {
    @Deprecated(message = "This API is unsafe for UI performance at scale - using it incorrectly will lead to exponential performance issues. This API should be avoided whenever possible.")
    public static final void A00(C5Tl c5Tl, Modifier modifier, InterfaceC1127857k interfaceC1127857k, InterfaceC16620sF interfaceC16620sF, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        c5Tl.Enr(1949933075);
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
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, interfaceC1127857k);
        }
        if ((i3 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-2050324326, "androidx.compose.ui.layout.MultiMeasureLayout (Layout.kt:248)");
            }
            int A00 = C5X2.A00(c5Tl);
            Modifier A01 = C5X3.A01(c5Tl, modifier2);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            int i5 = ((i3 << 3) & 896) | 6;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, AnonymousClass599.A0a);
            AbstractC25231BEo.A12(c5Tl, interfaceC1127857k, A04);
            C29970DJi c29970DJi = C29970DJi.A00;
            if (c117505Tk.A0K) {
                c5Tl.ABx(C0eB.A00, new C30193DRy(c29970DJi, 12));
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            AbstractC25231BEo.A14(c5Tl, interfaceC16620sF, i5 >> 6);
            if (C0fH.A02()) {
                C0fH.A00(486858759);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30490DbZ(i, i2, 2, interfaceC16620sF, modifier2, interfaceC1127857k);
        }
    }
}
