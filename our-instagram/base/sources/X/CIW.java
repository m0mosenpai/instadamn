package X;

import androidx.compose.foundation.lazy.LazyListState;

/* loaded from: classes5.dex */
public abstract class CIW {
    public static final void A00(C5Tl c5Tl, C51755Mte c51755Mte, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        C14360o3.A0B(c51755Mte, 0);
        AbstractC167017dG.A1P(interfaceC16660sJ, interfaceC16820sZ);
        c5Tl.Enr(-41972417);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c51755Mte) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1802439417, "com.instagram.direct.fragment.thread.keymanagement.mvvm.ui.EncryptedUserList (EncryptedUserList.kt:31)");
            }
            LazyListState A0E = AbstractC25227BEk.A0E(c5Tl);
            c5Tl.Eno(1637045594);
            boolean z = true;
            boolean A1X = AbstractC25226BEj.A1X(c5Tl, c51755Mte, AbstractC167007dF.A1P(i2 & 896, 256));
            if ((i2 & 112) != 32) {
                z = false;
            }
            boolean z2 = A1X | z;
            Object EEc = c5Tl.EEc();
            if (z2 || EEc == C5UI.A00) {
                EEc = new C50364MLq(11, interfaceC16660sJ, interfaceC16820sZ, c51755Mte);
                c5Tl.FBy(EEc);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            C6IS.A05(A0E, c5Tl, (InterfaceC16660sJ) EEc);
            if (C0fH.A02()) {
                C0fH.A00(-1020164044);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30509Dbs.A01(c51755Mte, interfaceC16820sZ, interfaceC16660sJ, i, 35);
        }
    }
}
