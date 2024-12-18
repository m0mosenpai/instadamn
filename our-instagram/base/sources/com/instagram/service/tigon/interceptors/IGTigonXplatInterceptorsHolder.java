package com.instagram.service.tigon.interceptors;

import X.C09170dP;
import X.C1DD;
import com.facebook.jni.HybridData;
import com.facebook.tigon.interceptors.RequestInterceptor;
import com.facebook.tigon.interceptors.ResponseInterceptor;
import com.instagram.service.tigon.interceptors.zeroheadersdogfoodinterceptor.ZeroHeadersDogfoodRequestInterceptor;
import com.instagram.service.tigon.interceptors.zerorewritenative.ZeroNativeRequestInterceptor;

/* loaded from: classes.dex */
public final class IGTigonXplatInterceptorsHolder {
    public static final C1DD Companion = new Object();
    public final HybridData mHybridData = initHybrid();

    public static final native HybridData initHybrid();

    private final native void registerRequestInterceptor(RequestInterceptor requestInterceptor);

    private final native void registerResponseInterceptor(ResponseInterceptor responseInterceptor);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1DD, java.lang.Object] */
    static {
        C09170dP.A0C("igtigonxplatinterceptorsholder");
    }

    public IGTigonXplatInterceptorsHolder() {
        RequestInterceptor zeroHeadersDogfoodRequestInterceptor;
        int[] iArr = {0, 1};
        int i = 0;
        do {
            int i2 = iArr[i];
            if (i2 != 0) {
                if (i2 == 1) {
                    zeroHeadersDogfoodRequestInterceptor = new ZeroNativeRequestInterceptor();
                } else {
                    throw new IllegalArgumentException(String.format("No implementation bound to key: %s", Integer.valueOf(i2)));
                }
            } else {
                zeroHeadersDogfoodRequestInterceptor = new ZeroHeadersDogfoodRequestInterceptor();
            }
            if (!zeroHeadersDogfoodRequestInterceptor.disabled) {
                registerRequestInterceptor(zeroHeadersDogfoodRequestInterceptor);
            }
            i++;
        } while (i < 2);
    }
}
