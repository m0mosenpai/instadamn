package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Jij, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44344Jij extends Drawable {
    public final C44349Jio A00;
    public final int A01;
    public final C6RB A02;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        C44349Jio c44349Jio = this.A00;
        c44349Jio.draw(canvas);
        int A0G = AbstractC166997dE.A0G(this);
        int i = c44349Jio.A00;
        C6RB c6rb = this.A02;
        int i2 = c6rb.A0A;
        int i3 = (i - i2) / 2;
        c6rb.setBounds(i3, A0G - c6rb.A06, i2 + i3, A0G);
        c6rb.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A00.A00 + this.A01 + this.A02.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A00.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A00.setAlpha(i);
        this.A02.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A00.setColorFilter(colorFilter);
        this.A02.setColorFilter(colorFilter);
    }

    public C44344Jij(Context context, UserSession userSession, int i) {
        this.A00 = new C44349Jio(context, Integer.valueOf(R.color.audio_bar_action_color_enabled), i, LH0.A02(context, userSession), LH0.A01(context, userSession));
        Spannable spannable = C6RB.A0d;
        C6RB A0z = AbstractC166987dD.A0z(context, AbstractC188878Yd.A01(context));
        A0z.A0M(context.getResources().getText(2131953523));
        this.A02 = A0z;
        this.A01 = AbstractC167017dG.A0D(context);
        JQ1.A0R(context, A0z);
    }
}
