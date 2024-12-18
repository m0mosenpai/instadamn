package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.Jrs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44771Jrs extends C3OO implements InterfaceC193488hT {
    public C193498hU A00;
    public Medium A01;
    public IgImageButton A02;
    public final C8SG A03;
    public final Jo4 A04;
    public final Matrix A05;
    public final View A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44771Jrs(View view, C8SG c8sg, Jo4 jo4, float f) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A06 = view;
        this.A03 = c8sg;
        this.A04 = jo4;
        this.A05 = AbstractC166987dD.A0Q();
        IgImageButton igImageButton = (IgImageButton) view.requireViewById(R.id.gallery_image);
        this.A02 = igImageButton;
        ((ConstrainedImageView) igImageButton).A00 = f;
        ViewOnClickListenerC48063LPo.A00(igImageButton, 57, this);
    }

    @Override // X.InterfaceC193488hT
    public final boolean CXZ(Medium medium) {
        C14360o3.A0B(medium, 0);
        return medium.equals(this.A01);
    }

    @Override // X.InterfaceC193488hT
    public final void DN1(Medium medium, String str) {
    }

    @Override // X.InterfaceC193488hT
    public final void Dt1(Bitmap bitmap, Medium medium, boolean z) {
        AbstractC167007dF.A1D(medium, 0, bitmap);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        View view = this.A06;
        int width2 = view.getWidth();
        int height2 = view.getHeight();
        int i = medium.A07;
        Matrix matrix = this.A05;
        C1NC.A0J(matrix, width, height, width2, height2, i, false);
        IgImageButton igImageButton = this.A02;
        igImageButton.setScaleType(ImageView.ScaleType.MATRIX);
        igImageButton.setImageMatrix(matrix);
        igImageButton.setImageBitmap(bitmap);
    }
}
