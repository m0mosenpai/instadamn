package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* renamed from: X.8RL, reason: invalid class name */
/* loaded from: classes4.dex */
public class C8RL extends Drawable {
    public Drawable A00;
    public int A01;
    public final int A02;
    public final Paint A03;

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        canvas.drawRect(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, this.A03);
        Drawable drawable = this.A00;
        if (drawable != null) {
            canvas.save();
            canvas.translate(((getBounds().left + (getBounds().width() / 2)) - (drawable.getIntrinsicWidth() / 2)) + this.A01, getBounds().top + (getBounds().height() / 2));
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void A00(Drawable drawable, int i) {
        this.A00 = drawable;
        this.A01 = i;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
            drawable.setBounds(-intrinsicWidth, -intrinsicHeight, intrinsicWidth, intrinsicHeight);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A02;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A03.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C8RL(int i, int i2) {
        this.A02 = i;
        Paint paint = new Paint(1);
        this.A03 = paint;
        paint.setColor(i2);
    }
}
