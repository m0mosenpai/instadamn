package com.facebook.cameracore.mediapipeline.services.touch.implementation;

import com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture;

/* loaded from: classes4.dex */
public class LongPressGesture extends Gesture {
    @Override // com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture
    public final Gesture.GestureType getGestureType() {
        return Gesture.GestureType.LONG_PRESS;
    }
}
