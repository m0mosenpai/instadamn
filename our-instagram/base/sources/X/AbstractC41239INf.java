package X;

import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.INf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41239INf {
    public static C114555Fb parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                if ("end_scene_products".equals(AbstractC166997dE.A0s(c16l))) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC37302Gc3.A1L(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                }
                c16l.A0z();
            }
            return new C114555Fb(arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C114555Fb c114555Fb) {
        anonymousClass182.A0d();
        List list = c114555Fb.A00;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "end_scene_products", list);
            while (A0q.hasNext()) {
                ProductDetailsProductItemDict productDetailsProductItemDict = (ProductDetailsProductItemDict) A0q.next();
                if (productDetailsProductItemDict != null) {
                    AbstractC111134zU.A00(anonymousClass182, productDetailsProductItemDict);
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0a();
    }
}
