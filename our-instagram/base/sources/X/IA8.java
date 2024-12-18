package X;

import com.instagram.user.model.ProductCollectionImpl;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class IA8 {
    public static H88 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ProductCollectionImpl productCollectionImpl = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Long l = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("discount_metadata".equals(A0s)) {
                    productCollectionImpl = IT1.parseFromJson(c16l);
                } else {
                    l = AbstractC37303Gc4.A0O(c16l, l, A0s, "end_time");
                }
                c16l.A0z();
            }
            return new H88(productCollectionImpl, l);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
