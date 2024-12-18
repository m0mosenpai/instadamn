package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.CEu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27575CEu {
    public static final void A00(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i) {
        int i2;
        AbstractC167007dF.A1K(interfaceC16820sZ, interfaceC16820sZ2);
        c5Tl.Enr(-373350513);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ2);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(2098835991, "com.instagram.barcelonaig.permalink.ui.BarcelonaIgPermalinkNavigationBar (BarcelonaIgPermalinkNavigationBar.kt:22)");
            }
            C6G6.A00(c5Tl, AbstractC25226BEj.A0T(Modifier.A00), C6G4.A06, interfaceC16820sZ, C5UA.A01(c5Tl, C30480DbP.A00(interfaceC16820sZ2, 33), 2059953229), null, C5UA.A01(c5Tl, C30480DbP.A00(interfaceC16820sZ2, 34), -1586421297), 0, ((i2 << 3) & 112) | 200070, 464, false, false);
            if (C0fH.A02()) {
                C0fH.A00(-807447029);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30507Dbq(interfaceC16820sZ, interfaceC16820sZ2, i, 27);
        }
    }
}
