package X;

import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.shopping.fragment.destination.wishlist.WishListFeedFragment;

/* renamed from: X.IyX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42919IyX implements InterfaceC43420JGk {
    public final /* synthetic */ WishListFeedFragment A00;

    public C42919IyX(WishListFeedFragment wishListFeedFragment) {
        this.A00 = wishListFeedFragment;
    }

    @Override // X.InterfaceC43420JGk
    public final void DbU(ProductFeedItem productFeedItem) {
        C38972HEa c38972HEa = this.A00.A01;
        c38972HEa.A06.A0E(AbstractC37301Gc2.A0j(productFeedItem));
        C38972HEa.A01(c38972HEa);
    }
}
