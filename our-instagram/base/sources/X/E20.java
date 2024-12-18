package X;

import android.widget.LinearLayout;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;

/* loaded from: classes6.dex */
public final class E20 extends C3OO {
    public final LinearLayout A00;
    public final ShimmerFrameLayout A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E20(ShimmerFrameLayout shimmerFrameLayout) {
        super(shimmerFrameLayout);
        C14360o3.A0B(shimmerFrameLayout, 1);
        this.A01 = shimmerFrameLayout;
        this.A00 = (LinearLayout) AbstractC166997dE.A0R(shimmerFrameLayout, R.id.container);
    }
}
