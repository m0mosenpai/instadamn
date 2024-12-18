package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* renamed from: X.Jiz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44360Jiz extends Drawable {
    public int A00;
    public long A02;
    public InterfaceC16820sZ A03;
    public final Movie A05;
    public final int A06;
    public final Paint A07 = AbstractC166987dD.A0S(2);
    public boolean A04 = true;
    public long A01 = 2147483647L;

    public C44360Jiz(String str, int i) {
        this.A06 = i;
        this.A05 = Movie.decodeFile(str);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        C14360o3.A0B(canvas, 0);
        if (!this.A04) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (this.A02 == 0) {
                this.A02 = uptimeMillis;
            }
            Movie movie = this.A05;
            if (movie == null || (i = movie.duration()) == 0) {
                i = 1000;
            }
            this.A00 = (int) ((uptimeMillis - this.A02) % i);
            A01(canvas);
            invalidateSelf();
            long uptimeMillis2 = SystemClock.uptimeMillis() - this.A02;
            if (movie != null) {
                i2 = movie.duration();
            } else {
                i2 = 0;
            }
            if (uptimeMillis2 >= i2 * this.A01) {
                this.A04 = true;
                InterfaceC16820sZ interfaceC16820sZ = this.A03;
                if (interfaceC16820sZ != null) {
                    interfaceC16820sZ.invoke();
                    return;
                }
                return;
            }
            return;
        }
        A01(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated
    public final int getOpacity() {
        return -3;
    }

    private final void A01(Canvas canvas) {
        Movie movie = this.A05;
        if (movie != null) {
            movie.setTime(this.A00);
        }
        canvas.save();
        canvas.scale(A00(), A00());
        if (movie != null) {
            movie.draw(canvas, getBounds().left / A00(), getBounds().top / A00(), this.A07);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i = this.A06;
        if (i <= 0) {
            Movie movie = this.A05;
            if (movie != null) {
                return movie.height();
            }
            return 0;
        }
        return i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i = this.A06;
        if (i <= 0) {
            Movie movie = this.A05;
            if (movie != null) {
                return movie.width();
            }
            return 0;
        }
        return i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A07.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A07.setColorFilter(colorFilter);
    }

    private final float A00() {
        int i;
        float intrinsicWidth = getIntrinsicWidth();
        Movie movie = this.A05;
        if (movie != null) {
            i = movie.width();
        } else {
            i = 1;
        }
        return intrinsicWidth / i;
    }
}
