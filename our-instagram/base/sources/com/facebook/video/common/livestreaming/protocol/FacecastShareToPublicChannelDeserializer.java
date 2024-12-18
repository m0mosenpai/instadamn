package com.facebook.video.common.livestreaming.protocol;

import com.facebook.common.json.FbJsonDeserializer;
import java.util.Map;

/* loaded from: classes10.dex */
public class FacecastShareToPublicChannelDeserializer extends FbJsonDeserializer {
    public static Map A00;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0014, code lost:
    
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
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.FacecastShareToPublicChannelDeserializer> r2 = com.facebook.video.common.livestreaming.protocol.FacecastShareToPublicChannelDeserializer.class
            monitor-enter(r2)
            java.util.Map r0 = com.facebook.video.common.livestreaming.protocol.FacecastShareToPublicChannelDeserializer.A00     // Catch: java.lang.Throwable -> L57
            if (r0 != 0) goto Le
            java.util.HashMap r0 = X.AbstractC166987dD.A1G()     // Catch: java.lang.Throwable -> L57
            com.facebook.video.common.livestreaming.protocol.FacecastShareToPublicChannelDeserializer.A00 = r0     // Catch: java.lang.Throwable -> L57
            goto L18
        Le:
            java.lang.Object r1 = r0.get(r4)     // Catch: java.lang.Throwable -> L57
            com.facebook.common.json.FbJsonField r1 = (com.facebook.common.json.FbJsonField) r1     // Catch: java.lang.Throwable -> L57
            if (r1 == 0) goto L18
        L16:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L57
            goto L4a
        L18:
            int r1 = r4.hashCode()     // Catch: java.lang.Exception -> L4e java.lang.Throwable -> L57
            r0 = -1185159243(0xffffffffb95be7b5, float:-2.0971785E-4)
            if (r1 == r0) goto L35
            r0 = 65596345(0x3e8ebb9, float:1.3689854E-36)
            if (r1 != r0) goto L4b
            java.lang.String r1 = "initialToggleState"
            boolean r0 = r4.equals(r1)     // Catch: java.lang.Exception -> L4e java.lang.Throwable -> L57
            if (r0 == 0) goto L4b
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.FacecastShareToPublicChannel> r0 = com.facebook.video.common.livestreaming.protocol.FacecastShareToPublicChannel.class
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r0, r1)     // Catch: java.lang.Exception -> L4e java.lang.Throwable -> L57
            goto L44
        L35:
            java.lang.String r1 = "threadName"
            boolean r0 = r4.equals(r1)     // Catch: java.lang.Exception -> L4e java.lang.Throwable -> L57
            if (r0 == 0) goto L4b
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.FacecastShareToPublicChannel> r0 = com.facebook.video.common.livestreaming.protocol.FacecastShareToPublicChannel.class
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r0, r1)     // Catch: java.lang.Exception -> L4e java.lang.Throwable -> L57
        L44:
            java.util.Map r0 = com.facebook.video.common.livestreaming.protocol.FacecastShareToPublicChannelDeserializer.A00     // Catch: java.lang.Throwable -> L57
            r0.put(r4, r1)     // Catch: java.lang.Throwable -> L57
            goto L16
        L4a:
            return r1
        L4b:
            r0 = 0
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L57
            return r0
        L4e:
            r0 = move-exception
            X.AbstractC63327Shb.A02(r0)     // Catch: java.lang.Throwable -> L57
            X.00O r0 = X.C00O.createAndThrow()     // Catch: java.lang.Throwable -> L57
            throw r0     // Catch: java.lang.Throwable -> L57
        L57:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L57
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.common.livestreaming.protocol.FacecastShareToPublicChannelDeserializer.A0N(java.lang.String):com.facebook.common.json.FbJsonField");
    }

    public FacecastShareToPublicChannelDeserializer() {
        this.A00 = FacecastShareToPublicChannel.class;
    }
}
