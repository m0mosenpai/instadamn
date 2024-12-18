package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.TypedValue;

/* loaded from: classes11.dex */
public final class U8R extends Drawable {
    public float A00;
    public float A01;
    public final Paint A02;
    public final Paint A03;
    public final StaticLayout A04;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Rect bounds = getBounds();
        C14360o3.A07(bounds);
        int height = bounds.height();
        int width = bounds.width();
        int i = height / 2;
        StaticLayout staticLayout = this.A04;
        int height2 = (height - (staticLayout != null ? staticLayout.getHeight() : 0)) / 2;
        int A02 = (width - C6RE.A02(staticLayout)) / 2;
        Resources system = Resources.getSystem();
        C14360o3.A07(system);
        int A00 = AbstractC56782jB.A00(system, 3.0f);
        float f = i;
        canvas.drawRoundRect(new RectF(bounds.left, bounds.top, bounds.right, bounds.bottom), f, f, this.A02);
        canvas.drawRoundRect(new RectF(bounds.left + A00, bounds.top + A00, bounds.right - A00, bounds.bottom - A00), f, f, this.A03);
        canvas.save();
        canvas.translate(bounds.left + A02, bounds.top + height2);
        staticLayout.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        int i;
        Resources system = Resources.getSystem();
        C14360o3.A07(system);
        int A00 = AbstractC56782jB.A00(system, 3.0f);
        float f = this.A01;
        Resources system2 = Resources.getSystem();
        C14360o3.A07(system2);
        int A002 = AbstractC56782jB.A00(system2, f) * 2;
        StaticLayout staticLayout = this.A04;
        if (staticLayout != null) {
            i = staticLayout.getHeight();
        } else {
            i = 0;
        }
        return A002 + i + (A00 * 2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        Resources system = Resources.getSystem();
        C14360o3.A07(system);
        int A00 = AbstractC56782jB.A00(system, 3.0f);
        float f = this.A00;
        Resources system2 = Resources.getSystem();
        C14360o3.A07(system2);
        return (AbstractC56782jB.A00(system2, f) * 2) + C6RE.A02(this.A04) + (A00 * 2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A03.setAlpha(i);
        this.A02.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int minimumWidth = getMinimumWidth();
        if (minimumWidth > i5) {
            int i6 = (minimumWidth - i5) / 2;
            i -= i6;
            i3 += i6;
        }
        super.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
        this.A02.setColorFilter(colorFilter);
    }

    public U8R(String str, int i, int i2, int i3) {
        Paint paint = new Paint();
        this.A03 = paint;
        Paint paint2 = new Paint();
        this.A02 = paint2;
        this.A00 = 4.0f;
        this.A01 = 1.5f;
        paint.setAntiAlias(true);
        paint.setColor(i2);
        paint2.setAntiAlias(true);
        paint2.setColor(i3);
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        C14360o3.A07(Resources.getSystem());
        textPaint.setTextSize((int) Math.ceil(TypedValue.applyDimension(2, 8.0f, r0.getDisplayMetrics())));
        textPaint.setTypeface(Typeface.create("roboto-medium", 1));
        textPaint.setColor(i);
        this.A04 = new StaticLayout(str, textPaint, (int) textPaint.measureText(str), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
    }
}
