package X;

import android.view.View;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* loaded from: classes11.dex */
public final class VgD {
    public RoundedCornerFrameLayout A00;
    public final ShimmerFrameLayout A01;

    public VgD(View view) {
        this.A00 = (RoundedCornerFrameLayout) AbstractC166997dE.A0R(view, R.id.preview_container);
        this.A01 = (ShimmerFrameLayout) AbstractC166997dE.A0R(view, R.id.card_shimmer_container);
    }
}
