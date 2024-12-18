package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;

/* renamed from: X.UJj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66483UJj extends C3OO {
    public Integer A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final RecyclerView A05;
    public final IgFrameLayout A06;
    public final IgFrameLayout A07;
    public final IgFrameLayout A08;
    public final CircularImageView A09;
    public final CircularImageView A0A;
    public final IgImageView A0B;
    public final IgImageView A0C;
    public final IgImageView A0D;
    public final IgImageView A0E;
    public final RoundedCornerImageView A0F;
    public final GradientSpinner A0G;
    public final RoundedCornerConstraintLayout A0H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66483UJj(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A01 = view;
        this.A02 = AbstractC25230BEn.A0Q(view, R.id.hcm_header);
        this.A03 = AbstractC25230BEn.A0Q(view, R.id.hcm_subheader);
        this.A04 = AbstractC25230BEn.A0Q(view, R.id.hcm_subtext);
        this.A09 = (CircularImageView) AbstractC166987dD.A0c(view, R.id.hcm_circular_thumbnail);
        this.A0F = (RoundedCornerImageView) AbstractC166987dD.A0c(view, R.id.hcm_square_thumbnail);
        this.A00 = C05F.A00;
        this.A07 = (IgFrameLayout) AbstractC166987dD.A0c(view, R.id.hcm_frame_layout);
        this.A0H = (RoundedCornerConstraintLayout) AbstractC166987dD.A0c(view, R.id.hcm_content_container);
        this.A08 = (IgFrameLayout) AbstractC166987dD.A0c(view, R.id.hcm_map_container);
        this.A05 = (RecyclerView) AbstractC166987dD.A0c(view, R.id.hcm_preview_clips_items);
        this.A0B = AbstractC37302Gc3.A0K(view, R.id.hcm_preview_first);
        this.A0D = AbstractC37302Gc3.A0K(view, R.id.hcm_preview_second);
        this.A0E = AbstractC37302Gc3.A0K(view, R.id.hcm_preview_third);
        this.A0C = AbstractC37302Gc3.A0K(view, R.id.hcm_preview_fourth);
        this.A06 = (IgFrameLayout) AbstractC166987dD.A0c(view, R.id.hcm_avatar_container);
        this.A0A = (CircularImageView) AbstractC166987dD.A0c(view, R.id.row_search_avatar_in_ring);
        this.A0G = (GradientSpinner) AbstractC166987dD.A0c(view, R.id.reel_seen_state);
    }

    public final IgImageView A00() {
        if (this.A00.intValue() != 0) {
            return this.A0F;
        }
        return this.A09;
    }
}
