package X;

import androidx.compose.ui.Modifier;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

/* renamed from: X.CeG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28328CeG {
    public static final void A01(C5Tl c5Tl, Modifier modifier, int i, int i2, int i3, int i4) {
        int i5;
        Modifier modifier2 = modifier;
        c5Tl.Enr(-1573093780);
        int i6 = i4 & 1;
        if (i6 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = AbstractC25232BEp.A0R(c5Tl, modifier) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= AbstractC25232BEp.A09(c5Tl, i);
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            i5 |= AbstractC25236BEt.A03(c5Tl, i2);
        }
        if ((i5 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(912032205, "com.instagram.schools.management.components.GraduationDateRow (GraduationDateRow.kt:23)");
            }
            AbstractC25705BXp.A0F(c5Tl, modifier2, new BY4(A00(i, i2), true), AbstractC136736Hc.A00(c5Tl, 2131963282), (i5 << 3) & 112);
            if (C0fH.A02()) {
                C0fH.A00(-1289638779);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30212DSr(modifier2, i, i2, i3, i4);
        }
    }

    public static final String A00(int i, int i2) {
        if (i != 0 && i2 != 0) {
            String format = new SimpleDateFormat("MMMM yyyy", Locale.US).format(new GregorianCalendar(i2, i - 1, 1).getTime());
            C14360o3.A07(format);
            return format;
        }
        return "";
    }

    public static final void A02(C5Tl c5Tl, Modifier modifier, Integer num, Integer num2, int i, int i2) {
        int i3;
        String A00;
        long j;
        Modifier modifier2 = modifier;
        c5Tl.Enr(-1170190639);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, modifier2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, num);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, num2);
        }
        if ((i3 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-1917265533, "com.instagram.schools.management.components.GraduationDateOnboardingRow (GraduationDateRow.kt:33)");
            }
            c5Tl.Eno(-1940286632);
            if (num != null && num2 != null) {
                A00 = A00(num.intValue(), num2.intValue());
            } else {
                A00 = AbstractC136736Hc.A00(c5Tl, 2131968981);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            if (num != null && num2 != null) {
                j = AbstractC25230BEn.A0O(c5Tl, -19056200);
            } else {
                j = AbstractC25227BEk.A0g(c5Tl, -19107722).A0t;
            }
            C1130158n A0O = AbstractC25225BEi.A0O(A0K);
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A002 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, A0O);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A0Y, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            AbstractC25705BXp.A07(c5Tl, modifier2, null, C29198Cu3.A00, A00, null, (i3 << 3) & 112, 129788, j, false);
            AbstractC25229BEm.A16(c5Tl, AbstractC118185Wd.A08(AbstractC25225BEi.A0Q(AbstractC118175Wb.A05(A0O)), 0.5f), AbstractC25225BEi.A0D(c5Tl));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-563182016);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30490DbZ(i, i2, 37, modifier2, num2, num);
        }
    }
}
