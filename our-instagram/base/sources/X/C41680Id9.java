package X;

import android.content.Context;
import com.instagram.api.schemas.SellerBadgeDict;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.user.model.Product;
import java.util.List;

/* renamed from: X.Id9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41680Id9 {
    public static final C41680Id9 A00 = new Object();

    public static final void A00(Context context, EnumC39545HdH enumC39545HdH, Product product, Integer num, List list) {
        String string;
        SellerBadgeDict sellerBadgeDict;
        if (list.size() < 2) {
            int ordinal = enumC39545HdH.ordinal();
            if (ordinal != 0) {
                if (ordinal == 3 && (sellerBadgeDict = product.A01.A08) != null) {
                    string = sellerBadgeDict.A02;
                } else {
                    return;
                }
            } else {
                ProductCheckoutProperties productCheckoutProperties = product.A01.A0C;
                if (productCheckoutProperties == null || !AbstractC31177DnL.A1b(productCheckoutProperties.A05)) {
                    return;
                } else {
                    string = context.getString(2131971522);
                }
            }
            if (string != null) {
                if (list.size() > 0 && num == C05F.A00) {
                    string = AnonymousClass001.A0R(" • ", string);
                    C14360o3.A07(string);
                }
                list.add(string);
            }
        }
    }
}
