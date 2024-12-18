package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class CUW {
    public final C6MK A00 = new C6MK();

    public final void A01(Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16620sF interfaceC16620sF, boolean z) {
        this.A00.add(C5UA.A03(new C30556Dcd(0, null, interfaceC16820sZ, modifier, interfaceC16620sF, z), 262103052));
    }

    public final void A00(CW4 cw4, C5Tl c5Tl, int i) {
        int i2;
        c5Tl.Enr(1320309496);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, cw4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, this);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-2081936689, "androidx.compose.foundation.contextmenu.ContextMenuScope.Content (ContextMenuUi.android.kt:233)");
            }
            C6MK c6mk = this.A00;
            int size = c6mk.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((InterfaceC16610sE) c6mk.get(i3)).invoke(cw4, c5Tl, Integer.valueOf(i2 & 14));
            }
            if (C0fH.A02()) {
                C0fH.A00(-2040328977);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30507Dbq.A01(ASZ, this, cw4, i, 2);
        }
    }
}
