package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import java.util.List;

/* loaded from: classes7.dex */
public final class HIX extends AbstractC66412zI {
    public final InterfaceC11380iw A00;
    public final C38383GuK A01;
    public final UserSession A02;
    public final JPo A03;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C42294IoI c42294IoI = (C42294IoI) interfaceC66482zP;
        C38398GuZ c38398GuZ = (C38398GuZ) c3oo;
        boolean A1a = AbstractC167017dG.A1a(c42294IoI, c38398GuZ);
        this.A01.A00(c38398GuZ.A00, "CartEnabledProductCollectionItemDefinition");
        UserSession userSession = this.A02;
        MultiProductComponent multiProductComponent = c42294IoI.A00;
        JPo jPo = this.A03;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        AbstractC25233BEq.A0x(A1a ? 1 : 0, userSession, jPo, interfaceC11380iw);
        Context A05 = AbstractC31172DnG.A05(c38398GuZ);
        C38457Gve c38457Gve = c38398GuZ.A01;
        String str = multiProductComponent.A07;
        if (str == null) {
            str = "";
        }
        IS7.A01(c38457Gve, new H7F(null, Integer.valueOf(AbstractC53242c7.A0H(A05, R.attr.backgroundColorSecondary)), null, AbstractC13670mt.A06("%s_%s_%s:", str, null, null), str, null, null));
        RecyclerView recyclerView = c38398GuZ.A00;
        C38366Gu2 c38366Gu2 = (C38366Gu2) recyclerView.A0A;
        if (c38366Gu2 == null) {
            c38366Gu2 = new C38366Gu2(interfaceC11380iw, userSession, jPo);
            recyclerView.setAdapter(c38366Gu2);
        }
        List A19 = AbstractC31172DnG.A19(multiProductComponent.A03.A03);
        List list = c38366Gu2.A02;
        list.clear();
        list.addAll(A19);
        C38338GtY c38338GtY = c38366Gu2.A01;
        List list2 = c38338GtY.A00;
        list2.clear();
        list2.addAll(list);
        AbstractC66552zX.A00(c38338GtY).A03(c38366Gu2);
        List list3 = c38338GtY.A01;
        list3.clear();
        list3.addAll(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            c38366Gu2.A00.AAp((ProductFeedItem) list.get(i), new C41024IEt(0, i));
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C42294IoI.class;
    }

    public HIX(InterfaceC11380iw interfaceC11380iw, C38383GuK c38383GuK, UserSession userSession, JPo jPo) {
        this.A02 = userSession;
        this.A03 = jPo;
        this.A00 = interfaceC11380iw;
        this.A01 = c38383GuK;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.3OO, X.GuZ, java.lang.Object] */
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.product_collection_section, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        layoutParams.height = -2;
        inflate.setLayoutParams(layoutParams);
        ?? c3oo = new C3OO(inflate);
        c3oo.A01 = new C38457Gve(AbstractC166987dD.A0c(inflate, R.id.section_header_container));
        c3oo.A00 = (RecyclerView) AbstractC166997dE.A0R(inflate, R.id.recycler_view);
        Context context = inflate.getContext();
        c3oo.A00.setLayoutManager(new LinearLayoutManager(context, 0, false));
        AbstractC37304Gc5.A0z(c3oo.A00, context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), AbstractC166997dE.A04(context, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
        inflate.setBackgroundResource(AbstractC53242c7.A0H(context, R.attr.backgroundColorSecondary));
        C70623Ez c70623Ez = new C70623Ez();
        ((C3F0) c70623Ez).A00 = false;
        c3oo.A00.setItemAnimator(c70623Ez);
        return AbstractC37300Gc1.A03(AbstractC37303Gc4.A0Q(inflate, c3oo), "null cannot be cast to non-null type com.instagram.shopping.adapter.cart.productcollection.CartEnabledProductCollectionViewBinder.Holder");
    }
}
