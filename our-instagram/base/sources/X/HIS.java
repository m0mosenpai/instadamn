package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.shopping.fragment.cart.ShoppingCartFragment;

/* loaded from: classes7.dex */
public final class HIS extends AbstractC66412zI {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final ShoppingCartFragment A02;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C42314Ioc c42314Ioc = (C42314Ioc) interfaceC66482zP;
        C38486Gw7 c38486Gw7 = (C38486Gw7) c3oo;
        AbstractC167007dF.A1K(c42314Ioc, c38486Gw7);
        Context A0L = AbstractC166997dE.A0L(c38486Gw7.A04);
        UserSession userSession = this.A01;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        ShoppingCartFragment shoppingCartFragment = this.A02;
        MultiProductComponent multiProductComponent = c42314Ioc.A00;
        AbstractC41667Ibz.A01(A0L, interfaceC11380iw, userSession, multiProductComponent, new IJ0(multiProductComponent, 0), shoppingCartFragment, c38486Gw7, C05F.A0C);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        return AbstractC37300Gc1.A03(AbstractC41667Ibz.A00(AbstractC166997dE.A0L(viewGroup), viewGroup, true).getTag(), AbstractC111324zv.A00(1144));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C42314Ioc.class;
    }

    public HIS(InterfaceC11380iw interfaceC11380iw, UserSession userSession, ShoppingCartFragment shoppingCartFragment) {
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A02 = shoppingCartFragment;
    }
}
