package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes5.dex */
public final class BUU extends Drawable {
    public final float A00;
    public final float A01;
    public final Rect A02 = new Rect();
    public final BUQ A03;
    public final BUQ A04;

    public static BUU A00(Context context, float f, float f2) {
        float A04 = AbstractC13880nE.A04(context, 1);
        int alpha = Color.alpha(637534208);
        return new BUU(A04, f, f2, AbstractC167017dG.A02(637534208, Math.min(alpha, Math.round((f / AbstractC13880nE.A04(context, 10)) * alpha))));
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public BUU(float f, float f2, float f3, int i) {
        C02R.A05(AbstractC25230BEn.A1P((f > f2 ? 1 : (f == f2 ? 0 : -1))));
        this.A01 = f2;
        this.A00 = f;
        this.A03 = new BUQ(855638016, f, f3);
        this.A04 = new BUQ(i, f2, f3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.A04.draw(canvas);
        this.A03.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Rect rect2 = this.A02;
        rect2.set(rect);
        int round = Math.round(this.A01 - this.A00);
        rect2.inset(round, round);
        this.A03.setBounds(rect2);
        this.A04.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A03.mutate().setAlpha(i);
        this.A04.mutate().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A03.mutate().setColorFilter(colorFilter);
        this.A04.mutate().setColorFilter(colorFilter);
    }
}
