package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;

/* renamed from: X.CGv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27624CGv {
    public static final void A00(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i) {
        int i2;
        AbstractC167017dG.A1N(interfaceC16820sZ, interfaceC16820sZ2);
        c5Tl.Enr(838719159);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ2);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(124436460, "com.instagram.creation.genai.attribution.bottomsheet.GenericFeatureNotAvailableContent (CreationGenAIFeatureUnavailableGenericBottomSheetFragment.kt:101)");
            }
            InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A00;
            C1130158n c1130158n = Modifier.A00;
            Modifier A0E = AbstractC118175Wb.A0E(c1130158n, 0.0f, 0.0f, 0.0f, C5XT.A00(c5Tl));
            InterfaceC1127857k A0Z = AbstractC25226BEj.A0Z(c5Tl, interfaceC118245Wl);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0E);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0Z, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            String A002 = AbstractC136736Hc.A00(c5Tl, 2131956996);
            long A0G = AbstractC25226BEj.A0G(c5Tl);
            C5WR.A0Z(c5Tl, AbstractC118175Wb.A0A(c1130158n, 0.0f, C5XT.A00(c5Tl)), AbstractC25225BEi.A0X(c5Tl), A002, A0G);
            String A003 = AbstractC136736Hc.A00(c5Tl, 2131956999);
            long A0M = AbstractC25226BEj.A0M(c5Tl);
            C5WR.A0Z(c5Tl, AbstractC118185Wd.A07(AbstractC118175Wb.A0A(c1130158n, 0.0f, C5XT.A02(c5Tl, R.dimen.account_discovery_bottom_gap)), 0.75f), AbstractC25226BEj.A0c(c5Tl), A003, A0M);
            AbstractC28506Chz.A0C(interfaceC16820sZ, AbstractC136736Hc.A00(c5Tl, 2131968948), c5Tl, (i2 << 3) & 112);
            AbstractC27626CGx.A00(interfaceC16820sZ2, c5Tl, (i2 >> 3) & 14);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-1913290259);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30507Dbq(interfaceC16820sZ, interfaceC16820sZ2, i, 41);
        }
    }
}
