package X;

import com.instagram.api.schemas.FBProductItemDetailsDictImpl;
import com.instagram.api.schemas.ProductTileProductImpl;
import java.io.IOException;

/* renamed from: X.Hrz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40187Hrz {
    public static ProductTileProductImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            FBProductItemDetailsDictImpl fBProductItemDetailsDictImpl = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("fb_product".equals(AbstractC166997dE.A0s(c16l))) {
                    fBProductItemDetailsDictImpl = AbstractC39914Hn2.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new ProductTileProductImpl(fBProductItemDetailsDictImpl);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
