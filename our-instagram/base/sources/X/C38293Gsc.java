package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.Gsc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38293Gsc extends Drawable implements Drawable.Callback {
    public int A00;
    public int A01;
    public final Drawable A02;
    public final Drawable A03;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        this.A03.draw(canvas);
        this.A02.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        C14360o3.A0B(runnable, 1);
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        C14360o3.A0B(runnable, 1);
        unscheduleSelf(runnable);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A03.setAlpha(i);
        this.A02.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
        this.A02.setColorFilter(colorFilter);
    }

    public C38293Gsc(Context context) {
        Drawable drawable = context.getDrawable(R.drawable.hero_carousel_scrollbar_track);
        if (drawable != null) {
            this.A03 = drawable;
            drawable.setCallback(this);
            Drawable drawable2 = context.getDrawable(R.drawable.hero_carousel_scrollbar_thumb);
            if (drawable2 != null) {
                this.A02 = drawable2;
                drawable2.setCallback(this);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public static final void A00(C38293Gsc c38293Gsc) {
        Rect bounds = c38293Gsc.getBounds();
        C14360o3.A07(bounds);
        c38293Gsc.A03.setBounds(bounds);
        Drawable drawable = c38293Gsc.A02;
        int i = bounds.left + c38293Gsc.A01;
        drawable.setBounds(i, bounds.top, i + c38293Gsc.A00, bounds.bottom);
        c38293Gsc.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        A00(this);
    }
}
