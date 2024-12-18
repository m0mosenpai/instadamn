package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.reels.ui.badge.ReelBrandingBadgeView;
import com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView;
import com.instagram.reels.viewer.common.ReelViewGroup;
import com.instagram.ui.mediaactions.LikeActionView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;
import com.instagram.ui.widget.textureview.ScalingTextureView;
import com.instagram.xme.threed.view.IgGltfSceneLayoutView;

/* renamed from: X.6du, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C143556du extends AbstractC143566dv implements InterfaceC143606dz, InterfaceC143616e0, C6e1, InterfaceC143626e2, InterfaceC143636e3, InterfaceC143646e4 {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public ImageView A05;
    public C44736JrJ A06;
    public C25944Bdl A07;
    public C41181vS A08;
    public C41551w4 A09;
    public C3G2 A0A;
    public InterfaceC81993lL A0B;
    public C141596ac A0C;
    public ReelBrandingBadgeView A0D;
    public InterfaceC144586fe A0E;
    public C144576fd A0F;
    public C54607OAi A0G;
    public C144566fc A0H;
    public InterfaceC144936gD A0I;
    public boolean A0J;
    public boolean A0K;
    public final int A0L;
    public final Rect A0M;
    public final View A0N;
    public final View A0O;
    public final View A0P;
    public final View A0Q;
    public final View A0R;
    public final View A0S;
    public final View A0T;
    public final View A0U;
    public final ViewStub A0V;
    public final ViewStub A0W;
    public final ViewStub A0X;
    public final ViewStub A0Y;
    public final ViewStub A0Z;
    public final ViewStub A0a;
    public final ViewStub A0b;
    public final TextView A0c;
    public final TextView A0d;
    public final UserSession A0e;
    public final C86013sY A0f;
    public final IgImageView A0g;
    public final C57012jc A0h;
    public final C57012jc A0i;
    public final C57012jc A0j;
    public final C57012jc A0k;
    public final C57012jc A0l;
    public final C57012jc A0m;
    public final C57012jc A0n;
    public final C57012jc A0o;
    public final C57012jc A0p;
    public final C57012jc A0q;
    public final InterfaceC56392iX A0r;
    public final InterfaceC56392iX A0s;
    public final InterfaceC56392iX A0t;
    public final InterfaceC56392iX A0u;
    public final InterfaceC56392iX A0v;
    public final InterfaceC56392iX A0w;
    public final InterfaceC56392iX A0x;
    public final InterfaceC56392iX A0y;
    public final InterfaceC56392iX A0z;
    public final InterfaceC56392iX A10;
    public final InterfaceC56392iX A11;
    public final C86073se A12;
    public final C141916bA A13;
    public final ViewOnTouchListenerC97504Zk A14;
    public final C144206f2 A15;
    public final C141906b9 A16;
    public final C144466fS A17;
    public final C144296fB A18;
    public final C144176ez A19;
    public final C144496fV A1A;
    public final ViewOnClickListenerC144436fP A1B;
    public final ViewOnClickListenerC144436fP A1C;
    public final ViewOnClickListenerC144436fP A1D;
    public final ViewOnClickListenerC144436fP A1E;
    public final C144426fO A1F;
    public final C144426fO A1G;
    public final C144426fO A1H;
    public final C144476fT A1I;
    public final C144226f4 A1J;
    public final C144326fE A1K;
    public final C144316fD A1L;
    public final C144286fA A1M;
    public final C97564Zr A1N;
    public final C4Zp A1O;
    public final C144386fK A1P;
    public final C144396fL A1Q;
    public final C144376fJ A1R;
    public final C144406fM A1S;
    public final C97674a2 A1T;
    public final C97624Zx A1U;
    public final ReelAvatarWithBadgeView A1V;
    public final C144366fI A1W;
    public final C144456fR A1X;
    public final C144186f0 A1Y;
    public final C141926bB A1Z;
    public final C144346fG A1a;
    public final C144216f3 A1b;
    public final C144196f1 A1c;
    public final C144416fN A1d;
    public final C6e7 A1e;
    public final C143656e5 A1f;
    public final C144446fQ A1g;
    public final C144356fH A1h;
    public final C144336fF A1i;
    public final C6eI A1j;
    public final ReelViewGroup A1k;
    public final C144546fa A1l;
    public final C144516fX A1m;
    public final C144506fW A1n;
    public final C144526fY A1o;
    public final MediaFrameLayout A1p;
    public final RoundedCornerFrameLayout A1q;
    public final SegmentedProgressBar A1r;
    public final IgGltfSceneLayoutView A1s;
    public final Runnable A1t;
    public final InterfaceC09390do A1u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v156, types: [java.lang.Object, X.6b9] */
    /* JADX WARN: Type inference failed for: r0v159, types: [X.6bA, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v107, types: [java.lang.Object, X.6bB] */
    public C143556du(View view, UserSession userSession) {
        super(view);
        ViewStub viewStub;
        ViewStub viewStub2;
        C57012jc c57012jc;
        ViewStub viewStub3;
        ViewStub viewStub4;
        ViewStub viewStub5;
        ViewStub viewStub6;
        ViewStub viewStub7;
        ViewStub viewStub8;
        ViewStub viewStub9;
        ViewStub viewStub10;
        ViewStub viewStub11;
        ViewStub viewStub12;
        ViewStub viewStub13;
        ViewStub viewStub14;
        ViewStub viewStub15;
        ViewStub viewStub16;
        ViewStub viewStub17;
        ViewStub viewStub18;
        ViewStub viewStub19;
        ViewStub viewStub20;
        ViewStub viewStub21;
        ViewStub viewStub22;
        C14360o3.A0B(view, 1);
        this.A0S = view;
        this.A0e = userSession;
        this.A12 = AbstractC86053sc.A00((ViewStub) view.requireViewById(R.id.media_cover_view_stub));
        View requireViewById = view.requireViewById(R.id.media_url_share_interstitial_view_stub);
        C14360o3.A07(requireViewById);
        this.A1f = new C143656e5((ViewStub) requireViewById);
        View findViewById = view.findViewById(R.id.reel_viewer_loading_spinner_stub);
        if (findViewById instanceof ViewStub) {
            viewStub = (ViewStub) findViewById;
        } else {
            viewStub = null;
        }
        C57012jc c57012jc2 = new C57012jc(viewStub);
        this.A0n = c57012jc2;
        View findViewById2 = view.findViewById(R.id.reel_viewer_superlative_loading_spinner_stub);
        if (findViewById2 instanceof ViewStub) {
            viewStub2 = (ViewStub) findViewById2;
        } else {
            viewStub2 = null;
        }
        this.A0o = new C57012jc(viewStub2);
        this.A0f = new C86013sY((ViewStub) view.requireViewById(R.id.media_subtitle_view_stub), false);
        c57012jc2.A02 = C141896b7.A00;
        this.A11 = AbstractC56372iV.A01(view.requireViewById(R.id.video_loading_spinner_stub), !AbstractC25351Lp.A00(userSession).A01(), false);
        this.A0v = AbstractC56372iV.A01(view.requireViewById(R.id.header_menu_button_stub), !AbstractC25351Lp.A00(userSession).A01(), false);
        View inflate = ((ViewStub) view.requireViewById(R.id.story_item_top_progress_bar_stub)).inflate();
        C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar");
        this.A1r = (SegmentedProgressBar) inflate;
        View requireViewById2 = view.requireViewById(R.id.back_shadow_affordance);
        this.A0N = requireViewById2;
        Context context = view.getContext();
        requireViewById2.setBackgroundResource(AbstractC13620mo.A02(context) ? R.drawable.reel_viewer_shadow_right : R.drawable.reel_viewer_shadow_left);
        View requireViewById3 = view.requireViewById(R.id.reel_item_toolbar_container);
        C14360o3.A07(requireViewById3);
        View requireViewById4 = view.requireViewById(R.id.reel_item_like_animation_stub);
        C14360o3.A07(requireViewById4);
        View requireViewById5 = view.requireViewById(R.id.like_heart);
        C14360o3.A07(requireViewById5);
        this.A1e = new C6e7((ViewStub) requireViewById4, (ConstraintLayout) requireViewById3, userSession, (LikeActionView) requireViewById5);
        this.A1q = (RoundedCornerFrameLayout) view.requireViewById(R.id.reel_viewer_media_layout);
        ReelViewGroup reelViewGroup = (ReelViewGroup) view.requireViewById(R.id.reel_view_group);
        this.A1k = reelViewGroup;
        if (!C4R8.A00(userSession, "reel_viewer")) {
            View findViewById3 = view.findViewById(R.id.reel_viewer_texture_viewstub);
            if (findViewById3 instanceof ViewStub) {
                viewStub22 = (ViewStub) findViewById3;
            } else {
                viewStub22 = null;
            }
            c57012jc = new C57012jc(viewStub22);
        } else {
            c57012jc = null;
        }
        this.A0p = c57012jc;
        View findViewById4 = view.findViewById(R.id.recipient_view_mode_picker_stub);
        if (findViewById4 instanceof ViewStub) {
            viewStub3 = (ViewStub) findViewById4;
        } else {
            viewStub3 = null;
        }
        this.A0k = new C57012jc(viewStub3);
        View findViewById5 = view.findViewById(R.id.floating_send_stub);
        if (findViewById5 instanceof ViewStub) {
            viewStub4 = (ViewStub) findViewById5;
        } else {
            viewStub4 = null;
        }
        this.A0l = new C57012jc(viewStub4);
        View findViewById6 = view.findViewById(R.id.reel_item_color_picker_tools);
        if (findViewById6 instanceof ViewStub) {
            viewStub5 = (ViewStub) findViewById6;
        } else {
            viewStub5 = null;
        }
        this.A0m = new C57012jc(viewStub5);
        this.A0U = view.requireViewById(R.id.reel_viewer_top_shadow);
        View requireViewById6 = view.requireViewById(R.id.reel_viewer_bottom_shadow);
        this.A0O = requireViewById6;
        this.A0Q = view.requireViewById(R.id.reel_viewer_header_container);
        this.A0P = view.requireViewById(R.id.reel_viewer_header);
        this.A0R = view.requireViewById(R.id.profile_picture_container);
        ReelAvatarWithBadgeView reelAvatarWithBadgeView = (ReelAvatarWithBadgeView) view.requireViewById(R.id.reel_viewer_profile_picture);
        this.A1V = reelAvatarWithBadgeView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        reelAvatarWithBadgeView.setScaleType(scaleType);
        this.A0r = AbstractC56372iV.A01(view.requireViewById(R.id.reel_viewer_effect_icon_stub), !AbstractC25351Lp.A00(userSession).A01(), false);
        this.A0T = view.requireViewById(R.id.reel_viewer_text_container);
        this.A0d = (TextView) view.requireViewById(R.id.reel_viewer_title);
        this.A0c = (TextView) view.requireViewById(R.id.reel_viewer_timestamp);
        this.A10 = AbstractC56372iV.A01(view.requireViewById(R.id.reel_viewer_tall_android_top_bar_stub), false, false);
        this.A1j = new C6eI(view);
        this.A0u = AbstractC56372iV.A01(view.requireViewById(R.id.empty_reel_error_message_stub), !AbstractC25351Lp.A00(userSession).A01(), false);
        this.A1p = (MediaFrameLayout) view.requireViewById(R.id.reel_viewer_media_container);
        IgGltfSceneLayoutView igGltfSceneLayoutView = (IgGltfSceneLayoutView) view.requireViewById(R.id.gltf_scene_layout);
        this.A1s = igGltfSceneLayoutView;
        igGltfSceneLayoutView.setVisibility(8);
        BGy().getIgImageView().setScaleType(scaleType);
        BGy().setPlaceHolderColor(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_stories_loading_background)));
        IgProgressImageView BGy = BGy();
        Drawable drawable = context.getDrawable(R.drawable.video_determinate_progress);
        if (drawable != null) {
            BGy.setProgressBarDrawable(drawable);
            IgProgressImageView BGy2 = BGy();
            Drawable drawable2 = context.getDrawable(R.drawable.video_indeterminate_progress);
            if (drawable2 != null) {
                BGy2.setIndeterminateProgressBarDrawable(drawable2);
                IgImageView igImageView = (IgImageView) view.requireViewById(R.id.reel_viewer_image_view_transition);
                this.A0g = igImageView;
                igImageView.setVisibility(8);
                igImageView.setScaleType(scaleType);
                View findViewById7 = view.findViewById(R.id.reel_viewer_zero_rating_data_banner_stub);
                if (findViewById7 instanceof ViewStub) {
                    viewStub6 = (ViewStub) findViewById7;
                } else {
                    viewStub6 = null;
                }
                this.A0q = new C57012jc(viewStub6);
                this.A0Z = (ViewStub) view.requireViewById(R.id.reel_item_confetti_stub);
                this.A0Y = (ViewStub) view.requireViewById(R.id.close_friends_badge_stub);
                View findViewById8 = view.findViewById(R.id.opal_badge_stub);
                if (findViewById8 instanceof ViewStub) {
                    viewStub7 = (ViewStub) findViewById8;
                } else {
                    viewStub7 = null;
                }
                this.A0j = new C57012jc(viewStub7);
                this.A0s = AbstractC56372iV.A01(view.requireViewById(R.id.campfire_badge_stub), false, false);
                this.A0b = (ViewStub) view.requireViewById(R.id.reel_header_follow_button_stub);
                this.A0W = (ViewStub) view.requireViewById(R.id.reel_header_add_to_story_button_stub);
                View findViewById9 = view.findViewById(R.id.private_story_badge_stub);
                if (findViewById9 instanceof ViewStub) {
                    viewStub8 = (ViewStub) findViewById9;
                } else {
                    viewStub8 = null;
                }
                this.A0i = new C57012jc(viewStub8);
                View findViewById10 = view.findViewById(R.id.private_story_badge_rounded_stub);
                if (findViewById10 instanceof ViewStub) {
                    viewStub9 = (ViewStub) findViewById10;
                } else {
                    viewStub9 = null;
                }
                this.A0h = new C57012jc(viewStub9);
                this.A0a = (ViewStub) view.requireViewById(R.id.fan_club_badge_stub);
                this.A0X = (ViewStub) view.requireViewById(R.id.branding_badge_stub);
                this.A19 = new C144176ez(AbstractC56372iV.A01(view.requireViewById(R.id.reel_countdown_sticker_stub), false, false));
                View findViewById11 = view.findViewById(R.id.reel_fundraiser_sticker_stub);
                if (findViewById11 instanceof ViewStub) {
                    viewStub10 = (ViewStub) findViewById11;
                } else {
                    viewStub10 = null;
                }
                this.A1Y = new C144186f0(new C57012jc(viewStub10));
                View findViewById12 = view.findViewById(R.id.reel_smb_support_sticker_stub);
                if (findViewById12 instanceof ViewStub) {
                    viewStub11 = (ViewStub) findViewById12;
                } else {
                    viewStub11 = null;
                }
                this.A1c = new C144196f1(new C57012jc(viewStub11));
                View requireViewById7 = view.requireViewById(R.id.reel_avatar_accessibility_sticker_container);
                C14360o3.A07(requireViewById7);
                this.A15 = new C144206f2((FrameLayout) requireViewById7);
                this.A1O = new C4Zp((ViewStub) view.requireViewById(R.id.reel_poll_stub));
                this.A1N = new C97564Zr(AbstractC56372iV.A01(view.requireViewById(R.id.reel_poll_v2_stub), false, false));
                FrameLayout frameLayout = (FrameLayout) view.requireViewById(R.id.reel_bloks_container);
                ?? obj = new Object();
                obj.A00 = frameLayout;
                this.A16 = obj;
                View findViewById13 = view.findViewById(R.id.bloks_media_cover);
                if (findViewById13 instanceof ViewStub) {
                    viewStub12 = (ViewStub) findViewById13;
                } else {
                    viewStub12 = null;
                }
                C57012jc c57012jc3 = new C57012jc(viewStub12);
                ?? obj2 = new Object();
                obj2.A00 = c57012jc3;
                this.A13 = obj2;
                View findViewById14 = view.findViewById(R.id.reel_question_sticker_stub);
                if (findViewById14 instanceof ViewStub) {
                    viewStub13 = (ViewStub) findViewById14;
                } else {
                    viewStub13 = null;
                }
                this.A1b = new C144216f3(new C57012jc(viewStub13));
                this.A1T = new C97674a2(context, AbstractC56372iV.A01(view.requireViewById(R.id.reel_prompt_sticker_stub), false, false));
                InterfaceC56392iX A01 = AbstractC56372iV.A01(view.requireViewById(R.id.reel_instapal_sticker_stub), false, false);
                View requireViewById8 = view.requireViewById(R.id.toolbar_like_button);
                C14360o3.A07(requireViewById8);
                this.A1J = new C144226f4(context, requireViewById8, A01);
                this.A1M = new C144286fA(context, AbstractC56372iV.A01(view.requireViewById(R.id.reel_music_pick_sticker_stub), false, false));
                this.A18 = new C144296fB(AbstractC56372iV.A01(view.requireViewById(R.id.reel_chat_sticker_stub), false, false));
                View findViewById15 = view.findViewById(R.id.reel_message_share_button_stub);
                if (findViewById15 instanceof ViewStub) {
                    viewStub14 = (ViewStub) findViewById15;
                } else {
                    viewStub14 = null;
                }
                this.A1L = new C144316fD(new C57012jc(viewStub14));
                View findViewById16 = view.findViewById(R.id.reel_message_share_sticker_stub);
                if (findViewById16 instanceof ViewStub) {
                    viewStub15 = (ViewStub) findViewById16;
                } else {
                    viewStub15 = null;
                }
                this.A1K = new C144326fE(context, new C57012jc(viewStub15));
                View findViewById17 = view.findViewById(R.id.reel_reaction_sticker_stub);
                if (findViewById17 instanceof ViewStub) {
                    viewStub16 = (ViewStub) findViewById17;
                } else {
                    viewStub16 = null;
                }
                this.A1i = new C144336fF(context, new C57012jc(viewStub16));
                this.A1U = new C97624Zx(AbstractC56372iV.A01(view.requireViewById(R.id.reel_quiz_sticker_stub), false, false));
                this.A14 = new ViewOnTouchListenerC97504Zk(view);
                View requireViewById9 = view.requireViewById(R.id.reel_music_sticker_stub);
                C14360o3.A07(requireViewById9);
                this.A1a = new C144346fG((ViewStub) requireViewById9);
                View requireViewById10 = view.requireViewById(R.id.reel_music_vinyl_sticker_stub);
                C14360o3.A07(requireViewById10);
                this.A1h = new C144356fH((ViewStub) requireViewById10);
                this.A0w = AbstractC56372iV.A01(view.requireViewById(R.id.reel_retry_icon_stub), !AbstractC25351Lp.A00(userSession).A01(), false);
                this.A1W = new C144366fI(AbstractC56372iV.A01(view.requireViewById(R.id.reel_upcoming_event_card_sticker_stub), false, false));
                this.A1R = new C144376fJ(reelViewGroup, (ViewStub) view.requireViewById(R.id.reel_product_sticker_stub), userSession);
                View requireViewById11 = view.requireViewById(R.id.reel_multi_product_sticker_stub);
                C14360o3.A07(requireViewById11);
                this.A1P = new C144386fK((ViewStub) requireViewById11, reelViewGroup);
                View requireViewById12 = view.requireViewById(R.id.reel_product_collection_sticker_stub);
                C14360o3.A07(requireViewById12);
                this.A1Q = new C144396fL((ViewStub) requireViewById12, reelViewGroup);
                View requireViewById13 = view.requireViewById(R.id.reel_storefront_sticker_stub);
                C14360o3.A07(requireViewById13);
                this.A1S = new C144406fM((ViewStub) requireViewById13, reelViewGroup);
                this.A1d = new C144416fN(AbstractC56372iV.A01(view.requireViewById(R.id.reel_stories_teaser_overlay_stub), false, false));
                this.A1H = new C144426fO((ViewStub) view.requireViewById(R.id.reel_item_suggested_highlight_footer));
                this.A1D = new ViewOnClickListenerC144436fP((ViewStub) view.requireViewById(R.id.reel_viewer_suggested_highlight_end_card_stub));
                this.A1G = new C144426fO((ViewStub) view.requireViewById(R.id.reel_item_end_of_year_footer));
                this.A1C = new ViewOnClickListenerC144436fP((ViewStub) view.requireViewById(R.id.reel_viewer_end_of_year_end_card_stub));
                this.A1F = new C144426fO((ViewStub) view.requireViewById(R.id.reel_item_birthday_highlight_footer));
                this.A1B = new ViewOnClickListenerC144436fP((ViewStub) view.requireViewById(R.id.reel_viewer_birthday_highlight_end_card_stub));
                this.A1E = new ViewOnClickListenerC144436fP((ViewStub) view.requireViewById(R.id.reel_viewer_superlative_end_card_stub));
                View requireViewById14 = view.requireViewById(R.id.reel_viewer_rollcall_view_stub);
                C14360o3.A07(requireViewById14);
                this.A1g = new C144446fQ((ViewStub) requireViewById14);
                View requireViewById15 = view.requireViewById(R.id.reel_viewer_blurred_overlay_view_stub);
                C14360o3.A07(requireViewById15);
                this.A1X = new C144456fR((ViewStub) requireViewById15);
                this.A0z = AbstractC56372iV.A01(view.requireViewById(R.id.story_comments_preview), false, false);
                this.A0x = AbstractC56372iV.A01(view.requireViewById(R.id.story_comments_add_comment_text), false, false);
                this.A0y = AbstractC56372iV.A01(view.requireViewById(R.id.story_caption_legibility_background_stub), false, false);
                View requireViewById16 = view.requireViewById(R.id.reel_item_toolbar_container);
                C14360o3.A07(requireViewById16);
                View requireViewById17 = view.requireViewById(R.id.story_item_cta_container);
                C14360o3.A07(requireViewById17);
                View requireViewById18 = view.requireViewById(R.id.story_caption_legibility_background_stub);
                C14360o3.A07(requireViewById18);
                View requireViewById19 = view.requireViewById(R.id.story_caption_container_stub);
                C14360o3.A07(requireViewById19);
                this.A17 = new C144466fS(requireViewById6, (ViewGroup) requireViewById16, (ViewGroup) requireViewById17, (ViewStub) requireViewById18, (ViewStub) requireViewById19, userSession);
                this.A1I = new C144476fT(AbstractC56372iV.A01(view.requireViewById(R.id.reel_item_iconic_entrypoints_footer), false, false));
                if (C18U.A06(C06090Tz.A05, userSession, 36328091815001256L)) {
                    this.A1u = AbstractC09440dt.A01(new C9EH(this, 14));
                } else {
                    this.A1u = new C28111Xp(new C6XU(view));
                }
                View findViewById18 = view.findViewById(R.id.reel_group_mention_sticker_stub);
                if (findViewById18 instanceof ViewStub) {
                    viewStub17 = (ViewStub) findViewById18;
                } else {
                    viewStub17 = null;
                }
                this.A1A = new C144496fV(new C57012jc(viewStub17));
                View findViewById19 = view.findViewById(R.id.reel_polaroid_sticker_stub);
                if (findViewById19 instanceof ViewStub) {
                    viewStub18 = (ViewStub) findViewById19;
                } else {
                    viewStub18 = null;
                }
                this.A1n = new C144506fW(userSession, new C57012jc(viewStub18));
                View findViewById20 = view.findViewById(R.id.reel_polaroid_sticker_cta_stub);
                if (findViewById20 instanceof ViewStub) {
                    viewStub19 = (ViewStub) findViewById20;
                } else {
                    viewStub19 = null;
                }
                this.A1m = new C144516fX(new C57012jc(viewStub19));
                View findViewById21 = view.findViewById(R.id.reel_secret_sticker_stub);
                if (findViewById21 instanceof ViewStub) {
                    viewStub20 = (ViewStub) findViewById21;
                } else {
                    viewStub20 = null;
                }
                this.A1o = new C144526fY(new C57012jc(viewStub20));
                View findViewById22 = view.findViewById(R.id.reel_pics_please_sticker_stub);
                if (findViewById22 instanceof ViewStub) {
                    viewStub21 = (ViewStub) findViewById22;
                } else {
                    viewStub21 = null;
                }
                this.A1l = new C144546fa(new C57012jc(viewStub21));
                if (AbstractC25351Lp.A02(userSession)) {
                    View requireViewById20 = view.requireViewById(R.id.story_media_level_survey_invitation_stub);
                    C14360o3.A07(requireViewById20);
                    this.A0G = new C54607OAi((ViewStub) requireViewById20);
                }
                this.A0M = new Rect();
                final int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
                this.A1t = new Runnable() { // from class: X.6fb
                    @Override // java.lang.Runnable
                    public final void run() {
                        C143556du c143556du = C143556du.this;
                        View view2 = c143556du.A01;
                        if (view2 != null) {
                            int i = dimensionPixelSize;
                            Object parent = view2.getParent();
                            if (parent != null) {
                                View view3 = (View) parent;
                                Rect rect = c143556du.A0M;
                                view2.getHitRect(rect);
                                int height = i - rect.height();
                                if (height < 0) {
                                    height = 0;
                                }
                                int i2 = height / 2;
                                rect.top -= i2;
                                rect.bottom += i2;
                                view3.setTouchDelegate(new TouchDelegate(rect, view2));
                                return;
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                };
                View requireViewById21 = view.requireViewById(R.id.reel_identifier_overlay_stub);
                C14360o3.A07(requireViewById21);
                ViewStub viewStub23 = (ViewStub) requireViewById21;
                C14360o3.A0B(viewStub23, 1);
                ?? obj3 = new Object();
                obj3.A01 = new C57012jc(viewStub23);
                this.A1Z = obj3;
                this.A0L = (int) context.getResources().getDimension(R.dimen.abc_select_dialog_padding_start_material);
                this.A0V = (ViewStub) view.requireViewById(R.id.reel_viewer_aat_summary_stub);
                this.A0H = new C144566fc(AbstractC56372iV.A01(view.requireViewById(R.id.reel_viewer_story_snapshot_stub), false, false));
                this.A0F = new C144576fd(AbstractC56372iV.A01(view.requireViewById(R.id.reel_viewer_story_empty_state), false, false));
                this.A02 = view.requireViewById(R.id.delayed_skip_blocking_animation);
                this.A0t = AbstractC56372iV.A01(view.requireViewById(R.id.error_message_container_stub), false, false);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC143646e4
    public final void Dds(C141596ac c141596ac, int i) {
        C41551w4 c41551w4;
        String str;
        C14360o3.A0B(c141596ac, 0);
        if (i != 1) {
            if (i == 2) {
                C41181vS c41181vS = this.A08;
                if (c41181vS == null) {
                    C41551w4 c41551w42 = this.A09;
                    if (c41551w42 != null) {
                        c41181vS = c41551w42.A08(this.A0e);
                        C0w9.A03("STORIES_ORGANIC_ITEM_VIEWABILITY_CHANGED", AnonymousClass001.A0R("ReelItem was null, so used current item from viewModel ", c41181vS.A0e.name()));
                    } else {
                        C0w9.A03("STORIES_ORGANIC_ITEM_VIEWABILITY_CHANGED", "Both ReelItem and reelViewModel are null");
                        return;
                    }
                }
                InterfaceC144586fe interfaceC144586fe = this.A0E;
                if (interfaceC144586fe != null) {
                    C41551w4 c41551w43 = this.A09;
                    if (c41551w43 != null) {
                        interfaceC144586fe.E16(c41181vS, c41551w43, c141596ac.A18);
                        C97674a2 c97674a2 = this.A1T;
                        boolean z = c141596ac.A18;
                        UserSession userSession = this.A0e;
                        C14360o3.A0B(userSession, 1);
                        if (c97674a2.A0C && z && C18U.A06(C06090Tz.A05, userSession, 36324252114497560L)) {
                            PromptStickerModel promptStickerModel = c97674a2.A0B;
                            if (promptStickerModel == null) {
                                str = "model";
                            } else {
                                C8P8 c8p8 = c97674a2.A0A;
                                if (c8p8 == null) {
                                    str = "sticker";
                                } else {
                                    C97674a2.A01(userSession, c97674a2, c8p8, promptStickerModel);
                                }
                            }
                            C14360o3.A0F(str);
                            throw C00O.createAndThrow();
                        }
                        this.A1J.A05(userSession, c41181vS, c141596ac.A18, false);
                        C144476fT c144476fT = this.A1I;
                        if (c141596ac.A18 && !c144476fT.A00) {
                            ValueAnimator valueAnimator = c144476fT.A01;
                            if (!valueAnimator.isStarted() && !valueAnimator.isRunning()) {
                                valueAnimator.start();
                            }
                        }
                        C06090Tz c06090Tz = C06090Tz.A05;
                        if ((C18U.A06(c06090Tz, userSession, 36324861999591966L) || C18U.A06(c06090Tz, userSession, 36324861999723040L)) && (c41551w4 = this.A09) != null) {
                            int A03 = c41551w4.A03(userSession, c41181vS);
                            InterfaceC19610xo ARD = AbstractC23021Ah.A00(userSession).A01.ARD();
                            ARD.E7D("current_story_owner_story_index", A03);
                            ARD.apply();
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            return;
        }
        this.A1r.setProgress(c141596ac.A0B);
    }

    public final void A00() {
        ReelAvatarWithBadgeView reelAvatarWithBadgeView = this.A1V;
        reelAvatarWithBadgeView.A01.A09();
        InterfaceC56392iX interfaceC56392iX = reelAvatarWithBadgeView.A02;
        if (interfaceC56392iX.CWW()) {
            ((IgImageView) interfaceC56392iX.getView()).A09();
        }
        this.A0d.setText("");
        this.A0c.setText("");
        this.A08 = null;
        this.A0C = null;
        this.A09 = null;
        this.A0B = null;
        BGy().A04();
        this.A0g.A09();
        this.A1r.setProgress(0.0f);
        C6e7 c6e7 = this.A1e;
        c6e7.A1L.setText("");
        TextView textView = c6e7.A1K;
        textView.setText("");
        textView.setCompoundDrawablesRelative(null, null, null, null);
        c6e7.A1R.A03(8);
        c6e7.A17.setVisibility(8);
        c6e7.A1Q.A03(8);
        c6e7.A1b.setVisibility(8);
        c6e7.A1c.setVisibility(8);
        c6e7.A1e.setVisibility(8);
        c6e7.A1P.A03(8);
        c6e7.A1T.A03(8);
        ViewOnAttachStateChangeListenerC143666e9 viewOnAttachStateChangeListenerC143666e9 = c6e7.A1n;
        if (viewOnAttachStateChangeListenerC143666e9 != null) {
            viewOnAttachStateChangeListenerC143666e9.A01();
        }
    }

    @Override // X.C6e1
    public final XEX AjV() {
        return this.A1e.AjV();
    }

    @Override // X.InterfaceC143586dx
    public final IgProgressImageView BGy() {
        View requireViewById = this.A0S.requireViewById(R.id.reel_viewer_image_view);
        C14360o3.A07(requireViewById);
        return (IgProgressImageView) requireViewById;
    }

    @Override // X.InterfaceC143596dy
    public final C41181vS Blb() {
        return this.A08;
    }

    @Override // X.InterfaceC143586dx
    public final FrameLayout Blf() {
        return this.A1p;
    }

    @Override // X.InterfaceC143616e0
    public final View Blm() {
        C97564Zr c97564Zr = this.A1N;
        View view = null;
        if (c97564Zr.A09.CWW() && (view = c97564Zr.A00) == null) {
            C14360o3.A0F("stickerContainerView");
            throw C00O.createAndThrow();
        }
        return view;
    }

    @Override // X.InterfaceC143616e0
    public final ViewGroup Bln() {
        return this.A1O.A02;
    }

    @Override // X.InterfaceC143586dx
    public final ScalingTextureView C6w() {
        C57012jc c57012jc = this.A0p;
        if (c57012jc != null) {
            return (ScalingTextureView) c57012jc.A01();
        }
        return null;
    }

    @Override // X.InterfaceC143606dz
    public final void DQl(boolean z) {
        this.A1e.A1p.A01(this.A0e, this.A08, this.A09, z);
        C144226f4 c144226f4 = this.A1J;
        if (c144226f4.A0N.CGb() == 0) {
            c144226f4.A03 = 0L;
            c144226f4.A01 = 0;
            IgTextView igTextView = c144226f4.A08;
            String str = "scoreView";
            if (igTextView != null) {
                igTextView.setText(String.valueOf(0));
                IgTextView igTextView2 = c144226f4.A08;
                if (igTextView2 != null) {
                    igTextView2.setVisibility(0);
                    IgFrameLayout igFrameLayout = c144226f4.A04;
                    if (igFrameLayout == null) {
                        str = "coinContainerView";
                    } else {
                        igFrameLayout.setVisibility(0);
                        c144226f4.A0C = true;
                        return;
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC143606dz
    public final void DQm() {
        String str;
        this.A1e.A1p.A00();
        C144226f4 c144226f4 = this.A1J;
        if (c144226f4.A0N.CGb() == 0) {
            IgTextView igTextView = c144226f4.A08;
            if (igTextView == null) {
                str = "scoreView";
            } else {
                igTextView.setVisibility(8);
                IgFrameLayout igFrameLayout = c144226f4.A04;
                str = "coinContainerView";
                if (igFrameLayout != null) {
                    igFrameLayout.setVisibility(8);
                    IgFrameLayout igFrameLayout2 = c144226f4.A04;
                    if (igFrameLayout2 != null) {
                        igFrameLayout2.removeAllViews();
                        C5SW c5sw = c144226f4.A09;
                        if (c5sw != null) {
                            c5sw.A08(false);
                        }
                        c144226f4.A09 = null;
                        c144226f4.A0C = false;
                        return;
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC143636e3
    public final void Ddv() {
        C6e7 c6e7 = this.A1e;
        C141596ac c141596ac = c6e7.A0m;
        if (c141596ac != null) {
            c141596ac.A0j = false;
            AbstractC65725Tsz.A00(c6e7.AjV());
            c6e7.A1o.A00();
            C144576fd c144576fd = this.A0F;
            if (c144576fd != null) {
                C6SZ c6sz = c144576fd.A02;
                if (c6sz != null) {
                    ValueAnimator valueAnimator = c6sz.A03;
                    if (valueAnimator.isRunning()) {
                        valueAnimator.end();
                    }
                }
                C6SE c6se = c144576fd.A03;
                if (c6se != null) {
                    c6se.A00();
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC143626e2
    public final void ERN(float f) {
        C38321qM c38321qM;
        this.A0U.setAlpha(f);
        this.A0O.setAlpha(f);
        this.A1r.setAlpha(f);
        this.A0P.setAlpha(f);
        C6e7 c6e7 = this.A1e;
        c6e7.A00 = f;
        c6e7.A00();
        C25944Bdl c25944Bdl = this.A07;
        if (c25944Bdl != null) {
            c25944Bdl.A08.setAlpha(f);
            View view = c25944Bdl.A00;
            if (view != null) {
                view.setAlpha(f);
            }
        }
        C44736JrJ c44736JrJ = this.A06;
        if (c44736JrJ != null) {
            c44736JrJ.A04.setAlpha(f);
        }
        C144466fS c144466fS = this.A17;
        C41181vS c41181vS = this.A08;
        if (c41181vS != null && (c38321qM = c41181vS.A0b) != null && c38321qM.A0C.C22() != null) {
            c144466fS.A09.getView().setAlpha(f);
            c144466fS.A08.getView().setAlpha(f);
        }
    }
}
