package X;

import com.instagram.api.schemas.ShoppingBrandWithProducts;
import com.instagram.user.model.ProductDetailsProductItemDict;

/* loaded from: classes7.dex */
public final class H5A extends C0T6 implements InterfaceC43486JIy {
    public final InterfaceC43479JIr A00;
    public final ShoppingBrandWithProducts A01;
    public final ProductDetailsProductItemDict A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H5A) {
                H5A h5a = (H5A) obj;
                if (!C14360o3.A0K(this.A01, h5a.A01) || !C14360o3.A0K(this.A02, h5a.A02) || !C14360o3.A0K(this.A00, h5a.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public H5A(InterfaceC43479JIr interfaceC43479JIr, ShoppingBrandWithProducts shoppingBrandWithProducts, ProductDetailsProductItemDict productDetailsProductItemDict) {
        this.A01 = shoppingBrandWithProducts;
        this.A02 = productDetailsProductItemDict;
        this.A00 = interfaceC43479JIr;
    }
}
