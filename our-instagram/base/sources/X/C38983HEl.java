package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: X.HEl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38983HEl extends AbstractC65632xz {
    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        if (anonymousClass306 != null) {
            anonymousClass306.A7a(0);
        }
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        C38416Gur c38416Gur;
        int A03 = C0f9.A03(-389241267);
        Object obj3 = null;
        if (view != null) {
            obj3 = view.getTag();
        }
        if ((obj3 instanceof C38416Gur) && (c38416Gur = (C38416Gur) obj3) != null) {
            c38416Gur.A00.A02();
        }
        C0f9.A0A(183163192, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        Context context;
        int A03 = C0f9.A03(-2101694311);
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(context), viewGroup, R.layout.product_collection_header_redesigned_shimmer);
        C14360o3.A0C(A0A, AbstractC43591JPw.A00(12));
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) A0A;
        shimmerFrameLayout.setTag(new C38416Gur(shimmerFrameLayout));
        C0f9.A0A(1382772811, A03);
        return shimmerFrameLayout;
    }
}
