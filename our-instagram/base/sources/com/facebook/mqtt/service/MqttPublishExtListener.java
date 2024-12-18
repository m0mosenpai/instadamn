package com.facebook.mqtt.service;

/* loaded from: classes12.dex */
public interface MqttPublishExtListener {
    void onPublishAttempt(int i, int i2, int i3, int i4, int i5);

    void onPublishCompleted(int i, int i2, int i3, int i4, int i5, boolean z, int i6);
}
