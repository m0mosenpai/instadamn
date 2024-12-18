package com.facebook.messenger.notification.engine;

import X.C46564Kj3;
import X.LDB;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes8.dex */
public final class NotificationEngineValueProviderSetterCompletionCallback {
    public static final C46564Kj3 Companion = new Object();
    public NativeHolder mNativeHolder;

    private final native void failureNative(MSGNotificationEngineContext mSGNotificationEngineContext, Throwable th);

    private final native void successNative(MSGNotificationEngineContext mSGNotificationEngineContext);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Kj3, java.lang.Object] */
    static {
        LDB.A00();
    }

    public NotificationEngineValueProviderSetterCompletionCallback(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public final void success(MSGNotificationEngineContext mSGNotificationEngineContext) {
        successNative(mSGNotificationEngineContext);
    }

    public final void failure(MSGNotificationEngineContext mSGNotificationEngineContext, Throwable th) {
        failureNative(mSGNotificationEngineContext, th);
    }
}
