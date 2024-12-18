package X;

import android.view.MotionEvent;

/* loaded from: classes8.dex */
public final class LSV implements InterfaceGestureDetectorOnGestureListenerC149756oS {
    public final /* synthetic */ LF4 A00;

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

    public LSV(LF4 lf4) {
        this.A00 = lf4;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        LF4 lf4 = this.A00;
        lf4.A00 = 0.0f;
        lf4.A01 = System.currentTimeMillis();
        lf4.A09.A01();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        LF4 lf4 = this.A00;
        float A07 = f / AbstractC166987dD.A07(lf4.A03);
        C55982hj c55982hj = lf4.A09;
        c55982hj.A08(c55982hj.A09.A00 - A07, true);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (Math.abs(f) > 500.0f) {
            this.A00.A00 = f;
            return true;
        }
        return true;
    }
}
