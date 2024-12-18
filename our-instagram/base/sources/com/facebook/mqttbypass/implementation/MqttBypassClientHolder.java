package com.facebook.mqttbypass.implementation;

import X.C09170dP;
import X.C5N8;
import com.facebook.jni.HybridData;
import com.facebook.mqttbypass.IMqttBypassClientHolder;

/* loaded from: classes3.dex */
public final class MqttBypassClientHolder extends IMqttBypassClientHolder {
    public static final C5N8 Companion = new Object();

    public static final native HybridData initHybrid(MqttBypassConfig mqttBypassConfig);

    public native void blockConnectionCreationNative();

    public native void permitConnectionCreationNative();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5N8, java.lang.Object] */
    static {
        C09170dP.A0C("mqttbypass-jni");
    }
}
