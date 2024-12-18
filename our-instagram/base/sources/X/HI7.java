package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment;

/* loaded from: classes7.dex */
public final class HI7 extends AbstractC66412zI {
    public final C42824Ix0 A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        String str;
        C39095HIt c39095HIt = (C39095HIt) interfaceC66482zP;
        C38402Gud c38402Gud = (C38402Gud) c3oo;
        boolean A1a = AbstractC167017dG.A1a(c39095HIt, c38402Gud);
        C42824Ix0 c42824Ix0 = this.A00;
        View A06 = AbstractC31171DnF.A06(c38402Gud);
        MerchantShoppingCartFragment merchantShoppingCartFragment = c42824Ix0.A00;
        if (!AbstractC83893oY.A00(merchantShoppingCartFragment.A0a)) {
            merchantShoppingCartFragment.A0G.A00(merchantShoppingCartFragment.A0a, A1a);
            C41208ILx c41208ILx = merchantShoppingCartFragment.A0G;
            AbstractC37304Gc5.A0u(A06, c41208ILx.A00, c41208ILx.A01, AnonymousClass001.A0R("seller_funded_discounts_banner:", c41208ILx.A02));
        }
        ViewOnClickListenerC42033Ik2.A00(c38402Gud.A00, 20, c42824Ix0);
        c38402Gud.A02.setText(c39095HIt.A02);
        String str2 = c39095HIt.A00;
        if (str2 != null && str2.length() != 0) {
            String str3 = c39095HIt.A01;
            if (str3 != null && str3.length() != 0) {
                str = AbstractC13670mt.A06("%s %s", str3, str2);
            } else {
                str = str2;
            }
            TextView textView = c38402Gud.A01;
            int A02 = AbstractC31174DnI.A02(textView.getContext());
            AnonymousClass773.A07(new HE9(new C012804r(16, str), C05F.A01, c42824Ix0, str2, A02, A1a ? 1 : 0), textView, str2, str);
            return;
        }
        c38402Gud.A01.setText(c39095HIt.A01);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C39095HIt.class;
    }

    public HI7(C42824Ix0 c42824Ix0) {
        this.A00 = c42824Ix0;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.3OO, X.Gud] */
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.merchant_cart_offer_banner, false);
        ?? c3oo = new C3OO(A0R);
        c3oo.A00 = (ViewGroup) A0R;
        c3oo.A03 = AbstractC167007dF.A0T(A0R, R.id.gift_card_icon);
        c3oo.A02 = AbstractC167007dF.A0N(A0R, R.id.offer_banner_title);
        c3oo.A01 = AbstractC167007dF.A0N(A0R, R.id.offer_banner_subtitle);
        return c3oo;
    }
}
