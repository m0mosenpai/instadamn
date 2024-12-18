package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.6Bl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C135606Bl extends Drawable {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public final Paint A04;
    public final Paint A05 = new Paint(5);
    public final float[] A06;
    public final Path A07;
    public final Path A08;
    public final Rect A09;
    public final RectF A0A;
    public final RectF A0B;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (AbstractC135616Bm.A02(this.A03)) {
            RectF rectF = this.A0B;
            float f = this.A02;
            canvas.drawRoundRect(rectF, f, f, this.A05);
            Paint paint = this.A04;
            if (paint.getStrokeWidth() != 0.0f) {
                RectF rectF2 = this.A0A;
                float f2 = this.A01;
                canvas.drawRoundRect(rectF2, f2, f2, paint);
                return;
            }
            return;
        }
        canvas.drawPath(this.A08, this.A05);
        Paint paint2 = this.A04;
        if (paint2.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(this.A07, paint2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.A09, this.A02);
    }

    public C135606Bl() {
        Paint paint = new Paint(1);
        this.A04 = paint;
        this.A0B = new RectF();
        this.A09 = new Rect();
        this.A0A = new RectF();
        this.A08 = new Path();
        this.A07 = new Path();
        this.A06 = new float[8];
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        RectF rectF = this.A0B;
        rectF.set(rect);
        this.A09.set(rect);
        RectF rectF2 = this.A0A;
        float f = rect.left;
        float f2 = this.A00;
        rectF2.set(f + f2, rect.top + f2, rect.right - f2, rect.bottom - f2);
        int i = this.A03;
        if (!AbstractC135616Bm.A02(i)) {
            Path path = this.A08;
            float f3 = this.A02;
            float[] fArr = this.A06;
            AbstractC135616Bm.A01(fArr, f3, i);
            path.reset();
            Path.Direction direction = Path.Direction.CW;
            path.addRoundRect(rectF, fArr, direction);
            if (this.A04.getStrokeWidth() != 0.0f) {
                Path path2 = this.A07;
                AbstractC135616Bm.A01(fArr, this.A01, this.A03);
                path2.reset();
                path2.addRoundRect(rectF2, fArr, direction);
            }
        }
    }
}
