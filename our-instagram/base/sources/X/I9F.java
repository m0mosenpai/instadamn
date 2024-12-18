package X;

import android.content.Context;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.user.model.UnavailableProductImpl;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public abstract class I9F {
    public static final C42325Ion A00(Context context, InterfaceC11380iw interfaceC11380iw, ProductFeedItem productFeedItem, JHT jht, int i, int i2, boolean z) {
        C14360o3.A0B(productFeedItem, 0);
        UnavailableProductImpl unavailableProductImpl = productFeedItem.A05;
        if (unavailableProductImpl != null) {
            String A0j = AbstractC37301Gc2.A0j(productFeedItem);
            User user = unavailableProductImpl.A00;
            return new C42325Ion(interfaceC11380iw, user.Bhu(), user.Bhu(), Integer.valueOf(AbstractC167017dG.A05(context)), A0j, user.getUsername(), new C57263Pbl(unavailableProductImpl, i, jht, i2, 5), C43208J8f.A00(jht, productFeedItem, 34), z);
        }
        throw AbstractC166987dD.A15("Missing unavailable product");
    }
}
