package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.89v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1830089v extends Drawable {
    public Bitmap A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Matrix A06;
    public final Paint A07;
    public final Path A08;
    public final RectF A09;
    public final RectF A0A;
    public final RectF A0B;
    public final float A0C;
    public final int A0D;
    public final Paint A0E;
    public final Paint A0F;
    public final Shader A0G;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i, PorterDuff.Mode mode) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C1830089v(Resources resources) {
        Paint paint = new Paint(1);
        this.A0F = paint;
        Paint paint2 = new Paint(1);
        this.A07 = paint2;
        Paint paint3 = new Paint(1);
        this.A0E = paint3;
        this.A08 = new Path();
        RectF rectF = new RectF(0.0f, 0.0f, 62.0f, 73.0f);
        this.A09 = rectF;
        this.A0B = new RectF();
        this.A06 = new Matrix();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height);
        this.A05 = dimensionPixelSize;
        float f = dimensionPixelSize;
        float width = f / (rectF.width() / rectF.height());
        int color = resources.getColor(R.color.design_dark_default_color_on_background);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.achievements_only_you_top_margin);
        int color2 = resources.getColor(R.color.black_30_transparent);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.afi_indicator_arrow_margin_top);
        this.A04 = dimensionPixelSize3;
        int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        this.A02 = dimensionPixelSize4;
        int dimensionPixelSize5 = resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
        this.A0D = dimensionPixelSize5;
        float f2 = f / 6.0f;
        float f3 = f2 / 2.0f;
        this.A01 = f3;
        float f4 = dimensionPixelSize4;
        float f5 = f4 + f3;
        this.A0C = f5;
        int i = (int) ((width / 3.5f) + width + f2 + f4);
        this.A03 = i;
        this.A0G = new RadialGradient((dimensionPixelSize / 2) + dimensionPixelSize3 + dimensionPixelSize4, i - f3, f5, color2, 0, Shader.TileMode.CLAMP);
        float f6 = dimensionPixelSize3;
        this.A0A = new RectF(f6, f6, dimensionPixelSize - dimensionPixelSize3, width - f6);
        paint2.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(f6);
        paint.setStrokeMiter(dimensionPixelSize2);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(color);
        paint3.setShadowLayer(dimensionPixelSize5, 0.0f, 0.0f, color2);
        Path path = this.A08;
        path.reset();
        path.moveTo(0.0f, 31.02f);
        path.cubicTo(-0.18f, 55.51f, 31.0f, 73.0f, 31.0f, 73.0f);
        path.cubicTo(31.0f, 73.0f, 62.0f, 55.51f, 62.0f, 31.02f);
        path.cubicTo(62.0f, 13.89f, 48.12f, 0.0f, 31.0f, 0.0f);
        path.cubicTo(13.88f, 0.0f, 0.13f, 13.89f, 0.0f, 31.02f);
        path.close();
        RectF rectF2 = this.A09;
        RectF rectF3 = this.A0A;
        RectF rectF4 = this.A0B;
        C14360o3.A0B(rectF2, 1);
        C14360o3.A0B(rectF3, 2);
        C14360o3.A0B(rectF4, 3);
        if (rectF2.equals(rectF3)) {
            rectF4.set(rectF2);
        } else {
            float min = Math.min(Math.abs(rectF3.width() / rectF2.width()), Math.abs(rectF3.height() / rectF2.height()));
            float abs = Math.abs(rectF2.width() * min) / 2.0f;
            float abs2 = Math.abs(rectF2.height() * min) / 2.0f;
            rectF4.set(rectF3.centerX() - abs, rectF3.centerY() - abs2, rectF3.centerX() + abs, rectF3.centerY() + abs2);
        }
        Matrix matrix = this.A06;
        matrix.setScale(rectF4.width() / rectF2.width(), rectF4.height() / rectF2.height(), 0.0f, 0.0f);
        path.transform(matrix);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.A00 == null) {
            Bitmap createBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
            this.A00 = createBitmap;
            Canvas canvas2 = new Canvas(createBitmap);
            canvas2.save();
            float f = this.A04 + this.A0D;
            canvas2.translate(f, f);
            canvas2.drawPath(this.A08, this.A0E);
            canvas2.restore();
        }
        canvas.drawBitmap(this.A00, 0.0f, 0.0f, (Paint) null);
        canvas.save();
        int i = this.A04;
        float f2 = this.A0D + i;
        canvas.translate(f2, f2);
        Path path = this.A08;
        Paint paint = this.A07;
        canvas.drawPath(path, paint);
        Paint paint2 = this.A0F;
        canvas.drawPath(path, paint2);
        canvas.restore();
        canvas.save();
        paint.setShader(this.A0G);
        float f3 = (this.A05 / 2) + i + this.A02;
        float f4 = this.A03;
        float f5 = this.A01;
        float f6 = f4 - f5;
        canvas.drawCircle(f3, f6, this.A0C, paint);
        paint.setShader(null);
        canvas.drawCircle(f3, f6, f5, paint);
        canvas.drawCircle(f3, f6, f5, paint2);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A03 + (this.A0D * 2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A05 + (this.A0D * 2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A07.setAlpha(i);
        invalidateSelf();
    }
}
