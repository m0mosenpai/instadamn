package X;

import com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment;
import com.instagram.user.model.Product;

/* loaded from: classes7.dex */
public final class J16 implements InterfaceC43425JGp {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C42824Ix0 A01;
    public final /* synthetic */ C41730Ie1 A02;

    public J16(C42824Ix0 c42824Ix0, C41730Ie1 c41730Ie1, int i) {
        this.A01 = c42824Ix0;
        this.A02 = c41730Ie1;
        this.A00 = i;
    }

    @Override // X.InterfaceC43425JGp
    public final void Dyd(int i) {
        C41730Ie1 c41730Ie1;
        int i2;
        MerchantShoppingCartFragment merchantShoppingCartFragment = this.A01.A00;
        C1563470e A0O = AbstractC37301Gc2.A0O(merchantShoppingCartFragment);
        String str = merchantShoppingCartFragment.A0U;
        String A05 = this.A02.A05();
        int i3 = i + 1;
        boolean A1R = AbstractC167007dF.A1R(0, str, A05);
        INR A06 = A0O.A06(str);
        if (A06 != null && (c41730Ie1 = (C41730Ie1) A06.A01.get(A05)) != null) {
            int i4 = A0O.A00;
            if (i4 >= 0) {
                if ((i4 - c41730Ie1.A01) + i3 > A0O.A02) {
                    String BSe = ((JGU) AbstractC166987dD.A1J(new C42858IxY(A0O.A05)).get(0)).BSe(merchantShoppingCartFragment.requireContext(), merchantShoppingCartFragment.A02);
                    if (merchantShoppingCartFragment.A08.A00.getVisibility() == 0) {
                        i2 = merchantShoppingCartFragment.A00;
                    } else {
                        i2 = 0;
                    }
                    AbstractC41666Iby.A02(BSe, i2, "merchant_shopping_cart_update_quantity_user_failure");
                } else {
                    C41730Ie1 A01 = A06.A01(A05, i3);
                    if (A01 != null) {
                        A0O.A0A(str).add(new C41229IMu(EnumC39548HdK.A04, EnumC39537Hd9.A03, A01, null));
                        A0O.A07.D2c(A06, str);
                        AbstractC37301Gc2.A1T(str, A0O.A0C, A06.A00);
                        C1563470e.A02(A0O);
                        C41731Ie2 c41731Ie2 = merchantShoppingCartFragment.A09;
                        String str2 = merchantShoppingCartFragment.A0U;
                        String str3 = merchantShoppingCartFragment.A0N;
                        int i5 = this.A00;
                        String str4 = merchantShoppingCartFragment.A0Q;
                        String str5 = merchantShoppingCartFragment.A0T;
                        C14360o3.A0B(str2, 0);
                        C14360o3.A0B(str3, A1R ? 1 : 0);
                        InterfaceC02590Ai A00 = C41730Ie1.A00(c41731Ie2.A02, A01, "instagram_shopping_bag_update_quantity");
                        C41730Ie1.A02(A00, A01);
                        A00.AAP("old_quantity", String.valueOf(i5));
                        Product A04 = A01.A04();
                        boolean z = true;
                        if (A04 == null || A04.A0P != A1R) {
                            z = false;
                        }
                        AbstractC37303Gc4.A0s(A00, str2, z);
                        String str6 = c41731Ie2.A05;
                        if (str6 != null) {
                            A00.AAP("merchant_bag_entry_point", str6);
                            String str7 = c41731Ie2.A06;
                            if (str7 != null) {
                                C41731Ie2.A02(A00, c41731Ie2, C41731Ie2.A01(A00, c41731Ie2, "merchant_bag_prior_module", str7, str3), str4);
                                AbstractC37303Gc4.A0m(A00, str5);
                                A00.Cht();
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else {
                        throw AbstractC25227BEk.A0n();
                    }
                }
            } else {
                throw AbstractC31172DnG.A0u();
            }
        }
        merchantShoppingCartFragment.A0K = null;
    }
}
