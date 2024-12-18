package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.Jii, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44343Jii extends Drawable {
    public float A00;
    public float A01;
    public float A02;
    public Path A03;
    public RectF A04;
    public final ValueAnimator A05;
    public final ValueAnimator A06;
    public final Context A07;
    public final Paint A08;
    public final Paint A09;
    public final Paint A0A;

    public C44343Jii(Context context) {
        this.A07 = context;
        Paint A0R = AbstractC166987dD.A0R();
        this.A09 = A0R;
        Paint A0R2 = AbstractC166987dD.A0R();
        this.A0A = A0R2;
        Paint A0R3 = AbstractC166987dD.A0R();
        this.A08 = A0R3;
        this.A03 = AbstractC166987dD.A0T();
        this.A04 = AbstractC166987dD.A0X();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f);
        C14360o3.A07(ofFloat);
        this.A06 = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f);
        C14360o3.A07(ofFloat2);
        this.A05 = ofFloat2;
        int A09 = AbstractC167007dF.A09(context, R.attr.igds_color_controls);
        A0R.setColor(A09);
        A0R2.setColor(A09);
        A0R2.setStrokeWidth(6.0f);
        Paint.Style style = Paint.Style.STROKE;
        A0R2.setStyle(style);
        A0R3.setColor(A09);
        A0R3.setStrokeWidth(6.0f);
        A0R3.setStyle(style);
        A0R3.setStrokeCap(Paint.Cap.ROUND);
        A0R3.setStrokeJoin(Paint.Join.ROUND);
        ofFloat.setDuration(300L);
        AbstractC43592JPx.A1B(ofFloat);
        LMA.A01(ofFloat, this, 25);
        JX2.A00(ofFloat, this, 10);
        ofFloat2.setDuration(200L);
        AbstractC43592JPx.A1A(ofFloat2);
        LMA.A01(ofFloat2, this, 26);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        float height = this.A04.height();
        float f = this.A02;
        RectF rectF = this.A04;
        if (f == 0.0f) {
            canvas.drawRoundRect(rectF, height, height, this.A09);
            return;
        }
        float width = (rectF.width() - this.A04.height()) * this.A02;
        RectF rectF2 = this.A04;
        float f2 = width / 2.0f;
        float f3 = rectF2.left + f2;
        float f4 = rectF2.top;
        float f5 = rectF2.right - f2;
        float f6 = rectF2.bottom;
        canvas.drawRoundRect(f3, f4, f5, f6, height, height, this.A09);
        canvas.drawRoundRect(f3 + 6.0f, f4 + 6.0f, f5 - 6.0f, f6 - 6.0f, height, height, this.A0A);
        if (this.A00 <= 0.0f) {
            return;
        }
        canvas.drawPath(this.A03, this.A08);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        RectF rectF = new RectF(rect);
        this.A04 = rectF;
        float width = (rectF.width() - this.A04.height()) * 1.0f;
        RectF rectF2 = this.A04;
        float f = width / 2.0f;
        float f2 = rectF2.left + f + 6.0f;
        float f3 = rectF2.top + 6.0f;
        float f4 = ((rectF2.right - f) - 6.0f) - f2;
        float f5 = (rectF2.bottom - 6.0f) - f3;
        super.onBoundsChange(rect);
        Path A0T = AbstractC166987dD.A0T();
        this.A03 = A0T;
        A0T.moveTo((0.25f * f4) + f2, (0.5f * f5) + f3);
        this.A03.lineTo((0.425f * f4) + f2, (0.675f * f5) + f3);
        this.A03.lineTo(f2 + (f4 * 0.75f), f3 + (f5 * 0.35f));
        this.A01 = new PathMeasure(this.A03, false).getLength();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A09.setAlpha(i);
        invalidateSelf();
    }
}
