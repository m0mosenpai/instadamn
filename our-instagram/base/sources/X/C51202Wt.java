package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.2Wt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51202Wt extends Drawable implements Drawable.Callback, InterfaceC51172Wp, InterfaceC51212Wu {
    public Drawable A00;
    public C51332Xg A01;
    public boolean A02;

    @Override // X.InterfaceC51172Wp
    public final boolean DuB(View view, MotionEvent motionEvent) {
        Rect bounds = getBounds();
        C14360o3.A07(bounds);
        int x = ((int) motionEvent.getX()) - bounds.left;
        int y = ((int) motionEvent.getY()) - bounds.top;
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setHotspot(x, y);
            return false;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Drawable drawable = this.A00;
        if (drawable != null) {
            Rect bounds = getBounds();
            C14360o3.A07(bounds);
            int save = canvas.save();
            canvas.translate(bounds.left, bounds.top);
            if (this.A02) {
                canvas.clipRect(0, 0, bounds.width(), bounds.height());
            }
            C51332Xg c51332Xg = this.A01;
            if (c51332Xg != null) {
                canvas.concat(c51332Xg);
            }
            drawable.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        C14360o3.A0B(rect, 0);
        Drawable drawable = this.A00;
        if (drawable != null && drawable.getPadding(rect)) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        C14360o3.A0B(runnable, 1);
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        C14360o3.A0B(iArr, 0);
        Drawable drawable = this.A00;
        if (drawable != null && drawable.setState(iArr)) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        C14360o3.A0B(runnable, 1);
        unscheduleSelf(runnable);
    }

    private final void A00(boolean z, boolean z2) {
        Drawable drawable = this.A00;
        if (drawable != null && drawable.isVisible() != z) {
            try {
                drawable.setVisible(z, z2);
            } catch (NullPointerException unused) {
            }
        }
    }

    public final void A01() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            A00(false, false);
            drawable.setCallback(null);
        }
        this.A00 = null;
        this.A01 = null;
        this.A02 = false;
    }

    public final void A02(int i, int i2) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public final void A03(Drawable drawable, C51332Xg c51332Xg) {
        Drawable drawable2 = this.A00;
        if (drawable2 != drawable) {
            boolean z = false;
            if (drawable2 != null) {
                A00(false, false);
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                A00(isVisible(), false);
                drawable.setCallback(this);
            } else {
                drawable = null;
            }
            this.A00 = drawable;
            this.A01 = c51332Xg;
            if ((c51332Xg != null && c51332Xg.A00) || (drawable instanceof InsetDrawable)) {
                z = true;
            }
            this.A02 = z;
            invalidateSelf();
        }
    }

    @Override // X.InterfaceC51172Wp
    public final boolean Eik(MotionEvent motionEvent) {
        if ((this.A00 instanceof RippleDrawable) && motionEvent.getActionMasked() == 0 && getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            Drawable current = drawable.getCurrent();
            C14360o3.A07(current);
            return current;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        int[] state;
        Drawable drawable = this.A00;
        if (drawable == null || (state = drawable.getState()) == null) {
            return new int[0];
        }
        return state;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getTransparentRegion();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.A00;
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.A00;
        if (drawable != null && drawable.setLevel(i)) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setChangingConfigurations(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setDither(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        A00(z, z2);
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }
}
