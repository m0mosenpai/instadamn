package com.facebook.messenger.notification.engine;

import X.C46563Kj2;
import X.LDB;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes8.dex */
public final class NotificationEngineValueProviderGetterCompletionCallback {
    public static final C46563Kj2 Companion = new Object();
    public NativeHolder mNativeHolder;

    private final native void failureNative(MSGNotificationEngineContext mSGNotificationEngineContext, Throwable th);

    private final native void successNative(MSGNotificationEngineContext mSGNotificationEngineContext, Object obj);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Kj2, java.lang.Object] */
    static {
        LDB.A00();
    }

    public NotificationEngineValueProviderGetterCompletionCallback(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public final void failure(MSGNotificationEngineContext mSGNotificationEngineContext, Throwable th) {
        failureNative(mSGNotificationEngineContext, th);
    }

    public final void success(MSGNotificationEngineContext mSGNotificationEngineContext, Object obj) {
        successNative(mSGNotificationEngineContext, obj);
    }
}
