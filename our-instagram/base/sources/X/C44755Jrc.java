package X;

import android.animation.ValueAnimator;
import android.view.View;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: X.Jrc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44755Jrc extends C3OO {
    public final ShimmerFrameLayout A00;

    public final void A00() {
        ShimmerFrameLayout shimmerFrameLayout = this.A00;
        ValueAnimator valueAnimator = shimmerFrameLayout.A02.A01;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            shimmerFrameLayout.A02();
        }
        this.itemView.setVisibility(0);
    }

    public C44755Jrc(View view) {
        super(view);
        this.A00 = (ShimmerFrameLayout) view.requireViewById(R.id.loading_shimmer);
    }
}
