package X;

import android.view.View;
import com.facebook.R;
import com.instagram.creation.photo.crop.CropImageView;

/* renamed from: X.KNe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45751KNe extends AbstractC44757Jre {
    public final CropImageView A00;

    @Override // X.AbstractC44757Jre
    public final void A00(boolean z) {
        this.A00.setVisibility(AbstractC167007dF.A05(!z ? 1 : 0));
        super.A00(z);
    }

    public C45751KNe(View view) {
        super(view);
        View requireViewById = view.requireViewById(R.id.crop_image_view_item);
        CropImageView cropImageView = (CropImageView) requireViewById;
        cropImageView.A05 = false;
        cropImageView.A0I();
        C14360o3.A07(requireViewById);
        this.A00 = cropImageView;
    }
}
