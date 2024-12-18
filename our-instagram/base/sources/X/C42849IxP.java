package X;

import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment;
import com.instagram.shopping.fragment.cart.ShoppingCartFragment;
import com.instagram.user.model.Product;
import com.instagram.user.model.UnavailableProductImpl;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.IxP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C42849IxP implements InterfaceC43442JHg {
    @Override // X.InterfaceC43442JHg
    public final void DVJ(String str) {
    }

    @Override // X.InterfaceC43442JHg
    public final void Dxo(List list) {
        if (this instanceof C39328HYt) {
            C18C.A0E(AbstractC166987dD.A1b(list));
            JGU jgu = (JGU) list.get(0);
            ShoppingCartFragment shoppingCartFragment = ((C39328HYt) this).A00;
            AbstractC41666Iby.A02(jgu.BSe(shoppingCartFragment.requireContext(), shoppingCartFragment.A02), 0, "shopping_cart_product_add_to_cart_failure");
        }
    }

    @Override // X.InterfaceC43442JHg
    public final void onSuccess(Object obj) {
        C41730Ie1 c41730Ie1;
        C41731Ie2 c41731Ie2;
        String str;
        String obj2;
        String str2;
        String str3;
        User user;
        String str4;
        if (this instanceof C39329HYu) {
            C39329HYu c39329HYu = (C39329HYu) this;
            AbstractC37300Gc1.A0G(c39329HYu.A00.getSession()).A0H(c39329HYu.A01, c39329HYu.A02);
            return;
        }
        if (this instanceof C39328HYt) {
            C39328HYt c39328HYt = (C39328HYt) this;
            c41730Ie1 = (C41730Ie1) obj;
            ShoppingCartFragment shoppingCartFragment = c39328HYt.A00;
            shoppingCartFragment.A04.getClass();
            MultiProductComponent multiProductComponent = shoppingCartFragment.A04;
            Product product = c39328HYt.A01;
            multiProductComponent.A03(product.A0H);
            User user2 = c39328HYt.A02.A0B;
            String A00 = AbstractC76433bn.A00(user2);
            AbstractC37300Gc1.A0G(shoppingCartFragment.A02).A0H(product, A00);
            if (shoppingCartFragment.isVisible()) {
                ShoppingCartFragment.A01(shoppingCartFragment);
                C41634IbP A05 = C70Y.A00(shoppingCartFragment.A02).A05(A00);
                if (A05 != null && !A05.A08) {
                    str4 = c41730Ie1.A05();
                } else {
                    str4 = null;
                }
                ShoppingCartFragment.A02(shoppingCartFragment, user2, str4, "index_view", false);
            }
            c41731Ie2 = shoppingCartFragment.A08;
            str = null;
            MultiProductComponent multiProductComponent2 = shoppingCartFragment.A04;
            multiProductComponent2.getClass();
            obj2 = multiProductComponent2.A04.toString();
            str2 = shoppingCartFragment.A0E;
            str3 = AbstractC37300Gc1.A0G(shoppingCartFragment.A02).A09(A00);
        } else {
            if (!(this instanceof C39327HYs)) {
                return;
            }
            c41730Ie1 = (C41730Ie1) obj;
            MerchantShoppingCartFragment merchantShoppingCartFragment = ((C39327HYs) this).A00.A00;
            c41731Ie2 = merchantShoppingCartFragment.A09;
            str = merchantShoppingCartFragment.A0N;
            MultiProductComponent multiProductComponent3 = merchantShoppingCartFragment.A06;
            multiProductComponent3.getClass();
            obj2 = multiProductComponent3.A04.toString();
            str2 = merchantShoppingCartFragment.A0Q;
            str3 = merchantShoppingCartFragment.A0T;
        }
        AbstractC167007dF.A1D(obj2, 1, c41730Ie1);
        Product A04 = c41730Ie1.A04();
        String str5 = null;
        if (A04 != null) {
            user = A04.A0B;
        } else {
            UnavailableProductImpl unavailableProductImpl = c41730Ie1.A02.A02;
            if (unavailableProductImpl != null) {
                user = unavailableProductImpl.A00;
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        if (user != null) {
            str5 = AbstractC76433bn.A00(user);
        }
        InterfaceC02590Ai A002 = C41730Ie1.A00(c41731Ie2.A03, c41730Ie1, "instagram_shopping_bag_add_item_success");
        AbstractC37301Gc2.A17(A002, str5);
        C41730Ie1.A02(A002, c41730Ie1);
        boolean z = true;
        if (c41730Ie1.A03() != 1) {
            z = false;
        }
        A002.A7v("is_initial_add", Boolean.valueOf(z));
        String str6 = c41731Ie2.A07;
        String str7 = "";
        if (str6 == null) {
            str6 = "";
        }
        AbstractC37300Gc1.A0n(A002, str6);
        if (str == null) {
            str = "";
        }
        AbstractC37300Gc1.A0s(A002, str);
        String str8 = c41731Ie2.A08;
        if (str8 != null) {
            str7 = str8;
        }
        AbstractC37300Gc1.A0t(A002, str7);
        A002.AAP("global_bag_entry_point", c41731Ie2.A00);
        A002.AAP("global_bag_prior_module", c41731Ie2.A04);
        A002.AAP("merchant_bag_entry_point", c41731Ie2.A05);
        A002.AAP("merchant_bag_prior_module", c41731Ie2.A06);
        A002.AAP("from", obj2);
        if (str2 != null) {
            A002.A9K("global_bag_id", AbstractC166997dE.A0j(str2));
        }
        AbstractC37303Gc4.A0m(A002, str3);
        A002.Cht();
    }
}
