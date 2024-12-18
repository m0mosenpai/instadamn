package com.facebook.video.common.livestreaming.protocol;

import com.facebook.common.json.FbJsonDeserializer;
import java.util.Map;

/* loaded from: classes10.dex */
public class VideoBroadcastAudioStreamingConfigDeserializer extends FbJsonDeserializer {
    public static Map A00;

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0014, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x001c. Please report as an issue. */
    @Override // com.facebook.common.json.FbJsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.common.json.FbJsonField A0N(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastAudioStreamingConfigDeserializer> r2 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastAudioStreamingConfigDeserializer.class
            monitor-enter(r2)
            java.util.Map r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastAudioStreamingConfigDeserializer.A00     // Catch: java.lang.Throwable -> L7e
            if (r0 != 0) goto Le
            java.util.HashMap r0 = X.AbstractC166987dD.A1G()     // Catch: java.lang.Throwable -> L7e
            com.facebook.video.common.livestreaming.protocol.VideoBroadcastAudioStreamingConfigDeserializer.A00 = r0     // Catch: java.lang.Throwable -> L7e
            goto L18
        Le:
            java.lang.Object r1 = r0.get(r4)     // Catch: java.lang.Throwable -> L7e
            com.facebook.common.json.FbJsonField r1 = (com.facebook.common.json.FbJsonField) r1     // Catch: java.lang.Throwable -> L7e
            if (r1 == 0) goto L18
        L16:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7e
            goto L71
        L18:
            int r0 = r4.hashCode()     // Catch: java.lang.Exception -> L75 java.lang.Throwable -> L7e
            switch(r0) {
                case -2037875358: goto L5c;
                case -309425751: goto L4d;
                case -103223411: goto L3e;
                case 143085994: goto L2f;
                case 1432626128: goto L20;
                default: goto L1f;
            }     // Catch: java.lang.Exception -> L75 java.lang.Throwable -> L7e
        L1f:
            goto L72
        L20:
            java.lang.String r1 = "channels"
            boolean r0 = r4.equals(r1)     // Catch: java.lang.Exception -> L75 java.lang.Throwable -> L7e
            if (r0 == 0) goto L72
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastAudioStreamingConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastAudioStreamingConfig.class
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r0, r1)     // Catch: java.lang.Exception -> L75 java.lang.Throwable -> L7e
            goto L6b
        L2f:
            java.lang.String r1 = "sampleRate"
            boolean r0 = r4.equals(r1)     // Catch: java.lang.Exception -> L75 java.lang.Throwable -> L7e
            if (r0 == 0) goto L72
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastAudioStreamingConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastAudioStreamingConfig.class
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r0, r1)     // Catch: java.lang.Exception -> L75 java.lang.Throwable -> L7e
            goto L6b
        L3e:
            java.lang.String r1 = "bitRate"
            boolean r0 = r4.equals(r1)     // Catch: java.lang.Exception -> L75 java.lang.Throwable -> L7e
            if (r0 == 0) goto L72
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastAudioStreamingConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastAudioStreamingConfig.class
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r0, r1)     // Catch: java.lang.Exception -> L75 java.lang.Throwable -> L7e
            goto L6b
        L4d:
            java.lang.String r1 = "profile"
            boolean r0 = r4.equals(r1)     // Catch: java.lang.Exception -> L75 java.lang.Throwable -> L7e
            if (r0 == 0) goto L72
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastAudioStreamingConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastAudioStreamingConfig.class
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r0, r1)     // Catch: java.lang.Exception -> L75 java.lang.Throwable -> L7e
            goto L6b
        L5c:
            java.lang.String r1 = "useAudioASC"
            boolean r0 = r4.equals(r1)     // Catch: java.lang.Exception -> L75 java.lang.Throwable -> L7e
            if (r0 == 0) goto L72
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastAudioStreamingConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastAudioStreamingConfig.class
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r0, r1)     // Catch: java.lang.Exception -> L75 java.lang.Throwable -> L7e
        L6b:
            java.util.Map r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastAudioStreamingConfigDeserializer.A00     // Catch: java.lang.Throwable -> L7e
            r0.put(r4, r1)     // Catch: java.lang.Throwable -> L7e
            goto L16
        L71:
            return r1
        L72:
            r0 = 0
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7e
            return r0
        L75:
            r0 = move-exception
            X.AbstractC63327Shb.A02(r0)     // Catch: java.lang.Throwable -> L7e
            X.00O r0 = X.C00O.createAndThrow()     // Catch: java.lang.Throwable -> L7e
            throw r0     // Catch: java.lang.Throwable -> L7e
        L7e:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.common.livestreaming.protocol.VideoBroadcastAudioStreamingConfigDeserializer.A0N(java.lang.String):com.facebook.common.json.FbJsonField");
    }

    public VideoBroadcastAudioStreamingConfigDeserializer() {
        this.A00 = VideoBroadcastAudioStreamingConfig.class;
    }
}
