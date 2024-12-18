package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;

/* renamed from: X.7LI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7LI extends View {
    public C7LF A00;
    public final C7LJ A01;

    public void setCanvasRenderer(C7LF c7lf) {
        C7LF c7lf2 = this.A00;
        if (c7lf2 != null) {
            c7lf2.A00 = null;
        }
        this.A00 = c7lf;
        if (c7lf != null) {
            c7lf.A00 = this.A01;
        }
        invalidate();
    }

    public C7LI(Context context) {
        super(context);
        this.A01 = new C7LJ(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        C7LF c7lf = this.A00;
        if (c7lf != null) {
            C7LE c7le = (C7LE) c7lf;
            if (canvas.getDensity() != 0) {
                i = canvas.getDensity();
            } else {
                i = c7le.A02.getDisplayMetrics().densityDpi;
            }
            for (C69461Vnk c69461Vnk : c7le.A08) {
                Bitmap bitmap = c69461Vnk.A09;
                if (bitmap != null) {
                    Matrix matrix = c7le.A03;
                    PointF pointF = c69461Vnk.A0B;
                    matrix.setTranslate(pointF.x, pointF.y);
                    float f = c69461Vnk.A02;
                    matrix.preScale(f, f);
                    matrix.preRotate((float) ((c69461Vnk.A05 / 3.141592653589793d) * 180.0d));
                    matrix.preTranslate((-bitmap.getScaledWidth(i)) * 0.5f, (-bitmap.getScaledHeight(i)) * 0.5f);
                    Paint paint = c7le.A04;
                    paint.setAlpha((int) (c69461Vnk.A01 * 255.0f));
                    canvas.drawBitmap(bitmap, matrix, paint);
                }
            }
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C7LF c7lf = this.A00;
        if (c7lf != null) {
            int i5 = i3 - i;
            int i6 = i4 - i2;
            Rect rect = c7lf.A01;
            if (0 != rect.left || 0 != rect.top || i5 != rect.right || i6 != rect.bottom) {
                rect.set(0, 0, i5, i6);
                C7LJ c7lj = c7lf.A00;
                if (c7lj != null) {
                    C7LI c7li = c7lj.A00;
                    if (c7lf == c7li.A00) {
                        c7li.invalidate();
                    }
                }
            }
        }
    }
}
