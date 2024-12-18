package com.instagram.service.tigon;

import X.AbstractC16850sd;
import X.C14360o3;
import X.C1JP;
import X.C26831Rt;
import com.facebook.tigon.iface.TigonAuthHandler;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class IGTigonAuthHandler implements TigonAuthHandler {
    public static final C26831Rt Companion = new Object();
    public static final String TAG = "IGTigonAuthHandler";
    public final C1JP igAuthHandler;
    public final TigonUnexpectedErrorReporter tigonUnexpectedErrorReporter;

    public IGTigonAuthHandler(C1JP c1jp, TigonUnexpectedErrorReporter tigonUnexpectedErrorReporter) {
        C14360o3.A0B(c1jp, 1);
        C14360o3.A0B(tigonUnexpectedErrorReporter, 2);
        this.igAuthHandler = c1jp;
        this.tigonUnexpectedErrorReporter = tigonUnexpectedErrorReporter;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0037 A[LOOP:0: B:5:0x0031->B:7:0x0037, LOOP_END] */
    @Override // com.facebook.tigon.iface.TigonAuthHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map getAllHeaders(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r3 = "IGTigonAuthHandler"
            r0 = 0
            X.C14360o3.A0B(r6, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.1JP r1 = r5.igAuthHandler     // Catch: java.io.IOException -> L16 java.net.URISyntaxException -> L1b
            java.net.URI r0 = new java.net.URI     // Catch: java.io.IOException -> L16 java.net.URISyntaxException -> L1b
            r0.<init>(r6)     // Catch: java.io.IOException -> L16 java.net.URISyntaxException -> L1b
            r1.ACw(r0, r2)     // Catch: java.io.IOException -> L16 java.net.URISyntaxException -> L1b
            goto L22
        L16:
            com.instagram.service.tigon.TigonUnexpectedErrorReporter r1 = r5.tigonUnexpectedErrorReporter
            java.lang.String r0 = "Error attaching auth request headers"
            goto L1f
        L1b:
            com.instagram.service.tigon.TigonUnexpectedErrorReporter r1 = r5.tigonUnexpectedErrorReporter
            java.lang.String r0 = "Failed to convert url string to URI"
        L1f:
            r1.report(r3, r0)
        L22:
            r0 = 10
            int r0 = X.AbstractC06950Ym.A1E(r2, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            java.util.Iterator r3 = r2.iterator()
        L31:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r3.next()
            X.1El r0 = (X.C23781El) r0
            java.lang.String r2 = r0.A00
            java.lang.String r1 = r0.A01
            X.0e4 r0 = new X.0e4
            r0.<init>(r2, r1)
            r4.add(r0)
            goto L31
        L4a:
            java.util.Map r0 = X.AbstractC06930Yk.A08(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.service.tigon.IGTigonAuthHandler.getAllHeaders(java.lang.String):java.util.Map");
    }

    @Override // com.facebook.tigon.iface.TigonAuthHandler
    public Map getEmptyHeaders(String str) {
        return new LinkedHashMap();
    }

    @Override // com.facebook.tigon.iface.TigonAuthHandler
    public void update(String str, Map map) {
        TigonUnexpectedErrorReporter tigonUnexpectedErrorReporter;
        String str2;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(map, 1);
        try {
            URI uri = new URI(str);
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC16850sd.A0L(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                C14360o3.A0C(value, "null cannot be cast to non-null type kotlin.String");
                List singletonList = Collections.singletonList(value);
                C14360o3.A07(singletonList);
                linkedHashMap.put(key, singletonList);
            }
            this.igAuthHandler.FA4(uri, linkedHashMap);
        } catch (IOException unused) {
            tigonUnexpectedErrorReporter = this.tigonUnexpectedErrorReporter;
            str2 = "Error updating response headers";
            tigonUnexpectedErrorReporter.report(TAG, str2);
        } catch (URISyntaxException unused2) {
            tigonUnexpectedErrorReporter = this.tigonUnexpectedErrorReporter;
            str2 = "Failed to convert url string to URI";
            tigonUnexpectedErrorReporter.report(TAG, str2);
        }
    }
}
