package com.facebook.cameracore.mediapipeline.services.touch.implementation;

import com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture;

/* loaded from: classes4.dex */
public class RawTouchGesture extends Gesture {
    public final float translateX;
    public final float translateY;

    public RawTouchGesture(long j, float f, float f2, float f3, float f4, Gesture.GestureState gestureState, boolean z, float f5, float f6) {
        super(j, f3, f4, gestureState, true, f5, f6);
        this.translateX = f;
        this.translateY = f2;
    }

    @Override // com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture
    public Gesture.GestureType getGestureType() {
        return Gesture.GestureType.RAW_TOUCH;
    }
}
