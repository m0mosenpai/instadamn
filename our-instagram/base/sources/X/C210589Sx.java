package X;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;

@Deprecated
/* renamed from: X.9Sx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210589Sx extends ShapeDrawable implements InterfaceC161477Li {
    public int A00;
    public int A01;
    public ColorStateList A02;
    public Shader A03;
    public int A04;
    public final Paint A05;
    public final Matrix A06;
    public final Paint A07;

    public static void A00(C210589Sx c210589Sx) {
        if (c210589Sx.A03 != null) {
            Matrix matrix = c210589Sx.A06;
            matrix.setTranslate(0.0f, -c210589Sx.A04);
            c210589Sx.A03.setLocalMatrix(matrix);
        }
    }

    @Override // X.InterfaceC161477Li
    public final void Eg1(int i) {
        if (this.A04 != i && this.A03 != null) {
            this.A04 = i;
            A00(this);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.A05;
        int alpha = paint.getAlpha();
        int i = this.A00;
        int i2 = (alpha * (i + (i >> 7))) >> 8;
        if (i2 != 0) {
            paint.setAlpha(i2);
            getShape().draw(canvas, paint);
            paint.setAlpha(alpha);
        }
        this.A07.getAlpha();
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        int alpha = this.A05.getAlpha();
        int i = this.A00;
        int i2 = (alpha * (i + (i >> 7))) >> 8;
        this.A07.getAlpha();
        if (i2 != 0) {
            return -3;
        }
        return -2;
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return AbstractC167007dF.A1W(this.A02);
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.A02;
        if (colorStateList != null) {
            this.A05.setColor(colorStateList.getColorForState(getState(), this.A01));
        }
        invalidateSelf();
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A05.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C210589Sx(Shape shape) {
        super(shape);
        this.A06 = AbstractC166987dD.A0Q();
        this.A05 = AbstractC166987dD.A0S(1);
        this.A00 = 255;
        this.A07 = AbstractC166987dD.A0S(1);
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        A00(this);
    }
}
