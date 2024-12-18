package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.R;

/* loaded from: classes5.dex */
public abstract class CGU {
    public static final void A00(int i, Modifier modifier, C5Tl c5Tl, int i2, int i3) {
        int i4;
        String A00;
        Modifier modifier2 = modifier;
        c5Tl.Enr(-2003772229);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = AbstractC25232BEp.A0R(c5Tl, modifier2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= AbstractC25232BEp.A09(c5Tl, i);
        }
        if ((i4 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-1355600635, "com.instagram.compose.ui.notificationbadge.ListBadgeWithCount (ListBadgeWithCount.kt:19)");
            }
            C2DC A002 = C5Y7.A00(c5Tl, R.drawable.list_badge_small, 0);
            Alignment alignment = C118195Wf.A09;
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A003 = C5XX.A00(alignment, false);
            int A004 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A003, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A004);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C6LQ.A03(c5Tl, AbstractC118185Wd.A0C(modifier2, 20.0f), A002);
            c5Tl.Eno(1948916122);
            if (i < 10) {
                A00 = String.valueOf(i);
            } else {
                A00 = C5YD.A00(c5Tl, 2131974181);
            }
            C117505Tk.A0L(c117505Tk, false);
            C5WR.A0u(c5Tl, AbstractC25226BEj.A0c(c5Tl), A00, AbstractC25226BEj.A0H(c5Tl));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1750736861);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30214DSt(modifier2, i3, i, i2, 3);
        }
    }
}
