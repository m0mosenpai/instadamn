package X;

import android.view.View;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: X.Jre, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44757Jre extends C3OO {
    public C45073Jx2 A00;
    public final View A01;
    public final ShimmerFrameLayout A02;

    public void A00(boolean z) {
        ShimmerFrameLayout shimmerFrameLayout = this.A02;
        if (z) {
            shimmerFrameLayout.A06(true);
        } else {
            shimmerFrameLayout.A05();
        }
        this.A01.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
    }

    public AbstractC44757Jre(View view) {
        super(view);
        this.A02 = (ShimmerFrameLayout) AbstractC166997dE.A0R(view, R.id.loading_shimmer_view);
        this.A01 = AbstractC166997dE.A0S(view, R.id.shimmer_background_view);
        this.itemView.setTag(this);
    }
}
