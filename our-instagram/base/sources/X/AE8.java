package X;

import com.instagram.model.shopping.reels.ReelMultiProductLink;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AE8 {
    public static ReelMultiProductLink parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                if ("products".equals(AbstractC166997dE.A0s(c16l))) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            ProductDetailsProductItemDict parseFromJson = AbstractC111134zU.parseFromJson(c16l);
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
            return new ReelMultiProductLink(arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, ReelMultiProductLink reelMultiProductLink) {
        anonymousClass182.A0d();
        List<ProductDetailsProductItemDict> list = reelMultiProductLink.A00;
        if (list != null) {
            C16V.A03(anonymousClass182, "products");
            for (ProductDetailsProductItemDict productDetailsProductItemDict : list) {
                if (productDetailsProductItemDict != null) {
                    AbstractC111134zU.A00(anonymousClass182, productDetailsProductItemDict);
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0a();
    }
}
