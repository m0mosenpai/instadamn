package X;

import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.BufferLogger;
import com.facebook.profilo.mmapbuf.core.Buffer;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.0RB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0RB extends AbstractC09940fw {
    @Override // X.AbstractC09940fw, X.InterfaceC20060yb
    public final void DcK(TraceContext traceContext, int i) {
        HashSet A03 = ProvidersRegistry.A00.A03(i);
        StringBuilder sb = new StringBuilder();
        Iterator it = A03.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (sb.length() != 0) {
                sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            }
            sb.append(str);
        }
        Buffer buffer = traceContext.A09;
        BufferLogger.writeBytesEntry(buffer, 0, 57, BufferLogger.writeBytesEntry(buffer, 0, 56, BufferLogger.writeStandardEntry(buffer, 6, 52, 0L, 0, 8126514, 0, 0L), "Active providers"), sb.toString());
    }

    @Override // X.AbstractC09940fw, X.InterfaceC20060yb
    public final void DcJ(TraceContext traceContext) {
        long nanoTime = System.nanoTime();
        Buffer buffer = traceContext.A09;
        BufferLogger.writeBytesEntry(buffer, 0, 83, BufferLogger.writeStandardEntry(buffer, 4, 21, nanoTime, 0, 0, 0, 0L), "Profilo.ProvidersInitialized");
        BufferLogger.writeStandardEntry(buffer, 4, 22, nanoTime, 0, 0, 0, 0L);
    }
}
