package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.JiX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44332JiX extends Drawable {
    public final Paint A00;
    public final RectF A01;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public C44332JiX(int i) {
        Paint A0R = AbstractC166987dD.A0R();
        this.A00 = A0R;
        A0R.setAntiAlias(true);
        A0R.setColor(i);
        this.A01 = AbstractC166987dD.A0X();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float A0G = AbstractC166997dE.A0G(this);
        float A0H = AbstractC166997dE.A0H(this);
        float f = A0G / 2.0f;
        RectF rectF = this.A01;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = A0H;
        rectF.bottom = A0G;
        canvas.drawRoundRect(rectF, f, f, this.A00);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        throw AbstractC43592JPx.A11();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw AbstractC43592JPx.A11();
    }
}
