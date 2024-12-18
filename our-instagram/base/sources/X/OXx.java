package X;

import java.io.IOException;

/* loaded from: classes9.dex */
public abstract class OXx {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.P6L] */
    public static P6L parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                A01(c16l, obj, AbstractC166997dE.A0s(c16l));
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, P6L p6l, boolean z) {
        if (z) {
            anonymousClass182.A0d();
        }
        anonymousClass182.A0Q("sub_share_id", p6l.A00);
        anonymousClass182.A0T("is_configured_in_server", p6l.A0B);
        anonymousClass182.A0T("igtv_share_preview_to_feed", p6l.A0F);
        if (p6l.A01 != null) {
            anonymousClass182.A0r("feed_preview_crop");
            AbstractC88283wd.A01(anonymousClass182, p6l.A01);
        }
        if (p6l.A02 != null) {
            anonymousClass182.A0r("square_crop");
            AbstractC88283wd.A01(anonymousClass182, p6l.A02);
        }
        String str = p6l.A09;
        if (str != null) {
            anonymousClass182.A0S("igtv_series_id", str);
        }
        String str2 = p6l.A06;
        if (str2 != null) {
            anonymousClass182.A0S("igtv_composer_session_id", str2);
        }
        anonymousClass182.A0T("igtv_ads_toggled_on", p6l.A0A);
        anonymousClass182.A0T("is_funded_deal", p6l.A0C);
        anonymousClass182.A0T("like_and_view_counts_disabled", p6l.A0D);
        if (p6l.A03 != null) {
            anonymousClass182.A0r("igtv_shopping_metadata");
            OPH.A00(anonymousClass182, p6l.A03);
        }
        if (p6l.A05 != null) {
            anonymousClass182.A0r("new_fundraiser_info");
            OY1.A01(anonymousClass182, p6l.A05);
        }
        String str3 = p6l.A07;
        if (str3 != null) {
            anonymousClass182.A0S("fundraiser_id", str3);
        }
        anonymousClass182.A0T("keep_shoppable_products", p6l.A0E);
        if (p6l.A04 != null) {
            anonymousClass182.A0r("creator_geo_gating_info");
            OPP.A00(anonymousClass182, p6l.A04);
        }
        String str4 = p6l.A08;
        if (str4 != null) {
            anonymousClass182.A0S("group_destination_id", str4);
        }
        if (z) {
            anonymousClass182.A0a();
        }
    }

    public static void A01(C16L c16l, P6L p6l, String str) {
        if ("sub_share_id".equals(str)) {
            p6l.A00 = c16l.A1D();
            return;
        }
        if ("is_configured_in_server".equals(str)) {
            p6l.A0B = c16l.A0d();
            return;
        }
        if ("igtv_share_preview_to_feed".equals(str)) {
            p6l.A0F = c16l.A0d();
            return;
        }
        if ("feed_preview_crop".equals(str)) {
            p6l.A01 = AbstractC88283wd.parseFromJson(c16l);
            return;
        }
        if ("square_crop".equals(str)) {
            p6l.A02 = AbstractC88283wd.parseFromJson(c16l);
            return;
        }
        if ("igtv_series_id".equals(str)) {
            p6l.A09 = AbstractC167017dG.A0m(c16l);
            return;
        }
        if ("igtv_composer_session_id".equals(str)) {
            p6l.A06 = AbstractC167017dG.A0m(c16l);
            return;
        }
        if ("igtv_ads_toggled_on".equals(str)) {
            p6l.A0A = c16l.A0d();
            return;
        }
        if ("is_funded_deal".equals(str)) {
            p6l.A0C = c16l.A0d();
            return;
        }
        if ("like_and_view_counts_disabled".equals(str)) {
            p6l.A0D = c16l.A0d();
            return;
        }
        if ("igtv_shopping_metadata".equals(str)) {
            p6l.A03 = OPH.parseFromJson(c16l);
            return;
        }
        if ("new_fundraiser_info".equals(str)) {
            p6l.A05 = OY1.parseFromJson(c16l);
            return;
        }
        if ("fundraiser_id".equals(str)) {
            p6l.A07 = AbstractC167017dG.A0m(c16l);
            return;
        }
        if ("keep_shoppable_products".equals(str)) {
            p6l.A0E = c16l.A0d();
        } else if ("creator_geo_gating_info".equals(str)) {
            p6l.A04 = OPP.parseFromJson(c16l);
        } else {
            if (!"group_destination_id".equals(str)) {
                return;
            }
            p6l.A08 = AbstractC167017dG.A0m(c16l);
        }
    }
}
