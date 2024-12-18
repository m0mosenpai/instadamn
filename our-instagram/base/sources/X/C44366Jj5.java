package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import com.instagram.common.session.UserSession;

/* renamed from: X.Jj5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44366Jj5 extends Drawable implements Drawable.Callback {
    public final Drawable A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Path A05;
    public final RectF A06;
    public final Drawable A07;
    public final C6RB A08;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Drawable drawable = this.A07;
        int i = this.A02;
        int i2 = i * 2;
        int i3 = this.A03;
        drawable.setBounds(i, i2, i3 + i, i3 + i2);
        drawable.draw(canvas);
        int A0G = AbstractC166997dE.A0G(this);
        Drawable drawable2 = this.A00;
        int intrinsicWidth = drawable2.getIntrinsicWidth();
        C6RB c6rb = this.A08;
        int i4 = c6rb.A0A;
        int i5 = (intrinsicWidth - i4) / 2;
        c6rb.setBounds(i5, A0G - c6rb.A06, i4 + i5, A0G);
        c6rb.draw(canvas);
        float f = this.A01;
        Path path = this.A05;
        path.reset();
        RectF rectF = this.A06;
        rectF.set(0.0f, 0.0f, f, f);
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        AbstractC167017dG.A1X(fArr, f);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.clipPath(path);
        drawable2.draw(canvas);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A00.getIntrinsicHeight() + this.A04 + this.A08.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A00.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A07.setAlpha(i);
        this.A00.setAlpha(i);
        this.A08.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A07.setColorFilter(colorFilter);
        this.A00.setColorFilter(colorFilter);
        this.A08.setColorFilter(colorFilter);
    }

    public C44366Jj5(Context context, UserSession userSession, String str) {
        this.A03 = LH0.A02(context, userSession);
        int A00 = LH0.A00(context, userSession);
        this.A01 = A00;
        this.A02 = LH0.A01(context, userSession);
        this.A07 = AbstractC43594JPz.A0D();
        this.A00 = C74N.A02(context, userSession, str, A00, A00, AbstractC47041Kqy.A00(userSession));
        Spannable spannable = C6RB.A0d;
        C6RB A0z = AbstractC166987dD.A0z(context, AbstractC188878Yd.A01(context));
        A0z.A0M(context.getResources().getText(2131953523));
        this.A08 = A0z;
        this.A04 = AbstractC167017dG.A0D(context);
        this.A05 = AbstractC166987dD.A0T();
        this.A06 = AbstractC166987dD.A0X();
        JQ1.A0R(context, A0z);
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
