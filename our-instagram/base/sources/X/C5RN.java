package X;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import java.util.Collections;
import java.util.List;

/* renamed from: X.5RN, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5RN extends Drawable implements Drawable.Callback {
    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public List A07() {
        if (this instanceof C5RM) {
            List singletonList = Collections.singletonList(((C5RM) this).A0A);
            C14360o3.A07(singletonList);
            return singletonList;
        }
        return ((C130205uQ) this).A07;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        for (Drawable drawable : A07()) {
            if (drawable != null) {
                drawable.setAlpha(i);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        for (Drawable drawable : A07()) {
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }
}
