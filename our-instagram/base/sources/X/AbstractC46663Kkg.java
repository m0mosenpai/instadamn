package X;

import com.instagram.user.model.Product;

/* renamed from: X.Kkg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46663Kkg {
    public static final String A00(Product product, boolean z) {
        Object[] objArr;
        String str;
        if (product == null) {
            AbstractC12120kG.A07("ShoppingEffectUtil", "Attempting to get title of null product", null);
            return "";
        }
        if (z) {
            objArr = new Object[]{product.A0J};
            str = "%s";
        } else {
            objArr = new Object[]{product.A0J, product.A0L};
            str = "%s · %s";
        }
        return AbstractC13670mt.A06(str, objArr);
    }
}
