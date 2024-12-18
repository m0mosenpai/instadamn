package com.facebook.video.common.livestreaming.protocol;

import com.facebook.common.json.FbJsonDeserializer;
import java.util.Map;

/* loaded from: classes10.dex */
public class VideoBroadcastLiveWithConfigDeserializer extends FbJsonDeserializer {
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
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveWithConfigDeserializer> r2 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveWithConfigDeserializer.class
            monitor-enter(r2)
            java.util.Map r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveWithConfigDeserializer.A00     // Catch: java.lang.Throwable -> L6c
            if (r0 != 0) goto Le
            java.util.HashMap r0 = X.AbstractC166987dD.A1G()     // Catch: java.lang.Throwable -> L6c
            com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveWithConfigDeserializer.A00 = r0     // Catch: java.lang.Throwable -> L6c
            goto L18
        Le:
            java.lang.Object r1 = r0.get(r4)     // Catch: java.lang.Throwable -> L6c
            com.facebook.common.json.FbJsonField r1 = (com.facebook.common.json.FbJsonField) r1     // Catch: java.lang.Throwable -> L6c
            if (r1 == 0) goto L18
        L16:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6c
            goto L5f
        L18:
            int r1 = r4.hashCode()     // Catch: java.lang.Exception -> L63 java.lang.Throwable -> L6c
            r0 = 540947080(0x203e3288, float:1.6110345E-19)
            if (r1 == r0) goto L49
            r0 = 1137806104(0x43d18b18, float:419.08667)
            if (r1 == r0) goto L3a
            r0 = 1328403556(0x4f2dd464, float:2.9163776E9)
            if (r1 != r0) goto L60
            java.lang.String r1 = "isCenterCropOutputFrameEnabled"
            boolean r0 = r4.equals(r1)     // Catch: java.lang.Exception -> L63 java.lang.Throwable -> L6c
            if (r0 == 0) goto L60
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveWithConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveWithConfig.class
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r0, r1)     // Catch: java.lang.Exception -> L63 java.lang.Throwable -> L6c
            goto L59
        L3a:
            java.lang.String r1 = "isMuteModerationEnabled"
            boolean r0 = r4.equals(r1)     // Catch: java.lang.Exception -> L63 java.lang.Throwable -> L6c
            if (r0 == 0) goto L60
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveWithConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveWithConfig.class
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r0, r1)     // Catch: java.lang.Exception -> L63 java.lang.Throwable -> L6c
            goto L59
        L49:
            java.lang.String r0 = "isUseRtmpDimensionsForLiveswapEnabled"
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Exception -> L63 java.lang.Throwable -> L6c
            if (r0 == 0) goto L60
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveWithConfig> r1 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveWithConfig.class
            java.lang.String r0 = "isUseRtmpDimensionsForLiveSwapEnabled"
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r1, r0)     // Catch: java.lang.Exception -> L63 java.lang.Throwable -> L6c
        L59:
            java.util.Map r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveWithConfigDeserializer.A00     // Catch: java.lang.Throwable -> L6c
            r0.put(r4, r1)     // Catch: java.lang.Throwable -> L6c
            goto L16
        L5f:
            return r1
        L60:
            r0 = 0
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6c
            return r0
        L63:
            r0 = move-exception
            X.AbstractC63327Shb.A02(r0)     // Catch: java.lang.Throwable -> L6c
            X.00O r0 = X.C00O.createAndThrow()     // Catch: java.lang.Throwable -> L6c
            throw r0     // Catch: java.lang.Throwable -> L6c
        L6c:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveWithConfigDeserializer.A0N(java.lang.String):com.facebook.common.json.FbJsonField");
    }

    public VideoBroadcastLiveWithConfigDeserializer() {
        this.A00 = VideoBroadcastLiveWithConfig.class;
    }
}
