package com.instagram.service.tigon.interceptors.zerorewritenative;

import X.C09170dP;
import X.C16930sl;
import com.facebook.jni.HybridData;
import com.facebook.tigon.interceptors.RequestInterceptor;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class ZeroNativeRequestInterceptor extends RequestInterceptor {
    public static final Companion Companion = new Object();

    /* loaded from: classes.dex */
    public final class Companion {
        public static final ZeroNativeRewriteRulesBuilder A00(List list) {
            ZeroNativeRewriteRulesBuilder zeroNativeRewriteRulesBuilder = new ZeroNativeRewriteRulesBuilder();
            zeroNativeRewriteRulesBuilder.addRewriteRules(list);
            zeroNativeRewriteRulesBuilder.buildNative();
            return zeroNativeRewriteRulesBuilder;
        }

        public final ZeroNativeRewriteRulesBuilder lazyLoadBuilder() {
            return A00(C16930sl.A00);
        }
    }

    public static final native HybridData initHybrid(Set set, boolean z);

    public final native void setRewriteData(ZeroNativeRewriteRulesBuilder zeroNativeRewriteRulesBuilder, boolean z, String str);

    public final native void setZeroBalanceState(String str);

    /* JADX WARN: Type inference failed for: r0v0, types: [com.instagram.service.tigon.interceptors.zerorewritenative.ZeroNativeRequestInterceptor$Companion, java.lang.Object] */
    static {
        C09170dP.A0C("zeronativerequestinterceptor");
    }

    public static final ZeroNativeRewriteRulesBuilder lazyLoadBuilder() {
        return Companion.A00(C16930sl.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (X.C20150ym.A07(X.AbstractC20100yh.A00(36331300155770094L)) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (X.C20150ym.A07(X.AbstractC20100yh.A00(36331300155704557L)) != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ZeroNativeRequestInterceptor() {
        /*
            r5 = this;
            r5.<init>()
            r0 = 36328156239772938(0x81104400043d0a, double:3.0374105155516384E-306)
            X.0tH r0 = X.AbstractC20100yh.A00(r0)     // Catch: java.lang.Exception -> L78
            boolean r0 = X.C20150ym.A07(r0)     // Catch: java.lang.Exception -> L78
            if (r0 != 0) goto L22
            r0 = 36331300155704557(0x811320000244ed, double:3.0393987406463276E-306)
            X.0tH r0 = X.AbstractC20100yh.A00(r0)     // Catch: java.lang.Exception -> L78
            boolean r1 = X.C20150ym.A07(r0)     // Catch: java.lang.Exception -> L78
            r0 = 1
            if (r1 == 0) goto L23
        L22:
            r0 = 0
        L23:
            r5.disabled = r0     // Catch: java.lang.Exception -> L78
            if (r0 != 0) goto L83
            X.AbstractC53601Nn8.A00 = r5     // Catch: java.lang.Exception -> L78
            java.lang.String r0 = "[\"ZeroCampaignAPI\", \"IgZeroEasyDogfoodingStart\"]"
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet     // Catch: java.lang.Exception -> L78
            r3.<init>()     // Catch: java.lang.Exception -> L78
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: org.json.JSONException -> L49 java.lang.Exception -> L78
            r4.<init>(r0)     // Catch: org.json.JSONException -> L49 java.lang.Exception -> L78
            r2 = 0
            int r1 = r4.length()     // Catch: org.json.JSONException -> L49 java.lang.Exception -> L78
        L3a:
            if (r2 >= r1) goto L51
            java.lang.String r0 = r4.getString(r2)     // Catch: org.json.JSONException -> L49 java.lang.Exception -> L78
            X.C14360o3.A07(r0)     // Catch: org.json.JSONException -> L49 java.lang.Exception -> L78
            r3.add(r0)     // Catch: org.json.JSONException -> L49 java.lang.Exception -> L78
            int r2 = r2 + 1
            goto L3a
        L49:
            r2 = move-exception
            java.lang.String r1 = "ZeroNativeRequestInterceptor"
            java.lang.String r0 = "Error while parsing Bootstrap requests JSON"
            X.C0K8.A0F(r1, r0, r2)     // Catch: java.lang.Exception -> L78
        L51:
            r0 = 36328156239838475(0x81104400053d0b, double:3.037410515593084E-306)
            X.0tH r0 = X.AbstractC20100yh.A00(r0)     // Catch: java.lang.Exception -> L78
            boolean r0 = X.C20150ym.A07(r0)     // Catch: java.lang.Exception -> L78
            if (r0 != 0) goto L70
            r0 = 36331300155770094(0x811320000344ee, double:3.0393987406877734E-306)
            X.0tH r0 = X.AbstractC20100yh.A00(r0)     // Catch: java.lang.Exception -> L78
            boolean r1 = X.C20150ym.A07(r0)     // Catch: java.lang.Exception -> L78
            r0 = 0
            if (r1 == 0) goto L71
        L70:
            r0 = 1
        L71:
            com.facebook.jni.HybridData r0 = initHybrid(r3, r0)     // Catch: java.lang.Exception -> L78
            r5.mHybridData = r0     // Catch: java.lang.Exception -> L78
            return
        L78:
            r2 = move-exception
            r0 = 1
            r5.disabled = r0
            java.lang.String r1 = "ZeroNativeRequestInterceptor"
            java.lang.String r0 = "Failed init"
            X.C0K8.A0F(r1, r0, r2)
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.service.tigon.interceptors.zerorewritenative.ZeroNativeRequestInterceptor.<init>():void");
    }
}
