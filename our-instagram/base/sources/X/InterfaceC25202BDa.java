package X;

import com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchEvent;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchGesturesListener$HitTestCallback;

/* renamed from: X.BDa, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC25202BDa {
    void addGestureEvent(Gesture gesture);

    void addTouchEvent(TouchEvent touchEvent);

    void dispatchUnconsumedGestures();

    void enqueueForHitTest(Gesture gesture, TouchGesturesListener$HitTestCallback touchGesturesListener$HitTestCallback);
}
