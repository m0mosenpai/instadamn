package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductSource;
import java.util.List;

/* renamed from: X.IdV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41701IdV {
    public C51415MnN A00;
    public ProductSource A01;
    public List A02;
    public final C18920wW A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final UserSession A07;

    public final void A03(Boolean bool, Boolean bool2, Integer num, Integer num2, String str, boolean z) {
        String str2;
        String str3;
        String str4;
        C14360o3.A0B(num, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A03, "instagram_shopping_product_search");
        A0f.AAP("waterfall_id", this.A06);
        AbstractC37300Gc1.A0n(A0f, this.A04);
        ProductSource productSource = this.A01;
        Long l = null;
        if (productSource != null && productSource.A01 != null) {
            C14360o3.A0A(productSource);
            str2 = productSource.A01;
        } else {
            str2 = null;
        }
        A0f.AAP("selected_source_id", str2);
        ProductSource productSource2 = this.A01;
        if (productSource2 != null) {
            str3 = productSource2.A00.toString();
        } else {
            str3 = "";
        }
        A0f.AAP("selected_source_name", A00(A0f, this, "selected_source_type", str3));
        A0f.AAP("product_search_context", AbstractC41359ISm.A01(num));
        if (z) {
            str4 = "success";
        } else {
            str4 = OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE;
        }
        A0f.AAP("network_result", str4);
        if (num2 != null) {
            l = AbstractC25229BEm.A0n(num2);
        }
        A0f.A9K("result_count", l);
        A0f.AAP("search_text", str);
        A0f.A7v("is_initial_load", bool);
        A0f.A7v("has_more_results", bool2);
        A01(A0f, this);
        A0f.Cht();
    }

    public static void A01(InterfaceC02590Ai interfaceC02590Ai, C41701IdV c41701IdV) {
        interfaceC02590Ai.AAQ(c41701IdV.A00, "suggested_tags_info");
        interfaceC02590Ai.AAk("displayed_section_groups", c41701IdV.A02);
    }

    public final void A02() {
        Boolean bool;
        String str;
        String str2;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A03, "instagram_shopping_product_tagging_opened");
        AbstractC37300Gc1.A0n(A0f, this.A04);
        ProductSource productSource = this.A01;
        if (productSource != null) {
            bool = Boolean.valueOf(AbstractC167007dF.A1X(productSource.A00, EnumC39617HeR.A03));
        } else {
            bool = null;
        }
        A0f.A7v("is_influencer", bool);
        A0f.AAP("waterfall_id", this.A06);
        ProductSource productSource2 = this.A01;
        if (productSource2 != null) {
            str = productSource2.A00.toString();
        } else {
            str = "";
        }
        A0f.AAP("selected_source_type", str);
        ProductSource productSource3 = this.A01;
        if (productSource3 != null) {
            str2 = productSource3.A01;
        } else {
            str2 = null;
        }
        A0f.AAP("selected_source_name", A00(A0f, this, "selected_source_id", str2));
        AbstractC37300Gc1.A0q(A0f, this.A05);
        A0f.AAQ(this.A00, "suggested_tags_info");
        A0f.Cht();
    }

    public C41701IdV(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, String str2, String str3) {
        this.A07 = userSession;
        this.A06 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A03 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
    }

    public static String A00(InterfaceC02590Ai interfaceC02590Ai, C41701IdV c41701IdV, String str, String str2) {
        interfaceC02590Ai.AAP(str, str2);
        ProductSource productSource = c41701IdV.A01;
        if (productSource != null) {
            String str3 = productSource.A03;
            if (str3 == null) {
                return productSource.A04;
            }
            return str3;
        }
        return null;
    }
}
