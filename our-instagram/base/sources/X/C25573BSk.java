package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.BSk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25573BSk extends Drawable {
    public float A00;
    public final Path A05 = AbstractC166987dD.A0T();
    public boolean A03 = true;
    public int A01 = 0;
    public final Paint A04 = AbstractC166987dD.A0S(5);
    public Paint A02 = AbstractC166987dD.A0S(1);

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void A00(int i) {
        if (this.A02.getColor() != i) {
            if (i == 0 && this.A01 != 0) {
                this.A02.setAlpha(255);
                AbstractC166997dE.A1D(this.A02, PorterDuff.Mode.CLEAR);
            } else {
                this.A02 = AbstractC166997dE.A0P();
            }
            this.A02.setColor(i);
            this.A03 = true;
            invalidateSelf();
        }
    }

    public final void A01(int i) {
        if (this.A01 != i) {
            this.A01 = i;
            if (this.A02.getColor() == 0 && this.A01 != 0) {
                this.A02.setAlpha(255);
                AbstractC166997dE.A1D(this.A02, PorterDuff.Mode.CLEAR);
            }
            this.A03 = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A04.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A04.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (this.A01 == 0) {
            canvas.drawRect(bounds, this.A02);
            float f = bounds.left;
            float f2 = bounds.top;
            float f3 = bounds.right;
            float f4 = bounds.bottom;
            float f5 = this.A00;
            canvas.drawRoundRect(f, f2, f3, f4, f5, f5, this.A04);
            return;
        }
        if (this.A03) {
            Path path = this.A05;
            path.reset();
            float f6 = this.A00 * 2.0f;
            RectF rectF = new RectF(0.0f, 0.0f, f6, f6);
            path.setFillType(Path.FillType.EVEN_ODD);
            path.moveTo(0.0f, 0.0f);
            path.lineTo(0.0f, this.A00);
            path.arcTo(rectF, 180.0f, 90.0f, true);
            path.lineTo(0.0f, 0.0f);
            path.close();
            this.A03 = false;
        }
        canvas.drawRect(bounds, this.A04);
        if ((this.A01 & 1) == 0) {
            int save = canvas.save();
            AbstractC167007dF.A0s(canvas, bounds);
            canvas.drawPath(this.A05, this.A02);
            canvas.restoreToCount(save);
        }
        if ((this.A01 & 8) == 0) {
            int save2 = canvas.save();
            canvas.translate(bounds.right, bounds.bottom);
            canvas.rotate(180.0f);
            canvas.drawPath(this.A05, this.A02);
            canvas.restoreToCount(save2);
        }
        if ((this.A01 & 4) == 0) {
            int save3 = canvas.save();
            canvas.translate(bounds.left, bounds.bottom);
            canvas.rotate(270.0f);
            canvas.drawPath(this.A05, this.A02);
            canvas.restoreToCount(save3);
        }
        if ((this.A01 & 2) != 0) {
            return;
        }
        int save4 = canvas.save();
        canvas.translate(bounds.right, bounds.top);
        canvas.rotate(90.0f);
        canvas.drawPath(this.A05, this.A02);
        canvas.restoreToCount(save4);
    }
}
