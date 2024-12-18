package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* renamed from: X.U8h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66308U8h extends Drawable implements Animatable {
    public static final VMM A0F = new Object();
    public int A00;
    public long A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public C7R0 A08;
    public XGp A09;
    public C69738VuY A0A;
    public final Runnable A0B;
    public final C68673Va9 A0C;
    public volatile VMM A0D;
    public volatile boolean A0E;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C69738VuY c69738VuY;
        long max;
        XGp xGp = this.A09;
        if (xGp != null && (c69738VuY = this.A0A) != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (this.A0E) {
                max = uptimeMillis - this.A01;
            } else {
                max = Math.max(this.A05, 0L);
            }
            int A00 = c69738VuY.A00(max);
            if (A00 == -1) {
                A00 = xGp.getFrameCount() - 1;
                this.A0E = false;
            }
            if (xGp.AQi(canvas, this, A00)) {
                this.A02 = A00;
            } else {
                this.A00++;
            }
            long uptimeMillis2 = SystemClock.uptimeMillis();
            if (this.A0E) {
                long A02 = c69738VuY.A02(uptimeMillis2 - this.A01);
                if (A02 != -1) {
                    scheduleSelf(this.A0B, this.A01 + this.A04 + A02);
                } else {
                    this.A0E = false;
                }
            }
            this.A05 = max;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        XGp xGp = this.A09;
        if (xGp == null) {
            return super.getIntrinsicHeight();
        }
        return xGp.BJF();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        XGp xGp = this.A09;
        if (xGp == null) {
            return super.getIntrinsicWidth();
        }
        return xGp.BJI();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.A0E;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        if (this.A0E) {
            return false;
        }
        long j = i;
        if (this.A05 == j) {
            return false;
        }
        this.A05 = j;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        C7R0 c7r0 = this.A08;
        if (c7r0 == null) {
            c7r0 = new C7R0();
            this.A08 = c7r0;
        }
        c7r0.A00 = i;
        XGp xGp = this.A09;
        if (xGp != null) {
            xGp.EPb(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C7R0 c7r0 = this.A08;
        if (c7r0 == null) {
            c7r0 = new C7R0();
            this.A08 = c7r0;
        }
        c7r0.A00(colorFilter);
        XGp xGp = this.A09;
        if (xGp != null) {
            xGp.ERi(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        XGp xGp;
        if (!this.A0E && (xGp = this.A09) != null && xGp.getFrameCount() > 1) {
            this.A0E = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            this.A01 = uptimeMillis - this.A07;
            this.A05 = uptimeMillis - this.A06;
            this.A02 = this.A03;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.A0E) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.A07 = uptimeMillis - this.A01;
            this.A06 = uptimeMillis - this.A05;
            this.A03 = this.A02;
            this.A0E = false;
            this.A01 = 0L;
            this.A05 = -1L;
            this.A02 = -1;
            unscheduleSelf(this.A0B);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.Va9] */
    public C66308U8h(XGp xGp) {
        C69738VuY c69738VuY;
        this.A04 = 8L;
        this.A0D = A0F;
        ?? r1 = new Object() { // from class: X.Va9
        };
        this.A0C = r1;
        this.A0B = new RunnableC71243WqY(this);
        this.A09 = xGp;
        if (xGp == 0) {
            c69738VuY = null;
        } else {
            c69738VuY = new C69738VuY(xGp);
        }
        this.A0A = c69738VuY;
        if (xGp != 0) {
            xGp.EPi(r1);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        XGp xGp = this.A09;
        if (xGp != null) {
            xGp.EQS(rect);
        }
    }

    public C66308U8h() {
        this(null);
    }
}
