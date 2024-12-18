package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Jj4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44365Jj4 extends Drawable implements Drawable.Callback {
    public final int A00;
    public final int A01;
    public final C6RB A02;
    public final int A03;
    public final Context A04;
    public final C44349Jio A05;
    public final C44374JjD A06;
    public final List A07;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        int A0G = AbstractC166997dE.A0G(this);
        int i = this.A01 + this.A00;
        C6RB c6rb = this.A02;
        int i2 = c6rb.A0A;
        int i3 = (i - i2) / 2;
        c6rb.setBounds(i3, A0G - c6rb.A06, i2 + i3, A0G);
        c6rb.draw(canvas);
        C44374JjD c44374JjD = this.A06;
        if (c44374JjD.A01) {
            c44374JjD.draw(canvas);
            invalidateSelf();
        } else {
            this.A05.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A01 + this.A00 + this.A03 + this.A02.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A01 + this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A05.setAlpha(i);
        this.A02.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A05.setColorFilter(colorFilter);
        this.A02.setColorFilter(colorFilter);
    }

    public C44365Jj4(Context context, UserSession userSession, List list, int i) {
        this.A04 = context;
        this.A07 = list;
        int A01 = LH0.A01(context, userSession);
        this.A00 = A01;
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
        int A02 = LH0.A02(context, userSession);
        this.A01 = A02;
        this.A03 = AbstractC167017dG.A0D(context);
        int A00 = LH0.A00(context, userSession);
        this.A05 = new C44349Jio(context, Integer.valueOf(R.color.audio_bar_action_color_enabled), i, A02, A01);
        this.A06 = new C44374JjD(context, list, new C43603JQj(this, 2), A02, A01, dimensionPixelOffset, A00);
        Spannable spannable = C6RB.A0d;
        C6RB A0z = AbstractC166987dD.A0z(context, AbstractC188878Yd.A01(context));
        A0z.A0M(A0z.A0Z.getResources().getText(2131953523));
        this.A02 = A0z;
        JQ1.A0R(context, A0z);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }
}
