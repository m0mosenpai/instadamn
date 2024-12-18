package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public abstract class CGP {
    public static final void A00(Modifier modifier, C5Tl c5Tl, int i, int i2) {
        int i3;
        long A02;
        long A022;
        Modifier modifier2 = modifier;
        c5Tl.Enr(-167840704);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, modifier2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-1400344529, "com.instagram.compose.ui.badge.InternalBadge (Internal.kt:22)");
            }
            String A00 = C5YD.A00(c5Tl, 2131964608);
            long A0L = AbstractC25226BEj.A0L(c5Tl);
            C5UP c5up = AbstractC131065vu.A00;
            A02 = C5AC.A02(AbstractC1132459m.A0K[(int) (A0L & 63)], C1132359l.A03(A0L), C1132359l.A02(A0L), C1132359l.A01(A0L), AbstractC166987dD.A09(c5Tl.AJX(c5up)));
            C5XL.A02(c5Tl);
            Modifier A0A = AbstractC118175Wb.A0A(C6L3.A01(modifier2, C5WE.A03, A02), 4.0f, 1.0f);
            A022 = C5AC.A02(AbstractC1132459m.A0K[(int) (r0 & 63)], C1132359l.A03(r0), C1132359l.A02(r0), C1132359l.A01(AbstractC25226BEj.A09(c5Tl)), AbstractC166987dD.A09(c5Tl.AJX(c5up)));
            long A01 = AbstractC118155Vz.A01(10);
            AbstractC122425gd.A03(c5Tl, A0A, new C118125Vw(new C118105Vu(), null, C5W5.A01, 0, 0, 5767160, A022, A01, 0L, 0L), A00, null, 0, 1, 1, 114819072, 56, false);
            if (C0fH.A02()) {
                C0fH.A00(1089244168);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30501Dbk.A01(ASZ, modifier2, i2, i, 8);
        }
    }
}
