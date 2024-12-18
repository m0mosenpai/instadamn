package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.Jic, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44337Jic extends Drawable {
    public final Path A00;
    public final Paint A01;
    public final Path A02;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        canvas.drawPath(this.A02, this.A01);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        Matrix A0Q = AbstractC166987dD.A0Q();
        RectF A0X = AbstractC166987dD.A0X();
        Path path = this.A00;
        path.computeBounds(A0X, true);
        float max = Math.max(A0X.width(), A0X.height());
        A0Q.setScale(AbstractC166997dE.A0H(this) / max, AbstractC166997dE.A0G(this) / max);
        A0Q.postTranslate(-A0X.left, -A0X.top);
        path.transform(A0Q);
        Path path2 = this.A02;
        path2.reset();
        path2.addRect(new RectF(rect), Path.Direction.CW);
        path2.op(path, Path.Op.DIFFERENCE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C44337Jic(Path path, int i) {
        this.A00 = path;
        Paint A0P = AbstractC166997dE.A0P();
        AbstractC166987dD.A1R(A0P);
        A0P.setColor(i);
        this.A01 = A0P;
        this.A02 = AbstractC166987dD.A0T();
    }
}
