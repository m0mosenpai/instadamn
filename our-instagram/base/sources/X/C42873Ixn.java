package X;

import com.instagram.shopping.fragment.destination.productcollection.ProductCollectionFragment;
import com.instagram.user.model.User;

/* renamed from: X.Ixn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42873Ixn implements JGW {
    public final /* synthetic */ ProductCollectionFragment A00;

    public C42873Ixn(ProductCollectionFragment productCollectionFragment) {
        this.A00 = productCollectionFragment;
    }

    @Override // X.JGW
    public final void CuV(User user) {
        String A0U;
        ProductCollectionFragment productCollectionFragment = this.A00;
        if (AbstractC37300Gc1.A0U(user) == null) {
            A0U = "";
        } else {
            A0U = AbstractC37300Gc1.A0U(user);
        }
        ProductCollectionFragment.A00(productCollectionFragment, A0U, "shopping_product_collection_page", "shopping_product_collection_page");
    }
}
