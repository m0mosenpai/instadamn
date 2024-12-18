package X;

import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf;

/* loaded from: classes7.dex */
public abstract class I9E {
    public static final boolean A00(ProductCheckoutPropertiesIntf productCheckoutPropertiesIntf, boolean z) {
        Boolean A0b = AbstractC166997dE.A0b();
        if (productCheckoutPropertiesIntf == null || !C14360o3.A0K(productCheckoutPropertiesIntf.AkE(), A0b)) {
            return false;
        }
        return z || C14360o3.A0K(productCheckoutPropertiesIntf.Bh1(), A0b);
    }
}
