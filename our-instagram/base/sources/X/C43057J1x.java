package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.J1x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43057J1x implements InterfaceC43456JHu {
    public final View A00;
    public final TextView A01;
    public final IgSimpleImageView A02;
    public final IgSimpleImageView A03;
    public final IgView A04;
    public final CircularImageView A05;
    public final IgImageView A06;
    public final SimpleVideoLayout A07;
    public final FollowButton A08;

    @Override // X.InterfaceC43456JHu
    public final IgImageView BGm() {
        return this.A06;
    }

    @Override // X.InterfaceC43456JHu
    public final SimpleVideoLayout CF1() {
        return this.A07;
    }

    @Override // X.InterfaceC43456JHu
    public final void CMZ() {
        this.A06.setVisibility(8);
    }

    @Override // X.InterfaceC43456JHu
    public final void Ekw() {
        this.A06.setVisibility(0);
    }

    public C43057J1x(View view) {
        this.A00 = view;
        this.A05 = (CircularImageView) AbstractC166987dD.A0c(view, R.id.card_avatar);
        this.A01 = AbstractC25230BEn.A0Q(view, R.id.card_username);
        this.A03 = (IgSimpleImageView) AbstractC166987dD.A0c(view, R.id.verified_badge);
        this.A08 = (FollowButton) AbstractC166987dD.A0c(view, R.id.card_follow_button);
        this.A02 = (IgSimpleImageView) AbstractC166987dD.A0c(view, R.id.playback_indicator);
        this.A04 = (IgView) AbstractC166987dD.A0c(view, R.id.gradient_background);
        this.A06 = AbstractC37302Gc3.A0K(view, R.id.card_image);
        this.A07 = (SimpleVideoLayout) AbstractC166987dD.A0c(view, R.id.card_video);
    }
}
