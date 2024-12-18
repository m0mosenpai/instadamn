package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.3ia, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80453ia {
    /* JADX WARN: Type inference failed for: r4v0, types: [X.2Xg, android.graphics.Matrix] */
    public final C51332Xg A00(Drawable drawable, ImageView.ScaleType scaleType, int i, int i2) {
        Matrix.ScaleToFit scaleToFit;
        float min;
        float f;
        float f2;
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0 || ImageView.ScaleType.FIT_XY == scaleType || ImageView.ScaleType.MATRIX == scaleType || (i == intrinsicWidth && i2 == intrinsicHeight)) {
            return null;
        }
        ?? matrix = new Matrix();
        boolean z = true;
        if (ImageView.ScaleType.CENTER == scaleType) {
            matrix.setTranslate(C2WL.A00((i - intrinsicWidth) * 0.5f), C2WL.A00((i2 - intrinsicHeight) * 0.5f));
            if (intrinsicWidth <= i && intrinsicHeight <= i2) {
                z = false;
            }
        } else {
            float f3 = 0.0f;
            if (ImageView.ScaleType.CENTER_CROP == scaleType) {
                if (intrinsicWidth * i2 > i * intrinsicHeight) {
                    f = i2 / intrinsicHeight;
                    f3 = (i - (intrinsicWidth * f)) * 0.5f;
                    f2 = 0.0f;
                } else {
                    f = i / intrinsicWidth;
                    f2 = (i2 - (intrinsicHeight * f)) * 0.5f;
                }
                matrix.setScale(f, f);
                matrix.postTranslate(C2WL.A00(f3), C2WL.A00(f2));
            } else {
                if (ImageView.ScaleType.CENTER_INSIDE == scaleType) {
                    if (intrinsicWidth <= i && intrinsicHeight <= i2) {
                        min = 1.0f;
                    } else {
                        min = Math.min(i / intrinsicWidth, i2 / intrinsicHeight);
                    }
                    float A00 = C2WL.A00((i - (intrinsicWidth * min)) * 0.5f);
                    float A002 = C2WL.A00((i2 - (intrinsicHeight * min)) * 0.5f);
                    matrix.setScale(min, min);
                    matrix.postTranslate(A00, A002);
                    return matrix;
                }
                RectF rectF = new RectF();
                RectF rectF2 = new RectF();
                rectF.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
                rectF2.set(0.0f, 0.0f, i, i2);
                int i3 = AbstractC100634fS.A00[scaleType.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 == 4) {
                                scaleToFit = Matrix.ScaleToFit.END;
                            } else {
                                throw new IllegalArgumentException("Only FIT_... values allowed");
                            }
                        } else {
                            scaleToFit = Matrix.ScaleToFit.CENTER;
                        }
                    } else {
                        scaleToFit = Matrix.ScaleToFit.START;
                    }
                } else {
                    scaleToFit = Matrix.ScaleToFit.FILL;
                }
                matrix.setRectToRect(rectF, rectF2, scaleToFit);
                return matrix;
            }
        }
        matrix.A00 = z;
        return matrix;
    }
}
