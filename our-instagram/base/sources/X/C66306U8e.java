package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* renamed from: X.U8e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66306U8e extends Drawable implements Animatable {
    public XGp A00;
    public final C7R0 A01;
    public final C69403Vmn A02;
    public final RunnableC71244WqZ A03;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        long max;
        C14360o3.A0B(canvas, 0);
        C69403Vmn c69403Vmn = this.A02;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (c69403Vmn.A06) {
            max = uptimeMillis - c69403Vmn.A05;
        } else {
            max = Math.max(c69403Vmn.A03, 0L);
        }
        C69738VuY c69738VuY = c69403Vmn.A07;
        int A00 = c69738VuY.A00(max);
        c69403Vmn.A03 = max;
        if (A00 == -1) {
            A00 = this.A00.getFrameCount() - 1;
            c69403Vmn.A06 = false;
        } else if (A00 == 0 && c69403Vmn.A01 != -1) {
            SystemClock.uptimeMillis();
        }
        if (this.A00.AQi(canvas, this, A00)) {
            c69403Vmn.A01 = A00;
        } else {
            c69403Vmn.A00++;
        }
        if (c69403Vmn.A06) {
            long A02 = c69738VuY.A02(SystemClock.uptimeMillis() - c69403Vmn.A05);
            if (A02 != -1) {
                long j = A02 + 8;
                if (j != -1) {
                    scheduleSelf(this.A03, j);
                    return;
                }
            } else {
                c69403Vmn.A06 = false;
            }
        }
        c69403Vmn.A06 = false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        this.A00.EQS(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A00.BJF();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A00.BJI();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.A02.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A01.A00 = i;
        this.A00.EPb(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A01.A00(colorFilter);
        this.A00.ERi(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.A00.getFrameCount() > 0) {
            C69403Vmn c69403Vmn = this.A02;
            if (!c69403Vmn.A06) {
                long uptimeMillis = SystemClock.uptimeMillis();
                c69403Vmn.A05 = uptimeMillis - c69403Vmn.A04;
                c69403Vmn.A03 = uptimeMillis - c69403Vmn.A02;
                c69403Vmn.A01 = -1;
                c69403Vmn.A06 = true;
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        C69403Vmn c69403Vmn = this.A02;
        if (c69403Vmn.A06) {
            long uptimeMillis = SystemClock.uptimeMillis();
            c69403Vmn.A04 = uptimeMillis - c69403Vmn.A05;
            c69403Vmn.A02 = uptimeMillis - c69403Vmn.A03;
            c69403Vmn.A05 = 0L;
            c69403Vmn.A03 = -1L;
            c69403Vmn.A01 = -1;
            c69403Vmn.A06 = false;
        }
        unscheduleSelf(this.A03);
    }

    public C66306U8e(XGp xGp) {
        this.A00 = xGp;
        this.A02 = new C69403Vmn(new C69738VuY(xGp));
        C7R0 c7r0 = new C7R0();
        c7r0.A01(this);
        this.A01 = c7r0;
        this.A03 = new RunnableC71244WqZ(this);
    }
}
