package com.facebook.cameracore.mediapipeline.services.touch.implementation;

import X.C14360o3;
import X.InterfaceC25202BDa;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchEvent;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchGesturesListener$HitTestCallback;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public final class TouchGesturesDelegateWrapper implements InterfaceC25202BDa {
    public final HybridData mHybridData = initHybrid();

    private final native void addGestureEventNative(Gesture gesture);

    private final native void addTouchEventNative(TouchEvent touchEvent);

    private final native void dispatchUnconsumedGesturesNative();

    private final native void enqueueForHitTestNative(Gesture gesture, TouchGesturesListener$HitTestCallback touchGesturesListener$HitTestCallback);

    private final native HybridData initHybrid();

    @Override // X.InterfaceC25202BDa
    public void addGestureEvent(Gesture gesture) {
        C14360o3.A0B(gesture, 0);
        addGestureEventNative(gesture);
    }

    @Override // X.InterfaceC25202BDa
    public void enqueueForHitTest(Gesture gesture, TouchGesturesListener$HitTestCallback touchGesturesListener$HitTestCallback) {
        C14360o3.A0B(touchGesturesListener$HitTestCallback, 1);
        enqueueForHitTestNative(gesture, touchGesturesListener$HitTestCallback);
    }

    @Override // X.InterfaceC25202BDa
    public void addTouchEvent(TouchEvent touchEvent) {
        addTouchEventNative(touchEvent);
    }

    @Override // X.InterfaceC25202BDa
    public void dispatchUnconsumedGestures() {
        dispatchUnconsumedGesturesNative();
    }
}
