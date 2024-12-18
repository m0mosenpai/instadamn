package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.hashtag.ui.HashtagFollowButton;

/* renamed from: X.Vme, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69394Vme {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final CircularImageView A03;
    public final IgImageView A04;
    public final C57012jc A05;
    public final HashtagFollowButton A06;

    public C69394Vme(View view) {
        this.A00 = view;
        this.A03 = (CircularImageView) view.requireViewById(R.id.row_newsfeed_icon);
        this.A02 = (TextView) view.requireViewById(R.id.row_newsfeed_text);
        this.A01 = (ImageView) view.requireViewById(R.id.row_newsfeed_info_icon);
        this.A04 = (IgImageView) view.requireViewById(R.id.row_newsfeed_redirect_arrow);
        this.A05 = AbstractC31177DnL.A0U(view, R.id.row_newsfeed_media_image_stub);
        this.A06 = (HashtagFollowButton) AbstractC167017dG.A0U(view, R.id.row_newsfeed_hashtag_follow_button_small);
    }
}
