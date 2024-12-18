package com.facebook.video.common.livestreaming.protocol;

import com.facebook.common.json.FbJsonDeserializer;
import java.util.Map;

/* loaded from: classes10.dex */
public class VideoBroadcastLiveTraceConfigDeserializer extends FbJsonDeserializer {
    public static Map A00;

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0014, code lost:
    
        if (r1 != null) goto L9;
     */
    @Override // com.facebook.common.json.FbJsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.common.json.FbJsonField A0N(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveTraceConfigDeserializer> r2 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveTraceConfigDeserializer.class
            monitor-enter(r2)
            java.util.Map r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveTraceConfigDeserializer.A00     // Catch: java.lang.Throwable -> L6a
            if (r0 != 0) goto Le
            java.util.HashMap r0 = X.AbstractC166987dD.A1G()     // Catch: java.lang.Throwable -> L6a
            com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveTraceConfigDeserializer.A00 = r0     // Catch: java.lang.Throwable -> L6a
            goto L18
        Le:
            java.lang.Object r1 = r0.get(r4)     // Catch: java.lang.Throwable -> L6a
            com.facebook.common.json.FbJsonField r1 = (com.facebook.common.json.FbJsonField) r1     // Catch: java.lang.Throwable -> L6a
            if (r1 == 0) goto L18
        L16:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6a
            goto L5d
        L18:
            int r1 = r4.hashCode()     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L6a
            r0 = -1621206302(0xffffffff9f5e5ae2, float:-4.7085505E-20)
            if (r1 == r0) goto L49
            r0 = -1609594047(0xffffffffa00f8b41, float:-1.2158646E-19)
            if (r1 == r0) goto L3a
            r0 = 304418251(0x12250dcb, float:5.208182E-28)
            if (r1 != r0) goto L5e
            java.lang.String r1 = "sampleIntervalInSeconds"
            boolean r0 = r4.equals(r1)     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L6a
            if (r0 == 0) goto L5e
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveTraceConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveTraceConfig.class
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r0, r1)     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L6a
            goto L57
        L3a:
            java.lang.String r1 = "enabled"
            boolean r0 = r4.equals(r1)     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L6a
            if (r0 == 0) goto L5e
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveTraceConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveTraceConfig.class
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r0, r1)     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L6a
            goto L57
        L49:
            java.lang.String r1 = "samplingSource"
            boolean r0 = r4.equals(r1)     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L6a
            if (r0 == 0) goto L5e
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveTraceConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveTraceConfig.class
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r0, r1)     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L6a
        L57:
            java.util.Map r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveTraceConfigDeserializer.A00     // Catch: java.lang.Throwable -> L6a
            r0.put(r4, r1)     // Catch: java.lang.Throwable -> L6a
            goto L16
        L5d:
            return r1
        L5e:
            r0 = 0
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6a
            return r0
        L61:
            r0 = move-exception
            X.AbstractC63327Shb.A02(r0)     // Catch: java.lang.Throwable -> L6a
            X.00O r0 = X.C00O.createAndThrow()     // Catch: java.lang.Throwable -> L6a
            throw r0     // Catch: java.lang.Throwable -> L6a
        L6a:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveTraceConfigDeserializer.A0N(java.lang.String):com.facebook.common.json.FbJsonField");
    }

    public VideoBroadcastLiveTraceConfigDeserializer() {
        this.A00 = VideoBroadcastLiveTraceConfig.class;
    }
}
