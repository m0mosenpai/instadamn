package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.6NH, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6NH {
    public static final C6NI A00 = new Object() { // from class: X.6NI
        public final String toString() {
            return "ReusedSlotId";
        }
    };

    public static final void A00(C5Tl c5Tl, Modifier modifier, C6NA c6na, InterfaceC16620sF interfaceC16620sF, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        c5Tl.Enr(-511989831);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            int i4 = 2;
            if (c5Tl.AH6(c6na)) {
                i4 = 4;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            int i6 = 16;
            if (c5Tl.AH4(modifier)) {
                i6 = 32;
            }
            i3 |= i6;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            int i7 = 128;
            if (c5Tl.AH6(interfaceC16620sF)) {
                i7 = 256;
            }
            i3 |= i7;
        }
        if ((i3 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(1085170490, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:112)");
            }
            int A002 = C5X2.A00(c5Tl);
            C117615Tw A01 = C5X2.A01(c5Tl);
            Modifier A012 = C5X3.A01(c5Tl, modifier2);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            InterfaceC16820sZ interfaceC16820sZ = AnonymousClass599.A0a;
            c5Tl.Ent();
            if (c117505Tk.A0K) {
                c5Tl.AMd(interfaceC16820sZ);
            } else {
                c5Tl.FDO();
            }
            C5XJ.A00(c5Tl, c6na, c6na.A04);
            C5XJ.A00(c5Tl, A01, c6na.A02);
            C5XJ.A00(c5Tl, interfaceC16620sF, c6na.A03);
            C5XJ.A00(c5Tl, A04, C5X8.A05);
            C5XJ.A00(c5Tl, A012, C5X8.A04);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !C14360o3.A0K(c5Tl.EEc(), Integer.valueOf(A002))) {
                Integer valueOf = Integer.valueOf(A002);
                c5Tl.FBy(valueOf);
                c5Tl.ABx(valueOf, interfaceC16620sF2);
            }
            C117505Tk.A0L(c117505Tk, true);
            if (!c5Tl.Bxj()) {
                c5Tl.Eno(-26580342);
                boolean AH6 = c5Tl.AH6(c6na);
                Object EEc = c5Tl.EEc();
                if (AH6 || EEc == C5UI.A00) {
                    EEc = new C9EV(c6na, 21);
                    c5Tl.FBy(EEc);
                }
                C5UX.A05(c5Tl, (InterfaceC16820sZ) EEc);
            } else {
                c5Tl.Eno(-26502501);
            }
            C117505Tk.A0L(c117505Tk, false);
            if (C0fH.A02()) {
                C0fH.A00(-971610333);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30490DbZ(i, i2, 3, interfaceC16620sF, c6na, modifier2);
        }
    }

    public static final void A01(C5Tl c5Tl, Modifier modifier, InterfaceC16620sF interfaceC16620sF, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        c5Tl.Enr(-1298353104);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            int i5 = 2;
            if (c5Tl.AH4(modifier2)) {
                i5 = 4;
            }
            i3 = i5 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            int i6 = 16;
            if (c5Tl.AH6(interfaceC16620sF)) {
                i6 = 32;
            }
            i3 |= i6;
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(1898480588, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:78)");
            }
            Object EEc = c5Tl.EEc();
            if (EEc == C5UI.A00) {
                EEc = new C6NA();
                ((C117505Tk) c5Tl).A0Q(EEc);
            }
            int i7 = i3 << 3;
            A00(c5Tl, modifier2, (C6NA) EEc, interfaceC16620sF, (i7 & 112) | (i7 & 896), 0);
            if (C0fH.A02()) {
                C0fH.A00(1521471220);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30504Dbn(interfaceC16620sF, i2, modifier2, i, 5);
        }
    }
}
