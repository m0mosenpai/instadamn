package com.facebook.realtime.requeststream.streameventhandler;

/* loaded from: classes2.dex */
public interface StreamEventHandler {
    void onData(byte[] bArr);

    void onFlowStatus(int i);

    void onLog(String str);

    void onTermination(int i, String str, boolean z);
}
