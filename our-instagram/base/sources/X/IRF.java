package X;

import com.instagram.api.schemas.MultiProductComponentDestinationType;
import com.instagram.model.shopping.reels.ProductCollectionLink;
import com.instagram.model.shopping.reels.ShoppingDestinationMetadata;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class IRF {
    public static ProductCollectionLink parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            ShoppingDestinationMetadata shoppingDestinationMetadata = null;
            String str3 = null;
            String str4 = null;
            MultiProductComponentDestinationType multiProductComponentDestinationType = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("button_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("destination_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("destination_metadata".equals(A0s)) {
                    shoppingDestinationMetadata = IRJ.parseFromJson(c16l);
                } else if ("destination_subtitle".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("destination_title".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("destination_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    multiProductComponentDestinationType = (MultiProductComponentDestinationType) MultiProductComponentDestinationType.A01.get(A1P);
                    if (multiProductComponentDestinationType == null) {
                        multiProductComponentDestinationType = MultiProductComponentDestinationType.A0G;
                    }
                }
                c16l.A0z();
            }
            if (multiProductComponentDestinationType == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("destination_type", c16l, "ProductCollectionLink");
                throw C00O.createAndThrow();
            }
            return new ProductCollectionLink(multiProductComponentDestinationType, shoppingDestinationMetadata, str, str2, str3, str4);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, ProductCollectionLink productCollectionLink) {
        anonymousClass182.A0d();
        String str = productCollectionLink.A02;
        if (str != null) {
            anonymousClass182.A0S("button_text", str);
        }
        String str2 = productCollectionLink.A03;
        if (str2 != null) {
            anonymousClass182.A0S("destination_id", str2);
        }
        ShoppingDestinationMetadata shoppingDestinationMetadata = productCollectionLink.A01;
        if (shoppingDestinationMetadata != null) {
            anonymousClass182.A0r("destination_metadata");
            IRJ.A00(anonymousClass182, shoppingDestinationMetadata);
        }
        String str3 = productCollectionLink.A04;
        if (str3 != null) {
            anonymousClass182.A0S("destination_subtitle", str3);
        }
        String str4 = productCollectionLink.A05;
        if (str4 != null) {
            anonymousClass182.A0S("destination_title", str4);
        }
        MultiProductComponentDestinationType multiProductComponentDestinationType = productCollectionLink.A00;
        if (multiProductComponentDestinationType != null) {
            anonymousClass182.A0S("destination_type", multiProductComponentDestinationType.A00);
        }
        anonymousClass182.A0a();
    }
}
