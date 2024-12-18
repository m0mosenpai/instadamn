package X;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.9Re, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC210159Re extends Drawable {
    public final Paint A00 = AbstractC166997dE.A0Q();

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        C6RB c6rb;
        this.A00.setAlpha(i);
        if (this instanceof C221169pe) {
            c6rb = ((C221169pe) this).A0A;
        } else {
            c6rb = ((C221159pd) this).A05;
        }
        AbstractC167027dH.A0h(c6rb, i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C6RB c6rb;
        this.A00.setColorFilter(colorFilter);
        if (this instanceof C221169pe) {
            c6rb = ((C221169pe) this).A0A;
        } else {
            c6rb = ((C221159pd) this).A05;
        }
        AbstractC167027dH.A0d(colorFilter, c6rb);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        invalidateSelf();
    }
}
