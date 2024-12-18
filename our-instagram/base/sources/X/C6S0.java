package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.view.ViewTreeObserver;

/* renamed from: X.6S0, reason: invalid class name */
/* loaded from: classes3.dex */
public interface C6S0 extends ViewTreeObserver.OnPreDrawListener, C6S1 {
    void AQP(Canvas canvas);

    void AQX(Canvas canvas, Paint paint, Spanned spanned, int i, int i2, int i3, int i4, int i5);

    int BgK();

    C6S5 C6E();

    void ERf(int i, int i2);

    void EfY(C6S5 c6s5);

    void FCG(Layout layout, Integer num, float f, int i, int i2);
}
