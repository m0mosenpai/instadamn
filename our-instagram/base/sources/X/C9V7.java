package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import java.util.List;

/* renamed from: X.9V7, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9V7 extends C3OO implements C6C3 {
    public C9SD A00;
    public SimpleVideoLayout A01;
    public final int A02;
    public final int A03;
    public final ImageView A04;
    public final TextView A05;
    public final TextView A06;
    public final InterfaceC56392iX A07;
    public final InterfaceC56392iX A08;
    public final InterfaceC56392iX A09;
    public final InterfaceC56392iX A0A;
    public final InterfaceC56392iX A0B;
    public final InterfaceC16660sJ A0C;
    public final View A0D;
    public final UserSession A0E;

    @Override // X.C6C3
    public final void Dz8(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void Dza(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void Dzb(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void E0M(int i, int i2) {
    }

    @Override // X.C6C3
    public final void onCompletion() {
    }

    @Override // X.C6C3
    public final void onCues(List list) {
    }

    @Override // X.C6C3
    public final void onLoop(int i) {
    }

    @Override // X.C6C3
    public final void onPrepare(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void onProgressStateChanged(boolean z) {
    }

    @Override // X.C6C3
    public final void onProgressUpdate(int i, int i2, boolean z) {
    }

    @Override // X.C6C3
    public final void onStopVideo(String str, boolean z) {
    }

    @Override // X.C6C3
    public final void onVideoDownloading(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void onVideoPlayerError(C4S7 c4s7, String str) {
    }

    @Override // X.C6C3
    public final /* synthetic */ void onVideoStartedPlaying(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void onVideoViewPrepared(C4S7 c4s7) {
    }

    public C9V7(View view, UserSession userSession, InterfaceC16660sJ interfaceC16660sJ) {
        super(view);
        this.A0E = userSession;
        this.A0D = view;
        this.A0C = interfaceC16660sJ;
        Resources resources = view.getResources();
        this.A03 = resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        this.A02 = resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        this.A04 = (ImageView) AbstractC166997dE.A0R(view, R.id.gallery_grid_format_thumbnail_icon);
        this.A06 = AbstractC167007dF.A0N(view, R.id.gallery_grid_format_thumbnail_title);
        this.A05 = AbstractC167007dF.A0N(view, R.id.gallery_grid_format_thumbnail_subtitle);
        this.A08 = AbstractC166997dE.A0X(view, R.id.gallery_grid_format_thumbnail_rounded_image_stub);
        this.A09 = AbstractC166997dE.A0X(view, R.id.gallery_grid_format_thumbnail_rounded_recycler_view_stub);
        InterfaceC56392iX A0X = AbstractC166997dE.A0X(view, R.id.gallery_grid_format_thumbnail_rounded_video_stub);
        this.A0A = A0X;
        this.A0B = AbstractC166997dE.A0X(view, R.id.gallery_grid_format_thumbnail_segmented_progress_bar_stub);
        this.A07 = AbstractC166997dE.A0X(view, R.id.gallery_grid_format_thumbnail_disabled_cover_stub);
        view.setLayoutParams(new LinearLayout.LayoutParams(resources.getDimensionPixelSize(R.dimen.ad_tag_max_width), resources.getDimensionPixelSize(R.dimen.gallery_grid_format_thumbnail_height)));
        A0X.EZv(new C23713Aem(this, 1));
    }
}
