package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.HYj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39318HYj extends AbstractC39063HHn {
    public final InterfaceC11380iw A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A0D = AbstractC25227BEk.A0D(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.featured_product_permission_pending, false);
        return AbstractC37300Gc1.A03(AbstractC37303Gc4.A0Q(A0D, new C38483Gw4(A0D)), "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.featuredproductpermission.FeaturedProductPermissionPendingViewBinder.Holder");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C42317Iof.class;
    }

    public C39318HYj(InterfaceC11380iw interfaceC11380iw, C41622IbC c41622IbC) {
        super(c41622IbC);
        this.A00 = interfaceC11380iw;
    }
}
