package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.common.accessibility.AccessibleTextView;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;

/* loaded from: classes7.dex */
public final class IKU {
    public final View A00;
    public final ConstraintLayout A01;
    public final RecyclerView A02;
    public final ShimmerFrameLayout A03;
    public final AccessibleTextView A04;
    public final AccessibleTextView A05;
    public final ReboundViewPager A06;
    public final IgdsButton A07;
    public final IgBouncyUfiButtonImageView A08;
    public final CirclePageIndicator A09;

    public IKU(View view) {
        this.A00 = view;
        this.A06 = (ReboundViewPager) AbstractC166987dD.A0c(view, R.id.product_image_container);
        this.A09 = (CirclePageIndicator) AbstractC166987dD.A0c(view, R.id.carousel_page_indicator);
        this.A04 = (AccessibleTextView) AbstractC166987dD.A0c(view, R.id.product_name_label);
        this.A05 = (AccessibleTextView) AbstractC166987dD.A0c(view, R.id.product_price_label);
        this.A08 = (IgBouncyUfiButtonImageView) AbstractC166987dD.A0c(view, R.id.product_save_button);
        this.A02 = (RecyclerView) AbstractC166987dD.A0c(view, R.id.variants_recycler_view);
        this.A03 = (ShimmerFrameLayout) AbstractC166987dD.A0c(view, R.id.variants_shimmer_layout);
        this.A01 = (ConstraintLayout) AbstractC166987dD.A0c(view, R.id.loaded_content);
        this.A07 = (IgdsButton) AbstractC166987dD.A0c(view, R.id.view_on_site_button);
    }
}
