package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import com.facebook.R;

/* renamed from: X.9St, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210549St extends Drawable implements BD2 {
    public float A00;
    public final Paint A01;
    public final RectF A02 = AbstractC166987dD.A0X();
    public final C6RB A03;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        RectF rectF = this.A02;
        float f = this.A00;
        canvas.drawRoundRect(rectF, f, f, this.A01);
        this.A03.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        this.A02.set(getBounds());
        C6RB c6rb = this.A03;
        c6rb.A0E(rect.width());
        int i = c6rb.A06;
        int i2 = c6rb.A0A;
        int height = rect.top + ((rect.height() - i) / 2);
        int width = rect.left + ((rect.width() - i2) / 2);
        AbstractC166997dE.A1G(c6rb, width, height, i2 + width, i + height);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // X.BD2
    public final float Arr() {
        return this.A00;
    }

    @Override // X.BD2
    public final void ESD(float f) {
        this.A00 = f;
        invalidateSelf();
    }

    public C210549St(Context context, float f) {
        Paint A0R = AbstractC166987dD.A0R();
        AbstractC166987dD.A1N(context, A0R, R.color.black_60_transparent);
        this.A01 = A0R;
        C6RB A0z = AbstractC166987dD.A0z(context, 0);
        A0z.A0A(f);
        AbstractC166997dE.A1C(context.getResources(), A0z, 2131976919);
        A0z.A0K(Layout.Alignment.ALIGN_CENTER);
        this.A03 = A0z;
    }
}
