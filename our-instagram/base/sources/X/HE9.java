package X;

import android.view.View;
import com.instagram.api.schemas.ProductDiscountInformationDictImpl;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveDetail;
import com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment;
import com.instagram.shopping.fragment.cart.ShoppingCartFragment;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class HE9 extends EPU {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HE9(C012804r c012804r, Integer num, Object obj, String str, int i, int i2) {
        super(c012804r, num, str, i);
        this.A00 = i2;
        this.A01 = obj;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.A00) {
            case 0:
                C42824Ix0 c42824Ix0 = (C42824Ix0) this.A01;
                MerchantShoppingCartFragment merchantShoppingCartFragment = c42824Ix0.A00;
                merchantShoppingCartFragment.A0E.A05.getClass();
                ArrayList A1F = AbstractC166987dD.A1F(merchantShoppingCartFragment.A0a);
                IgFundedIncentive igFundedIncentive = merchantShoppingCartFragment.A05;
                if (igFundedIncentive != null) {
                    merchantShoppingCartFragment.A09.A06(igFundedIncentive.A07, merchantShoppingCartFragment.A0U, merchantShoppingCartFragment.A0N, null);
                    IgFundedIncentive igFundedIncentive2 = merchantShoppingCartFragment.A05;
                    List list = igFundedIncentive2.A0B;
                    list.getClass();
                    A1F.add(0, new ProductDiscountInformationDictImpl(null, ((IgFundedIncentiveDetail) list.get(0)).getDescription(), igFundedIncentive2.A07, igFundedIncentive2.A0A, null));
                }
                if (!AbstractC83893oY.A00(merchantShoppingCartFragment.A0a)) {
                    merchantShoppingCartFragment.A09.A07(merchantShoppingCartFragment.A0U, merchantShoppingCartFragment.A0N, merchantShoppingCartFragment.A0a, false);
                }
                C42824Ix0.A03(c42824Ix0, A1F);
                return;
            case 1:
                ((C42824Ix0) this.A01).A04();
                return;
            case 2:
                ((C42315Iod) this.A01).A01.A01.invoke();
                return;
            case 3:
                C40962ICj c40962ICj = (C40962ICj) this.A01;
                if (c40962ICj == null) {
                    return;
                }
                ShoppingCartFragment shoppingCartFragment = c40962ICj.A00.A0A;
                shoppingCartFragment.A03.getClass();
                shoppingCartFragment.A08.A06(shoppingCartFragment.A03.A07, null, null, shoppingCartFragment.A0J);
                C1XJ.A00.A11(shoppingCartFragment.requireActivity(), shoppingCartFragment.A02, shoppingCartFragment.A03);
                return;
            default:
                super.onClick(view);
                return;
        }
    }
}
