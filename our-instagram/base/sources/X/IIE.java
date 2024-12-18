package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* loaded from: classes7.dex */
public final class IIE {
    public final Context A00;
    public final IgImageView A01;
    public final C42797IwZ A02;
    public final MediaFrameLayout A03;

    public IIE(View view) {
        C14360o3.A0B(view, 1);
        this.A00 = AbstractC166997dE.A0L(view);
        this.A02 = new C42797IwZ(view, R.id.video_container);
        View requireViewById = view.requireViewById(R.id.video_container);
        MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) requireViewById;
        mediaFrameLayout.A00 = -1.0f;
        C14360o3.A07(requireViewById);
        this.A03 = mediaFrameLayout;
        this.A01 = AbstractC167007dF.A0T(view, R.id.thumbnail);
    }
}
