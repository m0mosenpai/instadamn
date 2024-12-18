package com.facebook.profilo.provider.threadlifecycle;

import X.C0VQ;
import X.C0f9;
import X.C20020yW;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.MultiBufferLogger;
import com.facebook.profilo.mmapbuf.core.Buffer;

/* loaded from: classes.dex */
public final class ThreadLifecycleProvider extends C0VQ {
    public static final int PROVIDER_THREADS = ProvidersRegistry.A00.A02("thread_lifecycle");
    public boolean mTracing;

    public static native void nativeStartProfiling(MultiBufferLogger multiBufferLogger, String str, String str2, boolean z, boolean z2);

    public static native void nativeStopProfiling();

    @Override // X.C0VQ
    public synchronized void onTraceEnded(TraceContext traceContext, C20020yW c20020yW) {
        int i;
        int A03 = C0f9.A03(-1756914383);
        if (!this.mTracing) {
            i = 2040742512;
        } else {
            nativeStopProfiling();
            this.mTracing = false;
            i = 2032426037;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C0VQ
    public synchronized void onTraceStarted(TraceContext traceContext, C20020yW c20020yW) {
        boolean A02;
        String str;
        int i;
        int A03 = C0f9.A03(-432367486);
        super.onTraceStarted(traceContext, c20020yW);
        if (this.mTracing) {
            i = -575756378;
        } else {
            boolean z = false;
            if (traceContext == null) {
                A02 = false;
            } else {
                A02 = traceContext.A08.A02("provider.thread_lifecycle.capture_stacks", false);
            }
            if (traceContext != null && traceContext.A08.A02("provider.thread_lifecycle.mixed_stack", false)) {
                z = true;
            }
            String str2 = null;
            if (A02 && traceContext != null) {
                Buffer buffer = traceContext.A09;
                if (buffer.getFilePath() != null) {
                    str2 = buffer.generateMemoryMappingFilePath();
                    str = buffer.generateLocalSymbolsFilePath();
                    nativeStartProfiling(A02(), str2, str, A02, z);
                    this.mTracing = true;
                    i = 1786176923;
                }
            }
            str = null;
            nativeStartProfiling(A02(), str2, str, A02, z);
            this.mTracing = true;
            i = 1786176923;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C0VQ
    public int getSupportedProviders() {
        return PROVIDER_THREADS;
    }

    @Override // X.C0VQ
    public int getTracingProviders() {
        int i = PROVIDER_THREADS;
        if ((TraceEvents.sProviders & i) == 0) {
            return 0;
        }
        return i;
    }

    public ThreadLifecycleProvider() {
        super("profilo_thread_lifecycle");
    }

    @Override // X.C0VQ
    public void disable() {
        C0f9.A0A(-307049239, C0f9.A03(58540697));
    }

    @Override // X.C0VQ
    public void enable() {
        C0f9.A0A(1687708055, C0f9.A03(-601805988));
    }
}
