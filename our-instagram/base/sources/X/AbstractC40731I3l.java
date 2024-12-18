package X;

import com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadataImpl;
import java.io.IOException;

/* renamed from: X.I3l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40731I3l {
    public static ProductCollectionDropsMetadataImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Long l = null;
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("collection_reminder_set".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("launch_date".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else {
                    num = AbstractC31178DnM.A0V(c16l, num, A0s, "num_products");
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("collection_reminder_set", c16l, "ProductCollectionDropsMetadataImpl");
            } else if (l == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("launch_date", c16l, "ProductCollectionDropsMetadataImpl");
            } else {
                return new ProductCollectionDropsMetadataImpl(num, l.longValue(), bool.booleanValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
