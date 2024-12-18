package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.9Rz, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9Rz extends Drawable {
    public int A00;
    public int A01;
    public Paint A02;
    public Path A03;
    public Path A04;
    public final float A05;
    public final int A06;
    public final RectF A07;
    public final Bitmap A08;
    public final Matrix A09;
    public final Paint A0A;

    public C9Rz(Bitmap bitmap, Matrix matrix, float f, int i) {
        C14360o3.A0B(bitmap, 1);
        this.A08 = bitmap;
        this.A05 = f;
        this.A09 = matrix;
        this.A06 = i;
        Paint A0S = AbstractC166987dD.A0S(1);
        this.A0A = A0S;
        this.A07 = AbstractC166987dD.A0X();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        int width = bitmap.getWidth();
        if (matrix != null) {
            RectF A0Y = AbstractC166987dD.A0Y(width, bitmap.getHeight());
            matrix.mapRect(A0Y);
            this.A01 = (int) A0Y.width();
            this.A00 = (int) A0Y.height();
            bitmapShader.setLocalMatrix(matrix);
        } else {
            this.A01 = width;
            this.A00 = bitmap.getHeight();
        }
        A0S.setShader(bitmapShader);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A07.set(0.0f, 0.0f, rect.width(), rect.height());
        this.A04 = null;
        this.A03 = null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A0A.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0A.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC167007dF.A0r(canvas);
        AbstractC167017dG.A12(canvas, this);
        int i = this.A06;
        if ((i & 15) == 15) {
            RectF rectF = this.A07;
            float f = this.A05;
            canvas.drawRoundRect(rectF, f, f, this.A0A);
        } else {
            Path path = this.A04;
            if (path == null) {
                float f2 = this.A05;
                RectF rectF2 = this.A07;
                path = AbstractC225989yH.A00(f2, 0.0f, 0.0f, rectF2.width(), rectF2.height(), i);
                this.A04 = path;
            }
            canvas.drawPath(path, this.A0A);
        }
        Paint paint = this.A02;
        if (paint != null) {
            Path path2 = this.A03;
            if (path2 == null) {
                float strokeWidth = paint.getStrokeWidth() / 2.0f;
                float f3 = this.A05;
                RectF rectF3 = this.A07;
                path2 = AbstractC225989yH.A00(f3, strokeWidth, strokeWidth, rectF3.width() - strokeWidth, rectF3.height() - strokeWidth, i);
                this.A03 = path2;
            }
            canvas.drawPath(path2, paint);
        }
        canvas.restore();
    }
}
