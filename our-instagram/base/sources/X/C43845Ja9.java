package X;

import android.view.animation.Transformation;
import com.instagram.creation.photo.crop.CropImageView;

/* renamed from: X.Ja9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43845Ja9 extends Transformation {
    public final /* synthetic */ CropImageView A00;

    public C43845Ja9(CropImageView cropImageView) {
        this.A00 = cropImageView;
    }

    @Override // android.view.animation.Transformation
    public final void setAlpha(float f) {
        C131515wl c131515wl;
        CropImageView cropImageView = this.A00;
        C82P c82p = cropImageView.A04;
        if (c82p != null && (c131515wl = c82p.A01) != null && c131515wl.A04(f)) {
            cropImageView.invalidate();
        }
    }
}
