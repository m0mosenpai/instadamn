package X;

import android.widget.VideoView;
import androidx.cardview.widget.CardView;
import com.facebook.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.L3i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47675L3i {
    public final VideoView A00;
    public final CardView A01;
    public final IgFrameLayout A02;
    public final CircularImageView A03;
    public final C57012jc A04;

    public C47675L3i(C57012jc c57012jc) {
        this.A04 = c57012jc;
        this.A01 = (CardView) AbstractC166997dE.A0R(c57012jc.A01(), R.id.video_preview_container);
        this.A02 = (IgFrameLayout) AbstractC166997dE.A0R(c57012jc.A01(), R.id.layout_video_view);
        this.A00 = (VideoView) AbstractC166997dE.A0R(c57012jc.A01(), R.id.video_view);
        this.A03 = AbstractC31176DnK.A0U(c57012jc.A01(), R.id.video_view_thumbnail);
    }
}
