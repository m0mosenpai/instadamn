package com.facebook.msys.mci;

import X.C53882dS;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public class PersistedMsysLogFileCollector {
    public static final ConcurrentLinkedQueue mMsysLogFileCollectionCallbacks;

    public static native void nativeCollectMsysLogFiles();

    public static synchronized void onCollectMsysLogFilesCallback(boolean z, String[] strArr) {
        synchronized (PersistedMsysLogFileCollector.class) {
            mMsysLogFileCollectionCallbacks.poll();
        }
    }

    static {
        C53882dS.A00();
        mMsysLogFileCollectionCallbacks = new ConcurrentLinkedQueue();
    }
}
