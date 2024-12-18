package com.facebook.mqttbypass;

import X.C09170dP;
import com.facebook.jni.HybridData;

/* loaded from: classes3.dex */
public abstract class IMqttBypassClientHolder {
    public final HybridData mHybridData;

    static {
        C09170dP.A0C("mqttbypass-interface-jni");
    }

    public IMqttBypassClientHolder(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
