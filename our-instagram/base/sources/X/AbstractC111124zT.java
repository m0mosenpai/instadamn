package X;

import com.instagram.model.shopping.ProductTagDict;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4zT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC111124zT {
    public static ProductTagDict parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            Boolean bool = null;
            ArrayList arrayList = null;
            ProductDetailsProductItemDict productDetailsProductItemDict = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("destination".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("hide_tag".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("is_removable".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("position".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            arrayList.add(new Float(c16l.A0U()));
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("product".equals(A0q)) {
                    productDetailsProductItemDict = AbstractC111134zU.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new ProductTagDict(productDetailsProductItemDict, bool, num, num2, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, ProductTagDict productTagDict) {
        anonymousClass182.A0d();
        Integer num = productTagDict.A02;
        if (num != null) {
            anonymousClass182.A0Q("destination", num.intValue());
        }
        Integer num2 = productTagDict.A03;
        if (num2 != null) {
            anonymousClass182.A0Q("hide_tag", num2.intValue());
        }
        Boolean bool = productTagDict.A01;
        if (bool != null) {
            anonymousClass182.A0T("is_removable", bool.booleanValue());
        }
        List<Number> list = productTagDict.A04;
        if (list != null) {
            C16V.A03(anonymousClass182, "position");
            for (Number number : list) {
                if (number != null) {
                    anonymousClass182.A0g(number.floatValue());
                }
            }
            anonymousClass182.A0Z();
        }
        ProductDetailsProductItemDict productDetailsProductItemDict = productTagDict.A00;
        if (productDetailsProductItemDict != null) {
            anonymousClass182.A0r("product");
            AbstractC111134zU.A00(anonymousClass182, productDetailsProductItemDict);
        }
        anonymousClass182.A0a();
    }
}
