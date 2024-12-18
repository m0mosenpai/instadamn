package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.Gravity;

/* renamed from: X.8FY, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8FY extends Drawable {
    public float A00;
    public int A01;
    public int A02;
    public int A04;
    public boolean A06;
    public final Bitmap A07;
    public final BitmapShader A0A;
    public int A03 = 119;
    public final Paint A08 = new Paint(3);
    public final Matrix A0B = new Matrix();
    public final Rect A09 = new Rect();
    public final RectF A0C = new RectF();
    public boolean A05 = true;

    public final void A00() {
        this.A06 = true;
        this.A05 = true;
        this.A00 = Math.min(this.A01, this.A02) / 2;
        this.A08.setShader(this.A0A);
        invalidateSelf();
    }

    public final void A01() {
        Rect rect;
        if (this.A05) {
            if (this.A06) {
                int min = Math.min(this.A02, this.A01);
                int i = this.A03;
                Rect bounds = getBounds();
                rect = this.A09;
                Gravity.apply(i, min, min, bounds, rect, 0);
                int min2 = Math.min(rect.width(), rect.height());
                rect.inset(Math.max(0, (rect.width() - min2) / 2), Math.max(0, (rect.height() - min2) / 2));
                this.A00 = min2 * 0.5f;
            } else {
                int i2 = this.A03;
                int i3 = this.A02;
                int i4 = this.A01;
                Rect bounds2 = getBounds();
                rect = this.A09;
                Gravity.apply(i2, i3, i4, bounds2, rect, 0);
            }
            RectF rectF = this.A0C;
            rectF.set(rect);
            BitmapShader bitmapShader = this.A0A;
            if (bitmapShader != null) {
                Matrix matrix = this.A0B;
                matrix.setTranslate(rectF.left, rectF.top);
                float width = rectF.width();
                Bitmap bitmap = this.A07;
                matrix.preScale(width / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.A08.setShader(bitmapShader);
            }
            this.A05 = false;
        }
    }

    public final void A02(float f) {
        BitmapShader bitmapShader;
        if (this.A00 != f) {
            this.A06 = false;
            boolean z = false;
            if (f > 0.05f) {
                z = true;
            }
            Paint paint = this.A08;
            if (z) {
                bitmapShader = this.A0A;
            } else {
                bitmapShader = null;
            }
            paint.setShader(bitmapShader);
            this.A00 = f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.A07;
        if (bitmap != null) {
            A01();
            Paint paint = this.A08;
            if (paint.getShader() == null) {
                canvas.drawBitmap(bitmap, (Rect) null, this.A09, paint);
                return;
            }
            RectF rectF = this.A0C;
            float f = this.A00;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.A08.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.A08.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A02;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Bitmap bitmap;
        if (this.A03 != 119 || this.A06 || (bitmap = this.A07) == null || bitmap.hasAlpha() || this.A08.getAlpha() < 255 || this.A00 > 0.05f) {
            return -3;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.A08;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A08.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.A08.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.A08.setFilterBitmap(z);
        invalidateSelf();
    }

    public C8FY(Resources resources, Bitmap bitmap) {
        BitmapShader bitmapShader;
        this.A04 = 160;
        if (resources != null) {
            this.A04 = resources.getDisplayMetrics().densityDpi;
        }
        this.A07 = bitmap;
        if (bitmap != null) {
            int i = this.A04;
            this.A02 = bitmap.getScaledWidth(i);
            this.A01 = bitmap.getScaledHeight(i);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        } else {
            this.A01 = -1;
            this.A02 = -1;
            bitmapShader = null;
        }
        this.A0A = bitmapShader;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.A06) {
            this.A00 = Math.min(this.A01, this.A02) / 2;
        }
        this.A05 = true;
    }
}
