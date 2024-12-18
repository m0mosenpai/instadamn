package com.facebook.profilo.provider.aslsession;

import X.AbstractC19980yS;
import X.C0L6;
import X.C20020yW;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.BufferLogger;
import com.facebook.profilo.mmapbuf.core.Buffer;

/* loaded from: classes.dex */
public class AslSessionIdProvider extends AbstractC19980yS {
    public AslSessionIdProvider() {
        super(null);
    }

    static {
        ProvidersRegistry.A00.A02("asl_session");
    }

    @Override // X.AbstractC19980yS
    public final void A07(TraceContext traceContext, C20020yW c20020yW) {
        Buffer buffer = traceContext.A09;
        BufferLogger.writeBytesEntry(buffer, 0, 57, BufferLogger.writeBytesEntry(buffer, 0, 56, BufferLogger.writeStandardEntry(buffer, 6, 52, 0L, 0, 8134124, 0, 0L), "Asl Session Id"), C0L6.A01());
    }
}
