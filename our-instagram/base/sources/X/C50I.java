package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewParent;

/* renamed from: X.50I, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C50I implements GestureDetector.OnGestureListener {
    public boolean A00;
    public float A01;
    public float A02;
    public float A03;
    public final GestureDetector A05;
    public final C41L A06;
    public final float A08;
    public final InterfaceC100894g1 A09;
    public final Handler A04 = new Handler(Looper.getMainLooper());
    public final Runnable A07 = new Runnable() { // from class: X.50J
        @Override // java.lang.Runnable
        public final void run() {
            C50I c50i = C50I.this;
            c50i.A00 = true;
            C41L c41l = c50i.A06;
            c41l.setGestureInProgress(true);
            ViewParent parent = c41l.getParent();
            parent.getClass();
            parent.requestDisallowInterceptTouchEvent(true);
            C2UY.A01.A06();
        }
    };

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
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

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.A00) {
            float f3 = this.A01;
            float f4 = this.A02;
            float rawX = motionEvent2.getRawX() - f3;
            float rawY = motionEvent2.getRawY() - f4;
            if (((float) Math.sqrt((rawX * rawX) + (rawY * rawY))) > this.A08) {
                this.A04.removeCallbacks(this.A07);
            }
        } else {
            if (this.A03 == -1.0f) {
                this.A03 = motionEvent2.getRawX();
            }
            float rawX2 = motionEvent2.getRawX();
            float f5 = rawX2 - this.A03;
            C41L c41l = this.A06;
            if (Math.abs(f5) > c41l.getWidth() / Math.min(c41l.A05, c41l.A06)) {
                this.A03 = rawX2;
                InterfaceC100894g1 interfaceC100894g1 = this.A09;
                if (f5 > 0.0f) {
                    interfaceC100894g1.DVr();
                    return true;
                }
                interfaceC100894g1.Daw();
                return true;
            }
        }
        return true;
    }

    public C50I(C41L c41l, InterfaceC100894g1 interfaceC100894g1) {
        this.A06 = c41l;
        this.A09 = interfaceC100894g1;
        Context context = c41l.getContext();
        GestureDetector gestureDetector = new GestureDetector(context, this);
        this.A05 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.A08 = AbstractC13880nE.A04(context, 5);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.A01 = motionEvent.getRawX();
        this.A02 = motionEvent.getRawY();
        this.A03 = -1.0f;
        Handler handler = this.A04;
        Runnable runnable = this.A07;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 200L);
        return true;
    }
}
