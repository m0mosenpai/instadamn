package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.Bdj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25942Bdj extends C3OO {
    public final IgSimpleImageView A00;
    public final IgSimpleImageView A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final CircularImageView A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25942Bdj(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        IgSimpleImageView igSimpleImageView = (IgSimpleImageView) AbstractC166987dD.A0c(view, R.id.ig_live_post_live_fundraiser_cover_photo_thumbnail);
        this.A00 = igSimpleImageView;
        this.A01 = (IgSimpleImageView) AbstractC166987dD.A0c(view, R.id.ig_live_post_live_fundraiser_default_cover_photo);
        this.A05 = (CircularImageView) AbstractC166987dD.A0c(view, R.id.ig_live_post_live_fundraiser_default_cover_photo_border);
        this.A04 = (IgTextView) AbstractC166987dD.A0c(view, R.id.ig_live_post_live_fundraiser_fundraiser_title_text_view);
        this.A03 = (IgTextView) AbstractC166987dD.A0c(view, R.id.ig_live_post_live_fundraiser_subtitle_text_view);
        this.A02 = (IgTextView) AbstractC166987dD.A0c(view, R.id.ig_live_post_live_fundraiser_attribution_text_view);
        Context A0L = AbstractC166997dE.A0L(view);
        Resources resources = view.getResources();
        igSimpleImageView.setImageDrawable(new BOM(A0L, null, resources.getDimensionPixelSize(R.dimen.action_button_settings_height), resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material), 0, 0, 0, -1, false));
    }
}
