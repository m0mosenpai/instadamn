package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Queue;

/* renamed from: X.3PR, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3PR extends Drawable {
    public C3PS A00;
    public boolean A01;
    public boolean A02;

    private void A00() {
        if (!this.A01) {
            this.A01 = true;
            C3PT c3pt = this.A00.A01;
            c3pt.A00++;
            List list = c3pt.A04;
            if (c3pt.A06 == null && list != null) {
                list.add(new WeakReference(this));
                InterfaceC59502nt interfaceC59502nt = c3pt.A02;
                if (c3pt.A06 == null && interfaceC59502nt != null && !c3pt.A07) {
                    interfaceC59502nt.E7X();
                    c3pt.A07 = true;
                }
            }
        }
    }

    public final void A01(C3Se c3Se) {
        C3PT c3pt = this.A00.A01;
        Bitmap bitmap = c3pt.A06;
        if (bitmap == null) {
            Queue queue = c3pt.A05;
            queue.add(c3Se);
            java.util.Set set = C3PT.A08;
            synchronized (set) {
                set.add(c3pt);
            }
            bitmap = c3pt.A06;
            if (bitmap != null) {
                if (queue.remove(c3Se)) {
                    C3PT.A01(c3pt);
                } else {
                    return;
                }
            } else {
                InterfaceC59502nt interfaceC59502nt = c3pt.A02;
                if (c3pt.A06 != null || interfaceC59502nt == null || c3pt.A07) {
                    return;
                }
                interfaceC59502nt.E7X();
                c3pt.A07 = true;
                return;
            }
        }
        c3Se.CzZ(bitmap);
    }

    public final void A02(C3Se c3Se) {
        C3PT c3pt = this.A00.A01;
        if (c3pt.A05.remove(c3Se)) {
            C3PT.A01(c3pt);
            C3PT.A00(c3pt);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.A00.A00.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A00.A01.A03.getHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A00.A01.A03.getWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Bitmap bitmap = this.A00.A01.A06;
        if (bitmap == null || bitmap.hasAlpha() || getAlpha() < 255) {
            return -3;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.A02 && super.mutate() == this) {
            this.A00 = new C3PS(this.A00);
            this.A02 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A00.A00.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A00.A00.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (z) {
            A00();
        } else if (this.A01) {
            C3PT c3pt = this.A00.A01;
            int i = c3pt.A00 - 1;
            c3pt.A00 = i;
            if (i == 0) {
                c3pt.A06 = null;
            }
            List list = c3pt.A04;
            if (list != null) {
                int i2 = 0;
                int size = list.size();
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    if (equals(((Reference) list.get(i2)).get())) {
                        list.remove(i2);
                        break;
                    }
                    i2++;
                }
                C3PT.A00(c3pt);
            }
            this.A01 = false;
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        A00();
        Bitmap bitmap = this.A00.A01.A06;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, (Rect) null, getBounds(), this.A00.A00);
        }
        if (this.A00.A01.A01 != null) {
            canvas.drawRect(getBounds(), this.A00.A01.A01);
        }
    }
}
