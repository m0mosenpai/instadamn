package X;

import java.io.IOException;

/* renamed from: X.8wF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC201828wF {
    /* JADX WARN: Type inference failed for: r0v2, types: [X.8uk, java.lang.Object] */
    public static C201038uk parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if (!"felix_links".equals(A0q)) {
                    if (!"total_ar_effects".equals(A0q)) {
                        if (!"swipe_up_urls".equals(A0q) && !"profile_shop_links".equals(A0q) && !"shopping_collection_links".equals(A0q) && !"shopping_product_collection_links".equals(A0q) && !"shopping_product_links".equals(A0q) && !"shopping_multi_product_links".equals(A0q)) {
                            if (!"shopping_multi_product_max_products".equals(A0q)) {
                                c16l.A0z();
                            }
                        }
                    }
                    c16l.A1D();
                    c16l.A0z();
                }
                c16l.A0d();
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
