package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;

/* loaded from: classes11.dex */
public final class V5A extends AbstractC66412zI {
    public static int A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C66436UHm c66436UHm = (C66436UHm) c3oo;
        ShimmerFrameLayout shimmerFrameLayout = c66436UHm.A01;
        if (!shimmerFrameLayout.A00) {
            shimmerFrameLayout.A06(true);
        }
        c66436UHm.A00.setVisibility(0);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C70787Wh0.class;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.3OO, X.UHm] */
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A0A = AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.layout_location_list_item_shimmer);
        ?? c3oo = new C3OO(A0A);
        c3oo.A01 = (ShimmerFrameLayout) A0A;
        c3oo.A00 = A0A.requireViewById(R.id.context_images);
        return c3oo;
    }
}
