package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.KMv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45742KMv extends AbstractC44335Jia {
    public final int A00;
    public final Paint A01;
    public final RectF A02;

    @Override // X.AbstractC44335Jia, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        RectF rectF = this.A02;
        float f = this.A00;
        canvas.drawRoundRect(rectF, f, f, this.A01);
        super.draw(canvas);
    }

    public C45742KMv(Resources resources, Drawable drawable) {
        super(drawable);
        this.A02 = AbstractC166987dD.A0X();
        Paint A0P = AbstractC166997dE.A0P();
        this.A01 = A0P;
        this.A00 = AbstractC166997dE.A06(resources);
        A0P.setColor(-16777216);
        AbstractC166987dD.A1R(A0P);
        drawable.getClass();
        AbstractC43594JPz.A15(drawable);
    }

    @Override // X.AbstractC44335Jia, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.A02.set(rect);
    }
}
