package com.facebook.profilo.writer;

/* loaded from: classes.dex */
public interface NativeTraceWriterCallbacks {
    void onTraceWriteAbort(long j, int i);

    void onTraceWriteEnd(long j);

    void onTraceWriteException(long j, Throwable th);

    void onTraceWriteStart(long j, int i);
}
