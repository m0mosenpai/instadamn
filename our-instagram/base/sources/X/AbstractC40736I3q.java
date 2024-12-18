package X;

import com.instagram.model.shopping.productfeed.ProductCollectionFooterLink;
import java.io.IOException;

/* renamed from: X.I3q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40736I3q {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.instagram.model.shopping.productfeed.ProductCollectionFooterLink] */
    public static ProductCollectionFooterLink parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("linkType".equals(A0s)) {
                    obj.A00 = (EnumC906041v) EnumC906041v.A01.get(c16l.A1D());
                } else if ("webUri".equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("deeplinkUri".equals(A0s)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
