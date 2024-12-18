package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Ce3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28317Ce3 {
    public static final void A01(C5Tl c5Tl, Modifier modifier, ImageUrl imageUrl, String str, String str2, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        c5Tl.Enr(-724104399);
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
            i3 |= AbstractC25232BEp.A0S(c5Tl, str);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, str2);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0U(c5Tl, imageUrl);
        }
        if ((i2 & 16) != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16660sJ);
        }
        if ((i3 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(1804993781, "com.instagram.direct.fragment.thread.threadmedia.SharedLinkItem (DirectThreadSharedLinksFragment.kt:150)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 2012452399);
            Object obj = C5UI.A00;
            C5XO c5xo = (C5XO) AbstractC25232BEp.A1C(c5Tl, A0q, obj);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            InterfaceC118075Vr interfaceC118075Vr = (InterfaceC118075Vr) c5Tl.AJX(C5WM.A00);
            c5Tl.Eno(2012455522);
            boolean A1N = AbstractC25231BEo.A1N(57344, i3, Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) | AbstractC167007dF.A1P(i3 & 896, 256);
            Object EEc = c5Tl.EEc();
            if (A1N || EEc == obj) {
                EEc = AbstractC25230BEn.A14(c5Tl, interfaceC16660sJ, str2, 42);
            }
            Modifier A08 = AbstractC118175Wb.A08(AbstractC25225BEi.A0Q(AbstractC25228BEl.A0Z(C5XR.A02(interfaceC118075Vr, c5xo, modifier2, AbstractC25225BEi.A1A(c117505Tk, EEc, false)), 16.0f, AbstractC25226BEj.A0A(c5Tl))), 12.0f);
            InterfaceC1127857k A0d = AbstractC25228BEl.A0d(c5Tl);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A08);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q2 = AbstractC25229BEm.A0q(c5Tl, A0d, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            C2DB A0w = AbstractC25226BEj.A0w(c5Tl, imageUrl, i3 >> 9);
            C5YL c5yl = C5YJ.A00;
            C1130158n c1130158n = Modifier.A00;
            C6LQ.A08(c5Tl, AbstractC25228BEl.A0X(AbstractC118185Wd.A0C(c1130158n, 56.0f), 16.0f), A0w, c5yl);
            Modifier A0E = AbstractC118175Wb.A0E(c1130158n, 12.0f, 0.0f, 0.0f, 0.0f);
            InterfaceC1127857k A0a = AbstractC25230BEn.A0a(AbstractC118255Wn.A01(4.0f), c5Tl);
            int A002 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A0E);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A0a, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q2) || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            C5WR.A0p(c5Tl, AbstractC25226BEj.A0h(c5Tl), str, 2, (i3 >> 3) & 14, AbstractC25226BEj.A0G(c5Tl));
            C5WR.A0p(c5Tl, AbstractC25225BEi.A0Y(c5Tl), str2, 2, (i3 >> 6) & 14, AbstractC25226BEj.A0M(c5Tl));
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(-1463483759);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DVH(modifier2, imageUrl, interfaceC16660sJ, str, str2, i, i2, 1);
        }
    }

    public static final void A00(C5Tl c5Tl, int i) {
        c5Tl.Enr(-721814916);
        if (i == 0 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(568580766, "com.instagram.direct.fragment.thread.threadmedia.LoadingComponent (DirectThreadSharedLinksFragment.kt:193)");
            }
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A0Z = AbstractC25230BEn.A0Z();
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0Z, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            BIR.A00(c5Tl, C119645bN.A00.AB5(C118195Wf.A0C, AbstractC25227BEk.A0J(c1130158n, 40.0f)));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1442300503);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30493Dbc.A01(ASZ, i, 2);
        }
    }

    public static final void A02(C5Hc c5Hc, InterfaceC16660sJ interfaceC16660sJ, C5Tl c5Tl, int i) {
        int i2;
        boolean z;
        c5Tl.Enr(672811066);
        if ((i & 6) == 0) {
            i2 = AbstractC25230BEn.A04(AbstractC25233BEq.A1T(c5Tl, c5Hc, i) ? 1 : 0) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(225344704, "com.instagram.direct.fragment.thread.threadmedia.SharedLinksScreen (DirectThreadSharedLinksFragment.kt:120)");
            }
            LazyListState A00 = C6IE.A00(c5Tl, 0, 0, 0, 3);
            Modifier A0V = AbstractC25229BEm.A0V(AbstractC118175Wb.A0A(Modifier.A00, 16.0f, 0.0f), BHJ.A02(c5Tl), null);
            InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A00;
            C6ID A002 = AbstractC118255Wn.A00();
            C1333560c c1333560c = new C1333560c(0.0f, 16.0f, 0.0f, 16.0f);
            c5Tl.Eno(537424486);
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && c5Tl.AH6(c5Hc))) {
                z = true;
            } else {
                z = false;
            }
            boolean A1K = z | AbstractC25231BEo.A1K(i2);
            Object EEc = c5Tl.EEc();
            if (A1K || EEc == C5UI.A00) {
                EEc = new C50363MLp(21, interfaceC16660sJ, c5Hc);
                c5Tl.FBy(EEc);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            C6IS.A01(null, A002, c1333560c, A00, c5Tl, interfaceC118245Wl, A0V, (InterfaceC16660sJ) EEc, 12804480, 72, false, true);
            if (C0fH.A02()) {
                C0fH.A00(-392063219);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30510Dbt(interfaceC16660sJ, c5Hc, i, 11);
        }
    }
}
