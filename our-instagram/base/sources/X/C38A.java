package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;

/* renamed from: X.38A, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C38A {
    public final C18920wW A00;
    public final UserSession A01;
    public final C38B A02;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0Zx, X.38B] */
    public C38A(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC11380iw, 2);
        this.A01 = userSession;
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        ?? c0Zx = new C0Zx();
        c0Zx.A06("shopping_session_id", str);
        c0Zx.A06("prior_module", str2);
        c0Zx.A06("prior_submodule", str3);
        this.A02 = c0Zx;
    }

    public final void A00(C38321qM c38321qM, FeaturedProductPermissionStatus featuredProductPermissionStatus, String str, String str2, String str3, String str4) {
        C38532Gwt c38532Gwt;
        C14360o3.A0B(str, 1);
        C14360o3.A0B(featuredProductPermissionStatus, 2);
        C14360o3.A0B(str2, 3);
        C14360o3.A0B(str3, 4);
        C14360o3.A0B(str4, 5);
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_shopping_media_owner_featured_product_permission_status_update_success");
        A00.AAP("action", featuredProductPermissionStatus.A00);
        A00.A9K("product_id", Long.valueOf(Long.parseLong(str2)));
        A00.AAK(C4SX.A00(str3), "merchant_id");
        A00.A9K("permission_id", Long.valueOf(Long.parseLong(str)));
        C38B c38b = this.A02;
        c38b.A06("submodule", str4);
        A00.AAQ(c38b, "navigation_info");
        if (c38321qM != null) {
            c38532Gwt = C128205qp.A00(this.A01, c38321qM);
        } else {
            c38532Gwt = null;
        }
        A00.AAQ(c38532Gwt, "feed_item_info");
        A00.Cht();
    }

    public final void A01(C38321qM c38321qM, FeaturedProductPermissionStatus featuredProductPermissionStatus, String str, String str2, String str3, String str4) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 3);
        C14360o3.A0B(str3, 4);
        C14360o3.A0B(str4, 5);
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_shopping_seller_featured_product_permission_status_update_success");
        A00.AAP("action", featuredProductPermissionStatus.A00);
        A00.A9K("product_id", Long.valueOf(Long.parseLong(str2)));
        A00.AAK(C4SX.A00(str3), "merchant_id");
        A00.A9K("permission_id", Long.valueOf(Long.parseLong(str)));
        A00.AAQ(C128205qp.A00(this.A01, c38321qM), "feed_item_info");
        C38B c38b = this.A02;
        c38b.A06("submodule", str4);
        A00.AAQ(c38b, "navigation_info");
        A00.Cht();
    }

    public final void A02(FeaturedProductPermissionStatus featuredProductPermissionStatus, String str, String str2, String str3, String str4) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(featuredProductPermissionStatus, 2);
        C14360o3.A0B(str2, 3);
        C14360o3.A0B(str3, 4);
        C14360o3.A0B(str4, 5);
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_shopping_media_owner_featured_product_permission_status_update_failure");
        A00.AAP("action", featuredProductPermissionStatus.A00);
        A00.A9K("product_id", Long.valueOf(Long.parseLong(str2)));
        A00.AAK(C4SX.A00(str3), "merchant_id");
        A00.A9K("permission_id", Long.valueOf(Long.parseLong(str)));
        C38B c38b = this.A02;
        c38b.A06("submodule", str4);
        A00.AAQ(c38b, "navigation_info");
        A00.AAQ(null, "feed_item_info");
        A00.Cht();
    }
}
