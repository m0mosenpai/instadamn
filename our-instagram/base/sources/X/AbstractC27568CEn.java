package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.CEn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27568CEn {
    public static final void A00(C5Tl c5Tl, Modifier modifier, String str, int i, int i2) {
        int i3;
        String A00;
        Modifier modifier2 = modifier;
        C14360o3.A0B(str, 0);
        c5Tl.Enr(-1966536150);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, modifier2);
        }
        if ((i3 & 91) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-1940302753, "com.instagram.barcelona.permalink.ui.component.PermalinkReplyVisibilityMessage (PermalinkReplyVisibilityMessage.kt:30)");
            }
            Object A19 = AbstractC25226BEj.A19(c5Tl);
            Object A11 = AbstractC25225BEi.A11(c5Tl);
            c5Tl.Eno(-752804829);
            if (str.length() == 0) {
                A00 = "";
            } else {
                A00 = C5YD.A00(c5Tl, 2131965052);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            String A17 = AbstractC25228BEl.A17(c5Tl, A00, 2131953699);
            boolean A1Z = AbstractC25232BEp.A1Z(c5Tl, A17, A00, -752798024) | AbstractC167007dF.A1P(i3 & 14, 4);
            Object EEc = c5Tl.EEc();
            if (A1Z || EEc == C5UI.A00) {
                C69T c69t = C69T.A01;
                C5W5 c5w5 = C5W5.A01;
                long j = C1132359l.A08;
                C14360o3.A0B(A00, 1);
                C6C7 A0g = AbstractC25228BEl.A0g();
                int A0E = AbstractC25230BEn.A0E(A17, A00);
                if (A0E >= 0) {
                    int A04 = AbstractC25226BEj.A04(A00, A0E);
                    A0g.A09(A17);
                    A0g.A06(new C5W3(null, null, null, c5w5, null, 65530, j, 0L, 0L), A0E, A04);
                    EEc = AbstractC25227BEk.A0R(A0g, "learn_more_span", str, A0E, A04);
                    c5Tl.FBy(EEc);
                } else {
                    throw AbstractC166987dD.A14("Check failed.");
                }
            }
            C5C8 c5c8 = (C5C8) EEc;
            C117505Tk.A0L(A0K, false);
            C5Hb A042 = AbstractC133095zb.A04("learn_more_span");
            Modifier A0E2 = AbstractC118175Wb.A0E(modifier2, 0.0f, 32.0f, 0.0f, 20.0f);
            C118125Vw A0c = AbstractC25226BEj.A0c(c5Tl);
            long A01 = AbstractC118155Vz.A01(21);
            C6HC.A01(c5Tl, A0E2, c5c8, A0c.A0D(new C118125Vw(null, null, C5W5.A05, 3, 0, 6127608, AbstractC25226BEj.A0M(c5Tl), AbstractC118155Vz.A01(15), 0L, A01)), new C50365MLr(c5c8, A11, A19, str, 23), A042, 48, 3048, 0L);
            if (C0fH.A02()) {
                C0fH.A00(-686587389);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DT2(modifier2, str, i2, i, 4);
        }
    }
}
