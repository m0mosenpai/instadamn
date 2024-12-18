package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.CIi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27663CIi {
    public static final void A00(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i, int i2) {
        int i3;
        InterfaceC16820sZ interfaceC16820sZ3 = interfaceC16820sZ2;
        C14360o3.A0B(interfaceC16820sZ, 0);
        c5Tl.Enr(157664698);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ3);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                interfaceC16820sZ3 = null;
            }
            if (C0fH.A02()) {
                C0fH.A01(437827882, "com.instagram.direct.screenshotblocking.ui.ScreenshotBlockingSendNuxBottomSheetContent (ScreenshotBlockingSendNux.kt:101)");
            }
            if (C0fH.A02()) {
                C0fH.A01(720982994, "com.instagram.direct.screenshotblocking.ui.buildAnnotatedString (ScreenshotBlockingSendNux.kt:125)");
            }
            C6C7 A0g = AbstractC25228BEl.A0g();
            String A00 = C5YD.A00(c5Tl, 2131965052);
            String A17 = AbstractC25228BEl.A17(c5Tl, A00, 2131963983);
            int length = A17.length();
            int A07 = AbstractC001900j.A07(A17, A00, length - 1);
            int A0A = AbstractC167007dF.A0A(A00) + A07;
            A0g.A09(A17);
            A0g.A06(new C5W3(null, null, null, AbstractC25226BEj.A0c(c5Tl).A02.A08, null, 65531, 0L, 0L, 0L), 0, length);
            A0g.A06(new C5W3(null, null, null, null, null, 65534, AbstractC25226BEj.A0N(c5Tl), 0L, 0L), A07, A0A);
            C5C8 A0R = AbstractC25227BEk.A0R(A0g, "learn_more_tag", "clickable link", A07, A0A);
            if (C0fH.A02()) {
                C0fH.A00(1196310446);
            }
            Modifier A0W = AbstractC25228BEl.A0W();
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0W);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0Y, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            String A003 = C5YD.A00(c5Tl, 2131963984);
            EnumC27362C5r enumC27362C5r = EnumC27362C5r.A03;
            boolean A1P = AbstractC25233BEq.A1P(c5Tl, 1621884975, i3);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = new C50261MHq(interfaceC16820sZ3, 14);
                c5Tl.FBy(EEc);
            }
            AbstractC28504Chx.A01(c5Tl, null, null, enumC27362C5r, null, A0R, null, A003, null, null, AbstractC25225BEi.A1B(c117505Tk, EEc, false), null, 384, 0, 4010, 0L);
            AbstractC28506Chz.A00(c5Tl, A0W, null, C5YD.A00(c5Tl, 2131968948), null, interfaceC16820sZ, null, ((i3 << 3) & 112) | 384, 24568);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1288945156);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30504Dbn.A01(interfaceC16820sZ3, interfaceC16820sZ, i2, i, 34);
        }
    }
}
