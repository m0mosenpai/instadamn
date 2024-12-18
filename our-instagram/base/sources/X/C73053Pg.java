package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.3Pg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73053Pg extends Drawable {
    public final Bitmap A00;
    public final Paint A01;
    public final RectF A02;
    public final boolean A03;

    public C73053Pg(Bitmap bitmap, boolean z) {
        float f;
        C14360o3.A0B(bitmap, 1);
        this.A00 = bitmap;
        this.A03 = z;
        this.A02 = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Paint paint = new Paint(7);
        paint.setShader(bitmapShader);
        this.A01 = paint;
        Matrix matrix = new Matrix();
        if (z) {
            float height = bitmap.getHeight();
            float width = bitmap.getWidth();
            if (width > height) {
                f = (height - width) / 2.0f;
            } else {
                f = 0.0f;
            }
            matrix.setTranslate(f, height > width ? (width - height) / 2.0f : 0.0f);
        }
        bitmapShader.setLocalMatrix(matrix);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        RectF rectF = this.A02;
        rectF.set(getBounds());
        if (rectF.height() > rectF.width()) {
            rectF.inset(0.0f, (rectF.height() - rectF.width()) / 2.0f);
        } else if (rectF.height() < rectF.width()) {
            rectF.inset((rectF.width() - rectF.height()) / 2.0f, 0.0f);
        }
        canvas.drawOval(rectF, this.A01);
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated(message = "Deprecated in Java", replaceWith = @ReplaceWith(expression = "PixelFormat.TRANSLUCENT", imports = {"android.graphics.PixelFormat"}))
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        boolean z = this.A03;
        Bitmap bitmap = this.A00;
        if (z) {
            return Math.min(bitmap.getWidth(), bitmap.getHeight());
        }
        return bitmap.getHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        boolean z = this.A03;
        Bitmap bitmap = this.A00;
        if (z) {
            return Math.min(bitmap.getWidth(), bitmap.getHeight());
        }
        return bitmap.getWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A01.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
    }
}
