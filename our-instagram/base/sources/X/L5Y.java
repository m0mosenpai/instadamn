package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView;
import com.instagram.reels.viewer.attribution.CyclingFrameLayout;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;
import com.instagram.ui.widget.textureview.ScalingTextureView;

/* loaded from: classes8.dex */
public final class L5Y {
    public final Context A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final TextView A0A;
    public final TextView A0B;
    public final TextView A0C;
    public final TextView A0D;
    public final TextView A0E;
    public final UserSession A0F;
    public final C57012jc A0G;
    public final L7Z A0H;
    public final C47631L1q A0I;
    public final IgProgressImageView A0J;
    public final C105154oV A0K;
    public final C97564Zr A0L;
    public final C4Zp A0M;
    public final ReelAvatarWithBadgeView A0N;
    public final ReelAvatarWithBadgeView A0O;
    public final C144346fG A0P;
    public final CyclingFrameLayout A0Q;
    public final C143786eM A0R;
    public final C143786eM A0S;
    public final MediaFrameLayout A0T;
    public final SegmentedProgressBar A0U;
    public final ScalingTextureView A0V;

    public L5Y(Context context, View view, UserSession userSession) {
        int i;
        this.A00 = context;
        this.A0F = userSession;
        IgProgressImageView igProgressImageView = (IgProgressImageView) AbstractC166997dE.A0R(view, R.id.viewer_image_view);
        this.A0J = igProgressImageView;
        MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) AbstractC166997dE.A0R(view, R.id.direct_expiring_media_viewer_container);
        this.A0T = mediaFrameLayout;
        this.A03 = AbstractC166997dE.A0S(view, R.id.viewer_info_header);
        igProgressImageView.A05();
        this.A0N = (ReelAvatarWithBadgeView) AbstractC166997dE.A0R(view, R.id.user_profile_picture);
        this.A0O = (ReelAvatarWithBadgeView) AbstractC166997dE.A0R(view, R.id.visual_timeline_user_profile_picture);
        this.A0C = AbstractC167007dF.A0N(view, R.id.visual_timeline_main_text);
        this.A0D = AbstractC167007dF.A0N(view, R.id.visual_timeline_subtitle_text);
        this.A0B = AbstractC167007dF.A0N(view, R.id.visual_timeline_context_text);
        this.A0E = AbstractC167007dF.A0N(view, R.id.visual_timeline_time_passed);
        View A0S = AbstractC166997dE.A0S(view, R.id.back_shadow_affordance);
        this.A02 = A0S;
        A0S.setBackgroundResource(AbstractC13620mo.A02(view.getContext()) ? R.drawable.reel_viewer_shadow_right : R.drawable.reel_viewer_shadow_left);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.main_text);
        this.A08 = A0N;
        TextView A0N2 = AbstractC167007dF.A0N(view, R.id.context_text);
        this.A07 = A0N2;
        this.A0A = AbstractC167007dF.A0N(view, R.id.time_passed);
        this.A09 = AbstractC167007dF.A0N(view, R.id.subtitle_text);
        this.A0U = (SegmentedProgressBar) AbstractC166997dE.A0R(view, R.id.reel_viewer_progress_bar);
        this.A0V = (ScalingTextureView) AbstractC166997dE.A0R(view, R.id.viewer_texture_view);
        this.A04 = AbstractC166997dE.A0S(view, R.id.video_loading_spinner);
        this.A06 = AbstractC167007dF.A0N(view, R.id.error_message);
        ViewStub A0G = AbstractC31173DnH.A0G(view, R.id.direct_music_sticker_stub);
        C14360o3.A0B(A0G, 0);
        this.A0P = new C144346fG(A0G);
        this.A0M = new C4Zp(AbstractC31173DnH.A0G(view, R.id.direct_poll_stub));
        this.A0L = new C97564Zr(AbstractC56372iV.A01(view.requireViewById(R.id.direct_poll_v2_stub), false, false));
        this.A0G = AbstractC31177DnL.A0V(view, R.id.zero_rating_data_banner_stub);
        this.A0Q = (CyclingFrameLayout) AbstractC166997dE.A0R(view, R.id.reel_viewer_attribution_frame_layout);
        this.A0H = new L7Z(AbstractC167007dF.A0M(view, R.id.reel_app_attribution_subtitle_stub));
        View requireViewById = view.requireViewById(R.id.reel_music_attribution_subtitle_stub);
        C14360o3.A0C(requireViewById, AbstractC111324zv.A00(13));
        this.A0K = new C105154oV((ViewStub) requireViewById);
        this.A0R = new C143786eM(AbstractC167007dF.A0M(view, R.id.reel_effect_attribution_subtitle_stub));
        this.A0S = new C143786eM(AbstractC167007dF.A0M(view, R.id.reel_format_attribution_subtitle_stub));
        this.A0I = new C47631L1q(AbstractC167007dF.A0M(view, R.id.direct_story_reply_original_media_attribution_stub));
        this.A01 = view.requireViewById(R.id.direct_visual_message_viewer_action_button_container);
        this.A05 = AbstractC167007dF.A0N(view, R.id.direct_visual_message_viewer_action_button);
        A0N.setTypeface(null, 1);
        A0N2.setTypeface(null);
        igProgressImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        if (C26661Qv.A00(userSession).C98().A0C.contains(AbstractC111324zv.A00(2511))) {
            i = AbstractC43594JPz.A05(context);
        } else {
            i = 0;
        }
        DisplayMetrics A0K = AbstractC167007dF.A0K(context);
        float A00 = A0K.widthPixels / ((A0K.heightPixels - i) - (AbstractC13180m4.A02(context) ? C57992lC.A00() + C57992lC.A01() : 0));
        mediaFrameLayout.A00 = A00;
        ((MediaFrameLayout) AbstractC166997dE.A0R(mediaFrameLayout, R.id.viewer_media_view_container)).A00 = A00;
        ((MediaFrameLayout) AbstractC166997dE.A0R(mediaFrameLayout, R.id.viewer_media_view_container)).A00 = 0.5625f;
        AbstractC13880nE.A0q(mediaFrameLayout, new RunnableC24337Aqg(mediaFrameLayout));
    }
}
