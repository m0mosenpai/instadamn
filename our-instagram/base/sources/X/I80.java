package X;

import com.instagram.model.shopping.productfeed.ProductTile;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I80 {
    public static C38687GzS parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C38687GzS c38687GzS = new C38687GzS(15);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("product_tile".equals(A0s)) {
                    ProductTile parseFromJson = AbstractC40741I3v.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c38687GzS.A00 = parseFromJson;
                } else if ("deeplink".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                    c38687GzS.A01 = A1P;
                }
                c16l.A0z();
            }
            return c38687GzS;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
