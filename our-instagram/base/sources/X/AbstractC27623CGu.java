package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.CGu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27623CGu {
    public static final void A00(C5Tl c5Tl, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i) {
        int i2;
        AbstractC25233BEq.A0v(1, str2, interfaceC16820sZ, interfaceC16820sZ2);
        c5Tl.Enr(-1802682079);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, str2);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ2);
        }
        if ((i2 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-2026688928, "com.instagram.creation.genai.attribution.bottomsheet.FeatureNotAvailableContent (CreationGenAIFeatureUnavailableBottomSheetFragment.kt:129)");
            }
            InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A00;
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A0Q = AbstractC25227BEk.A0Q(AbstractC118255Wn.A07, c5Tl, interfaceC118245Wl);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0Q, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C5WR.A0n(c5Tl, C5XL.A01(c5Tl).A04, str, i2 & 14, 16250, AbstractC25226BEj.A0G(c5Tl));
            String A0p = AbstractC25235BEs.A0p(c5Tl, str2, 2131971032);
            C5WR.A0Z(c5Tl, AbstractC118175Wb.A0A(c1130158n, 24.0f, 8.0f), AbstractC25225BEi.A0Y(c5Tl), A0p, AbstractC25226BEj.A0M(c5Tl));
            String A002 = AbstractC136736Hc.A00(c5Tl, 2131956997);
            long A0M = AbstractC25226BEj.A0M(c5Tl);
            C5WR.A0T(c5Tl, AbstractC118185Wd.A07(AbstractC25227BEk.A0L(c1130158n, 20.0f), 0.75f), AbstractC25226BEj.A0c(c5Tl), A002, A0M);
            AbstractC28506Chz.A0C(interfaceC16820sZ, AbstractC136736Hc.A00(c5Tl, 2131968948), c5Tl, (i2 >> 3) & 112);
            AbstractC27626CGx.A00(interfaceC16820sZ2, c5Tl, (i2 >> 9) & 14);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1017362193);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30225DTe(interfaceC16820sZ, interfaceC16820sZ2, str2, str, i, 1);
        }
    }
}
