package com.facebook.profilo.provider.stacktrace;

import X.C0VQ;
import X.C0VT;
import X.C0f9;
import X.C20020yW;
import android.app.Application;
import android.content.Context;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.MultiBufferLogger;

/* loaded from: classes.dex */
public final class StackFrameThread extends C0VQ {
    public static final int PROVIDER_NATIVE_STACK_TRACE;
    public static final int PROVIDER_STACK_FRAME;
    public static final int PROVIDER_WALL_TIME_STACK_TRACE;
    public final Context mContext;
    public volatile boolean mEnabled;
    public Thread mProfilerThread;
    public TraceContext mSavedTraceContext;
    public int mSystemClockTimeIntervalMs;

    public static native int nativeCpuClockResolutionMicros();

    @Override // X.C0VQ
    public int getSupportedProviders() {
        return PROVIDER_NATIVE_STACK_TRACE | PROVIDER_STACK_FRAME | PROVIDER_WALL_TIME_STACK_TRACE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if ((r2 & r1) != 0) goto L9;
     */
    @Override // X.C0VQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getTracingProviders() {
        /*
            r4 = this;
            com.facebook.profilo.ipc.TraceContext r1 = r4.mSavedTraceContext
            boolean r0 = r4.mEnabled
            r3 = 0
            if (r0 == 0) goto L1d
            if (r1 == 0) goto L1d
            int r2 = r1.A02
            int r1 = com.facebook.profilo.provider.stacktrace.StackFrameThread.PROVIDER_WALL_TIME_STACK_TRACE
            r0 = r2 & r1
            if (r0 != 0) goto L17
            int r1 = com.facebook.profilo.provider.stacktrace.StackFrameThread.PROVIDER_STACK_FRAME
            r0 = r2 & r1
            if (r0 == 0) goto L18
        L17:
            r3 = r3 | r1
        L18:
            int r0 = com.facebook.profilo.provider.stacktrace.StackFrameThread.PROVIDER_NATIVE_STACK_TRACE
            r2 = r2 & r0
            r2 = r2 | r3
            return r2
        L1d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.stacktrace.StackFrameThread.getTracingProviders():int");
    }

    static {
        C0VT c0vt = ProvidersRegistry.A00;
        PROVIDER_STACK_FRAME = c0vt.A02("stack_trace");
        PROVIDER_WALL_TIME_STACK_TRACE = c0vt.A02("wall_time_stack_trace");
        PROVIDER_NATIVE_STACK_TRACE = c0vt.A02("native_stack_trace");
    }

    public StackFrameThread(Context context) {
        super("profilo_stacktrace");
        this.mSystemClockTimeIntervalMs = -1;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null && (context instanceof Application)) {
            this.mContext = context;
        } else {
            this.mContext = applicationContext;
        }
    }

    private void logAnnotation(String str, String str2) {
        MultiBufferLogger A02 = A02();
        A02.writeBytesEntry(0, 57, A02.writeBytesEntry(0, 56, A02.writeStandardEntry(6, 52, 0L, 0, 0, 0, 0L), str), str2);
    }

    @Override // X.C0VQ
    public void disable() {
        int i;
        int A03 = C0f9.A03(-1136144109);
        if (!this.mEnabled) {
            this.mProfilerThread = null;
            i = 1610381143;
        } else {
            this.mSavedTraceContext = null;
            this.mEnabled = false;
            synchronized (CPUProfiler.class) {
                if (CPUProfiler.sInitialized) {
                    CPUProfiler.nativeStopProfiling();
                }
            }
            Thread thread = this.mProfilerThread;
            if (thread != null) {
                try {
                    thread.join();
                    this.mProfilerThread = null;
                } catch (InterruptedException e) {
                    RuntimeException runtimeException = new RuntimeException(e);
                    C0f9.A0A(-831141173, A03);
                    throw runtimeException;
                }
            }
            i = -1057524221;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0184, code lost:
    
        if (r8 == 2) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x013d, code lost:
    
        if (r4 != false) goto L60;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:86:0x00ca. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0194 A[Catch: all -> 0x01f2, TryCatch #0 {, blocks: (B:42:0x0172, B:50:0x0188, B:53:0x018f, B:55:0x0194, B:56:0x0196, B:57:0x019a, B:62:0x01b3, B:64:0x01b6, B:73:0x01f0, B:74:0x01f1, B:66:0x01a1, B:68:0x01ac), top: B:24:0x00aa, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019b  */
    @Override // X.C0VQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void enable() {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.stacktrace.StackFrameThread.enable():void");
    }

    @Override // X.C0VQ
    public void onTraceEnded(TraceContext traceContext, C20020yW c20020yW) {
        int i;
        int A03 = C0f9.A03(-80213858);
        int i2 = traceContext.A02;
        int i3 = PROVIDER_STACK_FRAME;
        int i4 = PROVIDER_WALL_TIME_STACK_TRACE;
        if ((i2 & (i3 | i4)) != 0) {
            logAnnotation("provider.stack_trace.art_compatibility", Boolean.toString(ArtCompatibility.isCompatible(this.mContext)));
            int i5 = traceContext.A02;
            int i6 = (i3 | i4) & i5;
            int i7 = 0;
            if (i6 != 0) {
                i7 = 32752;
            }
            if ((i5 & PROVIDER_NATIVE_STACK_TRACE) != 0) {
                i7 |= 4;
            }
            synchronized (CPUProfiler.class) {
                i = CPUProfiler.sAvailableTracers;
            }
            logAnnotation("provider.stack_trace.tracers", Integer.toBinaryString(i7 & i));
        }
        if ((traceContext.A02 & getSupportedProviders()) != 0) {
            logAnnotation("provider.stack_trace.cpu_timer_res_us", Integer.toString(nativeCpuClockResolutionMicros()));
        }
        C0f9.A0A(1439812052, A03);
    }

    @Override // X.C0VQ
    public void onTraceStarted(TraceContext traceContext, C20020yW c20020yW) {
        int A03 = C0f9.A03(-51282705);
        if (CPUProfiler.sInitialized) {
            CPUProfiler.nativeResetFrameworkNamesSet();
        }
        C0f9.A0A(2081947076, A03);
    }
}
