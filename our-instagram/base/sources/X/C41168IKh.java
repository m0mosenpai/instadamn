package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerLinearLayout;

/* renamed from: X.IKh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41168IKh {
    public final View A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final RecyclerView A08;
    public final IgFrameLayout A09;
    public final IgSimpleImageView A0A;
    public final IgImageView A0B;
    public final IgImageView A0C;
    public final RoundedCornerLinearLayout A0D;

    public C41168IKh(View view) {
        this.A03 = view;
        this.A00 = AbstractC166987dD.A0c(view, R.id.upcoming_event_details_row);
        this.A01 = AbstractC166987dD.A0c(view, R.id.action_bar_shadow);
        this.A0D = (RoundedCornerLinearLayout) AbstractC166987dD.A0c(view, R.id.details_row_event_thumbnail_layout);
        this.A0C = AbstractC37302Gc3.A0K(view, R.id.details_row_event_thumbnail);
        this.A09 = (IgFrameLayout) AbstractC166987dD.A0c(view, R.id.details_row_event_type_layout);
        this.A0A = (IgSimpleImageView) AbstractC166987dD.A0c(view, R.id.details_row_event_type_icon);
        this.A07 = AbstractC25230BEn.A0Q(view, R.id.details_row_event_type_label);
        this.A06 = AbstractC25230BEn.A0Q(view, R.id.details_row_event_title_text);
        this.A05 = AbstractC25230BEn.A0Q(view, R.id.details_row_event_subtitle_text);
        this.A0B = AbstractC37302Gc3.A0K(view, R.id.details_row_event_chevron_icon);
        this.A02 = AbstractC166987dD.A0c(view, R.id.upcoming_event_featured_products_view);
        this.A08 = (RecyclerView) AbstractC166987dD.A0c(view, R.id.upcoming_event_product_feed_recycler_view);
        this.A04 = AbstractC25230BEn.A0Q(view, R.id.upcoming_event_not_found_text_view);
    }
}
