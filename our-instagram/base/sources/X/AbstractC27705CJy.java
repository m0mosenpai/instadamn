package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.CJy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27705CJy {
    public static final void A00(C5Tl c5Tl, Modifier modifier, C51598Mqq c51598Mqq, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i, int i2) {
        int i3;
        int i4;
        C6GG c6gg;
        Modifier modifier2 = modifier;
        AbstractC25233BEq.A0v(0, c51598Mqq, interfaceC16820sZ, interfaceC16820sZ2);
        c5Tl.Enr(-1763700294);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25230BEn.A04(AbstractC25233BEq.A1T(c5Tl, c51598Mqq, i) ? 1 : 0) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, modifier2);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ2);
        }
        if ((i3 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(1369359817, "com.instagram.remindme.savesheet.ui.MediaReminderComponent (MediaReminderComponent.kt:31)");
            }
            C0eB c0eB = C0eB.A00;
            boolean A1Q = AbstractC25233BEq.A1Q(c5Tl, 2033363263, i3);
            Object EEc = c5Tl.EEc();
            if (A1Q || EEc == C5UI.A00) {
                EEc = new PYs(interfaceC16820sZ, null, 11);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0E = AbstractC25235BEs.A0E(c5Tl, EEc, c0eB);
            InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
            InterfaceC118335Wv interfaceC118335Wv = AbstractC118255Wn.A04;
            Modifier A09 = AbstractC118175Wb.A09(modifier2, 8.0f);
            InterfaceC1127857k A00 = AbstractC118375Wz.A00(interfaceC118335Wv, c5Tl, interfaceC118225Wj);
            int A002 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0E);
            Modifier A01 = C5X3.A01(c5Tl, A09);
            AbstractC25233BEq.A11(c5Tl, A0E);
            AbstractC25231BEo.A12(c5Tl, A00, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0E.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C6L0 c6l0 = C6L0.A00;
            String A003 = C5YD.A00(c5Tl, 2131966142);
            C5WR.A0R(c5Tl, AbstractC25227BEk.A0I(c6l0.A00(Modifier.A00), 12.0f), AbstractC25226BEj.A0h(c5Tl), A003, AbstractC25226BEj.A0G(c5Tl));
            int intValue = c51598Mqq.A01.intValue();
            if (intValue != 0) {
                if (intValue == 1) {
                    i4 = 2131966144;
                } else {
                    throw B4Z.A00();
                }
            } else {
                i4 = 2131966143;
            }
            String A004 = C5YD.A00(c5Tl, i4);
            C25267BGf A03 = C6GA.A00.A03(c5Tl, 1, false, true);
            C6GD c6gd = C6GD.A03;
            if (intValue != 0) {
                c6gg = C6GF.A00;
            } else {
                c6gg = C29179Ctk.A00;
            }
            C6GE.A00(null, c5Tl, null, c6gg, c6gd, A03, A004, interfaceC16820sZ2, ((i3 >> 9) & 14) | 1572864, 156, false, false);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-567882919);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30492Dbb(c51598Mqq, interfaceC16820sZ2, interfaceC16820sZ, modifier2, i, i2, 23);
        }
    }
}
