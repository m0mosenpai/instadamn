package X;

import android.view.View;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.igds.components.imagebutton.IgMultiImageButton;

/* loaded from: classes7.dex */
public final class IFD {
    public final View A00;
    public final IgMultiImageButton A01;

    public IFD(FrameLayout frameLayout, IgMultiImageButton igMultiImageButton) {
        this.A01 = igMultiImageButton;
        this.A00 = AbstractC166987dD.A0c(frameLayout, R.id.overlay_text);
        igMultiImageButton.setEnableTouchOverlay(false);
    }
}
