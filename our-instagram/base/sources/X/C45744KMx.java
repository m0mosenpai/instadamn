package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.KMx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45744KMx extends AbstractC44335Jia {
    public int A00;
    public final Paint A01;
    public final Path A02;
    public final Rect A03;
    public final RectF A04;
    public final String A05;

    @Override // X.AbstractC44335Jia, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String str = this.A05;
        int i = 255;
        if (str != null) {
            i = 128;
        }
        setAlpha(i);
        super.draw(canvas);
        Drawable drawable = super.A00;
        Paint paint = this.A01;
        if (drawable != null) {
            paint.setColor(-16777216);
            canvas.drawPath(this.A02, paint);
        } else {
            paint.setColor(-16777216);
            canvas.drawRect(this.A04, paint);
        }
        if (str != null) {
            paint.setColor(this.A00);
            paint.setFakeBoldText(true);
            paint.setTextSize(AbstractC166997dE.A0G(this) * 0.18f);
            paint.getTextBounds(str, 0, str.length(), this.A03);
            canvas.drawText(str, AbstractC166997dE.A0F(this), getBounds().top + (AbstractC166997dE.A0G(this) / 2) + (r3.height() / 2), paint);
        }
    }

    @Override // X.AbstractC44335Jia, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
        RectF rectF = this.A04;
        rectF.set(rect);
        Path path = this.A02;
        path.reset();
        path.addRect(rectF, Path.Direction.CW);
        path.addRect(rectF, Path.Direction.CCW);
    }

    public C45744KMx(Drawable drawable, String str) {
        super(drawable);
        Paint A0P = AbstractC166997dE.A0P();
        this.A01 = A0P;
        this.A03 = AbstractC166987dD.A0U();
        this.A00 = -1;
        this.A04 = AbstractC166987dD.A0X();
        Path A0T = AbstractC166987dD.A0T();
        this.A02 = A0T;
        A0T.setFillType(Path.FillType.EVEN_ODD);
        this.A05 = str;
        A0P.setTextAlign(Paint.Align.CENTER);
        A0P.setStrokeWidth(1.0f);
    }
}
