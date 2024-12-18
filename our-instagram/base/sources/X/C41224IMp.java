package X;

import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.UnavailableProductImpl;

/* renamed from: X.IMp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41224IMp {
    public ProductTile A00;
    public ProductDetailsProductItemDict A01;
    public UnavailableProductImpl A02;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41224IMp)) {
            return false;
        }
        C41224IMp c41224IMp = (C41224IMp) obj;
        return AbstractC50102Ry.A00(this.A00, c41224IMp.A00) && AbstractC50102Ry.A00(this.A02, c41224IMp.A02);
    }

    public final int hashCode() {
        int i;
        ProductTile productTile = this.A00;
        int i2 = 0;
        if (productTile != null) {
            i = productTile.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        UnavailableProductImpl unavailableProductImpl = this.A02;
        if (unavailableProductImpl != null) {
            i2 = unavailableProductImpl.hashCode();
        }
        return i3 + i2;
    }
}
