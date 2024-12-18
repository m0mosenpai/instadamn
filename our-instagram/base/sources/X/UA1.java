package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* loaded from: classes11.dex */
public abstract class UA1 extends GestureDetector.SimpleOnGestureListener {
    public boolean A00;

    public abstract void A00(MotionEvent motionEvent);

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.A00 = false;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        if (!this.A00) {
            A00(motionEvent);
            this.A00 = true;
            return true;
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        if (!this.A00 && motionEvent.getEventTime() - motionEvent.getDownTime() > ViewConfiguration.getDoubleTapTimeout()) {
            A00(motionEvent);
            this.A00 = true;
            return true;
        }
        return false;
    }
}
