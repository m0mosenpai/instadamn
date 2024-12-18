package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* loaded from: classes11.dex */
public abstract class W8d {
    public static final ThreadLocal A00 = new ThreadLocal();
    public static final ThreadLocal A01 = new ThreadLocal();

    public static void A00(Matrix matrix, View view, ViewParent viewParent) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            A00(matrix, (View) parent, viewParent);
            matrix.preTranslate(-r2.getScrollX(), -r2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }

    public static void A01(Rect rect, View view, ViewGroup viewGroup) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal = A00;
        Matrix matrix = (Matrix) threadLocal.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal.set(matrix);
        } else {
            matrix.reset();
        }
        A00(matrix, view, viewGroup);
        ThreadLocal threadLocal2 = A01;
        RectF rectF = (RectF) threadLocal2.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal2.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }
}
