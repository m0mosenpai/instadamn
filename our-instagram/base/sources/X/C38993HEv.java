package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import java.util.Iterator;

/* renamed from: X.HEv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38993HEv extends AbstractC65632xz {
    public final Context A00;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 5;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C39097HIv c39097HIv = (C39097HIv) obj2;
        AbstractC167017dG.A1O(anonymousClass306, c39097HIv);
        Iterator it = c39097HIv.A00.iterator();
        while (it.hasNext()) {
            if (it.next() instanceof C33165EkC) {
                anonymousClass306.A7a(0);
            }
        }
    }

    public C38993HEv(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-2136955936);
        C14360o3.A0B(view, 1);
        C14360o3.A0B(obj2, 3);
        if (i != 0 && i != 1) {
            if (i == 3) {
                Object tag = view.getTag();
                C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.destination.shimmer.ContentTileShimmerViewBinder.Holder");
                C38419Guu c38419Guu = (C38419Guu) tag;
                C14360o3.A0B(c38419Guu, 0);
                c38419Guu.A00.A02();
            } else {
                IllegalStateException A14 = AbstractC166987dD.A14("Unsupported view type.");
                C0f9.A0A(-1093955046, A03);
                throw A14;
            }
        } else {
            Object tag2 = view.getTag();
            C14360o3.A0C(tag2, "null cannot be cast to non-null type com.instagram.shopping.adapter.destination.shimmer.ProductFeedShimmerViewBinder.Holder");
            IS9.A01((C38401Guc) tag2, ((C39097HIv) obj2).A00());
        }
        C0f9.A0A(-924555265, A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        LinearLayout linearLayout;
        int A03 = C0f9.A03(-1962744400);
        C14360o3.A0B(viewGroup, 1);
        if (i != 0) {
            if (i != 1) {
                if (i == 3) {
                    Context context = this.A00;
                    View inflate = AbstractC31172DnG.A09(context).inflate(R.layout.shopping_loading_placeholder, viewGroup, false);
                    C14360o3.A0C(inflate, AbstractC43591JPw.A00(12));
                    ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate;
                    int A0A = AbstractC13880nE.A0A(context) - (context.getResources().getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding) * 2);
                    shimmerFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                    View A0C = AbstractC31173DnH.A0C(LayoutInflater.from(context), shimmerFrameLayout, R.layout.content_tile_shimmer, false);
                    AbstractC13880nE.A0g(A0C, A0A);
                    AbstractC13880nE.A0W(A0C, (int) (A0A / 1.33f));
                    shimmerFrameLayout.addView(A0C);
                    shimmerFrameLayout.setTag(new C38419Guu(shimmerFrameLayout));
                    linearLayout = shimmerFrameLayout;
                } else {
                    IllegalStateException A14 = AbstractC166987dD.A14("Unsupported view type.");
                    C0f9.A0A(-1784517193, A03);
                    throw A14;
                }
            } else {
                linearLayout = IS9.A00(this.A00, viewGroup, 1);
            }
        } else {
            Context context2 = this.A00;
            linearLayout = IS9.A00(context2, viewGroup, AbstractC13880nE.A09(context2) / (AbstractC13880nE.A0A(context2) / 2));
        }
        AbstractC13880nE.A0U(linearLayout, AbstractC166997dE.A08(linearLayout.getResources()));
        C0f9.A0A(1781937645, A03);
        return linearLayout;
    }
}
