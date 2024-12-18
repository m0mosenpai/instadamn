package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.CJj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27690CJj {
    public static final void A00(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z, boolean z2) {
        int i2;
        c5Tl.Enr(979255358);
        if ((i & 48) == 0) {
            i2 = AbstractC25232BEp.A0c(c5Tl, z2) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 145) == 144 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1100164392, "com.instagram.preloads.earlyaccess.EarlyAccessScreen (EarlyAccessFragment.kt:47)");
            }
            InterfaceC118305Ws interfaceC118305Ws = AbstractC118255Wn.A07;
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A0a = AbstractC25230BEn.A0a(interfaceC118305Ws, c5Tl);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0a, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            String A002 = AbstractC136736Hc.A00(c5Tl, 2131961211);
            c5Tl.Eno(92315102);
            boolean A1P = AbstractC167007dF.A1P(i2 & 896, 256);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = AbstractC25230BEn.A10(c5Tl, interfaceC16820sZ, 18);
            }
            AbstractC25705BXp.A0Q(c5Tl, new C29199Cu4(AbstractC25225BEi.A1B(c117505Tk, EEc, false), z2, true), A002);
            AbstractC28303Cdp.A02(c5Tl, null, AbstractC136736Hc.A00(c5Tl, 2131961209), 0, 2);
            AbstractC28303Cdp.A02(c5Tl, null, AbstractC136736Hc.A00(c5Tl, 2131961210), 0, 2);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-1965332969);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DSO(interfaceC16820sZ, i, z, z2);
        }
    }
}
