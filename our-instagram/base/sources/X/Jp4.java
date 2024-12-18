package X;

import android.view.View;
import com.facebook.R;
import com.instagram.business.ui.widget.IgABTestMultiImageButton;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* loaded from: classes8.dex */
public final class Jp4 extends C3OO {
    public final IgABTestMultiImageButton A00;

    public Jp4(View view, float f) {
        super(view);
        ((MediaFrameLayout) AbstractC166997dE.A0R(view, R.id.thumbnail_preview_container)).A00 = f;
        this.A00 = (IgABTestMultiImageButton) view.requireViewById(R.id.media_image_button);
    }
}
