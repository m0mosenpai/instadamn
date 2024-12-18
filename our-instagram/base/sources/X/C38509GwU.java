package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.touch.TouchOverlayView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.imageview.TransitionCarouselImageView;
import com.instagram.shopping.widget.clickabletext.ClickableTextContainer;
import com.instagram.ui.widget.thumbnailview.ThumbnailView;

/* renamed from: X.GwU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38509GwU extends C3OO {
    public final View A00;
    public final View A01;
    public final View A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final TouchOverlayView A06;
    public final IgImageView A07;
    public final TransitionCarouselImageView A08;
    public final ClickableTextContainer A09;
    public final ThumbnailView A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38509GwU(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A07 = AbstractC37302Gc3.A0K(view, R.id.single_image);
        this.A0A = (ThumbnailView) AbstractC166987dD.A0c(view, R.id.thumbnail);
        this.A08 = (TransitionCarouselImageView) AbstractC166987dD.A0c(view, R.id.slideshow);
        this.A06 = (TouchOverlayView) AbstractC166987dD.A0c(view, R.id.touch_overlay);
        this.A09 = (ClickableTextContainer) AbstractC166987dD.A0c(view, R.id.text_container);
        TextView A0Q = AbstractC25230BEn.A0Q(view, R.id.primary_text);
        this.A04 = A0Q;
        TextView A0Q2 = AbstractC25230BEn.A0Q(view, R.id.secondary_text);
        this.A05 = A0Q2;
        this.A03 = AbstractC25230BEn.A0Q(view, R.id.overlay_text);
        this.A02 = AbstractC166987dD.A0c(view, R.id.overlay_gradient);
        this.A00 = AbstractC166987dD.A0c(view, R.id.empty_state);
        this.A01 = AbstractC166987dD.A0c(view, R.id.media_container);
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.account_group_management_row_text_size);
        C13680mu.A03(A0Q, dimensionPixelSize);
        C13680mu.A03(A0Q2, dimensionPixelSize);
    }
}
