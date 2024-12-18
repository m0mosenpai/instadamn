package com.facebook.realtime.requeststream.api;

import X.C09170dP;
import X.C1UK;
import X.InterfaceC54242ee;
import com.facebook.jni.HybridData;
import com.facebook.realtime.requeststream.streameventhandler.StreamEventHandler;
import com.facebook.realtime.requeststream.streamref.NativeStream;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class BaseRequestStreamClient implements InterfaceC54242ee {
    public final HybridData mHybridData;

    @Override // X.InterfaceC54242ee
    public C1UK createStream(String str, byte[] bArr, String str2, StreamEventHandler streamEventHandler, Executor executor, int i) {
        return createStreamNative(str, bArr, str2, streamEventHandler, executor, i, null);
    }

    public native NativeStream createStreamNative(String str, byte[] bArr, String str2, StreamEventHandler streamEventHandler, Executor executor, int i, StreamOptions streamOptions);

    public native void onClientSessionEnded();

    static {
        C09170dP.A0C("rs-api-jni");
    }

    public BaseRequestStreamClient(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public C1UK createStream(String str, byte[] bArr, String str2, StreamEventHandler streamEventHandler, Executor executor) {
        return createStreamNative(str, bArr, str2, streamEventHandler, executor, 0, null);
    }

    public C1UK createStream(String str, byte[] bArr, String str2, StreamEventHandler streamEventHandler, Executor executor, int i, StreamOptions streamOptions) {
        return createStreamNative(str, bArr, str2, streamEventHandler, executor, i, streamOptions);
    }
}
