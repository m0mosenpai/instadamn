package X;

import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment;
import com.instagram.user.model.Product;

/* loaded from: classes7.dex */
public final class J5S implements Runnable {
    public final /* synthetic */ C42824Ix0 A00;
    public final /* synthetic */ Product A01;
    public final /* synthetic */ Product A02;

    public J5S(C42824Ix0 c42824Ix0, Product product, Product product2) {
        this.A00 = c42824Ix0;
        this.A01 = product;
        this.A02 = product2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C42824Ix0 c42824Ix0 = this.A00;
        Product product = this.A01;
        Product product2 = this.A02;
        MerchantShoppingCartFragment merchantShoppingCartFragment = c42824Ix0.A00;
        merchantShoppingCartFragment.A06.getClass();
        C1563470e A0O = AbstractC37301Gc2.A0O(merchantShoppingCartFragment);
        A0O.A0C(new C39327HYs(c42824Ix0), product2, merchantShoppingCartFragment.A0U);
        A0O.A0H(product, merchantShoppingCartFragment.A0U);
        MultiProductComponent multiProductComponent = merchantShoppingCartFragment.A06;
        String str = product.A0H;
        multiProductComponent.A03(str);
        IH1 ih1 = merchantShoppingCartFragment.A0D;
        if (ih1 != null) {
            C14360o3.A0B(str, 0);
            ih1.A00.put(str, new C41031IFa(false, false));
        }
        C41745IeJ c41745IeJ = merchantShoppingCartFragment.A07;
        EnumC39539HdB enumC39539HdB = merchantShoppingCartFragment.A0A;
        C41745IeJ.A03(c41745IeJ, merchantShoppingCartFragment, merchantShoppingCartFragment.A0D, merchantShoppingCartFragment.A0E, enumC39539HdB);
    }
}
