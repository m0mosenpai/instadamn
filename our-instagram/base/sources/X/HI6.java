package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment;

/* loaded from: classes7.dex */
public final class HI6 extends AbstractC66412zI {
    public final C42824Ix0 A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C39091HIp c39091HIp = (C39091HIp) interfaceC66482zP;
        C38395GuW c38395GuW = (C38395GuW) c3oo;
        AbstractC167007dF.A1K(c39091HIp, c38395GuW);
        C42824Ix0 c42824Ix0 = this.A00;
        View A06 = AbstractC31171DnF.A06(c38395GuW);
        MerchantShoppingCartFragment merchantShoppingCartFragment = c42824Ix0.A00;
        if (!AbstractC83893oY.A00(merchantShoppingCartFragment.A0a)) {
            merchantShoppingCartFragment.A0G.A00(merchantShoppingCartFragment.A0a, false);
            C41208ILx c41208ILx = merchantShoppingCartFragment.A0G;
            AbstractC37304Gc5.A0u(A06, c41208ILx.A00, c41208ILx.A01, AnonymousClass001.A0R("seller_funded_discounts_banner:", c41208ILx.A02));
        }
        IgFundedIncentive igFundedIncentive = merchantShoppingCartFragment.A05;
        if (igFundedIncentive != null) {
            IHF ihf = merchantShoppingCartFragment.A0H;
            String str = igFundedIncentive.A07;
            C14360o3.A0B(str, 1);
            String A0p = AbstractC37301Gc2.A0p("instagram_shopping_merchant_bag", str);
            C63622uj c63622uj = ihf.A01;
            AbstractC31176DnK.A1V(ihf.A02, C59062n7.A00(AbstractC25228BEl.A13(str), null, A0p), c63622uj, A0p);
            IHF ihf2 = merchantShoppingCartFragment.A0H;
            String str2 = merchantShoppingCartFragment.A05.A07;
            C14360o3.A0B(str2, 2);
            ihf2.A00.A05(A06, ihf2.A01.A00(AbstractC37301Gc2.A0p("instagram_shopping_merchant_bag", str2)));
        }
        String str3 = c39091HIp.A00;
        if (str3 != null && str3.length() != 0) {
            TextView textView = c38395GuW.A00;
            String str4 = c39091HIp.A01;
            String A062 = AbstractC13670mt.A06("%s %s", str4, str3);
            int A02 = AbstractC31174DnI.A02(textView.getContext());
            AnonymousClass773.A07(new HE9(new C012804r(16, str4), C05F.A01, c42824Ix0, str3, A02, 0), textView, str3, A062);
            return;
        }
        c38395GuW.A00.setText(c39091HIp.A01);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C39091HIp.class;
    }

    public HI6(C42824Ix0 c42824Ix0) {
        this.A00 = c42824Ix0;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.3OO, X.GuW] */
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.status_text_layout, false);
        ?? c3oo = new C3OO(A0R);
        c3oo.A00 = AbstractC25230BEn.A0Q(A0R, R.id.status_text);
        return c3oo;
    }
}
