package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;

/* renamed from: X.U8v, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66322U8v extends ShapeDrawable.ShaderFactory {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public final Matrix A04 = new Matrix();
    public final Bitmap A05;
    public final BitmapShader A06;

    public final void A00() {
        Matrix matrix;
        float f;
        float height;
        Bitmap bitmap = this.A05;
        if (bitmap.getWidth() * this.A02 > this.A03 * bitmap.getHeight()) {
            float height2 = this.A02 / bitmap.getHeight();
            matrix = this.A04;
            matrix.setScale(height2, height2);
            f = ((this.A03 - (bitmap.getWidth() * height2)) * 0.5f) + this.A00;
            height = this.A01;
        } else {
            float width = this.A03 / bitmap.getWidth();
            matrix = this.A04;
            matrix.setScale(width, width);
            f = this.A00;
            height = ((this.A02 - (bitmap.getHeight() * width)) * 0.5f) + this.A01;
        }
        matrix.postTranslate(f, height);
        this.A06.setLocalMatrix(matrix);
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public final Shader resize(int i, int i2) {
        this.A03 = i;
        this.A02 = i2;
        A00();
        return this.A06;
    }

    public C66322U8v(Bitmap bitmap) {
        this.A05 = bitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.A06 = new BitmapShader(bitmap, tileMode, tileMode);
    }
}
