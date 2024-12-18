package com.facebook.proxygen;

import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class XplatMQTTConnectPayload {
    public final String appId;
    public final Map appSpecificInfo;
    public final long capabilities;
    public final String clientId;
    public final String clientType;
    public final int configurationMask;
    public final String deviceId;
    public final boolean disablePingOverlaps;
    public final boolean disablePreemptiveReconnectOverlaps;
    public final String host;
    public final String initialNetworkState;
    public final int initialNetworkTransports;
    public final long mqttSessionId;
    public final String password;
    public final String phpOverride;
    public final String port;
    public final boolean qplEnabled;
    public final String regionHint;
    public final List subscribeTopics;
    public final String userAgent;
    public final long userId;

    public XplatMQTTConnectPayload(long j, String str, String str2, String str3, String str4, String str5, String str6, long j2, String str7, String str8, String str9, String str10, int i, List list, long j3, Map map, String str11, int i2, boolean z, boolean z2, boolean z3) {
        this.userId = j;
        this.clientId = str;
        this.password = str2;
        this.host = str3;
        this.port = str4;
        this.userAgent = str5;
        this.deviceId = str6;
        this.mqttSessionId = j2;
        this.clientType = str7;
        this.phpOverride = str8;
        this.appId = str9;
        this.initialNetworkState = str10;
        this.initialNetworkTransports = i;
        this.subscribeTopics = list;
        this.capabilities = j3;
        this.appSpecificInfo = map;
        this.regionHint = str11;
        this.configurationMask = i2;
        this.qplEnabled = z;
        this.disablePingOverlaps = z2;
        this.disablePreemptiveReconnectOverlaps = z3;
    }
}
