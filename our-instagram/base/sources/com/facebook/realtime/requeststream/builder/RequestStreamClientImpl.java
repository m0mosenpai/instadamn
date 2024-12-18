package com.facebook.realtime.requeststream.builder;

import X.C09170dP;
import com.facebook.jni.HybridData;
import com.facebook.realtime.requeststream.api.BaseRequestStreamClient;

/* loaded from: classes2.dex */
public class RequestStreamClientImpl extends BaseRequestStreamClient {
    public String getTransport() {
        return "XPLAT_RS_ALL";
    }

    static {
        C09170dP.A0C("rs-builder-jni");
    }

    public RequestStreamClientImpl(HybridData hybridData) {
        super(hybridData);
    }
}
