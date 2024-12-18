package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.Jj6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44367Jj6 extends Drawable implements Drawable.Callback {
    public static int A00(Canvas canvas, Drawable drawable, float f) {
        float centerX = drawable.getBounds().centerX();
        float f2 = drawable.getBounds().top;
        int save = canvas.save();
        canvas.scale(1.0f, f, centerX, f2);
        return save;
    }

    public static void A01(Rect rect, RectF rectF) {
        rectF.set(new RectF(rect.left, rect.top, rect.right, rect.bottom));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        AbstractC167027dH.A0j(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        AbstractC167027dH.A0i(this, runnable);
    }
}
