package X;

import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I3Z {
    public static C38818H7j parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38819H7k c38819H7k = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ProductDetailsProductItemDict productDetailsProductItemDict = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("permission".equals(A0s)) {
                    c38819H7k = I3Y.parseFromJson(c16l);
                } else if ("product".equals(A0s)) {
                    productDetailsProductItemDict = AbstractC111134zU.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C38818H7j(c38819H7k, productDetailsProductItemDict);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
