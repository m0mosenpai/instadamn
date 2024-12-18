package com.facebook.mqtttransport;

import X.C09170dP;
import X.C4PG;
import com.facebook.mqtttransport.LigerStreamEventBaseThread;

/* loaded from: classes2.dex */
public class LigerStreamEventBaseThread {
    public static volatile LigerStreamEventBaseThread sInstance;
    public Thread mThread = null;

    public static native void nativeLigerStreamEventBaseThreadRun(long j);

    static {
        synchronized (C4PG.class) {
            if (!C4PG.A00) {
                C09170dP.A0C("mqtttransport_jni");
                C4PG.A00 = true;
            }
        }
    }

    public static void ligerStreamEventBaseAttachToThread(final long j) {
        final LigerStreamEventBaseThread ligerStreamEventBaseThread;
        synchronized (LigerStreamEventBaseThread.class) {
            if (sInstance == null) {
                sInstance = new LigerStreamEventBaseThread();
            }
            ligerStreamEventBaseThread = sInstance;
        }
        synchronized (ligerStreamEventBaseThread) {
            if (ligerStreamEventBaseThread.mThread == null) {
                Thread thread = new Thread() { // from class: X.4PH
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super("XplatMqttLigerEventBased");
                    }

                    @Override // java.lang.Thread, java.lang.Runnable
                    public final void run() {
                        LigerStreamEventBaseThread.nativeLigerStreamEventBaseThreadRun(j);
                    }
                };
                ligerStreamEventBaseThread.mThread = thread;
                thread.setPriority(5);
                ligerStreamEventBaseThread.mThread.start();
            }
        }
    }
}
