package X;

import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.shopping.fragment.moreproducts.ShoppingMoreProductsFragment;
import com.instagram.user.model.ProductWrapperIntf;

/* renamed from: X.IlN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42113IlN implements InterfaceC28041Xi {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C42113IlN(ShoppingMoreProductsFragment shoppingMoreProductsFragment, String str, int i) {
        this.A00 = i;
        this.A01 = shoppingMoreProductsFragment;
        this.A02 = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC28041Xi
    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        String id;
        switch (this.A00) {
            case 0:
                id = ((ProductFeedItem) obj).getId();
                return id.equals(this.A02);
            case 1:
                ProductWrapperIntf productWrapperIntf = (ProductWrapperIntf) obj;
                if (productWrapperIntf.Bgw() != null && productWrapperIntf.Bgw().getProductId() != null) {
                    id = productWrapperIntf.Bgw().getProductId();
                    return id.equals(this.A02);
                }
                return false;
            default:
                id = ((com.instagram.tagging.model.Tag) obj).getId();
                return id.equals(this.A02);
        }
    }
}
