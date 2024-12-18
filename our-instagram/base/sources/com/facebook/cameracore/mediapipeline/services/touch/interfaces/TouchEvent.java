package com.facebook.cameracore.mediapipeline.services.touch.interfaces;

/* loaded from: classes4.dex */
public class TouchEvent {
    public final TouchEventType eventType;
    public final long id;
    public final long time;
    public final float x;
    public final float y;

    /* loaded from: classes4.dex */
    public enum TouchEventType {
        DOWN,
        UP,
        MOVE,
        CANCEL
    }

    public String getTouchEventTypeName() {
        return this.eventType.name();
    }

    public TouchEvent(float f, float f2, long j, TouchEventType touchEventType, long j2, boolean z, float f3, float f4) {
        this.id = j;
        this.eventType = touchEventType;
        this.time = j2;
        this.x = f;
        this.y = f2;
    }
}
