package X;

import com.facebook.profilo.ipc.TraceContext;

/* renamed from: X.0yS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC19980yS extends C0VQ {
    public void A07(TraceContext traceContext, C20020yW c20020yW) {
    }

    @Override // X.C0VQ
    public final int getSupportedProviders() {
        return -1;
    }

    @Override // X.C0VQ
    public final int getTracingProviders() {
        return 0;
    }

    public void logOnTraceEnd(TraceContext traceContext, C20020yW c20020yW) {
    }

    @Override // X.C0VQ
    public final void disable() {
        C0f9.A0A(-1885709404, C0f9.A03(-507039351));
    }

    @Override // X.C0VQ
    public final void enable() {
        C0f9.A0A(286608778, C0f9.A03(1361811259));
    }

    @Override // X.C0VQ
    public final void onTraceEnded(TraceContext traceContext, C20020yW c20020yW) {
        int i;
        int A03 = C0f9.A03(1828791527);
        if (traceContext.A00 == 2) {
            i = -1558000179;
        } else {
            logOnTraceEnd(traceContext, c20020yW);
            i = -1998389700;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C0VQ
    public final void onTraceStarted(TraceContext traceContext, C20020yW c20020yW) {
        int A03 = C0f9.A03(202722663);
        A07(traceContext, c20020yW);
        C0f9.A0A(355906801, A03);
    }
}
