package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HIZ extends AbstractC66412zI {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final JPm A03;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        H79 h79 = (H79) interfaceC66482zP;
        C38498GwJ c38498GwJ = (C38498GwJ) c3oo;
        AbstractC167017dG.A1N(h79, c38498GwJ);
        I9D.A00(this.A00, this.A01, this.A02, this.A03, h79, c38498GwJ);
        InterfaceC16660sJ interfaceC16660sJ = h79.A01.A01;
        if (interfaceC16660sJ != null) {
            interfaceC16660sJ.invoke(AbstractC31171DnF.A06(c38498GwJ));
        }
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        View A07 = AbstractC31175DnJ.A07(LayoutInflater.from(AbstractC166997dE.A0L(viewGroup)), viewGroup, R.layout.product_feed_list_item_layout, false);
        return AbstractC37300Gc1.A03(AbstractC37303Gc4.A0Q(A07, new C38498GwJ(A07)), "null cannot be cast to non-null type com.instagram.shopping.widget.productcard.ProductFeedItemViewBinder.Holder");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return H79.class;
    }

    public HIZ(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, JPm jPm) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = jPm;
    }
}
