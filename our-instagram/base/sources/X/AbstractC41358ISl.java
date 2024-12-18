package X;

import android.os.Bundle;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.model.shopping.productfeed.ProductTileMedia;
import com.instagram.shopping.intf.ProductDetailsPageArguments;
import com.instagram.shopping.model.analytics.ShoppingSearchLoggingInfo;
import com.instagram.user.model.Product;
import org.json.JSONObject;

/* renamed from: X.ISl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41358ISl {
    public static void A01(Product product, String str, String str2, String str3) {
        C02R.A05(AbstractC167007dF.A1W(product) ^ (str3 != null));
        if (product == null && str3 == null) {
            str.getClass();
            str2.getClass();
        }
    }

    public static Bundle A00(Bundle bundle, RankingInfo rankingInfo, ProductTileMedia productTileMedia, ShoppingSearchLoggingInfo shoppingSearchLoggingInfo, C2Fb c2Fb, Product product, Integer num, Integer num2, Integer num3, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, JSONObject jSONObject, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelable("pdp_arguments", new ProductDetailsPageArguments(bundle, rankingInfo, productTileMedia, null, shoppingSearchLoggingInfo, product, num2, num, num3, str16, str17, str18, str12, str5, str6, str22, str14, str21, str9, str8, str10, str24, str15, null, str7, str4, str, str3, str2, str19, str20, str11, str25, str13, jSONObject, l.longValue(), z5, z3, z4, z2, z));
        AbstractC37300Gc1.A0c(A0b, str17);
        A0b.putString("shopping_session_id", str23);
        if (c2Fb != null) {
            A0b.putString("cta_action_source", c2Fb.toString());
        }
        A0b.putInt("carousel_ad_index", i);
        return A0b;
    }
}
