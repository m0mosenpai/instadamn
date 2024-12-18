package X;

import com.instagram.model.shopping.productcollection.ProductCollectionCoverImpl;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl;
import com.instagram.model.showreelnative.IgShowreelNativeAnimation;
import java.io.IOException;

/* renamed from: X.I3j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40729I3j {
    public static ProductCollectionCoverImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ProductImageContainerImpl productImageContainerImpl = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            IgShowreelNativeAnimation igShowreelNativeAnimation = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("image".equals(A0s)) {
                    productImageContainerImpl = AbstractC111144zV.parseFromJson(c16l);
                } else if ("showreel_native_animation".equals(A0s)) {
                    igShowreelNativeAnimation = C52l.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new ProductCollectionCoverImpl(productImageContainerImpl, igShowreelNativeAnimation);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
