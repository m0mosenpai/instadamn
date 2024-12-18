package com.facebook.video.common.livestreaming.protocol;

import com.facebook.common.json.FbJsonDeserializer;
import java.util.Map;

/* loaded from: classes10.dex */
public class VideoBroadcastLiveOnlineEventConfigDeserializer extends FbJsonDeserializer {
    public static Map A00;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0014, code lost:
    
        if (r1 != null) goto L9;
     */
    @Override // com.facebook.common.json.FbJsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.common.json.FbJsonField A0N(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveOnlineEventConfigDeserializer> r3 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveOnlineEventConfigDeserializer.class
            monitor-enter(r3)
            java.util.Map r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveOnlineEventConfigDeserializer.A00     // Catch: java.lang.Throwable -> L49
            if (r0 != 0) goto Le
            java.util.HashMap r0 = X.AbstractC166987dD.A1G()     // Catch: java.lang.Throwable -> L49
            com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveOnlineEventConfigDeserializer.A00 = r0     // Catch: java.lang.Throwable -> L49
            goto L18
        Le:
            java.lang.Object r1 = r0.get(r5)     // Catch: java.lang.Throwable -> L49
            com.facebook.common.json.FbJsonField r1 = (com.facebook.common.json.FbJsonField) r1     // Catch: java.lang.Throwable -> L49
            if (r1 == 0) goto L18
        L16:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L49
            goto L3c
        L18:
            int r1 = r5.hashCode()     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L49
            r0 = 2015319165(0x781f547d, float:1.2926388E34)
            if (r1 != r0) goto L3d
            java.lang.String r1 = "creationEntryPoint"
            boolean r0 = r5.equals(r1)     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L49
            if (r0 == 0) goto L3d
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveOnlineEventConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveOnlineEventConfig.class
            java.lang.reflect.Field r2 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L49
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0 = 0
            com.facebook.common.json.FbJsonField r1 = com.facebook.common.json.FbJsonField.jsonField(r2, r1, r0)     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L49
            java.util.Map r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveOnlineEventConfigDeserializer.A00     // Catch: java.lang.Throwable -> L49
            r0.put(r5, r1)     // Catch: java.lang.Throwable -> L49
            goto L16
        L3c:
            return r1
        L3d:
            r0 = 0
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L49
            return r0
        L40:
            r0 = move-exception
            X.AbstractC63327Shb.A02(r0)     // Catch: java.lang.Throwable -> L49
            X.00O r0 = X.C00O.createAndThrow()     // Catch: java.lang.Throwable -> L49
            throw r0     // Catch: java.lang.Throwable -> L49
        L49:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L49
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveOnlineEventConfigDeserializer.A0N(java.lang.String):com.facebook.common.json.FbJsonField");
    }

    public VideoBroadcastLiveOnlineEventConfigDeserializer() {
        this.A00 = VideoBroadcastLiveOnlineEventConfig.class;
    }
}
