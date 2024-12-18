package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.instagram.creation.photo.crop.CropImageView;

/* renamed from: X.Jh9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44263Jh9 {
    public static final RectF A00(RectF rectF, CropImageView cropImageView, int i, int i2, int i3) {
        float width;
        float width2;
        float height;
        Matrix matrix = ((AbstractC43828JZr) cropImageView).A07;
        Matrix matrix2 = ((AbstractC43828JZr) cropImageView).A08;
        C44264JhA c44264JhA = ((AbstractC43828JZr) cropImageView).A0G;
        float f = 0.0f;
        RectF rectF2 = new RectF(0.0f, 0.0f, i, i2);
        matrix2.mapRect(rectF2);
        RectF A0X = AbstractC166987dD.A0X();
        matrix.mapRect(A0X, rectF);
        int A01 = c44264JhA.A01();
        int A00 = c44264JhA.A00();
        if (((AbstractC43828JZr) cropImageView).A00 < 1.0f) {
            float A002 = AbstractC25227BEk.A00(A0X.width(), A0X.height() * ((AbstractC43828JZr) cropImageView).A00);
            A0X.left += A002;
            A0X.right -= A002;
        }
        float f2 = rectF2.left;
        float f3 = A0X.left;
        if (f2 > f3) {
            width2 = A01;
            width = 0.0f;
        } else {
            float f4 = A01;
            width = ((f3 - f2) * f4) / rectF2.width();
            width2 = width + (((A0X.right - A0X.left) * f4) / rectF2.width());
        }
        if (((AbstractC43828JZr) cropImageView).A00 > 1.0f) {
            float A003 = AbstractC25227BEk.A00(A0X.height(), A0X.width() / ((AbstractC43828JZr) cropImageView).A00);
            A0X.top += A003;
            A0X.bottom -= A003;
        }
        float f5 = rectF2.top;
        float f6 = A0X.top;
        if (f5 > f6) {
            height = A00;
        } else {
            float f7 = f6 - f5;
            float f8 = A00;
            f = (f7 * f8) / rectF2.height();
            height = (((A0X.bottom - A0X.top) * f8) / rectF2.height()) + f;
        }
        A0X.set(width, f, width2, height);
        if (i3 != 0) {
            Matrix A0Q = AbstractC166987dD.A0Q();
            A0Q.reset();
            if (c44264JhA.A00 != 0) {
                A0Q.postTranslate((-c44264JhA.A01()) / 2.0f, (-c44264JhA.A00()) / 2.0f);
                A0Q.postRotate(-c44264JhA.A00);
                if (c44264JhA.A01 != null) {
                    float width3 = r0.getWidth() / 2.0f;
                    if (c44264JhA.A01 != null) {
                        A0Q.postTranslate(width3, r0.getHeight() / 2.0f);
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            A0Q.mapRect(A0X);
        }
        return A0X;
    }

    public static final C3AY A01(Bitmap bitmap, float f, int i) {
        int height;
        int width;
        float f2;
        float f3;
        if ((i / 90) % 2 == 0) {
            height = bitmap.getWidth();
            width = bitmap.getHeight();
        } else {
            height = bitmap.getHeight();
            width = bitmap.getWidth();
        }
        if (height < width) {
            f2 = height / width;
            f3 = 0.8f;
        } else {
            f2 = width / height;
            f3 = 0.5235602f;
        }
        float max = Math.max(f2, f3);
        return new C3AY(Float.valueOf(max), Float.valueOf(Math.max(max, f / 320.0f)));
    }
}
