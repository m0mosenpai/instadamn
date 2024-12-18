package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.TransitionCarouselImageView;

/* renamed from: X.GwB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38490GwB extends C3OO {
    public final View A00;
    public final View A01;
    public final ImageView A02;
    public final ImageView A03;
    public final TextView A04;
    public final TransitionCarouselImageView A05;

    public C38490GwB(View view) {
        super(view);
        this.A00 = view;
        this.A02 = (ImageView) AbstractC166987dD.A0c(view, R.id.icon);
        this.A03 = (ImageView) AbstractC166987dD.A0c(view, R.id.overlay_background);
        this.A04 = AbstractC25230BEn.A0Q(view, R.id.title_text);
        this.A05 = (TransitionCarouselImageView) AbstractC166987dD.A0c(view, R.id.background_image);
        this.A01 = AbstractC166987dD.A0c(view, R.id.overlay);
    }
}
