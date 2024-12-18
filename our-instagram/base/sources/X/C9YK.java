package X;

import android.os.Bundle;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.PanGesture;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.PinchGesture;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.RawTouchGesture;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.RotationGesture;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchEvent;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchGesturesListener$HitTestCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9YK, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9YK extends AbstractC2039690j implements BCI {
    public final List A01 = AbstractC166987dD.A1E();
    public final List A00 = AbstractC166987dD.A1E();
    public final TouchGesturesListener$HitTestCallback A02 = new C23348AWw(this);

    @Override // X.BCI
    public final List Epm(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        if (bundle.containsKey("commandType")) {
            int i = bundle.getInt("commandType");
            if (i == 0) {
                if (bundle.containsKey("touchEventId") && bundle.containsKey("touchEventX") && bundle.containsKey("touchEventY") && bundle.containsKey("touchEventTime") && bundle.containsKey("touchEventType")) {
                    float f = bundle.getFloat("touchEventX");
                    float f2 = bundle.getFloat("touchEventY");
                    long j = bundle.getLong("touchEventId");
                    long j2 = bundle.getLong("touchEventTime");
                    int i2 = bundle.getInt("touchEventType");
                    TouchEvent.TouchEventType touchEventType = TouchEvent.TouchEventType.DOWN;
                    if (i2 != touchEventType.ordinal()) {
                        touchEventType = TouchEvent.TouchEventType.MOVE;
                        if (i2 != touchEventType.ordinal()) {
                            touchEventType = TouchEvent.TouchEventType.UP;
                            if (i2 != touchEventType.ordinal()) {
                                touchEventType = TouchEvent.TouchEventType.CANCEL;
                            }
                        }
                    }
                    TouchEvent touchEvent = new TouchEvent(f, f2, j, touchEventType, j2, true, 0.0f, 0.0f);
                    Iterator it = this.A01.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC25202BDa) it.next()).addTouchEvent(touchEvent);
                    }
                }
            } else if (i == 1) {
                Gesture A04 = A04(bundle);
                if (A04 != null) {
                    Iterator it2 = this.A01.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC25202BDa) it2.next()).addGestureEvent(A04);
                    }
                }
            } else if (i == 2) {
                Gesture A042 = A04(bundle);
                if (A042 != null) {
                    Iterator it3 = this.A01.iterator();
                    while (it3.hasNext()) {
                        ((InterfaceC25202BDa) it3.next()).enqueueForHitTest(A042, this.A02);
                    }
                }
            } else if (i == 4) {
                Iterator it4 = this.A01.iterator();
                while (it4.hasNext()) {
                    ((InterfaceC25202BDa) it4.next()).dispatchUnconsumedGestures();
                }
            }
        }
        List list = this.A00;
        ArrayList A0U = AbstractC001800i.A0U(list);
        list.clear();
        return A0U;
    }

    public static final Gesture.GestureState A00(int i) {
        Gesture.GestureState gestureState = Gesture.GestureState.BEGAN;
        if (i != gestureState.ordinal()) {
            Gesture.GestureState gestureState2 = Gesture.GestureState.CHANGED;
            if (i != gestureState2.ordinal()) {
                Gesture.GestureState gestureState3 = Gesture.GestureState.ENDED;
                if (i != gestureState3.ordinal()) {
                    Gesture.GestureState gestureState4 = Gesture.GestureState.CANCELLED;
                    if (i != gestureState4.ordinal()) {
                        return Gesture.GestureState.FAILED;
                    }
                    return gestureState4;
                }
                return gestureState3;
            }
            return gestureState2;
        }
        return gestureState;
    }

    public final Gesture A04(Bundle bundle) {
        if (bundle.containsKey("gestureId") && bundle.containsKey("gestureX") && bundle.containsKey("gestureY") && bundle.containsKey("gestureState") && bundle.containsKey("gestureType")) {
            float f = bundle.getFloat("gestureX");
            float f2 = bundle.getFloat("gestureY");
            long j = bundle.getLong("gestureId");
            int i = bundle.getInt("gestureState");
            int i2 = bundle.getInt("gestureType");
            if (i2 == Gesture.GestureType.LONG_PRESS.ordinal()) {
                return new Gesture(j, f, f2, A00(i), true, 0.0f, 0.0f);
            }
            if (i2 == Gesture.GestureType.TAP.ordinal()) {
                return new Gesture(j, f, f2, A00(i), true, 0.0f, 0.0f);
            }
            if (i2 == Gesture.GestureType.PAN.ordinal()) {
                if (bundle.containsKey("panGestureTranslateX") && bundle.containsKey("panGestureTranslateY")) {
                    return new PanGesture(j, bundle.getFloat("panGestureTranslateX"), bundle.getFloat("panGestureTranslateY"), f, f2, A00(i), true, 0.0f, 0.0f);
                }
                return null;
            }
            if (i2 == Gesture.GestureType.ROTATE.ordinal()) {
                if (bundle.containsKey("rotationGestureAngle")) {
                    return new RotationGesture(j, bundle.getFloat("rotationGestureAngle"), f, f2, A00(i), true, 0.0f, 0.0f);
                }
                return null;
            }
            if (i2 == Gesture.GestureType.RAW_TOUCH.ordinal()) {
                if (bundle.containsKey("rawTouchGestureTranslateX") && bundle.containsKey("rawTouchGestureTranslateY")) {
                    return new RawTouchGesture(j, bundle.getFloat("rawTouchGestureTranslateX"), bundle.getFloat("rawTouchGestureTranslateY"), f, f2, A00(i), true, 0.0f, 0.0f);
                }
                return null;
            }
            if (i2 == Gesture.GestureType.PINCH.ordinal() && bundle.containsKey("pinchGestureScale")) {
                return new PinchGesture(j, bundle.getFloat("pinchGestureScale"), f, f2, A00(i), true, 0.0f, 0.0f);
            }
            return null;
        }
        return null;
    }
}
