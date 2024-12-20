package com.facebook.proxygen;

import org.apache.http.Header;
import org.apache.http.client.methods.HttpUriRequest;

/* loaded from: classes10.dex */
public class JniHandler extends NativeHandleImpl implements HTTPTransportCallback, HTTPResponseHandler {
    public HTTPRequestHandler mRequestHandler;
    public HTTPResponseHandler mResponseHandler;
    public HTTPTransportCallback mTransportCallback;

    public JniHandler(HTTPRequestHandler hTTPRequestHandler, HTTPResponseHandler hTTPResponseHandler) {
        this(hTTPRequestHandler, hTTPResponseHandler, null);
    }

    private native void cancelNative();

    private native void changePriorityNative(byte b, boolean z);

    private native void closeNative();

    private native boolean sendBodyNative(byte[] bArr, int i, int i2);

    private native boolean sendEOMNative();

    private native boolean sendHeadersNative(HttpUriRequest httpUriRequest);

    private native boolean sendRequestWithBodyAndEOMNative(HttpUriRequest httpUriRequest, byte[] bArr, int i, int i2);

    private native void setEnabledCallbackFlagNative(int i);

    @Override // com.facebook.proxygen.HTTPTransportCallback
    public void bodyBytesGenerated(long j) {
        HTTPTransportCallback hTTPTransportCallback = this.mTransportCallback;
        if (hTTPTransportCallback != null) {
            hTTPTransportCallback.bodyBytesGenerated(j);
        }
    }

    @Override // com.facebook.proxygen.HTTPTransportCallback
    public void bodyBytesReceived(long j) {
        HTTPTransportCallback hTTPTransportCallback = this.mTransportCallback;
        if (hTTPTransportCallback != null) {
            hTTPTransportCallback.bodyBytesReceived(j);
        }
    }

    public void cancel() {
        this.mRequestHandler.mDelegate = null;
        cancelNative();
    }

    @Override // com.facebook.proxygen.HTTPTransportCallback
    public void firstByteFlushed() {
        HTTPTransportCallback hTTPTransportCallback = this.mTransportCallback;
        if (hTTPTransportCallback != null) {
            hTTPTransportCallback.firstByteFlushed();
        }
    }

    @Override // com.facebook.proxygen.HTTPTransportCallback
    public void firstHeaderByteFlushed() {
        HTTPTransportCallback hTTPTransportCallback = this.mTransportCallback;
        if (hTTPTransportCallback != null) {
            hTTPTransportCallback.firstHeaderByteFlushed();
        }
    }

    @Override // com.facebook.proxygen.HTTPTransportCallback
    public int getEnabledCallbackFlag() {
        HTTPTransportCallback hTTPTransportCallback = this.mTransportCallback;
        if (hTTPTransportCallback != null) {
            return hTTPTransportCallback.getEnabledCallbackFlag();
        }
        return 0;
    }

    @Override // com.facebook.proxygen.HTTPTransportCallback
    public void headerBytesGenerated(long j, long j2) {
        HTTPTransportCallback hTTPTransportCallback = this.mTransportCallback;
        if (hTTPTransportCallback != null) {
            hTTPTransportCallback.headerBytesGenerated(j, j2);
        }
    }

    @Override // com.facebook.proxygen.HTTPTransportCallback
    public void headerBytesReceived(long j, long j2) {
        HTTPTransportCallback hTTPTransportCallback = this.mTransportCallback;
        if (hTTPTransportCallback != null) {
            hTTPTransportCallback.headerBytesReceived(j, j2);
        }
    }

    @Override // com.facebook.proxygen.HTTPTransportCallback
    public void lastByteAcked(long j) {
        HTTPTransportCallback hTTPTransportCallback = this.mTransportCallback;
        if (hTTPTransportCallback != null) {
            hTTPTransportCallback.lastByteAcked(j);
        }
    }

    @Override // com.facebook.proxygen.HTTPTransportCallback
    public void lastByteFlushed() {
        HTTPTransportCallback hTTPTransportCallback = this.mTransportCallback;
        if (hTTPTransportCallback != null) {
            hTTPTransportCallback.lastByteFlushed();
        }
    }

    @Override // com.facebook.proxygen.HTTPResponseHandler
    public void onBody() {
        this.mResponseHandler.onBody();
    }

    @Override // com.facebook.proxygen.HTTPResponseHandler
    public void onEOM() {
        this.mResponseHandler.onEOM();
        this.mRequestHandler.mDelegate = null;
    }

    @Override // com.facebook.proxygen.HTTPResponseHandler
    public void onError(HTTPRequestError hTTPRequestError) {
        this.mResponseHandler.onError(hTTPRequestError);
        this.mRequestHandler.mDelegate = null;
    }

    @Override // com.facebook.proxygen.HTTPResponseHandler
    public void onResponse(int i, String str, Header[] headerArr) {
        this.mResponseHandler.onResponse(i, str, headerArr);
    }

    public void finalize() {
        closeNative();
    }

    public boolean sendBody(byte[] bArr, int i, int i2) {
        return sendBodyNative(bArr, i, i2);
    }

    public boolean sendEOM() {
        return sendEOMNative();
    }

    public boolean sendHeaders(HttpUriRequest httpUriRequest) {
        return sendHeadersNative(httpUriRequest);
    }

    public boolean sendRequestWithBodyAndEom(HttpUriRequest httpUriRequest, byte[] bArr, int i, int i2) {
        return sendRequestWithBodyAndEOMNative(httpUriRequest, bArr, i, i2);
    }

    public void changePriority(byte b, boolean z) {
        changePriorityNative(b, z);
    }

    public JniHandler(HTTPRequestHandler hTTPRequestHandler, HTTPResponseHandler hTTPResponseHandler, HTTPTransportCallback hTTPTransportCallback) {
        hTTPRequestHandler.getClass();
        hTTPResponseHandler.getClass();
        this.mRequestHandler = hTTPRequestHandler;
        this.mResponseHandler = hTTPResponseHandler;
        this.mTransportCallback = hTTPTransportCallback;
        hTTPRequestHandler.mDelegate = this;
    }
}
