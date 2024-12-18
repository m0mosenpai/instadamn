package X;

import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.ipc.TraceContext;
import com.instagram.transientanalysis.InstagramTransientNetworkDataCollector;
import java.io.File;

/* renamed from: X.10T, reason: invalid class name */
/* loaded from: classes.dex */
public final class C10T extends C0VQ {
    public static C10T A02;
    public static String A03;
    public static final int A04;
    public InstagramTransientNetworkDataCollector A00;
    public String A01;

    public C10T() {
        super(null);
        this.A01 = "UNKNOWN_TRACEID";
    }

    @Override // X.C0VQ
    public final synchronized void enable() {
        String str;
        int A032 = C0f9.A03(-1366642477);
        TraceContext traceContext = super.A00;
        if (traceContext != null) {
            str = AnonymousClass001.A0g(traceContext.A0D, "-", A03);
        } else {
            str = "UNKNOWN_TRACEID";
        }
        this.A01 = str;
        if (traceContext != null && this.A00 != null) {
            File file = null;
            if (C20020yW.A0A.get() != null) {
                file = C20020yW.A00().A04(this, traceContext);
            }
            this.A00.startDataCollection(file, false);
        }
        C0f9.A0A(-1545402783, A032);
    }

    @Override // X.C0VQ
    public final synchronized void onTraceEnded(TraceContext traceContext, C20020yW c20020yW) {
        int i;
        int A032 = C0f9.A03(2135138003);
        TraceContext traceContext2 = super.A00;
        if (traceContext2 != null && traceContext.A06 == traceContext2.A06) {
            this.A01 = "UNKNOWN_TRACEID";
            InstagramTransientNetworkDataCollector instagramTransientNetworkDataCollector = this.A00;
            if (instagramTransientNetworkDataCollector != null) {
                instagramTransientNetworkDataCollector.stopDataCollection(c20020yW.A04(this, traceContext));
            }
            i = -1217778690;
        } else {
            i = -558508124;
        }
        C0f9.A0A(i, A032);
    }

    public static synchronized C10T A00() {
        C10T c10t;
        synchronized (C10T.class) {
            if (A02 == null) {
                A02 = new C10T();
                A03 = C0JA.A00().A03();
            }
            c10t = A02;
        }
        return c10t;
    }

    @Override // X.C0VQ
    public final int getSupportedProviders() {
        return A04;
    }

    @Override // X.C0VQ
    public final int getTracingProviders() {
        TraceContext traceContext = super.A00;
        if (traceContext != null && C20020yW.A0A.get() != null) {
            C20020yW.A00().A04(this, traceContext);
        }
        InstagramTransientNetworkDataCollector instagramTransientNetworkDataCollector = this.A00;
        if (instagramTransientNetworkDataCollector != null && instagramTransientNetworkDataCollector._isTracingActive.get()) {
            return A04;
        }
        return 0;
    }

    static {
        C0VT c0vt = ProvidersRegistry.A00;
        A04 = c0vt.A02("transient_network_data");
        c0vt.A02("cell_diagnostic_data");
    }

    @Override // X.C0VQ
    public final void disable() {
        C0f9.A0A(408544169, C0f9.A03(-1367152439));
    }
}
