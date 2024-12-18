package X;

import com.instagram.user.model.ProductCollectionImpl;
import java.io.IOException;

/* renamed from: X.HnF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39924HnF {
    public static H3L parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ProductCollectionImpl productCollectionImpl = null;
            String str = null;
            H4G h4g = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("collection_metadata".equals(A0s)) {
                    productCollectionImpl = IT1.parseFromJson(c16l);
                } else if ("collection_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("discount_metadata".equals(A0s)) {
                    h4g = Hq8.parseFromJson(c16l);
                } else if ("highlight_bar_destination".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(435).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else {
                    bool = AbstractC37303Gc4.A0K(c16l, bool, A0s, "is_auto_tagged");
                }
                c16l.A0z();
            }
            return new H3L(h4g, productCollectionImpl, bool, str, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
