package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.mediaactions.LikeActionView;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;

/* renamed from: X.6e7, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6e7 implements C6e1 {
    public float A00;
    public float A01;
    public Drawable A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public View A0B;
    public View A0C;
    public View A0D;
    public View A0E;
    public View A0F;
    public View A0G;
    public View A0H;
    public View A0I;
    public View A0J;
    public View A0K;
    public View A0L;
    public View A0M;
    public View A0N;
    public View A0O;
    public View A0P;
    public View A0Q;
    public View A0R;
    public ImageView A0S;
    public TextView A0T;
    public TextView A0U;
    public TextView A0V;
    public TextView A0W;
    public TextView A0X;
    public TextView A0Y;
    public TextView A0Z;
    public TextView A0a;
    public TextView A0b;
    public TextView A0c;
    public TextView A0d;
    public TextView A0e;
    public TextView A0f;
    public TextView A0g;
    public IgTextView A0h;
    public IgImageView A0i;
    public C41181vS A0j;
    public C41551w4 A0k;
    public C50561MTs A0l;
    public C141596ac A0m;
    public C6b8 A0n;
    public OC8 A0o;
    public C143746eH A0p;
    public XEX A0q;
    public final int A0r;
    public final int A0s;
    public final int A0t;
    public final int A0u;
    public final Resources A0v;
    public final Drawable A0w;
    public final View A0x;
    public final View A0y;
    public final View A0z;
    public final View A10;
    public final View A11;
    public final ViewGroup A12;
    public final ViewStub A13;
    public final ViewStub A14;
    public final ViewStub A15;
    public final ViewStub A16;
    public final ViewStub A17;
    public final ViewStub A18;
    public final ViewStub A19;
    public final ViewStub A1A;
    public final ViewStub A1B;
    public final ViewStub A1C;
    public final ViewStub A1D;
    public final ViewStub A1E;
    public final ViewStub A1F;
    public final ViewStub A1G;
    public final ViewStub A1H;
    public final ViewStub A1I;
    public final ViewStub A1J;
    public final TextView A1K;
    public final TextView A1L;
    public final ConstraintLayout A1M;
    public final C3W9 A1N;
    public final UserSession A1O;
    public final C57012jc A1P;
    public final C57012jc A1Q;
    public final C57012jc A1R;
    public final C57012jc A1S;
    public final C57012jc A1T;
    public final C57012jc A1U;
    public final C57012jc A1V;
    public final InterfaceC56392iX A1W;
    public final InterfaceC56392iX A1X;
    public final InterfaceC56392iX A1Y;
    public final InterfaceC56392iX A1Z;
    public final InterfaceC56392iX A1a;
    public final InterfaceC56392iX A1b;
    public final InterfaceC56392iX A1c;
    public final InterfaceC56392iX A1d;
    public final InterfaceC56392iX A1e;
    public final InterfaceC56392iX A1f;
    public final InterfaceC56392iX A1g;
    public final InterfaceC56392iX A1h;
    public final InterfaceC56392iX A1i;
    public final C143706eD A1j;
    public final C143676eA A1k;
    public final C143696eC A1l;
    public final C143736eG A1m;
    public final ViewOnAttachStateChangeListenerC143666e9 A1n;
    public final C6e8 A1o;
    public final C143716eE A1p;

    public C6e7(ViewStub viewStub, ConstraintLayout constraintLayout, UserSession userSession, LikeActionView likeActionView) {
        ViewStub viewStub2;
        ViewStub viewStub3;
        ViewStub viewStub4;
        ViewStub viewStub5;
        ViewStub viewStub6;
        ViewStub viewStub7;
        ViewStub viewStub8;
        ViewStub viewStub9;
        C14360o3.A0B(constraintLayout, 1);
        C14360o3.A0B(viewStub, 2);
        C14360o3.A0B(likeActionView, 3);
        this.A1O = userSession;
        this.A00 = 1.0f;
        this.A1M = constraintLayout;
        Resources resources = constraintLayout.getResources();
        this.A0v = resources;
        Context context = constraintLayout.getContext();
        Drawable drawable = context.getDrawable(R.drawable.viewers_icon);
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.A0w = mutate;
            mutate.setColorFilter(C3DY.A00(context.getColor(R.color.design_dark_default_color_on_background)));
            this.A0r = resources.getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
            this.A0t = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
            this.A0s = resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
            resources.getDimensionPixelSize(R.dimen.caption_overlay_offset_with_social_bubble);
            this.A0u = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
            this.A11 = constraintLayout.requireViewById(R.id.viewer_reel_item_toolbar_container);
            this.A10 = constraintLayout.requireViewById(R.id.toolbar_buttons_container);
            this.A0z = constraintLayout.requireViewById(R.id.self_reel_item_toolbar_container);
            this.A1d = AbstractC56372iV.A01(constraintLayout.requireViewById(R.id.toolbar_menu_button_stub), !AbstractC25351Lp.A00(userSession).A01(), false);
            this.A1W = AbstractC56372iV.A01(constraintLayout.requireViewById(R.id.self_toolbar_add_mention_button_stub), !AbstractC25351Lp.A00(userSession).A01(), false);
            this.A0y = constraintLayout.requireViewById(R.id.self_toolbar_menu_button);
            this.A1h = AbstractC56372iV.A01(constraintLayout.requireViewById(R.id.self_toolbar_menu_button_label_stub), !AbstractC25351Lp.A00(userSession).A01(), false);
            this.A1f = AbstractC56372iV.A01(constraintLayout.requireViewById(R.id.toolbar_reshare_button_stub), !AbstractC25351Lp.A00(userSession).A01(), false);
            this.A1i = AbstractC56372iV.A01(constraintLayout.requireViewById(R.id.toolbar_spinner_stub), !AbstractC25351Lp.A00(userSession).A01(), false);
            this.A1Y = AbstractC56372iV.A01(constraintLayout.requireViewById(R.id.viewer_ar_effect_try_it_text_stub), !AbstractC25351Lp.A00(userSession).A01(), false);
            this.A1X = AbstractC56372iV.A01(constraintLayout.requireViewById(R.id.viewer_ar_effect_see_details_text_stub), !AbstractC25351Lp.A00(userSession).A01(), false);
            this.A1g = AbstractC56372iV.A01(constraintLayout.requireViewById(R.id.toolbar_save_button_stub), AbstractC25351Lp.A00(userSession).A01(), false);
            this.A1A = (ViewStub) constraintLayout.requireViewById(R.id.toolbar_link_button_stub);
            this.A1E = (ViewStub) constraintLayout.requireViewById(R.id.toolbar_share_to_link_button_stub);
            this.A1B = (ViewStub) constraintLayout.requireViewById(R.id.my_week_highlight_button_stub);
            this.A19 = (ViewStub) constraintLayout.requireViewById(R.id.toolbar_highlights_button_stub);
            View findViewById = constraintLayout.findViewById(R.id.toolbar_facebook_share_button_stub);
            if (findViewById instanceof ViewStub) {
                viewStub2 = (ViewStub) findViewById;
            } else {
                viewStub2 = null;
            }
            this.A1S = new C57012jc(viewStub2);
            View findViewById2 = constraintLayout.findViewById(R.id.toolbar_whatsapp_share_button_stub);
            if (findViewById2 instanceof ViewStub) {
                viewStub3 = (ViewStub) findViewById2;
            } else {
                viewStub3 = null;
            }
            this.A1V = new C57012jc(viewStub3);
            View findViewById3 = constraintLayout.findViewById(R.id.toolbar_share_on_button_stub);
            if (findViewById3 instanceof ViewStub) {
                viewStub4 = (ViewStub) findViewById3;
            } else {
                viewStub4 = null;
            }
            this.A1U = new C57012jc(viewStub4);
            this.A1C = (ViewStub) constraintLayout.requireViewById(R.id.toolbar_promote_button_stub);
            this.A1J = (ViewStub) constraintLayout.requireViewById(R.id.viewers_facepile_button_stub);
            this.A16 = (ViewStub) constraintLayout.requireViewById(R.id.toolbar_archive_share_button_stub);
            this.A15 = (ViewStub) constraintLayout.requireViewById(R.id.toolbar_archive_reshare_button_stub);
            this.A13 = (ViewStub) constraintLayout.requireViewById(R.id.toolbar_archive_context_button_stub);
            this.A14 = (ViewStub) constraintLayout.requireViewById(R.id.toolbar_archive_location_context_button_stub);
            this.A1G = (ViewStub) constraintLayout.requireViewById(R.id.toolbar_story_highlight_to_reel_button_stub);
            this.A1F = (ViewStub) constraintLayout.requireViewById(R.id.toolbar_story_highlight_post_to_grid_button_stub);
            this.A18 = (ViewStub) constraintLayout.requireViewById(R.id.toolbar_create_from_story_button_stub);
            View requireViewById = constraintLayout.requireViewById(R.id.cta_button_container);
            C14360o3.A07(requireViewById);
            this.A1o = new C6e8(requireViewById, userSession);
            TextView textView = (TextView) constraintLayout.requireViewById(R.id.toolbar_text);
            this.A1L = textView;
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            this.A1n = new ViewOnAttachStateChangeListenerC143666e9(textView, AbstractC56372iV.A01(constraintLayout.requireViewById(R.id.circular_progress_bar_stub), false, false));
            this.A0x = constraintLayout.requireViewById(R.id.message_composer_container);
            this.A1K = (TextView) constraintLayout.requireViewById(R.id.composer_text);
            this.A17 = (ViewStub) constraintLayout.requireViewById(R.id.composer_camera_button_stub);
            View findViewById4 = constraintLayout.findViewById(R.id.composer_text_active_now_stub);
            if (findViewById4 instanceof ViewStub) {
                viewStub5 = (ViewStub) findViewById4;
            } else {
                viewStub5 = null;
            }
            this.A1Q = new C57012jc(viewStub5);
            View findViewById5 = constraintLayout.findViewById(R.id.composer_text_avatar_stub);
            if (findViewById5 instanceof ViewStub) {
                viewStub6 = (ViewStub) findViewById5;
            } else {
                viewStub6 = null;
            }
            this.A1R = new C57012jc(viewStub6);
            this.A1b = AbstractC56372iV.A01(constraintLayout.requireViewById(R.id.composer_ai_animation_stub), false, false);
            this.A1c = AbstractC56372iV.A01(constraintLayout.requireViewById(R.id.composer_reaction_animation_stub), false, false);
            this.A1e = AbstractC56372iV.A01(constraintLayout.requireViewById(R.id.reel_item_reaction_animation_above_toolbar_stub), false, false);
            View findViewById6 = constraintLayout.findViewById(R.id.reel_item_action_button_stub);
            if (findViewById6 instanceof ViewStub) {
                viewStub7 = (ViewStub) findViewById6;
            } else {
                viewStub7 = null;
            }
            this.A1k = new C143676eA(new C57012jc(viewStub7));
            View requireViewById2 = constraintLayout.requireViewById(R.id.reel_item_mention_reshare_button_stub);
            C14360o3.A07(requireViewById2);
            this.A1l = new C143696eC((ViewStub) requireViewById2);
            View requireViewById3 = constraintLayout.requireViewById(R.id.reel_item_group_mention_button_stub);
            C14360o3.A07(requireViewById3);
            this.A1j = new C143706eD((ViewStub) requireViewById3);
            View requireViewById4 = constraintLayout.requireViewById(R.id.reel_swipe_up_instructions_stub);
            C14360o3.A07(requireViewById4);
            this.A1p = new C143716eE((ViewStub) requireViewById4);
            View requireViewById5 = constraintLayout.requireViewById(R.id.reel_item_share_to_friends_story_producer_likes_stub);
            C14360o3.A07(requireViewById5);
            this.A1m = new C143736eG((ViewStub) requireViewById5);
            View requireViewById6 = constraintLayout.requireViewById(R.id.reel_branded_content_violation_banner);
            C14360o3.A07(requireViewById6);
            ViewStub viewStub10 = (ViewStub) requireViewById6;
            C14360o3.A0B(viewStub10, 0);
            this.A1N = new C3W9(viewStub10);
            View requireViewById7 = constraintLayout.requireViewById(R.id.toolbar_like_container);
            this.A0A = requireViewById7;
            View requireViewById8 = requireViewById7.requireViewById(R.id.toolbar_like_button);
            C14360o3.A07(requireViewById8);
            IgBouncyUfiButtonImageView igBouncyUfiButtonImageView = (IgBouncyUfiButtonImageView) requireViewById8;
            InterfaceC56392iX A01 = AbstractC56372iV.A01(this.A0A.requireViewById(R.id.toolbar_like_button_outline_animation_stub), !AbstractC25351Lp.A00(userSession).A01(), false);
            C14360o3.A0B(igBouncyUfiButtonImageView, 1);
            this.A0n = new C6b8(viewStub, userSession, A01, likeActionView, igBouncyUfiButtonImageView, true);
            View findViewById7 = constraintLayout.findViewById(R.id.toolbar_add_to_story_button_stub);
            if (findViewById7 instanceof ViewStub) {
                viewStub8 = (ViewStub) findViewById7;
            } else {
                viewStub8 = null;
            }
            this.A1P = new C57012jc(viewStub8);
            View findViewById8 = constraintLayout.findViewById(R.id.toolbar_self_add_to_story_button_stub);
            if (findViewById8 instanceof ViewStub) {
                viewStub9 = (ViewStub) findViewById8;
            } else {
                viewStub9 = null;
            }
            this.A1T = new C57012jc(viewStub9);
            this.A12 = (ViewGroup) constraintLayout.requireViewById(R.id.media_overlay_cta_banner_container);
            this.A1D = (ViewStub) constraintLayout.requireViewById(R.id.self_toolbar_reshare_button_stub);
            View requireViewById9 = constraintLayout.requireViewById(R.id.toolbar_comment_button);
            C14360o3.A0C(requireViewById9, "null cannot be cast to non-null type android.view.ViewStub");
            ViewStub viewStub11 = (ViewStub) requireViewById9;
            viewStub11.setLayoutResource(C18U.A06(C06090Tz.A05, this.A1O, 36318221981718579L) ? R.layout.reel_viewer_message_comment_brand_change_button : R.layout.reel_viewer_message_comment_button);
            this.A1Z = AbstractC56372iV.A01(viewStub11, false, false);
            this.A1a = AbstractC56372iV.A01(constraintLayout.requireViewById(R.id.story_comment_composer_stub), false, false);
            this.A1I = (ViewStub) constraintLayout.requireViewById(R.id.toolbar_superlative_share_button_stub);
            this.A1H = (ViewStub) constraintLayout.requireViewById(R.id.toolbar_superlative_send_button_stub);
            View requireViewById10 = constraintLayout.requireViewById(R.id.cta_shuffle_button_container);
            C14360o3.A07(requireViewById10);
            View requireViewById11 = constraintLayout.requireViewById(R.id.cta_shuffle_button_dwell_container);
            C14360o3.A07(requireViewById11);
            C143746eH c143746eH = new C143746eH((ViewStub) requireViewById10, (ViewStub) requireViewById11, userSession);
            this.A0p = c143746eH;
            ImageView imageView = c143746eH.A05;
            if (imageView != null) {
                imageView.setImageDrawable(c143746eH.A09);
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A00() {
        LinearLayout linearLayout;
        float min = Math.min(this.A00, 1.0f - this.A01);
        this.A11.setAlpha(min);
        this.A0z.setAlpha(min);
        OC8 oc8 = this.A0o;
        if (oc8 != null && (linearLayout = oc8.A02) != null) {
            linearLayout.setAlpha(min);
        }
        this.A1o.A04.setAlpha(min);
        TextView textView = this.A1k.A01;
        if (textView != null) {
            textView.setAlpha(min);
        }
        View view = this.A1l.A00;
        if (view != null) {
            view.setAlpha(min);
        }
        IgImageView igImageView = this.A1j.A00;
        if (igImageView != null) {
            igImageView.setAlpha(min);
        }
        this.A1N.A00().setAlpha(min);
    }

    @Override // X.C6e1
    public final XEX AjV() {
        XEX xex = this.A0q;
        if (xex == null) {
            xex = new C65724Tsy(this.A1o);
            this.A0q = xex;
        }
        xex.EcI(this.A0m);
        return xex;
    }
}
