package com.facebook.msys.mci;

import X.AbstractC09780fb;
import X.C1334960t;
import X.C136076Dm;
import X.C2NJ;
import com.facebook.simplejni.NativeHolder;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes.dex */
public class NetworkSession {
    public static final NetworkSession $redex_init_class = null;
    public final HashMap mCallbackMap = new HashMap();
    public final DataTaskListener mDataTaskListener;
    public boolean mDisposed;
    public final C136076Dm mDisposer;
    public final NativeHolder mNativeHolder;
    public final NotificationCenter mNotificationCenter;

    private native NativeHolder initNativeHolder(String str, NotificationCenter notificationCenter);

    private native void markDataTaskAsCompleted(String str, String str2, int i, UrlResponse urlResponse, byte[] bArr, String str3, Throwable th);

    private native void markDataTaskStreamingCompleted(String str, String str2, UrlResponse urlResponse, Throwable th);

    private native void nativeDispose();

    private native void onDataTaskNewStreamingData(String str, String str2, UrlResponse urlResponse, byte[] bArr);

    private native void registerDownloadTaskProgressObserver(String str);

    private native void registerUploadTaskProgressObserver(String str);

    private native void setNetworkStateConnectedNative(NotificationCenter notificationCenter);

    private native void setNetworkStateDisconnectedNative(NotificationCenter notificationCenter);

    public native synchronized void canHandleStreamingUploadUpdate(String str);

    public synchronized void dispose() {
        if (!this.mDisposed) {
            nativeDispose();
            this.mDisposed = true;
        }
    }

    public native int getNetworkSessionTimeoutIntervalMs();

    public native DataTask[] getPendingDataTasks();

    public synchronized void markDataTaskAsCompletedCallback(String str, String str2, int i, UrlResponse urlResponse, byte[] bArr, String str3, IOException iOException) {
        markDataTaskAsCompleted(str, str2, i, urlResponse, bArr, str3, iOException);
        if (this.mCallbackMap.containsKey(str2)) {
            this.mCallbackMap.remove(str2);
        }
    }

    public native void updateDataTaskDownloadProgress(String str, long j, long j2, long j3);

    public native void updateDataTaskUploadProgress(String str, long j, long j2, long j3);

    private void dispatchProgressUpdateToObserver(String str, long j, long j2, long j3) {
        if (this.mCallbackMap.containsKey(str)) {
            this.mCallbackMap.get(str);
        }
    }

    private void onCancelDataTask(String str) {
        DataTaskListener dataTaskListener = this.mDataTaskListener;
        if (dataTaskListener != null) {
            dataTaskListener.onCancelDataTask(str, this);
        }
    }

    private void onNewDataTask(DataTask dataTask) {
        DataTaskListener dataTaskListener = this.mDataTaskListener;
        if (dataTaskListener != null) {
            dataTaskListener.onNewTask(dataTask, this);
        }
    }

    private void onUpdateStreamingDataTask(byte[] bArr, String str) {
        DataTaskListener dataTaskListener = this.mDataTaskListener;
        if (dataTaskListener != null) {
            dataTaskListener.onUpdateStreamingDataTask(bArr, str, this);
        }
    }

    public void setNetworkStateConnected() {
        setNetworkStateConnectedNative(this.mNotificationCenter);
    }

    public void setNetworkStateDisconnected() {
        setNetworkStateDisconnectedNative(this.mNotificationCenter);
    }

    static {
        C2NJ.A00();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.6Dm] */
    public NetworkSession(String str, NotificationCenter notificationCenter, final C1334960t c1334960t) {
        AbstractC09780fb.A01("NetworkSession.new", -616813026);
        try {
            this.mNotificationCenter = notificationCenter;
            this.mDataTaskListener = c1334960t.A00;
            this.mDisposer = new Object() { // from class: X.6Dm
            };
            this.mNativeHolder = initNativeHolder(str, notificationCenter);
            getNetworkSessionTimeoutIntervalMs();
            AbstractC09780fb.A00(-484994929);
        } catch (Throwable th) {
            AbstractC09780fb.A00(1263853440);
            throw th;
        }
    }

    public void markDataTaskStreamingCompletedCallback(String str, String str2, UrlResponse urlResponse, Throwable th) {
        markDataTaskStreamingCompleted(str, str2, urlResponse, th);
    }

    public void onDataTaskNewStreamingDataCallback(String str, String str2, UrlResponse urlResponse, byte[] bArr) {
        onDataTaskNewStreamingData(str, str2, urlResponse, bArr);
    }
}
