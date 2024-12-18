package X;

import android.view.View;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;

/* renamed from: X.BdZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25932BdZ extends C3OO {
    public final ShimmerFrameLayout A00;
    public final RoundedCornerConstraintLayout A01;
    public final View A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25932BdZ(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A02 = view;
        this.A01 = (RoundedCornerConstraintLayout) AbstractC166997dE.A0R(view, R.id.clips_item_loadstate_placeholder_container);
        this.A00 = (ShimmerFrameLayout) AbstractC166997dE.A0R(view, R.id.clips_item_loadstate_placeholder_shimmer_view);
    }
}
