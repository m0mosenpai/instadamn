package X;

import android.widget.TextView;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.follow.FollowButton;

/* loaded from: classes6.dex */
public final class FOP {
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;
    public final IgSimpleImageView A03;
    public final ColorFilterAlphaImageView A04;
    public final InterfaceC56392iX A05;
    public final IgdsButton A06;
    public final IgdsButton A07;
    public final IgdsButton A08;
    public final GradientSpinnerAvatarView A09;
    public final FollowButton A0A;

    public FOP(TextView textView, TextView textView2, TextView textView3, IgSimpleImageView igSimpleImageView, ColorFilterAlphaImageView colorFilterAlphaImageView, InterfaceC56392iX interfaceC56392iX, IgdsButton igdsButton, IgdsButton igdsButton2, IgdsButton igdsButton3, GradientSpinnerAvatarView gradientSpinnerAvatarView, FollowButton followButton) {
        C14360o3.A0B(gradientSpinnerAvatarView, 1);
        AbstractC25234BEr.A1R(textView, textView2, followButton, igdsButton, textView3);
        AbstractC25233BEq.A0y(7, colorFilterAlphaImageView, igdsButton2, igdsButton3);
        C14360o3.A0B(igSimpleImageView, 10);
        this.A09 = gradientSpinnerAvatarView;
        this.A00 = textView;
        this.A01 = textView2;
        this.A0A = followButton;
        this.A07 = igdsButton;
        this.A02 = textView3;
        this.A04 = colorFilterAlphaImageView;
        this.A06 = igdsButton2;
        this.A08 = igdsButton3;
        this.A03 = igSimpleImageView;
        this.A05 = interfaceC56392iX;
    }
}
