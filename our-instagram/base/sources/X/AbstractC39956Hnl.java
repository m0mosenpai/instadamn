package X;

import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.UnavailableProductImpl;
import java.io.IOException;

/* renamed from: X.Hnl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39956Hnl {
    public static C50627MWo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ProductDetailsProductItemDict productDetailsProductItemDict = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            UnavailableProductImpl unavailableProductImpl = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("product".equals(A0s)) {
                    productDetailsProductItemDict = AbstractC111134zU.parseFromJson(c16l);
                } else if ("unavailable_product".equals(A0s)) {
                    unavailableProductImpl = IAD.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C50627MWo(12, unavailableProductImpl, productDetailsProductItemDict);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
