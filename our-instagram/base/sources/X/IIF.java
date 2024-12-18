package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* loaded from: classes7.dex */
public final class IIF {
    public final Context A00;
    public final IgProgressImageView A01;
    public final IJ7 A02;
    public final MediaFrameLayout A03;

    public IIF(View view) {
        C14360o3.A0B(view, 1);
        this.A02 = new IJ7(view, R.id.content);
        this.A00 = AbstractC166997dE.A0L(view);
        this.A03 = (MediaFrameLayout) AbstractC166987dD.A0c(view, R.id.video_container);
        this.A01 = (IgProgressImageView) AbstractC166987dD.A0c(view, R.id.thumbnail);
    }
}
