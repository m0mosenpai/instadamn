package X;

import com.instagram.model.shopping.clips.ClipsShoppingCTABar;
import com.instagram.model.shopping.clips.ClipsShoppingInfo;
import com.instagram.user.model.ProductCollectionImpl;
import com.instagram.user.model.ProductWrapper;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.3x5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC88483x5 {
    public static ClipsShoppingInfo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ClipsShoppingCTABar clipsShoppingCTABar = null;
            ProductCollectionImpl productCollectionImpl = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("clips_shopping_cta_bar".equals(A0q)) {
                    clipsShoppingCTABar = IRA.parseFromJson(c16l);
                } else if ("collection_metadata".equals(A0q)) {
                    productCollectionImpl = IT1.parseFromJson(c16l);
                } else if ("products".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
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
            return new ClipsShoppingInfo(clipsShoppingCTABar, productCollectionImpl, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
