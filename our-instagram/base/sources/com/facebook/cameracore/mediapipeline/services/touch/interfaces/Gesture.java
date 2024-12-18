package com.facebook.cameracore.mediapipeline.services.touch.interfaces;

/* loaded from: classes4.dex */
public abstract class Gesture {
    public final GestureState gestureState;
    public final long id;
    public final float x;
    public final float y;

    /* loaded from: classes4.dex */
    public enum GestureState {
        BEGAN,
        CHANGED,
        ENDED,
        CANCELLED,
        FAILED
    }

    /* loaded from: classes4.dex */
    public enum GestureType {
        TAP,
        PAN,
        PINCH,
        ROTATE,
        LONG_PRESS,
        RAW_TOUCH
    }

    public abstract GestureType getGestureType();

    public String getGestureStateName() {
        return this.gestureState.name();
    }

    public Gesture(long j, float f, float f2, GestureState gestureState, boolean z, float f3, float f4) {
        this.id = j;
        this.gestureState = gestureState;
        this.x = f;
        this.y = f2;
    }

    public String getGestureTypeName() {
        return getGestureType().name();
    }
}
