package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;

/* renamed from: X.93Q, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C93Q extends Drawable {
    public final TextPaint A00;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        C14360o3.A07(getBounds());
        canvas.save();
        canvas.rotate(25.0f);
        char[] chars = Character.toChars(127936);
        C14360o3.A07(chars);
        canvas.drawText(new String(chars), r1.centerX(), r1.centerY(), this.A00);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C93Q() {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(36.0f);
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.A00 = textPaint;
    }
}
