package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;

/* renamed from: X.Jj2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44363Jj2 extends Drawable implements Drawable.Callback {
    public final String A00;
    public final int A01;
    public final Path A02 = AbstractC166987dD.A0T();
    public final RectF A03 = AbstractC166987dD.A0X();
    public final Drawable A04;
    public final Drawable A05;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Drawable drawable = this.A05;
        int i = this.A01;
        drawable.setBounds(0, 0, i, i);
        drawable.draw(canvas);
        Path path = this.A02;
        path.reset();
        RectF rectF = this.A03;
        float f = i;
        rectF.set(0.0f, 0.0f, f, f);
        float[] fArr = new float[8];
        fArr[0] = 0.0f;
        AbstractC43594JPz.A1U(fArr, 0.0f, 1);
        AbstractC167017dG.A1X(fArr, f);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.clipPath(path);
        this.A04.draw(canvas);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A05.setAlpha(i);
        this.A04.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A05.setColorFilter(colorFilter);
        this.A04.setColorFilter(colorFilter);
    }

    public C44363Jj2(Context context, Drawable drawable, UserSession userSession, String str, int i) {
        this.A00 = str;
        this.A01 = i;
        this.A05 = drawable;
        this.A04 = C74N.A02(context, userSession, str, i, i, false);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        AbstractC167027dH.A0j(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        AbstractC167027dH.A0i(this, runnable);
    }
}
