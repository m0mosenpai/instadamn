package X;

import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.Product;
import com.instagram.user.model.UnavailableProductImpl;

/* renamed from: X.Ie1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41730Ie1 {
    public int A00 = -1;
    public int A01;
    public C41224IMp A02;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41730Ie1)) {
            return false;
        }
        C41730Ie1 c41730Ie1 = (C41730Ie1) obj;
        return this.A02.equals(c41730Ie1.A02) && this.A01 == c41730Ie1.A01 && this.A00 == c41730Ie1.A00;
    }

    public static InterfaceC02590Ai A00(C18920wW c18920wW, C41730Ie1 c41730Ie1, String str) {
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, str);
        String A05 = c41730Ie1.A05();
        C14360o3.A07(A05);
        A00.A9K("product_id", Long.valueOf(Long.parseLong(A05)));
        return A00;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.IMp, java.lang.Object] */
    public static C41730Ie1 A01(Product product, int i) {
        C41730Ie1 c41730Ie1 = new C41730Ie1();
        ?? obj = new Object();
        c41730Ie1.A02 = obj;
        obj.A00 = new ProductTile(product);
        c41730Ie1.A01 = i;
        return c41730Ie1;
    }

    public final Product A04() {
        ProductTile productTile = this.A02.A00;
        if (productTile != null) {
            return productTile.A07;
        }
        return null;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(Integer.valueOf(this.A00), AbstractC166997dE.A0J(Integer.valueOf(this.A01), AbstractC166987dD.A0G(this.A02)));
    }

    public static void A02(InterfaceC02590Ai interfaceC02590Ai, C41730Ie1 c41730Ie1) {
        interfaceC02590Ai.AAP("quantity", String.valueOf(c41730Ie1.A03()));
    }

    public final int A03() {
        ProductCheckoutProperties productCheckoutProperties;
        Integer num;
        Product A04 = A04();
        if (A04 != null && (productCheckoutProperties = A04.A01.A0C) != null && (num = productCheckoutProperties.A0C) != null && A04.A0P) {
            return Math.min(this.A01, num.intValue());
        }
        return this.A01;
    }

    public final String A05() {
        Product A04 = A04();
        if (A04 != null) {
            return A04.A0H;
        }
        UnavailableProductImpl unavailableProductImpl = this.A02.A02;
        if (unavailableProductImpl != null) {
            return unavailableProductImpl.A01;
        }
        throw AbstractC166987dD.A14("Shopping cart item is not associated with any product.");
    }
}
