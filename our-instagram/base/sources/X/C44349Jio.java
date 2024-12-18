package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* renamed from: X.Jio, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44349Jio extends Drawable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Drawable A03;
    public final GradientDrawable A04;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Drawable drawable = this.A03;
        float A0H = AbstractC166997dE.A0H(drawable);
        float A0G = AbstractC166997dE.A0G(drawable);
        GradientDrawable gradientDrawable = this.A04;
        int i = this.A01;
        int i2 = i / 2;
        int i3 = this.A02;
        gradientDrawable.setBounds(i2, i2, i2 + i3, i3 + (i / 2));
        gradientDrawable.draw(canvas);
        float f = this.A00;
        float f2 = (f - A0H) / 2.0f;
        float f3 = (f - A0G) / 2.0f;
        drawable.setBounds((int) f2, (int) f3, (int) (f2 + A0H), (int) (f3 + A0G));
        drawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A03.setAlpha(i);
        this.A04.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
        this.A04.setColorFilter(colorFilter);
    }

    public C44349Jio(Context context, Integer num, int i, int i2, int i3) {
        Drawable A06;
        this.A02 = i2;
        this.A01 = i3;
        if (num == null) {
            A06 = context.getDrawable(i);
            if (A06 == null) {
                throw AbstractC166997dE.A0g();
            }
        } else {
            A06 = C3LQ.A06(context, i, num.intValue());
        }
        this.A03 = A06;
        GradientDrawable A0D = AbstractC43594JPz.A0D();
        A0D.setCornerRadius(AbstractC166987dD.A02(i2));
        this.A04 = A0D;
        this.A00 = i2 + i3;
        int A03 = AbstractC43594JPz.A03(context);
        A06.setBounds(0, 0, Math.min(A03, A06.getIntrinsicWidth()), Math.min(A03, A06.getIntrinsicHeight()));
    }
}
