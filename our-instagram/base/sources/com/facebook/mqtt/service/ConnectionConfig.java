package com.facebook.mqtt.service;

import X.AbstractC111324zv;
import X.AbstractC63123SdR;
import X.C0T6;
import X.C14360o3;
import X.C3OO;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;
import com.facebook.mqttbypass.IMqttBypassClientHolder;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class ConnectionConfig extends C0T6 {
    public final String appId;
    public final Map appSpecificInfo;
    public final Map assetIds;
    public final boolean autoSubscribeOnReconnect;
    public final String cacheDir;
    public final Executor callbackExecutor;
    public final long capabilities;
    public final boolean chatOnEnabled;
    public final int clientKeepAliveBackgroundInSeconds;
    public final int clientKeepAliveInSeconds;
    public final int clientKeepAliveTimeoutInSeconds;
    public final String clientType;
    public final int connectTimeoutInSeconds;
    public final String deviceId;
    public final boolean enableDeferredDisconnect;
    public final boolean enableDeferredDisconnectOnEmptyRcv;
    public final long endpointCapabilities;
    public final String fallbackHost;
    public final boolean highPriPendingPublishQueueEnabled;
    public final String host;
    public final boolean improvedStateReportEnabled;
    public int initialNetworkState;
    public final double initialReconnectBackoffInSeconds;
    public boolean isAppInBackground;
    public final double maxReconnectBackoffInSeconds;
    public final int maxServerUnavailableBeforeBackoff;
    public final IMqttBypassClientHolder mqttBypassClientHolder;
    public final Integer msysThreadPriority;
    public final boolean networkInterfaceHandlingCellularToWifiEnabled;
    public final boolean networkInterfaceHandlingWifiToCellularEnabled;
    public final int numFailuresForFallback;
    public final String password;
    public final PersonalizationConfig personalizationConfig;
    public final String phpOverride;
    public final int port;
    public final int preemptivePublishTimeoutInSeconds;
    public final int publishTimeoutInSeconds;
    public final boolean qplEnabled;
    public String regionHint;
    public final Set subscribeTopics;
    public final String userAgent;
    public final String userId;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ConnectionConfig(java.lang.String r56, java.lang.String r57, java.lang.String r58, int r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, java.lang.String r64, int r65, long r66, long r68, java.lang.String r70, boolean r71, boolean r72, boolean r73, java.util.Set r74, java.util.Map r75, java.lang.String r76, java.util.concurrent.Executor r77, java.lang.Integer r78) {
        /*
            r55 = this;
            r0 = 1
            r6 = r56
            X.C14360o3.A0B(r6, r0)
            r0 = 3
            r8 = r58
            X.C14360o3.A0B(r8, r0)
            r0 = 17
            r4 = r74
            X.C14360o3.A0B(r4, r0)
            r0 = 18
            r3 = r75
            X.C14360o3.A0B(r3, r0)
            r0 = 19
            r2 = r76
            X.C14360o3.A0B(r2, r0)
            r0 = 20
            r1 = r77
            X.C14360o3.A0B(r1, r0)
            r29 = 0
            r39 = 0
            r48 = 0
            r52 = -2097152(0xffffffffffe00000, float:NaN)
            r53 = 1023(0x3ff, float:1.434E-42)
            r16 = r66
            r15 = r65
            r14 = r64
            r13 = r63
            r12 = r62
            r11 = r61
            r10 = r60
            r9 = r59
            r28 = r78
            r23 = r73
            r22 = r72
            r21 = r71
            r20 = r70
            r7 = r57
            r5 = r55
            r18 = r68
            r24 = r4
            r25 = r3
            r26 = r2
            r27 = r1
            r30 = r29
            r31 = r29
            r32 = r29
            r33 = r29
            r34 = r29
            r35 = r29
            r36 = r29
            r37 = r29
            r38 = r29
            r40 = r29
            r41 = r29
            r42 = r39
            r43 = r29
            r44 = r39
            r45 = r39
            r46 = r29
            r47 = r29
            r50 = r48
            r54 = r39
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50, r52, r53, r54)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ConnectionConfig(java.lang.String r56, java.lang.String r57, java.lang.String r58, int r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, java.lang.String r64, int r65, long r66, long r68, java.lang.String r70, boolean r71, boolean r72, boolean r73, java.util.Set r74, java.util.Map r75, java.lang.String r76, java.util.concurrent.Executor r77, java.lang.Integer r78, int r79) {
        /*
            r55 = this;
            r0 = 1
            r6 = r56
            X.C14360o3.A0B(r6, r0)
            r0 = 3
            r8 = r58
            X.C14360o3.A0B(r8, r0)
            r0 = 17
            r4 = r74
            X.C14360o3.A0B(r4, r0)
            r0 = 18
            r3 = r75
            X.C14360o3.A0B(r3, r0)
            r0 = 19
            r2 = r76
            X.C14360o3.A0B(r2, r0)
            r0 = 20
            r1 = r77
            X.C14360o3.A0B(r1, r0)
            r30 = 0
            r39 = 0
            r48 = 0
            r52 = -4194304(0xffffffffffc00000, float:NaN)
            r53 = 1023(0x3ff, float:1.434E-42)
            r16 = r66
            r15 = r65
            r14 = r64
            r13 = r63
            r12 = r62
            r11 = r61
            r10 = r60
            r9 = r59
            r7 = r57
            r29 = r79
            r28 = r78
            r23 = r73
            r22 = r72
            r21 = r71
            r20 = r70
            r5 = r55
            r18 = r68
            r24 = r4
            r25 = r3
            r26 = r2
            r27 = r1
            r31 = r30
            r32 = r30
            r33 = r30
            r34 = r30
            r35 = r30
            r36 = r30
            r37 = r30
            r38 = r30
            r40 = r30
            r41 = r30
            r42 = r39
            r43 = r30
            r44 = r39
            r45 = r39
            r46 = r30
            r47 = r30
            r50 = r48
            r54 = r39
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50, r52, r53, r54)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ConnectionConfig(java.lang.String r56, java.lang.String r57, java.lang.String r58, int r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, java.lang.String r64, int r65, long r66, long r68, java.lang.String r70, boolean r71, boolean r72, boolean r73, java.util.Set r74, java.util.Map r75, java.lang.String r76, java.util.concurrent.Executor r77, java.lang.Integer r78, int r79, int r80) {
        /*
            r55 = this;
            r0 = 1
            r6 = r56
            X.C14360o3.A0B(r6, r0)
            r0 = 3
            r8 = r58
            X.C14360o3.A0B(r8, r0)
            r0 = 17
            r4 = r74
            X.C14360o3.A0B(r4, r0)
            r0 = 18
            r3 = r75
            X.C14360o3.A0B(r3, r0)
            r0 = 19
            r2 = r76
            X.C14360o3.A0B(r2, r0)
            r0 = 20
            r1 = r77
            X.C14360o3.A0B(r1, r0)
            r31 = 0
            r39 = 0
            r48 = 0
            r52 = -8388608(0xffffffffff800000, float:-Infinity)
            r53 = 1023(0x3ff, float:1.434E-42)
            r16 = r66
            r15 = r65
            r14 = r64
            r13 = r63
            r12 = r62
            r11 = r61
            r10 = r60
            r9 = r59
            r7 = r57
            r30 = r80
            r29 = r79
            r28 = r78
            r23 = r73
            r22 = r72
            r21 = r71
            r20 = r70
            r5 = r55
            r18 = r68
            r24 = r4
            r25 = r3
            r26 = r2
            r27 = r1
            r32 = r31
            r33 = r31
            r34 = r31
            r35 = r31
            r36 = r31
            r37 = r31
            r38 = r31
            r40 = r31
            r41 = r31
            r42 = r39
            r43 = r31
            r44 = r39
            r45 = r39
            r46 = r31
            r47 = r31
            r50 = r48
            r54 = r39
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50, r52, r53, r54)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ConnectionConfig(java.lang.String r56, java.lang.String r57, java.lang.String r58, int r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, java.lang.String r64, int r65, long r66, long r68, java.lang.String r70, boolean r71, boolean r72, boolean r73, java.util.Set r74, java.util.Map r75, java.lang.String r76, java.util.concurrent.Executor r77, java.lang.Integer r78, int r79, int r80, int r81) {
        /*
            r55 = this;
            r0 = 1
            r6 = r56
            X.C14360o3.A0B(r6, r0)
            r0 = 3
            r8 = r58
            X.C14360o3.A0B(r8, r0)
            r0 = 17
            r4 = r74
            X.C14360o3.A0B(r4, r0)
            r0 = 18
            r3 = r75
            X.C14360o3.A0B(r3, r0)
            r0 = 19
            r2 = r76
            X.C14360o3.A0B(r2, r0)
            r0 = 20
            r1 = r77
            X.C14360o3.A0B(r1, r0)
            r32 = 0
            r39 = 0
            r48 = 0
            r52 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r53 = 1023(0x3ff, float:1.434E-42)
            r16 = r66
            r15 = r65
            r14 = r64
            r13 = r63
            r12 = r62
            r11 = r61
            r10 = r60
            r9 = r59
            r7 = r57
            r18 = r68
            r31 = r81
            r5 = r55
            r30 = r80
            r29 = r79
            r28 = r78
            r23 = r73
            r22 = r72
            r21 = r71
            r20 = r70
            r24 = r4
            r25 = r3
            r26 = r2
            r27 = r1
            r33 = r32
            r34 = r32
            r35 = r32
            r36 = r32
            r37 = r32
            r38 = r32
            r40 = r32
            r41 = r32
            r42 = r39
            r43 = r32
            r44 = r39
            r45 = r39
            r46 = r32
            r47 = r32
            r50 = r48
            r54 = r39
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50, r52, r53, r54)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int, int, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ConnectionConfig(java.lang.String r56, java.lang.String r57, java.lang.String r58, int r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, java.lang.String r64, int r65, long r66, long r68, java.lang.String r70, boolean r71, boolean r72, boolean r73, java.util.Set r74, java.util.Map r75, java.lang.String r76, java.util.concurrent.Executor r77, java.lang.Integer r78, int r79, int r80, int r81, int r82) {
        /*
            r55 = this;
            r0 = 1
            r6 = r56
            X.C14360o3.A0B(r6, r0)
            r0 = 3
            r8 = r58
            X.C14360o3.A0B(r8, r0)
            r0 = 17
            r4 = r74
            X.C14360o3.A0B(r4, r0)
            r0 = 18
            r3 = r75
            X.C14360o3.A0B(r3, r0)
            r0 = 19
            r2 = r76
            X.C14360o3.A0B(r2, r0)
            r0 = 20
            r1 = r77
            X.C14360o3.A0B(r1, r0)
            r33 = 0
            r39 = 0
            r48 = 0
            r52 = -33554432(0xfffffffffe000000, float:-4.2535296E37)
            r53 = 1023(0x3ff, float:1.434E-42)
            r16 = r66
            r15 = r65
            r14 = r64
            r13 = r63
            r12 = r62
            r11 = r61
            r10 = r60
            r9 = r59
            r7 = r57
            r18 = r68
            r5 = r55
            r32 = r82
            r31 = r81
            r30 = r80
            r29 = r79
            r28 = r78
            r23 = r73
            r22 = r72
            r21 = r71
            r20 = r70
            r24 = r4
            r25 = r3
            r26 = r2
            r27 = r1
            r34 = r33
            r35 = r33
            r36 = r33
            r37 = r33
            r38 = r33
            r40 = r33
            r41 = r33
            r42 = r39
            r43 = r33
            r44 = r39
            r45 = r39
            r46 = r33
            r47 = r33
            r50 = r48
            r54 = r39
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50, r52, r53, r54)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int, int, int, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ConnectionConfig(java.lang.String r56, java.lang.String r57, java.lang.String r58, int r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, java.lang.String r64, int r65, long r66, long r68, java.lang.String r70, boolean r71, boolean r72, boolean r73, java.util.Set r74, java.util.Map r75, java.lang.String r76, java.util.concurrent.Executor r77, java.lang.Integer r78, int r79, int r80, int r81, int r82, int r83, int r84, int r85, boolean r86, boolean r87, boolean r88, com.facebook.mqtt.service.PersonalizationConfig r89, boolean r90, boolean r91, com.facebook.mqttbypass.IMqttBypassClientHolder r92) {
        /*
            r55 = this;
            r0 = 1
            r6 = r56
            X.C14360o3.A0B(r6, r0)
            r0 = 3
            r8 = r58
            X.C14360o3.A0B(r8, r0)
            r0 = 17
            r4 = r74
            X.C14360o3.A0B(r4, r0)
            r0 = 18
            r3 = r75
            X.C14360o3.A0B(r3, r0)
            r0 = 19
            r2 = r76
            X.C14360o3.A0B(r2, r0)
            r0 = 20
            r1 = r77
            X.C14360o3.A0B(r1, r0)
            r43 = 0
            r44 = 0
            r48 = 0
            r53 = 1016(0x3f8, float:1.424E-42)
            r33 = r83
            r32 = r82
            r31 = r81
            r30 = r80
            r29 = r79
            r28 = r78
            r36 = r86
            r7 = r57
            r11 = r61
            r40 = r90
            r37 = r87
            r12 = r62
            r41 = r91
            r38 = r88
            r9 = r59
            r13 = r63
            r42 = r92
            r39 = r89
            r10 = r60
            r14 = r64
            r15 = r65
            r16 = r66
            r35 = r85
            r18 = r68
            r5 = r55
            r34 = r84
            r20 = r70
            r21 = r71
            r22 = r72
            r23 = r73
            r24 = r4
            r25 = r3
            r26 = r2
            r27 = r1
            r45 = r44
            r46 = r43
            r47 = r43
            r50 = r48
            r52 = r43
            r54 = r44
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50, r52, r53, r54)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int, int, int, int, int, int, int, boolean, boolean, boolean, com.facebook.mqtt.service.PersonalizationConfig, boolean, boolean, com.facebook.mqttbypass.IMqttBypassClientHolder):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ConnectionConfig(java.lang.String r56, java.lang.String r57, java.lang.String r58, int r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, java.lang.String r64, int r65, long r66, long r68, java.lang.String r70, boolean r71, boolean r72, boolean r73, java.util.Set r74, java.util.Map r75, java.lang.String r76, java.util.concurrent.Executor r77, java.lang.Integer r78, int r79, int r80, int r81, int r82, int r83, int r84, int r85, boolean r86, boolean r87, boolean r88, com.facebook.mqtt.service.PersonalizationConfig r89, boolean r90, boolean r91, com.facebook.mqttbypass.IMqttBypassClientHolder r92, boolean r93) {
        /*
            r55 = this;
            r0 = 1
            r6 = r56
            X.C14360o3.A0B(r6, r0)
            r0 = 3
            r8 = r58
            X.C14360o3.A0B(r8, r0)
            r0 = 17
            r4 = r74
            X.C14360o3.A0B(r4, r0)
            r0 = 18
            r3 = r75
            X.C14360o3.A0B(r3, r0)
            r0 = 19
            r2 = r76
            X.C14360o3.A0B(r2, r0)
            r0 = 20
            r1 = r77
            X.C14360o3.A0B(r1, r0)
            r44 = 0
            r46 = 0
            r48 = 0
            r53 = 1008(0x3f0, float:1.413E-42)
            r33 = r83
            r32 = r82
            r31 = r81
            r30 = r80
            r29 = r79
            r28 = r78
            r36 = r86
            r7 = r57
            r37 = r87
            r12 = r62
            r41 = r91
            r38 = r88
            r9 = r59
            r13 = r63
            r42 = r92
            r39 = r89
            r10 = r60
            r14 = r64
            r43 = r93
            r40 = r90
            r11 = r61
            r15 = r65
            r16 = r66
            r35 = r85
            r18 = r68
            r5 = r55
            r34 = r84
            r20 = r70
            r21 = r71
            r22 = r72
            r23 = r73
            r24 = r4
            r25 = r3
            r26 = r2
            r27 = r1
            r45 = r44
            r47 = r46
            r50 = r48
            r52 = r46
            r54 = r44
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50, r52, r53, r54)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int, int, int, int, int, int, int, boolean, boolean, boolean, com.facebook.mqtt.service.PersonalizationConfig, boolean, boolean, com.facebook.mqttbypass.IMqttBypassClientHolder, boolean):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ConnectionConfig(java.lang.String r56, java.lang.String r57, java.lang.String r58, int r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, java.lang.String r64, int r65, long r66, long r68, java.lang.String r70, boolean r71, boolean r72, boolean r73, java.util.Set r74, java.util.Map r75, java.lang.String r76, java.util.concurrent.Executor r77, java.lang.Integer r78, int r79, int r80, int r81, int r82, int r83, int r84, int r85, boolean r86, boolean r87, boolean r88, com.facebook.mqtt.service.PersonalizationConfig r89, boolean r90, boolean r91, com.facebook.mqttbypass.IMqttBypassClientHolder r92, boolean r93, java.util.Map r94) {
        /*
            r55 = this;
            r0 = 1
            r6 = r56
            X.C14360o3.A0B(r6, r0)
            r0 = 3
            r8 = r58
            X.C14360o3.A0B(r8, r0)
            r0 = 17
            r4 = r74
            X.C14360o3.A0B(r4, r0)
            r0 = 18
            r3 = r75
            X.C14360o3.A0B(r3, r0)
            r0 = 19
            r2 = r76
            X.C14360o3.A0B(r2, r0)
            r0 = 20
            r1 = r77
            X.C14360o3.A0B(r1, r0)
            r45 = 0
            r46 = 0
            r48 = 0
            r53 = 992(0x3e0, float:1.39E-42)
            r33 = r83
            r32 = r82
            r31 = r81
            r30 = r80
            r29 = r79
            r28 = r78
            r36 = r86
            r7 = r57
            r37 = r87
            r38 = r88
            r9 = r59
            r13 = r63
            r42 = r92
            r39 = r89
            r10 = r60
            r14 = r64
            r43 = r93
            r40 = r90
            r11 = r61
            r15 = r65
            r44 = r94
            r41 = r91
            r12 = r62
            r16 = r66
            r35 = r85
            r18 = r68
            r5 = r55
            r34 = r84
            r20 = r70
            r21 = r71
            r22 = r72
            r23 = r73
            r24 = r4
            r25 = r3
            r26 = r2
            r27 = r1
            r47 = r46
            r50 = r48
            r52 = r46
            r54 = r45
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50, r52, r53, r54)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int, int, int, int, int, int, int, boolean, boolean, boolean, com.facebook.mqtt.service.PersonalizationConfig, boolean, boolean, com.facebook.mqttbypass.IMqttBypassClientHolder, boolean, java.util.Map):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ConnectionConfig(java.lang.String r56, java.lang.String r57, java.lang.String r58, int r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, java.lang.String r64, int r65, long r66, long r68, java.lang.String r70, boolean r71, boolean r72, boolean r73, java.util.Set r74, java.util.Map r75, java.lang.String r76, java.util.concurrent.Executor r77, java.lang.Integer r78, int r79, int r80, int r81, int r82, int r83, int r84, int r85, boolean r86, boolean r87, boolean r88, com.facebook.mqtt.service.PersonalizationConfig r89, boolean r90, boolean r91, com.facebook.mqttbypass.IMqttBypassClientHolder r92, boolean r93, java.util.Map r94, java.lang.String r95) {
        /*
            r55 = this;
            r0 = 1
            r6 = r56
            X.C14360o3.A0B(r6, r0)
            r0 = 3
            r8 = r58
            X.C14360o3.A0B(r8, r0)
            r0 = 17
            r4 = r74
            X.C14360o3.A0B(r4, r0)
            r0 = 18
            r3 = r75
            X.C14360o3.A0B(r3, r0)
            r0 = 19
            r2 = r76
            X.C14360o3.A0B(r2, r0)
            r0 = 20
            r1 = r77
            X.C14360o3.A0B(r1, r0)
            r46 = 0
            r48 = 0
            r53 = 960(0x3c0, float:1.345E-42)
            r54 = 0
            r33 = r83
            r32 = r82
            r31 = r81
            r30 = r80
            r29 = r79
            r28 = r78
            r36 = r86
            r7 = r57
            r37 = r87
            r38 = r88
            r9 = r59
            r39 = r89
            r10 = r60
            r14 = r64
            r43 = r93
            r40 = r90
            r11 = r61
            r15 = r65
            r44 = r94
            r41 = r91
            r12 = r62
            r16 = r66
            r45 = r95
            r42 = r92
            r13 = r63
            r35 = r85
            r18 = r68
            r5 = r55
            r34 = r84
            r20 = r70
            r21 = r71
            r22 = r72
            r23 = r73
            r24 = r4
            r25 = r3
            r26 = r2
            r27 = r1
            r47 = r46
            r50 = r48
            r52 = r46
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50, r52, r53, r54)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int, int, int, int, int, int, int, boolean, boolean, boolean, com.facebook.mqtt.service.PersonalizationConfig, boolean, boolean, com.facebook.mqttbypass.IMqttBypassClientHolder, boolean, java.util.Map, java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ConnectionConfig(java.lang.String r56, java.lang.String r57, java.lang.String r58, int r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, java.lang.String r64, int r65, long r66, long r68, java.lang.String r70, boolean r71, boolean r72, boolean r73, java.util.Set r74, java.util.Map r75, java.lang.String r76, java.util.concurrent.Executor r77, java.lang.Integer r78, int r79, int r80, int r81, int r82, int r83, int r84, int r85, boolean r86, boolean r87, boolean r88, com.facebook.mqtt.service.PersonalizationConfig r89, boolean r90, boolean r91, com.facebook.mqttbypass.IMqttBypassClientHolder r92, boolean r93, java.util.Map r94, java.lang.String r95, int r96) {
        /*
            r55 = this;
            r0 = 1
            r6 = r56
            X.C14360o3.A0B(r6, r0)
            r0 = 3
            r8 = r58
            X.C14360o3.A0B(r8, r0)
            r0 = 17
            r4 = r74
            X.C14360o3.A0B(r4, r0)
            r0 = 18
            r3 = r75
            X.C14360o3.A0B(r3, r0)
            r0 = 19
            r2 = r76
            X.C14360o3.A0B(r2, r0)
            r0 = 20
            r1 = r77
            X.C14360o3.A0B(r1, r0)
            r47 = 0
            r48 = 0
            r53 = 896(0x380, float:1.256E-42)
            r54 = 0
            r33 = r83
            r32 = r82
            r31 = r81
            r30 = r80
            r29 = r79
            r28 = r78
            r23 = r73
            r36 = r86
            r7 = r57
            r37 = r87
            r38 = r88
            r9 = r59
            r39 = r89
            r10 = r60
            r40 = r90
            r11 = r61
            r15 = r65
            r44 = r94
            r41 = r91
            r12 = r62
            r16 = r66
            r45 = r95
            r42 = r92
            r13 = r63
            r43 = r93
            r14 = r64
            r46 = r96
            r35 = r85
            r18 = r68
            r5 = r55
            r34 = r84
            r20 = r70
            r21 = r71
            r22 = r72
            r24 = r4
            r25 = r3
            r26 = r2
            r27 = r1
            r50 = r48
            r52 = r47
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50, r52, r53, r54)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int, int, int, int, int, int, int, boolean, boolean, boolean, com.facebook.mqtt.service.PersonalizationConfig, boolean, boolean, com.facebook.mqttbypass.IMqttBypassClientHolder, boolean, java.util.Map, java.lang.String, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ConnectionConfig(java.lang.String r56, java.lang.String r57, java.lang.String r58, int r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, java.lang.String r64, int r65, long r66, long r68, java.lang.String r70, boolean r71, boolean r72, boolean r73, java.util.Set r74, java.util.Map r75, java.lang.String r76, java.util.concurrent.Executor r77, java.lang.Integer r78, int r79, int r80, int r81, int r82, int r83, int r84, int r85, boolean r86, boolean r87, boolean r88, com.facebook.mqtt.service.PersonalizationConfig r89, boolean r90, boolean r91, com.facebook.mqttbypass.IMqttBypassClientHolder r92, boolean r93, java.util.Map r94, java.lang.String r95, int r96, boolean r97) {
        /*
            r55 = this;
            r0 = 1
            r6 = r56
            X.C14360o3.A0B(r6, r0)
            r0 = 3
            r8 = r58
            X.C14360o3.A0B(r8, r0)
            r0 = 17
            r4 = r74
            X.C14360o3.A0B(r4, r0)
            r0 = 18
            r3 = r75
            X.C14360o3.A0B(r3, r0)
            r0 = 19
            r2 = r76
            X.C14360o3.A0B(r2, r0)
            r0 = 20
            r1 = r77
            X.C14360o3.A0B(r1, r0)
            r48 = 0
            r52 = 0
            r53 = 768(0x300, float:1.076E-42)
            r54 = 0
            r33 = r83
            r32 = r82
            r31 = r81
            r30 = r80
            r29 = r79
            r28 = r78
            r23 = r73
            r22 = r72
            r36 = r86
            r7 = r57
            r37 = r87
            r38 = r88
            r9 = r59
            r39 = r89
            r10 = r60
            r40 = r90
            r11 = r61
            r41 = r91
            r12 = r62
            r16 = r66
            r45 = r95
            r42 = r92
            r13 = r63
            r43 = r93
            r14 = r64
            r44 = r94
            r15 = r65
            r46 = r96
            r47 = r97
            r18 = r68
            r35 = r85
            r5 = r55
            r34 = r84
            r20 = r70
            r21 = r71
            r24 = r4
            r25 = r3
            r26 = r2
            r27 = r1
            r50 = r48
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50, r52, r53, r54)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int, int, int, int, int, int, int, boolean, boolean, boolean, com.facebook.mqtt.service.PersonalizationConfig, boolean, boolean, com.facebook.mqttbypass.IMqttBypassClientHolder, boolean, java.util.Map, java.lang.String, int, boolean):void");
    }

    public static /* synthetic */ ConnectionConfig copy$default(ConnectionConfig connectionConfig, String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, int i2, long j, long j2, String str9, boolean z, boolean z2, boolean z3, Set set, Map map, String str10, Executor executor, Integer num, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z4, boolean z5, boolean z6, PersonalizationConfig personalizationConfig, boolean z7, boolean z8, IMqttBypassClientHolder iMqttBypassClientHolder, boolean z9, Map map2, String str11, int i10, boolean z10, double d, double d2, int i11, int i12, Object obj) {
        long j3 = j2;
        long j4 = j;
        int i13 = i2;
        String str12 = str8;
        String str13 = str7;
        String str14 = str6;
        String str15 = str5;
        String str16 = str4;
        int i14 = i;
        String str17 = str3;
        String str18 = str2;
        String str19 = str;
        double d3 = d2;
        double d4 = d;
        int i15 = i6;
        int i16 = i4;
        int i17 = i3;
        Integer num2 = num;
        int i18 = i10;
        boolean z11 = z8;
        Map map3 = map;
        IMqttBypassClientHolder iMqttBypassClientHolder2 = iMqttBypassClientHolder;
        boolean z12 = z6;
        boolean z13 = z3;
        int i19 = i8;
        boolean z14 = z2;
        int i20 = i5;
        Set set2 = set;
        boolean z15 = z5;
        boolean z16 = z;
        Executor executor2 = executor;
        String str20 = str9;
        int i21 = i7;
        String str21 = str10;
        String str22 = str11;
        boolean z17 = z7;
        int i22 = i9;
        boolean z18 = z4;
        PersonalizationConfig personalizationConfig2 = personalizationConfig;
        boolean z19 = z9;
        Map map4 = map2;
        boolean z20 = z10;
        if ((i11 & 1) != 0) {
            str19 = connectionConfig.userId;
        }
        if ((i11 & 2) != 0) {
            str18 = connectionConfig.password;
        }
        if ((i11 & 4) != 0) {
            str17 = connectionConfig.host;
        }
        if ((i11 & 8) != 0) {
            i14 = connectionConfig.port;
        }
        if ((i11 & 16) != 0) {
            str16 = connectionConfig.userAgent;
        }
        if ((i11 & 32) != 0) {
            str15 = connectionConfig.deviceId;
        }
        if ((i11 & 64) != 0) {
            str14 = connectionConfig.clientType;
        }
        if ((i11 & 128) != 0) {
            str13 = connectionConfig.phpOverride;
        }
        if ((i11 & 256) != 0) {
            str12 = connectionConfig.appId;
        }
        if ((i11 & 512) != 0) {
            i13 = connectionConfig.initialNetworkState;
        }
        if ((i11 & 1024) != 0) {
            j4 = connectionConfig.capabilities;
        }
        if ((i11 & C3OO.FLAG_MOVED) != 0) {
            j3 = connectionConfig.endpointCapabilities;
        }
        if ((i11 & 4096) != 0) {
            str20 = connectionConfig.regionHint;
        }
        if ((i11 & 8192) != 0) {
            z16 = connectionConfig.qplEnabled;
        }
        if ((i11 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            z14 = connectionConfig.chatOnEnabled;
        }
        if ((i11 & Constants.LOAD_RESULT_PGO) != 0) {
            z13 = connectionConfig.isAppInBackground;
        }
        if ((i11 & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0) {
            set2 = connectionConfig.subscribeTopics;
        }
        if ((i11 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0) {
            map3 = connectionConfig.appSpecificInfo;
        }
        if ((i11 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
            str21 = connectionConfig.cacheDir;
        }
        if ((i11 & Constants.LOAD_RESULT_WITH_VDEX_ODEX) != 0) {
            executor2 = connectionConfig.callbackExecutor;
        }
        if ((i11 & 1048576) != 0) {
            num2 = connectionConfig.msysThreadPriority;
        }
        if ((i11 & 2097152) != 0) {
            i17 = connectionConfig.clientKeepAliveInSeconds;
        }
        if ((i11 & 4194304) != 0) {
            i16 = connectionConfig.clientKeepAliveBackgroundInSeconds;
        }
        if ((i11 & DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE) != 0) {
            i20 = connectionConfig.clientKeepAliveTimeoutInSeconds;
        }
        if ((i11 & 16777216) != 0) {
            i15 = connectionConfig.connectTimeoutInSeconds;
        }
        if ((i11 & 33554432) != 0) {
            i21 = connectionConfig.publishTimeoutInSeconds;
        }
        if ((i11 & 67108864) != 0) {
            i19 = connectionConfig.preemptivePublishTimeoutInSeconds;
        }
        if ((i11 & 134217728) != 0) {
            i22 = connectionConfig.maxServerUnavailableBeforeBackoff;
        }
        if ((i11 & 268435456) != 0) {
            z18 = connectionConfig.networkInterfaceHandlingCellularToWifiEnabled;
        }
        if ((i11 & 536870912) != 0) {
            z15 = connectionConfig.networkInterfaceHandlingWifiToCellularEnabled;
        }
        if ((i11 & AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO) != 0) {
            z12 = connectionConfig.improvedStateReportEnabled;
        }
        if ((i11 & Integer.MIN_VALUE) != 0) {
            personalizationConfig2 = connectionConfig.personalizationConfig;
        }
        if ((i12 & 1) != 0) {
            z17 = connectionConfig.enableDeferredDisconnect;
        }
        if ((i12 & 2) != 0) {
            z11 = connectionConfig.enableDeferredDisconnectOnEmptyRcv;
        }
        if ((i12 & 4) != 0) {
            iMqttBypassClientHolder2 = connectionConfig.mqttBypassClientHolder;
        }
        if ((i12 & 8) != 0) {
            z19 = connectionConfig.autoSubscribeOnReconnect;
        }
        if ((i12 & 16) != 0) {
            map4 = connectionConfig.assetIds;
        }
        if ((i12 & 32) != 0) {
            str22 = connectionConfig.fallbackHost;
        }
        if ((i12 & 64) != 0) {
            i18 = connectionConfig.numFailuresForFallback;
        }
        if ((i12 & 128) != 0) {
            z20 = connectionConfig.highPriPendingPublishQueueEnabled;
        }
        if ((i12 & 256) != 0) {
            d4 = connectionConfig.initialReconnectBackoffInSeconds;
        }
        if ((i12 & 512) != 0) {
            d3 = connectionConfig.maxReconnectBackoffInSeconds;
        }
        return connectionConfig.copy(str19, str18, str17, i14, str16, str15, str14, str13, str12, i13, j4, j3, str20, z16, z14, z13, set2, map3, str21, executor2, num2, i17, i16, i20, i15, i21, i19, i22, z18, z15, z12, personalizationConfig2, z17, z11, iMqttBypassClientHolder2, z19, map4, str22, i18, z20, d4, d3);
    }

    public final String component1() {
        return this.userId;
    }

    public final int component10() {
        return this.initialNetworkState;
    }

    public final long component11() {
        return this.capabilities;
    }

    public final long component12() {
        return this.endpointCapabilities;
    }

    public final String component13() {
        return this.regionHint;
    }

    public final boolean component14() {
        return this.qplEnabled;
    }

    public final boolean component15() {
        return this.chatOnEnabled;
    }

    public final boolean component16() {
        return this.isAppInBackground;
    }

    public final Set component17() {
        return this.subscribeTopics;
    }

    public final Map component18() {
        return this.appSpecificInfo;
    }

    public final String component19() {
        return this.cacheDir;
    }

    public final String component2() {
        return this.password;
    }

    public final Executor component20() {
        return this.callbackExecutor;
    }

    public final Integer component21() {
        return this.msysThreadPriority;
    }

    public final int component22() {
        return this.clientKeepAliveInSeconds;
    }

    public final int component23() {
        return this.clientKeepAliveBackgroundInSeconds;
    }

    public final int component24() {
        return this.clientKeepAliveTimeoutInSeconds;
    }

    public final int component25() {
        return this.connectTimeoutInSeconds;
    }

    public final int component26() {
        return this.publishTimeoutInSeconds;
    }

    public final int component27() {
        return this.preemptivePublishTimeoutInSeconds;
    }

    public final int component28() {
        return this.maxServerUnavailableBeforeBackoff;
    }

    public final boolean component29() {
        return this.networkInterfaceHandlingCellularToWifiEnabled;
    }

    public final String component3() {
        return this.host;
    }

    public final boolean component30() {
        return this.networkInterfaceHandlingWifiToCellularEnabled;
    }

    public final boolean component31() {
        return this.improvedStateReportEnabled;
    }

    public final PersonalizationConfig component32() {
        return this.personalizationConfig;
    }

    public final boolean component33() {
        return this.enableDeferredDisconnect;
    }

    public final boolean component34() {
        return this.enableDeferredDisconnectOnEmptyRcv;
    }

    public final IMqttBypassClientHolder component35() {
        return this.mqttBypassClientHolder;
    }

    public final boolean component36() {
        return this.autoSubscribeOnReconnect;
    }

    public final Map component37() {
        return this.assetIds;
    }

    public final String component38() {
        return this.fallbackHost;
    }

    public final int component39() {
        return this.numFailuresForFallback;
    }

    public final int component4() {
        return this.port;
    }

    public final boolean component40() {
        return this.highPriPendingPublishQueueEnabled;
    }

    public final double component41() {
        return this.initialReconnectBackoffInSeconds;
    }

    public final double component42() {
        return this.maxReconnectBackoffInSeconds;
    }

    public final String component5() {
        return this.userAgent;
    }

    public final String component6() {
        return this.deviceId;
    }

    public final String component7() {
        return this.clientType;
    }

    public final String component8() {
        return this.phpOverride;
    }

    public final String component9() {
        return this.appId;
    }

    public final ConnectionConfig copy(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, int i2, long j, long j2, String str9, boolean z, boolean z2, boolean z3, Set set, Map map, String str10, Executor executor, Integer num, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z4, boolean z5, boolean z6, PersonalizationConfig personalizationConfig, boolean z7, boolean z8, IMqttBypassClientHolder iMqttBypassClientHolder, boolean z9, Map map2, String str11, int i10, boolean z10, double d, double d2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str3, 2);
        C14360o3.A0B(set, 16);
        C14360o3.A0B(map, 17);
        C14360o3.A0B(str10, 18);
        C14360o3.A0B(executor, 19);
        return new ConnectionConfig(str, str2, str3, i, str4, str5, str6, str7, str8, i2, j, j2, str9, z, z2, z3, set, map, str10, executor, num, i3, i4, i5, i6, i7, i8, i9, z4, z5, z6, personalizationConfig, z7, z8, iMqttBypassClientHolder, z9, map2, str11, i10, z10, d, d2);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public final String getAppId() {
        return this.appId;
    }

    public final Map getAppSpecificInfo() {
        return this.appSpecificInfo;
    }

    public final Map getAssetIds() {
        return this.assetIds;
    }

    public final boolean getAutoSubscribeOnReconnect() {
        return this.autoSubscribeOnReconnect;
    }

    public final String getCacheDir() {
        return this.cacheDir;
    }

    public final Executor getCallbackExecutor() {
        return this.callbackExecutor;
    }

    public final long getCapabilities() {
        return this.capabilities;
    }

    public final boolean getChatOnEnabled() {
        return this.chatOnEnabled;
    }

    public final int getClientKeepAliveBackgroundInSeconds() {
        return this.clientKeepAliveBackgroundInSeconds;
    }

    public final int getClientKeepAliveInSeconds() {
        return this.clientKeepAliveInSeconds;
    }

    public final int getClientKeepAliveTimeoutInSeconds() {
        return this.clientKeepAliveTimeoutInSeconds;
    }

    public final String getClientType() {
        return this.clientType;
    }

    public final int getConnectTimeoutInSeconds() {
        return this.connectTimeoutInSeconds;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final boolean getEnableDeferredDisconnect() {
        return this.enableDeferredDisconnect;
    }

    public final boolean getEnableDeferredDisconnectOnEmptyRcv() {
        return this.enableDeferredDisconnectOnEmptyRcv;
    }

    public final long getEndpointCapabilities() {
        return this.endpointCapabilities;
    }

    public final String getFallbackHost() {
        return this.fallbackHost;
    }

    public final boolean getHighPriPendingPublishQueueEnabled() {
        return this.highPriPendingPublishQueueEnabled;
    }

    public final String getHost() {
        return this.host;
    }

    public final boolean getImprovedStateReportEnabled() {
        return this.improvedStateReportEnabled;
    }

    public final int getInitialNetworkState() {
        return this.initialNetworkState;
    }

    public final double getInitialReconnectBackoffInSeconds() {
        return this.initialReconnectBackoffInSeconds;
    }

    public final double getMaxReconnectBackoffInSeconds() {
        return this.maxReconnectBackoffInSeconds;
    }

    public final int getMaxServerUnavailableBeforeBackoff() {
        return this.maxServerUnavailableBeforeBackoff;
    }

    public final IMqttBypassClientHolder getMqttBypassClientHolder() {
        return this.mqttBypassClientHolder;
    }

    public final Integer getMsysThreadPriority() {
        return this.msysThreadPriority;
    }

    public final boolean getNetworkInterfaceHandlingCellularToWifiEnabled() {
        return this.networkInterfaceHandlingCellularToWifiEnabled;
    }

    public final boolean getNetworkInterfaceHandlingWifiToCellularEnabled() {
        return this.networkInterfaceHandlingWifiToCellularEnabled;
    }

    public final int getNumFailuresForFallback() {
        return this.numFailuresForFallback;
    }

    public final String getPassword() {
        return this.password;
    }

    public final PersonalizationConfig getPersonalizationConfig() {
        return this.personalizationConfig;
    }

    public final String getPhpOverride() {
        return this.phpOverride;
    }

    public final int getPort() {
        return this.port;
    }

    public final int getPreemptivePublishTimeoutInSeconds() {
        return this.preemptivePublishTimeoutInSeconds;
    }

    public final int getPublishTimeoutInSeconds() {
        return this.publishTimeoutInSeconds;
    }

    public final boolean getQplEnabled() {
        return this.qplEnabled;
    }

    public final String getRegionHint() {
        return this.regionHint;
    }

    public final Set getSubscribeTopics() {
        return this.subscribeTopics;
    }

    public final String getUserAgent() {
        return this.userAgent;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final boolean isAppInBackground() {
        return this.isAppInBackground;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Config host:");
        sb.append(this.host);
        sb.append(", fallbackHost:");
        sb.append(this.fallbackHost);
        sb.append(", port:");
        sb.append(this.port);
        sb.append(", user:");
        sb.append(this.userId);
        sb.append(", agent:");
        sb.append(this.userAgent);
        sb.append(", deviceId:");
        sb.append(this.deviceId);
        sb.append(", client:");
        sb.append(this.clientType);
        sb.append(", phpOverride:");
        sb.append(this.phpOverride);
        sb.append(", app:");
        sb.append(this.appId);
        sb.append(", capabilities:");
        sb.append(this.capabilities);
        sb.append(", endpointCapabilities:");
        sb.append(this.endpointCapabilities);
        sb.append(AbstractC111324zv.A00(3433));
        sb.append(this.regionHint);
        sb.append(", appInfo:");
        sb.append(this.appSpecificInfo);
        sb.append(", initialTopics:");
        sb.append(this.subscribeTopics);
        sb.append(", qpl:");
        sb.append(this.qplEnabled);
        sb.append(", cacheDir:");
        sb.append(this.cacheDir);
        sb.append(", chatOn:");
        sb.append(this.chatOnEnabled);
        sb.append(", isBackground:");
        sb.append(this.isAppInBackground);
        sb.append(", clientKeepAliveInSeconds:");
        sb.append(this.clientKeepAliveInSeconds);
        sb.append(", clientKeepAliveBackgroundInSeconds:");
        sb.append(this.clientKeepAliveBackgroundInSeconds);
        sb.append(", clientKeepAliveTimeoutInSeconds:");
        sb.append(this.clientKeepAliveTimeoutInSeconds);
        sb.append(", connectTimeoutInSeconds:");
        sb.append(this.connectTimeoutInSeconds);
        sb.append(",publishTimeoutInSeconds:");
        sb.append(this.publishTimeoutInSeconds);
        sb.append(", preemptivePublishTimeoutInSeconds:");
        sb.append(this.preemptivePublishTimeoutInSeconds);
        sb.append(", personalizationConfig:");
        sb.append(this.personalizationConfig);
        sb.append(", networkInterfaceHandlingCellularToWifiEnabled:");
        sb.append(this.networkInterfaceHandlingCellularToWifiEnabled);
        sb.append(", networkInterfaceHandlingWifiToCellularEnabled:");
        sb.append(this.networkInterfaceHandlingWifiToCellularEnabled);
        sb.append(", enableDeferredDisconnect:");
        sb.append(this.enableDeferredDisconnect);
        sb.append(", enableDeferredDisconnectOnEmptyRcv:");
        sb.append(this.enableDeferredDisconnectOnEmptyRcv);
        sb.append(", mqttBypassClientHolder:");
        sb.append(this.mqttBypassClientHolder);
        sb.append(", autoSubscribeOnReconnect:");
        sb.append(this.autoSubscribeOnReconnect);
        sb.append(", numFailuresForFallback:");
        sb.append(this.numFailuresForFallback);
        sb.append(", highPriPendingPublishQueueEnabled:");
        sb.append(this.highPriPendingPublishQueueEnabled);
        sb.append(", initialReconnectBackoffInSeconds:");
        sb.append(this.initialReconnectBackoffInSeconds);
        sb.append(", maxReconnectBackoffInSeconds:");
        sb.append(this.maxReconnectBackoffInSeconds);
        sb.append(", ");
        return sb.toString();
    }

    public final void setAppInBackground(boolean z) {
        this.isAppInBackground = z;
    }

    public final void setInitialNetworkState(int i) {
        this.initialNetworkState = i;
    }

    public final void setRegionHint(String str) {
        this.regionHint = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionConfig(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, int i2, long j, long j2, String str9, boolean z, boolean z2, boolean z3, Set set, Map map, String str10, Executor executor, Integer num, int i3, int i4, int i5, int i6, int i7) {
        this(str, str2, str3, i, str4, str5, str6, str7, str8, i2, j, j2, str9, z, z2, z3, set, map, str10, executor, num, i3, i4, i5, i6, i7, 0, 10, false, false, false, null, false, false, null, false, null, null, 0, false, 0.2d, 30.0d);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str3, 3);
        C14360o3.A0B(set, 17);
        C14360o3.A0B(map, 18);
        C14360o3.A0B(str10, 19);
        C14360o3.A0B(executor, 20);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionConfig(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, int i2, long j, long j2, String str9, boolean z, boolean z2, boolean z3, Set set, Map map, String str10, Executor executor, Integer num, int i3, int i4, int i5, int i6, int i7, int i8) {
        this(str, str2, str3, i, str4, str5, str6, str7, str8, i2, j, j2, str9, z, z2, z3, set, map, str10, executor, num, i3, i4, i5, i6, i7, i8, 10, false, false, false, null, false, false, null, false, null, null, 0, false, 0.2d, 30.0d);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str3, 3);
        C14360o3.A0B(set, 17);
        C14360o3.A0B(map, 18);
        C14360o3.A0B(str10, 19);
        C14360o3.A0B(executor, 20);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionConfig(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, int i2, long j, long j2, String str9, boolean z, boolean z2, boolean z3, Set set, Map map, String str10, Executor executor, Integer num, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this(str, str2, str3, i, str4, str5, str6, str7, str8, i2, j, j2, str9, z, z2, z3, set, map, str10, executor, num, i3, i4, i5, i6, i7, i8, i9, false, false, false, null, false, false, null, false, null, null, 0, false, 0.2d, 30.0d);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str3, 3);
        C14360o3.A0B(set, 17);
        C14360o3.A0B(map, 18);
        C14360o3.A0B(str10, 19);
        C14360o3.A0B(executor, 20);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionConfig(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, int i2, long j, long j2, String str9, boolean z, boolean z2, boolean z3, Set set, Map map, String str10, Executor executor, Integer num, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z4) {
        this(str, str2, str3, i, str4, str5, str6, str7, str8, i2, j, j2, str9, z, z2, z3, set, map, str10, executor, num, i3, i4, i5, i6, i7, i8, i9, z4, false, false, null, false, false, null, false, null, null, 0, false, 0.2d, 30.0d);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str3, 3);
        C14360o3.A0B(set, 17);
        C14360o3.A0B(map, 18);
        C14360o3.A0B(str10, 19);
        C14360o3.A0B(executor, 20);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionConfig(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, int i2, long j, long j2, String str9, boolean z, boolean z2, boolean z3, Set set, Map map, String str10, Executor executor, Integer num, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z4, boolean z5) {
        this(str, str2, str3, i, str4, str5, str6, str7, str8, i2, j, j2, str9, z, z2, z3, set, map, str10, executor, num, i3, i4, i5, i6, i7, i8, i9, z4, z5, false, null, false, false, null, false, null, null, 0, false, 0.2d, 30.0d);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str3, 3);
        C14360o3.A0B(set, 17);
        C14360o3.A0B(map, 18);
        C14360o3.A0B(str10, 19);
        C14360o3.A0B(executor, 20);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionConfig(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, int i2, long j, long j2, String str9, boolean z, boolean z2, boolean z3, Set set, Map map, String str10, Executor executor, Integer num, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z4, boolean z5, boolean z6) {
        this(str, str2, str3, i, str4, str5, str6, str7, str8, i2, j, j2, str9, z, z2, z3, set, map, str10, executor, num, i3, i4, i5, i6, i7, i8, i9, z4, z5, z6, null, false, false, null, false, null, null, 0, false, 0.2d, 30.0d);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str3, 3);
        C14360o3.A0B(set, 17);
        C14360o3.A0B(map, 18);
        C14360o3.A0B(str10, 19);
        C14360o3.A0B(executor, 20);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionConfig(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, int i2, long j, long j2, String str9, boolean z, boolean z2, boolean z3, Set set, Map map, String str10, Executor executor, Integer num, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z4, boolean z5, boolean z6, PersonalizationConfig personalizationConfig) {
        this(str, str2, str3, i, str4, str5, str6, str7, str8, i2, j, j2, str9, z, z2, z3, set, map, str10, executor, num, i3, i4, i5, i6, i7, i8, i9, z4, z5, z6, personalizationConfig, false, false, null, false, null, null, 0, false, 0.2d, 30.0d);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str3, 3);
        C14360o3.A0B(set, 17);
        C14360o3.A0B(map, 18);
        C14360o3.A0B(str10, 19);
        C14360o3.A0B(executor, 20);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionConfig(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, int i2, long j, long j2, String str9, boolean z, boolean z2, boolean z3, Set set, Map map, String str10, Executor executor, Integer num, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z4, boolean z5, boolean z6, PersonalizationConfig personalizationConfig, boolean z7) {
        this(str, str2, str3, i, str4, str5, str6, str7, str8, i2, j, j2, str9, z, z2, z3, set, map, str10, executor, num, i3, i4, i5, i6, i7, i8, i9, z4, z5, z6, personalizationConfig, z7, false, null, false, null, null, 0, false, 0.2d, 30.0d);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str3, 3);
        C14360o3.A0B(set, 17);
        C14360o3.A0B(map, 18);
        C14360o3.A0B(str10, 19);
        C14360o3.A0B(executor, 20);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionConfig(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, int i2, long j, long j2, String str9, boolean z, boolean z2, boolean z3, Set set, Map map, String str10, Executor executor, Integer num, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z4, boolean z5, boolean z6, PersonalizationConfig personalizationConfig, boolean z7, boolean z8) {
        this(str, str2, str3, i, str4, str5, str6, str7, str8, i2, j, j2, str9, z, z2, z3, set, map, str10, executor, num, i3, i4, i5, i6, i7, i8, i9, z4, z5, z6, personalizationConfig, z7, z8, null, false, null, null, 0, false, 0.2d, 30.0d);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str3, 3);
        C14360o3.A0B(set, 17);
        C14360o3.A0B(map, 18);
        C14360o3.A0B(str10, 19);
        C14360o3.A0B(executor, 20);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionConfig(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, int i2, long j, long j2, String str9, boolean z, boolean z2, boolean z3, Set set, Map map, String str10, Executor executor, Integer num, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z4, boolean z5, boolean z6, PersonalizationConfig personalizationConfig, boolean z7, boolean z8, IMqttBypassClientHolder iMqttBypassClientHolder, boolean z9, Map map2, String str11, int i10, boolean z10, double d) {
        this(str, str2, str3, i, str4, str5, str6, str7, str8, i2, j, j2, str9, z, z2, z3, set, map, str10, executor, num, i3, i4, i5, i6, i7, i8, i9, z4, z5, z6, personalizationConfig, z7, z8, iMqttBypassClientHolder, z9, map2, str11, i10, z10, d, 30.0d);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str3, 3);
        C14360o3.A0B(set, 17);
        C14360o3.A0B(map, 18);
        C14360o3.A0B(str10, 19);
        C14360o3.A0B(executor, 20);
    }

    public ConnectionConfig(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, int i2, long j, long j2, String str9, boolean z, boolean z2, boolean z3, Set set, Map map, String str10, Executor executor, Integer num, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z4, boolean z5, boolean z6, PersonalizationConfig personalizationConfig, boolean z7, boolean z8, IMqttBypassClientHolder iMqttBypassClientHolder, boolean z9, Map map2, String str11, int i10, boolean z10, double d, double d2) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str3, 3);
        C14360o3.A0B(set, 17);
        C14360o3.A0B(map, 18);
        C14360o3.A0B(str10, 19);
        C14360o3.A0B(executor, 20);
        this.userId = str;
        this.password = str2;
        this.host = str3;
        this.port = i;
        this.userAgent = str4;
        this.deviceId = str5;
        this.clientType = str6;
        this.phpOverride = str7;
        this.appId = str8;
        this.initialNetworkState = i2;
        this.capabilities = j;
        this.endpointCapabilities = j2;
        this.regionHint = str9;
        this.qplEnabled = z;
        this.chatOnEnabled = z2;
        this.isAppInBackground = z3;
        this.subscribeTopics = set;
        this.appSpecificInfo = map;
        this.cacheDir = str10;
        this.callbackExecutor = executor;
        this.msysThreadPriority = num;
        this.clientKeepAliveInSeconds = i3;
        this.clientKeepAliveBackgroundInSeconds = i4;
        this.clientKeepAliveTimeoutInSeconds = i5;
        this.connectTimeoutInSeconds = i6;
        this.publishTimeoutInSeconds = i7;
        this.preemptivePublishTimeoutInSeconds = i8;
        this.maxServerUnavailableBeforeBackoff = i9;
        this.networkInterfaceHandlingCellularToWifiEnabled = z4;
        this.networkInterfaceHandlingWifiToCellularEnabled = z5;
        this.improvedStateReportEnabled = z6;
        this.personalizationConfig = personalizationConfig;
        this.enableDeferredDisconnect = z7;
        this.enableDeferredDisconnectOnEmptyRcv = z8;
        this.mqttBypassClientHolder = iMqttBypassClientHolder;
        this.autoSubscribeOnReconnect = z9;
        this.assetIds = map2;
        this.fallbackHost = str11;
        this.numFailuresForFallback = i10;
        this.highPriPendingPublishQueueEnabled = z10;
        this.initialReconnectBackoffInSeconds = d;
        this.maxReconnectBackoffInSeconds = d2;
    }

    public /* synthetic */ ConnectionConfig(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, int i2, long j, long j2, String str9, boolean z, boolean z2, boolean z3, Set set, Map map, String str10, Executor executor, Integer num, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z4, boolean z5, boolean z6, PersonalizationConfig personalizationConfig, boolean z7, boolean z8, IMqttBypassClientHolder iMqttBypassClientHolder, boolean z9, Map map2, String str11, int i10, boolean z10, double d, double d2, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, i, str4, str5, str6, str7, str8, i2, j, j2, str9, z, z2, z3, set, map, str10, executor, num, (i11 & 2097152) != 0 ? 60 : i3, (i11 & 4194304) != 0 ? 284 : i4, (i11 & DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE) != 0 ? 6 : i5, (i11 & 16777216) != 0 ? 10 : i6, (i11 & 33554432) != 0 ? 10 : i7, (i11 & 67108864) != 0 ? 0 : i8, (i11 & 134217728) != 0 ? 10 : i9, (i11 & 268435456) != 0 ? false : z4, (i11 & 536870912) != 0 ? false : z5, (i11 & AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO) != 0 ? false : z6, (i11 & Integer.MIN_VALUE) != 0 ? null : personalizationConfig, (i12 & 1) != 0 ? false : z7, (i12 & 2) != 0 ? false : z8, (i12 & 4) != 0 ? null : iMqttBypassClientHolder, (i12 & 8) != 0 ? false : z9, (i12 & 16) != 0 ? null : map2, (i12 & 32) != 0 ? null : str11, (i12 & 64) != 0 ? 0 : i10, (i12 & 128) != 0 ? false : z10, (i12 & 256) != 0 ? 0.2d : d, (i12 & 512) != 0 ? 30.0d : d2);
    }
}
