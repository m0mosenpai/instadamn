package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Jrr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44770Jrr extends C3OO implements InterfaceC193488hT {
    public C193498hU A00;
    public Medium A01;
    public final C8SG A02;
    public final IgTextView A03;
    public final IgImageView A04;
    public final Jo3 A05;
    public final Matrix A06;

    public C44770Jrr(View view, C8SG c8sg, Jo3 jo3) {
        super(view);
        this.A02 = c8sg;
        this.A05 = jo3;
        this.A06 = AbstractC166987dD.A0Q();
        View requireViewById = view.requireViewById(R.id.gallery_grid_item_thumbnail);
        IgImageView igImageView = (IgImageView) requireViewById;
        igImageView.setVisibility(0);
        C14360o3.A07(requireViewById);
        this.A04 = igImageView;
        View requireViewById2 = view.requireViewById(R.id.gallery_grid_item_label);
        IgTextView igTextView = (IgTextView) requireViewById2;
        igTextView.setVisibility(0);
        C14360o3.A07(requireViewById2);
        this.A03 = igTextView;
        C3P9 A0s = AbstractC166987dD.A0s(igImageView);
        A0s.A0D = true;
        A0s.A07 = true;
        A0s.A02 = 0.92f;
        A0s.A04 = new C48540Ldd(this, 2);
        A0s.A00();
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
        int width2 = this.itemView.getWidth();
        int height2 = this.itemView.getHeight();
        int i = medium.A07;
        Matrix matrix = this.A06;
        C1NC.A0J(matrix, width, height, width2, height2, i, false);
        IgImageView igImageView = this.A04;
        igImageView.setScaleType(ImageView.ScaleType.MATRIX);
        igImageView.setImageMatrix(matrix);
        igImageView.setImageBitmap(bitmap);
        this.A03.setText(medium.B8m());
    }
}
