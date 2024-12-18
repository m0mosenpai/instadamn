package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.CDq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27546CDq {
    public static final void A00(C5Tl c5Tl, Modifier modifier, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        int i3;
        long A02;
        long A022;
        Modifier modifier2 = modifier;
        boolean A1b = AbstractC25233BEq.A1b(interfaceC16820sZ, str, str2);
        c5Tl.Enr(305614296);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, str);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, str2);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0U(c5Tl, modifier);
        }
        if ((i3 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-1271942268, "com.instagram.barcelona.common.ui.button.TagMediaButton (TagMediaButton.kt:25)");
            }
            Modifier A01 = AbstractC118635Yc.A01(c5Tl, modifier2, AbstractC25225BEi.A0W(0), str2, interfaceC16820sZ, A1b ? 1 : 0, false);
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A01);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0b, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A012);
            C5WI A002 = C5WF.A00();
            C1130158n c1130158n = Modifier.A00;
            A02 = C5AC.A02(AbstractC1132459m.A0K[(int) (r1 & 63)], C1132359l.A03(r1), C1132359l.A02(r1), C1132359l.A01(C1132359l.A01), 0.4f);
            Modifier A013 = C6L3.A01(c1130158n, A002, A02);
            A022 = C5AC.A02(AbstractC1132459m.A0K[(int) (r1 & 63)], C1132359l.A03(r1), C1132359l.A02(r1), C1132359l.A01(C1132359l.A09), 0.2f);
            C5WR.A0M(c5Tl, AbstractC118175Wb.A0A(C6L3.A01(A013, A002, A022), 10.0f, 5.0f), AbstractC25225BEi.A0Y(c5Tl), str, (i3 >> 3) & 14, AbstractC25226BEj.A0H(c5Tl));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-1590184928);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUU(modifier2, interfaceC16820sZ, str2, str, i, i2, 0);
        }
    }
}
