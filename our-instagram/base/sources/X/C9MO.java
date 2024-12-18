package X;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.9MO, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9MO {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void A00(Drawable drawable, ImageView imageView, float f, float f2, boolean z) {
        float f3;
        InterfaceC180487zc interfaceC180487zc;
        C14360o3.A0B(imageView, 1);
        Matrix matrix = new Matrix();
        float intrinsicWidth = drawable.getIntrinsicWidth() * f2;
        float intrinsicHeight = drawable.getIntrinsicHeight() * f2;
        if (z && (intrinsicWidth > imageView.getWidth() || intrinsicHeight > imageView.getHeight())) {
            float width = imageView.getWidth() / intrinsicWidth;
            float height = imageView.getHeight() / intrinsicHeight;
            if (width > height) {
                width = height;
            }
            f3 = width * f * f2;
        } else {
            f3 = f * f2;
        }
        if ((drawable instanceof InterfaceC180487zc) && (interfaceC180487zc = (InterfaceC180487zc) drawable) != null) {
            interfaceC180487zc.EPj(f);
        }
        imageView.setImageDrawable(drawable);
        matrix.setScale(f3, f3);
        matrix.postTranslate((imageView.getWidth() - ((intrinsicWidth * f3) / f2)) / 2.0f, (imageView.getHeight() - ((intrinsicHeight * f3) / f2)) / 2.0f);
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        imageView.setImageMatrix(matrix);
    }
}
