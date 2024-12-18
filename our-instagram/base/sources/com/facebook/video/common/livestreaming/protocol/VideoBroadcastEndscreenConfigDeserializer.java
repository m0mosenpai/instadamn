package com.facebook.video.common.livestreaming.protocol;

import com.facebook.common.json.FbJsonDeserializer;
import java.util.Map;

/* loaded from: classes10.dex */
public class VideoBroadcastEndscreenConfigDeserializer extends FbJsonDeserializer {
    public static Map A00;

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0014, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x001d. Please report as an issue. */
    @Override // com.facebook.common.json.FbJsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.common.json.FbJsonField A0N(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfigDeserializer> r2 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfigDeserializer.class
            monitor-enter(r2)
            java.util.Map r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfigDeserializer.A00     // Catch: java.lang.Throwable -> Ld0
            if (r0 != 0) goto Le
            java.util.HashMap r0 = X.AbstractC166987dD.A1G()     // Catch: java.lang.Throwable -> Ld0
            com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfigDeserializer.A00 = r0     // Catch: java.lang.Throwable -> Ld0
            goto L19
        Le:
            java.lang.Object r1 = r0.get(r4)     // Catch: java.lang.Throwable -> Ld0
            com.facebook.common.json.FbJsonField r1 = (com.facebook.common.json.FbJsonField) r1     // Catch: java.lang.Throwable -> Ld0
            if (r1 == 0) goto L19
        L16:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld0
            goto Lc3
        L19:
            int r0 = r4.hashCode()     // Catch: java.lang.Exception -> Lc7 java.lang.Throwable -> Ld0
            switch(r0) {
                case -509784193: goto Lae;
                case -426471967: goto L9f;
                case 24103219: goto L90;
                case 72680724: goto L81;
                case 1212423419: goto L71;
                case 1668418280: goto L61;
                case 1711367039: goto L51;
                case 1815243521: goto L42;
                case 1824663458: goto L33;
                case 1941006174: goto L22;
                default: goto L20;
            }     // Catch: java.lang.Exception -> Lc7 java.lang.Throwable -> Ld0
        L20:
            goto Lc4
        L22:
            java.lang.String r1 = "wasLiveDeletionEnabled"
            boolean r0 = r4.equals(r1)     // Catch: java.lang.Exception -> Lc7 java.lang.Throwable -> Ld0
            if (r0 == 0) goto Lc4
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfig.class
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r0, r1)     // Catch: java.lang.Exception -> Lc7 java.lang.Throwable -> Ld0
            goto Lbc
        L33:
            java.lang.String r1 = "force30dRetention"
            boolean r0 = r4.equals(r1)     // Catch: java.lang.Exception -> Lc7 java.lang.Throwable -> Ld0
            if (r0 == 0) goto Lc4
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfig.class
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r0, r1)     // Catch: java.lang.Exception -> Lc7 java.lang.Throwable -> Ld0
            goto Lbc
        L42:
            java.lang.String r1 = "disableForeverLiveTTL"
            boolean r0 = r4.equals(r1)     // Catch: java.lang.Exception -> Lc7 java.lang.Throwable -> Ld0
            if (r0 == 0) goto Lc4
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfig.class
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r0, r1)     // Catch: java.lang.Exception -> Lc7 java.lang.Throwable -> Ld0
            goto Lbc
        L51:
            java.lang.String r1 = "useKeepForTextForOptions"
            boolean r0 = r4.equals(r1)     // Catch: java.lang.Exception -> Lc7 java.lang.Throwable -> Ld0
            if (r0 == 0) goto Lc4
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfig.class
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r0, r1)     // Catch: java.lang.Exception -> Lc7 java.lang.Throwable -> Ld0
            goto Lbc
        L61:
            java.lang.String r1 = "showBusinessSuiteText"
            boolean r0 = r4.equals(r1)     // Catch: java.lang.Exception -> Lc7 java.lang.Throwable -> Ld0
            if (r0 == 0) goto Lc4
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfig.class
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r0, r1)     // Catch: java.lang.Exception -> Lc7 java.lang.Throwable -> Ld0
            goto Lbc
        L71:
            java.lang.String r1 = "shouldConfirmForeverLiveTTLOption"
            boolean r0 = r4.equals(r1)     // Catch: java.lang.Exception -> Lc7 java.lang.Throwable -> Ld0
            if (r0 == 0) goto Lc4
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfig.class
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r0, r1)     // Catch: java.lang.Exception -> Lc7 java.lang.Throwable -> Ld0
            goto Lbc
        L81:
            java.lang.String r1 = "optionalTTLSelectScreen"
            boolean r0 = r4.equals(r1)     // Catch: java.lang.Exception -> Lc7 java.lang.Throwable -> Ld0
            if (r0 == 0) goto Lc4
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfig.class
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r0, r1)     // Catch: java.lang.Exception -> Lc7 java.lang.Throwable -> Ld0
            goto Lbc
        L90:
            java.lang.String r1 = "disableSixMonthsLiveTTL"
            boolean r0 = r4.equals(r1)     // Catch: java.lang.Exception -> Lc7 java.lang.Throwable -> Ld0
            if (r0 == 0) goto Lc4
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfig.class
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r0, r1)     // Catch: java.lang.Exception -> Lc7 java.lang.Throwable -> Ld0
            goto Lbc
        L9f:
            java.lang.String r1 = "defaultTTLSelection"
            boolean r0 = r4.equals(r1)     // Catch: java.lang.Exception -> Lc7 java.lang.Throwable -> Ld0
            if (r0 == 0) goto Lc4
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfig.class
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r0, r1)     // Catch: java.lang.Exception -> Lc7 java.lang.Throwable -> Ld0
            goto Lbc
        Lae:
            java.lang.String r1 = "liveToReelsBottomsheetEnabled"
            boolean r0 = r4.equals(r1)     // Catch: java.lang.Exception -> Lc7 java.lang.Throwable -> Ld0
            if (r0 == 0) goto Lc4
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfig.class
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r0, r1)     // Catch: java.lang.Exception -> Lc7 java.lang.Throwable -> Ld0
        Lbc:
            java.util.Map r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfigDeserializer.A00     // Catch: java.lang.Throwable -> Ld0
            r0.put(r4, r1)     // Catch: java.lang.Throwable -> Ld0
            goto L16
        Lc3:
            return r1
        Lc4:
            r0 = 0
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld0
            return r0
        Lc7:
            r0 = move-exception
            X.AbstractC63327Shb.A02(r0)     // Catch: java.lang.Throwable -> Ld0
            X.00O r0 = X.C00O.createAndThrow()     // Catch: java.lang.Throwable -> Ld0
            throw r0     // Catch: java.lang.Throwable -> Ld0
        Ld0:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfigDeserializer.A0N(java.lang.String):com.facebook.common.json.FbJsonField");
    }

    public VideoBroadcastEndscreenConfigDeserializer() {
        this.A00 = VideoBroadcastEndscreenConfig.class;
    }
}
