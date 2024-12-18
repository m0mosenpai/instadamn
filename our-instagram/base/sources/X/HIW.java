package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.text.SimpleDateFormat;
import java.util.Map;

/* loaded from: classes7.dex */
public final class HIW extends AbstractC66412zI {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final C42824Ix0 A02;
    public final Map A03;

    /* JADX WARN: Removed duplicated region for block: B:41:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x037e  */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r22, X.C3OO r23) {
        /*
            Method dump skipped, instructions count: 909
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HIW.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C42293IoH.class;
    }

    public HIW(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C42824Ix0 c42824Ix0, Map map) {
        this.A02 = c42824Ix0;
        this.A00 = interfaceC11380iw;
        this.A03 = map;
        this.A01 = userSession;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        SimpleDateFormat simpleDateFormat = C41740IeC.A01;
        View A0D = AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.shopping_cart_item, false);
        return AbstractC37300Gc1.A03(AbstractC37303Gc4.A0Q(A0D, new C38512GwX(A0D)), "null cannot be cast to non-null type com.instagram.shopping.adapter.cart.merchant.ShoppingCartItemViewBinder.Holder");
    }
}
