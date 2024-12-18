package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.Twi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65937Twi extends Drawable {
    public final float A00;
    public final Paint A01;
    public final Path A02;
    public final PointF A03;
    public final PointF A04;
    public final PointF A05;

    public C65937Twi(Context context) {
        Paint paint = new Paint();
        this.A01 = paint;
        this.A05 = new PointF();
        this.A03 = new PointF();
        this.A04 = new PointF();
        Path path = new Path();
        this.A02 = path;
        paint.setFlags(1);
        paint.setColor(-1);
        float A00 = AbstractC13880nE.A00(context, 1.5f);
        this.A00 = A00 / 2.0f;
        paint.setShadowLayer(A00, 0.0f, 0.0f, context.getColor(R.color.black_50_transparent));
        paint.setPathEffect(new CornerPathEffect(A00));
        path.setFillType(Path.FillType.EVEN_ODD);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        C14360o3.A07(getBounds());
        canvas.save();
        canvas.translate(r2.left, r2.top);
        canvas.drawPath(this.A02, this.A01);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        float min = Math.min(rect.height(), rect.width()) + this.A00;
        float height = (rect.height() - min) / 2.0f;
        PointF pointF = this.A05;
        float width = ((rect.width() - min) / 2.0f) + (0.2f * min);
        pointF.set(width, height);
        PointF pointF2 = this.A03;
        pointF2.set(width, height + min);
        PointF pointF3 = this.A04;
        pointF3.set(width + (0.75f * min), height + (min / 2.0f));
        Path path = this.A02;
        path.rewind();
        path.moveTo(pointF.x, pointF.y);
        path.lineTo(pointF3.x, pointF3.y);
        path.lineTo(pointF2.x, pointF2.y);
        path.close();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A01.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return AbstractC166997dE.A0G(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return AbstractC166997dE.A0H(this);
    }
}
