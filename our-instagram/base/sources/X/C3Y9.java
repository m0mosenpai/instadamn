package X;

import android.view.View;
import com.facebook.R;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.3Y9, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3Y9 {
    public final IgProgressImageView A00;
    public final MediaFrameLayout A01;

    public C3Y9(MediaFrameLayout mediaFrameLayout) {
        C14360o3.A0B(mediaFrameLayout, 1);
        this.A01 = mediaFrameLayout;
        View requireViewById = mediaFrameLayout.requireViewById(R.id.collection_thumbnail_imageview);
        C14360o3.A07(requireViewById);
        this.A00 = (IgProgressImageView) requireViewById;
    }
}
