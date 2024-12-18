package X;

import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.follow.chaining.FollowChainingButton;
import com.instagram.hashtag.ui.HashtagFollowButton;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.reels.ui.badge.ReelBrandingBadgeView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.WmF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70998WmF implements C3Ow {
    public String A00;
    public final ColorDrawable A01;
    public final View A02;
    public final View A03;
    public final FrameLayout A04;
    public final TextView A05;
    public final CircularImageView A06;
    public final C57012jc A07;
    public final C57012jc A08;
    public final FollowChainingButton A09;
    public final HashtagFollowButton A0A;
    public final ReelBrandingBadgeView A0B;
    public final GradientSpinner A0C;
    public final TextView A0D;
    public final C57012jc A0E;

    @Override // X.C3Ow
    public final boolean Ejh() {
        return true;
    }

    @Override // X.C3Ow
    /* renamed from: AeS */
    public final RectF Ahl() {
        return AbstractC13880nE.A0G(this.A06);
    }

    @Override // X.C3Ow
    public final View Aek() {
        return this.A06;
    }

    @Override // X.InterfaceC72963Ox
    public final /* synthetic */ RectF Ahl() {
        return AbstractC13880nE.A0G(this.A06);
    }

    @Override // X.C3Ow
    public final GradientSpinner Blo() {
        return this.A0C;
    }

    @Override // X.C3Ow
    public final void CMM() {
        this.A06.setVisibility(4);
    }

    @Override // X.C3Ow
    public final void EkR(InterfaceC11380iw interfaceC11380iw) {
        this.A06.setVisibility(0);
    }

    public C70998WmF(View view) {
        View requireViewById = view.requireViewById(R.id.hashtag_feed_header_container);
        this.A02 = requireViewById;
        this.A03 = view.requireViewById(R.id.reel);
        this.A0C = (GradientSpinner) view.requireViewById(R.id.reel_ring);
        CircularImageView circularImageView = (CircularImageView) view.requireViewById(R.id.profile_image);
        this.A06 = circularImageView;
        circularImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.A0B = (ReelBrandingBadgeView) view.requireViewById(R.id.branding_badge);
        this.A05 = (TextView) view.requireViewById(R.id.hashtag_media_count);
        this.A0A = (HashtagFollowButton) view.requireViewById(R.id.follow_button);
        this.A0D = (TextView) view.requireViewById(R.id.hashtag_header_subtitle);
        this.A09 = (FollowChainingButton) view.requireViewById(R.id.follow_chaining_button);
        this.A04 = (FrameLayout) view.requireViewById(R.id.follow_chaining_container);
        ColorDrawable colorDrawable = new ColorDrawable(AbstractC167007dF.A09(requireViewById.getContext(), R.attr.backgroundColorSecondary));
        this.A01 = colorDrawable;
        circularImageView.setPlaceHolderColor(colorDrawable);
        this.A07 = AbstractC31177DnL.A0U(view, R.id.hashtag_page_banner_stub);
        this.A0E = AbstractC31177DnL.A0U(view, R.id.hashtag_support_button);
        this.A08 = AbstractC31177DnL.A0U(view, R.id.hashtag_recency_filter);
        this.A00 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
    }
}
