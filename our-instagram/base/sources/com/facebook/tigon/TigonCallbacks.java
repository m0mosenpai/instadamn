package com.facebook.tigon;

import X.C9BO;
import X.InterfaceC74743Xi;
import com.facebook.tigon.iface.TigonRequest;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface TigonCallbacks {
    void onBody(ByteBuffer byteBuffer);

    void onBodyExperimental(byte[] bArr);

    void onEOM(InterfaceC74743Xi interfaceC74743Xi);

    void onError(TigonError tigonError, InterfaceC74743Xi interfaceC74743Xi);

    void onFirstByteFlushed(long j);

    void onHeaderBytesReceived(long j, long j2);

    void onLastByteAcked(long j, long j2);

    void onResponse(C9BO c9bo);

    void onStarted(TigonRequest tigonRequest);

    void onUploadProgress(long j, long j2);

    void onWillRetry(TigonError tigonError, InterfaceC74743Xi interfaceC74743Xi);
}
