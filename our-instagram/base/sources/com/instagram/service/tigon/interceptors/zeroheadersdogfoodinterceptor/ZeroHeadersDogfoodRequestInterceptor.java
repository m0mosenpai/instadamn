package com.instagram.service.tigon.interceptors.zeroheadersdogfoodinterceptor;

import X.AbstractC19750y3;
import X.C09170dP;
import X.C1DI;
import com.facebook.jni.HybridData;
import com.facebook.tigon.interceptors.RequestInterceptor;

/* loaded from: classes.dex */
public final class ZeroHeadersDogfoodRequestInterceptor extends RequestInterceptor {
    public static final C1DI Companion = new Object();
    public static final String PREF_ZERO_HEADERS_DOGFOODING = "PrefZeroHeadersDogfooding";
    public static final String ZERO_HEADERS_DOGFOOD_ID = "zero_headers_dogfood_id";

    public static final native HybridData initHybrid(String str);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.1DI] */
    static {
        C09170dP.A0C("zeroheadersdogfoodrequestinterceptor");
    }

    public ZeroHeadersDogfoodRequestInterceptor() {
        try {
            String string = AbstractC19750y3.A01(PREF_ZERO_HEADERS_DOGFOODING).getString(ZERO_HEADERS_DOGFOOD_ID, "");
            String str = string != null ? string : "";
            if (str.length() > 0) {
                this.mHybridData = initHybrid(str);
            } else {
                this.disabled = true;
            }
        } catch (Exception unused) {
            this.disabled = true;
        }
    }
}
