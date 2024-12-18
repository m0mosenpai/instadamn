package X;

import com.instagram.model.shopping.clips.ClipsShoppingCTABar;
import com.instagram.model.shopping.clips.IGTVShoppingInfo;
import com.instagram.user.model.ProductCollectionImpl;
import com.instagram.user.model.ProductWrapper;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public abstract class I3U {
    public static IGTVShoppingInfo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ClipsShoppingCTABar clipsShoppingCTABar = null;
            ProductCollectionImpl productCollectionImpl = null;
            User user = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("clips_shopping_cta_bar".equals(A0s)) {
                    clipsShoppingCTABar = IRA.parseFromJson(c16l);
                } else if ("collection_metadata".equals(A0s)) {
                    productCollectionImpl = IT1.parseFromJson(c16l);
                } else if ("merchant".equals(A0s)) {
                    user = AbstractC31171DnF.A0S(c16l, false);
                } else if ("products".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            ProductWrapper parseFromJson = IT2.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                c16l.A0z();
            }
            return new IGTVShoppingInfo(clipsShoppingCTABar, productCollectionImpl, user, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
