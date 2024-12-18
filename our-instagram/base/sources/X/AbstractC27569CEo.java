package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.CEo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27569CEo {
    public static final void A00(C5Tl c5Tl, Modifier modifier, String str, int i, int i2, boolean z) {
        int i3;
        C5C8 A02;
        long A022;
        Modifier modifier2 = modifier;
        c5Tl.Enr(2072622918);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0c(c5Tl, z);
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
                C0fH.A01(949870647, "com.instagram.barcelona.postmedia.ui.AuthorAttribution (AuthorAttribution.kt:21)");
            }
            c5Tl.Eno(-957993752);
            if (z) {
                if (AbstractC25227BEk.A1U(c5Tl, 1948635144)) {
                    C0fH.A01(-302526017, "com.instagram.barcelona.common.ui.text.prefixWithIgIcon (IgIconPrefix.kt:16)");
                }
                C6C7 A0g = AbstractC25228BEl.A0g();
                String A17 = AbstractC25228BEl.A17(c5Tl, str, 2131953755);
                A0g.A09(A17);
                C69T c69t = C69T.A01;
                C69T.A02(AbstractC25228BEl.A0K(c5Tl), A0g, new C5W3(null, null, null, null, null, 65535, 0L, 0L, 0L), A17);
                A02 = A0g.A02();
                if (C0fH.A02()) {
                    C0fH.A00(-2006886278);
                }
                AbstractC25225BEi.A1V(c5Tl, false);
            } else {
                A02 = AbstractC25231BEo.A0U(str).A02();
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            float EqT = AbstractC25228BEl.A0h(c5Tl).EqT(3.0f);
            long A0H = AbstractC25226BEj.A0H(c5Tl);
            C118125Vw A0f = AbstractC25226BEj.A0f(c5Tl);
            C122215gH c122215gH = C122215gH.A03;
            A022 = C5AC.A02(AbstractC1132459m.A0K[(int) (r2 & 63)], C1132359l.A03(r2), C1132359l.A02(r2), C1132359l.A01(AbstractC25226BEj.A0I(c5Tl)), 0.3f);
            C5WR.A00(c5Tl, modifier2, A02, C118125Vw.A00(new C122215gH(EqT, A022, AbstractC119395aw.A00(0.0f, 0.0f)), null, A0f, null, null, null, 0, 0, 0, 16769023, 0L, 0L, 0L, 0L), 0, 1, 2, (i3 >> 3) & 112, 54, 21496, A0H);
            if (C0fH.A02()) {
                C0fH.A00(2131375729);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30202DSh(modifier2, str, i, i2, z);
        }
    }
}
