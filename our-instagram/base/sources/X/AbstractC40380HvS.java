package X;

import com.instagram.api.schemas.ProductMediaType;
import java.io.IOException;

/* renamed from: X.HvS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40380HvS {
    public static C50627MWo parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            H6a h6a = null;
            ProductMediaType productMediaType = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("content".equals(A0s)) {
                    h6a = AbstractC40379HvR.parseFromJson(c16l);
                } else if ("media_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    productMediaType = (ProductMediaType) ProductMediaType.A01.get(A1P);
                    if (productMediaType == null) {
                        productMediaType = ProductMediaType.A06;
                    }
                }
                c16l.A0z();
            }
            if (h6a == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("content", c16l, "TaggedProductMediaImpl");
            } else if (productMediaType == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("media_type", c16l, "TaggedProductMediaImpl");
            } else {
                return new C50627MWo(productMediaType, h6a);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
