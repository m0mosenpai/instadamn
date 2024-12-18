package X;

import android.content.Context;
import android.view.View;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;

/* renamed from: X.Gwg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38520Gwg extends C3OO implements C3Y7 {
    public C38321qM A00;
    public C75113Zb A01;
    public final View A02;
    public final Space A03;
    public final ConstraintLayout A04;
    public final IgFrameLayout A05;
    public final IgFrameLayout A06;
    public final IgFrameLayout A07;
    public final IgFrameLayout A08;
    public final IgTextView A09;
    public final CircularImageView A0A;
    public final IgImageView A0B;
    public final IgImageView A0C;
    public final SimpleVideoLayout A0D;
    public final Context A0E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38520Gwg(View view, Context context) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A02 = view;
        this.A0E = context;
        this.A04 = (ConstraintLayout) AbstractC166997dE.A0R(view, R.id.intent_aware_ad_rifu_card_container);
        this.A0A = AbstractC31176DnK.A0U(view, R.id.intent_aware_ad_rifu_profile_header_image_view);
        this.A0C = AbstractC167007dF.A0T(view, R.id.intent_aware_ad_rifu_media_options);
        this.A08 = (IgFrameLayout) AbstractC166997dE.A0R(view, R.id.intent_aware_ad_rifu_card_preview_image_container);
        this.A0B = AbstractC167007dF.A0T(view, R.id.intent_aware_ad_rifu_card_preview_image);
        this.A0D = (SimpleVideoLayout) AbstractC166997dE.A0R(view, R.id.intent_aware_ad_rifu_card_preview_video);
        this.A09 = AbstractC25231BEo.A0d(view, R.id.intent_aware_ad_rifu_cta);
        this.A07 = (IgFrameLayout) AbstractC166997dE.A0R(view, R.id.intent_aware_ad_rifu_top_background);
        this.A06 = (IgFrameLayout) AbstractC166997dE.A0R(view, R.id.intent_aware_ad_rifu_bottom_background);
        this.A05 = (IgFrameLayout) AbstractC166997dE.A0R(view, R.id.intent_aware_ad_rifu_cta_gradient);
        this.A03 = (Space) AbstractC166997dE.A0R(view, R.id.intent_aware_ad_rifu_cta_gradient_non_clickable_area);
    }

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
    public final void EFy(int i) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.3Vo] */
    @Override // X.C3Y7
    public final InterfaceC74323Vo B62() {
        return new Object();
    }

    @Override // X.C3Y7
    public final View BGa() {
        return this.A0B;
    }

    @Override // X.C3Y7
    public final View BQt() {
        return this.A02;
    }

    @Override // X.C3Y7
    public final C75113Zb BRY() {
        return this.A01;
    }

    @Override // X.C3Y7
    public final InterfaceC74623Ww C6y() {
        return this.A0D;
    }

    @Override // X.C3Y7
    public final /* synthetic */ int C6z() {
        return -1;
    }

    @Override // X.C3Y7
    public final int CFi() {
        return this.A0D.getWidth();
    }

    @Override // X.C3Y7
    public final void EgX(InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, boolean z) {
        AbstractC167017dG.A1N(imageUrl, interfaceC11380iw);
        this.A0B.A0D(interfaceC11380iw, null, imageUrl, z);
    }
}
