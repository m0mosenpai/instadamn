package X;

import android.graphics.Canvas;

/* loaded from: classes11.dex */
public final class UMR extends AbstractC66318U8r {
    @Override // X.AbstractC66318U8r, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C1VI.A00();
        if (A02()) {
            A00();
            A01();
            canvas.clipPath(this.A0J);
        }
        super.draw(canvas);
        C1VI.A00();
    }
}
