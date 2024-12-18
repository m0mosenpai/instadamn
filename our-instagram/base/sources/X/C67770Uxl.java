package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.Uxl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67770Uxl extends C65O {
    public int A00;
    public final Paint A01;
    public final RectF A02;

    public C67770Uxl(C65Q c65q) {
        super(c65q == null ? new C65Q() : c65q);
        Paint paint = new Paint(1);
        this.A01 = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        AbstractC166997dE.A1D(paint, PorterDuff.Mode.DST_OUT);
        this.A02 = new RectF();
    }

    public final void A0J(float f, float f2, float f3, float f4) {
        RectF rectF = this.A02;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    @Override // X.C65O, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
            }
        } else {
            this.A00 = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        }
        super.draw(canvas);
        canvas.drawRect(this.A02, this.A01);
        if (!(getCallback() instanceof View)) {
            canvas.restoreToCount(this.A00);
        }
    }

    public C67770Uxl() {
        this(null);
    }
}
