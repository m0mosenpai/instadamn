package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.instagram.api.schemas.PivotPageInsightsTip;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.ChW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28478ChW {
    public static final void A00(C5Tl c5Tl, Modifier modifier, ImageUrl imageUrl, int i) {
        int i2;
        C14360o3.A0B(modifier, 1);
        c5Tl.Enr(-1117466180);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, imageUrl) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, modifier);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(317692528, "instagram.features.clips.pivot.header.composables.PivotPageReelsThumbnail (PivotPageHeaderComposables.kt:47)");
            }
            C6LQ.A08(c5Tl, AbstractC25228BEl.A0X(modifier, 12.0f), AbstractC25226BEj.A0w(c5Tl, imageUrl, i2), C5YJ.A01);
            if (C0fH.A02()) {
                C0fH.A00(845846028);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30508Dbr.A01(ASZ, modifier, imageUrl, i, 38);
        }
    }

    public static final void A01(C5Tl c5Tl, PivotPageInsightsTip pivotPageInsightsTip, int i) {
        int i2;
        C14360o3.A0B(pivotPageInsightsTip, 0);
        c5Tl.Enr(-1296077058);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, pivotPageInsightsTip) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1171189583, "instagram.features.clips.pivot.header.composables.PivotPageTip (PivotPageHeaderComposables.kt:106)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A0E = AbstractC118175Wb.A0E(AbstractC25228BEl.A0Y(c1130158n, 16.0f, 1.0f, AbstractC25226BEj.A0K(c5Tl)), 16.0f, 0.0f, 0.0f, 0.0f);
            InterfaceC1127857k A02 = AbstractC118375Wz.A02(AbstractC118255Wn.A01, c5Tl, C118195Wf.A04, 48);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0E);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A02, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            C5YS.A01(c5Tl, null, C5Y7.A00(c5Tl, R.drawable.instagram_performance_highlight_pano_outline_24, 0), 48, 28, 0L);
            Modifier A0B = AbstractC118175Wb.A0B(c1130158n, 16.0f, 24.0f, 16.0f);
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A002 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A0B);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A0Y, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            String title = pivotPageInsightsTip.getTitle();
            if (title == null) {
                title = "";
            }
            C5WR.A0u(c5Tl, AbstractC25226BEj.A0h(c5Tl), title, AbstractC25226BEj.A0G(c5Tl));
            String Agr = pivotPageInsightsTip.Agr();
            if (Agr == null) {
                Agr = "";
            }
            C5WR.A0Y(c5Tl, AbstractC118175Wb.A0E(c1130158n, 0.0f, 6.0f, 0.0f, 0.0f), AbstractC25225BEi.A0Y(c5Tl), Agr, AbstractC25226BEj.A0M(c5Tl));
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(1799455531);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30498Dbh.A01(ASZ, pivotPageInsightsTip, i, 21);
        }
    }

    public static final void A03(C5Tl c5Tl, String str, int i, boolean z) {
        int i2;
        C118125Vw A0g;
        C14360o3.A0B(str, 0);
        c5Tl.Enr(872626303);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0c(c5Tl, z);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-311226925, "instagram.features.clips.pivot.header.composables.PivotPageTitle (PivotPageHeaderComposables.kt:35)");
            }
            if (z) {
                c5Tl.Eno(1894156947);
                A0g = AbstractC25225BEi.A0X(c5Tl);
            } else {
                c5Tl.Eno(1894158217);
                A0g = AbstractC25226BEj.A0g(c5Tl);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            C5WR.A0l(c5Tl, A0g, str, 1, 2, i2 & 14, 390, 11262, 0L);
            if (C0fH.A02()) {
                C0fH.A00(-1775670159);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DSX(str, z, i, 4);
        }
    }

    public static final void A04(C5Tl c5Tl, String str, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z) {
        int i2;
        AbstractC167007dF.A1D(str, 0, interfaceC16820sZ);
        c5Tl.Enr(-1044189305);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0c(c5Tl, z);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1570459878, "instagram.features.clips.pivot.header.composables.PivotPageUserName (PivotPageHeaderComposables.kt:61)");
            }
            InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
            C1130158n c1130158n = Modifier.A00;
            Modifier A07 = AbstractC118175Wb.A07(c1130158n);
            boolean A1Q = AbstractC25233BEq.A1Q(c5Tl, -1091730339, i2);
            Object EEc = c5Tl.EEc();
            if (A1Q || EEc == C5UI.A00) {
                EEc = C29888DGc.A00(interfaceC16820sZ, 11);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Modifier A01 = CY3.A01(c5Tl, A07, (InterfaceC16820sZ) EEc);
            InterfaceC1127857k A0V = AbstractC25225BEi.A0V(c5Tl, interfaceC118225Wj);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, A01);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A0V, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A012);
            C5WR.A0E(c5Tl, null, AbstractC25226BEj.A0h(c5Tl), str, 1, i2 & 14, 15354, AbstractC25226BEj.A0G(c5Tl));
            c5Tl.Eno(20423019);
            if (z) {
                AbstractC137516Kw.A00(c5Tl, AbstractC118175Wb.A0E(c1130158n, 4.0f, 0.0f, 0.0f, 0.0f));
            }
            if (AbstractC25230BEn.A1U(c5Tl, A0K, false)) {
                C0fH.A00(-897018066);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DT3(interfaceC16820sZ, str, i, 6, z);
        }
    }

    public static final void A05(String str, C5Tl c5Tl, int i) {
        int i2;
        C14360o3.A0B(str, 0);
        c5Tl.Enr(669556831);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1960376479, "instagram.features.clips.pivot.header.composables.PivotPageReelsCount (PivotPageHeaderComposables.kt:77)");
            }
            C5WR.A0E(c5Tl, AbstractC118175Wb.A07(Modifier.A00), AbstractC25226BEj.A0c(c5Tl), str, 1, (i2 & 14) | 48, 15352, AbstractC25226BEj.A0M(c5Tl));
            if (C0fH.A02()) {
                C0fH.A00(1937718700);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30500Dbj.A01(ASZ, str, i, 16);
        }
    }

    public static final void A06(InterfaceC16820sZ interfaceC16820sZ, String str, C5Tl c5Tl, int i) {
        int i2;
        AbstractC167007dF.A1K(str, interfaceC16820sZ);
        c5Tl.Enr(1360621495);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1468780401, "instagram.features.clips.pivot.header.composables.PivotPageCta (PivotPageHeaderComposables.kt:96)");
            }
            C25267BGf A0c = AbstractC25235BEs.A0c(c5Tl, false);
            C6GE.A01(c5Tl, AbstractC25228BEl.A0W(), C6GD.A03, A0c, str, interfaceC16820sZ, 1573248 | ((i2 >> 3) & 14) | ((i2 << 3) & 112), 408, false);
            if (C0fH.A02()) {
                C0fH.A00(481881257);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30503Dbm.A01(ASZ, interfaceC16820sZ, str, i, 15);
        }
    }

    public static final void A02(C5Tl c5Tl, ImageUrl imageUrl, int i) {
        int i2;
        c5Tl.Enr(657405143);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, imageUrl) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-280598579, "instagram.features.clips.pivot.header.composables.PivotPageProfilePic (PivotPageHeaderComposables.kt:87)");
            }
            C6LQ.A08(c5Tl, AbstractC25226BEj.A0W(AbstractC118175Wb.A0E(AbstractC118185Wd.A0G(Modifier.A00, 28.0f, 22.0f), 0.0f, 0.0f, 6.0f, 0.0f)), AbstractC25226BEj.A0w(c5Tl, imageUrl, i2), C5YJ.A01);
            if (C0fH.A02()) {
                C0fH.A00(-1124647911);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30498Dbh.A01(ASZ, imageUrl, i, 20);
        }
    }
}
