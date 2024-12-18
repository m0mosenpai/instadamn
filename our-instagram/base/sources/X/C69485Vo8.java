package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.reels.ui.badge.ReelBrandingBadgeView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.Vo8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69485Vo8 {
    public Drawable A00;
    public View A01;
    public C38266GsB A02;
    public ReelBrandingBadgeView A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final ViewGroup A07;
    public final ViewGroup A08;
    public final ViewStub A09;
    public final ImageView A0A;
    public final TextView A0B;
    public final TextView A0C;
    public final C57012jc A0D;
    public final C57012jc A0E;
    public final C57012jc A0F;
    public final C57012jc A0G;
    public final C57012jc A0H;
    public final C57012jc A0I;
    public final GradientSpinnerAvatarView A0J;

    public C69485Vo8(ViewGroup viewGroup) {
        this.A08 = (ViewGroup) viewGroup.requireViewById(R.id.row_viewer_container);
        this.A0J = (GradientSpinnerAvatarView) viewGroup.requireViewById(R.id.row_viewer_imageview);
        this.A07 = (ViewGroup) viewGroup.requireViewById(R.id.row_viewer_image_container);
        this.A09 = (ViewStub) viewGroup.requireViewById(R.id.row_viewer_reel_ring);
        this.A0C = (TextView) viewGroup.requireViewById(R.id.row_title);
        this.A0B = (TextView) viewGroup.requireViewById(R.id.row_subtitle);
        this.A04 = viewGroup.requireViewById(R.id.hide_button);
        this.A05 = viewGroup.requireViewById(R.id.unhide_button);
        this.A0D = AbstractC31177DnL.A0U(viewGroup, R.id.blocked_button);
        this.A0A = (ImageView) viewGroup.requireViewById(R.id.row_slider);
        this.A0F = AbstractC31177DnL.A0U(viewGroup, R.id.row_reel_viewer_open_direct_reply_modal_button_stub);
        this.A0G = AbstractC31177DnL.A0U(viewGroup, R.id.row_reel_viewer_open_messenger_chat_button_stub);
        this.A0E = AbstractC31177DnL.A0U(viewGroup, R.id.row_reel_viewer_inline_icon_follow_button_stub);
        this.A0I = AbstractC31177DnL.A0U(viewGroup, R.id.row_reel_viewer_regular_follow_button_stub);
        this.A0H = AbstractC31177DnL.A0U(viewGroup, R.id.row_reel_viewer_overflow_button_stub);
        this.A06 = viewGroup.requireViewById(R.id.row_title_unread_dot);
    }
}
