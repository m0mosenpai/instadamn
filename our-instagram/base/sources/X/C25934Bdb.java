package X;

import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Bdb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25934Bdb extends C3OO {
    public final View A00;
    public final ImageView A01;
    public final IgImageView A02;
    public final C177907vP A03;

    public C25934Bdb(View view) {
        super(view);
        this.A02 = AbstractC167007dF.A0T(view, R.id.gallery_grid_item_thumbnail);
        C177907vP c177907vP = new C177907vP(AbstractC166997dE.A0L(view));
        this.A03 = c177907vP;
        View requireViewById = view.requireViewById(R.id.gallery_grid_item_selection_circle);
        ImageView imageView = (ImageView) requireViewById;
        imageView.setImageDrawable(c177907vP);
        C14360o3.A07(requireViewById);
        this.A01 = imageView;
        this.A00 = AbstractC166997dE.A0S(view, R.id.gallery_grid_item_selection_overlay);
    }
}
