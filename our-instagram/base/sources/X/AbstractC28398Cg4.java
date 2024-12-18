package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.tigon.tigonhuc.HucClient;
import com.instagram.api.schemas.IGRevShareProductType;
import java.util.List;

/* renamed from: X.Cg4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28398Cg4 {
    public static final void A02(C5Tl c5Tl, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        int i3;
        C14360o3.A0B(interfaceC16660sJ, 1);
        c5Tl.Enr(-1895940200);
        if ((i2 & 14) == 0) {
            i3 = AbstractC25232BEp.A08(c5Tl, i) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i3 & 91) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1662641537, "com.instagram.partnerprogram.fragment.OverlayAdsHeaderView (PublisherControlBlockedCategoriesComposeFragment.kt:278)");
            }
            c5Tl.Eno(871928196);
            C6C7 A0g = AbstractC25228BEl.A0g();
            String A00 = AbstractC136736Hc.A00(c5Tl, 2131963844);
            String A02 = AbstractC136736Hc.A02(c5Tl, AbstractC25228BEl.A1Z(A00, i), R.plurals.ig_overlay_ads_publisher_control_revshare_blocked_categories_screen_description_text, i);
            A0g.A09(A02);
            C14360o3.A0B(A02, 0);
            int A0E = AbstractC25230BEn.A0E(A02, A00);
            int A0A = AbstractC167007dF.A0A(A00) + A0E;
            A0g.A06(new C5W3(null, null, null, null, null, 65534, AbstractC25226BEj.A0N(c5Tl), 0L, 0L), A0E, A0A);
            C5C8 A0R = AbstractC25227BEk.A0R(A0g, "Disclaimer link", "Clickable link", A0E, A0A);
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Modifier A022 = AbstractC118175Wb.A02(AbstractC25228BEl.A0W());
            C118125Vw A0D = AbstractC25226BEj.A0f(c5Tl).A0D(new C118125Vw(null, null, null, 0, 0, 6291454, AbstractC25226BEj.A0M(c5Tl), 0L, 0L, 0L));
            boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, A0R, 871968955) | AbstractC25228BEl.A1T(i3);
            Object EEc = c5Tl.EEc();
            if (A1Y || EEc == C5UI.A00) {
                EEc = new C50362MLo(49, A0R, interfaceC16660sJ);
                c5Tl.FBy(EEc);
            }
            AbstractC27477CAy.A00(c5Tl, A022, A0R, A0D, null, AbstractC25225BEi.A1B(A0K, EEc, false), 0, 0, 48, HucClient.BODY_UPLOAD_TIMEOUT_SECONDS, false);
            if (C0fH.A02()) {
                C0fH.A00(-565320347);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30501Dbk.A01(ASZ, interfaceC16660sJ, i, i2, 18);
        }
    }

    public static final void A03(C5Tl c5Tl, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        int i3;
        String A02;
        C14360o3.A0B(interfaceC16660sJ, 1);
        c5Tl.Enr(719511455);
        if ((i2 & 14) == 0) {
            i3 = AbstractC25232BEp.A08(c5Tl, i) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i3 & 91) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(146413273, "com.instagram.partnerprogram.fragment.ProfileAdsHeaderView (PublisherControlBlockedCategoriesComposeFragment.kt:222)");
            }
            c5Tl.Eno(2057360932);
            C6C7 A0g = AbstractC25228BEl.A0g();
            String A00 = AbstractC136736Hc.A00(c5Tl, 2131963844);
            if (i == -1) {
                c5Tl.Eno(-2140320974);
                A02 = AbstractC25235BEs.A0p(c5Tl, A00, 2131963849);
            } else {
                c5Tl.Eno(-2140118699);
                A02 = AbstractC136736Hc.A02(c5Tl, AbstractC25228BEl.A1Z(A00, i), R.plurals.ig_profile_publisher_control_non_revshare_blocked_categories_screen_description_text, i);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            A0g.A09(A02);
            C14360o3.A0B(A02, 0);
            int A0E = AbstractC25230BEn.A0E(A02, A00);
            int A0A = AbstractC167007dF.A0A(A00) + A0E;
            A0g.A06(new C5W3(null, null, null, null, null, 65534, AbstractC25226BEj.A0N(c5Tl), 0L, 0L), A0E, A0A);
            C5C8 A0R = AbstractC25227BEk.A0R(A0g, "Disclaimer link", "Clickable link", A0E, A0A);
            C117505Tk.A0L(A0K, false);
            Modifier A022 = AbstractC118175Wb.A02(AbstractC25228BEl.A0W());
            C118125Vw A0D = AbstractC25226BEj.A0f(c5Tl).A0D(new C118125Vw(null, null, null, 0, 0, 6291454, AbstractC25226BEj.A0M(c5Tl), 0L, 0L, 0L));
            boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, A0R, 2057411394) | AbstractC25228BEl.A1T(i3);
            Object EEc = c5Tl.EEc();
            if (A1Y || EEc == C5UI.A00) {
                EEc = new C57750Pjd(0, interfaceC16660sJ, A0R);
                c5Tl.FBy(EEc);
            }
            AbstractC27477CAy.A00(c5Tl, A022, A0R, A0D, null, AbstractC25225BEi.A1B(A0K, EEc, false), 0, 0, 48, HucClient.BODY_UPLOAD_TIMEOUT_SECONDS, false);
            if (C0fH.A02()) {
                C0fH.A00(-47568422);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30501Dbk.A01(ASZ, interfaceC16660sJ, i, i2, 19);
        }
    }

    public static final void A00(C5Tl c5Tl, int i) {
        c5Tl.Enr(770381693);
        if (i == 0 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1874760643, "com.instagram.partnerprogram.fragment.LoadingComponent (PublisherControlBlockedCategoriesComposeFragment.kt:179)");
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
            BIR.A03(c5Tl, c1130158n, A01);
            if (C0fH.A02()) {
                C0fH.A00(1296603875);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30493Dbc.A01(ASZ, i, 12);
        }
    }

    public static final void A01(C5Tl c5Tl, IGRevShareProductType iGRevShareProductType, List list, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        if (AbstractC25235BEs.A1W(c5Tl, 1423012944)) {
            C0fH.A01(-740432857, "com.instagram.partnerprogram.fragment.CategoryListComponent (PublisherControlBlockedCategoriesComposeFragment.kt:189)");
        }
        if (AbstractC25235BEs.A1Z(c5Tl, new C30219DSy(i, 6, interfaceC16660sJ, iGRevShareProductType, list), 465570002)) {
            C0fH.A00(1249498655);
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30490DbZ(i2, i, 34, list, iGRevShareProductType, interfaceC16660sJ);
        }
    }
}
