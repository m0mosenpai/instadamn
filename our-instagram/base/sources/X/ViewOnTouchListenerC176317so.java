package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;

/* renamed from: X.7so, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnTouchListenerC176317so implements View.OnTouchListener {
    public View.OnTouchListener A00;
    public final ScaleGestureDetector A01;
    public final ScaleGestureDetectorOnScaleGestureListenerC176337sq A02;
    public final GestureDetector A03;
    public final C175007qa A04;
    public final GestureDetectorOnGestureListenerC176327sp A05;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.7sp, android.view.GestureDetector$OnGestureListener] */
    public ViewOnTouchListenerC176317so(final C175007qa c175007qa, boolean z) {
        this.A04 = c175007qa;
        InterfaceC174927qS interfaceC174927qS = c175007qa.A0O;
        Context applicationContext = interfaceC174927qS.getContext().getApplicationContext();
        ?? r1 = new GestureDetector.OnGestureListener(c175007qa) { // from class: X.7sp
            public final C175007qa A00;

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final void onShowPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                this.A00.A07(motionEvent.getX(), motionEvent.getY());
                return true;
            }

            {
                this.A00 = c175007qa;
            }
        };
        this.A05 = r1;
        Handler handler = new Handler(Looper.getMainLooper());
        this.A03 = new GestureDetector(applicationContext, r1, handler);
        ScaleGestureDetectorOnScaleGestureListenerC176337sq scaleGestureDetectorOnScaleGestureListenerC176337sq = new ScaleGestureDetectorOnScaleGestureListenerC176337sq(c175007qa.A0N, interfaceC174927qS);
        this.A02 = scaleGestureDetectorOnScaleGestureListenerC176337sq;
        scaleGestureDetectorOnScaleGestureListenerC176337sq.A00 = true;
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(applicationContext, scaleGestureDetectorOnScaleGestureListenerC176337sq, handler);
        this.A01 = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
        View view = interfaceC174927qS.getView();
        if (z && view != null) {
            view.setOnTouchListener(this);
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C175007qa c175007qa = this.A04;
        if (!c175007qa.A0O.CWm() || !c175007qa.A0N.isConnected()) {
            return false;
        }
        View.OnTouchListener onTouchListener = this.A00;
        if (onTouchListener == null || !onTouchListener.onTouch(view, motionEvent)) {
            return this.A03.onTouchEvent(motionEvent) || this.A01.onTouchEvent(motionEvent);
        }
        return true;
    }
}
