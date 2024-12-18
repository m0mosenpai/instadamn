package X;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture;

/* loaded from: classes4.dex */
public final class APt implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    public final /* synthetic */ AKQ A00;

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
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
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    public APt(AKQ akq) {
        this.A00 = akq;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        AKQ akq = this.A00;
        int i = AKQ.A0K;
        MotionEvent motionEvent2 = akq.A05;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        akq.A05 = MotionEvent.obtain(motionEvent);
        Handler handler = akq.A0F;
        Runnable runnable = akq.A0I;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, AKQ.A0L + AKQ.A0K);
        akq.A07 = AbstractC166997dE.A0b();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float y;
        AKQ akq = this.A00;
        int i = AKQ.A0K;
        if (akq.A0E && !akq.A06.booleanValue()) {
            akq.A0F.removeCallbacks(akq.A0I);
            akq.A07 = false;
            float x = motionEvent2.getX();
            float y2 = motionEvent2.getY();
            Boolean bool = akq.A09;
            if (bool == null) {
                if (motionEvent != null) {
                    akq.A0C = Float.valueOf(motionEvent.getX());
                    y = motionEvent.getY();
                } else {
                    akq.A0C = Float.valueOf(motionEvent2.getX());
                    y = motionEvent2.getY();
                }
                akq.A0D = Float.valueOf(y);
                C2039790k c2039790k = akq.A0H.A02;
                c2039790k.A0E = true;
                bool = Boolean.valueOf(c2039790k.A0Q.contains(Gesture.GestureType.PAN));
                akq.A09 = bool;
                Float f3 = akq.A0A;
                if (f3 == null) {
                    f3 = Float.valueOf(x);
                    akq.A0A = f3;
                    akq.A0B = Float.valueOf(y2);
                }
                akq.A02 = x - f3.floatValue();
                akq.A03 = y2 - akq.A0B.floatValue();
            }
            if (bool.booleanValue()) {
                akq.A01(x, y2, akq.A0C.floatValue(), akq.A0D.floatValue());
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        AKQ akq = this.A00;
        int i = AKQ.A0K;
        if (!akq.A06.booleanValue()) {
            if (akq.A0C != null && akq.A0A != null) {
                return false;
            }
            return akq.A0H.A00(motionEvent);
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            AKQ akq = this.A00;
            int i = AKQ.A0K;
            ABK abk = akq.A0H;
            abk.A02.A0D = true;
            abk.A00(motionEvent);
            return true;
        }
        return false;
    }
}
