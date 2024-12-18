package X;

import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.igds.components.imagebutton.IgMultiImageButton;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* loaded from: classes7.dex */
public final class HJ3 extends IgFrameLayout {
    public IgMultiImageButton A00;
    public SpinnerImageView A01;

    public final void setImageButton(IgMultiImageButton igMultiImageButton) {
        C14360o3.A0B(igMultiImageButton, 0);
        this.A00 = igMultiImageButton;
    }

    public final void setSpinnerImageView(SpinnerImageView spinnerImageView) {
        C14360o3.A0B(spinnerImageView, 0);
        this.A01 = spinnerImageView;
    }

    public final IgMultiImageButton getImageButton() {
        return this.A00;
    }

    public final SpinnerImageView getSpinnerImageView() {
        return this.A01;
    }
}
