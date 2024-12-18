package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.SystemClock;

/* loaded from: classes11.dex */
public final class UMQ extends C162867Qx implements Runnable {
    public float A00;
    public int A01;
    public boolean A02;
    public boolean A03;

    @Override // java.lang.Runnable
    public final void run() {
        this.A03 = false;
        this.A00 += (int) ((20.0f / this.A01) * 360.0f);
        invalidateSelf();
    }

    @Override // X.C162867Qx, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int save = canvas.save();
        Rect bounds = getBounds();
        int i = bounds.right - bounds.left;
        int i2 = bounds.bottom - bounds.top;
        float f = this.A00;
        if (!this.A02) {
            f = 360.0f - f;
        }
        canvas.rotate(f, r1 + (i / 2), r3 + (i2 / 2));
        super.draw(canvas);
        canvas.restoreToCount(save);
        if (!this.A03) {
            this.A03 = true;
            scheduleSelf(this, SystemClock.uptimeMillis() + 20);
        }
    }
}
