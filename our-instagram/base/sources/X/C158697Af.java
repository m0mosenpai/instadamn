package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;
import com.instagram.xme.threed.view.IgGltfSceneLayoutView;

/* renamed from: X.7Af, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C158697Af extends C3OO implements C7QD, C7QE, InterfaceC1581778c {
    public C47349Kvy A00;
    public L7B A01;
    public C7QH A02;
    public final FrameLayout A03;
    public final ImageView A04;
    public final ImageView A05;
    public final ImageView A06;
    public final ImageView A07;
    public final TextView A08;
    public final TextView A09;
    public final ConstraintLayout A0A;
    public final ConstraintLayout A0B;
    public final C57012jc A0C;
    public final C57012jc A0D;
    public final C57012jc A0E;
    public final C57012jc A0F;
    public final C57012jc A0G;
    public final C57012jc A0H;
    public final C57012jc A0I;
    public final C57012jc A0J;
    public final C57012jc A0K;
    public final C57012jc A0L;
    public final C57012jc A0M;
    public final C57012jc A0N;
    public final C57012jc A0O;
    public final C57012jc A0P;
    public final InterfaceC56392iX A0Q;
    public final InterfaceC56392iX A0R;
    public final InterfaceC56392iX A0S;
    public final InterfaceC56392iX A0T;
    public final C158707Ag A0U;
    public final IgProgressImageView A0V;
    public final RoundedCornerMediaFrameLayout A0W;
    public final IgGltfSceneLayoutView A0X;
    public final InterfaceC09390do A0Y;
    public final InterfaceC09390do A0Z;
    public final InterfaceC09390do A0a;
    public final InterfaceC09390do A0b;
    public final InterfaceC09390do A0c;
    public final ImageView A0d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v24, types: [X.2jc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [X.2jc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [X.2jc, java.lang.Object] */
    public C158697Af(View view, UserSession userSession) {
        super(view);
        ViewStub viewStub;
        ViewStub viewStub2;
        ViewStub viewStub3;
        ViewStub viewStub4;
        ViewStub viewStub5;
        ViewStub viewStub6;
        ViewStub viewStub7;
        ViewStub viewStub8;
        ViewStub viewStub9;
        ViewStub viewStub10;
        ViewStub viewStub11;
        C14360o3.A0B(view, 2);
        View requireViewById = view.requireViewById(R.id.message_content_portrait_xma_container);
        C14360o3.A07(requireViewById);
        this.A03 = (FrameLayout) requireViewById;
        View findViewById = view.findViewById(R.id.reel_profile_attribution_stub);
        if (findViewById instanceof ViewStub) {
            viewStub = (ViewStub) findViewById;
        } else {
            viewStub = null;
        }
        this.A0E = new C57012jc(viewStub);
        this.A0a = AbstractC09440dt.A01(new C9E8(this, 40));
        View findViewById2 = view.findViewById(R.id.legibility_gradient_header_stub);
        if (findViewById2 instanceof ViewStub) {
            viewStub2 = (ViewStub) findViewById2;
        } else {
            viewStub2 = null;
        }
        C57012jc c57012jc = new C57012jc(viewStub2);
        this.A0F = c57012jc;
        View findViewById3 = view.findViewById(R.id.placeholder_title_stub);
        if (findViewById3 instanceof ViewStub) {
            viewStub3 = (ViewStub) findViewById3;
        } else {
            viewStub3 = null;
        }
        this.A0J = new C57012jc(viewStub3);
        View findViewById4 = view.findViewById(R.id.placeholder_message_stub);
        if (findViewById4 instanceof ViewStub) {
            viewStub4 = (ViewStub) findViewById4;
        } else {
            viewStub4 = null;
        }
        this.A0I = new C57012jc(viewStub4);
        View requireViewById2 = view.requireViewById(R.id.media_constraint_layout);
        C14360o3.A07(requireViewById2);
        this.A0B = (ConstraintLayout) requireViewById2;
        View findViewById5 = view.findViewById(R.id.reel_mention_reshare_cta_button_stub);
        if (findViewById5 instanceof ViewStub) {
            viewStub5 = (ViewStub) findViewById5;
        } else {
            viewStub5 = null;
        }
        this.A0L = new C57012jc(viewStub5);
        View findViewById6 = view.findViewById(R.id.reel_padded_buttons_container);
        ?? obj = new Object();
        obj.A00 = findViewById6;
        this.A0M = obj;
        View findViewById7 = view.findViewById(R.id.reel_padded_first_button);
        ?? obj2 = new Object();
        obj2.A00 = findViewById7;
        this.A0N = obj2;
        View findViewById8 = view.findViewById(R.id.reel_padded_second_button);
        ?? obj3 = new Object();
        obj3.A00 = findViewById8;
        this.A0O = obj3;
        View requireViewById3 = view.requireViewById(R.id.media_container);
        C14360o3.A07(requireViewById3);
        this.A0W = (RoundedCornerMediaFrameLayout) requireViewById3;
        View requireViewById4 = view.requireViewById(R.id.image);
        C14360o3.A07(requireViewById4);
        IgProgressImageView igProgressImageView = (IgProgressImageView) requireViewById4;
        this.A0V = igProgressImageView;
        View requireViewById5 = view.requireViewById(R.id.gltf_scene_layout);
        C14360o3.A07(requireViewById5);
        this.A0X = (IgGltfSceneLayoutView) requireViewById5;
        this.A0S = AbstractC56372iV.A01(view.requireViewById(R.id.privacy_overlay_stub), false, false);
        View requireViewById6 = view.requireViewById(R.id.top_icon);
        C14360o3.A07(requireViewById6);
        this.A07 = (ImageView) requireViewById6;
        View requireViewById7 = view.requireViewById(R.id.bottom_icon);
        C14360o3.A07(requireViewById7);
        this.A04 = (ImageView) requireViewById7;
        View requireViewById8 = view.requireViewById(R.id.center_icon);
        C14360o3.A07(requireViewById8);
        this.A05 = (ImageView) requireViewById8;
        View findViewById9 = view.findViewById(R.id.ig_live_label_layout_stub);
        if (findViewById9 instanceof ViewStub) {
            viewStub6 = (ViewStub) findViewById9;
        } else {
            viewStub6 = null;
        }
        this.A0G = new C57012jc(viewStub6);
        View findViewById10 = view.findViewById(R.id.footer_stub);
        if (findViewById10 instanceof ViewStub) {
            viewStub7 = (ViewStub) findViewById10;
        } else {
            viewStub7 = null;
        }
        this.A0C = new C57012jc(viewStub7);
        this.A0Z = AbstractC09440dt.A01(new C9E8(this, 39));
        View findViewById11 = view.findViewById(R.id.placeholder_reel_reaction);
        if (findViewById11 instanceof ViewStub) {
            viewStub8 = (ViewStub) findViewById11;
        } else {
            viewStub8 = null;
        }
        this.A0K = new C57012jc(viewStub8);
        View findViewById12 = view.findViewById(R.id.placeholder_reel_sticker_reaction);
        if (findViewById12 instanceof ViewStub) {
            viewStub9 = (ViewStub) findViewById12;
        } else {
            viewStub9 = null;
        }
        this.A0P = new C57012jc(viewStub9);
        this.A0T = AbstractC56372iV.A01(view.requireViewById(R.id.placeholder_reel_selfie_reaction), false, false);
        View findViewById13 = view.findViewById(R.id.gradient_spinner_stub);
        if (findViewById13 instanceof ViewStub) {
            viewStub10 = (ViewStub) findViewById13;
        } else {
            viewStub10 = null;
        }
        this.A0D = new C57012jc(viewStub10);
        View findViewById14 = view.findViewById(R.id.direct_persisted_reel_label_stub);
        if (findViewById14 instanceof ViewStub) {
            viewStub11 = (ViewStub) findViewById14;
        } else {
            viewStub11 = null;
        }
        this.A0H = new C57012jc(viewStub11);
        this.A0c = AbstractC09440dt.A01(new C9E8(this, 41));
        View requireViewById9 = view.requireViewById(R.id.iconic_entrypoints_footer);
        C14360o3.A07(requireViewById9);
        this.A0A = (ConstraintLayout) requireViewById9;
        View requireViewById10 = view.requireViewById(R.id.iconic_entrypoints_footer_title);
        C14360o3.A07(requireViewById10);
        this.A09 = (TextView) requireViewById10;
        View requireViewById11 = view.requireViewById(R.id.iconic_entrypoints_footer_body_text);
        C14360o3.A07(requireViewById11);
        this.A08 = (TextView) requireViewById11;
        View requireViewById12 = view.requireViewById(R.id.iconic_entrypoints_reels_icon);
        C14360o3.A07(requireViewById12);
        this.A06 = (ImageView) requireViewById12;
        this.A0Q = AbstractC56372iV.A01(view.requireViewById(R.id.direct_reel_reshare_comment_stub), false, false);
        this.A0R = AbstractC56372iV.A01(view.requireViewById(R.id.direct_reel_share_comment_stub_xma_styling), false, false);
        this.A0U = new C158707Ag();
        this.A0b = AbstractC09440dt.A01(C158717Ah.A00);
        View requireViewById13 = view.requireViewById(R.id.doubletap_heart);
        C14360o3.A07(requireViewById13);
        this.A0d = (ImageView) requireViewById13;
        this.A0Y = AbstractC09440dt.A01(new C9FA(14, this, view));
        igProgressImageView.getIgImageView().setScaleType(ImageView.ScaleType.CENTER_CROP);
        if (!C11T.A08() && C18U.A06(C06090Tz.A05, userSession, 36319098153999291L)) {
            ((C76E) this.A0a.getValue()).A00.setVisibility(8);
            c57012jc.A01().setVisibility(8);
        }
    }

    public final void A00() {
        L7B l7b = this.A01;
        if (l7b != null) {
            l7b.A00();
        }
        this.A01 = null;
        C47349Kvy c47349Kvy = this.A00;
        if (c47349Kvy != null) {
            c47349Kvy.A00.set(true);
        }
        this.A00 = null;
    }

    @Override // X.InterfaceC1581778c
    public final ImageView Afy() {
        return this.A0d;
    }

    @Override // X.C7QD
    public final View BKF() {
        return this.A03;
    }

    @Override // X.C7QE
    public final C7QH BYl() {
        return this.A02;
    }

    @Override // X.C7QE
    public final void EZu(C7QH c7qh) {
        this.A02 = c7qh;
    }
}
