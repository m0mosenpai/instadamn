package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: X.HEu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38992HEu extends AbstractC65632xz {
    public final Context A00;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C38992HEu(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A0G = AbstractC25231BEo.A0G(view, -334485096);
        if (view.getTag() != null) {
            Object tag = view.getTag();
            C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.destination.productcollection.ProductCollectionHeaderShimmerBinderGroup.Holder");
            ((C38415Guq) tag).A00.A02();
        }
        C0f9.A0A(-1982567602, A0G);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 429283071);
        Context context = this.A00;
        View inflate = LayoutInflater.from(context).inflate(R.layout.shopping_loading_placeholder, viewGroup, false);
        C14360o3.A0C(inflate, AbstractC43591JPw.A00(12));
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate;
        LinearLayout linearLayout = (LinearLayout) AbstractC166997dE.A0R(shimmerFrameLayout, R.id.container);
        linearLayout.setOrientation(0);
        View inflate2 = LayoutInflater.from(context).inflate(R.layout.product_collection_header_shimmer, (ViewGroup) linearLayout, false);
        int A0A = AbstractC13880nE.A0A(context);
        C14360o3.A0A(inflate2);
        AbstractC13880nE.A0g(inflate2, A0A);
        AbstractC13880nE.A0W(inflate2, (int) (A0A * 0.75f));
        linearLayout.addView(inflate2);
        shimmerFrameLayout.setTag(new C38415Guq(shimmerFrameLayout));
        C0f9.A0A(-1998547308, A0G);
        return shimmerFrameLayout;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
