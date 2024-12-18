package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.CIv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27676CIv {
    public static final void A00(C5Tl c5Tl, C5yI c5yI, InterfaceC132365yF interfaceC132365yF, C132335yC c132335yC, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, InterfaceC16620sF interfaceC16620sF, int i) {
        int i2;
        C14360o3.A0B(c132335yC, 0);
        AbstractC167017dG.A1P(interfaceC132365yF, c5yI);
        AbstractC25233BEq.A0x(3, interfaceC16660sJ, interfaceC16660sJ2, interfaceC16660sJ3);
        C14360o3.A0B(interfaceC16620sF, 6);
        c5Tl.Enr(-909533543);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c132335yC) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, interfaceC132365yF);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, c5yI);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16660sJ);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16660sJ2);
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25232BEp.A0M(c5Tl, interfaceC16660sJ3);
        }
        if ((1572864 & i) == 0) {
            i2 |= AbstractC25232BEp.A0N(c5Tl, interfaceC16620sF);
        }
        if ((599187 & i2) == 599186 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-127468314, "com.instagram.feed.tifu.ui.Tifu1x1Unit (Tifu1x1Unit.kt:44)");
            }
            if (AbstractC25231BEo.A1P(c5Tl, AbstractC25232BEp.A0y(c5Tl, Modifier.A00), new C30291DVs(0, interfaceC16620sF, AbstractC25225BEi.A11(c5Tl), interfaceC132365yF, c132335yC, interfaceC16660sJ, c5yI, interfaceC16660sJ3, interfaceC16660sJ2), -347291433)) {
                C0fH.A00(1119271731);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30289DVq(i, 3, c132335yC, c5yI, interfaceC16660sJ2, interfaceC16660sJ3, interfaceC16620sF, interfaceC132365yF, interfaceC16660sJ);
        }
    }
}
