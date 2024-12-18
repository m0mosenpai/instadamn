package com.facebook.mqtt.service;

/* loaded from: classes2.dex */
public interface ConnectionCallback {
    void onConnectionChanged(int i, String str);

    void onConnectionError(int i);

    void onMessageDropped(String str, byte[] bArr, long j);
}
