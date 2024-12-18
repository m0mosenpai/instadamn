package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import java.util.List;

/* renamed from: X.Gu2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38366Gu2 extends C2UU {
    public final JPo A00;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final List A02 = AbstractC166987dD.A1E();
    public final C38338GtY A01 = new C38338GtY();

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        if (r0.Bwk() != r9) goto L19;
     */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C3OO r19, int r20) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38366Gu2.onBindViewHolder(X.3OO, int):void");
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object A0Q;
        String str;
        C14360o3.A0B(viewGroup, 0);
        Context context = viewGroup.getContext();
        if (i != 0) {
            if (i == 1) {
                C14360o3.A0A(context);
                Integer num = C05F.A01;
                C14360o3.A0B(context, 0);
                C14360o3.A0B(num, 1);
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.block_comment_empty_state_padding_top);
                int A0E = AbstractC167017dG.A0E(context);
                View A0D = AbstractC25227BEk.A0D(LayoutInflater.from(context), viewGroup, R.layout.unavailable_product_tile, false);
                C14360o3.A0B(A0D, 1);
                C38487Gw8 c38487Gw8 = new C38487Gw8(A0D);
                AbstractC13880nE.A0g(A0D, dimensionPixelSize);
                c38487Gw8.A01.setTextSize(0, A0E);
                A0Q = AbstractC37303Gc4.A0Q(A0D, c38487Gw8);
                str = "null cannot be cast to non-null type com.instagram.shopping.widget.unavailableproducttile.UnavailableProductTileViewBinder.ViewHolder";
            } else {
                throw AbstractC31175DnJ.A0U("Unable to create view holder for product feed item with item type = ", i);
            }
        } else {
            Integer num2 = C05F.A01;
            View A0D2 = AbstractC25227BEk.A0D(LayoutInflater.from(context), viewGroup, R.layout.product_collection_product_card_layout, false);
            A0Q = AbstractC37303Gc4.A0Q(A0D2, new C38501GwM(A0D2, num2));
            str = "null cannot be cast to non-null type com.instagram.shopping.adapter.cart.productcollection.CartEnabledProductCardViewBinder.Holder";
        }
        return AbstractC37300Gc1.A03(A0Q, str);
    }

    public C38366Gu2(InterfaceC11380iw interfaceC11380iw, UserSession userSession, JPo jPo) {
        this.A04 = userSession;
        this.A03 = interfaceC11380iw;
        this.A00 = jPo;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-637992640);
        int size = this.A02.size();
        C0f9.A0A(-787218183, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        String str;
        int A03 = C0f9.A03(2003870284);
        int intValue = ((ProductFeedItem) this.A02.get(i)).A06.intValue();
        int i2 = 1;
        if (intValue != 2) {
            if (intValue != 1) {
                if (3 - intValue != 0) {
                    str = "MULTI_PRODUCT_COMPONENT";
                } else {
                    str = "MEDIA";
                }
                IllegalStateException A0V = AbstractC31175DnJ.A0V("Unable to create view type for product feed item with type = ", str);
                C0f9.A0A(38455864, A03);
                throw A0V;
            }
        } else {
            i2 = 0;
        }
        C0f9.A0A(1767981726, A03);
        return i2;
    }
}
