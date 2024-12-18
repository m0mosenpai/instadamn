package X;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Mcq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50816Mcq extends ConstraintLayout {
    public View A00;
    public ImageView A01;
    public IgdsButton A02;

    public final void setButton(IgdsButton igdsButton) {
        C14360o3.A0B(igdsButton, 0);
        this.A02 = igdsButton;
    }

    public final void setDivider(View view) {
        C14360o3.A0B(view, 0);
        this.A00 = view;
    }

    public final void setIcon(ImageView imageView) {
        C14360o3.A0B(imageView, 0);
        this.A01 = imageView;
    }

    public final IgdsButton getButton() {
        return this.A02;
    }

    public final View getDivider() {
        return this.A00;
    }

    public final ImageView getIcon() {
        return this.A01;
    }
}
