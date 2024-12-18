package X;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;

/* loaded from: classes11.dex */
public final class WKs implements GestureDetector.OnGestureListener {
    public static final int A05 = ViewConfiguration.getTapTimeout() * 2;
    public MotionEvent A00;
    public boolean A01;
    public final C68763Vbg A02;
    public final U95 A03;
    public final GestureDetector A04;

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.A01 = true;
        MotionEvent motionEvent2 = this.A00;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.A00 = MotionEvent.obtain(motionEvent);
        U95 u95 = this.A03;
        u95.removeMessages(0);
        u95.sendEmptyMessageAtTime(0, motionEvent.getDownTime() + A05);
        ViewOnTouchListenerC67974V4p viewOnTouchListenerC67974V4p = this.A02.A00;
        viewOnTouchListenerC67974V4p.A0A = C05F.A01;
        viewOnTouchListenerC67974V4p.A02.setVisibility(4);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public final void A00(MotionEvent motionEvent) {
        this.A04.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 3) {
                this.A03.removeCallbacksAndMessages(null);
                this.A01 = false;
                ViewOnTouchListenerC67974V4p viewOnTouchListenerC67974V4p = this.A02.A00;
                viewOnTouchListenerC67974V4p.A0A = C05F.A00;
                viewOnTouchListenerC67974V4p.A0F.A04();
                return;
            }
            return;
        }
        this.A03.removeMessages(0);
        if (this.A01) {
            return;
        }
        ViewOnTouchListenerC67974V4p viewOnTouchListenerC67974V4p2 = this.A02.A00;
        if (viewOnTouchListenerC67974V4p2.A0A == C05F.A0C) {
            ViewOnTouchListenerC67974V4p.A02(viewOnTouchListenerC67974V4p2);
        } else {
            viewOnTouchListenerC67974V4p2.A08.Du7(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        ViewOnTouchListenerC67974V4p viewOnTouchListenerC67974V4p = this.A02.A00;
        if (viewOnTouchListenerC67974V4p.A0A == C05F.A0N) {
            viewOnTouchListenerC67974V4p.A08.onScroll(motionEvent, motionEvent2, f, f2);
            return false;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.U95, android.os.Handler] */
    public WKs(Context context, C68763Vbg c68763Vbg) {
        this.A02 = c68763Vbg;
        WeakReference weakReference = new WeakReference(this);
        ?? handler = new Handler();
        handler.A00 = weakReference;
        this.A03 = handler;
        GestureDetector gestureDetector = new GestureDetector(context, this);
        this.A04 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
    }
}
