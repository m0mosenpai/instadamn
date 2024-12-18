package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.facebook.R;
import kotlin.Deprecated;

@Deprecated(message = "")
/* renamed from: X.3DW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3DW extends Drawable {
    public boolean A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Paint A06;

    public C3DW(Resources.Theme theme, Integer num) {
        int i;
        C14360o3.A0B(theme, 1);
        C14360o3.A0B(num, 2);
        this.A02 = -1;
        this.A05 = -1;
        this.A04 = -1;
        this.A01 = -1;
        this.A06 = new Paint();
        switch (num.intValue()) {
            case 0:
                i = R.attr.actionBarPressedColor;
                break;
            case 1:
                i = R.attr.clearActionBarForegroundPressedColor;
                break;
            default:
                i = R.attr.highlightActionBarForegroundPressedColor;
                break;
        }
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(i, typedValue, true);
        this.A03 = typedValue.data;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        if (this.A00) {
            Paint paint = this.A06;
            paint.setColor(this.A03);
            if (this.A02 != -1 && this.A04 != -1 && this.A05 != -1 && this.A01 != -1) {
                canvas.drawRect(0.0f, 0.0f, 0.0f, 0.0f, paint);
            } else {
                canvas.drawRect(getBounds(), paint);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        C14360o3.A0B(iArr, 0);
        boolean z2 = this.A00;
        int length = iArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (iArr[i] == 16842919) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        this.A00 = z;
        if (z2 == z) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
