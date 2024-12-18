package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;

/* renamed from: X.GwZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38514GwZ extends C3OO {
    public C38321qM A00;
    public J23 A01;
    public Integer A02;
    public final Context A03;
    public final View A04;
    public final ShimmerFrameLayout A05;
    public final C19270xB A06;
    public final UserSession A07;
    public final IgTextView A08;
    public final IgTextView A09;
    public final CircularImageView A0A;
    public final IgImageView A0B;
    public final SimpleVideoLayout A0C;
    public final RoundedCornerConstraintLayout A0D;
    public final View A0E;
    public final IgSimpleImageView A0F;

    public final void A00() {
        IgSimpleImageView igSimpleImageView = this.A0F;
        Context context = this.A03;
        AbstractC166997dE.A19(context, igSimpleImageView, R.drawable.instagram_save_pano_filled_24);
        AbstractC166997dE.A18(context, igSimpleImageView, 2131975256);
    }

    public final void A01() {
        IgSimpleImageView igSimpleImageView = this.A0F;
        Context context = this.A03;
        AbstractC166997dE.A19(context, igSimpleImageView, R.drawable.instagram_save_pano_outline_24);
        AbstractC166997dE.A18(context, igSimpleImageView, 2131975250);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38514GwZ(View view, UserSession userSession) {
        super(view);
        AbstractC167017dG.A1P(userSession, view);
        this.A07 = userSession;
        this.A0E = view;
        this.A03 = view.getContext();
        this.A0C = (SimpleVideoLayout) AbstractC166997dE.A0R(view, R.id.template_browser_video_player);
        this.A0B = AbstractC167007dF.A0T(view, R.id.template_browser_video_image_placeholder);
        this.A04 = AbstractC166997dE.A0S(view, R.id.template_browser_item_overlay_container);
        this.A0A = AbstractC31176DnK.A0U(view, R.id.user_profile_picture);
        this.A09 = AbstractC25231BEo.A0d(view, R.id.user_profile_name);
        this.A08 = AbstractC25231BEo.A0d(view, R.id.metadata_text);
        this.A0F = AbstractC31176DnK.A0T(view, R.id.save_icon);
        this.A0D = (RoundedCornerConstraintLayout) AbstractC166997dE.A0R(view, R.id.template_browser_clips_item_container);
        this.A05 = (ShimmerFrameLayout) AbstractC166997dE.A0R(view, R.id.template_browser_clips_item_shimmer_view);
        this.A06 = AbstractC31171DnF.A0D(AbstractC111324zv.A00(188));
    }
}
