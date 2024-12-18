package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.Jil, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44346Jil extends Drawable {
    public final int A00;
    public final int A01;
    public final Path A02;
    public final Bitmap A03;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        canvas.save();
        AbstractC167017dG.A12(canvas, this);
        canvas.clipPath(this.A02);
        Bitmap bitmap = this.A03;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = this.A01;
        int i2 = this.A00;
        boolean z = C1NC.A02;
        Matrix A0Q = AbstractC166987dD.A0Q();
        C1NC.A0J(A0Q, width, height, i, i2, 0, false);
        canvas.drawBitmap(bitmap, A0Q, null);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A01;
    }

    public C44346Jil(Bitmap bitmap, Path path, int i, int i2) {
        this.A03 = bitmap;
        this.A02 = path;
        this.A01 = i;
        this.A00 = i2;
        Matrix A0Q = AbstractC166987dD.A0Q();
        RectF A0X = AbstractC166987dD.A0X();
        Path path2 = this.A02;
        path2.computeBounds(A0X, true);
        float max = Math.max(A0X.width(), A0X.height());
        A0Q.setScale(this.A01 / max, this.A00 / max);
        A0Q.postTranslate(-A0X.left, -A0X.top);
        path2.transform(A0Q);
    }
}
