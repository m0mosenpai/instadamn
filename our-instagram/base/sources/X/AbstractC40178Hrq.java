package X;

import com.instagram.api.schemas.ProductTileBannerMetadataDecorationImpl;
import com.instagram.api.schemas.ProductTileBannerType;
import java.io.IOException;

/* renamed from: X.Hrq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40178Hrq {
    public static ProductTileBannerMetadataDecorationImpl parseFromJson(C16L c16l) {
        String A00;
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            ProductTileBannerType productTileBannerType = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC43591JPw.A00(303);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("banner_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (A00.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    productTileBannerType = (ProductTileBannerType) ProductTileBannerType.A01.get(A1P);
                    if (productTileBannerType == null) {
                        productTileBannerType = ProductTileBannerType.A09;
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("banner_text", c16l, "ProductTileBannerMetadataDecorationImpl");
            } else if (productTileBannerType == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(A00, c16l, "ProductTileBannerMetadataDecorationImpl");
            } else {
                return new ProductTileBannerMetadataDecorationImpl(productTileBannerType, str);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
