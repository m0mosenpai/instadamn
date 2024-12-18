package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes11.dex */
public final class ULU extends AbstractC66278U6y {
    public float A00;
    public W55 A01;
    public final float A02;
    public final Rect A03;
    public final RectF A04;
    public final RectF A05;
    public final Drawable A06;
    public final VGB A07;
    public final Paint A08;

    @Override // X.AbstractC66278U6y
    public final void A0D(Canvas canvas) {
        Drawable drawable = this.A06;
        drawable.setBounds(this.A03);
        canvas.drawCircle(r1.centerX(), r1.centerY(), r1.width() >> 1, this.A08);
        drawable.setAlpha(76);
        drawable.draw(canvas);
    }

    public ULU(Drawable drawable, C70394WTw c70394WTw, VGB vgb, W55 w55) {
        super(c70394WTw);
        Paint paint = new Paint();
        this.A08 = paint;
        this.A04 = new RectF();
        this.A05 = new RectF();
        this.A03 = new Rect();
        this.A01 = w55;
        this.A06 = drawable;
        this.A02 = (this.A0A * 48.0f) / 2.0f;
        this.A00 = (int) (r2 * 8.0f);
        super.A03 = 5;
        super.A02 = 4.0f;
        this.A07 = vgb;
        paint.setColor(-1);
        paint.setAlpha(178);
    }
}
