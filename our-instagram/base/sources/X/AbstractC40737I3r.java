package X;

import com.instagram.model.shopping.productfeed.ProductCollectionFooter;
import com.instagram.model.shopping.productfeed.ProductCollectionFooterLink;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.I3r, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40737I3r {
    public static ProductCollectionFooter parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ProductCollectionFooter productCollectionFooter = new ProductCollectionFooter();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if (AbstractC37300Gc1.A1D(A0s)) {
                    productCollectionFooter.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("android_links".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            ProductCollectionFooterLink parseFromJson = AbstractC40736I3q.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    productCollectionFooter.A01 = arrayList;
                }
                c16l.A0z();
            }
            return productCollectionFooter;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
