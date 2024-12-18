package X;

import com.instagram.model.shopping.productcollection.ProductCollectionCoverImpl;
import com.instagram.model.shopping.productfeed.ProductCollectionHeader;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.I3s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40738I3s {
    public static ProductCollectionHeader parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ProductCollectionHeader productCollectionHeader = new ProductCollectionHeader();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("cover".equals(A0s)) {
                    ProductCollectionCoverImpl parseFromJson = AbstractC40729I3j.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    productCollectionHeader.A00 = parseFromJson;
                } else {
                    ArrayList arrayList = null;
                    if (AbstractC31171DnF.A1a(A0s)) {
                        String A0m = AbstractC167017dG.A0m(c16l);
                        C14360o3.A0B(A0m, 0);
                        productCollectionHeader.A04 = A0m;
                    } else if ("users".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167017dG.A1H(c16l, arrayList);
                            }
                        }
                        C14360o3.A0B(arrayList, 0);
                        productCollectionHeader.A05 = arrayList;
                    } else if (AbstractC37300Gc1.A1L(A0s)) {
                        productCollectionHeader.A03 = AbstractC167017dG.A0m(c16l);
                    } else if (AbstractC37300Gc1.A1Q(A0s)) {
                        productCollectionHeader.A02 = AbstractC167017dG.A0m(c16l);
                    } else if ("drops_collection_metadata".equals(A0s)) {
                        productCollectionHeader.A01 = AbstractC40731I3l.parseFromJson(c16l);
                    }
                }
                c16l.A0z();
            }
            return productCollectionHeader;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
