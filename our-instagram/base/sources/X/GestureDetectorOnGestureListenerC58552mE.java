package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.2mE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class GestureDetectorOnGestureListenerC58552mE implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    public GestureDetector.OnDoubleTapListener A00;
    public final GestureDetector.OnGestureListener A01;

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        GestureDetector.OnDoubleTapListener onDoubleTapListener;
        if (motionEvent != null && (onDoubleTapListener = this.A00) != null) {
            return onDoubleTapListener.onDoubleTap(motionEvent);
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        GestureDetector.OnDoubleTapListener onDoubleTapListener;
        if (motionEvent != null && (onDoubleTapListener = this.A00) != null) {
            return onDoubleTapListener.onDoubleTapEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return true;
        }
        return this.A01.onDown(motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent != null && motionEvent2 != null) {
            return this.A01.onFling(motionEvent, motionEvent2, f, f2);
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        if (motionEvent != null) {
            this.A01.onLongPress(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent != null && motionEvent2 != null) {
            return this.A01.onScroll(motionEvent, motionEvent2, f, f2);
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        if (motionEvent != null) {
            this.A01.onShowPress(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        GestureDetector.OnDoubleTapListener onDoubleTapListener;
        if (motionEvent != null && (onDoubleTapListener = this.A00) != null) {
            return onDoubleTapListener.onSingleTapConfirmed(motionEvent);
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return true;
        }
        return this.A01.onSingleTapUp(motionEvent);
    }

    public GestureDetectorOnGestureListenerC58552mE(GestureDetector.OnGestureListener onGestureListener) {
        this.A01 = onGestureListener;
        if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
            this.A00 = (GestureDetector.OnDoubleTapListener) onGestureListener;
        }
    }
}
