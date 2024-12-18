package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: X.V7g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68035V7g extends AbstractC66099Tza {
    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return V7l.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JQ0.A1M(viewGroup);
        ShimmerFrameLayout A02 = C84733qM.A00.A02(AbstractC166997dE.A0L(viewGroup), viewGroup);
        C14360o3.A0C(A02, "null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout");
        return new U1B(A02);
    }
}
