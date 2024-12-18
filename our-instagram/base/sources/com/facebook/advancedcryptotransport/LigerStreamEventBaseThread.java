package com.facebook.advancedcryptotransport;

import X.C0K8;
import X.C9AD;
import com.facebook.advancedcryptotransport.LigerStreamEventBaseThread;

/* loaded from: classes4.dex */
public class LigerStreamEventBaseThread {
    public static volatile LigerStreamEventBaseThread sInstance;
    public Thread mThread = null;

    public static native void nativeLigerStreamEventBaseThreadRun(long j);

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
                Thread thread = new Thread() { // from class: X.5k6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super("MCCWLigerStreamEventBaseThread");
                    }

                    @Override // java.lang.Thread, java.lang.Runnable
                    public final void run() {
                        LigerStreamEventBaseThread.nativeLigerStreamEventBaseThreadRun(j);
                    }
                };
                ligerStreamEventBaseThread.mThread = thread;
                thread.setPriority(5);
                ligerStreamEventBaseThread.mThread.start();
            } else {
                C0K8.A0C("mccw.liger", "attach_thread");
            }
        }
    }

    static {
        C9AD.A00();
    }
}
