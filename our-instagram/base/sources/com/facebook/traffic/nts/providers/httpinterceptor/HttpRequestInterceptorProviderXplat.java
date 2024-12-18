package com.facebook.traffic.nts.providers.httpinterceptor;

/* loaded from: classes2.dex */
public interface HttpRequestInterceptorProviderXplat {
    void addInterceptor(HttpRequestInterceptor httpRequestInterceptor);

    void onRequestXplat(HttpRequestInterface httpRequestInterface);
}
