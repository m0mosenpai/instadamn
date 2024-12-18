package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.Jiq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44351Jiq extends Drawable {
    public final float A00;
    public final float A01;
    public final Paint A02;
    public final Drawable A03;
    public final C177917vQ A04;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return AbstractC166987dD.A0A(this.A01, 2.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return AbstractC166987dD.A0A(this.A01, 2.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A03.setAlpha(i);
        this.A02.setAlpha(i);
        this.A04.setAlpha(i);
        invalidateSelf();
    }

    public C44351Jiq(Context context, Drawable drawable) {
        Paint A0P = AbstractC166997dE.A0P();
        this.A02 = A0P;
        float f = AbstractC167007dF.A0K(context).density;
        this.A01 = 23.0f * f;
        this.A00 = 13.0f * f;
        this.A03 = drawable;
        AbstractC25231BEo.A0x(context, drawable, AbstractC53242c7.A08(context));
        AbstractC166987dD.A1R(A0P);
        AbstractC166987dD.A1N(context, A0P, AbstractC53242c7.A0D(context));
        this.A04 = new C177917vQ(AbstractC167007dF.A09(context, R.attr.igds_color_drawer_shadow), AbstractC166987dD.A0A(f, 10.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        C177917vQ c177917vQ = this.A04;
        c177917vQ.setBounds(bounds);
        c177917vQ.draw(canvas);
        float exactCenterX = bounds.exactCenterX();
        float exactCenterY = bounds.exactCenterY();
        float f = this.A01;
        canvas.drawCircle(exactCenterX, exactCenterY, f, this.A02);
        Drawable drawable = this.A03;
        float f2 = this.A00;
        drawable.setBounds((int) ((exactCenterX - f) + f2), (int) ((exactCenterY - f) + f2), (int) ((exactCenterX + f) - f2), (int) ((exactCenterY + f) - f2));
        drawable.draw(canvas);
    }
}
