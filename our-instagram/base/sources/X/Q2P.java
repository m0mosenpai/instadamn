package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.List;

/* loaded from: classes10.dex */
public final class Q2P extends Drawable implements Animatable, InterfaceC65195Tfd {
    public int A00;
    public Paint A02;
    public Rect A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Q2G A09;
    public boolean A08 = true;
    public int A01 = -1;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.A07 = true;
        this.A00 = 0;
        if (this.A08) {
            A00();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.A07 = false;
        this.A05 = false;
        C62976SZw c62976SZw = this.A09.A00;
        List list = c62976SZw.A0G;
        list.remove(this);
        if (list.isEmpty()) {
            c62976SZw.A09 = false;
        }
    }

    private void A00() {
        if (!this.A04) {
            C62976SZw c62976SZw = this.A09.A00;
            if (c62976SZw.A0E.A07.A02 != 1) {
                if (!this.A05) {
                    this.A05 = true;
                    if (!c62976SZw.A08) {
                        List list = c62976SZw.A0G;
                        if (!list.contains(this)) {
                            boolean isEmpty = list.isEmpty();
                            list.add(this);
                            if (isEmpty && !c62976SZw.A09) {
                                c62976SZw.A09 = true;
                                c62976SZw.A08 = false;
                                C62976SZw.A00(c62976SZw);
                            }
                        } else {
                            throw AbstractC166987dD.A14("Cannot subscribe twice in a row");
                        }
                    } else {
                        throw AbstractC166987dD.A14("Cannot subscribe to a cleared frame loader");
                    }
                } else {
                    return;
                }
            }
            invalidateSelf();
            return;
        }
        throw AbstractC166987dD.A12("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (!this.A04) {
            if (this.A06) {
                C62976SZw c62976SZw = this.A09.A00;
                int i = c62976SZw.A02;
                int i2 = c62976SZw.A01;
                Rect bounds = getBounds();
                Rect rect = this.A03;
                if (rect == null) {
                    rect = AbstractC166987dD.A0U();
                    this.A03 = rect;
                }
                Gravity.apply(119, i, i2, bounds, rect);
                this.A06 = false;
            }
            C62976SZw c62976SZw2 = this.A09.A00;
            QBY qby = c62976SZw2.A05;
            if (qby != null) {
                bitmap = qby.A00;
            } else {
                bitmap = c62976SZw2.A03;
            }
            Rect rect2 = this.A03;
            if (rect2 == null) {
                rect2 = AbstractC166987dD.A0U();
                this.A03 = rect2;
            }
            Paint paint = this.A02;
            if (paint == null) {
                paint = new Paint(2);
                this.A02 = paint;
            }
            canvas.drawBitmap(bitmap, (Rect) null, rect2, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.A09;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A09.A00.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A09.A00.A02;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.A05;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.A02;
        if (paint == null) {
            paint = new Paint(2);
            this.A02 = paint;
        }
        paint.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.A02;
        if (paint == null) {
            paint = new Paint(2);
            this.A02 = paint;
        }
        paint.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (!this.A04) {
            this.A08 = z;
            if (!z) {
                this.A05 = false;
                C62976SZw c62976SZw = this.A09.A00;
                List list = c62976SZw.A0G;
                list.remove(this);
                if (list.isEmpty()) {
                    c62976SZw.A09 = false;
                }
            } else if (this.A07) {
                A00();
            }
            return super.setVisible(z, z2);
        }
        throw AbstractC166987dD.A12("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
    }

    public Q2P(Q2G q2g) {
        this.A09 = q2g;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.A06 = true;
    }
}
