package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: X.HEm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38984HEm extends AbstractC65632xz {
    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(1790363174);
        AbstractC167017dG.A1P(view, obj);
        C41025IEu c41025IEu = (C41025IEu) obj;
        Object tag = view.getTag();
        if (tag != null) {
            C38470Gvr c38470Gvr = (C38470Gvr) tag;
            c38470Gvr.A01.setVisibility(AbstractC167007dF.A05(c41025IEu.A01 ? 1 : 0));
            int i2 = 0;
            c38470Gvr.A03.setVisibility(0);
            View view2 = c38470Gvr.A02;
            if (!c41025IEu.A00) {
                i2 = 8;
            }
            view2.setVisibility(i2);
            c38470Gvr.A00.setVisibility(0);
            ((ShimmerFrameLayout) view).A02();
            C0f9.A0A(1750878649, A03);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A0A(-986810651, A03);
        throw A0g;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-1611084256);
        C14360o3.A0B(viewGroup, 1);
        Context context = viewGroup.getContext();
        View inflate = LayoutInflater.from(context).inflate(R.layout.shopping_loading_placeholder, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) AbstractC166997dE.A0R(inflate, R.id.container);
        linearLayout.setOrientation(1);
        linearLayout.addView(LayoutInflater.from(context).inflate(R.layout.product_feed_metadata_loading_placeholder, (ViewGroup) linearLayout, false));
        inflate.setTag(new C38470Gvr(inflate));
        C0f9.A0A(534095151, A03);
        return inflate;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
