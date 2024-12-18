package com.facebook.browser.lite.extensions.commercecheckout.models;

import com.facebook.common.json.FbJsonDeserializer;
import java.util.Map;

/* loaded from: classes10.dex */
public class ShopsLiteContentModelDeserializer extends FbJsonDeserializer {
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
    public final com.facebook.common.json.FbJsonField A0N(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.Class<com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteContentModelDeserializer> r3 = com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteContentModelDeserializer.class
            monitor-enter(r3)
            java.util.Map r0 = com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteContentModelDeserializer.A00     // Catch: java.lang.Throwable -> L86
            if (r0 != 0) goto Le
            java.util.HashMap r0 = X.AbstractC166987dD.A1G()     // Catch: java.lang.Throwable -> L86
            com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteContentModelDeserializer.A00 = r0     // Catch: java.lang.Throwable -> L86
            goto L18
        Le:
            java.lang.Object r1 = r0.get(r5)     // Catch: java.lang.Throwable -> L86
            com.facebook.common.json.FbJsonField r1 = (com.facebook.common.json.FbJsonField) r1     // Catch: java.lang.Throwable -> L86
            if (r1 == 0) goto L18
        L16:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L86
            goto L79
        L18:
            int r0 = r5.hashCode()     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L86
            switch(r0) {
                case -1857612946: goto L64;
                case -1816387540: goto L4e;
                case -1698419884: goto L3e;
                case -941747028: goto L2f;
                case -832507385: goto L20;
                default: goto L1f;
            }     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L86
        L1f:
            goto L7a
        L20:
            java.lang.String r1 = "fallbackCheckoutUrl"
            boolean r0 = r5.equals(r1)     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L86
            if (r0 == 0) goto L7a
            java.lang.Class<com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteContentModel> r0 = com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteContentModel.class
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r0, r1)     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L86
            goto L73
        L2f:
            java.lang.String r1 = "merchantDomain"
            boolean r0 = r5.equals(r1)     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L86
            if (r0 == 0) goto L7a
            java.lang.Class<com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteContentModel> r0 = com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteContentModel.class
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r0, r1)     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L86
            goto L73
        L3e:
            java.lang.String r1 = "sourceUrl"
            boolean r0 = r5.equals(r1)     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L86
            if (r0 == 0) goto L7a
            java.lang.Class<com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteContentModel> r0 = com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteContentModel.class
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r0, r1)     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L86
            goto L73
        L4e:
            java.lang.String r1 = "lineItems"
            boolean r0 = r5.equals(r1)     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L86
            if (r0 == 0) goto L7a
            java.lang.Class<com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteContentModel> r0 = com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteContentModel.class
            java.lang.reflect.Field r2 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L86
            java.lang.Class<com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteLineItem> r1 = com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteLineItem.class
            r0 = 0
            com.facebook.common.json.FbJsonField r1 = com.facebook.common.json.FbJsonField.jsonField(r2, r1, r0)     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L86
            goto L73
        L64:
            java.lang.String r1 = "visitToken"
            boolean r0 = r5.equals(r1)     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L86
            if (r0 == 0) goto L7a
            java.lang.Class<com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteContentModel> r0 = com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteContentModel.class
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r0, r1)     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L86
        L73:
            java.util.Map r0 = com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteContentModelDeserializer.A00     // Catch: java.lang.Throwable -> L86
            r0.put(r5, r1)     // Catch: java.lang.Throwable -> L86
            goto L16
        L79:
            return r1
        L7a:
            r0 = 0
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L86
            return r0
        L7d:
            r0 = move-exception
            X.AbstractC63327Shb.A02(r0)     // Catch: java.lang.Throwable -> L86
            X.00O r0 = X.C00O.createAndThrow()     // Catch: java.lang.Throwable -> L86
            throw r0     // Catch: java.lang.Throwable -> L86
        L86:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L86
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteContentModelDeserializer.A0N(java.lang.String):com.facebook.common.json.FbJsonField");
    }

    public ShopsLiteContentModelDeserializer() {
        this.A00 = ShopsLiteContentModel.class;
    }
}
