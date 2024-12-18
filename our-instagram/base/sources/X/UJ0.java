package X;

import android.view.View;
import com.facebook.R;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* loaded from: classes11.dex */
public final class UJ0 extends C3OO {
    public final View A00;
    public final IgProgressImageView A01;
    public final MediaFrameLayout A02;

    public UJ0(View view) {
        super(view);
        this.A00 = view;
        this.A01 = (IgProgressImageView) AbstractC166997dE.A0R(view, R.id.imageview);
        this.A02 = (MediaFrameLayout) AbstractC166997dE.A0R(view, R.id.canvas_media_group);
    }
}
