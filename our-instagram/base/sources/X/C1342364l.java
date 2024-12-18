package X;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.64l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1342364l implements ValueAnimator.AnimatorUpdateListener {
    public static final C64m A04;
    public float A00;
    public ValueAnimator A01;
    public final Drawable A02;
    public final View A03;

    public final void A02(MotionEvent motionEvent) {
        C64m c64m;
        Message obtain;
        long j;
        C14360o3.A0B(motionEvent, 0);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    C64m c64m2 = A04;
                    if (c64m2.hasMessages(1, this)) {
                        c64m2.removeMessages(1, this);
                        return;
                    }
                } else {
                    return;
                }
            } else {
                c64m = A04;
                if (c64m.hasMessages(1, this)) {
                    c64m.removeMessages(1, this);
                    A01(this);
                    obtain = Message.obtain(c64m, 2, this);
                    j = 200;
                }
            }
            A00(this);
            return;
        }
        c64m = A04;
        c64m.removeMessages(2, this);
        obtain = Message.obtain(c64m, 1, this);
        j = 75;
        c64m.sendMessageDelayed(obtain, j);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C14360o3.A0B(valueAnimator, 0);
        Object animatedValue = valueAnimator.getAnimatedValue();
        C14360o3.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this.A00 = ((Number) animatedValue).floatValue();
        View view = this.A03;
        if (view != null) {
            view.invalidate();
            return;
        }
        Drawable drawable = this.A02;
        if (drawable == null) {
            return;
        }
        drawable.invalidateSelf();
    }

    public static final void A00(C1342364l c1342364l) {
        ValueAnimator valueAnimator = c1342364l.A01;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(400L);
        duration.addUpdateListener(c1342364l);
        duration.start();
        c1342364l.A01 = duration;
    }

    public static final void A01(C1342364l c1342364l) {
        ValueAnimator valueAnimator = c1342364l.A01;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c1342364l.A00 = 1.0f;
        View view = c1342364l.A03;
        if (view != null) {
            view.invalidate();
            return;
        }
        Drawable drawable = c1342364l.A02;
        if (drawable == null) {
            return;
        }
        drawable.invalidateSelf();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.64m, android.os.Handler] */
    static {
        Looper mainLooper = Looper.getMainLooper();
        C14360o3.A07(mainLooper);
        A04 = new Handler(mainLooper);
    }

    public C1342364l(Drawable drawable) {
        this.A02 = drawable;
        this.A03 = null;
    }

    public C1342364l(View view) {
        this.A03 = view;
        this.A02 = null;
    }
}
