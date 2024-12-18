package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;

/* loaded from: classes11.dex */
public final class V4H extends AbstractC65806TuP {
    /* JADX WARN: Type inference failed for: r3v0, types: [X.UAM, android.view.View, java.lang.Object] */
    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        C14360o3.A0B(context, 0);
        ?? view = new View(context);
        view.setWillNotDraw(false);
        view.setLayerType(2, null);
        Paint paint = new Paint(1);
        view.A04 = paint;
        paint.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint(1);
        view.A05 = paint2;
        paint2.setStyle(Paint.Style.FILL);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        view.A01 = ofFloat;
        C14360o3.A0A(ofFloat);
        ofFloat.setDuration(500L);
        ValueAnimator valueAnimator = view.A01;
        C14360o3.A0A(valueAnimator);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        ValueAnimator valueAnimator2 = view.A01;
        C14360o3.A0A(valueAnimator2);
        valueAnimator2.addUpdateListener(new WGz(view));
        view.A06 = new Point();
        view.A09 = true;
        view.A07 = new RectF();
        view.A08 = new RectF();
        view.A02 = new Matrix();
        view.A03 = new Matrix();
        return view;
    }

    public V4H(C6FG c6fg, C102884kP c102884kP) {
        super(c6fg, c102884kP);
    }
}
