package X;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.9zB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226539zB {
    public static final void A00(Path path, Rect rect) {
        C14360o3.A0B(rect, 1);
        RectF A0X = AbstractC166987dD.A0X();
        path.computeBounds(A0X, true);
        float width = rect.width();
        float height = rect.height();
        float min = Math.min(width / A0X.width(), height / A0X.height());
        float width2 = (rect.left + ((width - (A0X.width() * min)) / 2.0f)) - (A0X.left * min);
        float height2 = (rect.top + ((height - (A0X.height() * min)) / 2.0f)) - (A0X.top * min);
        Matrix A0Q = AbstractC166987dD.A0Q();
        A0Q.reset();
        A0Q.postScale(min, min);
        A0Q.postTranslate(width2, height2);
        path.transform(A0Q);
    }
}
