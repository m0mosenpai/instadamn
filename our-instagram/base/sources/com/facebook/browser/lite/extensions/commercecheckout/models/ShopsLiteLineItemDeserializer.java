package com.facebook.browser.lite.extensions.commercecheckout.models;

import com.facebook.common.json.FbJsonDeserializer;
import java.util.Map;

/* loaded from: classes10.dex */
public class ShopsLiteLineItemDeserializer extends FbJsonDeserializer {
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
            java.lang.Class<com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteLineItemDeserializer> r2 = com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteLineItemDeserializer.class
            monitor-enter(r2)
            java.util.Map r0 = com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteLineItemDeserializer.A00     // Catch: java.lang.Throwable -> L6b
            if (r0 != 0) goto Le
            java.util.HashMap r0 = X.AbstractC166987dD.A1G()     // Catch: java.lang.Throwable -> L6b
            com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteLineItemDeserializer.A00 = r0     // Catch: java.lang.Throwable -> L6b
            goto L18
        Le:
            java.lang.Object r1 = r0.get(r4)     // Catch: java.lang.Throwable -> L6b
            com.facebook.common.json.FbJsonField r1 = (com.facebook.common.json.FbJsonField) r1     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L18
        L16:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6b
            goto L5e
        L18:
            int r1 = r4.hashCode()     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L6b
            r0 = -1285004149(0xffffffffb368648b, float:-5.4108153E-8)
            if (r1 == r0) goto L4a
            r0 = -238100612(0xfffffffff1cedf7c, float:-2.0487708E30)
            if (r1 == r0) goto L3b
            r0 = -82113408(0xfffffffffb1b0c80, float:-8.0505954E35)
            if (r1 != r0) goto L5f
            java.lang.String r1 = "variantId"
            boolean r0 = r4.equals(r1)     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L6b
            if (r0 == 0) goto L5f
            java.lang.Class<com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteLineItem> r0 = com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteLineItem.class
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r0, r1)     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L6b
            goto L58
        L3b:
            java.lang.String r1 = "requiresShipping"
            boolean r0 = r4.equals(r1)     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L6b
            if (r0 == 0) goto L5f
            java.lang.Class<com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteLineItem> r0 = com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteLineItem.class
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r0, r1)     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L6b
            goto L58
        L4a:
            java.lang.String r1 = "quantity"
            boolean r0 = r4.equals(r1)     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L6b
            if (r0 == 0) goto L5f
            java.lang.Class<com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteLineItem> r0 = com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteLineItem.class
            com.facebook.common.json.FbJsonField r1 = X.AbstractC58322PtE.A0K(r0, r1)     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L6b
        L58:
            java.util.Map r0 = com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteLineItemDeserializer.A00     // Catch: java.lang.Throwable -> L6b
            r0.put(r4, r1)     // Catch: java.lang.Throwable -> L6b
            goto L16
        L5e:
            return r1
        L5f:
            r0 = 0
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6b
            return r0
        L62:
            r0 = move-exception
            X.AbstractC63327Shb.A02(r0)     // Catch: java.lang.Throwable -> L6b
            X.00O r0 = X.C00O.createAndThrow()     // Catch: java.lang.Throwable -> L6b
            throw r0     // Catch: java.lang.Throwable -> L6b
        L6b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteLineItemDeserializer.A0N(java.lang.String):com.facebook.common.json.FbJsonField");
    }

    public ShopsLiteLineItemDeserializer() {
        this.A00 = ShopsLiteLineItem.class;
    }
}
