package com.facebook.advancedcryptotransport;

import X.B4d;
import X.C0K8;
import X.C9AD;

/* loaded from: classes4.dex */
public class MNSStreamThread {
    public static volatile MNSStreamThread sInstance;
    public Thread mThread = null;

    public static native void nativeMNSStreamThreadRun(long j);

    public static void mnsStreamAttachLoopToThread(long j) {
        MNSStreamThread mNSStreamThread;
        synchronized (MNSStreamThread.class) {
            if (sInstance == null) {
                sInstance = new MNSStreamThread();
            }
            mNSStreamThread = sInstance;
        }
        synchronized (mNSStreamThread) {
            if (mNSStreamThread.mThread == null) {
                B4d b4d = new B4d(mNSStreamThread, j);
                mNSStreamThread.mThread = b4d;
                b4d.setPriority(5);
                mNSStreamThread.mThread.start();
            } else {
                C0K8.A0C("mccw.mns", "attach_thread");
            }
        }
    }

    static {
        C9AD.A00();
    }
}
