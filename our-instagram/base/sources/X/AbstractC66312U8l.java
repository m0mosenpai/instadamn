package X;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.U8l, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC66312U8l extends Drawable implements Drawable.Callback, InterfaceC162877Qy, InterfaceC162887Qz {
    public InterfaceC162877Qy A00;
    public final Drawable[] A04;
    public final C7R0 A06 = new C7R0();
    public final Rect A05 = new Rect();
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A01 = false;

    public final Drawable A02(int i) {
        C0Hf.A00(Boolean.valueOf(MSY.A1R(i)));
        Drawable[] drawableArr = this.A04;
        C0Hf.A00(Boolean.valueOf(i < drawableArr.length));
        return drawableArr[i];
    }

    public final void A03(Drawable drawable, int i) {
        C0Hf.A00(Boolean.valueOf(MSY.A1R(i)));
        Drawable[] drawableArr = this.A04;
        C0Hf.A00(Boolean.valueOf(i < drawableArr.length));
        if (drawable != drawableArr[i]) {
            if (drawable != null && this.A01) {
                drawable.mutate();
            }
            C7R1.A00(null, drawableArr[i], null);
            C7R1.A00(null, drawable, null);
            C7R0 c7r0 = this.A06;
            if (drawable != null && c7r0 != null) {
                c7r0.A01(drawable);
            }
            C7R1.A01(drawable, this);
            C7R1.A00(this, drawable, this);
            this.A03 = false;
            drawableArr[i] = drawable;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i = 0;
        int i2 = -1;
        while (true) {
            Drawable[] drawableArr = this.A04;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                i2 = Math.max(i2, drawable.getIntrinsicHeight());
            }
            i++;
        }
        if (i2 > 0) {
            return i2;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i = 0;
        int i2 = -1;
        while (true) {
            Drawable[] drawableArr = this.A04;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                i2 = Math.max(i2, drawable.getIntrinsicWidth());
            }
            i++;
        }
        if (i2 > 0) {
            return i2;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        int i = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        Rect rect2 = this.A05;
        while (true) {
            Drawable[] drawableArr = this.A04;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.getPadding(rect2);
                    rect.left = Math.max(rect.left, rect2.left);
                    rect.top = Math.max(rect.top, rect2.top);
                    rect.right = Math.max(rect.right, rect2.right);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                }
                i++;
            } else {
                return true;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.A04;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.mutate();
                }
                i++;
            } else {
                this.A01 = true;
                return this;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.A04;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setBounds(rect);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        int i2 = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.A04;
            if (i2 < drawableArr.length) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null && drawable.setLevel(i)) {
                    z = true;
                }
                i2++;
            } else {
                return z;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.A04;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null && drawable.setState(iArr)) {
                    z = true;
                }
                i++;
            } else {
                return z;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.A04;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setHotspot(f, f2);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // X.InterfaceC162877Qy
    public final void BpW(RectF rectF) {
        InterfaceC162877Qy interfaceC162877Qy = this.A00;
        if (interfaceC162877Qy != null) {
            interfaceC162877Qy.BpW(rectF);
        } else {
            AbstractC65702TsY.A0x(rectF, this);
        }
    }

    @Override // X.InterfaceC162877Qy
    public final void CAW(Matrix matrix) {
        InterfaceC162877Qy interfaceC162877Qy = this.A00;
        if (interfaceC162877Qy != null) {
            interfaceC162877Qy.CAW(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable[] drawableArr = this.A04;
        int length = drawableArr.length;
        int i = -2;
        if (length != 0) {
            i = -1;
            for (int i2 = 1; i2 < length; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    i = Drawable.resolveOpacity(i, drawable.getOpacity());
                }
            }
        }
        return i;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (!this.A03) {
            this.A02 = false;
            boolean z = false;
            int i = 0;
            while (true) {
                Drawable[] drawableArr = this.A04;
                boolean z2 = true;
                if (i >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i];
                if (drawable == null || !drawable.isStateful()) {
                    z2 = false;
                }
                z |= z2;
                this.A02 = z;
                i++;
            }
            this.A03 = true;
        }
        return this.A02;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A06.A00(colorFilter);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.A04;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setColorFilter(colorFilter);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.A06.A01 = z ? 1 : 0;
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.A04;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setDither(z);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.A06.A02 = z ? 1 : 0;
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.A04;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setFilterBitmap(z);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public AbstractC66312U8l(Drawable[] drawableArr) {
        int i = 0;
        this.A04 = drawableArr;
        while (true) {
            Drawable[] drawableArr2 = this.A04;
            if (i < drawableArr2.length) {
                C7R1.A00(this, drawableArr2[i], this);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // X.InterfaceC162887Qz
    public final void Eg9(InterfaceC162877Qy interfaceC162877Qy) {
        this.A00 = interfaceC162877Qy;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.A04;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setVisible(z, z2);
                }
                i++;
            } else {
                return visible;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }
}
