package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.Adapter;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.R;
import com.facebook.android.maps.model.LatLng;
import com.facebook.maps.ttrc.common.MapboxTTRC;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.friendmap.configs.FriendMapLaunchConfig;
import com.instagram.friendmap.view.customview.FriendMapAnimatedLikeView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.quicksnap.emitter.QuickSnapReactionEmitterView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class KCU extends AbstractC59962oe implements InterfaceC60072op, InterfaceC71980XDp, InterfaceC71981XDq, InterfaceC71982XDr {
    public static final String __redex_internal_original_name = "FriendMapFragment";
    public View A00;
    public View A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public CardView A07;
    public CardView A08;
    public CardView A09;
    public CardView A0A;
    public ViewPager2 A0B;
    public C66362zD A0C;
    public IgFrameLayout A0D;
    public IgFrameLayout A0E;
    public IgFrameLayout A0F;
    public IgLinearLayout A0G;
    public IgSimpleImageView A0H;
    public IgSimpleImageView A0I;
    public IgSimpleImageView A0J;
    public IgSimpleImageView A0K;
    public IgSimpleImageView A0L;
    public IgSimpleImageView A0M;
    public IgSimpleImageView A0N;
    public IgSimpleImageView A0O;
    public IgSimpleImageView A0P;
    public IgSimpleImageView A0Q;
    public IgSimpleImageView A0R;
    public CircularImageView A0S;
    public IgImageView A0T;
    public IgImageView A0U;
    public IgImageView A0V;
    public ReboundViewPager A0W;
    public FriendMapLaunchConfig A0X;
    public M9u A0Y;
    public FriendMapAnimatedLikeView A0Z;
    public C45690KKb A0a;
    public C45689KKa A0b;
    public L95 A0c;
    public L90 A0d;
    public KL5 A0e;
    public IgdsBottomButtonLayout A0f;
    public C69800Vvm A0g;
    public QuickSnapReactionEmitterView A0h;
    public Integer A0i;
    public IgFrameLayout A0j;
    public C48574LeB A0k;
    public final InterfaceC09390do A0n = C50248MHd.A00(this, 18);
    public final InterfaceC09390do A0p = AbstractC25225BEi.A0a(C50248MHd.A01(this, 20), C50248MHd.A01(this, 21), new ME1(35, null, this), AbstractC25225BEi.A1D(C45999KXn.class));
    public final C57112jm A0l = C57112jm.A00();
    public final InterfaceC09390do A0m = C50248MHd.A00(this, 17);
    public final InterfaceC09390do A0o = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC71982XDr
    public final int BPe(AbstractC66278U6y abstractC66278U6y) {
        return 0;
    }

    @Override // X.InterfaceC71980XDp
    public final void DR0(C69800Vvm c69800Vvm) {
    }

    @Override // X.InterfaceC71980XDp
    public final void DR4(C69800Vvm c69800Vvm) {
        C45999KXn A0e = AbstractC43593JPy.A0e(this);
        Integer num = C05F.A00;
        UserSession userSession = A0e.A02;
        if (AbstractC47862LCi.A01(userSession, num)) {
            C45999KXn.A07(null, A0e, num, new C50152MDf(A0e, 2), new C50152MDf(A0e, 3), 300L, !C18U.A06(C06090Tz.A05, userSession, 36321722379347697L));
        } else {
            LJ4 lj4 = A0e.A06;
            if (((!lj4.A05() && lj4.A04()) || !lj4.A05()) && (C45293K2v.A00(A0e) instanceof C46004KXs) && ((C92984Et) A0e.A05.A0N.getValue()).A04 != EnumC92974Es.A09 && C3LA.A03(userSession)) {
                AbstractC23641Du.A03(num, AnonymousClass191.A00, new MBp(A0e, null, 47), AbstractC141776au.A00(A0e));
            }
            C45999KXn.A06(null, A0e, C05F.A01, new C50152MDf(A0e, 4));
        }
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC23641Du.A03(num, AnonymousClass191.A00, new MCL(viewLifecycleOwner, c07s, this, null, 42), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.InterfaceC71981XDq
    public final void EGg(C69717VuC c69717VuC, ULQ ulq) {
    }

    @Override // X.InterfaceC71981XDq
    public final void EGh(C69717VuC c69717VuC, ULQ ulq) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "friend_map";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [X.KL5, X.2tS, java.lang.Object] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C44415JkA c44415JkA;
        ViewGroup viewGroup;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0E = JQ0.A0E(this, R.id.note_creation_button);
        IgSimpleImageView igSimpleImageView = (IgSimpleImageView) A0E;
        AbstractC44198Jg1.A08(igSimpleImageView, R.drawable.instagram_add_pano_outline_24);
        C14360o3.A07(A0E);
        this.A0L = igSimpleImageView;
        this.A0D = (IgFrameLayout) JQ1.A05(this, R.id.center_location_button_container);
        View A0E2 = JQ0.A0E(this, R.id.center_location_button);
        IgSimpleImageView igSimpleImageView2 = (IgSimpleImageView) A0E2;
        AbstractC44198Jg1.A08(igSimpleImageView2, R.drawable.instagram_location_arrow_pano_outline_24);
        C14360o3.A07(A0E2);
        this.A0J = igSimpleImageView2;
        View A0E3 = JQ0.A0E(this, R.id.center_location_button_warning);
        IgSimpleImageView igSimpleImageView3 = (IgSimpleImageView) A0E3;
        igSimpleImageView3.setImageResource(R.drawable.instagram_warning_pano_filled_12);
        AbstractC31173DnH.A11(igSimpleImageView3.getContext(), igSimpleImageView3, R.color.activator_card_progress_bad);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(AbstractC167007dF.A09(requireContext(), R.attr.igds_color_primary_background));
        igSimpleImageView3.setBackground(gradientDrawable);
        C14360o3.A07(A0E3);
        this.A0K = igSimpleImageView3;
        View A0E4 = JQ0.A0E(this, R.id.back_button);
        IgSimpleImageView igSimpleImageView4 = (IgSimpleImageView) A0E4;
        AbstractC44198Jg1.A08(igSimpleImageView4, R.drawable.instagram_chevron_left_pano_outline_rtl_24);
        C14360o3.A07(A0E4);
        this.A0H = igSimpleImageView4;
        View A0E5 = JQ0.A0E(this, R.id.zoom_out_button);
        IgSimpleImageView igSimpleImageView5 = (IgSimpleImageView) A0E5;
        AbstractC44198Jg1.A08(igSimpleImageView5, R.drawable.instagram_expand_pano_outline_24);
        C14360o3.A07(A0E5);
        this.A0R = igSimpleImageView5;
        View A0E6 = JQ0.A0E(this, R.id.settings_button);
        IgSimpleImageView igSimpleImageView6 = (IgSimpleImageView) A0E6;
        AbstractC44198Jg1.A08(igSimpleImageView6, R.drawable.instagram_settings_pano_outline_24);
        C14360o3.A07(A0E6);
        this.A0P = igSimpleImageView6;
        View A0E7 = JQ0.A0E(this, R.id.test_rig_button);
        IgSimpleImageView igSimpleImageView7 = (IgSimpleImageView) A0E7;
        AbstractC44198Jg1.A08(igSimpleImageView7, R.drawable.instagram_sliders_pano_outline_24);
        C14360o3.A07(A0E7);
        this.A0Q = igSimpleImageView7;
        this.A01 = JQ1.A05(this, R.id.self_view_container);
        View A0E8 = JQ0.A0E(this, R.id.self_view_button);
        CircularImageView circularImageView = (CircularImageView) A0E8;
        InterfaceC09390do interfaceC09390do = this.A0o;
        User A02 = AbstractC31176DnK.A0h(interfaceC09390do).A02(AbstractC31173DnH.A0t(interfaceC09390do));
        if (A02 != null) {
            AbstractC31173DnH.A1T(this, circularImageView, A02);
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(AbstractC167007dF.A09(requireContext(), R.attr.igds_color_primary_background));
        circularImageView.setBackground(gradientDrawable2);
        C14360o3.A07(A0E8);
        this.A0S = circularImageView;
        View A0E9 = JQ0.A0E(this, R.id.self_view_count_label);
        TextView textView = (TextView) A0E9;
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setShape(1);
        gradientDrawable3.setColor(AbstractC167007dF.A09(requireContext(), R.attr.igds_color_primary_background));
        textView.setBackground(gradientDrawable3);
        C14360o3.A07(A0E9);
        this.A06 = textView;
        this.A0G = (IgLinearLayout) JQ1.A05(this, R.id.map_focus_mode_overlay);
        this.A0B = (ViewPager2) JQ1.A05(this, R.id.friend_map_h_scroll_pager);
        View A0E10 = JQ0.A0E(this, R.id.exit_focus_view_button);
        IgSimpleImageView igSimpleImageView8 = (IgSimpleImageView) A0E10;
        AbstractC44198Jg1.A08(igSimpleImageView8, R.drawable.instagram_x_pano_outline_24);
        C14360o3.A07(A0E10);
        this.A0M = igSimpleImageView8;
        this.A0E = (IgFrameLayout) JQ1.A05(this, R.id.map_creation_mode_overlay);
        this.A0f = (IgdsBottomButtonLayout) JQ1.A05(this, R.id.publish_note_bottom_button);
        this.A0A = (CardView) JQ1.A05(this, R.id.publish_note_bottom_card);
        this.A0O = (IgSimpleImageView) JQ1.A05(this, R.id.creation_pin_overlay_image_view);
        this.A0W = (ReboundViewPager) JQ1.A05(this, R.id.quick_emoji_note_options_pager);
        this.A0Z = (FriendMapAnimatedLikeView) JQ1.A05(this, R.id.map_animated_like_view);
        this.A0F = (IgFrameLayout) JQ1.A05(this, R.id.map_hide_places_mode_overlay);
        this.A0N = (IgSimpleImageView) JQ1.A05(this, R.id.hide_places_draft_pin_overlay_image_view);
        CardView cardView = (CardView) JQ1.A05(this, R.id.audience_selector_pill);
        this.A07 = cardView;
        String str = "audiencePillSelector";
        if (cardView != null) {
            this.A02 = AbstractC166987dD.A0e(cardView, R.id.friend_map_indicator_pill_text);
            CardView cardView2 = this.A07;
            if (cardView2 != null) {
                this.A0T = AbstractC31172DnG.A0a(cardView2, R.id.friend_map_indicator_pill_image);
                AbstractC13880nE.A0f(JQ1.A05(this, R.id.map_buttons_overlay), AbstractC56402iY.A01(requireActivity()));
                View A0E11 = JQ0.A0E(this, R.id.friend_map_banner);
                int A01 = AbstractC56402iY.A01(requireActivity());
                C14360o3.A0B(A0E11, 0);
                AbstractC13880nE.A0f(A0E11, A01 + AbstractC13880nE.A0D(A0E11));
                this.A00 = A0E11;
                this.A03 = (TextView) JQ1.A05(this, R.id.friend_map_banner_message);
                View A0E12 = JQ0.A0E(this, R.id.friend_map_banner_close_button);
                ViewOnClickListenerC48074LPz.A01(A0E12, 59, this);
                C14360o3.A07(A0E12);
                this.A0I = (IgSimpleImageView) JQ1.A05(this, R.id.friend_map_banner_image);
                CardView cardView3 = (CardView) JQ1.A05(this, R.id.not_sharing_location_pill);
                this.A09 = cardView3;
                str = "notSharingLocationPill";
                if (cardView3 != null) {
                    this.A05 = AbstractC166987dD.A0e(cardView3, R.id.friend_map_indicator_pill_text);
                    CardView cardView4 = this.A09;
                    if (cardView4 != null) {
                        this.A0V = AbstractC31172DnG.A0a(cardView4, R.id.friend_map_indicator_pill_image);
                        CardView cardView5 = (CardView) JQ1.A05(this, R.id.location_sharing_pill);
                        this.A08 = cardView5;
                        str = "locationSharingPill";
                        if (cardView5 != null) {
                            this.A04 = AbstractC166987dD.A0e(cardView5, R.id.friend_map_indicator_pill_text);
                            CardView cardView6 = this.A08;
                            if (cardView6 != null) {
                                this.A0U = AbstractC31172DnG.A0a(cardView6, R.id.friend_map_indicator_pill_image);
                                if (C18U.A06(C06090Tz.A05, AbstractC25230BEn.A0k(interfaceC09390do, 0), 36321722382493464L)) {
                                    View rootView = view.getRootView();
                                    if ((rootView instanceof ViewGroup) && (viewGroup = (ViewGroup) rootView) != null) {
                                        QuickSnapReactionEmitterView quickSnapReactionEmitterView = new QuickSnapReactionEmitterView(AbstractC166997dE.A0L(viewGroup), null, 0);
                                        this.A0h = quickSnapReactionEmitterView;
                                        viewGroup.addView(quickSnapReactionEmitterView);
                                    }
                                }
                                C66362zD A0R = AbstractC31173DnH.A0R(AbstractC31174DnI.A0R(this), new C45669KJg(this, AbstractC166987dD.A0r(interfaceC09390do), (C47633L1s) this.A0m.getValue(), new C49411Lsl(this)));
                                this.A0C = A0R;
                                ViewPager2 viewPager2 = this.A0B;
                                if (viewPager2 != null) {
                                    viewPager2.setAdapter(A0R);
                                    int dimensionPixelSize = AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.abc_list_item_height_large_material);
                                    int dimensionPixelSize2 = AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.achievements_only_you_bottom_margin);
                                    ViewPager2 viewPager22 = this.A0B;
                                    if (viewPager22 != null) {
                                        viewPager22.offsetLeftAndRight(dimensionPixelSize);
                                        ViewPager2 viewPager23 = this.A0B;
                                        if (viewPager23 != null) {
                                            viewPager23.setOffscreenPageLimit(3);
                                            ViewPager2 viewPager24 = this.A0B;
                                            if (viewPager24 != null) {
                                                viewPager24.setOrientation(0);
                                                int i = dimensionPixelSize + dimensionPixelSize2;
                                                ViewPager2 viewPager25 = this.A0B;
                                                if (viewPager25 != null) {
                                                    viewPager25.setPageTransformer(new C48115LRp(i));
                                                    ViewPager2 viewPager26 = this.A0B;
                                                    if (viewPager26 != null) {
                                                        int i2 = dimensionPixelSize2 * 2;
                                                        viewPager26.A04.A10(new C51191MjZ(dimensionPixelSize2, i2, i2));
                                                        ReboundViewPager reboundViewPager = this.A0W;
                                                        String str2 = "quickEmojiPager";
                                                        if (reboundViewPager != null) {
                                                            C44415JkA c44415JkA2 = new C44415JkA(requireContext(), AbstractC166987dD.A0r(interfaceC09390do), AbstractC43592JPx.A0i(this.A0n));
                                                            c44415JkA2.A00 = new L6X(this);
                                                            reboundViewPager.setAdapter(c44415JkA2);
                                                            float A04 = AbstractC166987dD.A04(AbstractC166997dE.A0N(this), R.dimen.appreciation_reels_grid_item_width);
                                                            C174437pd c174437pd = new C174437pd(AbstractC174417pb.A00(A04, AbstractC166987dD.A02(AbstractC13880nE.A0A(requireContext())), AbstractC166987dD.A04(AbstractC166997dE.A0N(this), R.dimen.action_bar_item_spacing_left), AbstractC166987dD.A04(AbstractC166997dE.A0N(this), R.dimen.fbpay_ui_text_button_width), AbstractC166987dD.A04(AbstractC166997dE.A0N(this), R.dimen.avatar_size_ridiculously_xlarge)), A04, AbstractC13880nE.A0A(requireContext()), A04, 20.0f);
                                                            ReboundViewPager reboundViewPager2 = this.A0W;
                                                            if (reboundViewPager2 != null) {
                                                                reboundViewPager2.A04 = 4.0f;
                                                                reboundViewPager2.A0M(4, false);
                                                                ReboundViewPager reboundViewPager3 = this.A0W;
                                                                if (reboundViewPager3 != null) {
                                                                    reboundViewPager3.setPageSpacing(0.0f);
                                                                    ReboundViewPager reboundViewPager4 = this.A0W;
                                                                    if (reboundViewPager4 != null) {
                                                                        reboundViewPager4.setScrollMode(EnumC74213Va.A04);
                                                                        ReboundViewPager reboundViewPager5 = this.A0W;
                                                                        if (reboundViewPager5 != null) {
                                                                            reboundViewPager5.A0J = c174437pd;
                                                                            IgSimpleImageView igSimpleImageView9 = this.A0L;
                                                                            if (igSimpleImageView9 == null) {
                                                                                str2 = "createNoteButton";
                                                                            } else {
                                                                                KKp.A01(AbstractC43592JPx.A0U(igSimpleImageView9), this, 29);
                                                                                IgSimpleImageView igSimpleImageView10 = this.A0M;
                                                                                if (igSimpleImageView10 == null) {
                                                                                    str2 = "exitFocusViewButton";
                                                                                } else {
                                                                                    KKp.A01(AbstractC43592JPx.A0U(igSimpleImageView10), this, 30);
                                                                                    ViewPager2 viewPager27 = this.A0B;
                                                                                    if (viewPager27 != null) {
                                                                                        viewPager27.A05(new C43748JWj(new C50355MLh(this, 32), 6));
                                                                                        ?? obj = new Object();
                                                                                        ReboundViewPager reboundViewPager6 = this.A0W;
                                                                                        if (reboundViewPager6 != 0) {
                                                                                            obj.A00 = reboundViewPager6;
                                                                                            Adapter adapter = reboundViewPager6.getAdapter();
                                                                                            if ((adapter instanceof C44415JkA) && (c44415JkA = (C44415JkA) adapter) != null) {
                                                                                                obj.A01 = c44415JkA;
                                                                                            }
                                                                                            this.A0e = obj;
                                                                                            reboundViewPager6.A0P(obj);
                                                                                            IgSimpleImageView igSimpleImageView11 = this.A0H;
                                                                                            if (igSimpleImageView11 == null) {
                                                                                                str2 = "backButton";
                                                                                            } else {
                                                                                                KKp.A01(AbstractC43592JPx.A0U(igSimpleImageView11), this, 31);
                                                                                                IgSimpleImageView igSimpleImageView12 = this.A0J;
                                                                                                if (igSimpleImageView12 == null) {
                                                                                                    str2 = "centerLocationButton";
                                                                                                } else {
                                                                                                    KKp.A01(AbstractC43592JPx.A0U(igSimpleImageView12), this, 32);
                                                                                                    IgSimpleImageView igSimpleImageView13 = this.A0P;
                                                                                                    if (igSimpleImageView13 == null) {
                                                                                                        str2 = "settingsButton";
                                                                                                    } else {
                                                                                                        KKp.A01(AbstractC43592JPx.A0U(igSimpleImageView13), this, 33);
                                                                                                        IgSimpleImageView igSimpleImageView14 = this.A0Q;
                                                                                                        if (igSimpleImageView14 == null) {
                                                                                                            str2 = "testRigButton";
                                                                                                        } else {
                                                                                                            KKp.A01(AbstractC43592JPx.A0U(igSimpleImageView14), this, 34);
                                                                                                            CircularImageView circularImageView2 = this.A0S;
                                                                                                            if (circularImageView2 == null) {
                                                                                                                str2 = "selfViewButton";
                                                                                                            } else {
                                                                                                                KKp.A01(AbstractC43592JPx.A0U(circularImageView2), this, 35);
                                                                                                                IgSimpleImageView igSimpleImageView15 = this.A0R;
                                                                                                                if (igSimpleImageView15 == null) {
                                                                                                                    str2 = "zoomOutButton";
                                                                                                                } else {
                                                                                                                    KKp.A01(AbstractC43592JPx.A0U(igSimpleImageView15), this, 36);
                                                                                                                    IgdsBottomButtonLayout igdsBottomButtonLayout = this.A0f;
                                                                                                                    if (igdsBottomButtonLayout == null) {
                                                                                                                        str2 = "publishNoteBottomButton";
                                                                                                                    } else {
                                                                                                                        igdsBottomButtonLayout.setPrimaryActionOnClickListener(ViewOnClickListenerC48074LPz.A00(this, 60));
                                                                                                                        CardView cardView7 = this.A07;
                                                                                                                        if (cardView7 == null) {
                                                                                                                            str2 = "audiencePillSelector";
                                                                                                                        } else {
                                                                                                                            KKp.A01(AbstractC43592JPx.A0U(cardView7), this, 37);
                                                                                                                            CardView cardView8 = this.A09;
                                                                                                                            if (cardView8 == null) {
                                                                                                                                str2 = "notSharingLocationPill";
                                                                                                                            } else {
                                                                                                                                KKp.A01(AbstractC43592JPx.A0U(cardView8), this, 27);
                                                                                                                                CardView cardView9 = this.A08;
                                                                                                                                if (cardView9 == null) {
                                                                                                                                    str2 = "locationSharingPill";
                                                                                                                                } else {
                                                                                                                                    KKp.A01(AbstractC43592JPx.A0U(cardView9), this, 28);
                                                                                                                                    this.mLifecycleRegistry.A09(AbstractC43593JPy.A0e(this));
                                                                                                                                    M9u m9u = this.A0Y;
                                                                                                                                    if (m9u == null) {
                                                                                                                                        str2 = "annotationPlaybackManager";
                                                                                                                                    } else {
                                                                                                                                        registerLifecycleListener(m9u);
                                                                                                                                        C57112jm c57112jm = this.A0l;
                                                                                                                                        C71163Hc A00 = C71163Hc.A00(this);
                                                                                                                                        ViewPager2 viewPager28 = this.A0B;
                                                                                                                                        if (viewPager28 != null) {
                                                                                                                                            c57112jm.A08(viewPager28, A00, new InterfaceC57142jp[0]);
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    str2 = "presenceHScrollPager";
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        C14360o3.A0F(str2);
                                                        throw C00O.createAndThrow();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                C14360o3.A0F("presenceHScrollPager");
                                throw C00O.createAndThrow();
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final KYZ A00(C45128JyU c45128JyU, KCU kcu) {
        C69800Vvm c69800Vvm = kcu.A0g;
        if (c69800Vvm == null) {
            C14360o3.A0F("mapViewController");
            throw C00O.createAndThrow();
        }
        ULQ A04 = c69800Vvm.A04(c45128JyU);
        if (!(A04 instanceof KYZ)) {
            return null;
        }
        return (KYZ) A04;
    }

    public static final void A01(Drawable drawable, KCU kcu, Integer num, int i) {
        Drawable drawable2;
        String str;
        CardView cardView = kcu.A08;
        if (cardView == null) {
            str = "locationSharingPill";
        } else {
            TextView textView = kcu.A04;
            if (textView == null) {
                str = "locationSharingPillText";
            } else {
                IgImageView igImageView = kcu.A0U;
                if (igImageView == null) {
                    str = "locationSharingPillImage";
                } else {
                    String A0q = AbstractC166997dE.A0q(AbstractC166997dE.A0N(kcu), i);
                    cardView.setCardBackgroundColor(AbstractC167007dF.A09(kcu.requireContext(), R.attr.igds_color_primary_background));
                    int A09 = AbstractC167007dF.A09(kcu.requireContext(), R.attr.igds_color_primary_text);
                    textView.setTextColor(A09);
                    textView.setText(A0q);
                    if (drawable == null) {
                        if (num != null && (drawable2 = kcu.requireContext().getDrawable(num.intValue())) != null && (drawable = drawable2.mutate()) != null) {
                            drawable.setTint(A09);
                        } else {
                            return;
                        }
                    }
                    igImageView.setImageDrawable(drawable);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A02(KCU kcu, int i) {
        ReboundViewPager reboundViewPager = kcu.A0W;
        if (reboundViewPager != null) {
            if (reboundViewPager.getCurrentDataIndex() != i) {
                ReboundViewPager reboundViewPager2 = kcu.A0W;
                if (reboundViewPager2 != null) {
                    ReboundViewPager.A05(reboundViewPager2, 0.0d, i, true);
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F("quickEmojiPager");
        throw C00O.createAndThrow();
    }

    public static final void A03(KCU kcu, java.util.Set set, boolean z) {
        C69800Vvm c69800Vvm = kcu.A0g;
        if (c69800Vvm != null) {
            if (z) {
                set = AbstractC103614ld.A03(set);
            }
            c69800Vvm.A0F(set);
            C69800Vvm c69800Vvm2 = kcu.A0g;
            if (c69800Vvm2 != null) {
                c69800Vvm2.A08();
                return;
            }
        }
        C14360o3.A0F("mapViewController");
        throw C00O.createAndThrow();
    }

    public final void A04(Map map) {
        C69800Vvm c69800Vvm = this.A0g;
        if (c69800Vvm != null) {
            java.util.Set A06 = c69800Vvm.A06();
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : A06) {
                if (((C45128JyU) obj).A05 == null) {
                    A1E.add(obj);
                }
            }
            C69800Vvm c69800Vvm2 = this.A0g;
            if (c69800Vvm2 != null) {
                java.util.Set A062 = c69800Vvm2.A06();
                ArrayList A1E2 = AbstractC166987dD.A1E();
                for (Object obj2 : A062) {
                    if (((C45128JyU) obj2).A05 != null) {
                        A1E2.add(obj2);
                    }
                }
                LinkedHashMap A1I = AbstractC166987dD.A1I();
                Iterator A15 = AbstractC166997dE.A15(map);
                while (A15.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A15);
                    ArrayList A0q = AbstractC167017dG.A0q(A1E);
                    Iterator it = A1E.iterator();
                    while (it.hasNext()) {
                        AbstractC31173DnH.A1X(AbstractC43592JPx.A0j(it).A06, A0q);
                    }
                    if (A0q.contains(A1K.getKey())) {
                        AbstractC31177DnL.A1S(A1K, A1I);
                    }
                }
                LinkedHashMap A1I2 = AbstractC166987dD.A1I();
                Iterator it2 = A1E2.iterator();
                while (it2.hasNext()) {
                    C45128JyU A0j = AbstractC43592JPx.A0j(it2);
                    String str = A0j.A0A;
                    if (map.containsKey(str)) {
                        AbstractC43592JPx.A1V(A0j, AbstractC25232BEp.A0t(AbstractC37300Gc1.A0Q(str, map)), A1I2);
                    }
                }
                InterfaceC09390do interfaceC09390do = this.A0n;
                LLR A0i = AbstractC43592JPx.A0i(interfaceC09390do);
                C135976Dc A01 = AbstractC135966Db.A01(A0i.A01);
                Iterator A14 = AbstractC166997dE.A14(A1I2);
                while (A14.hasNext()) {
                    Map.Entry A1K2 = AbstractC166987dD.A1K(A14);
                    C45128JyU c45128JyU = (C45128JyU) A1K2.getKey();
                    long A0N = AbstractC166987dD.A0N(A1K2.getValue());
                    String str2 = c45128JyU.A0A;
                    if (c45128JyU.A05 != null && str2 != null) {
                        A0i.A0B(A01, c45128JyU, A0N, false);
                    }
                }
                LLR A0i2 = AbstractC43592JPx.A0i(interfaceC09390do);
                Iterator A142 = AbstractC166997dE.A14(A1I);
                while (A142.hasNext()) {
                    Map.Entry A1K3 = AbstractC166987dD.A1K(A142);
                    A0i2.A09(AbstractC166987dD.A0N(A1K3.getValue()), (String) A1K3.getKey(), false);
                }
                return;
            }
        }
        C14360o3.A0F("mapViewController");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x005c, code lost:
    
        if ((!r14.A0C) != false) goto L10;
     */
    @Override // X.InterfaceC71982XDr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ X.ULQ ALe(X.C71196Wpl r17, X.InterfaceC72044XLa r18, X.C70394WTw r19) {
        /*
            r16 = this;
            r14 = r18
            X.JyU r14 = (X.C45128JyU) r14
            r1 = 2
            X.C14360o3.A0B(r14, r1)
            r2 = r16
            X.0do r0 = r2.A0o
            com.instagram.common.session.UserSession r3 = X.AbstractC166987dD.A0r(r0)
            X.0eR r10 = r2.mLifecycleRegistry
            X.C14360o3.A07(r10)
            X.L95 r5 = r2.A0c
            if (r5 != 0) goto L23
            java.lang.String r0 = "mapCoordinator"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L23:
            X.KXn r6 = X.AbstractC43593JPy.A0e(r2)
            X.0do r0 = r2.A0n
            X.LLR r4 = X.AbstractC43592JPx.A0i(r0)
            r0 = 30
            X.MLh r7 = new X.MLh
            r7.<init>(r2, r0)
            r0 = 31
            X.MLh r8 = new X.MLh
            r8.<init>(r2, r0)
            X.C14360o3.A0B(r3, r1)
            r0 = 7
            X.AbstractC167007dF.A1I(r6, r0, r4)
            android.content.Context r9 = r2.getContext()
            r12 = r19
            if (r9 == 0) goto L61
            X.L4c r1 = new X.L4c
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            X.KYZ r8 = new X.KYZ
            r11 = r17
            r13 = r3
            r15 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = r14.A0C
            r0 = r0 ^ 1
            if (r0 == 0) goto L61
        L5e:
            X.ULQ r8 = (X.ULQ) r8
            return r8
        L61:
            X.KYX r8 = new X.KYX
            r8.<init>(r12, r14)
            goto L5e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KCU.ALe(X.Wpl, X.XLa, X.WTw):X.ULQ");
    }

    @Override // X.InterfaceC71982XDr
    public final Map Aom() {
        C69800Vvm c69800Vvm = this.A0g;
        if (c69800Vvm == null) {
            C14360o3.A0F("mapViewController");
            throw C00O.createAndThrow();
        }
        java.util.Set A06 = c69800Vvm.A06();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(AbstractC06950Ym.A1E(A06, 10)));
        Iterator it = A06.iterator();
        while (it.hasNext()) {
            A18.put(it.next(), "friend_map_notes_cluster");
        }
        return AbstractC06930Yk.A03(A18);
    }

    @Override // X.InterfaceC71981XDq
    public final Location AuY(C69717VuC c69717VuC, String str) {
        C45999KXn A0e = AbstractC43593JPy.A0e(this);
        String A0R = AnonymousClass001.A0R("FriendMapFragment:", "CurrentLocationDrawable");
        C14360o3.A0B(A0R, 0);
        C1VW c1vw = A0e.A08;
        if (c1vw != null) {
            return c1vw.getLastLocation(A0e.A02, AnonymousClass001.A0R("FriendMapViewModel:", A0R));
        }
        return null;
    }

    @Override // X.InterfaceC71981XDq
    public final /* bridge */ /* synthetic */ InterfaceC72044XLa BgP() {
        return null;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0o);
    }

    @Override // X.InterfaceC71982XDr
    public final int Aol() {
        return (int) (Math.max(AbstractC44198Jg1.A02(requireContext()), AbstractC44198Jg1.A01(requireContext())) * ((Number) C17s.A09(Double.valueOf(C18U.A00(C06090Tz.A05, AbstractC31178DnM.A0M(this.A0o), 37166147308880298L)), new M9M(0.1d))).doubleValue());
    }

    @Override // X.InterfaceC71980XDp
    public final void D1Y(LatLng latLng, boolean z) {
        C45999KXn A0e = AbstractC43593JPy.A0e(this);
        AbstractC47449Kxe A00 = C45293K2v.A00(A0e);
        if (A00 instanceof C46003KXr) {
            AnonymousClass195 anonymousClass195 = A0e.A01;
            if (anonymousClass195 != null) {
                anonymousClass195.AGH(null);
            }
            if (!z) {
                A0e.A0O(new MIF(16, null, A00, A0e, false));
                A0e.A01 = AbstractC47032Kqp.A00(A0e, new MC4(latLng, A0e, null, 46), 450L);
                return;
            }
        } else {
            if (!(A00 instanceof C46001KXp)) {
                return;
            }
            A0e.A0M(new C49461LtZ(latLng, null));
            if (!z) {
                A0e.A0O(new BQB(17, A00, null, false));
                return;
            }
        }
        C45999KXn.A0A(latLng, A0e);
    }

    @Override // X.InterfaceC71980XDp
    public final void DZl(C69800Vvm c69800Vvm, C69021Vfx c69021Vfx) {
        AbstractC43593JPy.A0e(this).A07.A01 = c69021Vfx;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C45999KXn A0e = AbstractC43593JPy.A0e(this);
        AbstractC47449Kxe A00 = C45293K2v.A00(A0e);
        if (A00 instanceof C46002KXq) {
            C45999KXn.A0C(C46004KXs.A00, A0e);
            A0e.A0M(new C49459LtX(1.5f));
            C45999KXn.A0F(A0e, 400L);
            return true;
        }
        if (A00 instanceof C46003KXr) {
            AnonymousClass195 anonymousClass195 = A0e.A01;
            if (anonymousClass195 != null) {
                anonymousClass195.AGH(null);
            }
            A0e.A0Z(true, null);
            C45999KXn.A05(C45999KXn.A01(A0e), A0e, 15.0f, 150L, true, false, false);
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Integer num;
        int A02 = C0f9.A02(663367215);
        super.onCreate(bundle);
        this.A0X = (FriendMapLaunchConfig) requireArguments().getParcelable("arg_friend_map_launch_config");
        AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A0o);
        C14360o3.A0B(A0o, 0);
        C48509Ld0 c48509Ld0 = (C48509Ld0) A0o.A01(C48509Ld0.class, C50228MGj.A00);
        FriendMapLaunchConfig friendMapLaunchConfig = this.A0X;
        if (friendMapLaunchConfig != null) {
            num = friendMapLaunchConfig.A09;
        } else {
            num = null;
        }
        c48509Ld0.A02 = "";
        Integer num2 = C05F.A0j;
        c48509Ld0.A00 = num2;
        if (num == null) {
            num = num2;
        }
        c48509Ld0.A00 = num;
        c48509Ld0.A02 = AbstractC166997dE.A0n();
        c48509Ld0.A01 = null;
        LLR A0i = AbstractC43592JPx.A0i(this.A0n);
        LLR.A04(null, A0i, null, null, A0i.A02.A00, "MAP_VIEW", "IMPRESSION", null);
        this.A0i = Integer.valueOf(AbstractC56402iY.A00(requireActivity()));
        this.A0k = new C48574LeB(this.A0l, this, this);
        if (getActivity() != null) {
            Window A0H = AbstractC31174DnI.A0H(this);
            C14360o3.A07(A0H);
            AbstractC56402iY.A08(A0H, true);
            AbstractC56402iY.A02(requireActivity(), 0);
        }
        C0f9.A09(-1094684733, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(781849920);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.friend_map_layout, viewGroup, false);
        this.A0j = (IgFrameLayout) inflate.findViewById(R.id.map_container);
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do = this.A0o;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        IgFrameLayout igFrameLayout = this.A0j;
        String str = "mapContainer";
        if (igFrameLayout != null) {
            C69800Vvm c69800Vvm = new C69800Vvm(requireContext, igFrameLayout, A0r, this, this, this, "friend_map", C1H6.A03());
            c69800Vvm.A0D(bundle);
            this.A0g = c69800Vvm;
            Context requireContext2 = requireContext();
            UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
            C69800Vvm c69800Vvm2 = this.A0g;
            if (c69800Vvm2 == null) {
                str = "mapViewController";
            } else {
                this.A0c = new L95(requireContext2, A0r2, c69800Vvm2, C50248MHd.A01(this, 19));
                this.A0d = new L90(requireActivity(), this, AbstractC166987dD.A0r(interfaceC09390do), AbstractC43593JPy.A0e(this));
                int A07 = AbstractC25225BEi.A07(C06090Tz.A05, AbstractC25230BEn.A0k(interfaceC09390do, 0), 36603197355332500L);
                if (A07 > 10) {
                    A07 = 10;
                }
                IgFrameLayout igFrameLayout2 = this.A0j;
                if (igFrameLayout2 != null) {
                    this.A0Y = new M9u(igFrameLayout2, this, AbstractC166987dD.A0r(interfaceC09390do), A07);
                    C0f9.A09(-942097138, A02);
                    return inflate;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ViewGroup viewGroup;
        ULR ulr;
        String str;
        int A02 = C0f9.A02(-1605752042);
        super.onDestroyView();
        C48574LeB c48574LeB = this.A0k;
        ViewParent viewParent = null;
        if (c48574LeB == null) {
            str = "friendMapViewpointHelper";
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            c48574LeB.A05.clear();
            Map map = c48574LeB.A04;
            map.clear();
            java.util.Set set = c48574LeB.A06;
            set.clear();
            Map map2 = c48574LeB.A03;
            Iterator A15 = AbstractC166997dE.A15(map2);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                Object key = A1K.getKey();
                long A0N = AbstractC166987dD.A0N(A1K.getValue());
                if (!set.contains(key)) {
                    AbstractC43592JPx.A1V(key, currentTimeMillis - A0N, map);
                }
            }
            map2.clear();
            c48574LeB.A01.A04(map);
            this.A0l.A04(this.mView);
            C69800Vvm c69800Vvm = this.A0g;
            if (c69800Vvm == null) {
                str = "mapViewController";
            } else {
                c69800Vvm.A04.A00();
                C69717VuC c69717VuC = c69800Vvm.A01;
                if (c69717VuC != null && (ulr = c69717VuC.A04) != null) {
                    ulr.A08();
                }
                QuickSnapReactionEmitterView quickSnapReactionEmitterView = this.A0h;
                if (quickSnapReactionEmitterView != null) {
                    quickSnapReactionEmitterView.A01();
                }
                QuickSnapReactionEmitterView quickSnapReactionEmitterView2 = this.A0h;
                if (quickSnapReactionEmitterView2 != null) {
                    viewParent = quickSnapReactionEmitterView2.getParent();
                }
                if ((viewParent instanceof ViewGroup) && (viewGroup = (ViewGroup) viewParent) != null) {
                    viewGroup.removeView(this.A0h);
                }
                C0f9.A09(72646042, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1189058173);
        super.onPause();
        C69800Vvm c69800Vvm = this.A0g;
        if (c69800Vvm == null) {
            C14360o3.A0F("mapViewController");
            throw C00O.createAndThrow();
        }
        if (c69800Vvm.A04.A01 != null) {
            MapboxTTRC.cancel("maps_perf_logger_on_pause");
        }
        C0f9.A09(-1472609760, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1140694190);
        super.onResume();
        AbstractC56402iY.A02(requireActivity(), 0);
        C69800Vvm c69800Vvm = this.A0g;
        if (c69800Vvm == null) {
            C14360o3.A0F("mapViewController");
            throw C00O.createAndThrow();
        }
        c69800Vvm.A04.A01();
        C0f9.A09(1175842009, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-192679431);
        super.onStart();
        C69800Vvm c69800Vvm = this.A0g;
        if (c69800Vvm == null) {
            C14360o3.A0F("mapViewController");
            throw C00O.createAndThrow();
        }
        c69800Vvm.A04.A02();
        if (getActivity() != null) {
            Window A0H = AbstractC31174DnI.A0H(this);
            C14360o3.A07(A0H);
            AbstractC56402iY.A08(A0H, true);
            AbstractC56402iY.A02(requireActivity(), 0);
        }
        C0f9.A09(238788178, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-1576233794);
        super.onStop();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Window window = activity.getWindow();
            C14360o3.A07(window);
            AbstractC56402iY.A08(window, false);
            Integer num = this.A0i;
            if (num != null) {
                AbstractC56402iY.A02(getActivity(), num.intValue());
            }
        }
        if (this.A0g == null) {
            C14360o3.A0F("mapViewController");
            throw C00O.createAndThrow();
        }
        C0f9.A09(2131528553, A02);
    }
}
