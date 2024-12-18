package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes11.dex */
public final class UMN extends C162867Qx {
    public int A00;
    public int A01;
    public Matrix A02;
    public Matrix A03;
    public PointF A04;
    public InterfaceC27851Wn A05;

    public final void A02() {
        float f;
        float f2;
        Drawable drawable = super.A00;
        Matrix matrix = null;
        if (drawable == null) {
            this.A00 = 0;
            this.A01 = 0;
        } else {
            Rect bounds = getBounds();
            int width = bounds.width();
            int height = bounds.height();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            this.A01 = intrinsicWidth;
            int intrinsicHeight = drawable.getIntrinsicHeight();
            this.A00 = intrinsicHeight;
            if (intrinsicWidth <= 0 || intrinsicHeight <= 0 || ((intrinsicWidth == width && intrinsicHeight == height) || this.A05 == InterfaceC27851Wn.A08)) {
                drawable.setBounds(bounds);
            } else {
                drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                matrix = this.A03;
                matrix.reset();
                InterfaceC27851Wn interfaceC27851Wn = this.A05;
                PointF pointF = this.A04;
                if (pointF != null) {
                    f = pointF.x;
                    f2 = pointF.y;
                } else {
                    f = 0.5f;
                    f2 = 0.5f;
                }
                ((AbstractC27881Wq) interfaceC27851Wn).A00(matrix, bounds, f, f2, bounds.width() / intrinsicWidth, bounds.height() / intrinsicHeight, intrinsicWidth, intrinsicHeight);
            }
        }
        this.A02 = matrix;
    }

    @Override // X.C162867Qx, X.InterfaceC162877Qy
    public final void CAW(Matrix matrix) {
        InterfaceC162877Qy interfaceC162877Qy = super.A01;
        if (interfaceC162877Qy != null) {
            interfaceC162877Qy.CAW(matrix);
        } else {
            matrix.reset();
        }
        Drawable drawable = super.A00;
        if (drawable != null && (this.A01 != drawable.getIntrinsicWidth() || this.A00 != drawable.getIntrinsicHeight())) {
            A02();
        }
        Matrix matrix2 = this.A02;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    @Override // X.C162867Qx, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = super.A00;
        if (drawable != null && (this.A01 != drawable.getIntrinsicWidth() || this.A00 != drawable.getIntrinsicHeight())) {
            A02();
        }
        if (this.A02 != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.A02);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    public UMN(Drawable drawable, InterfaceC27851Wn interfaceC27851Wn) {
        super(drawable);
        this.A04 = null;
        this.A01 = 0;
        this.A00 = 0;
        this.A03 = new Matrix();
        this.A05 = interfaceC27851Wn;
    }

    @Override // X.C162867Qx
    public final Drawable A01(Drawable drawable) {
        Drawable A01 = super.A01(drawable);
        A02();
        return A01;
    }

    @Override // X.C162867Qx, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        A02();
    }
}
