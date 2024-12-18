package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class Ma6 extends Drawable implements Drawable.Callback {
    public boolean A00;
    public Drawable A01;
    public boolean A02;
    public final float A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final float A07;
    public final float A08;
    public final RectF A0B = AbstractC166987dD.A0X();
    public final RectF A0A = AbstractC166987dD.A0X();
    public final Path A09 = new Path();

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        RectF rectF;
        C14360o3.A0B(canvas, 0);
        Path path = this.A09;
        path.reset();
        if (this.A02) {
            rectF = this.A0A;
        } else {
            rectF = this.A0B;
        }
        float f = this.A07;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawRect(this.A0B, (Paint) this.A04.getValue());
        boolean z = this.A02;
        Drawable drawable = this.A01;
        if (z) {
            drawable.draw(canvas);
            RectF rectF2 = new RectF(this.A0A);
            float f2 = this.A08;
            rectF2.inset(f2, f2);
            canvas.drawRoundRect(rectF2, f, f, (Paint) this.A06.getValue());
            float f3 = this.A03;
            rectF2.inset(f3, f3);
            canvas.drawRoundRect(rectF2, f, f, (Paint) this.A05.getValue());
            return;
        }
        drawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        C14360o3.A0B(iArr, 0);
        boolean z = this.A02;
        boolean z2 = false;
        this.A02 = false;
        boolean z3 = false;
        int length = iArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (iArr[i] == 16842913) {
                this.A02 = true;
                z3 = true;
                break;
            }
            i++;
        }
        if (z != z3) {
            z2 = true;
        }
        if (this.A00 && z2) {
            A00();
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    private final void A00() {
        RectF rectF;
        if (this.A02) {
            rectF = this.A0B;
        } else {
            rectF = this.A0A;
        }
        Rect A0U = AbstractC166987dD.A0U();
        rectF.roundOut(A0U);
        Drawable drawable = this.A01;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (intrinsicWidth == -1) {
            intrinsicWidth = A0U.width();
        }
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicHeight == -1) {
            intrinsicHeight = A0U.height();
        }
        int i = intrinsicWidth / 2;
        int i2 = intrinsicHeight / 2;
        drawable.setBounds(Math.max(0, A0U.centerX() - i), Math.max(0, A0U.centerY() - i2), Math.min(A0U.right, A0U.centerX() + i), Math.min(A0U.bottom, A0U.centerY() + i2));
    }

    public Ma6(Context context, Drawable drawable, boolean z) {
        this.A01 = drawable;
        this.A07 = MSZ.A01(context);
        this.A08 = context.getResources().getDimension(R.dimen.account_recs_header_image_margin);
        this.A03 = context.getResources().getDimension(R.dimen.afi_indicator_arrow_margin_top);
        this.A04 = AbstractC09440dt.A01(new C50168MDv(24, context, z));
        this.A06 = AbstractC09440dt.A01(new D8O(7, context, this, z));
        this.A05 = AbstractC09440dt.A01(new D8O(6, context, this, z));
        this.A01.setCallback(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        RectF rectF = this.A0A;
        rectF.set(i, i2, i3, i4);
        RectF rectF2 = this.A0B;
        rectF2.set(rectF);
        if (this.A00) {
            float f = (this.A03 * 2.0f) + this.A08;
            rectF2.inset(f, f);
        }
        A00();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }
}
