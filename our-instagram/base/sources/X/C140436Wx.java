package X;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.reels.viewer.common.ReelViewGroup;
import com.instagram.showreel.composition.ui.IgShowreelCompositionView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;
import com.instagram.ui.widget.textureview.ScalingTextureView;

/* renamed from: X.6Wx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140436Wx extends AbstractC143566dv implements InterfaceC143606dz, InterfaceC143616e0, C6e1, InterfaceC141666aj, InterfaceC143626e2, InterfaceC143636e3, InterfaceC143646e4, InterfaceC141676ak {
    public C41181vS A00;
    public C41551w4 A01;
    public C3G2 A02;
    public InterfaceC81993lL A03;
    public C141596ac A04;
    public InterfaceC145416h0 A05;
    public C6TS A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final View A0D;
    public final View A0E;
    public final ImageView A0F;
    public final UserSession A0G;
    public final ColorFilterAlphaImageView A0H;
    public final C86013sY A0I;
    public final InterfaceC56392iX A0J;
    public final InterfaceC56392iX A0K;
    public final IgProgressImageView A0L;
    public final C144176ez A0M;
    public final C97564Zr A0N;
    public final C4Zp A0O;
    public final C144386fK A0P;
    public final C144376fJ A0Q;
    public final C144366fI A0R;
    public final ReelViewGroup A0S;
    public final C6UL A0T;
    public final C139636Ts A0U;
    public final C6UP A0V;
    public final C6UN A0W;
    public final C139606Tp A0X;
    public final C139566Tl A0Y;
    public final C139556Tk A0Z;
    public final C6U7 A0a;
    public final C6U5 A0b;
    public final C6U9 A0c;
    public final C6UD A0d;
    public final C139666Tv A0e;
    public final C6U1 A0f;
    public final C139686Tx A0g;
    public final C139706Tz A0h;
    public final C6U3 A0i;
    public final C6UG A0j;
    public final C6UI A0k;
    public final C139626Tr A0l;
    public final C139656Tu A0m;
    public final C139646Tt A0n;
    public final C143716eE A0o;
    public final MediaFrameLayout A0p;
    public final RoundedCornerFrameLayout A0q;
    public final View A0r;
    public final View A0s;
    public final InterfaceC56392iX A0t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C140436Wx(View view, UserSession userSession, ComponentCallbacks2C142736cZ componentCallbacks2C142736cZ) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A0E = view;
        this.A0G = userSession;
        View requireViewById = view.requireViewById(R.id.back_shadow_affordance);
        C14360o3.A07(requireViewById);
        this.A0D = requireViewById;
        this.A0I = new C86013sY((ViewStub) view.requireViewById(R.id.media_subtitle_view_stub), false);
        Context context = view.getContext();
        requireViewById.setBackgroundResource(AbstractC13620mo.A02(context) ? R.drawable.reel_viewer_shadow_right : R.drawable.reel_viewer_shadow_left);
        View requireViewById2 = view.requireViewById(R.id.sponsored_reel_item_toolbar_stub);
        C14360o3.A07(requireViewById2);
        ViewStub viewStub = (ViewStub) requireViewById2;
        viewStub.setLayoutResource(R.layout.layout_sponsored_reel_item_toolbar);
        viewStub.inflate();
        View requireViewById3 = view.requireViewById(R.id.toolbar_container);
        C14360o3.A07(requireViewById3);
        this.A06 = new C6TS((LinearLayout) requireViewById3, userSession);
        RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) view.requireViewById(R.id.reel_viewer_media_layout);
        this.A0q = roundedCornerFrameLayout;
        roundedCornerFrameLayout.setCornerRadius(0);
        ReelViewGroup reelViewGroup = (ReelViewGroup) view.requireViewById(R.id.reel_main_container);
        this.A0S = reelViewGroup;
        this.A0t = AbstractC56372iV.A01(view.requireViewById(R.id.reel_viewer_texture_viewstub), false, false);
        View requireViewById4 = view.requireViewById(R.id.reel_viewer_top_shadow);
        this.A0s = requireViewById4;
        this.A0J = AbstractC56372iV.A01(view.requireViewById(R.id.reel_viewer_tall_android_top_bar_stub), false, false);
        View inflate = ((ViewStub) view.requireViewById(R.id.story_item_top_progress_bar_stub)).inflate();
        C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar");
        this.A0Z = new C139556Tk((SegmentedProgressBar) inflate);
        View requireViewById5 = view.requireViewById(R.id.reel_viewer_header);
        C14360o3.A07(requireViewById5);
        View requireViewById6 = view.requireViewById(R.id.reel_viewer_header_container);
        C14360o3.A07(requireViewById6);
        C139566Tl c139566Tl = new C139566Tl(requireViewById5, requireViewById6);
        this.A0Y = c139566Tl;
        MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) view.requireViewById(R.id.reel_viewer_media_container);
        this.A0p = mediaFrameLayout;
        IgProgressImageView igProgressImageView = (IgProgressImageView) view.requireViewById(R.id.reel_viewer_image_view);
        this.A0L = igProgressImageView;
        igProgressImageView.getIgImageView().setScaleType(ImageView.ScaleType.CENTER_CROP);
        igProgressImageView.setPlaceHolderColor(context.getColor(AbstractC53242c7.A0H(igProgressImageView.getContext(), R.attr.igds_color_stories_loading_background)));
        Drawable drawable = context.getDrawable(R.drawable.video_determinate_progress);
        if (drawable != null) {
            igProgressImageView.setProgressBarDrawable(drawable);
            this.A0F = (ImageView) view.requireViewById(R.id.reel_viewer_image_link_icon);
            this.A0K = AbstractC56372iV.A01(view.requireViewById(R.id.reel_viewer_zero_rating_data_banner_stub), false, false);
            ColorFilterAlphaImageView colorFilterAlphaImageView = (ColorFilterAlphaImageView) view.requireViewById(R.id.reel_retry_icon);
            this.A0H = colorFilterAlphaImageView;
            colorFilterAlphaImageView.setContentDescription(context.getString(2131971938));
            InterfaceC56392iX A01 = AbstractC56372iV.A01(view.requireViewById(R.id.reel_media_card_view_stub), false, false);
            InterfaceC56392iX A012 = AbstractC56372iV.A01(view.requireViewById(R.id.reel_flexible_media_card_view_stub), false, false);
            this.A0X = new C139606Tp(AbstractC56372iV.A01(view.findViewById(R.id.reel_item_bottom_banner), false, false));
            View requireViewById7 = view.requireViewById(R.id.landscape_overlay_container);
            C14360o3.A07(requireViewById7);
            this.A0l = new C139626Tr(roundedCornerFrameLayout, (IgFrameLayout) requireViewById7, A01, A012, mediaFrameLayout);
            this.A0O = new C4Zp((ViewStub) view.requireViewById(R.id.reel_poll_stub));
            this.A0N = new C97564Zr(AbstractC56372iV.A01(view.requireViewById(R.id.reel_poll_v2_stub), false, false));
            this.A0M = new C144176ez(AbstractC56372iV.A01(view.requireViewById(R.id.reel_countdown_sticker_stub), false, false));
            this.A0R = new C144366fI(AbstractC56372iV.A01(view.requireViewById(R.id.reel_upcoming_event_card_sticker_stub), false, false));
            this.A0U = new C139636Ts(roundedCornerFrameLayout, A01, A012);
            View requireViewById8 = view.requireViewById(R.id.reel_swipe_up_instructions_stub);
            C14360o3.A07(requireViewById8);
            this.A0o = new C143716eE((ViewStub) requireViewById8);
            View requireViewById9 = view.requireViewById(R.id.sponsored_reel_showreel_native_image_view_stub);
            C14360o3.A07(requireViewById9);
            this.A0n = new C139646Tt((ViewStub) requireViewById9, userSession, componentCallbacks2C142736cZ);
            View requireViewById10 = view.requireViewById(R.id.sponsored_reel_showreel_composition_view_stub);
            C14360o3.A07(requireViewById10);
            this.A0m = new C139656Tu((ViewStub) requireViewById10, componentCallbacks2C142736cZ);
            View requireViewById11 = view.requireViewById(R.id.lead_gen_card_stub);
            C14360o3.A07(requireViewById11);
            this.A0e = new C139666Tv((ViewStub) requireViewById11);
            View requireViewById12 = view.requireViewById(R.id.lead_gen_first_question_card_with_mcq_stub);
            C14360o3.A07(requireViewById12);
            this.A0g = new C139686Tx((ViewStub) requireViewById12);
            View requireViewById13 = view.requireViewById(R.id.lead_gen_first_question_card_with_saq_stub);
            C14360o3.A07(requireViewById13);
            this.A0h = new C139706Tz((ViewStub) requireViewById13);
            View requireViewById14 = view.requireViewById(R.id.lead_gen_first_question_card_with_contact_info_question_stub);
            C14360o3.A07(requireViewById14);
            this.A0f = new C6U1((ViewStub) requireViewById14);
            View requireViewById15 = view.requireViewById(R.id.offsite_lead_gen_card_stub);
            C14360o3.A07(requireViewById15);
            this.A0i = new C6U3((ViewStub) requireViewById15);
            View requireViewById16 = view.requireViewById(R.id.faqs_in_stories_card_stub);
            C14360o3.A07(requireViewById16);
            this.A0b = new C6U5((ViewStub) requireViewById16);
            View requireViewById17 = view.requireViewById(R.id.ctwa_story_messaging_card_stub);
            C14360o3.A07(requireViewById17);
            this.A0a = new C6U7((ViewStub) requireViewById17);
            View requireViewById18 = view.requireViewById(R.id.generic_card_revamp_stub);
            C14360o3.A07(requireViewById18);
            this.A0c = new C6U9((ViewStub) requireViewById18);
            View requireViewById19 = view.requireViewById(R.id.generic_card_stub);
            C14360o3.A07(requireViewById19);
            this.A0d = new C6UD((ViewStub) requireViewById19);
            View requireViewById20 = view.requireViewById(R.id.collection_ad_view_stub);
            C14360o3.A07(requireViewById20);
            this.A0j = new C6UG((ViewStub) requireViewById20, userSession, mediaFrameLayout, roundedCornerFrameLayout);
            this.A0k = new C6UI(context, view, userSession, AbstractC56372iV.A01(view.requireViewById(C18U.A06(C06090Tz.A05, userSession, 36313896950958389L) ? R.id.reel_cta_sticker_with_shadow_stub : R.id.reel_cta_sticker_stub), false, false));
            this.A0T = new C6UL(c139566Tl.A04, this.A06.A05.A04, userSession, AbstractC56372iV.A01(view.requireViewById(R.id.end_scene_stub), false, false));
            this.A0Q = new C144376fJ(reelViewGroup, (ViewStub) view.requireViewById(R.id.sponsored_reel_product_sticker_stub), userSession);
            View requireViewById21 = view.requireViewById(R.id.sponsored_reel_multi_product_sticker_stub);
            C14360o3.A07(requireViewById21);
            this.A0P = new C144386fK((ViewStub) requireViewById21, reelViewGroup);
            this.A0W = new C6UN(AbstractC56372iV.A01(view.requireViewById(R.id.reel_item_brand_survey), false, false));
            this.A0V = new C6UP(requireViewById4, userSession);
            this.A0r = view.requireViewById(R.id.delayed_skip_blocking_animation);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0131, code lost:
    
        if (r3 != null) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC143646e4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dds(X.C141596ac r13, int r14) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140436Wx.Dds(X.6ac, int):void");
    }

    private final C6QC A00() {
        IgShowreelCompositionView igShowreelCompositionView;
        C139656Tu c139656Tu = this.A0m;
        if (c139656Tu.A00 == null) {
            C0w9.A03("SponsoredReelViewerItemBinder#getTextureView", "IgShowreelCompositionVideoView is null");
            InterfaceC56392iX interfaceC56392iX = c139656Tu.A02;
            if (interfaceC56392iX.CWW() && (igShowreelCompositionView = (IgShowreelCompositionView) interfaceC56392iX.getView()) != null) {
                c139656Tu.A00 = igShowreelCompositionView.getCompositionController().getVideoView();
            }
            if (c139656Tu.A00 != null) {
                C0w9.A03("SponsoredReelViewerItemBinder#getTextureView", "success on findViewWithTag for IgShowreelCompositionVideoView");
            }
        }
        return c139656Tu.A00;
    }

    private final boolean A01() {
        C41181vS c41181vS = this.A00;
        if (c41181vS != null) {
            UserSession userSession = this.A0G;
            if (AbstractC130925vf.A0H(userSession, c41181vS) || AbstractC130925vf.A0D(userSession, c41181vS)) {
                return true;
            }
        }
        if (this.A07) {
            Context context = this.A0E.getContext();
            C14360o3.A07(context);
            if (!C143726eF.A0B(context)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void A02() {
        C41551w4 c41551w4 = this.A01;
        if (c41551w4 != null) {
            c41551w4.A07 = true;
            C139556Tk c139556Tk = this.A0Z;
            UserSession userSession = this.A0G;
            SegmentedProgressBar segmentedProgressBar = c139556Tk.A00;
            segmentedProgressBar.A06 = -1;
            int A02 = c41551w4.A02(userSession);
            int i = segmentedProgressBar.A04;
            if (i < A02) {
                segmentedProgressBar.A0A = i;
                segmentedProgressBar.A09 = segmentedProgressBar.A08;
                segmentedProgressBar.A07 = segmentedProgressBar.A06;
                segmentedProgressBar.A04 = A02;
                segmentedProgressBar.A0M.start();
                segmentedProgressBar.invalidate();
            }
        }
    }

    public final void A03() {
        FrameLayout.LayoutParams layoutParams;
        RoundedCornerFrameLayout roundedCornerFrameLayout = this.A0q;
        Context context = roundedCornerFrameLayout.getContext();
        roundedCornerFrameLayout.setBackgroundColor(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_media_background)));
        MediaFrameLayout mediaFrameLayout = this.A0p;
        ViewGroup.LayoutParams layoutParams2 = mediaFrameLayout.getLayoutParams();
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
            ((ViewGroup.LayoutParams) layoutParams).height = -1;
            ((ViewGroup.LayoutParams) layoutParams).width = -1;
            layoutParams.gravity = 0;
            layoutParams.setMargins(0, 0, 0, 0);
            mediaFrameLayout.setLayoutParams(layoutParams);
        }
        mediaFrameLayout.setTranslationY(0.0f);
        mediaFrameLayout.A00 = -1.0f;
        mediaFrameLayout.setScaleX(1.0f);
        mediaFrameLayout.setScaleY(1.0f);
        IgProgressImageView igProgressImageView = this.A0L;
        igProgressImageView.setScaleX(1.0f);
        igProgressImageView.setScaleY(1.0f);
    }

    public final void A04() {
        ScalingTextureView C6w;
        IgProgressImageView igProgressImageView = this.A0L;
        IgImageView igImageView = igProgressImageView.getIgImageView();
        if (this.A08 || this.A09) {
            if (this.A0A) {
                igImageView.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
                igImageView.setClipToOutline(false);
                if (igProgressImageView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.LayoutParams layoutParams = igProgressImageView.getLayoutParams();
                    C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, 0, 0, 0);
                }
                ImageView imageView = this.A0F;
                imageView.setOnTouchListener(null);
                imageView.setVisibility(8);
            }
            if (this.A08) {
                igImageView.setOnTouchListener(null);
            }
            if (this.A09 && (C6w = C6w()) != null) {
                C6w.setOnTouchListener(null);
            }
            this.A08 = false;
            this.A09 = false;
        }
        this.A0A = false;
    }

    public final void A05() {
        C139566Tl c139566Tl = this.A0Y;
        IgImageView igImageView = c139566Tl.A0F;
        igImageView.setVisibility(0);
        c139566Tl.A0E.setVisibility(8);
        igImageView.A09();
        ImageView imageView = c139566Tl.A00;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        c139566Tl.A0G.A00.setText("");
        c139566Tl.A0H.A04.setVisibility(8);
        this.A00 = null;
        this.A04 = null;
        this.A01 = null;
        this.A03 = null;
        A04();
        this.A0L.A04();
        this.A0Z.A00.setProgress(0.0f);
        this.A06.A05.A00 = false;
        C6UP c6up = this.A0V;
        C14360o3.A0B(c6up, 0);
        C6UT c6ut = c6up.A01;
        if (c6ut != null) {
            c6ut.A01(null, null, C16930sl.A00);
        }
        c6up.A00 = null;
    }

    @Override // X.InterfaceC141676ak
    public final C138466Pc AYW() {
        return this.A06.AYW();
    }

    @Override // X.C6e1
    public final XEX AjV() {
        C41181vS c41181vS = this.A00;
        C41551w4 c41551w4 = this.A01;
        if (c41181vS != null && c41551w4 != null) {
            Context context = this.A0E.getContext();
            C14360o3.A07(context);
            UserSession userSession = this.A0G;
            if (AbstractC149536o5.A05(context, userSession, c41181vS, c41551w4) && AbstractC149536o5.A09(userSession, c41181vS, c41551w4.A01)) {
                return this.A0k.A01;
            }
        }
        return this.A06.AjV();
    }

    @Override // X.InterfaceC143586dx
    public final IgProgressImageView BGy() {
        C6QC c6qc;
        C41551w4 c41551w4 = this.A01;
        if (c41551w4 != null) {
            UserSession userSession = this.A0G;
            C41181vS A08 = c41551w4.A08(userSession);
            if (AbstractC130925vf.A0e(A08) && (c6qc = this.A0m.A00) != null) {
                return c6qc.A00;
            }
            C41551w4 c41551w42 = this.A01;
            if (c41551w42 != null) {
                if (AbstractC130925vf.A0N(userSession, A08, c41551w42)) {
                    IgProgressImageView igProgressImageView = this.A0U.A02;
                    if (igProgressImageView != null) {
                        return igProgressImageView;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                return this.A0L;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC143596dy
    public final C41181vS Blb() {
        return this.A00;
    }

    @Override // X.InterfaceC143586dx
    public final FrameLayout Blf() {
        C6QC c6qc;
        if (C4R8.A00(this.A0G, "reel_sponsored_viewer")) {
            c6qc = A00();
        } else {
            c6qc = this.A0m.A00;
        }
        C41181vS c41181vS = this.A00;
        if (c41181vS != null && AbstractC130925vf.A0e(c41181vS) && c6qc != null) {
            return c6qc.A01;
        }
        return this.A0p;
    }

    @Override // X.InterfaceC143616e0
    public final View Blm() {
        C97564Zr c97564Zr = this.A0N;
        View view = null;
        if (c97564Zr.A09.CWW() && (view = c97564Zr.A00) == null) {
            C14360o3.A0F("stickerContainerView");
            throw C00O.createAndThrow();
        }
        return view;
    }

    @Override // X.InterfaceC143616e0
    public final ViewGroup Bln() {
        ViewGroup viewGroup = this.A0O.A02;
        if (viewGroup != null) {
            return viewGroup;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC141666aj
    public final C138446Pa C4e() {
        C41181vS c41181vS = this.A00;
        if (c41181vS != null && AbstractC149536o5.A08(this.A0G, c41181vS)) {
            return this.A0k.C4e();
        }
        return this.A06.C4e();
    }

    @Override // X.InterfaceC143586dx
    public final ScalingTextureView C6w() {
        C6QC A00;
        ScalingTextureView scalingTextureView;
        if (C4R8.A00(this.A0G, "reel_sponsored_viewer")) {
            return null;
        }
        C41181vS c41181vS = this.A00;
        if (c41181vS != null && AbstractC130925vf.A0e(c41181vS) && (A00 = A00()) != null && (scalingTextureView = A00.getScalingTextureView()) != null) {
            return scalingTextureView;
        }
        return (ScalingTextureView) this.A0t.getView();
    }

    @Override // X.InterfaceC143606dz
    public final void DQl(boolean z) {
        UserSession userSession = this.A0G;
        if (this.A07) {
            C14360o3.A0B(userSession, 0);
            if (C18U.A06(C06090Tz.A05, userSession, 36313896949582123L)) {
                this.A0k.A00();
            }
        }
        if (!A01()) {
            this.A0o.A01(userSession, this.A00, this.A01, z);
        }
        C6TZ c6tz = this.A06.A09;
        View view = c6tz.A01;
        if (view.getVisibility() == 0) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(view.getContext().getResources().getInteger(R.integer.config_activityLongDur));
            alphaAnimation.setAnimationListener(new WOS(c6tz));
            view.startAnimation(alphaAnimation);
        }
    }

    @Override // X.InterfaceC143606dz
    public final void DQm() {
        UserSession userSession = this.A0G;
        if (this.A07) {
            C14360o3.A0B(userSession, 0);
            if (C18U.A06(C06090Tz.A05, userSession, 36313896949582123L)) {
                this.A0k.A01();
            }
        }
        if (!A01()) {
            this.A0o.A00();
        }
        C6TZ c6tz = this.A06.A09;
        View view = c6tz.A01;
        if (view.getVisibility() == 8) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(view.getContext().getResources().getInteger(R.integer.config_activityLongDur));
            alphaAnimation.setAnimationListener(new WOR(c6tz));
            view.startAnimation(alphaAnimation);
        }
    }

    @Override // X.InterfaceC143636e3
    public final void Ddv() {
        C6TS c6ts = this.A06;
        C141596ac c141596ac = c6ts.A00;
        if (c141596ac != null) {
            c141596ac.A0j = false;
        }
        XEX AjV = c6ts.AjV();
        if (AjV != null) {
            AbstractC65725Tsz.A00(AjV);
        }
        c6ts.A05.A00();
        C138456Pb.A03(c6ts.C4e());
        c6ts.A0A.A02();
        C138466Pc AYW = c6ts.AYW();
        Animator animator = (Animator) AYW.A02.getValue();
        if (animator != null) {
            animator.cancel();
        }
        C141596ac c141596ac2 = AYW.A00;
        if (c141596ac2 != null) {
            c141596ac2.A0i = false;
        }
        c6ts.A07.A00();
        c6ts.A09.A01.setVisibility(0);
        this.A0T.A0C.setVisibility(8);
        if (this.A07 && this.A0B) {
            this.A0k.A01();
        }
        C6UI c6ui = this.A0k;
        C139306Sl c139306Sl = c6ui.A01;
        if (c139306Sl != null) {
            C141596ac c141596ac3 = c139306Sl.A02;
            if (c141596ac3 != null && c141596ac3.A0z && !AbstractC149536o5.A0C(c6ui.A07, c141596ac3)) {
                AbstractC65725Tsz.A00(c139306Sl);
                c139306Sl.EK3();
            } else {
                C141596ac c141596ac4 = c139306Sl.A02;
                if (c141596ac4 != null) {
                    c141596ac4.A0j = true;
                }
                c139306Sl.EhB();
            }
        }
        C138456Pb.A03(c6ui.C4e());
        c6ui.A0A.A02();
        c6ui.A03 = false;
        C138456Pb.A03(C4e());
    }

    @Override // X.InterfaceC143626e2
    public final void ERN(float f) {
        this.A0s.setAlpha(f);
        this.A0Z.A00.setAlpha(f);
        this.A0Y.A04.setAlpha(f);
        C6TS c6ts = this.A06;
        c6ts.A07.A04.setAlpha(f);
        InterfaceC56392iX interfaceC56392iX = c6ts.A03;
        if (interfaceC56392iX.CWW()) {
            interfaceC56392iX.getView().setAlpha(f);
        }
        InterfaceC56392iX interfaceC56392iX2 = c6ts.A02;
        if (interfaceC56392iX2.CWW()) {
            interfaceC56392iX2.getView().setAlpha(f);
        }
        InterfaceC56392iX interfaceC56392iX3 = c6ts.A04;
        if (interfaceC56392iX3.CWW()) {
            interfaceC56392iX3.getView().setAlpha(f);
        }
        c6ts.A0A.A03(f);
        c6ts.A05.A04.setAlpha(f);
        InterfaceC56392iX interfaceC56392iX4 = c6ts.A06.A00;
        if (interfaceC56392iX4.CWW()) {
            interfaceC56392iX4.getView().setAlpha(f);
        }
        this.A0k.A0A.A03(f);
    }
}
