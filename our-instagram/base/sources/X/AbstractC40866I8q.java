package X;

import com.instagram.api.schemas.ProductCollectionV2Type;
import com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta;
import java.io.IOException;

/* renamed from: X.I8q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40866I8q {
    public static ProductCollectionFeedTaggingMeta parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            ProductCollectionV2Type productCollectionV2Type = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("collection_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("collection_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    productCollectionV2Type = AbstractC40163Hrb.A00(A1P);
                } else if (AbstractC111324zv.A00(2452).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(435).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("is_auto_tagged".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("merchant_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("collection_id", c16l, "ProductCollectionFeedTaggingMeta");
            } else if (productCollectionV2Type != null || !(c16l instanceof C07950bF)) {
                if (bool == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("is_auto_tagged", c16l, "ProductCollectionFeedTaggingMeta");
                } else {
                    return new ProductCollectionFeedTaggingMeta(productCollectionV2Type, str, str2, str3, str4, bool.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("collection_type", c16l, "ProductCollectionFeedTaggingMeta");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
