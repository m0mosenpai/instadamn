package X;

import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;

/* renamed from: X.I7b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40825I7b {
    public static C41730Ie1 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C41224IMp c41224IMp = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("item".equals(A0s)) {
                    c41224IMp = AbstractC40824I7a.parseFromJson(c16l);
                } else if ("quantity".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else {
                    num2 = AbstractC31178DnM.A0V(c16l, num2, A0s, AbstractC111324zv.A00(465));
                }
                c16l.A0z();
            }
            C41730Ie1 c41730Ie1 = new C41730Ie1();
            if (c41224IMp != null) {
                c41730Ie1.A02 = c41224IMp;
            }
            if (num != null) {
                c41730Ie1.A01 = num.intValue();
            }
            if (num2 != null) {
                c41730Ie1.A00 = num2.intValue();
            }
            C41224IMp c41224IMp2 = c41730Ie1.A02;
            ProductDetailsProductItemDict productDetailsProductItemDict = c41224IMp2.A01;
            if (productDetailsProductItemDict != null) {
                c41224IMp2.A00 = new ProductTile(new Product(null, productDetailsProductItemDict));
                c41730Ie1.A02.A01 = null;
                return c41730Ie1;
            }
            return c41730Ie1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
