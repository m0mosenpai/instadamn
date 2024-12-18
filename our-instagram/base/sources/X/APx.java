package X;

import android.view.ScaleGestureDetector;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.PinchGesture;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture;
import java.util.Map;

/* loaded from: classes4.dex */
public final class APx implements ScaleGestureDetector.OnScaleGestureListener {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public final /* synthetic */ C2039790k A05;

    public APx(C2039790k c2039790k) {
        this.A05 = c2039790k;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float f;
        long A00;
        C2039790k c2039790k = this.A05;
        AKQ akq = c2039790k.A0A;
        if (akq != null) {
            akq.A01(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), this.A03, this.A04);
        }
        float currentSpan = scaleGestureDetector.getCurrentSpan();
        float f2 = this.A00;
        if (f2 > 0.0f) {
            f = currentSpan / f2;
        } else {
            f = 1.0f;
        }
        Map map = c2039790k.A0K;
        Gesture.GestureType gestureType = Gesture.GestureType.PINCH;
        if (!map.containsKey(gestureType) && AbstractC166987dD.A01(1.0f, f) < 0.1f) {
            return true;
        }
        c2039790k.A0E = true;
        float focusX = scaleGestureDetector.getFocusX();
        float focusY = scaleGestureDetector.getFocusY();
        if (map.containsKey(gestureType)) {
            A00 = AbstractC166987dD.A0N(map.get(gestureType));
            if (C2039790k.A08(c2039790k, A00)) {
                return true;
            }
        } else {
            A00 = C2039790k.A00(c2039790k, gestureType);
            C2039790k.A05(c2039790k, new PinchGesture(A00, f, focusX, focusY, Gesture.GestureState.BEGAN, true, this.A01, this.A02));
        }
        C2039790k.A05(c2039790k, new PinchGesture(A00, f, focusX, focusY, Gesture.GestureState.CHANGED, true, this.A01, this.A02));
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        C2039790k c2039790k = this.A05;
        if (c2039790k.A0A == null) {
            return false;
        }
        this.A03 = scaleGestureDetector.getFocusX();
        float focusY = scaleGestureDetector.getFocusY();
        this.A04 = focusY;
        AKQ akq = c2039790k.A0A;
        float f = this.A03;
        akq.A0E = false;
        Float f2 = akq.A0A;
        if (f2 == null) {
            f2 = Float.valueOf(f);
            akq.A0A = f2;
            akq.A0B = Float.valueOf(focusY);
        }
        akq.A02 = f - f2.floatValue();
        akq.A03 = focusY - akq.A0B.floatValue();
        akq.A09 = null;
        C2039790k c2039790k2 = akq.A0H.A02;
        c2039790k2.A0E = true;
        akq.A09 = Boolean.valueOf(c2039790k2.A0Q.contains(Gesture.GestureType.PAN));
        boolean contains = c2039790k.A0Q.contains(Gesture.GestureType.PINCH);
        if (!contains) {
            return contains;
        }
        this.A00 = scaleGestureDetector.getCurrentSpan();
        return contains;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        float f;
        C2039790k c2039790k = this.A05;
        AKQ akq = c2039790k.A0A;
        if (akq != null) {
            akq.A0E = true;
            akq.A09 = null;
        }
        Map map = c2039790k.A0K;
        Gesture.GestureType gestureType = Gesture.GestureType.PINCH;
        if (map.containsKey(gestureType)) {
            long A0N = AbstractC166987dD.A0N(map.get(gestureType));
            if (C2039790k.A08(c2039790k, A0N)) {
                c2039790k.A0O.add(gestureType);
                return;
            }
            float currentSpan = scaleGestureDetector.getCurrentSpan();
            float f2 = this.A00;
            if (f2 > 0.0f) {
                f = currentSpan / f2;
            } else {
                f = 1.0f;
            }
            C2039790k.A05(c2039790k, new PinchGesture(A0N, f, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), Gesture.GestureState.ENDED, true, this.A01, this.A02));
        }
    }
}
