package com.facebook.profilo.provider.perfevents;

import android.os.Process;
import com.facebook.profilo.logger.MultiBufferLogger;
import com.facebook.profilo.provider.perfevents.PerfEventsSession;

/* loaded from: classes.dex */
public class PerfEventsSession {
    public long mNativeHandle;
    public final Runnable mSessionRunnable = new Runnable() { // from class: X.0WR
        @Override // java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(5);
            PerfEventsSession.nativeRun(PerfEventsSession.this.mNativeHandle);
        }
    };
    public Thread mThread;

    public static native long nativeAttach(boolean z, int i, int i2, float f, MultiBufferLogger multiBufferLogger);

    public static native void nativeDetach(long j);

    public static native void nativeRun(long j);

    public static native void nativeStop(long j);

    public synchronized void stop() {
        long j = this.mNativeHandle;
        if (j == 0) {
            if (this.mThread != null) {
                throw new IllegalStateException("Inconsistent state: have thread but no handle");
            }
        } else {
            nativeStop(j);
            try {
                this.mThread.join();
                this.mThread = null;
            } catch (InterruptedException e) {
            }
        }
    }

    public void finalize() {
        stop();
        synchronized (this) {
            long j = this.mNativeHandle;
            if (j != 0) {
                nativeDetach(j);
            }
        }
    }
}
