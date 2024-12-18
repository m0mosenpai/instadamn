package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductSource;
import com.instagram.user.model.Product;

/* loaded from: classes7.dex */
public abstract class INS {
    public ProductSource A00;
    public String A01;
    public final C18920wW A02;
    public final String A03;
    public final String A04;

    public final void A00(C41643IbZ c41643IbZ, Product product) {
        C14360o3.A0B(product, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A02, "instagram_shopping_shop_manager_add_product_tap");
        if (A0f.isSampled()) {
            I6O.A00(A0f, this, c41643IbZ, product);
            A0f.A7v("is_sku_match", Boolean.valueOf(I6N.A00(c41643IbZ)));
            AbstractC37300Gc1.A0m(A0f, this.A01);
            A0f.Cht();
        }
    }

    public final void A01(C41643IbZ c41643IbZ, Product product) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A02, "instagram_shopping_shop_manager_hide_product_tap");
        if (A0f.isSampled()) {
            I6O.A00(A0f, this, c41643IbZ, product);
            A0f.A7v("is_sku_match", Boolean.valueOf(I6N.A00(c41643IbZ)));
            AbstractC37300Gc1.A0m(A0f, this.A01);
            A0f.Cht();
        }
    }

    public final void A02(C41643IbZ c41643IbZ, Product product, String str, long j, long j2, boolean z) {
        String str2;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A02, "instagram_shopping_shop_manager_add_to_shop_request_completed");
        if (A0f.isSampled()) {
            I6O.A00(A0f, this, c41643IbZ, product);
            A0f.A9K("network_start_time", Long.valueOf(j));
            A0f.A9K(AbstractC111324zv.A00(476), Long.valueOf(j2));
            if (z) {
                str2 = "success";
            } else {
                str2 = OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE;
            }
            A0f.AAP("network_result", str2);
            A0f.AAP("error_message", str);
            A0f.Cht();
        }
    }

    public final void A03(C41643IbZ c41643IbZ, Product product, String str, long j, long j2, boolean z) {
        String str2;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A02, "instagram_shopping_shop_manager_hide_product_request_completed");
        if (A0f.isSampled()) {
            I6O.A00(A0f, this, c41643IbZ, product);
            A0f.A9K("network_start_time", Long.valueOf(j));
            A0f.A9K(AbstractC111324zv.A00(476), Long.valueOf(j2));
            if (z) {
                str2 = "success";
            } else {
                str2 = OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE;
            }
            A0f.AAP("network_result", str2);
            A0f.AAP("error_message", str);
            AbstractC37300Gc1.A0m(A0f, this.A01);
            A0f.Cht();
        }
    }

    public final void A04(boolean z) {
        String str;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A02, "instagram_shopping_product_search");
        if (A0f.isSampled()) {
            A0f.AAP("waterfall_id", this.A04);
            AbstractC37300Gc1.A0n(A0f, this.A03);
            A0f.A9K("is_marketer", AbstractC167007dF.A0d());
            if (z) {
                str = "success";
            } else {
                str = OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE;
            }
            A0f.AAP("network_result", str);
            A0f.AAP("product_search_context", "shop_manager");
            AbstractC37300Gc1.A0m(A0f, this.A01);
            ProductSource productSource = this.A00;
            if (productSource != null) {
                A0f.AAP("selected_source_id", productSource.A01);
                A0f.AAP("selected_source_name", productSource.A04);
                A0f.AAP("selected_source_type", productSource.A00.toString());
            }
            A0f.Cht();
        }
    }

    public INS(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, String str2) {
        this.A04 = str;
        this.A03 = str2;
        this.A02 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
    }
}
