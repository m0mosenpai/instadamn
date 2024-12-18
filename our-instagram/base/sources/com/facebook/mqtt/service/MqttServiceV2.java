package com.facebook.mqtt.service;

import X.AbstractServiceC19690xx;
import X.AnonymousClass001;
import X.C0K8;

/* loaded from: classes10.dex */
public final class MqttServiceV2 extends AbstractServiceC19690xx {
    public final String A00;

    @Override // X.AbstractServiceC19690xx
    public final String A01() {
        return this.A00;
    }

    public MqttServiceV2() {
        C0K8.A0C("MqttServiceV2", AnonymousClass001.A0g("No xplat service delegate for ", "null", ". Mqtt will not run without a delegate"));
        this.A00 = "com.facebook.mqtt.service.NoOpDelegate";
    }
}
