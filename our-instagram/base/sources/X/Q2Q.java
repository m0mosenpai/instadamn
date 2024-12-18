package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes10.dex */
public class Q2Q extends Drawable implements Drawable.Callback {
    public Q2E A00;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Q2E q2e = this.A00;
        if (q2e.A01.getLevel() != 0) {
            q2e.A01.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        Q2E q2e = this.A00;
        if (!q2e.A03) {
            q2e.A02 = AbstractC167007dF.A1W(q2e.A01.getConstantState());
            q2e.A03 = true;
        }
        if (q2e.A02) {
            q2e.A00 = getChangingConfigurations();
            return q2e;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A00.A01.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A00.A01.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.A00.A01.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.A00.A01.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.A00.A01.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        this.A00.A01.setLevel(i);
        A00();
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        return this.A00.A01.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A00.A01.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A00.A01.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        this.A00.A01.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.Q2E, android.graphics.drawable.Drawable$ConstantState] */
    public Q2Q(Resources resources, Q2E q2e) {
        Drawable newDrawable;
        ?? constantState = new Drawable.ConstantState();
        if (q2e != null) {
            Drawable.ConstantState constantState2 = q2e.A01.getConstantState();
            constantState2.getClass();
            if (resources != null) {
                newDrawable = constantState2.newDrawable(resources);
            } else {
                newDrawable = constantState2.newDrawable();
            }
            constantState.A01 = newDrawable;
            newDrawable.setCallback(this);
            constantState.A02 = true;
            constantState.A03 = true;
        }
        this.A00 = constantState;
    }

    public void A00() {
        Rect bounds = getBounds();
        Q2E q2e = this.A00;
        int width = (int) ((bounds.width() * q2e.A01.getLevel()) / 10000.0d);
        int intrinsicWidth = q2e.A01.getIntrinsicWidth();
        if (width < intrinsicWidth / 2.0d) {
            width = 0;
        } else if (width < intrinsicWidth) {
            width = intrinsicWidth;
        }
        Drawable drawable = q2e.A01;
        int i = bounds.left;
        drawable.setBounds(i, bounds.top, i + width, bounds.bottom);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        Q2E q2e = this.A00;
        return changingConfigurations | q2e.A00 | q2e.A01.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        A00();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
