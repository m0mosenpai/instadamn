package com.facebook.video.common.livestreaming.protocol;

import com.facebook.common.json.FbJsonDeserializer;
import java.util.Map;

/* loaded from: classes10.dex */
public class VideoBroadcastVideoStreamingConfigDeserializer extends FbJsonDeserializer {
    public static Map A00;

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0014, code lost:
    
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
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastVideoStreamingConfigDeserializer> r2 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastVideoStreamingConfigDeserializer.class
            monitor-enter(r2)
            java.util.Map r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastVideoStreamingConfigDeserializer.A00     // Catch: java.lang.Throwable -> L8e
            if (r0 != 0) goto Le
            java.util.HashMap r0 = X.AbstractC166987dD.A1G()     // Catch: java.lang.Throwable -> L8e
            com.facebook.video.common.livestreaming.protocol.VideoBroadcastVideoStreamingConfigDeserializer.A00 = r0     // Catch: java.lang.Throwable -> L8e
            goto L18
        Le:
            java.lang.Object r1 = r0.get(r4)     // Catch: java.lang.Throwable -> L8e
            com.facebook.common.json.FbJsonField r1 = (com.facebook.common.json.FbJsonField) r1     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L18
        L16:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8e
            goto L81
        L18:
            int r0 = r4.hashCode()     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> L8e
            switch(r0) {
                case -1221029593: goto L6d;
                case -456581970: goto L5d;
                case -103223411: goto L4e;
                case 113126854: goto L3e;
                case 545057773: goto L2f;
                case 1538135913: goto L20;
                default: goto L1f;
            }     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> L8e
        L1f:
            goto L82
        L20:
            java.lang.String r1 = "iFrameInterval"
            boolean r0 = r4.equals(r1)     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> L8e
            if (r0 == 0) goto L82
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastVideoStreamingConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastVideoStreamingConfig.class
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r0, r1)     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> L8e
            goto L7b
        L2f:
            java.lang.String r1 = "frameRate"
            boolean r0 = r4.equals(r1)     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> L8e
            if (r0 == 0) goto L82
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastVideoStreamingConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastVideoStreamingConfig.class
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r0, r1)     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> L8e
            goto L7b
        L3e:
            java.lang.String r1 = "width"
            boolean r0 = r4.equals(r1)     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> L8e
            if (r0 == 0) goto L82
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastVideoStreamingConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastVideoStreamingConfig.class
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r0, r1)     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> L8e
            goto L7b
        L4e:
            java.lang.String r1 = "bitRate"
            boolean r0 = r4.equals(r1)     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> L8e
            if (r0 == 0) goto L82
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastVideoStreamingConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastVideoStreamingConfig.class
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r0, r1)     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> L8e
            goto L7b
        L5d:
            java.lang.String r1 = "videoProfile"
            boolean r0 = r4.equals(r1)     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> L8e
            if (r0 == 0) goto L82
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastVideoStreamingConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastVideoStreamingConfig.class
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r0, r1)     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> L8e
            goto L7b
        L6d:
            java.lang.String r1 = "height"
            boolean r0 = r4.equals(r1)     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> L8e
            if (r0 == 0) goto L82
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastVideoStreamingConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastVideoStreamingConfig.class
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r0, r1)     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> L8e
        L7b:
            java.util.Map r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastVideoStreamingConfigDeserializer.A00     // Catch: java.lang.Throwable -> L8e
            r0.put(r4, r1)     // Catch: java.lang.Throwable -> L8e
            goto L16
        L81:
            return r1
        L82:
            r0 = 0
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8e
            return r0
        L85:
            r0 = move-exception
            X.AbstractC63327Shb.A02(r0)     // Catch: java.lang.Throwable -> L8e
            X.00O r0 = X.C00O.createAndThrow()     // Catch: java.lang.Throwable -> L8e
            throw r0     // Catch: java.lang.Throwable -> L8e
        L8e:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.common.livestreaming.protocol.VideoBroadcastVideoStreamingConfigDeserializer.A0N(java.lang.String):com.facebook.common.json.FbJsonField");
    }

    public VideoBroadcastVideoStreamingConfigDeserializer() {
        this.A00 = VideoBroadcastVideoStreamingConfig.class;
    }
}
