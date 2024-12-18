package X;

import android.view.View;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;

/* renamed from: X.Cvl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29290Cvl implements C3Y7 {
    public C75113Zb A00;
    public final View A01;
    public final View A02;
    public final Space A03;
    public final Space A04;
    public final Space A05;
    public final ConstraintLayout A06;
    public final ConstraintLayout A07;
    public final ConstraintLayout A08;
    public final ConstraintLayout A09;
    public final IgFrameLayout A0A;
    public final IgFrameLayout A0B;
    public final IgFrameLayout A0C;
    public final IgFrameLayout A0D;
    public final IgFrameLayout A0E;
    public final IgFrameLayout A0F;
    public final IgLinearLayout A0G;
    public final IgTextView A0H;
    public final IgTextView A0I;
    public final IgTextView A0J;
    public final IgTextView A0K;
    public final IgTextView A0L;
    public final IgTextView A0M;
    public final CircularImageView A0N;
    public final CircularImageView A0O;
    public final IgImageView A0P;
    public final IgImageView A0Q;
    public final IgImageView A0R;
    public final IgImageView A0S;
    public final IgImageView A0T;
    public final SimpleVideoLayout A0U;
    public final View A0V;

    @Override // X.C3Y7
    public final C3W4 Adr() {
        return null;
    }

    @Override // X.C3Y7
    public final C86083sf B61() {
        return null;
    }

    @Override // X.C3Y7
    public final InterfaceC80343iO BRd() {
        return null;
    }

    @Override // X.C3Y7
    public final C86033sa BS3() {
        return null;
    }

    @Override // X.C3Y7
    public final /* synthetic */ int C6z() {
        return -1;
    }

    @Override // X.C3Y7
    public final void EFy(int i) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.3Vo] */
    @Override // X.C3Y7
    public final InterfaceC74323Vo B62() {
        return new Object();
    }

    @Override // X.C3Y7
    public final int CFi() {
        return this.A0U.getWidth();
    }

    public C29290Cvl(View view) {
        this.A01 = view;
        View A0S = AbstractC166997dE.A0S(view, R.id.intent_aware_ad_grid_rounded_corner_card_view);
        this.A02 = A0S;
        View A0S2 = AbstractC166997dE.A0S(view, R.id.intent_aware_ad_grid_card_metadata_row);
        this.A0V = A0S2;
        this.A0D = (IgFrameLayout) AbstractC166997dE.A0R(A0S, R.id.intent_aware_ad_grid_profile_header_image_view_container);
        this.A0E = (IgFrameLayout) AbstractC166997dE.A0R(A0S, R.id.intent_aware_ad_grid_profile_header_pill_container);
        this.A0O = (CircularImageView) AbstractC166997dE.A0R(A0S, R.id.intent_aware_ad_grid_profile_header_image_view);
        this.A0L = AbstractC25231BEo.A0d(A0S, R.id.intent_aware_ad_grid_profile_name);
        this.A0R = AbstractC167007dF.A0T(A0S, R.id.intent_aware_ad_grid_profile_header_row_media_options);
        this.A0F = (IgFrameLayout) AbstractC166997dE.A0R(A0S, R.id.intent_aware_ad_grid_profile_header_gradient);
        this.A05 = (Space) AbstractC166997dE.A0R(A0S, R.id.intent_aware_ad_grid_profile_header_gradient_non_clickable_area);
        this.A07 = (ConstraintLayout) AbstractC166997dE.A0R(A0S, R.id.intent_aware_ad_grid_card_profile_detached_header_row);
        this.A0C = (IgFrameLayout) AbstractC166997dE.A0R(A0S2, R.id.intent_aware_ad_grid_card_profile_header_image_view_container);
        this.A0N = (CircularImageView) AbstractC166997dE.A0R(A0S2, R.id.intent_aware_ad_grid_card_profile_header_image_view);
        this.A0I = AbstractC25231BEo.A0d(A0S2, R.id.intent_aware_ad_grid_card_profile_name);
        this.A0B = (IgFrameLayout) AbstractC166997dE.A0R(A0S, R.id.intent_aware_ad_pivot_grid_preview_media_container);
        this.A0P = AbstractC167007dF.A0T(A0S, R.id.intent_aware_ad_grid_card_preview_image);
        this.A0U = (SimpleVideoLayout) AbstractC166997dE.A0R(A0S, R.id.intent_aware_ad_grid_card_preview_video);
        this.A0H = AbstractC25231BEo.A0d(A0S, R.id.intent_aware_ad_grid_cta);
        this.A0A = (IgFrameLayout) AbstractC166997dE.A0R(A0S, R.id.intent_aware_ad_grid_cta_gradient);
        this.A03 = (Space) AbstractC166997dE.A0R(A0S, R.id.intent_aware_ad_grid_cta_gradient_non_clickable_area);
        this.A06 = (ConstraintLayout) AbstractC166997dE.A0R(A0S, R.id.intent_aware_ad_grid_detached_cta);
        this.A08 = (ConstraintLayout) AbstractC166997dE.A0R(A0S, R.id.intent_aware_ad_grid_overlay_button_cta);
        this.A09 = (ConstraintLayout) AbstractC166997dE.A0R(A0S, R.id.intent_aware_ad_grid_overlay_small_button_cta);
        this.A0Q = AbstractC167007dF.A0T(A0S, R.id.intent_aware_ad_grid_profile_header_row_carousel_indicator);
        this.A0T = AbstractC167007dF.A0T(A0S, R.id.intent_aware_ad_grid_social_context_facepile);
        this.A0M = AbstractC25231BEo.A0d(A0S, R.id.intent_aware_ad_grid_social_context_text);
        this.A0G = (IgLinearLayout) AbstractC166997dE.A0R(A0S, R.id.intent_aware_ad_pivot_grid_hidden_media_container);
        this.A0K = AbstractC25231BEo.A0d(A0S2, R.id.intent_aware_ad_grid_card_metadata_text);
        this.A04 = (Space) AbstractC166997dE.A0R(A0S2, R.id.intent_aware_ad_grid_card_metadata_divider);
        this.A0J = AbstractC25231BEo.A0d(A0S2, R.id.intent_aware_ad_grid_social_context_text);
        this.A0S = AbstractC167007dF.A0T(A0S2, R.id.intent_aware_ad_grid_social_context_facepile);
    }

    @Override // X.C3Y7
    public final View BGa() {
        return this.A0P;
    }

    @Override // X.C3Y7
    public final View BQt() {
        return this.A02;
    }

    @Override // X.C3Y7
    public final C75113Zb BRY() {
        return this.A00;
    }

    @Override // X.C3Y7
    public final InterfaceC74623Ww C6y() {
        return this.A0U;
    }

    @Override // X.C3Y7
    public final void EgX(InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, boolean z) {
        AbstractC167017dG.A1N(imageUrl, interfaceC11380iw);
        this.A0P.A0D(interfaceC11380iw, null, imageUrl, z);
    }
}
