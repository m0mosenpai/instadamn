package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.reels.viewer.common.ReelViewGroup;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;
import com.instagram.ui.widget.textureview.ScalingTextureView;

/* loaded from: classes9.dex */
public final class NSJ extends AbstractC143566dv implements InterfaceC143646e4 {
    public Context A00;
    public ImageButton A01;
    public InterfaceC56392iX A02;
    public C41181vS A03;
    public SegmentedProgressBar A04;
    public final OFT A05;
    public final C54697ODz A06;
    public final ODH A07;
    public final O4K A08;
    public final ReelViewGroup A09;
    public final C6RF A0A;
    public final ScalingTextureView A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NSJ(Context context, View view, UserSession userSession) {
        super(view);
        InterfaceC56392iX interfaceC56392iX;
        C14360o3.A0B(context, 3);
        this.A00 = context;
        this.A01 = (ImageButton) AbstractC166997dE.A0R(view, R.id.story_interstitial_reel_item_exit_button);
        this.A04 = (SegmentedProgressBar) AbstractC166997dE.A0R(view, R.id.reel_viewer_progress_bar);
        if (!C4R8.A00(userSession, "reel_interstitial_viewer")) {
            interfaceC56392iX = AbstractC31179DnN.A0M(view, R.id.reel_viewer_texture_viewstub);
        } else {
            interfaceC56392iX = null;
        }
        this.A02 = interfaceC56392iX;
        this.A06 = new C54697ODz(this.A00, AbstractC31173DnH.A0G(view, R.id.story_interstitial_chaining_view_stub));
        this.A07 = new ODH(this.A00, AbstractC31173DnH.A0G(view, R.id.story_interstitial_pog_garden_chaining_view_stub));
        this.A05 = new OFT(AbstractC167007dF.A0M(view, R.id.roll_call_overlay_view_stub));
        this.A0A = new C6RF(AbstractC167007dF.A0M(view, R.id.reconsideration_products_view_stub));
        this.A08 = new O4K(AbstractC167007dF.A0M(view, R.id.story_interstitial_reel_item_toolbar_view_stub));
        this.A09 = (ReelViewGroup) AbstractC166997dE.A0R(view, R.id.reel_view_group);
        InterfaceC56392iX interfaceC56392iX2 = this.A02;
        this.A0B = interfaceC56392iX2 != null ? (ScalingTextureView) interfaceC56392iX2.getView() : null;
    }

    @Override // X.InterfaceC143586dx
    public final FrameLayout Blf() {
        return null;
    }

    @Override // X.InterfaceC143646e4
    public final void Dds(C141596ac c141596ac, int i) {
        C14360o3.A0B(c141596ac, 0);
        this.A04.setProgress(c141596ac.A0B);
    }

    @Override // X.InterfaceC143586dx
    public final IgProgressImageView BGy() {
        return null;
    }

    @Override // X.InterfaceC143596dy
    public final C41181vS Blb() {
        return this.A03;
    }

    @Override // X.InterfaceC143586dx
    public final ScalingTextureView C6w() {
        return this.A0B;
    }
}
