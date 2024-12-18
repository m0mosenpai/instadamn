package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductFeedResponse;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class IRD {
    public static ProductFeedResponse parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ProductFeedResponse productFeedResponse = new ProductFeedResponse();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC37300Gc1.A1W(A0s)) {
                    productFeedResponse.A04 = c16l.A0d();
                } else {
                    ArrayList arrayList = null;
                    if (AbstractC37300Gc1.A1S(A0s)) {
                        productFeedResponse.A01 = AbstractC167017dG.A0m(c16l);
                    } else if ("num_results".equals(A0s)) {
                        productFeedResponse.A00 = c16l.A1D();
                    } else if ("pagination_token".equals(A0s)) {
                        productFeedResponse.A02 = AbstractC167017dG.A0m(c16l);
                    } else if (DialogModule.KEY_ITEMS.equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                ProductFeedItem parseFromJson = AbstractC40739I3t.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        productFeedResponse.A03 = arrayList;
                    } else {
                        C55702hA.A01(c16l, productFeedResponse, A0s);
                    }
                }
                c16l.A0z();
            }
            return productFeedResponse;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
