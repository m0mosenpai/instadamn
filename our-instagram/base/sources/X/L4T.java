package X;

import android.view.View;
import com.facebook.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* loaded from: classes8.dex */
public final class L4T {
    public MRJ A00;
    public final InterfaceC56392iX A01;
    public final InterfaceC56392iX A02;
    public final View A03;
    public final InterfaceC56392iX A04;
    public final InterfaceC56392iX A05;
    public final SpinnerImageView A06;

    public L4T(View view) {
        C14360o3.A0B(view, 1);
        View A0S = AbstractC166997dE.A0S(view, R.id.media_viewer_container);
        this.A03 = A0S;
        this.A06 = (SpinnerImageView) AbstractC166997dE.A0R(A0S, R.id.loading_progress_bar);
        this.A02 = AbstractC31179DnN.A0M(A0S, R.id.media_image_stub);
        this.A04 = AbstractC31179DnN.A0M(A0S, R.id.media_video_stub);
        this.A05 = AbstractC31179DnN.A0M(view, R.id.zero_rating_data_banner);
        this.A01 = AbstractC31179DnN.A0M(A0S, R.id.hd_icon_stub);
    }
}
