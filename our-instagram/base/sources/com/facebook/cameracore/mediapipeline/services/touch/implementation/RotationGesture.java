package com.facebook.cameracore.mediapipeline.services.touch.implementation;

import com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture;

/* loaded from: classes4.dex */
public class RotationGesture extends Gesture {
    public final float angle;

    public RotationGesture(long j, float f, float f2, float f3, Gesture.GestureState gestureState, boolean z, float f4, float f5) {
        super(j, f2, f3, gestureState, true, f4, f5);
        this.angle = f;
    }

    @Override // com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture
    public Gesture.GestureType getGestureType() {
        return Gesture.GestureType.ROTATE;
    }
}
