package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* loaded from: classes11.dex */
public final class U8L extends Drawable {
    public final ActionBarContainer A00;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.A00;
        if (actionBarContainer.A04) {
            drawable = actionBarContainer.A01;
            if (drawable == null) {
                return;
            }
        } else {
            Drawable drawable2 = actionBarContainer.A00;
            if (drawable2 != null) {
                drawable2.draw(canvas);
            }
            drawable = actionBarContainer.A02;
            if (drawable == null || !actionBarContainer.A05) {
                return;
            }
        }
        drawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.A00;
        if (actionBarContainer.A04) {
            if (actionBarContainer.A01 != null) {
                drawable = actionBarContainer.A00;
            } else {
                return;
            }
        } else {
            drawable = actionBarContainer.A00;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }

    public U8L(ActionBarContainer actionBarContainer) {
        this.A00 = actionBarContainer;
    }
}
