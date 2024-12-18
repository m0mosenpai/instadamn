package com.facebook.profilo.provider.systemcounters;

import X.AbstractC06550Wd;
import X.AbstractC09770fa;
import X.C06530Wa;
import X.C0VQ;
import X.C0VT;
import X.C0f9;
import android.os.Debug;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import com.facebook.jni.HybridData;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.MultiBufferLogger;
import com.facebook.profilo.provider.systemcounters.SystemCounterThread;

/* loaded from: classes.dex */
public final class SystemCounterThread extends C0VQ {
    public static final int PROVIDER_HIGH_FREQ_THREAD_COUNTERS;
    public static final int PROVIDER_SYSTEM_COUNTERS;
    public boolean mAllThreadsMode;
    public boolean mEnabled;
    public Handler mHandler;
    public HandlerThread mHandlerThread;
    public volatile boolean mHighFrequencyMode;
    public HybridData mHybridData;
    public C06530Wa mSystemCounterLogger;

    private native HybridData initHybrid(MultiBufferLogger multiBufferLogger);

    public static native void nativeAddToWhitelist(int i);

    public static native void nativeRemoveFromWhitelist(int i);

    @Override // X.C0VQ
    public synchronized void disable() {
        int A03 = C0f9.A03(493192633);
        if (this.mEnabled) {
            this.mSystemCounterLogger.A02();
            if (this.mAllThreadsMode) {
                logCounters();
                logExpensiveCounters();
            }
            if (this.mHighFrequencyMode) {
                logHighFrequencyThreadCounters();
                logTraceAnnotations();
            }
        }
        this.mEnabled = false;
        this.mAllThreadsMode = false;
        this.mHighFrequencyMode = false;
        nativeSetHighFrequencyMode(false);
        HybridData hybridData = this.mHybridData;
        if (hybridData != null) {
            hybridData.resetNative();
            this.mHybridData = null;
        }
        HandlerThread handlerThread = this.mHandlerThread;
        if (handlerThread != null) {
            handlerThread.quit();
            this.mHandlerThread = null;
        }
        this.mHandler = null;
        Debug.stopAllocCounting();
        C0f9.A0A(1054018765, A03);
    }

    @Override // X.C0VQ
    public synchronized void enable() {
        int A03 = C0f9.A03(-158531286);
        this.mHybridData = initHybrid(A02());
        this.mEnabled = true;
        if (this.mHandler == null) {
            HandlerThread handlerThread = new HandlerThread("Prflo:Counters");
            AbstractC09770fa.A00(handlerThread);
            this.mHandlerThread = handlerThread;
            handlerThread.start();
            final Looper looper = this.mHandlerThread.getLooper();
            this.mHandler = new Handler(looper) { // from class: X.0Wb
                @Override // android.os.Handler
                public final void handleMessage(Message message) {
                    SystemCounterThread systemCounterThread = this;
                    int i = message.what;
                    int i2 = message.arg1;
                    synchronized (systemCounterThread) {
                        try {
                            if (systemCounterThread.mEnabled) {
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i == 3) {
                                            systemCounterThread.logExpensiveCounters();
                                        } else {
                                            throw new IllegalArgumentException("Unknown message type");
                                        }
                                    } else {
                                        systemCounterThread.logHighFrequencyThreadCounters();
                                    }
                                } else {
                                    systemCounterThread.mSystemCounterLogger.A02();
                                    systemCounterThread.logCounters();
                                }
                                systemCounterThread.mHandler.sendMessageDelayed(systemCounterThread.mHandler.obtainMessage(i, i2, 0), i2);
                            }
                        } catch (Throwable th) {
                        }
                    }
                }
            };
        }
        TraceContext traceContext = this.A00;
        boolean z = false;
        if ((PROVIDER_SYSTEM_COUNTERS & TraceEvents.sProviders) != 0) {
            z = true;
        }
        if (z) {
            this.mHighFrequencyMode = false;
            nativeSetHighFrequencyMode(false);
            this.mAllThreadsMode = true;
            Debug.startAllocCounting();
            C06530Wa c06530Wa = this.mSystemCounterLogger;
            c06530Wa.A00 = 0L;
            c06530Wa.A01 = 0L;
            c06530Wa.A04 = 0L;
            c06530Wa.A05 = 0L;
            c06530Wa.A02 = 0L;
            c06530Wa.A03 = 0L;
            c06530Wa.A06 = 0L;
            c06530Wa.A07 = 0L;
            c06530Wa.A08 = 0L;
            c06530Wa.A09 = 0L;
            int i = 50;
            if (traceContext != null) {
                i = traceContext.A08.A00("provider.system_counters.sampling_rate_ms", 50);
            }
            this.mHandler.obtainMessage(1, i, 0).sendToTarget();
            int i2 = 1000;
            if (traceContext != null) {
                i2 = traceContext.A08.A00("provider.system_counters.expensive_sampling_rate_ms", 1000);
            }
            this.mHandler.obtainMessage(3, i2, 0).sendToTarget();
        }
        if ((PROVIDER_HIGH_FREQ_THREAD_COUNTERS & TraceEvents.sProviders) != 0) {
            int myPid = Process.myPid();
            AbstractC06550Wd abstractC06550Wd = AbstractC06550Wd.$redex_init_class;
            nativeAddToWhitelist(myPid);
            this.mHighFrequencyMode = true;
            nativeSetHighFrequencyMode(true);
            int i3 = 7;
            if (traceContext != null) {
                i3 = traceContext.A08.A00("provider.high_freq_main_thread_counters.sampling_rate_ms", 7);
            }
            this.mHandler.obtainMessage(2, i3, 0).sendToTarget();
        }
        C0f9.A0A(-1242989419, A03);
    }

    public native void logCounters();

    public native void logExpensiveCounters();

    public native void logHighFrequencyThreadCounters();

    public native void logTraceAnnotations();

    public native void nativeSetHighFrequencyMode(boolean z);

    @Override // X.C0VQ
    public int getSupportedProviders() {
        return PROVIDER_SYSTEM_COUNTERS | PROVIDER_HIGH_FREQ_THREAD_COUNTERS;
    }

    @Override // X.C0VQ
    public int getTracingProviders() {
        int i = 0;
        if (!this.mEnabled) {
            return 0;
        }
        if (this.mAllThreadsMode) {
            i = 0 | PROVIDER_SYSTEM_COUNTERS;
        }
        if (this.mHighFrequencyMode) {
            return i | PROVIDER_HIGH_FREQ_THREAD_COUNTERS;
        }
        return i;
    }

    static {
        C0VT c0vt = ProvidersRegistry.A00;
        PROVIDER_SYSTEM_COUNTERS = c0vt.A02("system_counters");
        PROVIDER_HIGH_FREQ_THREAD_COUNTERS = c0vt.A02("high_freq_main_thread_counters");
    }

    public SystemCounterThread() {
        super("profilo_systemcounters");
        this.mSystemCounterLogger = new C06530Wa(A02());
    }
}
