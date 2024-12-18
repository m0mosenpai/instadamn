package X;

import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I47 {
    public static C38821H7n parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ProductDetailsProductItemDict productDetailsProductItemDict = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("product".equals(AbstractC166997dE.A0s(c16l))) {
                    productDetailsProductItemDict = AbstractC111134zU.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C38821H7n(productDetailsProductItemDict);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
