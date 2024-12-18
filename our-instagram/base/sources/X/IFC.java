package X;

import android.view.View;
import com.facebook.R;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* loaded from: classes7.dex */
public final class IFC {
    public final IgProgressImageView A00;
    public final MediaFrameLayout A01;

    public IFC(View view) {
        this.A01 = (MediaFrameLayout) AbstractC166987dD.A0c(view, R.id.media_layout);
        this.A00 = (IgProgressImageView) AbstractC166987dD.A0c(view, R.id.media_thumbnail);
    }
}
