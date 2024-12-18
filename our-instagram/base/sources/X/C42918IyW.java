package X;

import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.shopping.fragment.destination.productcollection.ProductCollectionFragment;
import com.instagram.user.model.UnavailableProductImpl;

/* renamed from: X.IyW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42918IyW implements InterfaceC43420JGk {
    public final /* synthetic */ ProductCollectionFragment A00;

    public C42918IyW(ProductCollectionFragment productCollectionFragment) {
        this.A00 = productCollectionFragment;
    }

    @Override // X.InterfaceC43420JGk
    public final void DbU(ProductFeedItem productFeedItem) {
        ProductCollectionFragment productCollectionFragment = this.A00;
        HEZ hez = productCollectionFragment.A05;
        hez.A0I.A0E(AbstractC37301Gc2.A0j(productFeedItem));
        hez.A00();
        C25671My A00 = AbstractC25651Mw.A00(productCollectionFragment.A00);
        UnavailableProductImpl unavailableProductImpl = productFeedItem.A05;
        unavailableProductImpl.getClass();
        A00.E4s(new C42250Ina(unavailableProductImpl));
    }
}
