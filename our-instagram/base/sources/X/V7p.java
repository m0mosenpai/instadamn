package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.discovery.related.model.RelatedItem;

/* loaded from: classes11.dex */
public final class V7p extends UGU {
    public final InterfaceC11380iw A00;

    /* JADX WARN: Type inference failed for: r2v1, types: [X.3OO, X.UHn] */
    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View A0R = AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.related_item_visual_item_view, false);
        ?? c3oo = new C3OO(A0R);
        c3oo.A00 = A0R;
        c3oo.A04 = AbstractC37302Gc3.A0K(A0R, R.id.related_item_image);
        c3oo.A01 = AbstractC166987dD.A0c(c3oo.A00, R.id.related_item_image_placeholder);
        TextView A0N = AbstractC167007dF.A0N(c3oo.A00, R.id.related_item_name);
        c3oo.A03 = A0N;
        AbstractC37300Gc1.A0d(A0N, true);
        c3oo.A02 = (TextView) c3oo.A00.findViewById(R.id.related_item_media_count);
        return c3oo;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C66437UHn c66437UHn = (C66437UHn) c3oo;
        C14360o3.A0B(c66437UHn, 0);
        RelatedItem relatedItem = (RelatedItem) AbstractC001800i.A0O(this.A04, i);
        if (relatedItem != null) {
            View view = c66437UHn.A00;
            Resources resources = view.getResources();
            if (!AbstractC81033jX.A03(relatedItem.A01)) {
                c66437UHn.A01.setVisibility(8);
                IgImageView igImageView = c66437UHn.A04;
                igImageView.setVisibility(0);
                ImageUrl imageUrl = relatedItem.A01;
                if (imageUrl != null) {
                    igImageView.setUrl(imageUrl, this.A00);
                }
            } else {
                c66437UHn.A04.setVisibility(8);
                c66437UHn.A01.setVisibility(0);
            }
            c66437UHn.A03.setText(relatedItem.A01());
            TextView textView = c66437UHn.A02;
            int i2 = relatedItem.A00;
            Integer valueOf = Integer.valueOf(i2);
            C14360o3.A0A(resources);
            textView.setText(AbstractC31175DnJ.A0W(resources, C84963qk.A04(resources, valueOf, 10000, false, false), R.plurals.number_of_posts, i2));
            WNP.A00(view, 45, relatedItem, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V7p(InterfaceC11380iw interfaceC11380iw, C19260xA c19260xA, UserSession userSession, C69577Vrg c69577Vrg) {
        super(interfaceC11380iw, c19260xA, userSession, c69577Vrg);
        MSZ.A1O(c69577Vrg, c19260xA);
        this.A00 = interfaceC11380iw;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-901507609);
        int size = this.A04.size();
        C0f9.A0A(1258261453, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        C0f9.A0A(-1826725207, C0f9.A03(-1090238173));
        return 0;
    }
}
