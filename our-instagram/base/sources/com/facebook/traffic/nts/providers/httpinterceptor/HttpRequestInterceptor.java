package com.facebook.traffic.nts.providers.httpinterceptor;

/* loaded from: classes10.dex */
public interface HttpRequestInterceptor {
    String getName();

    void onRequest(HttpRequestInterface httpRequestInterface);
}
