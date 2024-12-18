package X;

import android.os.Build;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import java.util.List;

/* renamed from: X.Cdt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28307Cdt {
    public static final void A02(C5Tl c5Tl, C9G c9g, InterfaceC16620sF interfaceC16620sF, int i, int i2) {
        int i3;
        C9G c9g2 = c9g;
        C14360o3.A0B(interfaceC16620sF, 1);
        c5Tl.Enr(-1175148640);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, c9g) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16620sF);
        }
        if ((i3 & 91) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                c9g2 = null;
            }
            if (C0fH.A02()) {
                C0fH.A01(115814719, "com.instagram.creation.genai.magicmod.common.ui.MagicModLoadingOverlayBox (MagicModLoadingOverlayBox.kt:42)");
            }
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A0Z = AbstractC25230BEn.A0Z();
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0Z, A04);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            AbstractC28005CWc.A01(null, c5Tl, null, c9g2, "AnimationCrossfade", C30716DfE.A00(c5Tl, interfaceC16620sF, C119645bN.A00, 30, 89052064), (i3 & 14) | 27648, 6);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(27535882);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30504Dbn.A01(interfaceC16620sF, c9g2, i2, i, 30);
        }
    }

    public static final Modifier A00(C9G c9g) {
        float f;
        if (c9g instanceof C27128Bxr) {
            int i = Build.VERSION.SDK_INT;
            Modifier modifier = Modifier.A00;
            if (i >= 31) {
                modifier = CB9.A00(modifier, AbstractC27748CLp.A00, 40.0f, 40.0f);
                f = 0.7f;
            } else {
                f = 0.5f;
            }
            return CB8.A00(modifier, f);
        }
        if ((c9g instanceof C27129Bxs) && Build.VERSION.SDK_INT >= 31) {
            return CB9.A00(Modifier.A00, AbstractC27748CLp.A00, 20.0f, 20.0f);
        }
        return Modifier.A00;
    }

    public static final void A01(C5Tl c5Tl, int i) {
        long A02;
        c5Tl.Enr(-636235958);
        if (i == 0 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1247544770, "com.instagram.creation.genai.magicmod.common.ui.MagicModScanAnimation (MagicModLoadingOverlayBox.kt:83)");
            }
            JTG A01 = BH4.A01(new BH6(C25245BFe.A01(AbstractC25328BIx.A02, 2500, 0), C05F.A01), BH4.A02(c5Tl), c5Tl, 1.25f, -1.25f, 28728);
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 2136907714);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                A0q = AbstractC25232BEp.A0w(c5Tl, Float.valueOf(-1.25f));
            }
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) A0q;
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            boolean A1P = AbstractC25230BEn.A1P((AbstractC166987dD.A09(A01.getValue()) > AbstractC25231BEo.A03(interfaceC74953Yl) ? 1 : (AbstractC166987dD.A09(A01.getValue()) == AbstractC25231BEo.A03(interfaceC74953Yl) ? 0 : -1)));
            AbstractC25227BEk.A18(interfaceC74953Yl, AbstractC166987dD.A09(A01.getValue()));
            List A1Q = AbstractC16960so.A1Q(AbstractC25225BEi.A0S(AbstractC119585bG.A00(c5Tl, R.color.fds_transparent)), AbstractC25225BEi.A0S(AbstractC119585bG.A00(c5Tl, R.color.white_35_transparent)), AbstractC25225BEi.A0S(AbstractC119585bG.A00(c5Tl, R.color.white_35_transparent)), AbstractC25225BEi.A0S(AbstractC119585bG.A00(c5Tl, R.color.fds_transparent)));
            Object A0q2 = AbstractC25227BEk.A0q(c5Tl, 2136919909);
            if (A0q2 == obj) {
                A0q2 = AbstractC16960so.A1Q(Float.valueOf(0.0f), Float.valueOf(0.65f), Float.valueOf(0.75f), AbstractC25227BEk.A0m());
                c5Tl.FBy(A0q2);
            }
            List list = (List) A0q2;
            C117505Tk.A0L(A0K, false);
            boolean A1T = AbstractC25227BEk.A1T(c5Tl, AbstractC166987dD.A09(A01.getValue()), 2136926429);
            Object EEc = c5Tl.EEc();
            if (A1T || EEc == obj) {
                EEc = new C25761Ba0(A01, A1Q, list, A1P);
                c5Tl.FBy(EEc);
            }
            C117505Tk.A0L(A0K, false);
            Modifier A0V = AbstractC25228BEl.A0V();
            A02 = C5AC.A02(AbstractC1132459m.A0K[(int) (r1 & 63)], C1132359l.A03(r1), C1132359l.A02(r1), C1132359l.A01(C1132359l.A01), 0.35f);
            C5AH c5ah = C5AF.A00;
            if (AbstractC25227BEk.A1X(c5Tl, C6L3.A00(C6L3.A01(A0V, c5ah, A02), (C6L5) EEc, c5ah))) {
                C0fH.A00(-1652904053);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30494Dbd.A01(ASZ, i, 27);
        }
    }
}
