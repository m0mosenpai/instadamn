package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.CJf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27686CJf {
    public static final void A00(C5Tl c5Tl, Modifier modifier, C27872CQj c27872CQj, InterfaceC16600sD interfaceC16600sD, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        AbstractC167007dF.A1D(c27872CQj, 0, interfaceC16600sD);
        c5Tl.Enr(-930822888);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, c27872CQj) | i;
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
            i3 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16600sD);
        }
        if ((i3 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(1983678779, "com.instagram.opal.impl.ui.OpalTabPager (OpalTabPager_1_7.kt:26)");
            }
            BVY bvy = c27872CQj.A00;
            AbstractC25663BVz.A00(AbstractC25662BVy.A00(AbstractC25225BEi.A0I(Float.valueOf(1.0f), 1.0f, 400.0f), bvy, c5Tl, 3072, 22), null, null, bvy, null, c5Tl, C118195Wf.A05, modifier2, null, C30112DOu.A00, C5UA.A01(c5Tl, new C30751Dfo(21, c27872CQj, interfaceC16600sD), 704004406), 0.0f, 0, (i3 & 112) | 102236160, 3078, 6716, true, false);
            if (C0fH.A02()) {
                C0fH.A00(-853128597);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30490DbZ(i, i2, 33, modifier2, interfaceC16600sD, c27872CQj);
        }
    }
}
