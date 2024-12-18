package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.shopping.fragment.cart.ShoppingCartFragment;

/* loaded from: classes7.dex */
public final class HIE extends AbstractC66412zI {
    public final C40962ICj A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        TextView textView;
        ShoppingCartFragment shoppingCartFragment;
        IgFundedIncentive igFundedIncentive;
        ShoppingCartFragment shoppingCartFragment2;
        IgFundedIncentive igFundedIncentive2;
        C39093HIr c39093HIr = (C39093HIr) interfaceC66482zP;
        C38427GvA c38427GvA = (C38427GvA) c3oo;
        AbstractC167017dG.A1N(c39093HIr, c38427GvA);
        C40962ICj c40962ICj = this.A00;
        if (c40962ICj != null) {
            C41169IKi c41169IKi = c40962ICj.A00;
            if (c41169IKi.A00 != null && (igFundedIncentive2 = (shoppingCartFragment2 = c41169IKi.A0A).A03) != null) {
                IHF ihf = shoppingCartFragment2.A0B;
                String str = igFundedIncentive2.A07;
                C14360o3.A0B(str, 1);
                String A0p = AbstractC37301Gc2.A0p("instagram_shopping_bag_index", str);
                AbstractC31176DnK.A1V(ihf.A02, C59062n7.A00(AbstractC25228BEl.A13(str), null, A0p), ihf.A01, A0p);
            }
            View A06 = AbstractC31171DnF.A06(c38427GvA);
            if (c41169IKi.A00 != null && (igFundedIncentive = (shoppingCartFragment = c41169IKi.A0A).A03) != null) {
                IHF ihf2 = shoppingCartFragment.A0B;
                String str2 = igFundedIncentive.A07;
                C14360o3.A0B(str2, 2);
                ihf2.A00.A05(A06, ihf2.A01.A00(AbstractC37301Gc2.A0p("instagram_shopping_bag_index", str2)));
            }
        }
        String str3 = c39093HIr.A00;
        if (str3 != null && str3.length() != 0 && (textView = c38427GvA.A00) != null) {
            AnonymousClass773.A07(new HE9(new C012804r(16, ""), C05F.A01, c40962ICj, str3, AbstractC31174DnI.A02(textView.getContext()), 3), textView, str3, AnonymousClass001.A0T(c39093HIr.A01, str3, ' '));
        } else {
            TextView textView2 = c38427GvA.A00;
            if (textView2 == null) {
                return;
            }
            textView2.setText(c39093HIr.A01);
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C39093HIr.class;
    }

    public HIE(C40962ICj c40962ICj) {
        this.A00 = c40962ICj;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        return new C38427GvA(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.status_text_layout, false));
    }
}
