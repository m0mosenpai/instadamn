package com.facebook.mqtt.service;

/* loaded from: classes2.dex */
public interface MqttPublishListener {
    void onFailure(int i, int i2);

    void onSuccess(int i);

    void onTimeout(int i, boolean z);
}
