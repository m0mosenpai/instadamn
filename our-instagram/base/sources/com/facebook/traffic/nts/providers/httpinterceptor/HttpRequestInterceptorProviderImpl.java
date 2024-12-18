package com.facebook.traffic.nts.providers.httpinterceptor;

import X.C09170dP;
import X.C14360o3;
import com.facebook.jni.HybridData;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class HttpRequestInterceptorProviderImpl implements HttpRequestInterceptorProviderAppLayer, HttpRequestInterceptorProviderXplat {
    public static final Companion Companion = new Object();
    public final HybridData mHybridData;

    public HttpRequestInterceptorProviderImpl(HybridData hybridData) {
        C14360o3.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public static final native HybridData initHybrid0();

    @Override // com.facebook.traffic.nts.providers.httpinterceptor.HttpRequestInterceptorProviderAppLayer
    public native void onRequestAppLayer(HttpRequestInterface httpRequestInterface);

    /* loaded from: classes12.dex */
    public final class Companion {
        private final HybridData initHybrid0() {
            return HttpRequestInterceptorProviderImpl.initHybrid0();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.facebook.traffic.nts.providers.httpinterceptor.HttpRequestInterceptorProviderImpl$Companion] */
    static {
        C09170dP.A0C("http_interceptor");
    }

    @Override // com.facebook.traffic.nts.providers.httpinterceptor.HttpRequestInterceptorProviderXplat
    public void addInterceptor(HttpRequestInterceptor httpRequestInterceptor) {
        throw new RuntimeException("addInterceptor is to be used in xplat only.");
    }

    @Override // com.facebook.traffic.nts.providers.httpinterceptor.HttpRequestInterceptorProviderXplat
    public void onRequestXplat(HttpRequestInterface httpRequestInterface) {
        throw new RuntimeException("onRequestXplat is to be used in xplat only.");
    }

    public HttpRequestInterceptorProviderImpl() {
        this(initHybrid0());
    }
}
