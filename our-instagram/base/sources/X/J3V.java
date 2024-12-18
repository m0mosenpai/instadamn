package X;

import com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment;

/* loaded from: classes7.dex */
public final class J3V implements Runnable {
    public final /* synthetic */ MerchantShoppingCartFragment A00;

    public J3V(MerchantShoppingCartFragment merchantShoppingCartFragment) {
        this.A00 = merchantShoppingCartFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MerchantShoppingCartFragment merchantShoppingCartFragment = this.A00;
        merchantShoppingCartFragment.A0W = null;
        merchantShoppingCartFragment.A0L = null;
        C2UY.A01.A03();
        MerchantShoppingCartFragment.A01(merchantShoppingCartFragment);
    }
}
