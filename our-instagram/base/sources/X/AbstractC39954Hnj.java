package X;

import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.Hnj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39954Hnj {
    public static H3T parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            User user = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            H3U h3u = null;
            ProductDetailsProductItemDict productDetailsProductItemDict = null;
            C50627MWo c50627MWo = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("account".equals(A0s)) {
                    user = AbstractC31171DnF.A0S(c16l, false);
                } else if ("place".equals(A0s)) {
                    h3u = AbstractC39955Hnk.parseFromJson(c16l);
                } else if ("product".equals(A0s)) {
                    productDetailsProductItemDict = AbstractC111134zU.parseFromJson(c16l);
                } else if ("product_container".equals(A0s)) {
                    c50627MWo = AbstractC39956Hnl.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new H3T(c50627MWo, h3u, productDetailsProductItemDict, user);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
