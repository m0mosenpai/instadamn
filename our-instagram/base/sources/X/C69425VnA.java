package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.reels.ui.badge.ReelBrandingBadgeView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.VnA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69425VnA {
    public final ViewGroup A00;
    public final ViewGroup A01;
    public final TextView A02;
    public final CircularImageView A03;
    public final IgImageView A04;
    public final C57012jc A05;
    public final C57012jc A06;
    public final ReelBrandingBadgeView A07;
    public final GradientSpinnerAvatarView A08;

    public C69425VnA(ViewGroup viewGroup) {
        this.A00 = viewGroup;
        this.A04 = (IgImageView) viewGroup.requireViewById(R.id.image_view);
        this.A08 = (GradientSpinnerAvatarView) viewGroup.requireViewById(R.id.avatar_image);
        this.A07 = (ReelBrandingBadgeView) viewGroup.requireViewById(R.id.reel_branding_badge);
        this.A03 = (CircularImageView) viewGroup.requireViewById(R.id.circular_image_drawable);
        this.A01 = (ViewGroup) viewGroup.requireViewById(R.id.title_container);
        this.A02 = AbstractC31180DnO.A06(viewGroup);
        this.A06 = AbstractC31177DnL.A0U(viewGroup, R.id.separate_subtitles_container);
        this.A05 = AbstractC31177DnL.A0U(viewGroup, R.id.joint_subtitles_container);
    }
}
