package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes8.dex */
public final class LW0 implements XDA {
    public final int A00;
    public final Drawable A01;

    @Override // X.XDA
    public final void AQW(Canvas canvas, Paint paint, Rect rect, int i) {
        C14360o3.A0B(paint, 3);
        Drawable drawable = this.A01;
        drawable.setColorFilter(paint.getColorFilter());
        drawable.setAlpha(paint.getAlpha());
        float width = rect.width() / BJH();
        float height = rect.height() / BJG();
        int i2 = i % this.A00;
        float BJH = rect.left + ((-i2) * BJH());
        float BJG = rect.top + ((-(i / r0)) * BJG());
        int save = canvas.save();
        try {
            canvas.clipRect(rect);
            canvas.scale(width, height, rect.left, rect.top);
            canvas.translate(BJH, BJG);
            drawable.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // X.XDA
    public final float BJG() {
        return this.A01.getIntrinsicHeight() / 1.0f;
    }

    @Override // X.XDA
    public final float BJH() {
        return this.A01.getIntrinsicWidth() / this.A00;
    }

    public LW0(Drawable drawable, int i) {
        this.A01 = drawable;
        this.A00 = i;
        drawable.mutate();
        AbstractC43594JPz.A15(drawable);
    }
}
