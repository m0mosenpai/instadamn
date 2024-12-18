package X;

import android.view.View;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.OEz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54722OEz {
    public final LinearLayout A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final CircularImageView A04;
    public final IgdsButton A05;
    public final IgdsButton A06;
    public final GradientSpinnerAvatarView A07;

    public C54722OEz(View view) {
        C14360o3.A0B(view, 1);
        this.A00 = (LinearLayout) view;
        this.A04 = AbstractC31176DnK.A0U(view, R.id.reels_row_icon);
        this.A07 = (GradientSpinnerAvatarView) AbstractC166997dE.A0R(view, R.id.reels_row_fb_profile_avatar);
        this.A03 = AbstractC25231BEo.A0d(view, R.id.reels_row_title);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.reels_row_subtitle);
        this.A06 = (IgdsButton) AbstractC166997dE.A0R(view, R.id.reels_row_share_button);
        this.A01 = AbstractC25231BEo.A0d(view, R.id.reels_row_shared_button);
        this.A05 = (IgdsButton) AbstractC166997dE.A0R(view, R.id.reels_row_chevron);
    }
}
