package X;

import androidx.paging.PagingDataAdapter;
import com.instagram.shopping.fragment.destination.productcollection.ProductCollectionFragment;
import com.instagram.shopping.fragment.destination.wishlist.WishListFeedFragment;

/* loaded from: classes7.dex */
public final class J1P implements InterfaceC71293Hq {
    public final int A00;
    public final Object A01;

    public J1P(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC71293Hq
    public final void DeM() {
        PagingDataAdapter pagingDataAdapter;
        String str;
        switch (this.A00) {
            case 0:
                pagingDataAdapter = (PagingDataAdapter) this.A01;
                break;
            case 1:
                ProductCollectionFragment productCollectionFragment = (ProductCollectionFragment) this.A01;
                String str2 = productCollectionFragment.A0I;
                if (str2 != null) {
                    C41755IeW c41755IeW = productCollectionFragment.A07;
                    C5GU c5gu = productCollectionFragment.A02;
                    String str3 = productCollectionFragment.A0F;
                    C14360o3.A0B(c5gu, 1);
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c41755IeW.A02, "instagram_shopping_product_collection_page_pull_to_refresh");
                    if (A0f.isSampled()) {
                        AbstractC37300Gc1.A0f(A0f, C41755IeW.A02(c41755IeW, null));
                        C41755IeW.A04(C41755IeW.A03(A0f, c5gu, c41755IeW, str2, str3), A0f, c41755IeW);
                    }
                }
                productCollectionFragment.A0C.A01(true, false);
                return;
            case 2:
                AbstractC52922bZ abstractC52922bZ = (AbstractC52922bZ) ((HCI) this.A01).A0Q.getValue();
                C43172J6r.A03(abstractC52922bZ, AbstractC141776au.A00(abstractC52922bZ), 16);
                return;
            case 3:
                WishListFeedFragment wishListFeedFragment = (WishListFeedFragment) this.A01;
                wishListFeedFragment.A07 = false;
                wishListFeedFragment.A04.A01(true, true);
                return;
            case 4:
                HCL hcl = (HCL) this.A01;
                PIC pic = hcl.A07;
                str = "networkHelper";
                if (pic != null) {
                    pic.A01();
                    PIC pic2 = hcl.A07;
                    if (pic2 != null) {
                        pic2.A06(true);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            default:
                pagingDataAdapter = ((C45507KCw) this.A01).A04;
                if (pagingDataAdapter == null) {
                    str = "adapter";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                break;
        }
        pagingDataAdapter.A04();
    }
}
