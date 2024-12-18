package X;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Gravity;

/* renamed from: X.2jC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56792jC extends Drawable implements InterfaceC56802jD, InterfaceC56812jE {
    public static Paint A07;
    public C56672j0 A00;
    public PorterDuffColorFilter A01;
    public boolean A04;
    public final int A05;
    public final int A06;
    public boolean A03 = false;
    public Rect A02 = null;

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.A03 = true;
        A00();
    }

    private void A00() {
        if (this.A03) {
            Rect bounds = getBounds();
            Rect rect = this.A02;
            if (rect == null) {
                rect = new Rect();
                this.A02 = rect;
            }
            Gravity.apply(this.A00.A03, this.A06, this.A05, bounds, rect, getLayoutDirection());
            if (!rect.equals(this.A00.A08)) {
                C56672j0 c56672j0 = this.A00;
                Rect rect2 = c56672j0.A07;
                Rect rect3 = c56672j0.A08;
                if (rect2 == null || rect3 == null) {
                    rect2 = new Rect();
                    c56672j0.A07 = rect2;
                    rect3 = new Rect();
                    c56672j0.A08 = rect3;
                }
                rect2.set(bounds);
                rect3.set(rect);
                float width = rect3.width();
                C56682j1 c56682j1 = c56672j0.A0A;
                AbstractC56652iy abstractC56652iy = c56682j1.A0E;
                float f = width / abstractC56652iy.A03.A01;
                float height = rect3.height() / abstractC56652iy.A03.A00;
                float min = Math.min(f, height);
                c56672j0.A00 = f / min;
                c56672j0.A01 = height / min;
                if (c56682j1.A00 != min) {
                    c56682j1.A00 = min;
                    C56712j4 c56712j4 = c56672j0.A0C;
                    c56712j4.A07();
                    c56712j4.A0D(null, 0.0f, c56672j0.A02);
                    c56712j4.A06();
                }
            }
        }
        this.A03 = false;
    }

    private void A01(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            this.A01 = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
    }

    @Override // X.InterfaceC56802jD
    public final void EV6(int i) {
        C56672j0 c56672j0 = this.A00;
        if (c56672j0.A03 != i) {
            c56672j0.A03 = i;
            this.A03 = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C56672j0 c56672j0 = this.A00;
        Rect bounds = getBounds();
        boolean z = true;
        if (!bounds.equals(c56672j0.A07)) {
            this.A03 = true;
        }
        A00();
        if (c56672j0.A08 != null) {
            int save = canvas.save();
            canvas.translate(r7.left, r7.top);
            boolean z2 = true;
            if (!this.A00.A09 || getLayoutDirection() != 1) {
                z2 = false;
            }
            if (z2) {
                canvas.translate(r7.right - r7.left, 0.0f);
                canvas.scale(-1.0f, 1.0f);
            }
            C56672j0 c56672j02 = this.A00;
            canvas.scale(c56672j02.A00, c56672j02.A01);
            PorterDuffColorFilter porterDuffColorFilter = this.A01;
            if (porterDuffColorFilter != null && this.A00.A05 == null) {
                c56672j0.A0C.A0C(porterDuffColorFilter);
            } else {
                z = false;
            }
            C56712j4 c56712j4 = c56672j0.A0C;
            c56712j4.A0B(canvas, 0.0f);
            if (z) {
                c56712j4.A0C(null);
            }
            canvas.restoreToCount(save);
            Paint paint = A07;
            if (paint != null) {
                canvas.drawRect(bounds, paint);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.A00.A02;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.A00.A05;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A05;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        int i = this.A00.A02;
        if (i >= 255) {
            return -1;
        }
        if (i > 0) {
            return -3;
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.A00.A09;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.A00.A04;
        if ((colorStateList == null || !colorStateList.isStateful()) && !super.isStateful()) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.A04 && super.mutate() == this) {
            C56672j0 c56672j0 = this.A00;
            C56662iz c56662iz = c56672j0.A0B;
            int i = c56672j0.A02;
            this.A00 = new C56672j0(c56672j0.A04, c56672j0.A05, c56672j0.A06, c56662iz, i, c56672j0.A03);
            this.A04 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        C56672j0 c56672j0 = this.A00;
        ColorStateList colorStateList = c56672j0.A04;
        if (colorStateList != null && (mode = c56672j0.A06) != null) {
            A01(colorStateList, mode);
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        C56672j0 c56672j0 = this.A00;
        if (i != c56672j0.A02) {
            c56672j0.A02 = i;
            c56672j0.A0C.A09(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        C56672j0 c56672j0 = this.A00;
        if (c56672j0.A09 != z) {
            c56672j0.A09 = z;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        ColorFilter colorFilter2 = this.A00.A05;
        if (!C2I7.A00(colorFilter, colorFilter2) || (Build.VERSION.SDK_INT >= 29 && AbstractC97374Yx.A00(colorFilter, colorFilter2))) {
            C56672j0 c56672j0 = this.A00;
            c56672j0.A05 = colorFilter;
            c56672j0.A0C.A0C(colorFilter);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        C56672j0 c56672j0 = this.A00;
        if (colorStateList != c56672j0.A04) {
            c56672j0.A04 = colorStateList;
            A01(colorStateList, c56672j0.A06);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        C56672j0 c56672j0 = this.A00;
        if (mode != c56672j0.A06) {
            c56672j0.A06 = mode;
            A01(c56672j0.A04, mode);
            invalidateSelf();
        }
    }

    public C56792jC(C56672j0 c56672j0, int i, int i2) {
        this.A00 = c56672j0;
        this.A06 = i;
        this.A05 = i2;
    }
}
