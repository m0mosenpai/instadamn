package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.Jip, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44350Jip extends Drawable {
    public final float A00;
    public final Context A01;
    public final Paint A02;
    public final Drawable A03;
    public final C177917vQ A04;

    public C44350Jip(Context context, Drawable drawable) {
        this.A01 = context;
        this.A03 = drawable;
        Paint A0S = AbstractC166987dD.A0S(1);
        this.A02 = A0S;
        float f = AbstractC167007dF.A0K(context).density;
        this.A00 = 23.0f * f;
        AbstractC166987dD.A1R(A0S);
        AbstractC166987dD.A1N(context, A0S, AbstractC53242c7.A0D(context));
        this.A04 = new C177917vQ(AbstractC167007dF.A09(context, R.attr.igds_color_drawer_shadow), AbstractC166987dD.A0A(f, 10.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Rect A0W = AbstractC166987dD.A0W(this);
        C177917vQ c177917vQ = this.A04;
        c177917vQ.setBounds(A0W);
        c177917vQ.draw(canvas);
        float exactCenterX = A0W.exactCenterX();
        float exactCenterY = A0W.exactCenterY();
        canvas.drawCircle(exactCenterX, exactCenterY, this.A00, this.A02);
        Drawable drawable = this.A03;
        drawable.setBounds((int) (exactCenterX - (drawable.getIntrinsicWidth() / 2)), (int) (exactCenterY - (drawable.getIntrinsicHeight() / 2)), (int) ((drawable.getIntrinsicWidth() / 2) + exactCenterX), (int) (exactCenterX + (drawable.getIntrinsicHeight() / 2)));
        drawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return AbstractC166987dD.A0A(this.A00, 2.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return AbstractC166987dD.A0A(this.A00, 2.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A02.setAlpha(i);
        this.A04.setAlpha(i);
        invalidateSelf();
    }
}
