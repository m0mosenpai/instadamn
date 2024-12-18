package com.facebook.cameracore.mediapipeline.services.networking.interfaces;

/* loaded from: classes10.dex */
public class HTTPResponse {
    public byte[] content;
    public String[] headerNames;
    public String[] headerValues;
    public int statusCode;

    public String[] getHeaderNames() {
        return this.headerNames;
    }

    public String[] getHeaderValues() {
        return this.headerValues;
    }

    public long getNumHeaders() {
        if (this.headerNames == null) {
            return 0L;
        }
        return r0.length;
    }
}
