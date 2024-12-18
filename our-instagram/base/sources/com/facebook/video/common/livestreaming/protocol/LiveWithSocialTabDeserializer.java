package com.facebook.video.common.livestreaming.protocol;

import com.facebook.common.json.FbJsonDeserializer;
import java.util.Map;

/* loaded from: classes10.dex */
public class LiveWithSocialTabDeserializer extends FbJsonDeserializer {
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
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.LiveWithSocialTabDeserializer> r2 = com.facebook.video.common.livestreaming.protocol.LiveWithSocialTabDeserializer.class
            monitor-enter(r2)
            java.util.Map r0 = com.facebook.video.common.livestreaming.protocol.LiveWithSocialTabDeserializer.A00     // Catch: java.lang.Throwable -> L59
            if (r0 != 0) goto Le
            java.util.HashMap r0 = X.AbstractC166987dD.A1G()     // Catch: java.lang.Throwable -> L59
            com.facebook.video.common.livestreaming.protocol.LiveWithSocialTabDeserializer.A00 = r0     // Catch: java.lang.Throwable -> L59
            goto L18
        Le:
            java.lang.Object r1 = r0.get(r4)     // Catch: java.lang.Throwable -> L59
            com.facebook.common.json.FbJsonField r1 = (com.facebook.common.json.FbJsonField) r1     // Catch: java.lang.Throwable -> L59
            if (r1 == 0) goto L18
        L16:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L59
            goto L4c
        L18:
            int r1 = r4.hashCode()     // Catch: java.lang.Exception -> L50 java.lang.Throwable -> L59
            r0 = 40834(0x9f82, float:5.722E-41)
            if (r1 == r0) goto L36
            r0 = 110371416(0x6942258, float:5.5721876E-35)
            if (r1 != r0) goto L4d
            java.lang.String r1 = "title"
            boolean r0 = r4.equals(r1)     // Catch: java.lang.Exception -> L50 java.lang.Throwable -> L59
            if (r0 == 0) goto L4d
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.LiveWithSocialTab> r0 = com.facebook.video.common.livestreaming.protocol.LiveWithSocialTab.class
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r0, r1)     // Catch: java.lang.Exception -> L50 java.lang.Throwable -> L59
            goto L46
        L36:
            java.lang.String r0 = "'id"
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Exception -> L50 java.lang.Throwable -> L59
            if (r0 == 0) goto L4d
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.LiveWithSocialTab> r1 = com.facebook.video.common.livestreaming.protocol.LiveWithSocialTab.class
            java.lang.String r0 = "id"
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r1, r0)     // Catch: java.lang.Exception -> L50 java.lang.Throwable -> L59
        L46:
            java.util.Map r0 = com.facebook.video.common.livestreaming.protocol.LiveWithSocialTabDeserializer.A00     // Catch: java.lang.Throwable -> L59
            r0.put(r4, r1)     // Catch: java.lang.Throwable -> L59
            goto L16
        L4c:
            return r1
        L4d:
            r0 = 0
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L59
            return r0
        L50:
            r0 = move-exception
            X.AbstractC63327Shb.A02(r0)     // Catch: java.lang.Throwable -> L59
            X.00O r0 = X.C00O.createAndThrow()     // Catch: java.lang.Throwable -> L59
            throw r0     // Catch: java.lang.Throwable -> L59
        L59:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L59
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.common.livestreaming.protocol.LiveWithSocialTabDeserializer.A0N(java.lang.String):com.facebook.common.json.FbJsonField");
    }

    public LiveWithSocialTabDeserializer() {
        this.A00 = LiveWithSocialTab.class;
    }
}
