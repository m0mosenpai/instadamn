package com.facebook.spherical.util;

import com.facebook.common.json.FbJsonDeserializer;
import java.util.Map;

/* loaded from: classes10.dex */
public class QuaternionDeserializer extends FbJsonDeserializer {
    public static Map A00;

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0014, code lost:
    
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
            java.lang.Class<com.facebook.spherical.util.QuaternionDeserializer> r2 = com.facebook.spherical.util.QuaternionDeserializer.class
            monitor-enter(r2)
            java.util.Map r0 = com.facebook.spherical.util.QuaternionDeserializer.A00     // Catch: java.lang.Throwable -> L72
            if (r0 != 0) goto Le
            java.util.HashMap r0 = X.AbstractC166987dD.A1G()     // Catch: java.lang.Throwable -> L72
            com.facebook.spherical.util.QuaternionDeserializer.A00 = r0     // Catch: java.lang.Throwable -> L72
            goto L18
        Le:
            java.lang.Object r1 = r0.get(r4)     // Catch: java.lang.Throwable -> L72
            com.facebook.common.json.FbJsonField r1 = (com.facebook.common.json.FbJsonField) r1     // Catch: java.lang.Throwable -> L72
            if (r1 == 0) goto L18
        L16:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L72
            goto L65
        L18:
            int r0 = r4.hashCode()     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L72
            switch(r0) {
                case 119: goto L50;
                case 120: goto L40;
                case 121: goto L30;
                case 122: goto L20;
                default: goto L1f;
            }     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L72
        L1f:
            goto L66
        L20:
            java.lang.String r1 = "z"
            boolean r0 = r4.equals(r1)     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L72
            if (r0 == 0) goto L66
            java.lang.Class<com.facebook.spherical.util.Quaternion> r0 = com.facebook.spherical.util.Quaternion.class
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r0, r1)     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L72
            goto L5f
        L30:
            java.lang.String r1 = "y"
            boolean r0 = r4.equals(r1)     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L72
            if (r0 == 0) goto L66
            java.lang.Class<com.facebook.spherical.util.Quaternion> r0 = com.facebook.spherical.util.Quaternion.class
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r0, r1)     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L72
            goto L5f
        L40:
            java.lang.String r1 = "x"
            boolean r0 = r4.equals(r1)     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L72
            if (r0 == 0) goto L66
            java.lang.Class<com.facebook.spherical.util.Quaternion> r0 = com.facebook.spherical.util.Quaternion.class
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r0, r1)     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L72
            goto L5f
        L50:
            java.lang.String r1 = "w"
            boolean r0 = r4.equals(r1)     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L72
            if (r0 == 0) goto L66
            java.lang.Class<com.facebook.spherical.util.Quaternion> r0 = com.facebook.spherical.util.Quaternion.class
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r0, r1)     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L72
        L5f:
            java.util.Map r0 = com.facebook.spherical.util.QuaternionDeserializer.A00     // Catch: java.lang.Throwable -> L72
            r0.put(r4, r1)     // Catch: java.lang.Throwable -> L72
            goto L16
        L65:
            return r1
        L66:
            r0 = 0
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L72
            return r0
        L69:
            r0 = move-exception
            X.AbstractC63327Shb.A02(r0)     // Catch: java.lang.Throwable -> L72
            X.00O r0 = X.C00O.createAndThrow()     // Catch: java.lang.Throwable -> L72
            throw r0     // Catch: java.lang.Throwable -> L72
        L72:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L72
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.spherical.util.QuaternionDeserializer.A0N(java.lang.String):com.facebook.common.json.FbJsonField");
    }

    public QuaternionDeserializer() {
        this.A00 = Quaternion.class;
    }
}
