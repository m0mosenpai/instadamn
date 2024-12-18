package com.facebook.profilo.provider.threadmetadata;

import X.AbstractC19980yS;
import X.C20020yW;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.mmapbuf.core.Buffer;

/* loaded from: classes.dex */
public final class ThreadMetadataProvider extends AbstractC19980yS {
    public static native void nativeLogThreadMetadata(Buffer buffer);

    @Override // X.AbstractC19980yS
    public void logOnTraceEnd(TraceContext traceContext, C20020yW c20020yW) {
        nativeLogThreadMetadata(traceContext.A09);
    }

    public ThreadMetadataProvider() {
        super("profilo_threadmetadata");
    }
}
