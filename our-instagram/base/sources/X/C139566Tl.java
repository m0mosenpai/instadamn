package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.reels.ui.badge.ReelBrandingBadgeView;

/* renamed from: X.6Tl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139566Tl {
    public ImageView A00;
    public ReelBrandingBadgeView A01;
    public L0N A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final View A07;
    public final View A08;
    public final ViewStub A09;
    public final ViewStub A0A;
    public final TextView A0B;
    public final TextView A0C;
    public final TextView A0D;
    public final IgSimpleImageView A0E;
    public final IgImageView A0F;
    public final C139576Tm A0G;
    public final C139456Ta A0H;
    public final C139586Tn A0I;

    public C139566Tl(View view, View view2) {
        this.A04 = view;
        this.A03 = view2;
        View requireViewById = view.requireViewById(R.id.profile_picture_container);
        C14360o3.A07(requireViewById);
        this.A06 = requireViewById;
        View requireViewById2 = view.requireViewById(R.id.reel_viewer_profile_picture);
        C14360o3.A07(requireViewById2);
        this.A0F = (IgImageView) requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.reel_viewer_icon_image_view);
        C14360o3.A07(requireViewById3);
        this.A0E = (IgSimpleImageView) requireViewById3;
        View requireViewById4 = view.requireViewById(R.id.reel_viewer_profile_facepile_stub);
        C14360o3.A07(requireViewById4);
        this.A0A = (ViewStub) requireViewById4;
        View requireViewById5 = view.requireViewById(R.id.branding_badge_stub);
        C14360o3.A07(requireViewById5);
        this.A09 = (ViewStub) requireViewById5;
        View requireViewById6 = view.requireViewById(R.id.reel_viewer_text_container);
        C14360o3.A07(requireViewById6);
        this.A07 = requireViewById6;
        View requireViewById7 = view.requireViewById(R.id.reel_viewer_title);
        C14360o3.A07(requireViewById7);
        this.A0C = (TextView) requireViewById7;
        View requireViewById8 = view.requireViewById(R.id.reel_viewer_multi_ad_carousel_additional_text);
        C14360o3.A07(requireViewById8);
        this.A0B = (TextView) requireViewById8;
        View requireViewById9 = view.requireViewById(R.id.reel_viewer_title_brand_survey);
        C14360o3.A07(requireViewById9);
        this.A0D = (TextView) requireViewById9;
        View requireViewById10 = view.requireViewById(R.id.reel_viewer_subtitle);
        C14360o3.A07(requireViewById10);
        this.A0G = new C139576Tm((TextView) requireViewById10);
        View requireViewById11 = view.requireViewById(R.id.video_loading_spinner);
        C14360o3.A07(requireViewById11);
        this.A08 = requireViewById11;
        View requireViewById12 = view.requireViewById(R.id.header_menu_button);
        C14360o3.A07(requireViewById12);
        this.A05 = requireViewById12;
        Integer num = C05F.A0C;
        this.A0I = new C139586Tn(AbstractC56372iV.A01(view.requireViewById(R.id.social_context_stub), false, false), num);
        this.A0H = new C139456Ta(AbstractC56372iV.A01(view.requireViewById(R.id.popularity_proof_stub), false, false), num);
    }
}
